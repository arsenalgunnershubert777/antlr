// Generated from Pascal.g4 by ANTLR 4.9.3

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.Stack;

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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		PROGRAM=18, VAR=19, REALTYPE=20, BOOLEAN=21, AND=22, OR=23, NOT=24, IF=25, 
		THEN=26, ELSE=27, CASE=28, OF=29, BEGIN=30, END=31, READLN=32, WRITELN=33, 
		REAL=34, BOOL=35, TRUE=36, FALSE=37, SQRT=38, SINE=39, COSINE=40, LN=41, 
		EXP=42, NAME=43, STRING=44, WS=45, COMMENT=46;
	public static final int
		RULE_start = 0, RULE_progName = 1, RULE_varDec = 2, RULE_varLists = 3, 
		RULE_varName = 4, RULE_mainBlock = 5, RULE_statFull = 6, RULE_stat = 7, 
		RULE_writeStat = 8, RULE_writeBlock = 9, RULE_readStat = 10, RULE_ifStat = 11, 
		RULE_caseBegin = 12, RULE_caseStat = 13, RULE_boolCase = 14, RULE_checkBoolCase = 15, 
		RULE_elseCase = 16, RULE_checkElseCase = 17, RULE_doubleCase = 18, RULE_checkDoubleCase = 19, 
		RULE_expr = 20, RULE_boolExpr = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "progName", "varDec", "varLists", "varName", "mainBlock", "statFull", 
			"stat", "writeStat", "writeBlock", "readStat", "ifStat", "caseBegin", 
			"caseStat", "boolCase", "checkBoolCase", "elseCase", "checkElseCase", 
			"doubleCase", "checkDoubleCase", "expr", "boolExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'='", "'.'", "':='", "'('", "')'", "'*'", 
			"'/'", "'+'", "'-'", "'<>'", "'<'", "'<='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PROGRAM", "VAR", "REALTYPE", "BOOLEAN", 
			"AND", "OR", "NOT", "IF", "THEN", "ELSE", "CASE", "OF", "BEGIN", "END", 
			"READLN", "WRITELN", "REAL", "BOOL", "TRUE", "FALSE", "SQRT", "SINE", 
			"COSINE", "LN", "EXP", "NAME", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	HashMap<String, Double> real_memory = new HashMap<>();
	HashMap<String, Boolean> bool_memory = new HashMap<>();
	ArrayList<String> variables = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Stack<Boolean> caseStatMatch = new Stack<>();
	final double THRESHOLD = .0001;

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgNameContext progName() {
			return getRuleContext(ProgNameContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PascalParser.EOF, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			progName();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(45);
				varDec();
				}
			}

			setState(48);
			mainBlock();
			setState(49);
			match(EOF);
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

	public static class ProgNameContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalParser.PROGRAM, 0); }
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public ProgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgName(this);
		}
	}

	public final ProgNameContext progName() throws RecognitionException {
		ProgNameContext _localctx = new ProgNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_progName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PROGRAM);
			setState(52);
			match(NAME);
			setState(53);
			match(T__0);
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

	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<VarListsContext> varLists() {
			return getRuleContexts(VarListsContext.class);
		}
		public VarListsContext varLists(int i) {
			return getRuleContext(VarListsContext.class,i);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVarDec(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(VAR);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				varLists();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class VarListsContext extends ParserRuleContext {
		public Token NAME;
		public ExprContext expr;
		public BoolExprContext boolExpr;
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public TerminalNode REALTYPE() { return getToken(PascalParser.REALTYPE, 0); }
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(PascalParser.BOOLEAN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public VarListsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varLists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVarLists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVarLists(this);
		}
	}

	public final VarListsContext varLists() throws RecognitionException {
		VarListsContext _localctx = new VarListsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varLists);
		try {
			int _alt;
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(61);
						varName(true);
						setState(62);
						match(T__1);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(69);
				varName(true);
				setState(70);
				match(T__2);
				setState(71);
				match(REALTYPE);
				setState(72);
				match(T__0);

				        while (!variables.isEmpty()) {
				            String var = variables.remove(0);
				            if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
				                real_memory.put(var, new Double(0.0));
				            }
				        }

				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((VarListsContext)_localctx).NAME = match(NAME);
				setState(76);
				match(T__2);
				setState(77);
				match(REALTYPE);
				setState(78);
				match(T__3);
				setState(79);
				((VarListsContext)_localctx).expr = expr(0);
				setState(80);
				match(T__0);

				        String var = (((VarListsContext)_localctx).NAME!=null?((VarListsContext)_localctx).NAME.getText():null);
				        if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
				            Double value = ((VarListsContext)_localctx).expr.value;        
				            real_memory.put(var, value);
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						varName(true);
						setState(84);
						match(T__1);
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(91);
				varName(true);
				setState(92);
				match(T__2);
				setState(93);
				match(BOOLEAN);
				setState(94);
				match(T__0);

				        while (!variables.isEmpty()) {
				            String var = variables.remove(0);
				            if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
				                bool_memory.put(var, false);
				            }
				        }
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				((VarListsContext)_localctx).NAME = match(NAME);
				setState(98);
				match(T__2);
				setState(99);
				match(BOOLEAN);
				setState(100);
				match(T__3);
				setState(101);
				((VarListsContext)_localctx).boolExpr = boolExpr(0);
				setState(102);
				match(T__0);

				        String var = (((VarListsContext)_localctx).NAME!=null?((VarListsContext)_localctx).NAME.getText():null);
				        if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
				            Boolean bool = ((VarListsContext)_localctx).boolExpr.bool;        
				            bool_memory.put(var, bool);
				        }
				    
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

	public static class VarNameContext extends ParserRuleContext {
		public Boolean active;
		public Token NAME;
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarNameContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVarName(this);
		}
	}

	public final VarNameContext varName(Boolean active) throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState(), active);
		enterRule(_localctx, 8, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((VarNameContext)_localctx).NAME = match(NAME);
			if (_localctx.active) {variables.add((((VarNameContext)_localctx).NAME!=null?((VarNameContext)_localctx).NAME.getText():null));}
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

	public static class MainBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public List<StatFullContext> statFull() {
			return getRuleContexts(StatFullContext.class);
		}
		public StatFullContext statFull(int i) {
			return getRuleContext(StatFullContext.class,i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMainBlock(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(BEGIN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0)) {
				{
				{
				setState(111);
				statFull(true);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(END);
			setState(118);
			match(T__4);
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

	public static class StatFullContext extends ParserRuleContext {
		public Boolean active;
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StatFullContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatFullContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_statFull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStatFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStatFull(this);
		}
	}

	public final StatFullContext statFull(Boolean active) throws RecognitionException {
		StatFullContext _localctx = new StatFullContext(_ctx, getState(), active);
		enterRule(_localctx, 12, RULE_statFull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			stat(_localctx.active);
			setState(121);
			match(T__0);
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

	public static class StatContext extends ParserRuleContext {
		public Boolean active;
		public Token NAME;
		public BoolExprContext boolExpr;
		public ExprContext expr;
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteStatContext writeStat() {
			return getRuleContext(WriteStatContext.class,0);
		}
		public ReadStatContext readStat() {
			return getRuleContext(ReadStatContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public CaseStatContext caseStat() {
			return getRuleContext(CaseStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStat(this);
		}
	}

	public final StatContext stat(Boolean active) throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState(), active);
		enterRule(_localctx, 14, RULE_stat);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((StatContext)_localctx).NAME = match(NAME);
				setState(124);
				match(T__5);
				setState(125);
				((StatContext)_localctx).boolExpr = boolExpr(0);
				if (_localctx.active && bool_memory.containsKey((((StatContext)_localctx).NAME!=null?((StatContext)_localctx).NAME.getText():null))) {bool_memory.put((((StatContext)_localctx).NAME!=null?((StatContext)_localctx).NAME.getText():null), new Boolean(((StatContext)_localctx).boolExpr.bool));}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((StatContext)_localctx).NAME = match(NAME);
				setState(129);
				match(T__5);
				setState(130);
				((StatContext)_localctx).expr = expr(0);
				if (_localctx.active && real_memory.containsKey((((StatContext)_localctx).NAME!=null?((StatContext)_localctx).NAME.getText():null))) {real_memory.put((((StatContext)_localctx).NAME!=null?((StatContext)_localctx).NAME.getText():null), new Double(((StatContext)_localctx).expr.value));}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				writeStat(_localctx.active);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				readStat(_localctx.active);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				ifStat(_localctx.active);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				caseStat(_localctx.active);
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

	public static class WriteStatContext extends ParserRuleContext {
		public Boolean active;
		public TerminalNode WRITELN() { return getToken(PascalParser.WRITELN, 0); }
		public List<WriteBlockContext> writeBlock() {
			return getRuleContexts(WriteBlockContext.class);
		}
		public WriteBlockContext writeBlock(int i) {
			return getRuleContext(WriteBlockContext.class,i);
		}
		public WriteStatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WriteStatContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_writeStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWriteStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWriteStat(this);
		}
	}

	public final WriteStatContext writeStat(Boolean active) throws RecognitionException {
		WriteStatContext _localctx = new WriteStatContext(_ctx, getState(), active);
		enterRule(_localctx, 16, RULE_writeStat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WRITELN);
			setState(140);
			match(T__6);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					writeBlock(_localctx.active);
					setState(142);
					match(T__1);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(149);
			writeBlock(_localctx.active);
			setState(150);
			match(T__7);

			            if (_localctx.active) {
			                System.out.println();
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

	public static class WriteBlockContext extends ParserRuleContext {
		public Boolean active;
		public Token STRING;
		public ExprContext expr;
		public BoolExprContext boolExpr;
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WriteBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WriteBlockContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_writeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWriteBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWriteBlock(this);
		}
	}

	public final WriteBlockContext writeBlock(Boolean active) throws RecognitionException {
		WriteBlockContext _localctx = new WriteBlockContext(_ctx, getState(), active);
		enterRule(_localctx, 18, RULE_writeBlock);
		try {
			int _alt;
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((WriteBlockContext)_localctx).STRING = match(STRING);

				        if (_localctx.active) {
				            String str = (((WriteBlockContext)_localctx).STRING!=null?((WriteBlockContext)_localctx).STRING.getText():null);
				            String out_str = str.substring(1, str.length()-1);
				            System.out.print(out_str);
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						varName(_localctx.active);
						setState(156);
						match(T__1);
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(163);
				varName(_localctx.active);

				        if (_localctx.active) {
				            while (!variables.isEmpty()) {
				                String var = variables.remove(0);
				                if (real_memory.containsKey(var)) { 
				                    System.out.print(real_memory.get(var));
				                }
				                else if (bool_memory.containsKey(var)) {
				                    System.out.print(bool_memory.get(var));
				                }
				            }
				        }

				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				((WriteBlockContext)_localctx).expr = expr(0);
				if (_localctx.active) {System.out.print(((WriteBlockContext)_localctx).expr.value);}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				((WriteBlockContext)_localctx).boolExpr = boolExpr(0);
				if (_localctx.active) {System.out.print(((WriteBlockContext)_localctx).boolExpr.bool);}
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

	public static class ReadStatContext extends ParserRuleContext {
		public Boolean active;
		public TerminalNode READLN() { return getToken(PascalParser.READLN, 0); }
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public ReadStatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReadStatContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_readStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterReadStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitReadStat(this);
		}
	}

	public final ReadStatContext readStat(Boolean active) throws RecognitionException {
		ReadStatContext _localctx = new ReadStatContext(_ctx, getState(), active);
		enterRule(_localctx, 20, RULE_readStat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(READLN);
			setState(175);
			match(T__6);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					varName(true);
					setState(177);
					match(T__1);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(184);
			varName(true);
			setState(185);
			match(T__7);

			            if (_localctx.active) {
			                while (!variables.isEmpty()) {
			                    String var = variables.remove(0);
			                    if (real_memory.containsKey(var)) { 
			                        Double value = sc.nextDouble();
			                        real_memory.put(var, value);
			                    }
			                    else if (bool_memory.containsKey(var)) {
			                        Boolean bool = sc.nextBoolean();
			                        bool_memory.put(var, bool);
			                    }
			                }
			                
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

	public static class IfStatContext extends ParserRuleContext {
		public Boolean active;
		public BoolExprContext nextActive;
		public TerminalNode IF() { return getToken(PascalParser.IF, 0); }
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public List<TerminalNode> BEGIN() { return getTokens(PascalParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(PascalParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(PascalParser.END); }
		public TerminalNode END(int i) {
			return getToken(PascalParser.END, i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StatFullContext> statFull() {
			return getRuleContexts(StatFullContext.class);
		}
		public StatFullContext statFull(int i) {
			return getRuleContext(StatFullContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfStatContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIfStat(this);
		}
	}

	public final IfStatContext ifStat(Boolean active) throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState(), active);
		enterRule(_localctx, 22, RULE_ifStat);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(IF);
				setState(189);
				match(T__6);
				setState(190);
				((IfStatContext)_localctx).nextActive = boolExpr(0);
				setState(191);
				match(T__7);
				setState(192);
				match(THEN);
				setState(193);
				match(BEGIN);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					statFull(_localctx.active && ((IfStatContext)_localctx).nextActive.bool);
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(199);
				match(END);
				setState(200);
				match(ELSE);
				setState(201);
				match(BEGIN);
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					statFull(_localctx.active && !((IfStatContext)_localctx).nextActive.bool);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(207);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(IF);
				setState(210);
				match(T__6);
				setState(211);
				((IfStatContext)_localctx).nextActive = boolExpr(0);
				setState(212);
				match(T__7);
				setState(213);
				match(THEN);
				setState(214);
				match(BEGIN);
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					statFull(_localctx.active && ((IfStatContext)_localctx).nextActive.bool);
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(220);
				match(END);
				setState(221);
				match(ELSE);
				setState(222);
				stat(_localctx.active && !((IfStatContext)_localctx).nextActive.bool);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(IF);
				setState(225);
				match(T__6);
				setState(226);
				((IfStatContext)_localctx).nextActive = boolExpr(0);
				setState(227);
				match(T__7);
				setState(228);
				match(THEN);
				setState(229);
				stat(_localctx.active && ((IfStatContext)_localctx).nextActive.bool);
				setState(230);
				match(ELSE);
				setState(231);
				match(BEGIN);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					statFull(_localctx.active && !((IfStatContext)_localctx).nextActive.bool);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(237);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(IF);
				setState(240);
				match(T__6);
				setState(241);
				((IfStatContext)_localctx).nextActive = boolExpr(0);
				setState(242);
				match(T__7);
				setState(243);
				match(THEN);
				setState(244);
				stat(_localctx.active && ((IfStatContext)_localctx).nextActive.bool);
				setState(245);
				match(ELSE);
				setState(246);
				stat(_localctx.active && !((IfStatContext)_localctx).nextActive.bool);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(IF);
				setState(249);
				match(T__6);
				setState(250);
				((IfStatContext)_localctx).nextActive = boolExpr(0);
				setState(251);
				match(T__7);
				setState(252);
				match(THEN);
				setState(253);
				match(BEGIN);
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					statFull(_localctx.active && ((IfStatContext)_localctx).nextActive.bool);
					}
					}
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(259);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(IF);
				setState(262);
				match(T__6);
				setState(263);
				((IfStatContext)_localctx).nextActive = boolExpr(0);
				setState(264);
				match(T__7);
				setState(265);
				match(THEN);
				setState(266);
				stat(_localctx.active && ((IfStatContext)_localctx).nextActive.bool);
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

	public static class CaseBeginContext extends ParserRuleContext {
		public Boolean active;
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public CaseBeginContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseBeginContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_caseBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCaseBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCaseBegin(this);
		}
	}

	public final CaseBeginContext caseBegin(Boolean active) throws RecognitionException {
		CaseBeginContext _localctx = new CaseBeginContext(_ctx, getState(), active);
		enterRule(_localctx, 24, RULE_caseBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(CASE);
			if (_localctx.active) {caseStatMatch.push(false);}
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

	public static class CaseStatContext extends ParserRuleContext {
		public Boolean active;
		public BoolExprContext boolIndex;
		public ExprContext doubleIndex;
		public CaseBeginContext caseBegin() {
			return getRuleContext(CaseBeginContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<BoolCaseContext> boolCase() {
			return getRuleContexts(BoolCaseContext.class);
		}
		public BoolCaseContext boolCase(int i) {
			return getRuleContext(BoolCaseContext.class,i);
		}
		public ElseCaseContext elseCase() {
			return getRuleContext(ElseCaseContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<DoubleCaseContext> doubleCase() {
			return getRuleContexts(DoubleCaseContext.class);
		}
		public DoubleCaseContext doubleCase(int i) {
			return getRuleContext(DoubleCaseContext.class,i);
		}
		public CaseStatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseStatContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_caseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCaseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCaseStat(this);
		}
	}

	public final CaseStatContext caseStat(Boolean active) throws RecognitionException {
		CaseStatContext _localctx = new CaseStatContext(_ctx, getState(), active);
		enterRule(_localctx, 26, RULE_caseStat);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				caseBegin(_localctx.active);
				setState(274);
				match(T__6);
				setState(275);
				((CaseStatContext)_localctx).boolIndex = boolExpr(0);
				setState(276);
				match(T__7);
				setState(277);
				match(OF);
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278);
					boolCase(_localctx.active, ((CaseStatContext)_localctx).boolIndex.bool);
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL );
				setState(283);
				match(END);
				if (_localctx.active) {caseStatMatch.pop();} 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				caseBegin(_localctx.active);
				setState(287);
				match(T__6);
				setState(288);
				((CaseStatContext)_localctx).boolIndex = boolExpr(0);
				setState(289);
				match(T__7);
				setState(290);
				match(OF);
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(291);
					boolCase(_localctx.active, ((CaseStatContext)_localctx).boolIndex.bool);
					}
					}
					setState(294); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOL );
				setState(296);
				elseCase(_localctx.active);
				setState(297);
				match(END);
				if (_localctx.active) {caseStatMatch.pop();} 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				caseBegin(_localctx.active);
				setState(301);
				match(T__6);
				setState(302);
				((CaseStatContext)_localctx).doubleIndex = expr(0);
				setState(303);
				match(T__7);
				setState(304);
				match(OF);
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(305);
					doubleCase(_localctx.active, ((CaseStatContext)_localctx).doubleIndex.value);
					}
					}
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==REAL );
				setState(310);
				match(END);
				if (_localctx.active) {caseStatMatch.pop();} 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				caseBegin(_localctx.active);
				setState(314);
				match(T__6);
				setState(315);
				((CaseStatContext)_localctx).doubleIndex = expr(0);
				setState(316);
				match(T__7);
				setState(317);
				match(OF);
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(318);
					doubleCase(_localctx.active, ((CaseStatContext)_localctx).doubleIndex.value);
					}
					}
					setState(321); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==REAL );
				setState(323);
				elseCase(_localctx.active);
				setState(324);
				match(END);
				if (_localctx.active) {caseStatMatch.pop();} 
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

	public static class BoolCaseContext extends ParserRuleContext {
		public Boolean active;
		public Boolean index;
		public CheckBoolCaseContext check;
		public List<StatFullContext> statFull() {
			return getRuleContexts(StatFullContext.class);
		}
		public StatFullContext statFull(int i) {
			return getRuleContext(StatFullContext.class,i);
		}
		public CheckBoolCaseContext checkBoolCase() {
			return getRuleContext(CheckBoolCaseContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public BoolCaseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BoolCaseContext(ParserRuleContext parent, int invokingState, Boolean active, Boolean index) {
			super(parent, invokingState);
			this.active = active;
			this.index = index;
		}
		@Override public int getRuleIndex() { return RULE_boolCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBoolCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBoolCase(this);
		}
	}

	public final BoolCaseContext boolCase(Boolean active,Boolean index) throws RecognitionException {
		BoolCaseContext _localctx = new BoolCaseContext(_ctx, getState(), active, index);
		enterRule(_localctx, 28, RULE_boolCase);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				((BoolCaseContext)_localctx).check = checkBoolCase(_localctx.active, _localctx.index);
				setState(330);
				match(T__2);
				setState(331);
				statFull(((BoolCaseContext)_localctx).check.nextActive);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				((BoolCaseContext)_localctx).check = checkBoolCase(_localctx.active, _localctx.index);
				setState(334);
				match(T__2);
				setState(335);
				match(BEGIN);
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(336);
					statFull(((BoolCaseContext)_localctx).check.nextActive);
					}
					}
					setState(339); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(341);
				match(END);
				setState(342);
				match(T__0);
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

	public static class CheckBoolCaseContext extends ParserRuleContext {
		public Boolean active;
		public Boolean index;
		public Boolean nextActive;
		public Token BOOL;
		public TerminalNode BOOL() { return getToken(PascalParser.BOOL, 0); }
		public CheckBoolCaseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CheckBoolCaseContext(ParserRuleContext parent, int invokingState, Boolean active, Boolean index) {
			super(parent, invokingState);
			this.active = active;
			this.index = index;
		}
		@Override public int getRuleIndex() { return RULE_checkBoolCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCheckBoolCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCheckBoolCase(this);
		}
	}

	public final CheckBoolCaseContext checkBoolCase(Boolean active,Boolean index) throws RecognitionException {
		CheckBoolCaseContext _localctx = new CheckBoolCaseContext(_ctx, getState(), active, index);
		enterRule(_localctx, 30, RULE_checkBoolCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((CheckBoolCaseContext)_localctx).BOOL = match(BOOL);

			    if (_localctx.active) {

			        if (caseStatMatch.peek() == false) {
			            ((CheckBoolCaseContext)_localctx).nextActive =  _localctx.index == Boolean.parseBoolean((((CheckBoolCaseContext)_localctx).BOOL!=null?((CheckBoolCaseContext)_localctx).BOOL.getText():null)) ? true : false;
			            if (_localctx.nextActive) {
			                caseStatMatch.pop();
			                caseStatMatch.push(true);
			            }
			        }
			        else {
			            ((CheckBoolCaseContext)_localctx).nextActive =  false;
			        }
			    }
			    else {
			        ((CheckBoolCaseContext)_localctx).nextActive =  false;
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

	public static class ElseCaseContext extends ParserRuleContext {
		public Boolean active;
		public CheckElseCaseContext check;
		public List<StatFullContext> statFull() {
			return getRuleContexts(StatFullContext.class);
		}
		public StatFullContext statFull(int i) {
			return getRuleContext(StatFullContext.class,i);
		}
		public CheckElseCaseContext checkElseCase() {
			return getRuleContext(CheckElseCaseContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public ElseCaseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElseCaseContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_elseCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterElseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitElseCase(this);
		}
	}

	public final ElseCaseContext elseCase(Boolean active) throws RecognitionException {
		ElseCaseContext _localctx = new ElseCaseContext(_ctx, getState(), active);
		enterRule(_localctx, 32, RULE_elseCase);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((ElseCaseContext)_localctx).check = checkElseCase(_localctx.active);
				setState(350);
				match(T__2);
				setState(351);
				statFull(((ElseCaseContext)_localctx).check.nextActive);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				((ElseCaseContext)_localctx).check = checkElseCase(_localctx.active);
				setState(354);
				match(T__2);
				setState(355);
				match(BEGIN);
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(356);
					statFull(((ElseCaseContext)_localctx).check.nextActive);
					}
					}
					setState(359); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(361);
				match(END);
				setState(362);
				match(T__0);
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

	public static class CheckElseCaseContext extends ParserRuleContext {
		public Boolean active;
		public Boolean nextActive;
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public CheckElseCaseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CheckElseCaseContext(ParserRuleContext parent, int invokingState, Boolean active) {
			super(parent, invokingState);
			this.active = active;
		}
		@Override public int getRuleIndex() { return RULE_checkElseCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCheckElseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCheckElseCase(this);
		}
	}

	public final CheckElseCaseContext checkElseCase(Boolean active) throws RecognitionException {
		CheckElseCaseContext _localctx = new CheckElseCaseContext(_ctx, getState(), active);
		enterRule(_localctx, 34, RULE_checkElseCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ELSE);

			    if (_localctx.active) {

			        if (caseStatMatch.peek() == false) {
			            ((CheckElseCaseContext)_localctx).nextActive =  true;
			            if (_localctx.nextActive) {
			                caseStatMatch.pop();
			                caseStatMatch.push(true);
			            }
			        }
			        else {
			            ((CheckElseCaseContext)_localctx).nextActive =  false;
			        }
			    }
			    else {
			        ((CheckElseCaseContext)_localctx).nextActive =  false;
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

	public static class DoubleCaseContext extends ParserRuleContext {
		public Boolean active;
		public Double index;
		public CheckDoubleCaseContext check;
		public List<StatFullContext> statFull() {
			return getRuleContexts(StatFullContext.class);
		}
		public StatFullContext statFull(int i) {
			return getRuleContext(StatFullContext.class,i);
		}
		public CheckDoubleCaseContext checkDoubleCase() {
			return getRuleContext(CheckDoubleCaseContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public DoubleCaseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DoubleCaseContext(ParserRuleContext parent, int invokingState, Boolean active, Double index) {
			super(parent, invokingState);
			this.active = active;
			this.index = index;
		}
		@Override public int getRuleIndex() { return RULE_doubleCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDoubleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDoubleCase(this);
		}
	}

	public final DoubleCaseContext doubleCase(Boolean active,Double index) throws RecognitionException {
		DoubleCaseContext _localctx = new DoubleCaseContext(_ctx, getState(), active, index);
		enterRule(_localctx, 36, RULE_doubleCase);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				((DoubleCaseContext)_localctx).check = checkDoubleCase(_localctx.active, _localctx.index);
				setState(370);
				match(T__2);
				setState(371);
				statFull(((DoubleCaseContext)_localctx).check.nextActive);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((DoubleCaseContext)_localctx).check = checkDoubleCase(_localctx.active, _localctx.index);
				setState(374);
				match(T__2);
				setState(375);
				match(BEGIN);
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(376);
					statFull(((DoubleCaseContext)_localctx).check.nextActive);
					}
					}
					setState(379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CASE) | (1L << READLN) | (1L << WRITELN) | (1L << NAME))) != 0) );
				setState(381);
				match(END);
				setState(382);
				match(T__0);
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

	public static class CheckDoubleCaseContext extends ParserRuleContext {
		public Boolean active;
		public Double index;
		public Boolean nextActive;
		public Token REAL;
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public CheckDoubleCaseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CheckDoubleCaseContext(ParserRuleContext parent, int invokingState, Boolean active, Double index) {
			super(parent, invokingState);
			this.active = active;
			this.index = index;
		}
		@Override public int getRuleIndex() { return RULE_checkDoubleCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCheckDoubleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCheckDoubleCase(this);
		}
	}

	public final CheckDoubleCaseContext checkDoubleCase(Boolean active,Double index) throws RecognitionException {
		CheckDoubleCaseContext _localctx = new CheckDoubleCaseContext(_ctx, getState(), active, index);
		enterRule(_localctx, 38, RULE_checkDoubleCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			((CheckDoubleCaseContext)_localctx).REAL = match(REAL);

			    if (_localctx.active) {

			        if (caseStatMatch.peek() == false) {
			            ((CheckDoubleCaseContext)_localctx).nextActive =  ((Long)Math.round(_localctx.index)) == (Long)Math.round(Double.parseDouble((((CheckDoubleCaseContext)_localctx).REAL!=null?((CheckDoubleCaseContext)_localctx).REAL.getText():null))) ? true : false;
			            if (_localctx.nextActive) {
			                caseStatMatch.pop();
			                caseStatMatch.push(true);
			            }
			        }
			        else {
			            ((CheckDoubleCaseContext)_localctx).nextActive =  false;
			        }
			    }
			    else {
			        ((CheckDoubleCaseContext)_localctx).nextActive =  false;
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

	public static class ExprContext extends ParserRuleContext {
		public Double value;
		public ExprContext el;
		public ExprContext e;
		public ExprContext expr;
		public Token REAL;
		public Token NAME;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SINE() { return getToken(PascalParser.SINE, 0); }
		public TerminalNode COSINE() { return getToken(PascalParser.COSINE, 0); }
		public TerminalNode LN() { return getToken(PascalParser.LN, 0); }
		public TerminalNode EXP() { return getToken(PascalParser.EXP, 0); }
		public TerminalNode SQRT() { return getToken(PascalParser.SQRT, 0); }
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpr(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(390);
				match(T__6);
				setState(391);
				((ExprContext)_localctx).e = ((ExprContext)_localctx).expr = expr(0);
				setState(392);
				match(T__7);
				 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value; 
				}
				break;
			case SINE:
				{
				setState(395);
				match(SINE);
				setState(396);
				match(T__6);
				setState(397);
				((ExprContext)_localctx).expr = expr(0);
				setState(398);
				match(T__7);
				((ExprContext)_localctx).value =  Math.sin(((ExprContext)_localctx).expr.value); 
				}
				break;
			case COSINE:
				{
				setState(401);
				match(COSINE);
				setState(402);
				match(T__6);
				setState(403);
				((ExprContext)_localctx).expr = expr(0);
				setState(404);
				match(T__7);
				((ExprContext)_localctx).value =  Math.cos(((ExprContext)_localctx).expr.value); 
				}
				break;
			case LN:
				{
				setState(407);
				match(LN);
				setState(408);
				match(T__6);
				setState(409);
				((ExprContext)_localctx).expr = expr(0);
				setState(410);
				match(T__7);
				((ExprContext)_localctx).value =  Math.log(((ExprContext)_localctx).expr.value); 
				}
				break;
			case EXP:
				{
				setState(413);
				match(EXP);
				setState(414);
				match(T__6);
				setState(415);
				((ExprContext)_localctx).expr = expr(0);
				setState(416);
				match(T__7);
				((ExprContext)_localctx).value =  Math.exp(((ExprContext)_localctx).expr.value); 
				}
				break;
			case SQRT:
				{
				setState(419);
				match(SQRT);
				setState(420);
				match(T__6);
				setState(421);
				((ExprContext)_localctx).expr = expr(0);
				setState(422);
				match(T__7);
				((ExprContext)_localctx).value =  Math.sqrt(((ExprContext)_localctx).expr.value);
				}
				break;
			case REAL:
				{
				setState(425);
				((ExprContext)_localctx).REAL = match(REAL);
				((ExprContext)_localctx).value =  Double.parseDouble((((ExprContext)_localctx).REAL!=null?((ExprContext)_localctx).REAL.getText():null));
				}
				break;
			case NAME:
				{
				setState(427);
				((ExprContext)_localctx).NAME = match(NAME);

				        Double r = real_memory.get((((ExprContext)_localctx).NAME!=null?((ExprContext)_localctx).NAME.getText():null));
				        if ( r!=null ) ((ExprContext)_localctx).value =  r.doubleValue();
				        else System.err.println("undefined variable "+(((ExprContext)_localctx).NAME!=null?((ExprContext)_localctx).NAME.getText():null));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(431);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(432);
						match(T__8);
						setState(433);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).el.value * ((ExprContext)_localctx).er.value; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(436);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(437);
						match(T__9);
						setState(438);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).el.value / ((ExprContext)_localctx).er.value; 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(441);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(442);
						match(T__10);
						setState(443);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).el.value + ((ExprContext)_localctx).er.value; 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(446);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(447);
						match(T__11);
						setState(448);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(9);
						 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).el.value - ((ExprContext)_localctx).er.value; 
						}
						break;
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class BoolExprContext extends ParserRuleContext {
		public Boolean bool;
		public BoolExprContext bl;
		public BoolExprContext b;
		public ExprContext el;
		public ExprContext er;
		public Token BOOL;
		public Token NAME;
		public BoolExprContext br;
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PascalParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BOOL() { return getToken(PascalParser.BOOL, 0); }
		public TerminalNode NAME() { return getToken(PascalParser.NAME, 0); }
		public TerminalNode AND() { return getToken(PascalParser.AND, 0); }
		public TerminalNode OR() { return getToken(PascalParser.OR, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(457);
				match(T__6);
				setState(458);
				((BoolExprContext)_localctx).b = boolExpr(0);
				setState(459);
				match(T__7);
				 ((BoolExprContext)_localctx).bool =  ((BoolExprContext)_localctx).b.bool; 
				}
				break;
			case 2:
				{
				setState(462);
				match(NOT);
				setState(463);
				((BoolExprContext)_localctx).b = boolExpr(11);
				((BoolExprContext)_localctx).bool =  !((BoolExprContext)_localctx).b.bool;
				}
				break;
			case 3:
				{
				setState(466);
				((BoolExprContext)_localctx).el = expr(0);
				setState(467);
				match(T__3);
				setState(468);
				((BoolExprContext)_localctx).er = expr(0);
				((BoolExprContext)_localctx).bool =  Math.abs(((BoolExprContext)_localctx).el.value - ((BoolExprContext)_localctx).er.value) < THRESHOLD ? true : false;
				}
				break;
			case 4:
				{
				setState(471);
				((BoolExprContext)_localctx).el = expr(0);
				setState(472);
				match(T__12);
				setState(473);
				((BoolExprContext)_localctx).er = expr(0);
				((BoolExprContext)_localctx).bool =  Math.abs(((BoolExprContext)_localctx).el.value - ((BoolExprContext)_localctx).er.value) > THRESHOLD ? true : false;
				}
				break;
			case 5:
				{
				setState(476);
				((BoolExprContext)_localctx).el = expr(0);
				setState(477);
				match(T__13);
				setState(478);
				((BoolExprContext)_localctx).er = expr(0);
				((BoolExprContext)_localctx).bool =  ((BoolExprContext)_localctx).el.value < ((BoolExprContext)_localctx).er.value ? true : false;
				}
				break;
			case 6:
				{
				setState(481);
				((BoolExprContext)_localctx).el = expr(0);
				setState(482);
				match(T__14);
				setState(483);
				((BoolExprContext)_localctx).er = expr(0);
				((BoolExprContext)_localctx).bool =  ((BoolExprContext)_localctx).el.value <= ((BoolExprContext)_localctx).er.value ? true : false;
				}
				break;
			case 7:
				{
				setState(486);
				((BoolExprContext)_localctx).el = expr(0);
				setState(487);
				match(T__15);
				setState(488);
				((BoolExprContext)_localctx).er = expr(0);
				((BoolExprContext)_localctx).bool =  ((BoolExprContext)_localctx).el.value > ((BoolExprContext)_localctx).er.value ? true : false;
				}
				break;
			case 8:
				{
				setState(491);
				((BoolExprContext)_localctx).el = expr(0);
				setState(492);
				match(T__16);
				setState(493);
				((BoolExprContext)_localctx).er = expr(0);
				((BoolExprContext)_localctx).bool =  ((BoolExprContext)_localctx).el.value >= ((BoolExprContext)_localctx).er.value ? true : false;
				}
				break;
			case 9:
				{
				setState(496);
				((BoolExprContext)_localctx).BOOL = match(BOOL);
				((BoolExprContext)_localctx).bool =  Boolean.parseBoolean((((BoolExprContext)_localctx).BOOL!=null?((BoolExprContext)_localctx).BOOL.getText():null));
				}
				break;
			case 10:
				{
				setState(498);
				((BoolExprContext)_localctx).NAME = match(NAME);

				        Boolean b = bool_memory.get((((BoolExprContext)_localctx).NAME!=null?((BoolExprContext)_localctx).NAME.getText():null));
				        if ( b!=null ) ((BoolExprContext)_localctx).bool =  b.booleanValue();
				        else System.err.println("undefined variable "+(((BoolExprContext)_localctx).NAME!=null?((BoolExprContext)_localctx).NAME.getText():null));
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						_localctx.bl = _prevctx;
						_localctx.bl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(502);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(503);
						match(AND);
						setState(504);
						((BoolExprContext)_localctx).br = boolExpr(11);
						((BoolExprContext)_localctx).bool =  ((BoolExprContext)_localctx).bl.bool && ((BoolExprContext)_localctx).br.bool;
						}
						break;
					case 2:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						_localctx.bl = _prevctx;
						_localctx.bl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(507);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(508);
						match(OR);
						setState(509);
						((BoolExprContext)_localctx).br = boolExpr(10);
						((BoolExprContext)_localctx).bool =  ((BoolExprContext)_localctx).bl.bool || ((BoolExprContext)_localctx).br.bool;
						}
						break;
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 21:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0208\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\6\4<\n\4\r\4\16\4=\3\5\3\5\3\5\7"+
		"\5C\n\5\f\5\16\5F\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\7\3\7\7\7s\n\7"+
		"\f\7\16\7v\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u0093"+
		"\n\n\f\n\16\n\u0096\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00af\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u00b6\n\f\f\f\16\f"+
		"\u00b9\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00c6\n\r"+
		"\r\r\16\r\u00c7\3\r\3\r\3\r\3\r\6\r\u00ce\n\r\r\r\16\r\u00cf\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00db\n\r\r\r\16\r\u00dc\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00ec\n\r\r\r\16\r\u00ed\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\6\r\u0102\n\r\r\r\16\r\u0103\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u010f\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u011a\n\17"+
		"\r\17\16\17\u011b\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u0127"+
		"\n\17\r\17\16\17\u0128\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\6\17\u0135\n\17\r\17\16\17\u0136\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\6\17\u0142\n\17\r\17\16\17\u0143\3\17\3\17\3\17\3\17\5\17\u014a"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u0154\n\20\r\20\16"+
		"\20\u0155\3\20\3\20\3\20\5\20\u015b\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\6\22\u0168\n\22\r\22\16\22\u0169\3\22\3\22\3"+
		"\22\5\22\u016f\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\6\24\u017c\n\24\r\24\16\24\u017d\3\24\3\24\3\24\5\24\u0183\n\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u01b0\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01c6\n\26\f\26"+
		"\16\26\u01c9\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u01f7\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0203\n\27\f\27\16\27\u0206\13\27\3\27"+
		"\2\4*,\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u0231\2"+
		".\3\2\2\2\4\65\3\2\2\2\69\3\2\2\2\bk\3\2\2\2\nm\3\2\2\2\fp\3\2\2\2\16"+
		"z\3\2\2\2\20\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u00ae\3\2\2\2\26\u00b0"+
		"\3\2\2\2\30\u010e\3\2\2\2\32\u0110\3\2\2\2\34\u0149\3\2\2\2\36\u015a\3"+
		"\2\2\2 \u015c\3\2\2\2\"\u016e\3\2\2\2$\u0170\3\2\2\2&\u0182\3\2\2\2(\u0184"+
		"\3\2\2\2*\u01af\3\2\2\2,\u01f6\3\2\2\2.\60\5\4\3\2/\61\5\6\4\2\60/\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\5\f\7\2\63\64\7\2\2\3\64\3\3\2"+
		"\2\2\65\66\7\24\2\2\66\67\7-\2\2\678\7\3\2\28\5\3\2\2\29;\7\25\2\2:<\5"+
		"\b\5\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?@\5\n\6\2@A"+
		"\7\4\2\2AC\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F"+
		"D\3\2\2\2GH\5\n\6\2HI\7\5\2\2IJ\7\26\2\2JK\7\3\2\2KL\b\5\1\2Ll\3\2\2\2"+
		"MN\7-\2\2NO\7\5\2\2OP\7\26\2\2PQ\7\6\2\2QR\5*\26\2RS\7\3\2\2ST\b\5\1\2"+
		"Tl\3\2\2\2UV\5\n\6\2VW\7\4\2\2WY\3\2\2\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5\n\6\2^_\7\5\2\2_`\7\27\2\2`a\7\3"+
		"\2\2ab\b\5\1\2bl\3\2\2\2cd\7-\2\2de\7\5\2\2ef\7\27\2\2fg\7\6\2\2gh\5,"+
		"\27\2hi\7\3\2\2ij\b\5\1\2jl\3\2\2\2kD\3\2\2\2kM\3\2\2\2kZ\3\2\2\2kc\3"+
		"\2\2\2l\t\3\2\2\2mn\7-\2\2no\b\6\1\2o\13\3\2\2\2pt\7 \2\2qs\5\16\b\2r"+
		"q\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7!\2\2x"+
		"y\7\7\2\2y\r\3\2\2\2z{\5\20\t\2{|\7\3\2\2|\17\3\2\2\2}~\7-\2\2~\177\7"+
		"\b\2\2\177\u0080\5,\27\2\u0080\u0081\b\t\1\2\u0081\u008c\3\2\2\2\u0082"+
		"\u0083\7-\2\2\u0083\u0084\7\b\2\2\u0084\u0085\5*\26\2\u0085\u0086\b\t"+
		"\1\2\u0086\u008c\3\2\2\2\u0087\u008c\5\22\n\2\u0088\u008c\5\26\f\2\u0089"+
		"\u008c\5\30\r\2\u008a\u008c\5\34\17\2\u008b}\3\2\2\2\u008b\u0082\3\2\2"+
		"\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\21\3\2\2\2\u008d\u008e\7#\2\2\u008e\u0094\7\t\2\2\u008f"+
		"\u0090\5\24\13\2\u0090\u0091\7\4\2\2\u0091\u0093\3\2\2\2\u0092\u008f\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7"+
		"\n\2\2\u0099\u009a\b\n\1\2\u009a\23\3\2\2\2\u009b\u009c\7.\2\2\u009c\u00af"+
		"\b\13\1\2\u009d\u009e\5\n\6\2\u009e\u009f\7\4\2\2\u009f\u00a1\3\2\2\2"+
		"\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\n\6\2\u00a6"+
		"\u00a7\b\13\1\2\u00a7\u00af\3\2\2\2\u00a8\u00a9\5*\26\2\u00a9\u00aa\b"+
		"\13\1\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\5,\27\2\u00ac\u00ad\b\13\1\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u009b\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a8\3\2"+
		"\2\2\u00ae\u00ab\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b7"+
		"\7\t\2\2\u00b2\u00b3\5\n\6\2\u00b3\u00b4\7\4\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5\n\6\2\u00bb"+
		"\u00bc\7\n\2\2\u00bc\u00bd\b\f\1\2\u00bd\27\3\2\2\2\u00be\u00bf\7\33\2"+
		"\2\u00bf\u00c0\7\t\2\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3"+
		"\7\34\2\2\u00c3\u00c5\7 \2\2\u00c4\u00c6\5\16\b\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\7!\2\2\u00ca\u00cb\7\35\2\2\u00cb\u00cd\7 \2\2\u00cc"+
		"\u00ce\5\16\b\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7!\2\2\u00d2"+
		"\u010f\3\2\2\2\u00d3\u00d4\7\33\2\2\u00d4\u00d5\7\t\2\2\u00d5\u00d6\5"+
		",\27\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\7\34\2\2\u00d8\u00da\7 \2\2\u00d9"+
		"\u00db\5\16\b\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7!\2\2\u00df"+
		"\u00e0\7\35\2\2\u00e0\u00e1\5\20\t\2\u00e1\u010f\3\2\2\2\u00e2\u00e3\7"+
		"\33\2\2\u00e3\u00e4\7\t\2\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\7\n\2\2\u00e6"+
		"\u00e7\7\34\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00e9\7\35\2\2\u00e9\u00eb"+
		"\7 \2\2\u00ea\u00ec\5\16\b\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7!"+
		"\2\2\u00f0\u010f\3\2\2\2\u00f1\u00f2\7\33\2\2\u00f2\u00f3\7\t\2\2\u00f3"+
		"\u00f4\5,\27\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\7\34\2\2\u00f6\u00f7\5"+
		"\20\t\2\u00f7\u00f8\7\35\2\2\u00f8\u00f9\5\20\t\2\u00f9\u010f\3\2\2\2"+
		"\u00fa\u00fb\7\33\2\2\u00fb\u00fc\7\t\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe"+
		"\7\n\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0101\7 \2\2\u0100\u0102\5\16\b\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7!\2\2\u0106\u010f\3\2\2\2\u0107"+
		"\u0108\7\33\2\2\u0108\u0109\7\t\2\2\u0109\u010a\5,\27\2\u010a\u010b\7"+
		"\n\2\2\u010b\u010c\7\34\2\2\u010c\u010d\5\20\t\2\u010d\u010f\3\2\2\2\u010e"+
		"\u00be\3\2\2\2\u010e\u00d3\3\2\2\2\u010e\u00e2\3\2\2\2\u010e\u00f1\3\2"+
		"\2\2\u010e\u00fa\3\2\2\2\u010e\u0107\3\2\2\2\u010f\31\3\2\2\2\u0110\u0111"+
		"\7\36\2\2\u0111\u0112\b\16\1\2\u0112\33\3\2\2\2\u0113\u0114\5\32\16\2"+
		"\u0114\u0115\7\t\2\2\u0115\u0116\5,\27\2\u0116\u0117\7\n\2\2\u0117\u0119"+
		"\7\37\2\2\u0118\u011a\5\36\20\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2"+
		"\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\7!\2\2\u011e\u011f\b\17\1\2\u011f\u014a\3\2\2\2\u0120\u0121\5\32\16\2"+
		"\u0121\u0122\7\t\2\2\u0122\u0123\5,\27\2\u0123\u0124\7\n\2\2\u0124\u0126"+
		"\7\37\2\2\u0125\u0127\5\36\20\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2"+
		"\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\5\"\22\2\u012b\u012c\7!\2\2\u012c\u012d\b\17\1\2\u012d\u014a\3\2\2\2"+
		"\u012e\u012f\5\32\16\2\u012f\u0130\7\t\2\2\u0130\u0131\5*\26\2\u0131\u0132"+
		"\7\n\2\2\u0132\u0134\7\37\2\2\u0133\u0135\5&\24\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0139\7!\2\2\u0139\u013a\b\17\1\2\u013a\u014a\3\2\2\2\u013b"+
		"\u013c\5\32\16\2\u013c\u013d\7\t\2\2\u013d\u013e\5*\26\2\u013e\u013f\7"+
		"\n\2\2\u013f\u0141\7\37\2\2\u0140\u0142\5&\24\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0146\5\"\22\2\u0146\u0147\7!\2\2\u0147\u0148\b\17\1\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0113\3\2\2\2\u0149\u0120\3\2\2\2\u0149\u012e\3\2"+
		"\2\2\u0149\u013b\3\2\2\2\u014a\35\3\2\2\2\u014b\u014c\5 \21\2\u014c\u014d"+
		"\7\5\2\2\u014d\u014e\5\16\b\2\u014e\u015b\3\2\2\2\u014f\u0150\5 \21\2"+
		"\u0150\u0151\7\5\2\2\u0151\u0153\7 \2\2\u0152\u0154\5\16\b\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\7!\2\2\u0158\u0159\7\3\2\2\u0159\u015b\3\2"+
		"\2\2\u015a\u014b\3\2\2\2\u015a\u014f\3\2\2\2\u015b\37\3\2\2\2\u015c\u015d"+
		"\7%\2\2\u015d\u015e\b\21\1\2\u015e!\3\2\2\2\u015f\u0160\5$\23\2\u0160"+
		"\u0161\7\5\2\2\u0161\u0162\5\16\b\2\u0162\u016f\3\2\2\2\u0163\u0164\5"+
		"$\23\2\u0164\u0165\7\5\2\2\u0165\u0167\7 \2\2\u0166\u0168\5\16\b\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7!\2\2\u016c\u016d\7\3\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u015f\3\2\2\2\u016e\u0163\3\2\2\2\u016f#\3\2\2\2"+
		"\u0170\u0171\7\35\2\2\u0171\u0172\b\23\1\2\u0172%\3\2\2\2\u0173\u0174"+
		"\5(\25\2\u0174\u0175\7\5\2\2\u0175\u0176\5\16\b\2\u0176\u0183\3\2\2\2"+
		"\u0177\u0178\5(\25\2\u0178\u0179\7\5\2\2\u0179\u017b\7 \2\2\u017a\u017c"+
		"\5\16\b\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7!\2\2\u0180\u0181"+
		"\7\3\2\2\u0181\u0183\3\2\2\2\u0182\u0173\3\2\2\2\u0182\u0177\3\2\2\2\u0183"+
		"\'\3\2\2\2\u0184\u0185\7$\2\2\u0185\u0186\b\25\1\2\u0186)\3\2\2\2\u0187"+
		"\u0188\b\26\1\2\u0188\u0189\7\t\2\2\u0189\u018a\5*\26\2\u018a\u018b\7"+
		"\n\2\2\u018b\u018c\b\26\1\2\u018c\u01b0\3\2\2\2\u018d\u018e\7)\2\2\u018e"+
		"\u018f\7\t\2\2\u018f\u0190\5*\26\2\u0190\u0191\7\n\2\2\u0191\u0192\b\26"+
		"\1\2\u0192\u01b0\3\2\2\2\u0193\u0194\7*\2\2\u0194\u0195\7\t\2\2\u0195"+
		"\u0196\5*\26\2\u0196\u0197\7\n\2\2\u0197\u0198\b\26\1\2\u0198\u01b0\3"+
		"\2\2\2\u0199\u019a\7+\2\2\u019a\u019b\7\t\2\2\u019b\u019c\5*\26\2\u019c"+
		"\u019d\7\n\2\2\u019d\u019e\b\26\1\2\u019e\u01b0\3\2\2\2\u019f\u01a0\7"+
		",\2\2\u01a0\u01a1\7\t\2\2\u01a1\u01a2\5*\26\2\u01a2\u01a3\7\n\2\2\u01a3"+
		"\u01a4\b\26\1\2\u01a4\u01b0\3\2\2\2\u01a5\u01a6\7(\2\2\u01a6\u01a7\7\t"+
		"\2\2\u01a7\u01a8\5*\26\2\u01a8\u01a9\7\n\2\2\u01a9\u01aa\b\26\1\2\u01aa"+
		"\u01b0\3\2\2\2\u01ab\u01ac\7$\2\2\u01ac\u01b0\b\26\1\2\u01ad\u01ae\7-"+
		"\2\2\u01ae\u01b0\b\26\1\2\u01af\u0187\3\2\2\2\u01af\u018d\3\2\2\2\u01af"+
		"\u0193\3\2\2\2\u01af\u0199\3\2\2\2\u01af\u019f\3\2\2\2\u01af\u01a5\3\2"+
		"\2\2\u01af\u01ab\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01c7\3\2\2\2\u01b1"+
		"\u01b2\f\r\2\2\u01b2\u01b3\7\13\2\2\u01b3\u01b4\5*\26\16\u01b4\u01b5\b"+
		"\26\1\2\u01b5\u01c6\3\2\2\2\u01b6\u01b7\f\f\2\2\u01b7\u01b8\7\f\2\2\u01b8"+
		"\u01b9\5*\26\r\u01b9\u01ba\b\26\1\2\u01ba\u01c6\3\2\2\2\u01bb\u01bc\f"+
		"\13\2\2\u01bc\u01bd\7\r\2\2\u01bd\u01be\5*\26\f\u01be\u01bf\b\26\1\2\u01bf"+
		"\u01c6\3\2\2\2\u01c0\u01c1\f\n\2\2\u01c1\u01c2\7\16\2\2\u01c2\u01c3\5"+
		"*\26\13\u01c3\u01c4\b\26\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01b1\3\2\2\2\u01c5"+
		"\u01b6\3\2\2\2\u01c5\u01bb\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c6\u01c9\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8+\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01ca\u01cb\b\27\1\2\u01cb\u01cc\7\t\2\2\u01cc\u01cd\5,\27\2"+
		"\u01cd\u01ce\7\n\2\2\u01ce\u01cf\b\27\1\2\u01cf\u01f7\3\2\2\2\u01d0\u01d1"+
		"\7\32\2\2\u01d1\u01d2\5,\27\r\u01d2\u01d3\b\27\1\2\u01d3\u01f7\3\2\2\2"+
		"\u01d4\u01d5\5*\26\2\u01d5\u01d6\7\6\2\2\u01d6\u01d7\5*\26\2\u01d7\u01d8"+
		"\b\27\1\2\u01d8\u01f7\3\2\2\2\u01d9\u01da\5*\26\2\u01da\u01db\7\17\2\2"+
		"\u01db\u01dc\5*\26\2\u01dc\u01dd\b\27\1\2\u01dd\u01f7\3\2\2\2\u01de\u01df"+
		"\5*\26\2\u01df\u01e0\7\20\2\2\u01e0\u01e1\5*\26\2\u01e1\u01e2\b\27\1\2"+
		"\u01e2\u01f7\3\2\2\2\u01e3\u01e4\5*\26\2\u01e4\u01e5\7\21\2\2\u01e5\u01e6"+
		"\5*\26\2\u01e6\u01e7\b\27\1\2\u01e7\u01f7\3\2\2\2\u01e8\u01e9\5*\26\2"+
		"\u01e9\u01ea\7\22\2\2\u01ea\u01eb\5*\26\2\u01eb\u01ec\b\27\1\2\u01ec\u01f7"+
		"\3\2\2\2\u01ed\u01ee\5*\26\2\u01ee\u01ef\7\23\2\2\u01ef\u01f0\5*\26\2"+
		"\u01f0\u01f1\b\27\1\2\u01f1\u01f7\3\2\2\2\u01f2\u01f3\7%\2\2\u01f3\u01f7"+
		"\b\27\1\2\u01f4\u01f5\7-\2\2\u01f5\u01f7\b\27\1\2\u01f6\u01ca\3\2\2\2"+
		"\u01f6\u01d0\3\2\2\2\u01f6\u01d4\3\2\2\2\u01f6\u01d9\3\2\2\2\u01f6\u01de"+
		"\3\2\2\2\u01f6\u01e3\3\2\2\2\u01f6\u01e8\3\2\2\2\u01f6\u01ed\3\2\2\2\u01f6"+
		"\u01f2\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u0204\3\2\2\2\u01f8\u01f9\f\f"+
		"\2\2\u01f9\u01fa\7\30\2\2\u01fa\u01fb\5,\27\r\u01fb\u01fc\b\27\1\2\u01fc"+
		"\u0203\3\2\2\2\u01fd\u01fe\f\13\2\2\u01fe\u01ff\7\31\2\2\u01ff\u0200\5"+
		",\27\f\u0200\u0201\b\27\1\2\u0201\u0203\3\2\2\2\u0202\u01f8\3\2\2\2\u0202"+
		"\u01fd\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205-\3\2\2\2\u0206\u0204\3\2\2\2$\60=DZkt\u008b\u0094\u00a2\u00ae"+
		"\u00b7\u00c7\u00cf\u00dc\u00ed\u0103\u010e\u011b\u0128\u0136\u0143\u0149"+
		"\u0155\u015a\u0169\u016e\u017d\u0182\u01af\u01c5\u01c7\u01f6\u0202\u0204";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}