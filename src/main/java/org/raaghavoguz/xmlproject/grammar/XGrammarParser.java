// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, WS=35, NAME=36, FILENAME=37, STRINGCONSTANT=38, 
		VAR=39;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2, RULE_xq = 3, RULE_forClause = 4, 
		RULE_letClause = 5, RULE_whereClause = 6, RULE_returnClause = 7, RULE_cond = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "f", "xq", "forClause", "letClause", "whereClause", "returnClause", 
			"cond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc'", "'('", "'\"'", "')'", "'/'", "'//'", "'*'", "'.'", "'..'", 
			"'text'", "'@'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", 
			"'and'", "'or'", "'not'", "'<'", "'>'", "'{'", "'}'", "'for'", "'in'", 
			"'let'", "':='", "'where'", "'return'", "'empty'", "'some'", "'satisfies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"NAME", "FILENAME", "STRINGCONSTANT", "VAR"
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

	@Override
	public String getGrammarFileName() { return "XGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class APDirRecursiveContext extends ApContext {
		public TerminalNode FILENAME() { return getToken(XGrammarParser.FILENAME, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public APDirRecursiveContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterAPDirRecursive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitAPDirRecursive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitAPDirRecursive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class APDirContext extends ApContext {
		public TerminalNode FILENAME() { return getToken(XGrammarParser.FILENAME, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public APDirContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterAPDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitAPDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitAPDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new APDirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(T__0);
				setState(19);
				match(T__1);
				setState(20);
				match(T__2);
				setState(21);
				match(FILENAME);
				setState(22);
				match(T__2);
				setState(23);
				match(T__3);
				setState(24);
				match(T__4);
				setState(25);
				rp(0);
				}
				break;
			case 2:
				_localctx = new APDirRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(T__0);
				setState(27);
				match(T__1);
				setState(28);
				match(T__2);
				setState(29);
				match(FILENAME);
				setState(30);
				match(T__2);
				setState(31);
				match(T__3);
				setState(32);
				match(T__5);
				setState(33);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RPCurrentDirContext extends RpContext {
		public RPCurrentDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPCurrentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPCurrentDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPCurrentDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPConcatContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RPConcatContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPAttNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XGrammarParser.NAME, 0); }
		public RPAttNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPAttName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPFilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RPFilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPTextContext extends RpContext {
		public RPTextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPDirContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RPDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPParentDirContext extends RpContext {
		public RPParentDirContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPParentDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPParentDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPParentDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPParanthesesContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RPParanthesesContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPParantheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPParantheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPParantheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPTagNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XGrammarParser.NAME, 0); }
		public RPTagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPStarContext extends RpContext {
		public RPStarContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RPDirRecursiveContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RPDirRecursiveContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterRPDirRecursive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitRPDirRecursive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitRPDirRecursive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new RPTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				match(NAME);
				}
				break;
			case T__6:
				{
				_localctx = new RPStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new RPCurrentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new RPParentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new RPTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__9);
				setState(42);
				match(T__1);
				setState(43);
				match(T__3);
				}
				break;
			case T__10:
				{
				_localctx = new RPAttNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(T__10);
				setState(45);
				match(NAME);
				}
				break;
			case T__1:
				{
				_localctx = new RPParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(T__1);
				setState(47);
				rp(0);
				setState(48);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RPDirContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(53);
						match(T__4);
						setState(54);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RPDirRecursiveContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(55);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(56);
						match(T__5);
						setState(57);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RPConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(58);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(59);
						match(T__13);
						setState(60);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RPFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(T__11);
						setState(63);
						f(0);
						setState(64);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FAndContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FAndContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FRPContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPEqualContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FRPEqualContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFRPEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFRPEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFRPEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FOrContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FOrContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FStringEqualContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode STRINGCONSTANT() { return getToken(XGrammarParser.STRINGCONSTANT, 0); }
		public FStringEqualContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFStringEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFStringEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFStringEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FParanthesesContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FParanthesesContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFParantheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFParantheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFParantheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FNotContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FNotContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FRPIdenticalContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FRPIdenticalContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterFRPIdentical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitFRPIdentical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitFRPIdentical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				rp(0);
				setState(74);
				match(T__14);
				setState(75);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				rp(0);
				setState(78);
				match(T__15);
				setState(79);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				rp(0);
				setState(82);
				match(T__16);
				setState(83);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				rp(0);
				setState(86);
				match(T__17);
				setState(87);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FStringEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				rp(0);
				setState(90);
				match(T__14);
				setState(91);
				match(STRINGCONSTANT);
				}
				break;
			case 7:
				{
				_localctx = new FParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(T__1);
				setState(94);
				f(0);
				setState(95);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new FNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(T__20);
				setState(98);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FAndContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						match(T__18);
						setState(103);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FOrContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						match(T__19);
						setState(106);
						f(3);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XQVarContext extends XqContext {
		public TerminalNode VAR() { return getToken(XGrammarParser.VAR, 0); }
		public XQVarContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQStringContext extends XqContext {
		public TerminalNode STRINGCONSTANT() { return getToken(XGrammarParser.STRINGCONSTANT, 0); }
		public XQStringContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQAbsoluteContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XQAbsoluteContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQAbsolute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQAbsolute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQAbsolute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQConcatContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XQConcatContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQDirContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQDirContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQParanthesesContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQParanthesesContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQParantheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQParantheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQParantheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQFLWRContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public XQFLWRContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQFLWR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQFLWR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQFLWR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQLetContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQLetContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQDirRecursiveContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XQDirRecursiveContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQDirRecursive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQDirRecursive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQDirRecursive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XQConstructorContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(XGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XGrammarParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XQConstructorContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new XQVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(113);
				match(VAR);
				}
				break;
			case STRINGCONSTANT:
				{
				_localctx = new XQStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(STRINGCONSTANT);
				}
				break;
			case T__0:
				{
				_localctx = new XQAbsoluteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				ap();
				}
				break;
			case T__1:
				{
				_localctx = new XQParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(T__1);
				setState(117);
				xq(0);
				setState(118);
				match(T__3);
				}
				break;
			case T__21:
				{
				_localctx = new XQConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(T__21);
				setState(121);
				match(NAME);
				setState(122);
				match(T__22);
				setState(123);
				match(T__23);
				setState(124);
				xq(0);
				setState(125);
				match(T__24);
				setState(126);
				match(T__21);
				setState(127);
				match(T__4);
				setState(128);
				match(NAME);
				setState(129);
				match(T__22);
				}
				break;
			case T__25:
				{
				_localctx = new XQFLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				forClause();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(132);
					letClause();
					}
				}

				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(135);
					whereClause();
					}
				}

				setState(138);
				returnClause();
				}
				break;
			case T__27:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				letClause();
				setState(141);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new XQConcatContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(145);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(146);
						match(T__13);
						setState(147);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XQDirContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(148);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(149);
						match(T__4);
						setState(150);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQDirRecursiveContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(151);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(152);
						match(T__5);
						setState(153);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(XGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XGrammarParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__25);
			setState(160);
			match(VAR);
			setState(161);
			match(T__26);
			setState(162);
			xq(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(163);
				match(T__13);
				setState(164);
				match(VAR);
				setState(165);
				match(T__26);
				setState(166);
				xq(0);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(XGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XGrammarParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__27);
			setState(173);
			match(VAR);
			setState(174);
			match(T__28);
			setState(175);
			xq(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(176);
				match(T__13);
				setState(177);
				match(VAR);
				setState(178);
				match(T__28);
				setState(179);
				xq(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__29);
			setState(186);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__30);
			setState(189);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOrContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondParanthesesContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondParanthesesContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondParantheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondParantheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondParantheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public CondEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondSomeContext extends CondContext {
		public List<TerminalNode> VAR() { return getTokens(XGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XGrammarParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondNotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEqualContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondEqualContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondIdenticalContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondIdenticalContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterCondIdentical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitCondIdentical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitCondIdentical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(192);
				xq(0);
				setState(193);
				match(T__14);
				setState(194);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				xq(0);
				setState(197);
				match(T__15);
				setState(198);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				xq(0);
				setState(201);
				match(T__16);
				setState(202);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				xq(0);
				setState(205);
				match(T__17);
				setState(206);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(T__31);
				setState(209);
				match(T__1);
				setState(210);
				xq(0);
				setState(211);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(T__32);
				setState(214);
				match(VAR);
				setState(215);
				match(T__26);
				setState(216);
				xq(0);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(217);
					match(T__13);
					setState(218);
					match(VAR);
					setState(219);
					match(T__26);
					setState(220);
					xq(0);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(T__33);
				setState(227);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(T__1);
				setState(230);
				cond(0);
				setState(231);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(T__20);
				setState(234);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						match(T__18);
						setState(239);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						match(T__19);
						setState(242);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return f_sempred((FContext)_localctx, predIndex);
		case 3:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 8:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\65\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4f\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088\n\5\3\5\5"+
		"\5\u008b\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0092\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u00aa\n\6\f\6\16\6\u00ad\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e0\n\n\f\n\16\n\u00e3"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00f6\n\n\f\n\16\n\u00f9\13\n\3\n\2\6\4\6\b\22\13\2\4\6"+
		"\b\n\f\16\20\22\2\2\2\u011c\2$\3\2\2\2\4\64\3\2\2\2\6e\3\2\2\2\b\u0091"+
		"\3\2\2\2\n\u00a1\3\2\2\2\f\u00ae\3\2\2\2\16\u00bb\3\2\2\2\20\u00be\3\2"+
		"\2\2\22\u00ed\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\27\7\5\2\2\27\30"+
		"\7\'\2\2\30\31\7\5\2\2\31\32\7\6\2\2\32\33\7\7\2\2\33%\5\4\3\2\34\35\7"+
		"\3\2\2\35\36\7\4\2\2\36\37\7\5\2\2\37 \7\'\2\2 !\7\5\2\2!\"\7\6\2\2\""+
		"#\7\b\2\2#%\5\4\3\2$\24\3\2\2\2$\34\3\2\2\2%\3\3\2\2\2&\'\b\3\1\2\'\65"+
		"\7&\2\2(\65\7\t\2\2)\65\7\n\2\2*\65\7\13\2\2+,\7\f\2\2,-\7\4\2\2-\65\7"+
		"\6\2\2./\7\r\2\2/\65\7&\2\2\60\61\7\4\2\2\61\62\5\4\3\2\62\63\7\6\2\2"+
		"\63\65\3\2\2\2\64&\3\2\2\2\64(\3\2\2\2\64)\3\2\2\2\64*\3\2\2\2\64+\3\2"+
		"\2\2\64.\3\2\2\2\64\60\3\2\2\2\65F\3\2\2\2\66\67\f\6\2\2\678\7\7\2\28"+
		"E\5\4\3\79:\f\5\2\2:;\7\b\2\2;E\5\4\3\6<=\f\3\2\2=>\7\20\2\2>E\5\4\3\4"+
		"?@\f\4\2\2@A\7\16\2\2AB\5\6\4\2BC\7\17\2\2CE\3\2\2\2D\66\3\2\2\2D9\3\2"+
		"\2\2D<\3\2\2\2D?\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HF\3"+
		"\2\2\2IJ\b\4\1\2Jf\5\4\3\2KL\5\4\3\2LM\7\21\2\2MN\5\4\3\2Nf\3\2\2\2OP"+
		"\5\4\3\2PQ\7\22\2\2QR\5\4\3\2Rf\3\2\2\2ST\5\4\3\2TU\7\23\2\2UV\5\4\3\2"+
		"Vf\3\2\2\2WX\5\4\3\2XY\7\24\2\2YZ\5\4\3\2Zf\3\2\2\2[\\\5\4\3\2\\]\7\21"+
		"\2\2]^\7(\2\2^f\3\2\2\2_`\7\4\2\2`a\5\6\4\2ab\7\6\2\2bf\3\2\2\2cd\7\27"+
		"\2\2df\5\6\4\3eI\3\2\2\2eK\3\2\2\2eO\3\2\2\2eS\3\2\2\2eW\3\2\2\2e[\3\2"+
		"\2\2e_\3\2\2\2ec\3\2\2\2fo\3\2\2\2gh\f\5\2\2hi\7\25\2\2in\5\6\4\6jk\f"+
		"\4\2\2kl\7\26\2\2ln\5\6\4\5mg\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2p\7\3\2\2\2qo\3\2\2\2rs\b\5\1\2s\u0092\7)\2\2t\u0092\7(\2\2u\u0092"+
		"\5\2\2\2vw\7\4\2\2wx\5\b\5\2xy\7\6\2\2y\u0092\3\2\2\2z{\7\30\2\2{|\7&"+
		"\2\2|}\7\31\2\2}~\7\32\2\2~\177\5\b\5\2\177\u0080\7\33\2\2\u0080\u0081"+
		"\7\30\2\2\u0081\u0082\7\7\2\2\u0082\u0083\7&\2\2\u0083\u0084\7\31\2\2"+
		"\u0084\u0092\3\2\2\2\u0085\u0087\5\n\6\2\u0086\u0088\5\f\7\2\u0087\u0086"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\16\b\2"+
		"\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\5\20\t\2\u008d\u0092\3\2\2\2\u008e\u008f\5\f\7\2\u008f\u0090\5\b\5\3"+
		"\u0090\u0092\3\2\2\2\u0091r\3\2\2\2\u0091t\3\2\2\2\u0091u\3\2\2\2\u0091"+
		"v\3\2\2\2\u0091z\3\2\2\2\u0091\u0085\3\2\2\2\u0091\u008e\3\2\2\2\u0092"+
		"\u009e\3\2\2\2\u0093\u0094\f\b\2\2\u0094\u0095\7\20\2\2\u0095\u009d\5"+
		"\b\5\t\u0096\u0097\f\7\2\2\u0097\u0098\7\7\2\2\u0098\u009d\5\4\3\2\u0099"+
		"\u009a\f\6\2\2\u009a\u009b\7\b\2\2\u009b\u009d\5\4\3\2\u009c\u0093\3\2"+
		"\2\2\u009c\u0096\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\t\3\2\2\2\u00a0\u009e\3\2\2\2"+
		"\u00a1\u00a2\7\34\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a4\7\35\2\2\u00a4\u00ab"+
		"\5\b\5\2\u00a5\u00a6\7\20\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\7\35\2\2"+
		"\u00a8\u00aa\5\b\5\2\u00a9\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\36\2\2\u00af\u00b0\7)\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b8\5"+
		"\b\5\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\7)\2\2\u00b4\u00b5\7\37\2\2\u00b5"+
		"\u00b7\5\b\5\2\u00b6\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\r\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\7 \2\2\u00bc\u00bd\5\22\n\2\u00bd\17\3\2\2\2\u00be\u00bf\7!\2\2\u00bf"+
		"\u00c0\5\b\5\2\u00c0\21\3\2\2\2\u00c1\u00c2\b\n\1\2\u00c2\u00c3\5\b\5"+
		"\2\u00c3\u00c4\7\21\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00ee\3\2\2\2\u00c6"+
		"\u00c7\5\b\5\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ee\3"+
		"\2\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\7\23\2\2\u00cc\u00cd\5\b\5\2\u00cd"+
		"\u00ee\3\2\2\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\5"+
		"\b\5\2\u00d1\u00ee\3\2\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7\4\2\2\u00d4"+
		"\u00d5\5\b\5\2\u00d5\u00d6\7\6\2\2\u00d6\u00ee\3\2\2\2\u00d7\u00d8\7#"+
		"\2\2\u00d8\u00d9\7)\2\2\u00d9\u00da\7\35\2\2\u00da\u00e1\5\b\5\2\u00db"+
		"\u00dc\7\20\2\2\u00dc\u00dd\7)\2\2\u00dd\u00de\7\35\2\2\u00de\u00e0\5"+
		"\b\5\2\u00df\u00db\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7$"+
		"\2\2\u00e5\u00e6\5\22\n\7\u00e6\u00ee\3\2\2\2\u00e7\u00e8\7\4\2\2\u00e8"+
		"\u00e9\5\22\n\2\u00e9\u00ea\7\6\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ec\7"+
		"\27\2\2\u00ec\u00ee\5\22\n\3\u00ed\u00c1\3\2\2\2\u00ed\u00c6\3\2\2\2\u00ed"+
		"\u00ca\3\2\2\2\u00ed\u00ce\3\2\2\2\u00ed\u00d2\3\2\2\2\u00ed\u00d7\3\2"+
		"\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f7\3\2\2\2\u00ef"+
		"\u00f0\f\5\2\2\u00f0\u00f1\7\25\2\2\u00f1\u00f6\5\22\n\6\u00f2\u00f3\f"+
		"\4\2\2\u00f3\u00f4\7\26\2\2\u00f4\u00f6\5\22\n\5\u00f5\u00ef\3\2\2\2\u00f5"+
		"\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\23\3\2\2\2\u00f9\u00f7\3\2\2\2\24$\64DFemo\u0087\u008a\u0091"+
		"\u009c\u009e\u00ab\u00b8\u00e1\u00ed\u00f5\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}