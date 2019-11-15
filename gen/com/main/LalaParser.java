// Generated from /Users/ali/Documents/cmpe-152-project-4/Lala.g4 by ANTLR 4.7.2
package com.main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LalaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, INT=2, EQ=3, OFB=4, CFB=5, SEMI=6, PLUS=7, NUM=8, ID=9;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_addexpr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "addexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'='", "'{'", "'}'", "';'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "EQ", "OFB", "CFB", "SEMI", "PLUS", "NUM", "ID"
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
			setState(6);
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
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
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
			setState(8);
			match(OFB);
			setState(9);
			addexpr();
			setState(10);
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

	public static class AddexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LalaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LalaParser.EQ, 0); }
		public List<TerminalNode> NUM() { return getTokens(LalaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(LalaParser.NUM, i);
		}
		public TerminalNode PLUS() { return getToken(LalaParser.PLUS, 0); }
		public TerminalNode SEMI() { return getToken(LalaParser.SEMI, 0); }
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LalaListener ) ((LalaListener)listener).exitAddexpr(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(ID);
			setState(13);
			match(EQ);
			setState(14);
			match(NUM);
			setState(15);
			match(NUM);
			setState(16);
			match(PLUS);
			setState(17);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\26\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2"+
		"\2\5\2\4\6\2\2\2\22\2\b\3\2\2\2\4\n\3\2\2\2\6\16\3\2\2\2\b\t\5\4\3\2\t"+
		"\3\3\2\2\2\n\13\7\6\2\2\13\f\5\6\4\2\f\r\7\7\2\2\r\5\3\2\2\2\16\17\7\13"+
		"\2\2\17\20\7\5\2\2\20\21\7\n\2\2\21\22\7\n\2\2\22\23\7\t\2\2\23\24\7\b"+
		"\2\2\24\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
