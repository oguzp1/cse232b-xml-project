package org.raaghavoguz.xmlproject;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.raaghavoguz.xmlproject.grammar.XGrammarParser;
import org.raaghavoguz.xmlproject.grammar.XGrammarVisitor;

public class MyVisitor implements XGrammarVisitor<Object> {
    @Override
    public Object visitAp(XGrammarParser.ApContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRp(XGrammarParser.RpContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitF(XGrammarParser.FContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
