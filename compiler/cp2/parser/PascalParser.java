// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_begin = 0, RULE_program = 1, RULE_program_pascal = 2, RULE_procedure_function = 3, 
		RULE_const_section = 4, RULE_var_section = 5, RULE_var = 6, RULE_constant = 7, 
		RULE_array = 8, RULE_acess_array = 9, RULE_procedure = 10, RULE_function = 11, 
		RULE_block = 12, RULE_statement = 13, RULE_atribution = 14, RULE_expr_mat = 15, 
		RULE_expr_log = 16, RULE_while_block = 17, RULE_if_block = 18, RULE_param_call = 19, 
		RULE_call_function_procedure = 20, RULE_write_io = 21, RULE_read_io = 22, 
		RULE_type = 23, RULE_val = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "program", "program_pascal", "procedure_function", "const_section", 
			"var_section", "var", "constant", "array", "acess_array", "procedure", 
			"function", "block", "statement", "atribution", "expr_mat", "expr_log", 
			"while_block", "if_block", "param_call", "call_function_procedure", "write_io", 
			"read_io", "type", "val"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			program();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public Program_pascalContext program_pascal() {
			return getRuleContext(Program_pascalContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(PascalParser.PERIOD, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(PROGRAM);
			setState(53);
			match(ID);
			setState(54);
			match(SEMICOLON);
			setState(55);
			program_pascal();
			setState(56);
			match(PERIOD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Program_pascalContext extends ParserRuleContext {
		public List<Const_sectionContext> const_section() {
			return getRuleContexts(Const_sectionContext.class);
		}
		public Const_sectionContext const_section(int i) {
			return getRuleContext(Const_sectionContext.class,i);
		}
		public Var_sectionContext var_section() {
			return getRuleContext(Var_sectionContext.class,0);
		}
		public List<Procedure_functionContext> procedure_function() {
			return getRuleContexts(Procedure_functionContext.class);
		}
		public Procedure_functionContext procedure_function(int i) {
			return getRuleContext(Procedure_functionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Program_pascalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_pascal; }
	}

	public final Program_pascalContext program_pascal() throws RecognitionException {
		Program_pascalContext _localctx = new Program_pascalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program_pascal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(58);
				const_section();
				}
				break;
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(61);
				var_section();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(64);
				const_section();
				}
			}

			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==PROCEDURE) {
				{
				{
				setState(67);
				procedure_function();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				block();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGIN );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_functionContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Procedure_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_function; }
	}

	public final Procedure_functionContext procedure_function() throws RecognitionException {
		Procedure_functionContext _localctx = new Procedure_functionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure_function);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				procedure();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_sectionContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PascalParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(PascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PascalParser.ID, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(PascalParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PascalParser.EQUAL, i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public Const_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_section; }
	}

	public final Const_sectionContext const_section() throws RecognitionException {
		Const_sectionContext _localctx = new Const_sectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CONST);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				match(ID);
				setState(84);
				match(EQUAL);
				setState(85);
				val();
				setState(86);
				match(SEMICOLON);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_sectionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public Var_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_section; }
	}

	public final Var_sectionContext var_section() throws RecognitionException {
		Var_sectionContext _localctx = new Var_sectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(VAR);
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				var();
				setState(94);
				match(SEMICOLON);
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PascalParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(100);
				match(ID);
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(101);
					match(COMMA);
					setState(102);
					match(ID);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(COLON);
				setState(109);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PascalParser.CONST, 0); }
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(CONST);
			setState(114);
			match(ID);
			setState(115);
			match(COLON);
			setState(116);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TerminalNode ARRAY() { return getToken(PascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(PascalParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(PascalParser.INT_VAL, i);
		}
		public TerminalNode RANGE() { return getToken(PascalParser.RANGE, 0); }
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(119);
			match(COLON);
			setState(120);
			match(ARRAY);
			setState(121);
			match(LBRACK);
			setState(122);
			match(INT_VAL);
			setState(123);
			match(RANGE);
			setState(124);
			match(INT_VAL);
			setState(125);
			match(RBRACK);
			setState(126);
			match(OF);
			setState(127);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Acess_arrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PascalParser.ID, i);
		}
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public TerminalNode INT_VAL() { return getToken(PascalParser.INT_VAL, 0); }
		public Acess_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acess_array; }
	}

	public final Acess_arrayContext acess_array() throws RecognitionException {
		Acess_arrayContext _localctx = new Acess_arrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_acess_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID);
			setState(130);
			match(LBRACK);
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==INT_VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PascalParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PascalParser.RPAR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<Const_sectionContext> const_section() {
			return getRuleContexts(Const_sectionContext.class);
		}
		public Const_sectionContext const_section(int i) {
			return getRuleContext(Const_sectionContext.class,i);
		}
		public Var_sectionContext var_section() {
			return getRuleContext(Var_sectionContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(PROCEDURE);
			setState(135);
			match(ID);
			setState(136);
			match(LPAR);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==ID) {
				{
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(137);
					var();
					}
					break;
				case CONST:
					{
					setState(138);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RPAR);
			setState(145);
			match(SEMICOLON);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(146);
				const_section();
				}
				break;
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(149);
				var_section();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(152);
				const_section();
				}
			}

			setState(155);
			block();
			setState(156);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PascalParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PascalParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(PascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PascalParser.SEMICOLON, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public Const_sectionContext const_section() {
			return getRuleContext(Const_sectionContext.class,0);
		}
		public Var_sectionContext var_section() {
			return getRuleContext(Var_sectionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FUNCTION);
			setState(159);
			match(ID);
			setState(160);
			match(LPAR);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==ID) {
				{
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(161);
					var();
					}
					break;
				case CONST:
					{
					setState(162);
					constant();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RPAR);
			setState(169);
			match(COLON);
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case BOOLEAN:
			case STRING:
			case CHAR:
				{
				setState(170);
				type();
				}
				break;
			case ID:
				{
				setState(171);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(174);
			match(SEMICOLON);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(175);
				const_section();
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(178);
				var_section();
				}
			}

			setState(181);
			block();
			setState(182);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(BEGIN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18506979721084928L) != 0) {
				{
				{
				setState(185);
				statement();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AtributionContext atribution() {
			return getRuleContext(AtributionContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Call_function_procedureContext call_function_procedure() {
			return getRuleContext(Call_function_procedureContext.class,0);
		}
		public Read_ioContext read_io() {
			return getRuleContext(Read_ioContext.class,0);
		}
		public Write_ioContext write_io() {
			return getRuleContext(Write_ioContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				atribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				while_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				if_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				call_function_procedure();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				read_io();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				write_io();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtributionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode BECOMES() { return getToken(PascalParser.BECOMES, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public Expr_matContext expr_mat() {
			return getRuleContext(Expr_matContext.class,0);
		}
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(PascalParser.CHAR, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Acess_arrayContext acess_array() {
			return getRuleContext(Acess_arrayContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AtributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribution; }
	}

	public final AtributionContext atribution() throws RecognitionException {
		AtributionContext _localctx = new AtributionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(BECOMES);
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(203);
				expr_mat(0);
				}
				break;
			case 2:
				{
				setState(204);
				expr_log(0);
				}
				break;
			case 3:
				{
				setState(205);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(206);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(207);
				array();
				}
				break;
			case 6:
				{
				setState(208);
				acess_array();
				}
				break;
			case 7:
				{
				setState(209);
				val();
				}
				break;
			}
			setState(212);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_matContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PascalParser.LPAR, 0); }
		public List<Expr_matContext> expr_mat() {
			return getRuleContexts(Expr_matContext.class);
		}
		public Expr_matContext expr_mat(int i) {
			return getRuleContext(Expr_matContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PascalParser.RPAR, 0); }
		public TerminalNode INT_VAL() { return getToken(PascalParser.INT_VAL, 0); }
		public TerminalNode REAL_VAL() { return getToken(PascalParser.REAL_VAL, 0); }
		public Acess_arrayContext acess_array() {
			return getRuleContext(Acess_arrayContext.class,0);
		}
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode ASTERISK() { return getToken(PascalParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(PascalParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(PascalParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public Expr_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mat; }
	}

	public final Expr_matContext expr_mat() throws RecognitionException {
		return expr_mat(0);
	}

	private Expr_matContext expr_mat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_matContext _localctx = new Expr_matContext(_ctx, _parentState);
		Expr_matContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr_mat, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(215);
				match(LPAR);
				setState(216);
				expr_mat(0);
				setState(217);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(219);
				match(INT_VAL);
				}
				break;
			case 3:
				{
				setState(220);
				match(REAL_VAL);
				}
				break;
			case 4:
				{
				setState(221);
				acess_array();
				}
				break;
			case 5:
				{
				setState(222);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_matContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_mat);
						setState(225);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(226);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 35185177395200L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expr_mat(7);
						}
						break;
					case 2:
						{
						_localctx = new Expr_matContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_mat);
						setState(228);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expr_mat(6);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_logContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PascalParser.LPAR, 0); }
		public List<Expr_logContext> expr_log() {
			return getRuleContexts(Expr_logContext.class);
		}
		public Expr_logContext expr_log(int i) {
			return getRuleContext(Expr_logContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PascalParser.RPAR, 0); }
		public List<Expr_matContext> expr_mat() {
			return getRuleContexts(Expr_matContext.class);
		}
		public Expr_matContext expr_mat(int i) {
			return getRuleContext(Expr_matContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(PascalParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(PascalParser.GREATERTHAN, 0); }
		public TerminalNode LEQ() { return getToken(PascalParser.LEQ, 0); }
		public TerminalNode BEQ() { return getToken(PascalParser.BEQ, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PascalParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TerminalNode NOT() { return getToken(PascalParser.NOT, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(PascalParser.BOOLEAN_VAL, 0); }
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode AND() { return getToken(PascalParser.AND, 0); }
		public TerminalNode OR() { return getToken(PascalParser.OR, 0); }
		public Expr_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_log; }
	}

	public final Expr_logContext expr_log() throws RecognitionException {
		return expr_log(0);
	}

	private Expr_logContext expr_log(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_logContext _localctx = new Expr_logContext(_ctx, _parentState);
		Expr_logContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr_log, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(237);
				match(LPAR);
				setState(238);
				expr_log(0);
				setState(239);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(241);
				expr_mat(0);
				setState(242);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15400678981632L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				expr_mat(0);
				}
				break;
			case 3:
				{
				setState(245);
				match(NOT);
				setState(246);
				expr_log(5);
				}
				break;
			case 4:
				{
				setState(247);
				match(BOOLEAN_VAL);
				}
				break;
			case 5:
				{
				setState(248);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_log);
						setState(251);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(252);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						expr_log(8);
						}
						break;
					case 2:
						{
						_localctx = new Expr_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_log);
						setState(254);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(255);
						match(AND);
						setState(256);
						expr_log(5);
						}
						break;
					case 3:
						{
						_localctx = new Expr_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_log);
						setState(257);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(258);
						match(OR);
						setState(259);
						expr_log(4);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascalParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public Expr_matContext expr_mat() {
			return getRuleContext(Expr_matContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(WHILE);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(266);
				expr_log(0);
				}
				break;
			case 2:
				{
				setState(267);
				expr_mat(0);
				}
				break;
			}
			setState(270);
			match(DO);
			setState(271);
			block();
			setState(272);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascalParser.IF, 0); }
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IF);
			setState(275);
			expr_log(0);
			setState(276);
			match(THEN);
			setState(277);
			block();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(278);
				match(ELSE);
				setState(279);
				block();
				}
			}

			setState(282);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Param_callContext extends ParserRuleContext {
		public Expr_matContext expr_mat() {
			return getRuleContext(Expr_matContext.class,0);
		}
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public Call_function_procedureContext call_function_procedure() {
			return getRuleContext(Call_function_procedureContext.class,0);
		}
		public List<Param_callContext> param_call() {
			return getRuleContexts(Param_callContext.class);
		}
		public Param_callContext param_call(int i) {
			return getRuleContext(Param_callContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PascalParser.COMMA, 0); }
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
	}

	public final Param_callContext param_call() throws RecognitionException {
		return param_call(0);
	}

	private Param_callContext param_call(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Param_callContext _localctx = new Param_callContext(_ctx, _parentState);
		Param_callContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_param_call, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(285);
				expr_mat(0);
				}
				break;
			case 2:
				{
				setState(286);
				expr_log(0);
				}
				break;
			case 3:
				{
				setState(287);
				call_function_procedure();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Param_callContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_param_call);
					setState(290);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(291);
					match(COMMA);
					setState(292);
					param_call(2);
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_function_procedureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PascalParser.LPAR, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PascalParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public Call_function_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function_procedure; }
	}

	public final Call_function_procedureContext call_function_procedure() throws RecognitionException {
		Call_function_procedureContext _localctx = new Call_function_procedureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call_function_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
			setState(299);
			match(LPAR);
			setState(300);
			param_call(0);
			setState(301);
			match(RPAR);
			setState(302);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Write_ioContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PascalParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PascalParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public TerminalNode WRITE() { return getToken(PascalParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(PascalParser.WRITELN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public Expr_matContext expr_mat() {
			return getRuleContext(Expr_matContext.class,0);
		}
		public Write_ioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_io; }
	}

	public final Write_ioContext write_io() throws RecognitionException {
		Write_ioContext _localctx = new Write_ioContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_write_io);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==WRITE || _la==WRITELN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(305);
			match(LPAR);
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(306);
				val();
				}
				break;
			case 2:
				{
				setState(307);
				match(ID);
				}
				break;
			case 3:
				{
				setState(308);
				expr_log(0);
				}
				break;
			case 4:
				{
				setState(309);
				expr_mat(0);
				}
				break;
			}
			setState(312);
			match(RPAR);
			setState(313);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Read_ioContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(PascalParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(PascalParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PascalParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(PascalParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public Acess_arrayContext acess_array() {
			return getRuleContext(Acess_arrayContext.class,0);
		}
		public Read_ioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_io; }
	}

	public final Read_ioContext read_io() throws RecognitionException {
		Read_ioContext _localctx = new Read_ioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read_io);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(READ);
			setState(316);
			match(LPAR);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(317);
				match(ID);
				}
				break;
			case 2:
				{
				setState(318);
				acess_array();
				}
				break;
			}
			setState(321);
			match(RPAR);
			setState(322);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(PascalParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(PascalParser.INT_VAL, 0); }
		public TerminalNode REAL_VAL() { return getToken(PascalParser.REAL_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(PascalParser.STRING_VAL, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(PascalParser.BOOLEAN_VAL, 0); }
		public TerminalNode CHAR_VAL() { return getToken(PascalParser.CHAR_VAL, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556060672L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_mat_sempred((Expr_matContext)_localctx, predIndex);
		case 16:
			return expr_log_sempred((Expr_logContext)_localctx, predIndex);
		case 19:
			return param_call_sempred((Param_callContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_mat_sempred(Expr_matContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_log_sempred(Expr_logContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean param_call_sempred(Param_callContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0149\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002"+
		"\u0003\u0002?\b\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0005"+
		"\u0002E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0004\u0002K\b\u0002"+
		"\u000b\u0002\f\u0002L\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004Y\b\u0004\u000b\u0004\f\u0004Z\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005a\b\u0005\u000b\u0005\f\u0005b\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006h\b\u0006\n\u0006\f\u0006k\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u008c\b\n\n\n\f\n\u008f\t\n\u0001\n\u0001\n\u0001\n\u0003\n\u0094\b"+
		"\n\u0001\n\u0003\n\u0097\b\n\u0001\n\u0003\n\u009a\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00a4\b\u000b\n\u000b\f\u000b\u00a7\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00ad\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00b1\b\u000b\u0001\u000b\u0003\u000b\u00b4\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u00bb\b\f\n\f\f"+
		"\f\u00be\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00c8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d3"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00e0\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00e8\b\u000f\n\u000f\f\u000f\u00eb\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00fa\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0105\b\u0010\n\u0010\f\u0010\u0108\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u010d\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0119\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0121\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0126\b\u0013\n\u0013\f\u0013"+
		"\u0129\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0137\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0140\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0000\u0003\u001e &\u0019\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0\u0000\b\u0002\u00001166\u0002\u0000\u001c\u001d--\u0001\u0000\u001a"+
		"\u001b\u0002\u0000\u001e )+\u0002\u0000\u001e\u001e))\u0001\u0000/0\u0001"+
		"\u0000\n\u000e\u0001\u000015\u0165\u00002\u0001\u0000\u0000\u0000\u0002"+
		"4\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006P\u0001"+
		"\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000"+
		"\fo\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0086\u0001"+
		"\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000\u0000\u0018\u00b8\u0001"+
		"\u0000\u0000\u0000\u001a\u00c7\u0001\u0000\u0000\u0000\u001c\u00c9\u0001"+
		"\u0000\u0000\u0000\u001e\u00df\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000"+
		"\u0000\u0000\"\u0109\u0001\u0000\u0000\u0000$\u0112\u0001\u0000\u0000"+
		"\u0000&\u0120\u0001\u0000\u0000\u0000(\u012a\u0001\u0000\u0000\u0000*"+
		"\u0130\u0001\u0000\u0000\u0000,\u013b\u0001\u0000\u0000\u0000.\u0144\u0001"+
		"\u0000\u0000\u00000\u0146\u0001\u0000\u0000\u000023\u0003\u0002\u0001"+
		"\u00003\u0001\u0001\u0000\u0000\u000045\u0005\u0003\u0000\u000056\u0005"+
		"6\u0000\u000067\u0005&\u0000\u000078\u0003\u0004\u0002\u000089\u0005#"+
		"\u0000\u00009\u0003\u0001\u0000\u0000\u0000:<\u0003\b\u0004\u0000;:\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=?\u0003\n\u0005\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@B\u0003\b\u0004\u0000A@\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BF\u0001\u0000\u0000\u0000CE\u0003\u0006\u0003"+
		"\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000IK\u0003\u0018\f\u0000JI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"M\u0005\u0001\u0000\u0000\u0000NQ\u0003\u0014\n\u0000OQ\u0003\u0016\u000b"+
		"\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0007\u0001"+
		"\u0000\u0000\u0000RX\u0005\u0004\u0000\u0000ST\u00056\u0000\u0000TU\u0005"+
		"\u001e\u0000\u0000UV\u00030\u0018\u0000VW\u0005&\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XS\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\t\u0001\u0000\u0000\u0000"+
		"\\`\u0005\u0005\u0000\u0000]^\u0003\f\u0006\u0000^_\u0005&\u0000\u0000"+
		"_a\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000b\u0001"+
		"\u0000\u0000\u0000di\u00056\u0000\u0000ef\u0005$\u0000\u0000fh\u00056"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0005%\u0000\u0000mp\u0003.\u0017\u0000n"+
		"p\u0003\u0010\b\u0000od\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"p\r\u0001\u0000\u0000\u0000qr\u0005\u0004\u0000\u0000rs\u00056\u0000\u0000"+
		"st\u0005%\u0000\u0000tu\u0003.\u0017\u0000u\u000f\u0001\u0000\u0000\u0000"+
		"vw\u00056\u0000\u0000wx\u0005%\u0000\u0000xy\u0005\u000f\u0000\u0000y"+
		"z\u0005!\u0000\u0000z{\u00051\u0000\u0000{|\u0005\u0010\u0000\u0000|}"+
		"\u00051\u0000\u0000}~\u0005\"\u0000\u0000~\u007f\u0005\u0011\u0000\u0000"+
		"\u007f\u0080\u0003.\u0017\u0000\u0080\u0011\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u00056\u0000\u0000\u0082\u0083\u0005!\u0000\u0000\u0083\u0084\u0007"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\"\u0000\u0000\u0085\u0013\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0088\u00056\u0000"+
		"\u0000\u0088\u008d\u0005\'\u0000\u0000\u0089\u008c\u0003\f\u0006\u0000"+
		"\u008a\u008c\u0003\u000e\u0007\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005(\u0000\u0000\u0091\u0093\u0005&\u0000\u0000\u0092\u0094"+
		"\u0003\b\u0004\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0097\u0003"+
		"\n\u0005\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u009a\u0003\b\u0004"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0018\f\u0000"+
		"\u009c\u009d\u0005&\u0000\u0000\u009d\u0015\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005\b\u0000\u0000\u009f\u00a0\u00056\u0000\u0000\u00a0\u00a5"+
		"\u0005\'\u0000\u0000\u00a1\u00a4\u0003\f\u0006\u0000\u00a2\u00a4\u0003"+
		"\u000e\u0007\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"(\u0000\u0000\u00a9\u00ac\u0005%\u0000\u0000\u00aa\u00ad\u0003.\u0017"+
		"\u0000\u00ab\u00ad\u0003\u0010\b\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0005&\u0000\u0000\u00af\u00b1\u0003\b\u0004\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b4\u0003\n\u0005\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u0018\f\u0000\u00b6\u00b7\u0005"+
		"&\u0000\u0000\u00b7\u0017\u0001\u0000\u0000\u0000\u00b8\u00bc\u0005\u0006"+
		"\u0000\u0000\u00b9\u00bb\u0003\u001a\r\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0007\u0000"+
		"\u0000\u00c0\u0019\u0001\u0000\u0000\u0000\u00c1\u00c8\u0003\u001c\u000e"+
		"\u0000\u00c2\u00c8\u0003\"\u0011\u0000\u00c3\u00c8\u0003$\u0012\u0000"+
		"\u00c4\u00c8\u0003(\u0014\u0000\u00c5\u00c8\u0003,\u0016\u0000\u00c6\u00c8"+
		"\u0003*\u0015\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c7\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u001b\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"6\u0000\u0000\u00ca\u00d2\u0005,\u0000\u0000\u00cb\u00d3\u0003\u001e\u000f"+
		"\u0000\u00cc\u00d3\u0003 \u0010\u0000\u00cd\u00d3\u0005\r\u0000\u0000"+
		"\u00ce\u00d3\u0005\u000e\u0000\u0000\u00cf\u00d3\u0003\u0010\b\u0000\u00d0"+
		"\u00d3\u0003\u0012\t\u0000\u00d1\u00d3\u00030\u0018\u0000\u00d2\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005&\u0000\u0000\u00d5\u001d\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006"+
		"\u000f\uffff\uffff\u0000\u00d7\u00d8\u0005\'\u0000\u0000\u00d8\u00d9\u0003"+
		"\u001e\u000f\u0000\u00d9\u00da\u0005(\u0000\u0000\u00da\u00e0\u0001\u0000"+
		"\u0000\u0000\u00db\u00e0\u00051\u0000\u0000\u00dc\u00e0\u00052\u0000\u0000"+
		"\u00dd\u00e0\u0003\u0012\t\u0000\u00de\u00e0\u00056\u0000\u0000\u00df"+
		"\u00d6\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df"+
		"\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e9\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\n\u0006\u0000\u0000\u00e2\u00e3\u0007\u0001\u0000\u0000\u00e3\u00e8"+
		"\u0003\u001e\u000f\u0007\u00e4\u00e5\n\u0005\u0000\u0000\u00e5\u00e6\u0007"+
		"\u0002\u0000\u0000\u00e6\u00e8\u0003\u001e\u000f\u0006\u00e7\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u001f\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0006\u0010\uffff\uffff\u0000\u00ed\u00ee"+
		"\u0005\'\u0000\u0000\u00ee\u00ef\u0003 \u0010\u0000\u00ef\u00f0\u0005"+
		"(\u0000\u0000\u00f0\u00fa\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\u001e"+
		"\u000f\u0000\u00f2\u00f3\u0007\u0003\u0000\u0000\u00f3\u00f4\u0003\u001e"+
		"\u000f\u0000\u00f4\u00fa\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0019"+
		"\u0000\u0000\u00f6\u00fa\u0003 \u0010\u0005\u00f7\u00fa\u00055\u0000\u0000"+
		"\u00f8\u00fa\u00056\u0000\u0000\u00f9\u00ec\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u0106\u0001\u0000\u0000\u0000\u00fb\u00fc\n\u0007\u0000\u0000\u00fc\u00fd"+
		"\u0007\u0004\u0000\u0000\u00fd\u0105\u0003 \u0010\b\u00fe\u00ff\n\u0004"+
		"\u0000\u0000\u00ff\u0100\u0005\u0017\u0000\u0000\u0100\u0105\u0003 \u0010"+
		"\u0005\u0101\u0102\n\u0003\u0000\u0000\u0102\u0103\u0005\u0018\u0000\u0000"+
		"\u0103\u0105\u0003 \u0010\u0004\u0104\u00fb\u0001\u0000\u0000\u0000\u0104"+
		"\u00fe\u0001\u0000\u0000\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0105"+
		"\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107!\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0005\u0015\u0000\u0000\u010a\u010d"+
		"\u0003 \u0010\u0000\u010b\u010d\u0003\u001e\u000f\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u0016\u0000\u0000\u010f\u0110\u0003"+
		"\u0018\f\u0000\u0110\u0111\u0005&\u0000\u0000\u0111#\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u0012\u0000\u0000\u0113\u0114\u0003 \u0010\u0000"+
		"\u0114\u0115\u0005\u0013\u0000\u0000\u0115\u0118\u0003\u0018\f\u0000\u0116"+
		"\u0117\u0005\u0014\u0000\u0000\u0117\u0119\u0003\u0018\f\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0005&\u0000\u0000\u011b%\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0006\u0013\uffff\uffff\u0000\u011d\u0121\u0003"+
		"\u001e\u000f\u0000\u011e\u0121\u0003 \u0010\u0000\u011f\u0121\u0003(\u0014"+
		"\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0127\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\n\u0001\u0000\u0000\u0123\u0124\u0005$\u0000\u0000"+
		"\u0124\u0126\u0003&\u0013\u0002\u0125\u0122\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\'\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u00056\u0000\u0000\u012b\u012c\u0005"+
		"\'\u0000\u0000\u012c\u012d\u0003&\u0013\u0000\u012d\u012e\u0005(\u0000"+
		"\u0000\u012e\u012f\u0005&\u0000\u0000\u012f)\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0007\u0005\u0000\u0000\u0131\u0136\u0005\'\u0000\u0000\u0132\u0137"+
		"\u00030\u0018\u0000\u0133\u0137\u00056\u0000\u0000\u0134\u0137\u0003 "+
		"\u0010\u0000\u0135\u0137\u0003\u001e\u000f\u0000\u0136\u0132\u0001\u0000"+
		"\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005(\u0000\u0000\u0139\u013a\u0005&\u0000\u0000"+
		"\u013a+\u0001\u0000\u0000\u0000\u013b\u013c\u0005.\u0000\u0000\u013c\u013f"+
		"\u0005\'\u0000\u0000\u013d\u0140\u00056\u0000\u0000\u013e\u0140\u0003"+
		"\u0012\t\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005(\u0000"+
		"\u0000\u0142\u0143\u0005&\u0000\u0000\u0143-\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0007\u0006\u0000\u0000\u0145/\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0007\u0007\u0000\u0000\u01471\u0001\u0000\u0000\u0000#;>AFLPZbio\u008b"+
		"\u008d\u0093\u0096\u0099\u00a3\u00a5\u00ac\u00b0\u00b3\u00bc\u00c7\u00d2"+
		"\u00df\u00e7\u00e9\u00f9\u0104\u0106\u010c\u0118\u0120\u0127\u0136\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}