// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XSimpleGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XSimpleGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WS=21, NAME=22, FILENAME=23, STRINGCONSTANT=24, 
		VAR=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "WS", "NAME", "FILENAME", "STRINGCONSTANT", 
			"VAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'in'", "','", "'where'", "'return'", "'doc'", "'('", 
			"'\"'", "')'", "'text'", "'*'", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
			"'eq'", "'='", "'and'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "NAME", "FILENAME", 
			"STRINGCONSTANT", "VAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XSimpleGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XSimpleGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\6\27x\n\27\r\27\16\27y\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\7\31\u0082\n\31\f\31\16\31\u0085\13\31\3\31\3\31\3\32\3"+
		"\32\6\32\u008b\n\32\r\32\16\32\u008c\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\3\2\b\5\2\13\f\17\17\"\"\7\2//\62;C\\aac|\3\2"+
		"$$\b\2\"#.\60\62<AAC\\c|\3\2&&\6\2\62;C\\aac|\2\u0090\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13D\3\2\2\2"+
		"\rK\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27Z\3\2\2"+
		"\2\31\\\3\2\2\2\33^\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2"+
		"\2%i\3\2\2\2\'l\3\2\2\2)n\3\2\2\2+r\3\2\2\2-w\3\2\2\2/{\3\2\2\2\61\177"+
		"\3\2\2\2\63\u0088\3\2\2\2\65\66\7h\2\2\66\67\7q\2\2\678\7t\2\28\4\3\2"+
		"\2\29:\7k\2\2:;\7p\2\2;\6\3\2\2\2<=\7.\2\2=\b\3\2\2\2>?\7y\2\2?@\7j\2"+
		"\2@A\7g\2\2AB\7t\2\2BC\7g\2\2C\n\3\2\2\2DE\7t\2\2EF\7g\2\2FG\7v\2\2GH"+
		"\7w\2\2HI\7t\2\2IJ\7p\2\2J\f\3\2\2\2KL\7f\2\2LM\7q\2\2MN\7e\2\2N\16\3"+
		"\2\2\2OP\7*\2\2P\20\3\2\2\2QR\7$\2\2R\22\3\2\2\2ST\7+\2\2T\24\3\2\2\2"+
		"UV\7v\2\2VW\7g\2\2WX\7z\2\2XY\7v\2\2Y\26\3\2\2\2Z[\7,\2\2[\30\3\2\2\2"+
		"\\]\7\61\2\2]\32\3\2\2\2^_\7\61\2\2_`\7\61\2\2`\34\3\2\2\2ab\7>\2\2b\36"+
		"\3\2\2\2cd\7@\2\2d \3\2\2\2ef\7}\2\2f\"\3\2\2\2gh\7\177\2\2h$\3\2\2\2"+
		"ij\7g\2\2jk\7s\2\2k&\3\2\2\2lm\7?\2\2m(\3\2\2\2no\7c\2\2op\7p\2\2pq\7"+
		"f\2\2q*\3\2\2\2rs\t\2\2\2st\3\2\2\2tu\b\26\2\2u,\3\2\2\2vx\t\3\2\2wv\3"+
		"\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z.\3\2\2\2{|\5-\27\2|}\7\60\2\2}~"+
		"\5-\27\2~\60\3\2\2\2\177\u0083\t\4\2\2\u0080\u0082\t\5\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\t\4\2\2\u0087\62\3\2\2"+
		"\2\u0088\u008a\t\6\2\2\u0089\u008b\t\7\2\2\u008a\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\64\3\2\2\2\b\2"+
		"wy\u0081\u0083\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}