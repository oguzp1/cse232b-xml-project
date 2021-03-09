// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XSimpleGrammar.g4 by ANTLR 4.9.1
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
public class XSimpleGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WS=20, NAME=21, FILENAME=22, STRINGCONSTANT=23, VAR=24;
	public static final int
		RULE_xq = 0, RULE_forClause = 1, RULE_whereClause = 2, RULE_returnClause = 3, 
		RULE_path = 4, RULE_sep = 5, RULE_ret = 6, RULE_cond = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "forClause", "whereClause", "returnClause", "path", "sep", "ret", 
			"cond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'in'", "','", "'where'", "'return'", "'doc'", "'('", 
			"'\"'", "')'", "'text'", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", "'eq'", 
			"'='", "'and'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "NAME", "FILENAME", 
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

	@Override
	public String getGrammarFileName() { return "XSimpleGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XSimpleGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class XqContext extends ParserRuleContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		XqContext _localctx = new XqContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			forClause();
			setState(17);
			whereClause();
			setState(18);
			returnClause();
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

	public static class ForClauseContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(XSimpleGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XSimpleGrammarParser.VAR, i);
		}
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(VAR);
			setState(22);
			match(T__1);
			setState(23);
			path();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(24);
				match(T__2);
				setState(25);
				match(VAR);
				setState(26);
				match(T__1);
				setState(27);
				path();
				}
				}
				setState(32);
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
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__3);
			setState(34);
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
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__4);
			setState(37);
			ret(0);
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

	public static class PathContext extends ParserRuleContext {
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(XSimpleGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XSimpleGrammarParser.NAME, i);
		}
		public TerminalNode FILENAME() { return getToken(XSimpleGrammarParser.FILENAME, 0); }
		public TerminalNode VAR() { return getToken(XSimpleGrammarParser.VAR, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		try {
			int _alt;
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(39);
					match(T__5);
					setState(40);
					match(T__6);
					setState(41);
					match(T__7);
					setState(42);
					match(FILENAME);
					setState(43);
					match(T__7);
					setState(44);
					match(T__8);
					}
					break;
				case VAR:
					{
					setState(45);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(48);
						sep();
						setState(49);
						match(NAME);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(56);
				sep();
				setState(57);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(59);
					match(T__5);
					setState(60);
					match(T__6);
					setState(61);
					match(T__7);
					setState(62);
					match(FILENAME);
					setState(63);
					match(T__7);
					setState(64);
					match(T__8);
					}
					break;
				case VAR:
					{
					setState(65);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(68);
						sep();
						setState(69);
						match(NAME);
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(76);
				sep();
				setState(77);
				match(T__9);
				setState(78);
				match(T__6);
				setState(79);
				match(T__8);
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

	public static class SepContext extends ParserRuleContext {
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(XSimpleGrammarParser.VAR, 0); }
		public List<TerminalNode> NAME() { return getTokens(XSimpleGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XSimpleGrammarParser.NAME, i);
		}
		public List<RetContext> ret() {
			return getRuleContexts(RetContext.class);
		}
		public RetContext ret(int i) {
			return getRuleContext(RetContext.class,i);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		return ret(0);
	}

	private RetContext ret(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RetContext _localctx = new RetContext(_ctx, _parentState);
		RetContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_ret, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(86);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(87);
				match(T__12);
				setState(88);
				match(NAME);
				setState(89);
				match(T__13);
				setState(90);
				match(T__14);
				setState(91);
				ret(0);
				setState(92);
				match(T__15);
				setState(93);
				match(T__12);
				setState(94);
				match(T__10);
				setState(95);
				match(NAME);
				setState(96);
				match(T__13);
				}
				break;
			case 3:
				{
				setState(98);
				path();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RetContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ret);
					setState(101);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(102);
					match(T__2);
					setState(103);
					ret(4);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public List<TerminalNode> VAR() { return getTokens(XSimpleGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XSimpleGrammarParser.VAR, i);
		}
		public List<TerminalNode> STRINGCONSTANT() { return getTokens(XSimpleGrammarParser.STRINGCONSTANT); }
		public TerminalNode STRINGCONSTANT(int i) {
			return getToken(XSimpleGrammarParser.STRINGCONSTANT, i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitCond(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==STRINGCONSTANT || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111);
				match(T__16);
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==STRINGCONSTANT || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==STRINGCONSTANT || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				match(T__17);
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==STRINGCONSTANT || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(118);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(119);
					match(T__18);
					setState(120);
					cond(2);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		case 6:
			return ret_sempred((RetContext)_localctx, predIndex);
		case 7:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ret_sempred(RetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\61\n\6\3\6\3\6\3\6\7"+
		"\6\66\n\6\f\6\16\69\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6E"+
		"\n\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\6\3\6\3\6\5\6T\n\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf"+
		"\n\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tw\n\t\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\t\2\4\16\20\n\2\4\6\b"+
		"\n\f\16\20\2\4\3\2\r\16\3\2\31\32\2\u0083\2\22\3\2\2\2\4\26\3\2\2\2\6"+
		"#\3\2\2\2\b&\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16e\3\2\2\2\20v\3\2\2\2\22"+
		"\23\5\4\3\2\23\24\5\6\4\2\24\25\5\b\5\2\25\3\3\2\2\2\26\27\7\3\2\2\27"+
		"\30\7\32\2\2\30\31\7\4\2\2\31 \5\n\6\2\32\33\7\5\2\2\33\34\7\32\2\2\34"+
		"\35\7\4\2\2\35\37\5\n\6\2\36\32\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!\5\3\2\2\2\" \3\2\2\2#$\7\6\2\2$%\5\20\t\2%\7\3\2\2\2&\'\7\7\2\2"+
		"\'(\5\16\b\2(\t\3\2\2\2)*\7\b\2\2*+\7\t\2\2+,\7\n\2\2,-\7\30\2\2-.\7\n"+
		"\2\2.\61\7\13\2\2/\61\7\32\2\2\60)\3\2\2\2\60/\3\2\2\2\61\67\3\2\2\2\62"+
		"\63\5\f\7\2\63\64\7\27\2\2\64\66\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\f\7\2;<\7\27\2\2<T\3"+
		"\2\2\2=>\7\b\2\2>?\7\t\2\2?@\7\n\2\2@A\7\30\2\2AB\7\n\2\2BE\7\13\2\2C"+
		"E\7\32\2\2D=\3\2\2\2DC\3\2\2\2EK\3\2\2\2FG\5\f\7\2GH\7\27\2\2HJ\3\2\2"+
		"\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\5\f\7"+
		"\2OP\7\f\2\2PQ\7\t\2\2QR\7\13\2\2RT\3\2\2\2S\60\3\2\2\2SD\3\2\2\2T\13"+
		"\3\2\2\2UV\t\2\2\2V\r\3\2\2\2WX\b\b\1\2Xf\7\32\2\2YZ\7\17\2\2Z[\7\27\2"+
		"\2[\\\7\20\2\2\\]\7\21\2\2]^\5\16\b\2^_\7\22\2\2_`\7\17\2\2`a\7\r\2\2"+
		"ab\7\27\2\2bc\7\20\2\2cf\3\2\2\2df\5\n\6\2eW\3\2\2\2eY\3\2\2\2ed\3\2\2"+
		"\2fl\3\2\2\2gh\f\5\2\2hi\7\5\2\2ik\5\16\b\6jg\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2m\17\3\2\2\2nl\3\2\2\2op\b\t\1\2pq\t\3\2\2qr\7\23\2\2rw"+
		"\t\3\2\2st\t\3\2\2tu\7\24\2\2uw\t\3\2\2vo\3\2\2\2vs\3\2\2\2w}\3\2\2\2"+
		"xy\f\3\2\2yz\7\25\2\2z|\5\20\t\4{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\21\3\2\2\2\177}\3\2\2\2\f \60\67DKSelv}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}