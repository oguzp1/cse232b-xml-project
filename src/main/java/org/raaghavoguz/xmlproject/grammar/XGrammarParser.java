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
			null, "'doc(\"'", "'\")/'", "'\")//'", "'*'", "'.'", "'..'", "'text()'", 
			"'@'", "'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'='", "'eq'", 
			"'=='", "'is'", "'and'", "'or'", "'not'", "'<'", "'>'", "'{'", "'}'", 
			"'</'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'empty('", 
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
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new APDirContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(T__0);
				setState(19);
				match(FILENAME);
				setState(20);
				match(T__1);
				setState(21);
				rp(0);
				}
				break;
			case 2:
				_localctx = new APDirRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(T__0);
				setState(23);
				match(FILENAME);
				setState(24);
				match(T__2);
				setState(25);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new RPTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(29);
				match(NAME);
				}
				break;
			case T__3:
				{
				_localctx = new RPStarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(T__3);
				}
				break;
			case T__4:
				{
				_localctx = new RPCurrentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(T__4);
				}
				break;
			case T__5:
				{
				_localctx = new RPParentDirContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new RPTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new RPAttNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(T__7);
				setState(35);
				match(NAME);
				}
				break;
			case T__8:
				{
				_localctx = new RPParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__8);
				setState(37);
				rp(0);
				setState(38);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RPDirContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(42);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(43);
						match(T__10);
						setState(44);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RPDirRecursiveContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(45);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(46);
						match(T__11);
						setState(47);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RPConcatContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(48);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(49);
						match(T__14);
						setState(50);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RPFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						match(T__12);
						setState(53);
						f(0);
						setState(54);
						match(T__13);
						}
						break;
					}
					} 
				}
				setState(60);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				rp(0);
				setState(64);
				match(T__15);
				setState(65);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FRPEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				rp(0);
				setState(68);
				match(T__16);
				setState(69);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				rp(0);
				setState(72);
				match(T__17);
				setState(73);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FRPIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				rp(0);
				setState(76);
				match(T__18);
				setState(77);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FStringEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				rp(0);
				setState(80);
				match(T__15);
				setState(81);
				match(STRINGCONSTANT);
				}
				break;
			case 7:
				{
				_localctx = new FParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(T__8);
				setState(84);
				f(0);
				setState(85);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new FNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__21);
				setState(88);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FAndContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(91);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(92);
						match(T__19);
						setState(93);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FOrContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(94);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(95);
						match(T__20);
						setState(96);
						f(3);
						}
						break;
					}
					} 
				}
				setState(101);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new XQVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(VAR);
				}
				break;
			case STRINGCONSTANT:
				{
				_localctx = new XQStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(STRINGCONSTANT);
				}
				break;
			case T__0:
				{
				_localctx = new XQAbsoluteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				ap();
				}
				break;
			case T__8:
				{
				_localctx = new XQParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(T__8);
				setState(107);
				xq(0);
				setState(108);
				match(T__9);
				}
				break;
			case T__22:
				{
				_localctx = new XQConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(T__22);
				setState(111);
				match(NAME);
				setState(112);
				match(T__23);
				setState(113);
				match(T__24);
				setState(114);
				xq(0);
				setState(115);
				match(T__25);
				setState(116);
				match(T__26);
				setState(117);
				match(NAME);
				setState(118);
				match(T__23);
				}
				break;
			case T__27:
				{
				_localctx = new XQFLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				forClause();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(121);
					letClause();
					}
				}

				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(124);
					whereClause();
					}
				}

				setState(127);
				returnClause();
				}
				break;
			case T__29:
				{
				_localctx = new XQLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				letClause();
				setState(130);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new XQConcatContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(134);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(135);
						match(T__14);
						setState(136);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XQDirContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(137);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(138);
						match(T__10);
						setState(139);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XQDirRecursiveContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
						match(T__11);
						setState(142);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(147);
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
			setState(148);
			match(T__27);
			setState(149);
			match(VAR);
			setState(150);
			match(T__28);
			setState(151);
			xq(0);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(152);
				match(T__14);
				setState(153);
				match(VAR);
				setState(154);
				match(T__28);
				setState(155);
				xq(0);
				}
				}
				setState(160);
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
			setState(161);
			match(T__29);
			setState(162);
			match(VAR);
			setState(163);
			match(T__30);
			setState(164);
			xq(0);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(165);
				match(T__14);
				setState(166);
				match(VAR);
				setState(167);
				match(T__30);
				setState(168);
				xq(0);
				}
				}
				setState(173);
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
			setState(174);
			match(T__31);
			setState(175);
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
			setState(177);
			match(T__32);
			setState(178);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				xq(0);
				setState(182);
				match(T__15);
				setState(183);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				xq(0);
				setState(186);
				match(T__16);
				setState(187);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				xq(0);
				setState(190);
				match(T__17);
				setState(191);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondIdenticalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				xq(0);
				setState(194);
				match(T__18);
				setState(195);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(T__33);
				setState(198);
				xq(0);
				setState(199);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new CondSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(T__34);
				setState(202);
				match(VAR);
				setState(203);
				match(T__28);
				setState(204);
				xq(0);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(205);
					match(T__14);
					setState(206);
					match(VAR);
					setState(207);
					match(T__28);
					setState(208);
					xq(0);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__35);
				setState(215);
				cond(5);
				}
				break;
			case 7:
				{
				_localctx = new CondParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(T__8);
				setState(218);
				cond(0);
				setState(219);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__21);
				setState(222);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						match(T__19);
						setState(227);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229);
						match(T__20);
						setState(230);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(235);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4\16\4g\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5}\n\5\3\5\5\5\u0080\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0087\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0092\n\5\f\5\16\5\u0095\13\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009f\n\6\f\6\16\6\u00a2\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ac\n\7\f\7\16\7\u00af\13\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d4\n"+
		"\n\f\n\16\n\u00d7\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e2\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\3\n\2\6\4"+
		"\6\b\22\13\2\4\6\b\n\f\16\20\22\2\2\2\u0110\2\34\3\2\2\2\4*\3\2\2\2\6"+
		"[\3\2\2\2\b\u0086\3\2\2\2\n\u0096\3\2\2\2\f\u00a3\3\2\2\2\16\u00b0\3\2"+
		"\2\2\20\u00b3\3\2\2\2\22\u00e1\3\2\2\2\24\25\7\3\2\2\25\26\7)\2\2\26\27"+
		"\7\4\2\2\27\35\5\4\3\2\30\31\7\3\2\2\31\32\7)\2\2\32\33\7\5\2\2\33\35"+
		"\5\4\3\2\34\24\3\2\2\2\34\30\3\2\2\2\35\3\3\2\2\2\36\37\b\3\1\2\37+\7"+
		"(\2\2 +\7\6\2\2!+\7\7\2\2\"+\7\b\2\2#+\7\t\2\2$%\7\n\2\2%+\7(\2\2&\'\7"+
		"\13\2\2\'(\5\4\3\2()\7\f\2\2)+\3\2\2\2*\36\3\2\2\2* \3\2\2\2*!\3\2\2\2"+
		"*\"\3\2\2\2*#\3\2\2\2*$\3\2\2\2*&\3\2\2\2+<\3\2\2\2,-\f\6\2\2-.\7\r\2"+
		"\2.;\5\4\3\7/\60\f\5\2\2\60\61\7\16\2\2\61;\5\4\3\6\62\63\f\3\2\2\63\64"+
		"\7\21\2\2\64;\5\4\3\4\65\66\f\4\2\2\66\67\7\17\2\2\678\5\6\4\289\7\20"+
		"\2\29;\3\2\2\2:,\3\2\2\2:/\3\2\2\2:\62\3\2\2\2:\65\3\2\2\2;>\3\2\2\2<"+
		":\3\2\2\2<=\3\2\2\2=\5\3\2\2\2><\3\2\2\2?@\b\4\1\2@\\\5\4\3\2AB\5\4\3"+
		"\2BC\7\22\2\2CD\5\4\3\2D\\\3\2\2\2EF\5\4\3\2FG\7\23\2\2GH\5\4\3\2H\\\3"+
		"\2\2\2IJ\5\4\3\2JK\7\24\2\2KL\5\4\3\2L\\\3\2\2\2MN\5\4\3\2NO\7\25\2\2"+
		"OP\5\4\3\2P\\\3\2\2\2QR\5\4\3\2RS\7\22\2\2ST\7*\2\2T\\\3\2\2\2UV\7\13"+
		"\2\2VW\5\6\4\2WX\7\f\2\2X\\\3\2\2\2YZ\7\30\2\2Z\\\5\6\4\3[?\3\2\2\2[A"+
		"\3\2\2\2[E\3\2\2\2[I\3\2\2\2[M\3\2\2\2[Q\3\2\2\2[U\3\2\2\2[Y\3\2\2\2\\"+
		"e\3\2\2\2]^\f\5\2\2^_\7\26\2\2_d\5\6\4\6`a\f\4\2\2ab\7\27\2\2bd\5\6\4"+
		"\5c]\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2"+
		"\2\2hi\b\5\1\2i\u0087\7+\2\2j\u0087\7*\2\2k\u0087\5\2\2\2lm\7\13\2\2m"+
		"n\5\b\5\2no\7\f\2\2o\u0087\3\2\2\2pq\7\31\2\2qr\7(\2\2rs\7\32\2\2st\7"+
		"\33\2\2tu\5\b\5\2uv\7\34\2\2vw\7\35\2\2wx\7(\2\2xy\7\32\2\2y\u0087\3\2"+
		"\2\2z|\5\n\6\2{}\5\f\7\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5\16"+
		"\b\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5"+
		"\20\t\2\u0082\u0087\3\2\2\2\u0083\u0084\5\f\7\2\u0084\u0085\5\b\5\3\u0085"+
		"\u0087\3\2\2\2\u0086h\3\2\2\2\u0086j\3\2\2\2\u0086k\3\2\2\2\u0086l\3\2"+
		"\2\2\u0086p\3\2\2\2\u0086z\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u0093\3\2"+
		"\2\2\u0088\u0089\f\b\2\2\u0089\u008a\7\21\2\2\u008a\u0092\5\b\5\t\u008b"+
		"\u008c\f\7\2\2\u008c\u008d\7\r\2\2\u008d\u0092\5\4\3\2\u008e\u008f\f\6"+
		"\2\2\u008f\u0090\7\16\2\2\u0090\u0092\5\4\3\2\u0091\u0088\3\2\2\2\u0091"+
		"\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\t\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\7\36\2\2\u0097\u0098\7+\2\2\u0098\u0099\7\37\2\2\u0099\u00a0\5\b\5\2"+
		"\u009a\u009b\7\21\2\2\u009b\u009c\7+\2\2\u009c\u009d\7\37\2\2\u009d\u009f"+
		"\5\b\5\2\u009e\u009a\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\13\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7 \2\2"+
		"\u00a4\u00a5\7+\2\2\u00a5\u00a6\7!\2\2\u00a6\u00ad\5\b\5\2\u00a7\u00a8"+
		"\7\21\2\2\u00a8\u00a9\7+\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ac\5\b\5\2\u00ab"+
		"\u00a7\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\r\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2"+
		"\5\22\n\2\u00b2\17\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5\5\b\5\2\u00b5"+
		"\21\3\2\2\2\u00b6\u00b7\b\n\1\2\u00b7\u00b8\5\b\5\2\u00b8\u00b9\7\22\2"+
		"\2\u00b9\u00ba\5\b\5\2\u00ba\u00e2\3\2\2\2\u00bb\u00bc\5\b\5\2\u00bc\u00bd"+
		"\7\23\2\2\u00bd\u00be\5\b\5\2\u00be\u00e2\3\2\2\2\u00bf\u00c0\5\b\5\2"+
		"\u00c0\u00c1\7\24\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00e2\3\2\2\2\u00c3\u00c4"+
		"\5\b\5\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\5\b\5\2\u00c6\u00e2\3\2\2\2"+
		"\u00c7\u00c8\7$\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\7\f\2\2\u00ca\u00e2"+
		"\3\2\2\2\u00cb\u00cc\7%\2\2\u00cc\u00cd\7+\2\2\u00cd\u00ce\7\37\2\2\u00ce"+
		"\u00d5\5\b\5\2\u00cf\u00d0\7\21\2\2\u00d0\u00d1\7+\2\2\u00d1\u00d2\7\37"+
		"\2\2\u00d2\u00d4\5\b\5\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00d9\7&\2\2\u00d9\u00da\5\22\n\7\u00da\u00e2\3\2\2\2\u00db"+
		"\u00dc\7\13\2\2\u00dc\u00dd\5\22\n\2\u00dd\u00de\7\f\2\2\u00de\u00e2\3"+
		"\2\2\2\u00df\u00e0\7\30\2\2\u00e0\u00e2\5\22\n\3\u00e1\u00b6\3\2\2\2\u00e1"+
		"\u00bb\3\2\2\2\u00e1\u00bf\3\2\2\2\u00e1\u00c3\3\2\2\2\u00e1\u00c7\3\2"+
		"\2\2\u00e1\u00cb\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00eb\3\2\2\2\u00e3\u00e4\f\5\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00ea\5"+
		"\22\n\6\u00e6\u00e7\f\4\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00ea\5\22\n\5"+
		"\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\23\3\2\2\2\u00ed\u00eb\3\2\2\2\24\34"+
		"*:<[ce|\177\u0086\u0091\u0093\u00a0\u00ad\u00d5\u00e1\u00e9\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}