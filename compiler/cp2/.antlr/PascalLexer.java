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
		WRITE=47, WRITELN=48, INT_VAL=49, REAL_VAL=50, CHAR_VAL=51, STRING_VAL=52, 
		BOOLEAN_VAL=53, ID=54, UNKNOWN=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_VALUE", "REAL_VALUE", "BOOLEAN_VALUE", "ID_VALUE", "CHAR_VALUE", 
			"STR_VALUE", "LINE_COMMENT", "MULTILINE_COMMENT1", "WS", "COMMENT", "PROGRAM", 
			"CONST", "VAR", "BEGIN", "END", "FUNCTION", "PROCEDURE", "INTEGER", "REAL", 
			"BOOLEAN", "STRING", "CHAR", "ARRAY", "RANGE", "OF", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "AND", "OR", "NOT", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"EQUAL", "LESSTHAN", "GREATERTHAN", "LBRACK", "RBRACK", "PERIOD", "COMMA", 
			"COLON", "SEMICOLON", "LPAR", "RPAR", "NOTEQUAL", "LEQ", "BEQ", "BECOMES", 
			"MOD", "READ", "WRITE", "WRITELN", "INT_VAL", "REAL_VAL", "CHAR_VAL", 
			"STRING_VAL", "BOOLEAN_VAL", "ID", "UNKNOWN"
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
			"WRITELN", "INT_VAL", "REAL_VAL", "CHAR_VAL", "STRING_VAL", "BOOLEAN_VAL", 
			"ID", "UNKNOWN"
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
		case 62:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0197\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\6\2\u0083\n\2\r\2\16\2\u0084\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094\n\4\3\5\3\5\7\5\u0098\n\5"+
		"\f\5\16\5\u009b\13\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7\u00a3\n\7\f\7\16\7\u00a6"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\3"+
		"\b\3\t\3\t\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\t\3\t\3\n\6\n\u00bf\n\n"+
		"\r\n\16\n\u00c0\3\n\3\n\3\13\3\13\5\13\u00c7\n\13\3\13\3\13\3\f\3\f\3"+
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
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\2\2A\3\2\5\2\7\2\t\2\13\2\r\2\17"+
		"\2\21\2\23\3\25\4\27\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/"+
		"\21\61\22\63\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M "+
		"O!Q\"S#U$W%Y&[\'](_)a*c+e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67}8\177"+
		"9\3\2\t\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\2))\3\2\f\f\3\2\177\177\4\2"+
		"\13\f\"\"\2\u0196\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\3\u0082\3\2\2\2\5\u0086\3\2\2\2\7\u0093\3\2\2\2"+
		"\t\u0095\3\2\2\2\13\u009c\3\2\2\2\r\u00a0\3\2\2\2\17\u00a9\3\2\2\2\21"+
		"\u00b4\3\2\2\2\23\u00be\3\2\2\2\25\u00c6\3\2\2\2\27\u00ca\3\2\2\2\31\u00d2"+
		"\3\2\2\2\33\u00d8\3\2\2\2\35\u00dc\3\2\2\2\37\u00e2\3\2\2\2!\u00e6\3\2"+
		"\2\2#\u00ef\3\2\2\2%\u00f9\3\2\2\2\'\u0101\3\2\2\2)\u0106\3\2\2\2+\u010e"+
		"\3\2\2\2-\u0115\3\2\2\2/\u011a\3\2\2\2\61\u0120\3\2\2\2\63\u0123\3\2\2"+
		"\2\65\u0126\3\2\2\2\67\u0129\3\2\2\29\u012e\3\2\2\2;\u0133\3\2\2\2=\u0139"+
		"\3\2\2\2?\u013c\3\2\2\2A\u0140\3\2\2\2C\u0143\3\2\2\2E\u0147\3\2\2\2G"+
		"\u0149\3\2\2\2I\u014b\3\2\2\2K\u014d\3\2\2\2M\u014f\3\2\2\2O\u0151\3\2"+
		"\2\2Q\u0153\3\2\2\2S\u0155\3\2\2\2U\u0157\3\2\2\2W\u0159\3\2\2\2Y\u015b"+
		"\3\2\2\2[\u015d\3\2\2\2]\u015f\3\2\2\2_\u0161\3\2\2\2a\u0163\3\2\2\2c"+
		"\u0165\3\2\2\2e\u0168\3\2\2\2g\u016b\3\2\2\2i\u016e\3\2\2\2k\u0171\3\2"+
		"\2\2m\u0175\3\2\2\2o\u017a\3\2\2\2q\u0180\3\2\2\2s\u0188\3\2\2\2u\u018a"+
		"\3\2\2\2w\u018c\3\2\2\2y\u018e\3\2\2\2{\u0190\3\2\2\2}\u0192\3\2\2\2\177"+
		"\u0194\3\2\2\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\4\3\2\2\2\u0086\u0087"+
		"\5\3\2\2\u0087\u0088\7\60\2\2\u0088\u0089\5\3\2\2\u0089\6\3\2\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d\u0094\7g\2\2"+
		"\u008e\u008f\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0094\7g\2\2\u0093\u008a\3\2\2\2\u0093\u008e\3\2\2\2\u0094"+
		"\b\3\2\2\2\u0095\u0099\t\3\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\n\3"+
		"\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\t\5\2\2\u009d\u009e\n\5\2\2\u009e"+
		"\u009f\t\5\2\2\u009f\f\3\2\2\2\u00a0\u00a4\t\5\2\2\u00a1\u00a3\n\5\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\t\5\2\2\u00a8"+
		"\16\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00af\3\2"+
		"\2\2\u00ac\u00ae\n\6\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b3\t\6\2\2\u00b3\20\3\2\2\2\u00b4\u00b8\7}\2\2\u00b5\u00b7"+
		"\n\7\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\177"+
		"\2\2\u00bc\22\3\2\2\2\u00bd\u00bf\t\b\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\b\n\2\2\u00c3\24\3\2\2\2\u00c4\u00c7\5\17\b\2\u00c5\u00c7\5\21"+
		"\t\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\b\13\2\2\u00c9\26\3\2\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7t\2\2"+
		"\u00cc\u00cd\7q\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7o\2\2\u00d1\30\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\32\3\2\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t\2\2\u00db"+
		"\34\3\2\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7i\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\36\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\u00e4\7p\2\2\u00e4\u00e5\7f\2\2\u00e5 \3\2\2\2\u00e6\u00e7\7h\2\2\u00e7"+
		"\u00e8\7w\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00ec\7k\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7p\2\2\u00ee\"\3\2"+
		"\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7e\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7w\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8$\3\2\2\2\u00f9\u00fa\7k\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7i\2\2"+
		"\u00fe\u00ff\7g\2\2\u00ff\u0100\7t\2\2\u0100&\3\2\2\2\u0101\u0102\7t\2"+
		"\2\u0102\u0103\7g\2\2\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105(\3\2"+
		"\2\2\u0106\u0107\7d\2\2\u0107\u0108\7q\2\2\u0108\u0109\7q\2\2\u0109\u010a"+
		"\7n\2\2\u010a\u010b\7g\2\2\u010b\u010c\7c\2\2\u010c\u010d\7p\2\2\u010d"+
		"*\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7i\2\2\u0114,\3\2\2\2\u0115"+
		"\u0116\7e\2\2\u0116\u0117\7j\2\2\u0117\u0118\7c\2\2\u0118\u0119\7t\2\2"+
		"\u0119.\3\2\2\2\u011a\u011b\7c\2\2\u011b\u011c\7t\2\2\u011c\u011d\7t\2"+
		"\2\u011d\u011e\7c\2\2\u011e\u011f\7{\2\2\u011f\60\3\2\2\2\u0120\u0121"+
		"\7\60\2\2\u0121\u0122\7\60\2\2\u0122\62\3\2\2\2\u0123\u0124\7q\2\2\u0124"+
		"\u0125\7h\2\2\u0125\64\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128\7h\2\2\u0128"+
		"\66\3\2\2\2\u0129\u012a\7v\2\2\u012a\u012b\7j\2\2\u012b\u012c\7g\2\2\u012c"+
		"\u012d\7p\2\2\u012d8\3\2\2\2\u012e\u012f\7g\2\2\u012f\u0130\7n\2\2\u0130"+
		"\u0131\7u\2\2\u0131\u0132\7g\2\2\u0132:\3\2\2\2\u0133\u0134\7y\2\2\u0134"+
		"\u0135\7j\2\2\u0135\u0136\7k\2\2\u0136\u0137\7n\2\2\u0137\u0138\7g\2\2"+
		"\u0138<\3\2\2\2\u0139\u013a\7f\2\2\u013a\u013b\7q\2\2\u013b>\3\2\2\2\u013c"+
		"\u013d\7c\2\2\u013d\u013e\7p\2\2\u013e\u013f\7f\2\2\u013f@\3\2\2\2\u0140"+
		"\u0141\7q\2\2\u0141\u0142\7t\2\2\u0142B\3\2\2\2\u0143\u0144\7p\2\2\u0144"+
		"\u0145\7q\2\2\u0145\u0146\7v\2\2\u0146D\3\2\2\2\u0147\u0148\7-\2\2\u0148"+
		"F\3\2\2\2\u0149\u014a\7/\2\2\u014aH\3\2\2\2\u014b\u014c\7,\2\2\u014cJ"+
		"\3\2\2\2\u014d\u014e\7\61\2\2\u014eL\3\2\2\2\u014f\u0150\7?\2\2\u0150"+
		"N\3\2\2\2\u0151\u0152\7>\2\2\u0152P\3\2\2\2\u0153\u0154\7@\2\2\u0154R"+
		"\3\2\2\2\u0155\u0156\7]\2\2\u0156T\3\2\2\2\u0157\u0158\7_\2\2\u0158V\3"+
		"\2\2\2\u0159\u015a\7\60\2\2\u015aX\3\2\2\2\u015b\u015c\7.\2\2\u015cZ\3"+
		"\2\2\2\u015d\u015e\7<\2\2\u015e\\\3\2\2\2\u015f\u0160\7=\2\2\u0160^\3"+
		"\2\2\2\u0161\u0162\7*\2\2\u0162`\3\2\2\2\u0163\u0164\7+\2\2\u0164b\3\2"+
		"\2\2\u0165\u0166\7>\2\2\u0166\u0167\7@\2\2\u0167d\3\2\2\2\u0168\u0169"+
		"\7>\2\2\u0169\u016a\7?\2\2\u016af\3\2\2\2\u016b\u016c\7@\2\2\u016c\u016d"+
		"\7?\2\2\u016dh\3\2\2\2\u016e\u016f\7<\2\2\u016f\u0170\7?\2\2\u0170j\3"+
		"\2\2\2\u0171\u0172\7o\2\2\u0172\u0173\7q\2\2\u0173\u0174\7f\2\2\u0174"+
		"l\3\2\2\2\u0175\u0176\7t\2\2\u0176\u0177\7g\2\2\u0177\u0178\7c\2\2\u0178"+
		"\u0179\7f\2\2\u0179n\3\2\2\2\u017a\u017b\7y\2\2\u017b\u017c\7t\2\2\u017c"+
		"\u017d\7k\2\2\u017d\u017e\7v\2\2\u017e\u017f\7g\2\2\u017fp\3\2\2\2\u0180"+
		"\u0181\7y\2\2\u0181\u0182\7t\2\2\u0182\u0183\7k\2\2\u0183\u0184\7v\2\2"+
		"\u0184\u0185\7g\2\2\u0185\u0186\7n\2\2\u0186\u0187\7p\2\2\u0187r\3\2\2"+
		"\2\u0188\u0189\5\3\2\2\u0189t\3\2\2\2\u018a\u018b\5\5\3\2\u018bv\3\2\2"+
		"\2\u018c\u018d\5\13\6\2\u018dx\3\2\2\2\u018e\u018f\5\r\7\2\u018fz\3\2"+
		"\2\2\u0190\u0191\5\7\4\2\u0191|\3\2\2\2\u0192\u0193\5\t\5\2\u0193~\3\2"+
		"\2\2\u0194\u0195\13\2\2\2\u0195\u0196\b@\3\2\u0196\u0080\3\2\2\2\13\2"+
		"\u0084\u0093\u0099\u00a4\u00af\u00b8\u00c0\u00c6\4\b\2\2\3@\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}