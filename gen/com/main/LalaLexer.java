// Generated from /home/ali/Documents/cmpe-152-project-4/Lala.g4 by ANTLR 4.7.2
package com.main;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LalaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, IF=4, WHILE=5, ELSE=6, BREAK=7, FOR=8, DO=9, AND=10, 
		PRINT=11, REAL=12, NUM=13, TRUE=14, FALSE=15, LT=16, LTE=17, GTE=18, GT=19, 
		PLUS=20, MINUS=21, MUL=22, DIV=23, SEMI=24, EQUAL=25, NOT=26, OR=27, OB=28, 
		CB=29, WS=30, OFB=31, CFB=32, ID=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOL", "IF", "WHILE", "ELSE", "BREAK", "FOR", "DO", 
			"AND", "PRINT", "REAL", "NUM", "TRUE", "FALSE", "LT", "LTE", "GTE", "GT", 
			"PLUS", "MINUS", "MUL", "DIV", "SEMI", "EQUAL", "NOT", "OR", "OB", "CB", 
			"WS", "OFB", "CFB", "ID"
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


	public LalaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lala.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\6\rz\n\r\r\r\16\r{\3\r\3\r\7\r\u0080\n\r\f\r\16\r\u0083"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\7\16\u008a\n\16\f\16\16\16\u008d\13\16\5"+
		"\16\u008f\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u009e\n\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00c0\n\37\r\37"+
		"\16\37\u00c1\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00cb\n\"\r\"\16\"\u00cc\2"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#\3\2\7\3\2\62;\3\2\63;\3\2\62\62\5\2\13\f\17\17\"\"\4\2C"+
		"\\c|\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2"+
		"\2\5I\3\2\2\2\7O\3\2\2\2\tT\3\2\2\2\13W\3\2\2\2\r]\3\2\2\2\17b\3\2\2\2"+
		"\21h\3\2\2\2\23l\3\2\2\2\25o\3\2\2\2\27r\3\2\2\2\31y\3\2\2\2\33\u008e"+
		"\3\2\2\2\35\u0095\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2"+
		"\2%\u00a4\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ab\3\2\2\2-\u00ad"+
		"\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2"+
		"\2\2\67\u00b7\3\2\2\29\u00ba\3\2\2\2;\u00bc\3\2\2\2=\u00bf\3\2\2\2?\u00c5"+
		"\3\2\2\2A\u00c7\3\2\2\2C\u00ca\3\2\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\4\3"+
		"\2\2\2IJ\7h\2\2JK\7n\2\2KL\7q\2\2LM\7c\2\2MN\7v\2\2N\6\3\2\2\2OP\7d\2"+
		"\2PQ\7q\2\2QR\7q\2\2RS\7n\2\2S\b\3\2\2\2TU\7k\2\2UV\7h\2\2V\n\3\2\2\2"+
		"WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7g\2\2\\\f\3\2\2\2]^\7g\2\2^_"+
		"\7n\2\2_`\7u\2\2`a\7g\2\2a\16\3\2\2\2bc\7d\2\2cd\7t\2\2de\7g\2\2ef\7c"+
		"\2\2fg\7m\2\2g\20\3\2\2\2hi\7h\2\2ij\7q\2\2jk\7t\2\2k\22\3\2\2\2lm\7f"+
		"\2\2mn\7q\2\2n\24\3\2\2\2op\7(\2\2pq\7(\2\2q\26\3\2\2\2rs\7r\2\2st\7t"+
		"\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2w\30\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\13\2\2\2~\u0080\t\2\2\2\177"+
		"~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\t\3\2\2\u0085\32\3\2\2"+
		"\2\u0086\u008f\t\4\2\2\u0087\u008b\t\3\2\2\u0088\u008a\t\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0087\3\2"+
		"\2\2\u008f\34\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093"+
		"\7w\2\2\u0093\u0096\7g\2\2\u0094\u0096\7\63\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\36\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7c\2\2"+
		"\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009e\7g\2\2\u009c\u009e"+
		"\7\62\2\2\u009d\u0097\3\2\2\2\u009d\u009c\3\2\2\2\u009e \3\2\2\2\u009f"+
		"\u00a0\7>\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7?\2\2\u00a3"+
		"$\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a6\7?\2\2\u00a6&\3\2\2\2\u00a7\u00a8"+
		"\7@\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7"+
		"/\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae.\3\2\2\2\u00af\u00b0\7\61"+
		"\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\62\3\2\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\66\3\2\2\2\u00b7\u00b8"+
		"\7~\2\2\u00b8\u00b9\7~\2\2\u00b98\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb:\3"+
		"\2\2\2\u00bc\u00bd\7+\2\2\u00bd<\3\2\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\37\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7}\2\2"+
		"\u00c6@\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c8B\3\2\2\2\u00c9\u00cb\t\6\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cdD\3\2\2\2\13\2{\u0081\u008b\u008e\u0095\u009d\u00c1\u00cc"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}