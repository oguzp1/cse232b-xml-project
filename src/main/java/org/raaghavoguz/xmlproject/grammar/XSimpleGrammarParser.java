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
		T__17=18, T__18=19, T__19=20, WS=21, NAME=22, FILENAME=23, STRINGCONSTANT=24, 
		VAR=25;
	public static final int
		RULE_xq = 0, RULE_forClause = 1, RULE_whereClause = 2, RULE_returnClause = 3, 
		RULE_path = 4, RULE_pathname = 5, RULE_sep = 6, RULE_ret = 7, RULE_cond = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "forClause", "whereClause", "returnClause", "path", "pathname", 
			"sep", "ret", "cond"
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
			setState(18);
			forClause();
			setState(19);
			whereClause();
			setState(20);
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
			setState(22);
			match(T__0);
			setState(23);
			match(VAR);
			setState(24);
			match(T__1);
			setState(25);
			path();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(26);
				match(T__2);
				setState(27);
				match(VAR);
				setState(28);
				match(T__1);
				setState(29);
				path();
				}
				}
				setState(34);
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
			setState(35);
			match(T__3);
			setState(36);
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
			setState(38);
			match(T__4);
			setState(39);
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
		public List<PathnameContext> pathname() {
			return getRuleContexts(PathnameContext.class);
		}
		public PathnameContext pathname(int i) {
			return getRuleContext(PathnameContext.class,i);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(41);
					match(T__5);
					setState(42);
					match(T__6);
					setState(43);
					match(T__7);
					setState(44);
					match(FILENAME);
					setState(45);
					match(T__7);
					setState(46);
					match(T__8);
					}
					break;
				case VAR:
					{
					setState(47);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
						sep();
						setState(51);
						pathname();
						}
						} 
					}
					setState(57);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(58);
				sep();
				setState(59);
				pathname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(61);
					match(T__5);
					setState(62);
					match(T__6);
					setState(63);
					match(T__7);
					setState(64);
					match(FILENAME);
					setState(65);
					match(T__7);
					setState(66);
					match(T__8);
					}
					break;
				case VAR:
					{
					setState(67);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						sep();
						setState(71);
						pathname();
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(78);
				sep();
				setState(79);
				match(T__9);
				setState(80);
				match(T__6);
				setState(81);
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

	public static class PathnameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XSimpleGrammarParser.NAME, 0); }
		public PathnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).enterPathname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XSimpleGrammarListener ) ((XSimpleGrammarListener)listener).exitPathname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XSimpleGrammarVisitor ) return ((XSimpleGrammarVisitor<? extends T>)visitor).visitPathname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathnameContext pathname() throws RecognitionException {
		PathnameContext _localctx = new PathnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pathname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==NAME) ) {
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
		enterRule(_localctx, 12, RULE_sep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_ret, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(90);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(91);
				match(T__13);
				setState(92);
				match(NAME);
				setState(93);
				match(T__14);
				setState(94);
				match(T__15);
				setState(95);
				ret(0);
				setState(96);
				match(T__16);
				setState(97);
				match(T__13);
				setState(98);
				match(T__11);
				setState(99);
				match(NAME);
				setState(100);
				match(T__14);
				}
				break;
			case 3:
				{
				setState(102);
				path();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
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
					setState(105);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(106);
					match(T__2);
					setState(107);
					ret(4);
					}
					} 
				}
				setState(112);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==STRINGCONSTANT || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				match(T__17);
				setState(116);
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
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==STRINGCONSTANT || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(T__18);
				setState(119);
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
			setState(127);
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
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(123);
					match(T__19);
					setState(124);
					cond(2);
					}
					} 
				}
				setState(129);
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
		case 7:
			return ret_sempred((RetContext)_localctx, predIndex);
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\6\3\6\3"+
		"\6\7\68\n\6\f\6\16\6;\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"G\n\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tj\n\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n{\n\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\n\2\4"+
		"\20\22\13\2\4\6\b\n\f\16\20\22\2\5\4\2\r\r\30\30\3\2\16\17\3\2\32\33\2"+
		"\u0086\2\24\3\2\2\2\4\30\3\2\2\2\6%\3\2\2\2\b(\3\2\2\2\nU\3\2\2\2\fW\3"+
		"\2\2\2\16Y\3\2\2\2\20i\3\2\2\2\22z\3\2\2\2\24\25\5\4\3\2\25\26\5\6\4\2"+
		"\26\27\5\b\5\2\27\3\3\2\2\2\30\31\7\3\2\2\31\32\7\33\2\2\32\33\7\4\2\2"+
		"\33\"\5\n\6\2\34\35\7\5\2\2\35\36\7\33\2\2\36\37\7\4\2\2\37!\5\n\6\2 "+
		"\34\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$\"\3\2\2\2%&\7"+
		"\6\2\2&\'\5\22\n\2\'\7\3\2\2\2()\7\7\2\2)*\5\20\t\2*\t\3\2\2\2+,\7\b\2"+
		"\2,-\7\t\2\2-.\7\n\2\2./\7\31\2\2/\60\7\n\2\2\60\63\7\13\2\2\61\63\7\33"+
		"\2\2\62+\3\2\2\2\62\61\3\2\2\2\639\3\2\2\2\64\65\5\16\b\2\65\66\5\f\7"+
		"\2\668\3\2\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2"+
		";9\3\2\2\2<=\5\16\b\2=>\5\f\7\2>V\3\2\2\2?@\7\b\2\2@A\7\t\2\2AB\7\n\2"+
		"\2BC\7\31\2\2CD\7\n\2\2DG\7\13\2\2EG\7\33\2\2F?\3\2\2\2FE\3\2\2\2GM\3"+
		"\2\2\2HI\5\16\b\2IJ\5\f\7\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN"+
		"\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\5\16\b\2QR\7\f\2\2RS\7\t\2\2ST\7\13\2\2"+
		"TV\3\2\2\2U\62\3\2\2\2UF\3\2\2\2V\13\3\2\2\2WX\t\2\2\2X\r\3\2\2\2YZ\t"+
		"\3\2\2Z\17\3\2\2\2[\\\b\t\1\2\\j\7\33\2\2]^\7\20\2\2^_\7\30\2\2_`\7\21"+
		"\2\2`a\7\22\2\2ab\5\20\t\2bc\7\23\2\2cd\7\20\2\2de\7\16\2\2ef\7\30\2\2"+
		"fg\7\21\2\2gj\3\2\2\2hj\5\n\6\2i[\3\2\2\2i]\3\2\2\2ih\3\2\2\2jp\3\2\2"+
		"\2kl\f\5\2\2lm\7\5\2\2mo\5\20\t\6nk\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2"+
		"\2\2q\21\3\2\2\2rp\3\2\2\2st\b\n\1\2tu\t\4\2\2uv\7\24\2\2v{\t\4\2\2wx"+
		"\t\4\2\2xy\7\25\2\2y{\t\4\2\2zs\3\2\2\2zw\3\2\2\2{\u0081\3\2\2\2|}\f\3"+
		"\2\2}~\7\26\2\2~\u0080\5\22\n\4\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\f\"\629FMUipz\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}