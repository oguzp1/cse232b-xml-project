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
		T__31=32, T__32=33, T__33=34, T__34=35, WS=36, NAME=37, FILENAME=38, STRINGCONSTANT=39, 
		VAR=40;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2, RULE_xq = 3, RULE_cond = 4, RULE_forClause = 5, 
		RULE_letClause = 6, RULE_whereClause = 7, RULE_returnClause = 8, RULE_joinCond = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "f", "xq", "cond", "forClause", "letClause", "whereClause", 
			"returnClause", "joinCond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc'", "'('", "'\"'", "')'", "'/'", "'//'", "'*'", "'.'", "'..'", 
			"'text'", "'@'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", 
			"'and'", "'or'", "'not'", "'<'", "'>'", "'{'", "'}'", "'join'", "'empty'", 
			"'some'", "'in'", "'satisfies'", "'for'", "'let'", "':='", "'where'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS", "NAME", "FILENAME", "STRINGCONSTANT", "VAR"
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
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new APDirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(T__0);
				setState(21);
				match(T__1);
				setState(22);
				match(T__2);
				setState(23);
				match(FILENAME);
				setState(24);
				match(T__2);
				setState(25);
				match(T__3);
				setState(26);
				match(T__4);
				setState(27);
				rp(0);
				}
				break;
			case 2:
				_localctx = new APDirRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(T__0);
				setState(29);
				match(T__1);
				setState(30);
				match(T__2);
				setState(31);
				match(FILENAME);
				setState(32);
				match(T__2);
				setState(33);
				match(T__3);
				setState(34);
				match(T__5);
				setState(35);
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new RPTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(NAME);
				}
				break;
			case T__6:
				{
				_localctx = new RPStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new RPCurrentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new RPParentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new RPTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(T__9);
				setState(44);
				match(T__1);
				setState(45);
				match(T__3);
				}
				break;
			case T__10:
				{
				_localctx = new RPAttNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(T__10);
				setState(47);
				match(NAME);
				}
				break;
			case T__1:
				{
				_localctx = new RPParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(T__1);
				setState(49);
				rp(0);
				setState(50);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RPDirContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(54);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(55);
						match(T__4);
						setState(56);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RPDirRecursiveContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(57);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(58);
						match(T__5);
						setState(59);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RPConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(60);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(61);
						match(T__13);
						setState(62);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RPFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						match(T__11);
						setState(65);
						f(0);
						setState(66);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(72);
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				rp(0);
				setState(76);
				match(T__14);
				setState(77);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				rp(0);
				setState(80);
				match(T__15);
				setState(81);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				rp(0);
				setState(84);
				match(T__16);
				setState(85);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				rp(0);
				setState(88);
				match(T__17);
				setState(89);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FStringEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				rp(0);
				setState(92);
				match(T__14);
				setState(93);
				match(STRINGCONSTANT);
				}
				break;
			case 7:
				{
				_localctx = new FParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__1);
				setState(96);
				f(0);
				setState(97);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new FNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(T__20);
				setState(100);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FAndContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104);
						match(T__18);
						setState(105);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FOrContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107);
						match(T__19);
						setState(108);
						f(3);
						}
						break;
					}
					} 
				}
				setState(113);
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
	public static class XQJoinContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<JoinCondContext> joinCond() {
			return getRuleContexts(JoinCondContext.class);
		}
		public JoinCondContext joinCond(int i) {
			return getRuleContext(JoinCondContext.class,i);
		}
		public XQJoinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterXQJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitXQJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitXQJoin(this);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new XQVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				match(VAR);
				}
				break;
			case STRINGCONSTANT:
				{
				_localctx = new XQStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(STRINGCONSTANT);
				}
				break;
			case T__0:
				{
				_localctx = new XQAbsoluteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				ap();
				}
				break;
			case T__1:
				{
				_localctx = new XQParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(T__1);
				setState(119);
				xq(0);
				setState(120);
				match(T__3);
				}
				break;
			case T__21:
				{
				_localctx = new XQConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__21);
				setState(123);
				match(NAME);
				setState(124);
				match(T__22);
				setState(125);
				match(T__23);
				setState(126);
				xq(0);
				setState(127);
				match(T__24);
				setState(128);
				match(T__21);
				setState(129);
				match(T__4);
				setState(130);
				match(NAME);
				setState(131);
				match(T__22);
				}
				break;
			case T__30:
				{
				_localctx = new XQFLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				forClause();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(134);
					letClause();
					}
				}

				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(137);
					whereClause();
					}
				}

				setState(140);
				returnClause();
				}
				break;
			case T__31:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				letClause();
				setState(143);
				xq(2);
				}
				break;
			case T__25:
				{
				_localctx = new XQJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__25);
				setState(146);
				match(T__1);
				setState(147);
				xq(0);
				setState(148);
				match(T__13);
				setState(149);
				xq(0);
				setState(150);
				match(T__13);
				setState(151);
				joinCond();
				setState(152);
				match(T__13);
				setState(153);
				joinCond();
				setState(154);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new XQConcatContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(158);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(159);
						match(T__13);
						setState(160);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new XQDirContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(161);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(162);
						match(T__4);
						setState(163);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQDirRecursiveContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						match(T__5);
						setState(166);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(171);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(173);
				xq(0);
				setState(174);
				match(T__14);
				setState(175);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				xq(0);
				setState(178);
				match(T__15);
				setState(179);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				xq(0);
				setState(182);
				match(T__16);
				setState(183);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				xq(0);
				setState(186);
				match(T__17);
				setState(187);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(T__26);
				setState(190);
				match(T__1);
				setState(191);
				xq(0);
				setState(192);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__27);
				setState(195);
				match(VAR);
				setState(196);
				match(T__28);
				setState(197);
				xq(0);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(198);
					match(T__13);
					setState(199);
					match(VAR);
					setState(200);
					match(T__28);
					setState(201);
					xq(0);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__29);
				setState(208);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__1);
				setState(211);
				cond(0);
				setState(212);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(T__20);
				setState(215);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(218);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(219);
						match(T__18);
						setState(220);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(221);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(222);
						match(T__19);
						setState(223);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 10, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__30);
			setState(230);
			match(VAR);
			setState(231);
			match(T__28);
			setState(232);
			xq(0);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(233);
				match(T__13);
				setState(234);
				match(VAR);
				setState(235);
				match(T__28);
				setState(236);
				xq(0);
				}
				}
				setState(241);
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
		enterRule(_localctx, 12, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__31);
			setState(243);
			match(VAR);
			setState(244);
			match(T__32);
			setState(245);
			xq(0);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(246);
				match(T__13);
				setState(247);
				match(VAR);
				setState(248);
				match(T__32);
				setState(249);
				xq(0);
				}
				}
				setState(254);
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
		enterRule(_localctx, 14, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__33);
			setState(256);
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
		enterRule(_localctx, 16, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__34);
			setState(259);
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

	public static class JoinCondContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XGrammarParser.NAME, i);
		}
		public JoinCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterJoinCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitJoinCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitJoinCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCondContext joinCond() throws RecognitionException {
		JoinCondContext _localctx = new JoinCondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_joinCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(261);
				match(T__11);
				}
			}

			{
			setState(264);
			match(NAME);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(265);
				match(T__13);
				setState(266);
				match(NAME);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(272);
			match(T__12);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return f_sempred((FContext)_localctx, predIndex);
		case 3:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 4:
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
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\'\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\67"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3G\n\3"+
		"\f\3\16\3J\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4h\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008a"+
		"\n\5\3\5\5\5\u008d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u009f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\u00aa\n\5\f\5\16\5\u00ad\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u00cd\n\6\f\6\16\6\u00d0\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00db\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00e3\n\6\f\6\16"+
		"\6\u00e6\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f0\n\7\f\7\16\7\u00f3"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00fd\n\b\f\b\16\b\u0100\13"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\5\13\u0109\n\13\3\13\3\13\3\13\7\13\u010e"+
		"\n\13\f\13\16\13\u0111\13\13\3\13\3\13\3\13\2\6\4\6\b\n\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\2\2\u0138\2&\3\2\2\2\4\66\3\2\2\2\6g\3\2\2\2\b\u009e\3"+
		"\2\2\2\n\u00da\3\2\2\2\f\u00e7\3\2\2\2\16\u00f4\3\2\2\2\20\u0101\3\2\2"+
		"\2\22\u0104\3\2\2\2\24\u0108\3\2\2\2\26\27\7\3\2\2\27\30\7\4\2\2\30\31"+
		"\7\5\2\2\31\32\7(\2\2\32\33\7\5\2\2\33\34\7\6\2\2\34\35\7\7\2\2\35\'\5"+
		"\4\3\2\36\37\7\3\2\2\37 \7\4\2\2 !\7\5\2\2!\"\7(\2\2\"#\7\5\2\2#$\7\6"+
		"\2\2$%\7\b\2\2%\'\5\4\3\2&\26\3\2\2\2&\36\3\2\2\2\'\3\3\2\2\2()\b\3\1"+
		"\2)\67\7\'\2\2*\67\7\t\2\2+\67\7\n\2\2,\67\7\13\2\2-.\7\f\2\2./\7\4\2"+
		"\2/\67\7\6\2\2\60\61\7\r\2\2\61\67\7\'\2\2\62\63\7\4\2\2\63\64\5\4\3\2"+
		"\64\65\7\6\2\2\65\67\3\2\2\2\66(\3\2\2\2\66*\3\2\2\2\66+\3\2\2\2\66,\3"+
		"\2\2\2\66-\3\2\2\2\66\60\3\2\2\2\66\62\3\2\2\2\67H\3\2\2\289\f\6\2\29"+
		":\7\7\2\2:G\5\4\3\7;<\f\5\2\2<=\7\b\2\2=G\5\4\3\6>?\f\3\2\2?@\7\20\2\2"+
		"@G\5\4\3\4AB\f\4\2\2BC\7\16\2\2CD\5\6\4\2DE\7\17\2\2EG\3\2\2\2F8\3\2\2"+
		"\2F;\3\2\2\2F>\3\2\2\2FA\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2"+
		"\2\2JH\3\2\2\2KL\b\4\1\2Lh\5\4\3\2MN\5\4\3\2NO\7\21\2\2OP\5\4\3\2Ph\3"+
		"\2\2\2QR\5\4\3\2RS\7\22\2\2ST\5\4\3\2Th\3\2\2\2UV\5\4\3\2VW\7\23\2\2W"+
		"X\5\4\3\2Xh\3\2\2\2YZ\5\4\3\2Z[\7\24\2\2[\\\5\4\3\2\\h\3\2\2\2]^\5\4\3"+
		"\2^_\7\21\2\2_`\7)\2\2`h\3\2\2\2ab\7\4\2\2bc\5\6\4\2cd\7\6\2\2dh\3\2\2"+
		"\2ef\7\27\2\2fh\5\6\4\3gK\3\2\2\2gM\3\2\2\2gQ\3\2\2\2gU\3\2\2\2gY\3\2"+
		"\2\2g]\3\2\2\2ga\3\2\2\2ge\3\2\2\2hq\3\2\2\2ij\f\5\2\2jk\7\25\2\2kp\5"+
		"\6\4\6lm\f\4\2\2mn\7\26\2\2np\5\6\4\5oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo"+
		"\3\2\2\2qr\3\2\2\2r\7\3\2\2\2sq\3\2\2\2tu\b\5\1\2u\u009f\7*\2\2v\u009f"+
		"\7)\2\2w\u009f\5\2\2\2xy\7\4\2\2yz\5\b\5\2z{\7\6\2\2{\u009f\3\2\2\2|}"+
		"\7\30\2\2}~\7\'\2\2~\177\7\31\2\2\177\u0080\7\32\2\2\u0080\u0081\5\b\5"+
		"\2\u0081\u0082\7\33\2\2\u0082\u0083\7\30\2\2\u0083\u0084\7\7\2\2\u0084"+
		"\u0085\7\'\2\2\u0085\u0086\7\31\2\2\u0086\u009f\3\2\2\2\u0087\u0089\5"+
		"\f\7\2\u0088\u008a\5\16\b\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u008d\5\20\t\2\u008c\u008b\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5\22\n\2\u008f\u009f\3\2\2\2\u0090"+
		"\u0091\5\16\b\2\u0091\u0092\5\b\5\4\u0092\u009f\3\2\2\2\u0093\u0094\7"+
		"\34\2\2\u0094\u0095\7\4\2\2\u0095\u0096\5\b\5\2\u0096\u0097\7\20\2\2\u0097"+
		"\u0098\5\b\5\2\u0098\u0099\7\20\2\2\u0099\u009a\5\24\13\2\u009a\u009b"+
		"\7\20\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\6\2\2\u009d\u009f\3\2\2"+
		"\2\u009et\3\2\2\2\u009ev\3\2\2\2\u009ew\3\2\2\2\u009ex\3\2\2\2\u009e|"+
		"\3\2\2\2\u009e\u0087\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u0093\3\2\2\2\u009f"+
		"\u00ab\3\2\2\2\u00a0\u00a1\f\7\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00aa\5"+
		"\b\5\b\u00a3\u00a4\f\t\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00aa\5\4\3\2\u00a6"+
		"\u00a7\f\b\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00aa\5\4\3\2\u00a9\u00a0\3\2"+
		"\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\t\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\u00af\b\6\1\2\u00af\u00b0\5\b\5\2\u00b0\u00b1\7\21\2\2\u00b1\u00b2"+
		"\5\b\5\2\u00b2\u00db\3\2\2\2\u00b3\u00b4\5\b\5\2\u00b4\u00b5\7\22\2\2"+
		"\u00b5\u00b6\5\b\5\2\u00b6\u00db\3\2\2\2\u00b7\u00b8\5\b\5\2\u00b8\u00b9"+
		"\7\23\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00db\3\2\2\2\u00bb\u00bc\5\b\5\2"+
		"\u00bc\u00bd\7\24\2\2\u00bd\u00be\5\b\5\2\u00be\u00db\3\2\2\2\u00bf\u00c0"+
		"\7\35\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3\7\6\2\2"+
		"\u00c3\u00db\3\2\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\7*\2\2\u00c6\u00c7"+
		"\7\37\2\2\u00c7\u00ce\5\b\5\2\u00c8\u00c9\7\20\2\2\u00c9\u00ca\7*\2\2"+
		"\u00ca\u00cb\7\37\2\2\u00cb\u00cd\5\b\5\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\7 \2\2\u00d2\u00d3\5\n\6\7\u00d3\u00db\3\2"+
		"\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00d6\5\n\6\2\u00d6\u00d7\7\6\2\2\u00d7"+
		"\u00db\3\2\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00db\5\n\6\3\u00da\u00ae\3"+
		"\2\2\2\u00da\u00b3\3\2\2\2\u00da\u00b7\3\2\2\2\u00da\u00bb\3\2\2\2\u00da"+
		"\u00bf\3\2\2\2\u00da\u00c4\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00e4\3\2\2\2\u00dc\u00dd\f\5\2\2\u00dd\u00de\7\25\2\2\u00de"+
		"\u00e3\5\n\6\6\u00df\u00e0\f\4\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e3\5"+
		"\n\6\5\u00e2\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\13\3\2\2\2\u00e6\u00e4\3\2\2"+
		"\2\u00e7\u00e8\7!\2\2\u00e8\u00e9\7*\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00f1"+
		"\5\b\5\2\u00eb\u00ec\7\20\2\2\u00ec\u00ed\7*\2\2\u00ed\u00ee\7\37\2\2"+
		"\u00ee\u00f0\5\b\5\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\r\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\"\2\2\u00f5\u00f6\7*\2\2\u00f6\u00f7\7#\2\2\u00f7\u00fe\5\b\5"+
		"\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fd"+
		"\5\b\5\2\u00fc\u00f8\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\17\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7$\2\2"+
		"\u0102\u0103\5\n\6\2\u0103\21\3\2\2\2\u0104\u0105\7%\2\2\u0105\u0106\5"+
		"\b\5\2\u0106\23\3\2\2\2\u0107\u0109\7\16\2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010f\7\'\2\2\u010b\u010c\7\20"+
		"\2\2\u010c\u010e\7\'\2\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0113\7\17\2\2\u0113\25\3\2\2\2\26&\66FHgoq\u0089\u008c\u009e"+
		"\u00a9\u00ab\u00ce\u00da\u00e2\u00e4\u00f1\u00fe\u0108\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}