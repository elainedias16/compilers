// Generated from /home/elaine/Documents/git/compilers/compiler/cp2/PascalParser.g by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
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
	public String getGrammarFileName() { return "PascalParser.g"; }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << WRITELN) | (1L << ID))) != 0)) {
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERISK) | (1L << SLASH) | (1L << MOD))) != 0)) ) {
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << NOTEQUAL) | (1L << LEQ) | (1L << BEQ))) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << BOOLEAN) | (1L << STRING) | (1L << CHAR))) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_VAL) | (1L << REAL_VAL) | (1L << CHAR_VAL) | (1L << STRING_VAL) | (1L << BOOLEAN_VAL))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4>\n\4\3\4\5\4A\n\4\3"+
		"\4\5\4D\n\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\6\4M\n\4\r\4\16\4N\3\5\3\5"+
		"\5\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6[\n\6\r\6\16\6\\\3\7\3\7\3\7\3\7"+
		"\6\7c\n\7\r\7\16\7d\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\3\b\5"+
		"\br\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u008e\n\f\f\f\16\f"+
		"\u0091\13\f\3\f\3\f\3\f\5\f\u0096\n\f\3\f\5\f\u0099\n\f\3\f\5\f\u009c"+
		"\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\r\3\r\5\r\u00b3\n\r\3\r\5\r\u00b6\n\r"+
		"\3\r\3\r\3\r\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00d5\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00e2\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00ea\n\21\f\21\16\21\u00ed\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fc\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0107\n\22\f\22\16\22\u010a\13\22\3\23\3\23"+
		"\3\23\5\23\u010f\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u011b\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0123\n\25\3\25\3"+
		"\25\3\25\7\25\u0128\n\25\f\25\16\25\u012b\13\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0139\n\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0142\n\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\2\5 \"(\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\2\n\4\2\63\6388\4\2\36\37//\3\2\34\35\4\2 \"+-\4\2  ++\3\2\61\62\3\2"+
		"\f\20\3\2\63\67\2\u0167\2\64\3\2\2\2\4\66\3\2\2\2\6=\3\2\2\2\bR\3\2\2"+
		"\2\nT\3\2\2\2\f^\3\2\2\2\16q\3\2\2\2\20s\3\2\2\2\22x\3\2\2\2\24\u0083"+
		"\3\2\2\2\26\u0088\3\2\2\2\30\u00a0\3\2\2\2\32\u00ba\3\2\2\2\34\u00c9\3"+
		"\2\2\2\36\u00cb\3\2\2\2 \u00e1\3\2\2\2\"\u00fb\3\2\2\2$\u010b\3\2\2\2"+
		"&\u0114\3\2\2\2(\u0122\3\2\2\2*\u012c\3\2\2\2,\u0132\3\2\2\2.\u013d\3"+
		"\2\2\2\60\u0146\3\2\2\2\62\u0148\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\66"+
		"\67\7\5\2\2\678\78\2\289\7(\2\29:\5\6\4\2:;\7%\2\2;\5\3\2\2\2<>\5\n\6"+
		"\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\f\7\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2"+
		"\2BD\5\n\6\2CB\3\2\2\2CD\3\2\2\2DH\3\2\2\2EG\5\b\5\2FE\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\5\32\16\2LK\3\2\2\2MN\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PS\5\26\f\2QS\5\30\r\2RP\3\2\2\2RQ"+
		"\3\2\2\2S\t\3\2\2\2TZ\7\6\2\2UV\78\2\2VW\7 \2\2WX\5\62\32\2XY\7(\2\2Y"+
		"[\3\2\2\2ZU\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^b\7\7"+
		"\2\2_`\5\16\b\2`a\7(\2\2ac\3\2\2\2b_\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2e\r\3\2\2\2fk\78\2\2gh\7&\2\2hj\78\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\'\2\2or\5\60\31\2pr\5\22\n\2qf\3"+
		"\2\2\2qp\3\2\2\2r\17\3\2\2\2st\7\6\2\2tu\78\2\2uv\7\'\2\2vw\5\60\31\2"+
		"w\21\3\2\2\2xy\78\2\2yz\7\'\2\2z{\7\21\2\2{|\7#\2\2|}\7\63\2\2}~\7\22"+
		"\2\2~\177\7\63\2\2\177\u0080\7$\2\2\u0080\u0081\7\23\2\2\u0081\u0082\5"+
		"\60\31\2\u0082\23\3\2\2\2\u0083\u0084\78\2\2\u0084\u0085\7#\2\2\u0085"+
		"\u0086\t\2\2\2\u0086\u0087\7$\2\2\u0087\25\3\2\2\2\u0088\u0089\7\13\2"+
		"\2\u0089\u008a\78\2\2\u008a\u008f\7)\2\2\u008b\u008e\5\16\b\2\u008c\u008e"+
		"\5\20\t\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0093\7*\2\2\u0093\u0095\7(\2\2\u0094\u0096\5\n\6\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\f"+
		"\7\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\5\n\6\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\5\32\16\2\u009e\u009f\7(\2\2\u009f\27\3\2\2\2\u00a0\u00a1"+
		"\7\n\2\2\u00a1\u00a2\78\2\2\u00a2\u00a7\7)\2\2\u00a3\u00a6\5\16\b\2\u00a4"+
		"\u00a6\5\20\t\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\u00ae\7\'\2\2\u00ac\u00af\5\60"+
		"\31\2\u00ad\u00af\5\22\n\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\7(\2\2\u00b1\u00b3\5\n\6\2\u00b2\u00b1\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\5\f\7\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\32"+
		"\16\2\u00b8\u00b9\7(\2\2\u00b9\31\3\2\2\2\u00ba\u00be\7\b\2\2\u00bb\u00bd"+
		"\5\34\17\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\7\t\2\2\u00c2\33\3\2\2\2\u00c3\u00ca\5\36\20\2\u00c4\u00ca\5$\23\2\u00c5"+
		"\u00ca\5&\24\2\u00c6\u00ca\5*\26\2\u00c7\u00ca\5.\30\2\u00c8\u00ca\5,"+
		"\27\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\35\3\2\2"+
		"\2\u00cb\u00cc\78\2\2\u00cc\u00d4\7.\2\2\u00cd\u00d5\5 \21\2\u00ce\u00d5"+
		"\5\"\22\2\u00cf\u00d5\7\17\2\2\u00d0\u00d5\7\20\2\2\u00d1\u00d5\5\22\n"+
		"\2\u00d2\u00d5\5\24\13\2\u00d3\u00d5\5\62\32\2\u00d4\u00cd\3\2\2\2\u00d4"+
		"\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\7(\2\2\u00d7\37\3\2\2\2\u00d8\u00d9\b\21\1\2\u00d9\u00da\7)\2\2"+
		"\u00da\u00db\5 \21\2\u00db\u00dc\7*\2\2\u00dc\u00e2\3\2\2\2\u00dd\u00e2"+
		"\7\63\2\2\u00de\u00e2\7\64\2\2\u00df\u00e2\5\24\13\2\u00e0\u00e2\78\2"+
		"\2\u00e1\u00d8\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\f\b\2\2\u00e4"+
		"\u00e5\t\3\2\2\u00e5\u00ea\5 \21\t\u00e6\u00e7\f\7\2\2\u00e7\u00e8\t\4"+
		"\2\2\u00e8\u00ea\5 \21\b\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec!\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ee\u00ef\b\22\1\2\u00ef\u00f0\7)\2\2\u00f0\u00f1"+
		"\5\"\22\2\u00f1\u00f2\7*\2\2\u00f2\u00fc\3\2\2\2\u00f3\u00f4\5 \21\2\u00f4"+
		"\u00f5\t\5\2\2\u00f5\u00f6\5 \21\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\7\33"+
		"\2\2\u00f8\u00fc\5\"\22\7\u00f9\u00fc\7\67\2\2\u00fa\u00fc\78\2\2\u00fb"+
		"\u00ee\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\u0108\3\2\2\2\u00fd\u00fe\f\t\2\2\u00fe"+
		"\u00ff\t\6\2\2\u00ff\u0107\5\"\22\n\u0100\u0101\f\6\2\2\u0101\u0102\7"+
		"\31\2\2\u0102\u0107\5\"\22\7\u0103\u0104\f\5\2\2\u0104\u0105\7\32\2\2"+
		"\u0105\u0107\5\"\22\6\u0106\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"#\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010e\7\27\2\2\u010c\u010f\5\"\22"+
		"\2\u010d\u010f\5 \21\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\7\30\2\2\u0111\u0112\5\32\16\2\u0112\u0113\7(\2\2"+
		"\u0113%\3\2\2\2\u0114\u0115\7\24\2\2\u0115\u0116\5\"\22\2\u0116\u0117"+
		"\7\25\2\2\u0117\u011a\5\32\16\2\u0118\u0119\7\26\2\2\u0119\u011b\5\32"+
		"\16\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\7(\2\2\u011d\'\3\2\2\2\u011e\u011f\b\25\1\2\u011f\u0123\5 \21\2"+
		"\u0120\u0123\5\"\22\2\u0121\u0123\5*\26\2\u0122\u011e\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0129\3\2\2\2\u0124\u0125\f\3\2\2\u0125"+
		"\u0126\7&\2\2\u0126\u0128\5(\25\4\u0127\u0124\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a)\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012d\78\2\2\u012d\u012e\7)\2\2\u012e\u012f\5(\25\2\u012f"+
		"\u0130\7*\2\2\u0130\u0131\7(\2\2\u0131+\3\2\2\2\u0132\u0133\t\7\2\2\u0133"+
		"\u0138\7)\2\2\u0134\u0139\5\62\32\2\u0135\u0139\78\2\2\u0136\u0139\5\""+
		"\22\2\u0137\u0139\5 \21\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7*"+
		"\2\2\u013b\u013c\7(\2\2\u013c-\3\2\2\2\u013d\u013e\7\60\2\2\u013e\u0141"+
		"\7)\2\2\u013f\u0142\78\2\2\u0140\u0142\5\24\13\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7*\2\2\u0144\u0145\7(\2"+
		"\2\u0145/\3\2\2\2\u0146\u0147\t\b\2\2\u0147\61\3\2\2\2\u0148\u0149\t\t"+
		"\2\2\u0149\63\3\2\2\2%=@CHNR\\dkq\u008d\u008f\u0095\u0098\u009b\u00a5"+
		"\u00a7\u00ae\u00b2\u00b5\u00be\u00c9\u00d4\u00e1\u00e9\u00eb\u00fb\u0106"+
		"\u0108\u010e\u011a\u0122\u0129\u0138\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}