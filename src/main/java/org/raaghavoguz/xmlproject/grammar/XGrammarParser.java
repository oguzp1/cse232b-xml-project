// Generated from C:/Users/raagh/IdeaProjects/cse232b-xml-project/src/main/antlr\XGrammar.g4 by ANTLR 4.9.1
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, WS=24, FILENAME=25, 
		TAGNAME=26, STRINGCONSTANT=27;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "f"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc('", "'\"'", "')/'", "')//'", "'*'", "'.'", "'..'", "'text()'", 
			"'@'", "'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'='", "'eq'", 
			"'=='", "'is'", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS", "FILENAME", "TAGNAME", "STRINGCONSTANT"
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
	public static class AbsoluteImmediateContext extends ApContext {
		public TerminalNode FILENAME() { return getToken(XGrammarParser.FILENAME, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public AbsoluteImmediateContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterAbsoluteImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitAbsoluteImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitAbsoluteImmediate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsoluteRecursiveContext extends ApContext {
		public TerminalNode FILENAME() { return getToken(XGrammarParser.FILENAME, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public AbsoluteRecursiveContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterAbsoluteRecursive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitAbsoluteRecursive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitAbsoluteRecursive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AbsoluteImmediateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(T__0);
				setState(7);
				match(T__1);
				setState(8);
				match(FILENAME);
				setState(9);
				match(T__1);
				setState(10);
				match(T__2);
				setState(11);
				rp(0);
				}
				break;
			case 2:
				_localctx = new AbsoluteRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(T__0);
				setState(13);
				match(T__1);
				setState(14);
				match(FILENAME);
				setState(15);
				match(T__1);
				setState(16);
				match(T__3);
				setState(17);
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
	public static class ExpDotContext extends RpContext {
		public ExpDotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpRPDir1Context extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public ExpRPDir1Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpRPDir1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpRPDir1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpRPDir1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpRPbracketsContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ExpRPbracketsContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpRPbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpRPbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpRPbrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpCatContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public ExpCatContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpCat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpCat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpCat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpDotDotContext extends RpContext {
		public ExpDotDotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpDotDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpDotDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpDotDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpStarContext extends RpContext {
		public ExpStarContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpTagNameContext extends RpContext {
		public TerminalNode TAGNAME() { return getToken(XGrammarParser.TAGNAME, 0); }
		public ExpTagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpRPDir2Context extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public ExpRPDir2Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpRPDir2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpRPDir2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpRPDir2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpRPfilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public ExpRPfilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpRPfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpRPfilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpRPfilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpTextContext extends RpContext {
		public ExpTextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpAttnameContext extends RpContext {
		public TerminalNode TAGNAME() { return getToken(XGrammarParser.TAGNAME, 0); }
		public ExpAttnameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterExpAttname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitExpAttname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitExpAttname(this);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGNAME:
				{
				_localctx = new ExpTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(21);
				match(TAGNAME);
				}
				break;
			case T__4:
				{
				_localctx = new ExpStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(T__4);
				}
				break;
			case T__5:
				{
				_localctx = new ExpDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new ExpDotDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new ExpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new ExpAttnameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(T__8);
				setState(27);
				match(TAGNAME);
				}
				break;
			case T__9:
				{
				_localctx = new ExpRPbracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(T__9);
				setState(29);
				rp(0);
				setState(30);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(48);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpRPDir1Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(34);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(35);
						match(T__11);
						setState(36);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpRPDir2Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(37);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(38);
						match(T__12);
						setState(39);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpCatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(40);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(41);
						match(T__15);
						setState(42);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new ExpRPfilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(43);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(44);
						match(T__13);
						setState(45);
						f(0);
						setState(46);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(52);
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
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode STRINGCONSTANT() { return getToken(XGrammarParser.STRINGCONSTANT, 0); }
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XGrammarListener ) ((XGrammarListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XGrammarVisitor ) return ((XGrammarVisitor<? extends T>)visitor).visitF(this);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(54);
				rp(0);
				}
				break;
			case 2:
				{
				setState(55);
				rp(0);
				setState(56);
				match(T__16);
				setState(57);
				rp(0);
				}
				break;
			case 3:
				{
				setState(59);
				rp(0);
				setState(60);
				match(T__17);
				setState(61);
				rp(0);
				}
				break;
			case 4:
				{
				setState(63);
				rp(0);
				setState(64);
				match(T__18);
				setState(65);
				rp(0);
				}
				break;
			case 5:
				{
				setState(67);
				rp(0);
				setState(68);
				match(T__19);
				setState(69);
				rp(0);
				}
				break;
			case 6:
				{
				setState(71);
				rp(0);
				setState(72);
				match(T__16);
				setState(73);
				match(STRINGCONSTANT);
				}
				break;
			case 7:
				{
				setState(75);
				match(T__9);
				setState(76);
				f(0);
				setState(77);
				match(T__10);
				}
				break;
			case 8:
				{
				setState(79);
				match(T__22);
				setState(80);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						match(T__20);
						setState(85);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						match(T__21);
						setState(88);
						f(3);
						}
						break;
					}
					} 
				}
				setState(93);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return f_sempred((FContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n\3\f\3\16\3\66\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\2\4\4\6\5\2\4\6\2\2\2q\2\24\3\2"+
		"\2\2\4\"\3\2\2\2\6S\3\2\2\2\b\t\7\3\2\2\t\n\7\4\2\2\n\13\7\33\2\2\13\f"+
		"\7\4\2\2\f\r\7\5\2\2\r\25\5\4\3\2\16\17\7\3\2\2\17\20\7\4\2\2\20\21\7"+
		"\33\2\2\21\22\7\4\2\2\22\23\7\6\2\2\23\25\5\4\3\2\24\b\3\2\2\2\24\16\3"+
		"\2\2\2\25\3\3\2\2\2\26\27\b\3\1\2\27#\7\34\2\2\30#\7\7\2\2\31#\7\b\2\2"+
		"\32#\7\t\2\2\33#\7\n\2\2\34\35\7\13\2\2\35#\7\34\2\2\36\37\7\f\2\2\37"+
		" \5\4\3\2 !\7\r\2\2!#\3\2\2\2\"\26\3\2\2\2\"\30\3\2\2\2\"\31\3\2\2\2\""+
		"\32\3\2\2\2\"\33\3\2\2\2\"\34\3\2\2\2\"\36\3\2\2\2#\64\3\2\2\2$%\f\6\2"+
		"\2%&\7\16\2\2&\63\5\4\3\7\'(\f\5\2\2()\7\17\2\2)\63\5\4\3\6*+\f\3\2\2"+
		"+,\7\22\2\2,\63\5\4\3\4-.\f\4\2\2./\7\20\2\2/\60\5\6\4\2\60\61\7\21\2"+
		"\2\61\63\3\2\2\2\62$\3\2\2\2\62\'\3\2\2\2\62*\3\2\2\2\62-\3\2\2\2\63\66"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\678\b"+
		"\4\1\28T\5\4\3\29:\5\4\3\2:;\7\23\2\2;<\5\4\3\2<T\3\2\2\2=>\5\4\3\2>?"+
		"\7\24\2\2?@\5\4\3\2@T\3\2\2\2AB\5\4\3\2BC\7\25\2\2CD\5\4\3\2DT\3\2\2\2"+
		"EF\5\4\3\2FG\7\26\2\2GH\5\4\3\2HT\3\2\2\2IJ\5\4\3\2JK\7\23\2\2KL\7\35"+
		"\2\2LT\3\2\2\2MN\7\f\2\2NO\5\6\4\2OP\7\r\2\2PT\3\2\2\2QR\7\31\2\2RT\5"+
		"\6\4\3S\67\3\2\2\2S9\3\2\2\2S=\3\2\2\2SA\3\2\2\2SE\3\2\2\2SI\3\2\2\2S"+
		"M\3\2\2\2SQ\3\2\2\2T]\3\2\2\2UV\f\5\2\2VW\7\27\2\2W\\\5\6\4\6XY\f\4\2"+
		"\2YZ\7\30\2\2Z\\\5\6\4\5[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^\7\3\2\2\2_]\3\2\2\2\t\24\"\62\64S[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}