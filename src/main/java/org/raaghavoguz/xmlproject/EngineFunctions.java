package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EngineFunctions {
    private EngineFunctions() { }

    private static List<Node> relativeDir(Node node, ParseTree rp1, ParseTree rp2) {
        return EngineUtilities.unique(
                relativePath(node, rp1).stream()
                        .flatMap(n -> relativePath(n, rp2).stream())
                        .collect(Collectors.toList())
        );
    }

    private static List<Node> relativeDirRecursive(Node node, ParseTree rp1, ParseTree rp2) {
        return EngineUtilities.unique(
                relativePath(node, rp1).stream()
                        .flatMap(n -> EngineUtilities.descendants(n).stream())
                        .flatMap(d -> relativePath(d, rp2).stream())
                        .collect(Collectors.toList())
        );
    }

    private static List<Node> relativeConcatenate(Node node, ParseTree... parseTrees) {
        return Arrays.stream(parseTrees)
                .flatMap(pt -> relativePath(node, pt).stream())
                .collect(Collectors.toList());
    }

    private static List<Node> relativeFilter(Node node, ParseTree rp1, ParseTree f) {
        return relativePath(node, rp1).stream()
                .filter(n -> filter(n, f))
                .collect(Collectors.toList());
    }

    private static List<Node> xQueryConcatenate(Document document, Context context, ParseTree... parseTrees) {
        return Arrays.stream(parseTrees)
                .flatMap(pt -> xQuery(document, context, pt).stream())
                .collect(Collectors.toList());
    }

    private static List<Node> xQueryDir(Document document, Context context, ParseTree xq, ParseTree rp) {
        return EngineUtilities.unique(
                xQuery(document, context, xq).stream()
                        .filter(EngineUtilities::isNonTerminal)
                        .flatMap(n -> relativePath(n, rp).stream())
                        .collect(Collectors.toList())
        );
    }

    private static List<Node> xQueryDirRecursive(Document document, Context context, ParseTree xq, ParseTree rp) {
        return EngineUtilities.unique(
                xQuery(document, context, xq).stream()
                        .flatMap(n -> EngineUtilities.descendants(n).stream())
                        .filter(EngineUtilities::isNonTerminal)
                        .flatMap(d -> relativePath(d, rp).stream())
                        .collect(Collectors.toList())
        );
    }

    private static Context letExtend(Document document, Context context, ParseTree letClause) {
        Context ctx = context;

        for (int i = 1; i < letClause.getChildCount(); i += 4) {
            String varName = letClause.getChild(i).getText().substring(1);
            ParseTree xq = letClause.getChild(i + 2);
            ctx = ctx.extend(varName, xQuery(document, ctx, xq));
        }

        return ctx;
    }

    private static List<Context> allPossibleContexts(Document document, Context context, ParseTree tree,
                                                     int childLimit) {
        String varName1 = tree.getChild(1).getText().substring(1);
        ParseTree xq1 = tree.getChild(3);

        List<Context> contextList = context.possibleContexts(varName1, xQuery(document, context, xq1));

        for (int i = 5; i < childLimit; i += 4) {
            String varNameJ = tree.getChild(i).getText().substring(1);
            ParseTree xqJ = tree.getChild(i + 2);

            contextList = contextList.stream()
                    .flatMap(ctx -> ctx.possibleContexts(varNameJ, xQuery(document, ctx, xqJ)).stream())
                    .collect(Collectors.toList());
        }

        return contextList;
    }

    public static List<Node> absolutePath(ParseTree tree) {
        String fileName = tree.getChild(3).getText();
        try {
            Node root = EngineUtilities.root(fileName);
            ParseTree rp = tree.getChild(7);

            if (tree instanceof XGrammarParser.APDirContext) {
                return relativePath(root, rp);
            } else if (tree instanceof XGrammarParser.APDirRecursiveContext) {
                CharStream cs = CharStreams.fromString(".");
                XGrammarParser parser = EngineUtilities.parseCharStream(cs);
                ParseTree dot = parser.rp();

                return relativeDirRecursive(root, dot, rp);
            } else {
                throw new IllegalArgumentException("Absolute Path could not be parsed.");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error in opening or parsing \"" + fileName + "\".", e);
        }
    }

    public static List<Node> relativePath(Node node, ParseTree tree) {
        if (tree instanceof XGrammarParser.RPTagNameContext) {
            String tagName = tree.getChild(0).getText();
            return EngineUtilities.children(node).stream()
                    .filter(EngineUtilities::isNonTerminal)
                    .filter(n -> tagName.equals(n.getNodeName()))
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPStarContext) {
            return EngineUtilities.children(node).stream()
                    .filter(EngineUtilities::isNonTerminal)
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPCurrentDirContext) {
            return Collections.singletonList(node);
        } else if (tree instanceof XGrammarParser.RPParentDirContext) {
            return EngineUtilities.parent(node);
        } else if (tree instanceof XGrammarParser.RPTextContext) {
            return EngineUtilities.children(node).stream()
                    .filter(n -> n.getNodeType() == Node.TEXT_NODE)
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.RPAttNameContext) {
            String attName = tree.getChild(1).toString();
            return EngineUtilities.attrib(node, attName);
        } else if (tree instanceof XGrammarParser.RPParanthesesContext) {
            return relativePath(node, tree.getChild(1));
        } else if (tree instanceof XGrammarParser.RPDirContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return relativeDir(node, rp1, rp2);
        }  else if (tree instanceof XGrammarParser.RPDirRecursiveContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return relativeDirRecursive(node, rp1, rp2);
        } else if (tree instanceof XGrammarParser.RPFilterContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree f = tree.getChild(2);
            return relativeFilter(node, rp1, f);
        } else if (tree instanceof XGrammarParser.RPConcatContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return relativeConcatenate(node, rp1, rp2);
        } else {
            throw new IllegalArgumentException("Relative Path could not be parsed.");
        }
    }

    public static boolean filter(Node node, ParseTree tree) {
        if (tree instanceof XGrammarParser.FRPContext) {
            return !relativePath(node, tree.getChild(0)).isEmpty();
        } else if (tree instanceof XGrammarParser.FRPEqualContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return EngineUtilities.eq(relativePath(node, rp1), relativePath(node, rp2));
        } else if (tree instanceof XGrammarParser.FRPIdenticalContext) {
            ParseTree rp1 = tree.getChild(0);
            ParseTree rp2 = tree.getChild(2);
            return EngineUtilities.is(relativePath(node, rp1), relativePath(node, rp2));
        } else if (tree instanceof XGrammarParser.FStringEqualContext) {
            ParseTree rp = tree.getChild(0);
            String stringConstant = tree.getChild(2).getText().replaceAll("\"", "");
            return EngineUtilities.eq(relativePath(node, rp), stringConstant);
        } else if (tree instanceof XGrammarParser.FParanthesesContext) {
            return filter(node, tree.getChild(1));
        } else if (tree instanceof XGrammarParser.FAndContext) {
            ParseTree f1 = tree.getChild(0);
            ParseTree f2 = tree.getChild(2);
            return filter(node, f1) && filter(node, f2);
        } else if (tree instanceof XGrammarParser.FOrContext) {
            ParseTree f1 = tree.getChild(0);
            ParseTree f2 = tree.getChild(2);
            return filter(node, f1) || filter(node, f2);
        } else if (tree instanceof XGrammarParser.FNotContext) {
            return !filter(node, tree.getChild(1));
        } else {
            throw new IllegalArgumentException("Filter could not be parsed.");
        }
    }

    public static List<Node> xQuery(Document document, Context context, ParseTree tree) {
        if (tree instanceof XGrammarParser.XQVarContext) {
            return Optional.ofNullable(context.lookup(tree.getChild(0).getText().substring(1)))
                    .orElse(Collections.emptyList());
        } else if (tree instanceof XGrammarParser.XQStringContext) {
            String text = tree.getChild(0).getText().replaceAll("\"", "");
            return Collections.singletonList(EngineUtilities.makeText(document, text));
        } else if (tree instanceof XGrammarParser.XQAbsoluteContext) {
            return absolutePath(tree.getChild(0));
        } else if (tree instanceof XGrammarParser.XQParanthesesContext) {
            return xQuery(document, context, tree.getChild(1));
        } else if (tree instanceof XGrammarParser.XQConcatContext) {
            ParseTree xq1 = tree.getChild(0);
            ParseTree xq2 = tree.getChild(2);
            return xQueryConcatenate(document, context, xq1, xq2);
        } else if (tree instanceof XGrammarParser.XQDirContext) {
            ParseTree xq = tree.getChild(0);
            ParseTree rp = tree.getChild(2);
            return xQueryDir(document, context, xq, rp);
        } else if (tree instanceof XGrammarParser.XQDirRecursiveContext) {
            ParseTree xq = tree.getChild(0);
            ParseTree rp = tree.getChild(2);
            return xQueryDirRecursive(document, context, xq, rp);
        } else if (tree instanceof XGrammarParser.XQConstructorContext) {
            String tagName = tree.getChild(1).getText();
            ParseTree xq = tree.getChild(4);
            return Collections.singletonList(EngineUtilities.makeElement(
                    document,
                    tagName,
                    xQuery(document, context, xq)
            ));
        } else if (tree instanceof XGrammarParser.XQFLWRContext) {
            int childCount = tree.getChildCount();

            ParseTree returnClause = tree.getChild(childCount - 1);
            ParseTree xqLast = returnClause.getChild(1);

            ParseTree forClause = tree.getChild(0);
            List<Context> contextList = allPossibleContexts(document, context, forClause, forClause.getChildCount());

            if (childCount == 3) {
                ParseTree child = tree.getChild(1);
                if (child instanceof XGrammarParser.LetClauseContext) {
                    contextList = contextList.stream()
                            .map(ctx -> letExtend(document, ctx, child))
                            .collect(Collectors.toList());

                } else {
                    ParseTree cond = child.getChild(1);
                    contextList.removeIf(ctx -> !condition(document, ctx, cond));
                }
            } else if (childCount == 4) {
                ParseTree letClause = tree.getChild(1);
                ParseTree whereClause = tree.getChild(2);
                ParseTree cond = whereClause.getChild(1);

                contextList = contextList.stream()
                        .map(ctx -> letExtend(document, ctx, letClause))
                        .filter(ctx -> condition(document, ctx, cond))
                        .collect(Collectors.toList());
            }

            return contextList.stream()
                    .flatMap(ctx -> xQuery(document, ctx, xqLast).stream())
                    .collect(Collectors.toList());
        } else if (tree instanceof XGrammarParser.XQLetContext) {
            ParseTree letClause = tree.getChild(0);
            ParseTree xqLast = tree.getChild(1);
            Context ctx = letExtend(document, context, letClause);
            return xQuery(document, ctx, xqLast);
        } else {
            throw new IllegalArgumentException("XQuery could not be parsed.");
        }
    }

    public static boolean condition(Document document, Context context, ParseTree tree) {
        if (tree instanceof XGrammarParser.CondEqualContext) {
            ParseTree xq1 = tree.getChild(0);
            ParseTree xq2 = tree.getChild(2);
            return EngineUtilities.eq(xQuery(document, context, xq1), xQuery(document, context, xq2));
        } else if (tree instanceof XGrammarParser.CondIdenticalContext) {
            ParseTree xq1 = tree.getChild(0);
            ParseTree xq2 = tree.getChild(2);
            return EngineUtilities.is(xQuery(document, context, xq1), xQuery(document, context, xq2));
        } else if (tree instanceof XGrammarParser.CondEmptyContext) {
            return xQuery(document, context, tree.getChild(2)).isEmpty();
        } else if (tree instanceof XGrammarParser.CondSomeContext) {
            int childCount = tree.getChildCount();
            ParseTree xqLast = tree.getChild(childCount - 1);
            return allPossibleContexts(document, context, tree, childCount - 2).stream()
                    .anyMatch(ctx -> condition(document, ctx, xqLast));
        } else if (tree instanceof XGrammarParser.CondParanthesesContext) {
            return condition(document, context, tree.getChild(1));
        } else if (tree instanceof XGrammarParser.CondAndContext) {
            ParseTree cond1 = tree.getChild(0);
            ParseTree cond2 = tree.getChild(2);
            return condition(document, context, cond1) && condition(document, context, cond2);
        } else if (tree instanceof XGrammarParser.CondOrContext) {
            ParseTree cond1 = tree.getChild(0);
            ParseTree cond2 = tree.getChild(2);
            return condition(document, context, cond1) || condition(document, context, cond2);
        } else if (tree instanceof XGrammarParser.CondNotContext) {
            return !condition(document, context, tree.getChild(1));
        } else {
            throw new IllegalArgumentException("XQuery Condition could not be parsed.");
        }
    }
}
