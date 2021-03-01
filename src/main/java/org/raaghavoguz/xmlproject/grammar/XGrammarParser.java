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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, WS=37, NAME=38, FILENAME=39, 
		STRINGCONSTANT=40, VAR=41;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2, RULE_xq = 3, RULE_forClause = 4, 
		RULE_letClause = 5, RULE_whereClause = 6, RULE_joinConstructor = 7, RULE_joinCond = 8, 
		RULE_joinProj = 9, RULE_joinReturn = 10, RULE_joinClause = 11, RULE_returnClause = 12, 
		RULE_cond = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "f", "xq", "forClause", "letClause", "whereClause", "joinConstructor", 
			"joinCond", "joinProj", "joinReturn", "joinClause", "returnClause", "cond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc'", "'('", "'\"'", "')'", "'/'", "'//'", "'*'", "'.'", "'..'", 
			"'text'", "'@'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", 
			"'and'", "'or'", "'not'", "'<'", "'>'", "'{'", "'}'", "'for'", "'in'", 
			"'let'", "':='", "'where'", "'return'", "'tuple'", "'join'", "'empty'", 
			"'some'", "'satisfies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "NAME", "FILENAME", "STRINGCONSTANT", "VAR"
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new APDirContext(_localctx);
				enterOuterAlt(_localctx, 1);
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
				match(T__4);
				setState(35);
				rp(0);
				}
				break;
			case 2:
				_localctx = new APDirRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(T__1);
				setState(38);
				match(T__2);
				setState(39);
				match(FILENAME);
				setState(40);
				match(T__2);
				setState(41);
				match(T__3);
				setState(42);
				match(T__5);
				setState(43);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new RPTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				match(NAME);
				}
				break;
			case T__6:
				{
				_localctx = new RPStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new RPCurrentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new RPParentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new RPTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(T__9);
				setState(52);
				match(T__1);
				setState(53);
				match(T__3);
				}
				break;
			case T__10:
				{
				_localctx = new RPAttNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__10);
				setState(55);
				match(NAME);
				}
				break;
			case T__1:
				{
				_localctx = new RPParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__1);
				setState(57);
				rp(0);
				setState(58);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RPDirContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						match(T__4);
						setState(64);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RPDirRecursiveContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						match(T__5);
						setState(67);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RPConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(68);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(69);
						match(T__13);
						setState(70);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RPFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(T__11);
						setState(73);
						f(0);
						setState(74);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(80);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				rp(0);
				setState(84);
				match(T__14);
				setState(85);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				rp(0);
				setState(88);
				match(T__15);
				setState(89);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				rp(0);
				setState(92);
				match(T__16);
				setState(93);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				rp(0);
				setState(96);
				match(T__17);
				setState(97);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FStringEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				rp(0);
				setState(100);
				match(T__14);
				setState(101);
				match(STRINGCONSTANT);
				}
				break;
			case 7:
				{
				_localctx = new FParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(T__1);
				setState(104);
				f(0);
				setState(105);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new FNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(T__20);
				setState(108);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FAndContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						match(T__18);
						setState(113);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FOrContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						match(T__19);
						setState(116);
						f(3);
						}
						break;
					}
					} 
				}
				setState(121);
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
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new XQVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(VAR);
				}
				break;
			case STRINGCONSTANT:
				{
				_localctx = new XQStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(STRINGCONSTANT);
				}
				break;
			case T__0:
				{
				_localctx = new XQAbsoluteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				ap();
				}
				break;
			case T__1:
				{
				_localctx = new XQParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__1);
				setState(127);
				xq(0);
				setState(128);
				match(T__3);
				}
				break;
			case T__21:
				{
				_localctx = new XQConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(T__21);
				setState(131);
				match(NAME);
				setState(132);
				match(T__22);
				setState(133);
				match(T__23);
				setState(134);
				xq(0);
				setState(135);
				match(T__24);
				setState(136);
				match(T__21);
				setState(137);
				match(T__4);
				setState(138);
				match(NAME);
				setState(139);
				match(T__22);
				}
				break;
			case T__25:
				{
				_localctx = new XQFLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				forClause();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(142);
					letClause();
					}
				}

				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(145);
					whereClause();
					}
				}

				setState(148);
				returnClause();
				}
				break;
			case T__27:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				letClause();
				setState(151);
				xq(2);
				}
				break;
			case T__32:
				{
				_localctx = new XQJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new XQConcatContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(156);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(157);
						match(T__13);
						setState(158);
						xq(8);
						}
						break;
					case 2:
						{
						_localctx = new XQDirContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(159);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(160);
						match(T__4);
						setState(161);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQDirRecursiveContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(162);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(163);
						match(T__5);
						setState(164);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(169);
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
			setState(170);
			match(T__25);
			setState(171);
			match(VAR);
			setState(172);
			match(T__26);
			setState(173);
			xq(0);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(174);
				match(T__13);
				setState(175);
				match(VAR);
				setState(176);
				match(T__26);
				setState(177);
				xq(0);
				}
				}
				setState(182);
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
			setState(183);
			match(T__27);
			setState(184);
			match(VAR);
			setState(185);
			match(T__28);
			setState(186);
			xq(0);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(187);
				match(T__13);
				setState(188);
				match(VAR);
				setState(189);
				match(T__28);
				setState(190);
				xq(0);
				}
				}
				setState(195);
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
			setState(196);
			match(T__29);
			setState(197);
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

	public static class JoinConstructorContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XGrammarParser.NAME, i);
		}
		public TerminalNode VAR() { return getToken(XGrammarParser.VAR, 0); }
		public JoinConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterJoinConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitJoinConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitJoinConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConstructorContext joinConstructor() throws RecognitionException {
		JoinConstructorContext _localctx = new JoinConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joinConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__21);
			setState(200);
			match(NAME);
			setState(201);
			match(T__22);
			setState(202);
			match(T__23);
			setState(203);
			match(VAR);
			setState(204);
			match(T__24);
			setState(205);
			match(T__21);
			setState(206);
			match(T__4);
			setState(207);
			match(NAME);
			setState(208);
			match(T__22);
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
		enterRule(_localctx, 16, RULE_joinCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__11);
			setState(211);
			match(NAME);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(212);
				match(T__13);
				setState(213);
				match(NAME);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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

	public static class JoinProjContext extends ParserRuleContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public JoinReturnContext joinReturn() {
			return getRuleContext(JoinReturnContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public JoinProjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinProj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterJoinProj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitJoinProj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitJoinProj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinProjContext joinProj() throws RecognitionException {
		JoinProjContext _localctx = new JoinProjContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_joinProj);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(221);
				forClause();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(222);
					whereClause();
					}
				}

				setState(225);
				joinReturn();
				}
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class JoinReturnContext extends ParserRuleContext {
		public List<JoinConstructorContext> joinConstructor() {
			return getRuleContexts(JoinConstructorContext.class);
		}
		public JoinConstructorContext joinConstructor(int i) {
			return getRuleContext(JoinConstructorContext.class,i);
		}
		public JoinReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterJoinReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitJoinReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitJoinReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinReturnContext joinReturn() throws RecognitionException {
		JoinReturnContext _localctx = new JoinReturnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_joinReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__30);
			setState(231);
			match(T__21);
			setState(232);
			match(T__31);
			setState(233);
			match(T__22);
			setState(234);
			joinConstructor();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(235);
				match(T__13);
				setState(236);
				joinConstructor();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__21);
			setState(243);
			match(T__4);
			setState(244);
			match(T__31);
			setState(245);
			match(T__22);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public List<JoinProjContext> joinProj() {
			return getRuleContexts(JoinProjContext.class);
		}
		public JoinProjContext joinProj(int i) {
			return getRuleContext(JoinProjContext.class,i);
		}
		public List<JoinCondContext> joinCond() {
			return getRuleContexts(JoinCondContext.class);
		}
		public JoinCondContext joinCond(int i) {
			return getRuleContext(JoinCondContext.class,i);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__32);
			setState(248);
			match(T__1);
			setState(249);
			joinProj();
			setState(250);
			match(T__13);
			setState(251);
			joinProj();
			setState(252);
			match(T__13);
			setState(253);
			joinCond();
			setState(254);
			match(T__13);
			setState(255);
			joinCond();
			setState(256);
			match(T__3);
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
		public JoinReturnContext joinReturn() {
			return getRuleContext(JoinReturnContext.class,0);
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
		enterRule(_localctx, 24, RULE_returnClause);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(258);
				match(T__30);
				setState(259);
				xq(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				joinReturn();
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(264);
				xq(0);
				setState(265);
				match(T__14);
				setState(266);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				xq(0);
				setState(269);
				match(T__15);
				setState(270);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				xq(0);
				setState(273);
				match(T__16);
				setState(274);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				xq(0);
				setState(277);
				match(T__17);
				setState(278);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(T__33);
				setState(281);
				match(T__1);
				setState(282);
				xq(0);
				setState(283);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(T__34);
				setState(286);
				match(VAR);
				setState(287);
				match(T__26);
				setState(288);
				xq(0);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(289);
					match(T__13);
					setState(290);
					match(VAR);
					setState(291);
					match(T__26);
					setState(292);
					xq(0);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				match(T__35);
				setState(299);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(T__1);
				setState(302);
				cond(0);
				setState(303);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(T__20);
				setState(306);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(309);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(310);
						match(T__18);
						setState(311);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(312);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(313);
						match(T__19);
						setState(314);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 13:
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
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4x\n\4\f\4\16"+
		"\4{\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0092\n\5\3\5\5\5\u0095\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u009d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a8\n"+
		"\5\f\5\16\5\u00ab\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b5\n\6\f"+
		"\6\16\6\u00b8\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c2\n\7\f\7\16"+
		"\7\u00c5\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\7\n\u00d9\n\n\f\n\16\n\u00dc\13\n\3\n\3\n\3\13\3\13\5"+
		"\13\u00e2\n\13\3\13\3\13\3\13\5\13\u00e7\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00f0\n\f\f\f\16\f\u00f3\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0108\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u0128\n\17\f\17\16\17\u012b\13\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0136\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u013e\n\17\f\17\16\17\u0141\13\17\3\17\2\6\4\6\b\34\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\2\2\u0165\2.\3\2\2\2\4>\3\2\2\2\6o\3\2\2\2\b\u009c"+
		"\3\2\2\2\n\u00ac\3\2\2\2\f\u00b9\3\2\2\2\16\u00c6\3\2\2\2\20\u00c9\3\2"+
		"\2\2\22\u00d4\3\2\2\2\24\u00e6\3\2\2\2\26\u00e8\3\2\2\2\30\u00f9\3\2\2"+
		"\2\32\u0107\3\2\2\2\34\u0135\3\2\2\2\36\37\7\3\2\2\37 \7\4\2\2 !\7\5\2"+
		"\2!\"\7)\2\2\"#\7\5\2\2#$\7\6\2\2$%\7\7\2\2%/\5\4\3\2&\'\7\3\2\2\'(\7"+
		"\4\2\2()\7\5\2\2)*\7)\2\2*+\7\5\2\2+,\7\6\2\2,-\7\b\2\2-/\5\4\3\2.\36"+
		"\3\2\2\2.&\3\2\2\2/\3\3\2\2\2\60\61\b\3\1\2\61?\7(\2\2\62?\7\t\2\2\63"+
		"?\7\n\2\2\64?\7\13\2\2\65\66\7\f\2\2\66\67\7\4\2\2\67?\7\6\2\289\7\r\2"+
		"\29?\7(\2\2:;\7\4\2\2;<\5\4\3\2<=\7\6\2\2=?\3\2\2\2>\60\3\2\2\2>\62\3"+
		"\2\2\2>\63\3\2\2\2>\64\3\2\2\2>\65\3\2\2\2>8\3\2\2\2>:\3\2\2\2?P\3\2\2"+
		"\2@A\f\6\2\2AB\7\7\2\2BO\5\4\3\7CD\f\5\2\2DE\7\b\2\2EO\5\4\3\6FG\f\3\2"+
		"\2GH\7\20\2\2HO\5\4\3\4IJ\f\4\2\2JK\7\16\2\2KL\5\6\4\2LM\7\17\2\2MO\3"+
		"\2\2\2N@\3\2\2\2NC\3\2\2\2NF\3\2\2\2NI\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\5\3\2\2\2RP\3\2\2\2ST\b\4\1\2Tp\5\4\3\2UV\5\4\3\2VW\7\21\2\2W"+
		"X\5\4\3\2Xp\3\2\2\2YZ\5\4\3\2Z[\7\22\2\2[\\\5\4\3\2\\p\3\2\2\2]^\5\4\3"+
		"\2^_\7\23\2\2_`\5\4\3\2`p\3\2\2\2ab\5\4\3\2bc\7\24\2\2cd\5\4\3\2dp\3\2"+
		"\2\2ef\5\4\3\2fg\7\21\2\2gh\7*\2\2hp\3\2\2\2ij\7\4\2\2jk\5\6\4\2kl\7\6"+
		"\2\2lp\3\2\2\2mn\7\27\2\2np\5\6\4\3oS\3\2\2\2oU\3\2\2\2oY\3\2\2\2o]\3"+
		"\2\2\2oa\3\2\2\2oe\3\2\2\2oi\3\2\2\2om\3\2\2\2py\3\2\2\2qr\f\5\2\2rs\7"+
		"\25\2\2sx\5\6\4\6tu\f\4\2\2uv\7\26\2\2vx\5\6\4\5wq\3\2\2\2wt\3\2\2\2x"+
		"{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\7\3\2\2\2{y\3\2\2\2|}\b\5\1\2}\u009d\7"+
		"+\2\2~\u009d\7*\2\2\177\u009d\5\2\2\2\u0080\u0081\7\4\2\2\u0081\u0082"+
		"\5\b\5\2\u0082\u0083\7\6\2\2\u0083\u009d\3\2\2\2\u0084\u0085\7\30\2\2"+
		"\u0085\u0086\7(\2\2\u0086\u0087\7\31\2\2\u0087\u0088\7\32\2\2\u0088\u0089"+
		"\5\b\5\2\u0089\u008a\7\33\2\2\u008a\u008b\7\30\2\2\u008b\u008c\7\7\2\2"+
		"\u008c\u008d\7(\2\2\u008d\u008e\7\31\2\2\u008e\u009d\3\2\2\2\u008f\u0091"+
		"\5\n\6\2\u0090\u0092\5\f\7\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0095\5\16\b\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\32\16\2\u0097\u009d\3\2\2\2\u0098"+
		"\u0099\5\f\7\2\u0099\u009a\5\b\5\4\u009a\u009d\3\2\2\2\u009b\u009d\5\30"+
		"\r\2\u009c|\3\2\2\2\u009c~\3\2\2\2\u009c\177\3\2\2\2\u009c\u0080\3\2\2"+
		"\2\u009c\u0084\3\2\2\2\u009c\u008f\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a9\3\2\2\2\u009e\u009f\f\t\2\2\u009f\u00a0\7\20\2\2"+
		"\u00a0\u00a8\5\b\5\n\u00a1\u00a2\f\b\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a8"+
		"\5\4\3\2\u00a4\u00a5\f\7\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00a8\5\4\3\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\t\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ad\7\34\2\2\u00ad\u00ae\7+\2\2\u00ae\u00af\7\35\2\2"+
		"\u00af\u00b6\5\b\5\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\7+\2\2\u00b2\u00b3"+
		"\7\35\2\2\u00b3\u00b5\5\b\5\2\u00b4\u00b0\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb\7+\2\2\u00bb\u00bc\7\37\2\2"+
		"\u00bc\u00c3\5\b\5\2\u00bd\u00be\7\20\2\2\u00be\u00bf\7+\2\2\u00bf\u00c0"+
		"\7\37\2\2\u00c0\u00c2\5\b\5\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\r\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c6\u00c7\7 \2\2\u00c7\u00c8\5\34\17\2\u00c8\17\3\2\2\2\u00c9"+
		"\u00ca\7\30\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\7"+
		"\32\2\2\u00cd\u00ce\7+\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\7\30\2\2\u00d0"+
		"\u00d1\7\7\2\2\u00d1\u00d2\7(\2\2\u00d2\u00d3\7\31\2\2\u00d3\21\3\2\2"+
		"\2\u00d4\u00d5\7\16\2\2\u00d5\u00da\7(\2\2\u00d6\u00d7\7\20\2\2\u00d7"+
		"\u00d9\7(\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7\17\2\2\u00de\23\3\2\2\2\u00df\u00e1\5\n\6\2\u00e0\u00e2\5\16"+
		"\b\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\5\26\f\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\30\r\2\u00e6\u00df\3"+
		"\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\25\3\2\2\2\u00e8\u00e9\7!\2\2\u00e9\u00ea"+
		"\7\30\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\7\31\2\2\u00ec\u00f1\5\20\t"+
		"\2\u00ed\u00ee\7\20\2\2\u00ee\u00f0\5\20\t\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\30\2\2\u00f5\u00f6\7\7\2\2\u00f6"+
		"\u00f7\7\"\2\2\u00f7\u00f8\7\31\2\2\u00f8\27\3\2\2\2\u00f9\u00fa\7#\2"+
		"\2\u00fa\u00fb\7\4\2\2\u00fb\u00fc\5\24\13\2\u00fc\u00fd\7\20\2\2\u00fd"+
		"\u00fe\5\24\13\2\u00fe\u00ff\7\20\2\2\u00ff\u0100\5\22\n\2\u0100\u0101"+
		"\7\20\2\2\u0101\u0102\5\22\n\2\u0102\u0103\7\6\2\2\u0103\31\3\2\2\2\u0104"+
		"\u0105\7!\2\2\u0105\u0108\5\b\5\2\u0106\u0108\5\26\f\2\u0107\u0104\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\33\3\2\2\2\u0109\u010a\b\17\1\2\u010a\u010b"+
		"\5\b\5\2\u010b\u010c\7\21\2\2\u010c\u010d\5\b\5\2\u010d\u0136\3\2\2\2"+
		"\u010e\u010f\5\b\5\2\u010f\u0110\7\22\2\2\u0110\u0111\5\b\5\2\u0111\u0136"+
		"\3\2\2\2\u0112\u0113\5\b\5\2\u0113\u0114\7\23\2\2\u0114\u0115\5\b\5\2"+
		"\u0115\u0136\3\2\2\2\u0116\u0117\5\b\5\2\u0117\u0118\7\24\2\2\u0118\u0119"+
		"\5\b\5\2\u0119\u0136\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011c\7\4\2\2\u011c"+
		"\u011d\5\b\5\2\u011d\u011e\7\6\2\2\u011e\u0136\3\2\2\2\u011f\u0120\7%"+
		"\2\2\u0120\u0121\7+\2\2\u0121\u0122\7\35\2\2\u0122\u0129\5\b\5\2\u0123"+
		"\u0124\7\20\2\2\u0124\u0125\7+\2\2\u0125\u0126\7\35\2\2\u0126\u0128\5"+
		"\b\5\2\u0127\u0123\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7&"+
		"\2\2\u012d\u012e\5\34\17\7\u012e\u0136\3\2\2\2\u012f\u0130\7\4\2\2\u0130"+
		"\u0131\5\34\17\2\u0131\u0132\7\6\2\2\u0132\u0136\3\2\2\2\u0133\u0134\7"+
		"\27\2\2\u0134\u0136\5\34\17\3\u0135\u0109\3\2\2\2\u0135\u010e\3\2\2\2"+
		"\u0135\u0112\3\2\2\2\u0135\u0116\3\2\2\2\u0135\u011a\3\2\2\2\u0135\u011f"+
		"\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013f\3\2\2\2\u0137"+
		"\u0138\f\5\2\2\u0138\u0139\7\25\2\2\u0139\u013e\5\34\17\6\u013a\u013b"+
		"\f\4\2\2\u013b\u013c\7\26\2\2\u013c\u013e\5\34\17\5\u013d\u0137\3\2\2"+
		"\2\u013d\u013a\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\35\3\2\2\2\u0141\u013f\3\2\2\2\31.>NPowy\u0091\u0094\u009c"+
		"\u00a7\u00a9\u00b6\u00c3\u00da\u00e1\u00e6\u00f1\u0107\u0129\u0135\u013d"+
		"\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}