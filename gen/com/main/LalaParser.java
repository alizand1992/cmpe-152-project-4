// Generated from /Users/ali/Documents/cmpe-152-project-4/Lala.g4 by ANTLR 4.7.2
package com.main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LalaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, IF=4, WHILE=5, ELSE=6, BREAK=7, FOR=8, DO=9, AND=10, 
		PRINT=11, REAL=12, NUM=13, TRUE=14, FALSE=15, LT=16, LTE=17, GTE=18, GT=19, 
		PLUS=20, MINUS=21, MUL=22, DIV=23, SEMI=24, EQUAL=25, NOT=26, OR=27, OB=28, 
		CB=29, WS=30, OFB=31, CFB=32, ID=33;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_decls = 2, RULE_decl = 3, RULE_type = 4, 
		RULE_stmts = 5, RULE_stmt = 6, RULE_assign = 7, RULE_allexpr = 8, RULE_andexpr = 9, 
		RULE_equal = 10, RULE_rel = 11, RULE_expr = 12, RULE_term = 13, RULE_incdecexpr = 14, 
		RULE_factor = 15, RULE_print = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "decls", "decl", "type", "stmts", "stmt", "assign", 
			"allexpr", "andexpr", "equal", "rel", "expr", "term", "incdecexpr", "factor", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'bool'", "'if'", "'while'", "'else'", "'break'", 
			"'for'", "'do'", "'&&'", "'print'", null, null, null, null, "'<'", "'<='", 
			"'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "';'", "'='", "'!'", "'||'", 
			"'('", "')'", null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOL", "IF", "WHILE", "ELSE", "BREAK", "FOR", 
			"DO", "AND", "PRINT", "REAL", "NUM", "TRUE", "FALSE", "LT", "LTE", "GTE", 
			"GT", "PLUS", "MINUS", "MUL", "DIV", "SEMI", "EQUAL", "NOT", "OR", "OB", 
			"CB", "WS", "OFB", "CFB", "ID"
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
	public String getGrammarFileName() { return "Lala.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LalaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OFB() { return getToken(LalaParser.OFB, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode CFB() { return getToken(LalaParser.CFB, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(OFB);
			setState(37);
			decls(0);
			setState(38);
			stmts(0);
			setState(39);
			match(CFB);
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

	public static class DeclsContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		return decls(0);
	}

	private DeclsContext decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclsContext _localctx = new DeclsContext(_ctx, _parentState);
		DeclsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decls);
					setState(42);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(43);
					decl();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LalaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(LalaParser.SEMI, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			type();
			setState(50);
			match(ID);
			setState(51);
			match(SEMI);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LalaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LalaParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		return stmts(0);
	}

	private StmtsContext stmts(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtsContext _localctx = new StmtsContext(_ctx, _parentState);
		StmtsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_stmts, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmts);
					setState(56);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(57);
					stmt();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LalaParser.IF, 0); }
		public TerminalNode OB() { return getToken(LalaParser.OB, 0); }
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public TerminalNode CB() { return getToken(LalaParser.CB, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LalaParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(LalaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(LalaParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(LalaParser.SEMI, 0); }
		public TerminalNode FOR() { return getToken(LalaParser.FOR, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IncdecexprContext incdecexpr() {
			return getRuleContext(IncdecexprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(LalaParser.BREAK, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(IF);
				setState(64);
				match(OB);
				setState(65);
				allexpr(0);
				setState(66);
				match(CB);
				setState(67);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(IF);
				setState(70);
				match(OB);
				setState(71);
				allexpr(0);
				setState(72);
				match(CB);
				setState(73);
				stmt();
				setState(74);
				match(ELSE);
				setState(75);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(WHILE);
				setState(78);
				match(OB);
				setState(79);
				allexpr(0);
				setState(80);
				match(CB);
				setState(81);
				stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(DO);
				setState(84);
				stmt();
				setState(85);
				match(WHILE);
				setState(86);
				match(OB);
				setState(87);
				allexpr(0);
				setState(88);
				match(CB);
				setState(89);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(FOR);
				setState(92);
				match(OB);
				setState(93);
				assign();
				setState(94);
				allexpr(0);
				setState(95);
				match(SEMI);
				setState(96);
				incdecexpr();
				setState(97);
				match(CB);
				setState(98);
				stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(BREAK);
				setState(101);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				assign();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				print();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LalaParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(LalaParser.EQUAL, 0); }
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LalaParser.SEMI, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(EQUAL);
			setState(109);
			allexpr(0);
			setState(110);
			match(SEMI);
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

	public static class AllexprContext extends ParserRuleContext {
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public TerminalNode OR() { return getToken(LalaParser.OR, 0); }
		public AllexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterAllexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitAllexpr(this);
		}
	}

	public final AllexprContext allexpr() throws RecognitionException {
		return allexpr(0);
	}

	private AllexprContext allexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AllexprContext _localctx = new AllexprContext(_ctx, _parentState);
		AllexprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_allexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			andexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AllexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_allexpr);
					setState(115);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(116);
					match(OR);
					setState(117);
					andexpr(0);
					}
					} 
				}
				setState(122);
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

	public static class AndexprContext extends ParserRuleContext {
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public TerminalNode AND() { return getToken(LalaParser.AND, 0); }
		public AndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterAndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitAndexpr(this);
		}
	}

	public final AndexprContext andexpr() throws RecognitionException {
		return andexpr(0);
	}

	private AndexprContext andexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexprContext _localctx = new AndexprContext(_ctx, _parentState);
		AndexprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_andexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(124);
			equal(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpr);
					setState(126);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(127);
					match(AND);
					setState(128);
					equal(0);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class EqualContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public List<TerminalNode> EQUAL() { return getTokens(LalaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(LalaParser.EQUAL, i);
		}
		public TerminalNode NOT() { return getToken(LalaParser.NOT, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		return equal(0);
	}

	private EqualContext equal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualContext _localctx = new EqualContext(_ctx, _parentState);
		EqualContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_equal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new EqualContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equal);
						setState(137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(138);
						match(EQUAL);
						setState(139);
						match(EQUAL);
						setState(140);
						rel();
						}
						break;
					case 2:
						{
						_localctx = new EqualContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equal);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142);
						match(NOT);
						setState(143);
						match(EQUAL);
						setState(144);
						rel();
						}
						break;
					}
					} 
				}
				setState(149);
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

	public static class RelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(LalaParser.LT, 0); }
		public TerminalNode GTE() { return getToken(LalaParser.GTE, 0); }
		public TerminalNode GT() { return getToken(LalaParser.GT, 0); }
		public TerminalNode LTE() { return getToken(LalaParser.LTE, 0); }
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rel);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				expr(0);
				setState(151);
				match(LT);
				setState(152);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expr(0);
				setState(155);
				match(GTE);
				setState(156);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				expr(0);
				setState(159);
				match(GT);
				setState(160);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				expr(0);
				setState(163);
				match(LTE);
				setState(164);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LalaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LalaParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(173);
						match(PLUS);
						setState(174);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(MINUS);
						setState(177);
						term(0);
						}
						break;
					}
					} 
				}
				setState(182);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MUL() { return getToken(LalaParser.MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LalaParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(184);
				factor();
				setState(185);
				match(MUL);
				setState(186);
				term(2);
				}
				break;
			case 2:
				{
				setState(188);
				factor();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(MUL);
						setState(193);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						match(DIV);
						setState(196);
						factor();
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class IncdecexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LalaParser.ID, 0); }
		public List<TerminalNode> PLUS() { return getTokens(LalaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LalaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LalaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LalaParser.MINUS, i);
		}
		public IncdecexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdecexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterIncdecexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitIncdecexpr(this);
		}
	}

	public final IncdecexprContext incdecexpr() throws RecognitionException {
		IncdecexprContext _localctx = new IncdecexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_incdecexpr);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ID);
				setState(203);
				match(PLUS);
				setState(204);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(ID);
				setState(206);
				match(MINUS);
				setState(207);
				match(MINUS);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(LalaParser.OB, 0); }
		public AllexprContext allexpr() {
			return getRuleContext(AllexprContext.class,0);
		}
		public TerminalNode CB() { return getToken(LalaParser.CB, 0); }
		public IncdecexprContext incdecexpr() {
			return getRuleContext(IncdecexprContext.class,0);
		}
		public TerminalNode ID() { return getToken(LalaParser.ID, 0); }
		public TerminalNode NUM() { return getToken(LalaParser.NUM, 0); }
		public TerminalNode REAL() { return getToken(LalaParser.REAL, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(OB);
				setState(211);
				allexpr(0);
				setState(212);
				match(CB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				incdecexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				match(REAL);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LalaParser.PRINT, 0); }
		public TerminalNode REAL() { return getToken(LalaParser.REAL, 0); }
		public TerminalNode SEMI() { return getToken(LalaParser.SEMI, 0); }
		public TerminalNode NUM() { return getToken(LalaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(LalaParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(PRINT);
				setState(221);
				match(REAL);
				setState(222);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(PRINT);
				setState(224);
				match(NUM);
				setState(225);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(PRINT);
				setState(227);
				match(ID);
				setState(228);
				match(SEMI);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return decls_sempred((DeclsContext)_localctx, predIndex);
		case 5:
			return stmts_sempred((StmtsContext)_localctx, predIndex);
		case 8:
			return allexpr_sempred((AllexprContext)_localctx, predIndex);
		case 9:
			return andexpr_sempred((AndexprContext)_localctx, predIndex);
		case 10:
			return equal_sempred((EqualContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean decls_sempred(DeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stmts_sempred(StmtsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean allexpr_sempred(AllexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andexpr_sempred(AndexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equal_sempred(EqualContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\ny\n\n\f\n\16\n|\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0084\n\13\f"+
		"\13\16\13\u0087\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u0094\n\f\f\f\16\f\u0097\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00aa\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00b5\n\16\f\16\16\16\u00b8\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00c8\n\17\f\17\16\17\u00cb\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00d3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dd\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e8\n\22\3\22\2\t\6"+
		"\f\22\24\26\32\34\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2"+
		"\3\4\2\u00f6\2$\3\2\2\2\4&\3\2\2\2\6+\3\2\2\2\b\63\3\2\2\2\n\67\3\2\2"+
		"\2\f9\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22r\3\2\2\2\24}\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u00a9\3\2\2\2\32\u00ab\3\2\2\2\34\u00bf\3\2\2\2\36\u00d2\3"+
		"\2\2\2 \u00dc\3\2\2\2\"\u00e7\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&\'\7!\2\2\'"+
		"(\5\6\4\2()\5\f\7\2)*\7\"\2\2*\5\3\2\2\2+\60\b\4\1\2,-\f\3\2\2-/\5\b\5"+
		"\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\7\3\2\2\2\62\60"+
		"\3\2\2\2\63\64\5\n\6\2\64\65\7#\2\2\65\66\7\32\2\2\66\t\3\2\2\2\678\t"+
		"\2\2\28\13\3\2\2\29>\b\7\1\2:;\f\3\2\2;=\5\16\b\2<:\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\r\3\2\2\2@>\3\2\2\2AB\7\6\2\2BC\7\36\2\2CD\5\22"+
		"\n\2DE\7\37\2\2EF\5\16\b\2Fl\3\2\2\2GH\7\6\2\2HI\7\36\2\2IJ\5\22\n\2J"+
		"K\7\37\2\2KL\5\16\b\2LM\7\b\2\2MN\5\16\b\2Nl\3\2\2\2OP\7\7\2\2PQ\7\36"+
		"\2\2QR\5\22\n\2RS\7\37\2\2ST\5\16\b\2Tl\3\2\2\2UV\7\13\2\2VW\5\16\b\2"+
		"WX\7\7\2\2XY\7\36\2\2YZ\5\22\n\2Z[\7\37\2\2[\\\7\32\2\2\\l\3\2\2\2]^\7"+
		"\n\2\2^_\7\36\2\2_`\5\20\t\2`a\5\22\n\2ab\7\32\2\2bc\5\36\20\2cd\7\37"+
		"\2\2de\5\16\b\2el\3\2\2\2fg\7\t\2\2gl\7\32\2\2hl\5\4\3\2il\5\20\t\2jl"+
		"\5\"\22\2kA\3\2\2\2kG\3\2\2\2kO\3\2\2\2kU\3\2\2\2k]\3\2\2\2kf\3\2\2\2"+
		"kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\17\3\2\2\2mn\7#\2\2no\7\33\2\2op\5\22"+
		"\n\2pq\7\32\2\2q\21\3\2\2\2rs\b\n\1\2st\5\24\13\2tz\3\2\2\2uv\f\4\2\2"+
		"vw\7\35\2\2wy\5\24\13\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\23\3"+
		"\2\2\2|z\3\2\2\2}~\b\13\1\2~\177\5\26\f\2\177\u0085\3\2\2\2\u0080\u0081"+
		"\f\4\2\2\u0081\u0082\7\f\2\2\u0082\u0084\5\26\f\2\u0083\u0080\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\f\1\2\u0089\u008a\5\30\r\2"+
		"\u008a\u0095\3\2\2\2\u008b\u008c\f\5\2\2\u008c\u008d\7\33\2\2\u008d\u008e"+
		"\7\33\2\2\u008e\u0094\5\30\r\2\u008f\u0090\f\4\2\2\u0090\u0091\7\34\2"+
		"\2\u0091\u0092\7\33\2\2\u0092\u0094\5\30\r\2\u0093\u008b\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\27\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\32\16\2\u0099"+
		"\u009a\7\22\2\2\u009a\u009b\5\32\16\2\u009b\u00aa\3\2\2\2\u009c\u009d"+
		"\5\32\16\2\u009d\u009e\7\24\2\2\u009e\u009f\5\32\16\2\u009f\u00aa\3\2"+
		"\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\25\2\2\u00a2\u00a3\5\32\16\2"+
		"\u00a3\u00aa\3\2\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6\7\23\2\2\u00a6"+
		"\u00a7\5\32\16\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\5\32\16\2\u00a9\u0098"+
		"\3\2\2\2\u00a9\u009c\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\b\16\1\2\u00ac\u00ad\5\34"+
		"\17\2\u00ad\u00b6\3\2\2\2\u00ae\u00af\f\5\2\2\u00af\u00b0\7\26\2\2\u00b0"+
		"\u00b5\5\34\17\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3\7\27\2\2\u00b3\u00b5"+
		"\5\34\17\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\b\17\1\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\30\2\2"+
		"\u00bc\u00bd\5\34\17\4\u00bd\u00c0\3\2\2\2\u00be\u00c0\5 \21\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c9\3\2\2\2\u00c1\u00c2\f\6\2\2\u00c2"+
		"\u00c3\7\30\2\2\u00c3\u00c8\5 \21\2\u00c4\u00c5\f\5\2\2\u00c5\u00c6\7"+
		"\31\2\2\u00c6\u00c8\5 \21\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\35\3\2\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00d3"+
		"\7\26\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\7\27\2\2\u00d1\u00d3\7\27\2\2"+
		"\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5"+
		"\7\36\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\7\37\2\2\u00d7\u00dd\3\2\2"+
		"\2\u00d8\u00dd\5\36\20\2\u00d9\u00dd\7#\2\2\u00da\u00dd\7\17\2\2\u00db"+
		"\u00dd\7\16\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df"+
		"\7\r\2\2\u00df\u00e0\7\16\2\2\u00e0\u00e8\7\32\2\2\u00e1\u00e2\7\r\2\2"+
		"\u00e2\u00e3\7\17\2\2\u00e3\u00e8\7\32\2\2\u00e4\u00e5\7\r\2\2\u00e5\u00e6"+
		"\7#\2\2\u00e6\u00e8\7\32\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e8#\3\2\2\2\22\60>kz\u0085\u0093\u0095\u00a9\u00b4\u00b6"+
		"\u00bf\u00c7\u00c9\u00d2\u00dc\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}