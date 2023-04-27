// Generated from /home/elaine/Documents/git/compilers/compiler/cp2/PascalLexer.g by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, PROGRAM=3, CONST=4, VAR=5, BEGIN=6, END=7, FUNCTION=8, 
		PROCEDURE=9, INTEGER=10, REAL=11, BOOLEAN=12, STRING=13, CHAR=14, ARRAY=15, 
		RANGE=16, OF=17, IF=18, THEN=19, ELSE=20, WHILE=21, DO=22, AND=23, OR=24, 
		NOT=25, PLUS=26, MINUS=27, ASTERISK=28, SLASH=29, EQUAL=30, LESSTHAN=31, 
		GREATERTHAN=32, LBRACK=33, RBRACK=34, PERIOD=35, COMMA=36, COLON=37, SEMICOLON=38, 
		LPAR=39, RPAR=40, NOTEQUAL=41, LEQ=42, BEQ=43, BECOMES=44, MOD=45, READ=46, 
		WRITE=47, WRITELN=48, INT_VAL=49, REAL_VAL=50, STRING_VAL=51, BOOLEAN_VAL=52, 
		ID=53, UNKNOWN=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_VALUE", "REAL_VALUE", "SIGN", "BOOLEAN_VALUE", "ID_VALUE", "STR_VALUE", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "WS", "COMMENT", "PROGRAM", "CONST", 
			"VAR", "BEGIN", "END", "FUNCTION", "PROCEDURE", "INTEGER", "REAL", "BOOLEAN", 
			"STRING", "CHAR", "ARRAY", "RANGE", "OF", "IF", "THEN", "ELSE", "WHILE", 
			"DO", "AND", "OR", "NOT", "PLUS", "MINUS", "ASTERISK", "SLASH", "EQUAL", 
			"LESSTHAN", "GREATERTHAN", "LBRACK", "RBRACK", "PERIOD", "COMMA", "COLON", 
			"SEMICOLON", "LPAR", "RPAR", "NOTEQUAL", "LEQ", "BEQ", "BECOMES", "MOD", 
			"READ", "WRITE", "WRITELN", "INT_VAL", "REAL_VAL", "STRING_VAL", "BOOLEAN_VAL", 
			"ID", "UNKNOWN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'program'", "'const'", "'var'", "'begin'", "'end'", 
			"'function'", "'procedure'", "'integer'", "'real'", "'boolean'", "'string'", 
			"'char'", "'array'", "'..'", "'of'", "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'and'", "'or'", "'not'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"'<'", "'>'", "'['", "']'", "'.'", "','", "':'", "';'", "'('", "')'", 
			"'<>'", "'<='", "'>='", "':='", "'mod'", "'read'", "'write'", "'writeln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "PROGRAM", "CONST", "VAR", "BEGIN", "END", "FUNCTION", 
			"PROCEDURE", "INTEGER", "REAL", "BOOLEAN", "STRING", "CHAR", "ARRAY", 
			"RANGE", "OF", "IF", "THEN", "ELSE", "WHILE", "DO", "AND", "OR", "NOT", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "EQUAL", "LESSTHAN", "GREATERTHAN", 
			"LBRACK", "RBRACK", "PERIOD", "COMMA", "COLON", "SEMICOLON", "LPAR", 
			"RPAR", "NOTEQUAL", "LEQ", "BEQ", "BECOMES", "MOD", "READ", "WRITE", 
			"WRITELN", "INT_VAL", "REAL_VAL", "STRING_VAL", "BOOLEAN_VAL", "ID", 
			"UNKNOWN"
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


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PascalLexer.g"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 61:
			UNKNOWN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void UNKNOWN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Error na linha: " + getLine() + " - Simbolo desconhecido: '" + getText() + "'") ; System.exit(0);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0194\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\6\2\u0081\n\2\r\2\16\2\u0082\3\3\3\3\3\3\3\3\3\4\5\4"+
		"\u008a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0095\n\5\3\6\3\6\7"+
		"\6\u0099\n\6\f\6\16\6\u009c\13\6\3\7\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00ab\n\b\f\b\16\b\u00ae\13\b\3\b\3"+
		"\b\3\t\3\t\7\t\u00b4\n\t\f\t\16\t\u00b7\13\t\3\t\3\t\3\n\6\n\u00bc\n\n"+
		"\r\n\16\n\u00bd\3\n\3\n\3\13\3\13\5\13\u00c4\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3"+
		":\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\2\2@\3\2\5\2\7\2\t\2\13\2\r\2\17"+
		"\2\21\2\23\3\25\4\27\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/"+
		"\21\61\22\63\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M "+
		"O!Q\"S#U$W%Y&[\'](_)a*c+e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67}8\3\2"+
		"\n\3\2\62;\4\2--//\4\2C\\c|\6\2\62;C\\aac|\3\2))\3\2\f\f\3\2\177\177\4"+
		"\2\13\f\"\"\2\u0194\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\3\u0080\3\2\2\2\5\u0084\3\2\2\2\7\u0089\3\2\2\2\t\u0094\3\2"+
		"\2\2\13\u0096\3\2\2\2\r\u009d\3\2\2\2\17\u00a6\3\2\2\2\21\u00b1\3\2\2"+
		"\2\23\u00bb\3\2\2\2\25\u00c3\3\2\2\2\27\u00c7\3\2\2\2\31\u00cf\3\2\2\2"+
		"\33\u00d5\3\2\2\2\35\u00d9\3\2\2\2\37\u00df\3\2\2\2!\u00e3\3\2\2\2#\u00ec"+
		"\3\2\2\2%\u00f6\3\2\2\2\'\u00fe\3\2\2\2)\u0103\3\2\2\2+\u010b\3\2\2\2"+
		"-\u0112\3\2\2\2/\u0117\3\2\2\2\61\u011d\3\2\2\2\63\u0120\3\2\2\2\65\u0123"+
		"\3\2\2\2\67\u0126\3\2\2\29\u012b\3\2\2\2;\u0130\3\2\2\2=\u0136\3\2\2\2"+
		"?\u0139\3\2\2\2A\u013d\3\2\2\2C\u0140\3\2\2\2E\u0144\3\2\2\2G\u0146\3"+
		"\2\2\2I\u0148\3\2\2\2K\u014a\3\2\2\2M\u014c\3\2\2\2O\u014e\3\2\2\2Q\u0150"+
		"\3\2\2\2S\u0152\3\2\2\2U\u0154\3\2\2\2W\u0156\3\2\2\2Y\u0158\3\2\2\2["+
		"\u015a\3\2\2\2]\u015c\3\2\2\2_\u015e\3\2\2\2a\u0160\3\2\2\2c\u0162\3\2"+
		"\2\2e\u0165\3\2\2\2g\u0168\3\2\2\2i\u016b\3\2\2\2k\u016e\3\2\2\2m\u0172"+
		"\3\2\2\2o\u0177\3\2\2\2q\u017d\3\2\2\2s\u0185\3\2\2\2u\u0188\3\2\2\2w"+
		"\u018b\3\2\2\2y\u018d\3\2\2\2{\u018f\3\2\2\2}\u0191\3\2\2\2\177\u0081"+
		"\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\4\3\2\2\2\u0084\u0085\5\3\2\2\u0085\u0086\7\60\2"+
		"\2\u0086\u0087\5\3\2\2\u0087\6\3\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\b\3\2\2\2\u008b\u008c\7v\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7w\2\2\u008e\u0095\7g\2\2\u008f\u0090\7h\2\2"+
		"\u0090\u0091\7c\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093\u0095"+
		"\7g\2\2\u0094\u008b\3\2\2\2\u0094\u008f\3\2\2\2\u0095\n\3\2\2\2\u0096"+
		"\u009a\t\4\2\2\u0097\u0099\t\5\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\f\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a1\t\6\2\2\u009e\u00a0\n\6\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\t\6\2\2\u00a5\16\3\2\2\2\u00a6\u00a7"+
		"\7\61\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\n\7\2\2"+
		"\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\t\7\2\2\u00b0"+
		"\20\3\2\2\2\u00b1\u00b5\7}\2\2\u00b2\u00b4\n\b\2\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9\22\3\2\2\2\u00ba"+
		"\u00bc\t\t\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\n\2\2\u00c0"+
		"\24\3\2\2\2\u00c1\u00c4\5\17\b\2\u00c2\u00c4\5\21\t\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\13\2\2\u00c6"+
		"\26\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7i\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7o\2\2"+
		"\u00ce\30\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7"+
		"p\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7v\2\2\u00d4\32\3\2\2\2\u00d5\u00d6"+
		"\7x\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7t\2\2\u00d8\34\3\2\2\2\u00d9\u00da"+
		"\7d\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\36\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1"+
		"\u00e2\7f\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7w\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7k\2\2"+
		"\u00e9\u00ea\7q\2\2\u00ea\u00eb\7p\2\2\u00eb\"\3\2\2\2\u00ec\u00ed\7r"+
		"\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7t\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7p\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7g\2"+
		"\2\u0100\u0101\7c\2\2\u0101\u0102\7n\2\2\u0102(\3\2\2\2\u0103\u0104\7"+
		"d\2\2\u0104\u0105\7q\2\2\u0105\u0106\7q\2\2\u0106\u0107\7n\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7c\2\2\u0109\u010a\7p\2\2\u010a*\3\2\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7p\2\2\u0110\u0111\7i\2\2\u0111,\3\2\2\2\u0112\u0113\7e\2\2\u0113"+
		"\u0114\7j\2\2\u0114\u0115\7c\2\2\u0115\u0116\7t\2\2\u0116.\3\2\2\2\u0117"+
		"\u0118\7c\2\2\u0118\u0119\7t\2\2\u0119\u011a\7t\2\2\u011a\u011b\7c\2\2"+
		"\u011b\u011c\7{\2\2\u011c\60\3\2\2\2\u011d\u011e\7\60\2\2\u011e\u011f"+
		"\7\60\2\2\u011f\62\3\2\2\2\u0120\u0121\7q\2\2\u0121\u0122\7h\2\2\u0122"+
		"\64\3\2\2\2\u0123\u0124\7k\2\2\u0124\u0125\7h\2\2\u0125\66\3\2\2\2\u0126"+
		"\u0127\7v\2\2\u0127\u0128\7j\2\2\u0128\u0129\7g\2\2\u0129\u012a\7p\2\2"+
		"\u012a8\3\2\2\2\u012b\u012c\7g\2\2\u012c\u012d\7n\2\2\u012d\u012e\7u\2"+
		"\2\u012e\u012f\7g\2\2\u012f:\3\2\2\2\u0130\u0131\7y\2\2\u0131\u0132\7"+
		"j\2\2\u0132\u0133\7k\2\2\u0133\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135<"+
		"\3\2\2\2\u0136\u0137\7f\2\2\u0137\u0138\7q\2\2\u0138>\3\2\2\2\u0139\u013a"+
		"\7c\2\2\u013a\u013b\7p\2\2\u013b\u013c\7f\2\2\u013c@\3\2\2\2\u013d\u013e"+
		"\7q\2\2\u013e\u013f\7t\2\2\u013fB\3\2\2\2\u0140\u0141\7p\2\2\u0141\u0142"+
		"\7q\2\2\u0142\u0143\7v\2\2\u0143D\3\2\2\2\u0144\u0145\7-\2\2\u0145F\3"+
		"\2\2\2\u0146\u0147\7/\2\2\u0147H\3\2\2\2\u0148\u0149\7,\2\2\u0149J\3\2"+
		"\2\2\u014a\u014b\7\61\2\2\u014bL\3\2\2\2\u014c\u014d\7?\2\2\u014dN\3\2"+
		"\2\2\u014e\u014f\7>\2\2\u014fP\3\2\2\2\u0150\u0151\7@\2\2\u0151R\3\2\2"+
		"\2\u0152\u0153\7]\2\2\u0153T\3\2\2\2\u0154\u0155\7_\2\2\u0155V\3\2\2\2"+
		"\u0156\u0157\7\60\2\2\u0157X\3\2\2\2\u0158\u0159\7.\2\2\u0159Z\3\2\2\2"+
		"\u015a\u015b\7<\2\2\u015b\\\3\2\2\2\u015c\u015d\7=\2\2\u015d^\3\2\2\2"+
		"\u015e\u015f\7*\2\2\u015f`\3\2\2\2\u0160\u0161\7+\2\2\u0161b\3\2\2\2\u0162"+
		"\u0163\7>\2\2\u0163\u0164\7@\2\2\u0164d\3\2\2\2\u0165\u0166\7>\2\2\u0166"+
		"\u0167\7?\2\2\u0167f\3\2\2\2\u0168\u0169\7@\2\2\u0169\u016a\7?\2\2\u016a"+
		"h\3\2\2\2\u016b\u016c\7<\2\2\u016c\u016d\7?\2\2\u016dj\3\2\2\2\u016e\u016f"+
		"\7o\2\2\u016f\u0170\7q\2\2\u0170\u0171\7f\2\2\u0171l\3\2\2\2\u0172\u0173"+
		"\7t\2\2\u0173\u0174\7g\2\2\u0174\u0175\7c\2\2\u0175\u0176\7f\2\2\u0176"+
		"n\3\2\2\2\u0177\u0178\7y\2\2\u0178\u0179\7t\2\2\u0179\u017a\7k\2\2\u017a"+
		"\u017b\7v\2\2\u017b\u017c\7g\2\2\u017cp\3\2\2\2\u017d\u017e\7y\2\2\u017e"+
		"\u017f\7t\2\2\u017f\u0180\7k\2\2\u0180\u0181\7v\2\2\u0181\u0182\7g\2\2"+
		"\u0182\u0183\7n\2\2\u0183\u0184\7p\2\2\u0184r\3\2\2\2\u0185\u0186\5\7"+
		"\4\2\u0186\u0187\5\3\2\2\u0187t\3\2\2\2\u0188\u0189\5\7\4\2\u0189\u018a"+
		"\5\5\3\2\u018av\3\2\2\2\u018b\u018c\5\r\7\2\u018cx\3\2\2\2\u018d\u018e"+
		"\5\t\5\2\u018ez\3\2\2\2\u018f\u0190\5\13\6\2\u0190|\3\2\2\2\u0191\u0192"+
		"\13\2\2\2\u0192\u0193\b?\3\2\u0193~\3\2\2\2\f\2\u0082\u0089\u0094\u009a"+
		"\u00a1\u00ac\u00b5\u00bd\u00c3\4\b\2\2\3?\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}