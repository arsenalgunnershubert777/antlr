// Generated from Pascal.g4 by ANTLR 4.9.3

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.Stack;

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"PROGRAM", "VAR", "REALTYPE", "BOOLEAN", "AND", "OR", "NOT", "IF", "THEN", 
			"ELSE", "CASE", "OF", "BEGIN", "END", "READLN", "WRITELN", "REAL", "BOOL", 
			"TRUE", "FALSE", "SQRT", "SINE", "COSINE", "LN", "EXP", "NAME", "STRING", 
			"WS", "COMMENT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
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


	HashMap<String, Double> real_memory = new HashMap<>();
	HashMap<String, Boolean> bool_memory = new HashMap<>();
	ArrayList<String> variables = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Stack<Boolean> caseStatMatch = new Stack<>();
	final double THRESHOLD = .0001;


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0198\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\5#\u010d"+
		"\n#\3#\7#\u0110\n#\f#\16#\u0113\13#\3#\5#\u0116\n#\3#\6#\u0119\n#\r#\16"+
		"#\u011a\3$\3$\5$\u011f\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\7,\u0142\n"+
		",\f,\16,\u0145\13,\3-\3-\7-\u0149\n-\f-\16-\u014c\13-\3-\3-\3.\6.\u0151"+
		"\n.\r.\16.\u0152\3.\3.\3/\3/\3/\3/\7/\u015b\n/\f/\16/\u015e\13/\3/\3/"+
		"\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\4\u014a\u015c"+
		"\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\3\2!\3\2//\3\2\62;\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh"+
		"\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2Q"+
		"Qqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\2\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\3\u0093\3\2\2\2\5\u0095\3\2\2\2\7\u0097\3\2\2\2\t\u0099"+
		"\3\2\2\2\13\u009b\3\2\2\2\r\u009d\3\2\2\2\17\u00a0\3\2\2\2\21\u00a2\3"+
		"\2\2\2\23\u00a4\3\2\2\2\25\u00a6\3\2\2\2\27\u00a8\3\2\2\2\31\u00aa\3\2"+
		"\2\2\33\u00ac\3\2\2\2\35\u00af\3\2\2\2\37\u00b1\3\2\2\2!\u00b4\3\2\2\2"+
		"#\u00b6\3\2\2\2%\u00b9\3\2\2\2\'\u00c1\3\2\2\2)\u00c5\3\2\2\2+\u00ca\3"+
		"\2\2\2-\u00d2\3\2\2\2/\u00d6\3\2\2\2\61\u00d9\3\2\2\2\63\u00dd\3\2\2\2"+
		"\65\u00e0\3\2\2\2\67\u00e5\3\2\2\29\u00ea\3\2\2\2;\u00ef\3\2\2\2=\u00f2"+
		"\3\2\2\2?\u00f8\3\2\2\2A\u00fc\3\2\2\2C\u0103\3\2\2\2E\u010c\3\2\2\2G"+
		"\u011e\3\2\2\2I\u0120\3\2\2\2K\u0125\3\2\2\2M\u012b\3\2\2\2O\u0130\3\2"+
		"\2\2Q\u0134\3\2\2\2S\u0138\3\2\2\2U\u013b\3\2\2\2W\u013f\3\2\2\2Y\u0146"+
		"\3\2\2\2[\u0150\3\2\2\2]\u0156\3\2\2\2_\u0164\3\2\2\2a\u0166\3\2\2\2c"+
		"\u0168\3\2\2\2e\u016a\3\2\2\2g\u016c\3\2\2\2i\u016e\3\2\2\2k\u0170\3\2"+
		"\2\2m\u0172\3\2\2\2o\u0174\3\2\2\2q\u0176\3\2\2\2s\u0178\3\2\2\2u\u017a"+
		"\3\2\2\2w\u017c\3\2\2\2y\u017e\3\2\2\2{\u0180\3\2\2\2}\u0182\3\2\2\2\177"+
		"\u0184\3\2\2\2\u0081\u0186\3\2\2\2\u0083\u0188\3\2\2\2\u0085\u018a\3\2"+
		"\2\2\u0087\u018c\3\2\2\2\u0089\u018e\3\2\2\2\u008b\u0190\3\2\2\2\u008d"+
		"\u0192\3\2\2\2\u008f\u0194\3\2\2\2\u0091\u0196\3\2\2\2\u0093\u0094\7="+
		"\2\2\u0094\4\3\2\2\2\u0095\u0096\7.\2\2\u0096\6\3\2\2\2\u0097\u0098\7"+
		"<\2\2\u0098\b\3\2\2\2\u0099\u009a\7?\2\2\u009a\n\3\2\2\2\u009b\u009c\7"+
		"\60\2\2\u009c\f\3\2\2\2\u009d\u009e\7<\2\2\u009e\u009f\7?\2\2\u009f\16"+
		"\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\20\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3"+
		"\22\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7"+
		"\26\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab"+
		"\32\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7@\2\2\u00ae\34\3\2\2\2\u00af"+
		"\u00b0\7>\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3"+
		" \3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8$\3\2\2\2\u00b9\u00ba\5}?\2\u00ba\u00bb\5\u0081A\2"+
		"\u00bb\u00bc\5{>\2\u00bc\u00bd\5k\66\2\u00bd\u00be\5\u0081A\2\u00be\u00bf"+
		"\5_\60\2\u00bf\u00c0\5w<\2\u00c0&\3\2\2\2\u00c1\u00c2\5\u0089E\2\u00c2"+
		"\u00c3\5_\60\2\u00c3\u00c4\5\u0081A\2\u00c4(\3\2\2\2\u00c5\u00c6\5\u0081"+
		"A\2\u00c6\u00c7\5g\64\2\u00c7\u00c8\5_\60\2\u00c8\u00c9\5u;\2\u00c9*\3"+
		"\2\2\2\u00ca\u00cb\5a\61\2\u00cb\u00cc\5{>\2\u00cc\u00cd\5{>\2\u00cd\u00ce"+
		"\5u;\2\u00ce\u00cf\5g\64\2\u00cf\u00d0\5_\60\2\u00d0\u00d1\5y=\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\5_\60\2\u00d3\u00d4\5y=\2\u00d4\u00d5\5e\63\2\u00d5"+
		".\3\2\2\2\u00d6\u00d7\5{>\2\u00d7\u00d8\5\u0081A\2\u00d8\60\3\2\2\2\u00d9"+
		"\u00da\5y=\2\u00da\u00db\5{>\2\u00db\u00dc\5\u0085C\2\u00dc\62\3\2\2\2"+
		"\u00dd\u00de\5o8\2\u00de\u00df\5i\65\2\u00df\64\3\2\2\2\u00e0\u00e1\5"+
		"\u0085C\2\u00e1\u00e2\5m\67\2\u00e2\u00e3\5g\64\2\u00e3\u00e4\5y=\2\u00e4"+
		"\66\3\2\2\2\u00e5\u00e6\5g\64\2\u00e6\u00e7\5u;\2\u00e7\u00e8\5\u0083"+
		"B\2\u00e8\u00e9\5g\64\2\u00e98\3\2\2\2\u00ea\u00eb\5c\62\2\u00eb\u00ec"+
		"\5_\60\2\u00ec\u00ed\5\u0083B\2\u00ed\u00ee\5g\64\2\u00ee:\3\2\2\2\u00ef"+
		"\u00f0\5{>\2\u00f0\u00f1\5i\65\2\u00f1<\3\2\2\2\u00f2\u00f3\5a\61\2\u00f3"+
		"\u00f4\5g\64\2\u00f4\u00f5\5k\66\2\u00f5\u00f6\5o8\2\u00f6\u00f7\5y=\2"+
		"\u00f7>\3\2\2\2\u00f8\u00f9\5g\64\2\u00f9\u00fa\5y=\2\u00fa\u00fb\5e\63"+
		"\2\u00fb@\3\2\2\2\u00fc\u00fd\5\u0081A\2\u00fd\u00fe\5g\64\2\u00fe\u00ff"+
		"\5_\60\2\u00ff\u0100\5e\63\2\u0100\u0101\5u;\2\u0101\u0102\5y=\2\u0102"+
		"B\3\2\2\2\u0103\u0104\5\u008bF\2\u0104\u0105\5\u0081A\2\u0105\u0106\5"+
		"o8\2\u0106\u0107\5\u0085C\2\u0107\u0108\5g\64\2\u0108\u0109\5u;\2\u0109"+
		"\u010a\5y=\2\u010aD\3\2\2\2\u010b\u010d\t\2\2\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u0110\t\3\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\7\60\2\2\u0115\u0114\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\t\3\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011bF\3\2\2\2\u011c\u011f\5I%\2\u011d\u011f\5K&\2\u011e\u011c\3"+
		"\2\2\2\u011e\u011d\3\2\2\2\u011fH\3\2\2\2\u0120\u0121\5\u0085C\2\u0121"+
		"\u0122\5\u0081A\2\u0122\u0123\5\u0087D\2\u0123\u0124\5g\64\2\u0124J\3"+
		"\2\2\2\u0125\u0126\5i\65\2\u0126\u0127\5_\60\2\u0127\u0128\5u;\2\u0128"+
		"\u0129\5\u0083B\2\u0129\u012a\5g\64\2\u012aL\3\2\2\2\u012b\u012c\5\u0083"+
		"B\2\u012c\u012d\5\177@\2\u012d\u012e\5\u0081A\2\u012e\u012f\5\u0085C\2"+
		"\u012fN\3\2\2\2\u0130\u0131\5\u0083B\2\u0131\u0132\5o8\2\u0132\u0133\5"+
		"y=\2\u0133P\3\2\2\2\u0134\u0135\5c\62\2\u0135\u0136\5{>\2\u0136\u0137"+
		"\5\u0083B\2\u0137R\3\2\2\2\u0138\u0139\5u;\2\u0139\u013a\5y=\2\u013aT"+
		"\3\2\2\2\u013b\u013c\5g\64\2\u013c\u013d\5\u008dG\2\u013d\u013e\5}?\2"+
		"\u013eV\3\2\2\2\u013f\u0143\t\4\2\2\u0140\u0142\t\5\2\2\u0141\u0140\3"+
		"\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"X\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u014a\7)\2\2\u0147\u0149\13\2\2\2"+
		"\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u014b\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7)\2\2\u014e"+
		"Z\3\2\2\2\u014f\u0151\t\6\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\b.\2\2\u0155\\\3\2\2\2\u0156\u0157\7*\2\2\u0157\u0158\7,\2\2\u0158\u015c"+
		"\3\2\2\2\u0159\u015b\13\2\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0160\7,\2\2\u0160\u0161\7+\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\b/\2\2\u0163^\3\2\2\2\u0164\u0165\t\7\2\2\u0165`\3\2\2\2\u0166"+
		"\u0167\t\b\2\2\u0167b\3\2\2\2\u0168\u0169\t\t\2\2\u0169d\3\2\2\2\u016a"+
		"\u016b\t\n\2\2\u016bf\3\2\2\2\u016c\u016d\t\13\2\2\u016dh\3\2\2\2\u016e"+
		"\u016f\t\f\2\2\u016fj\3\2\2\2\u0170\u0171\t\r\2\2\u0171l\3\2\2\2\u0172"+
		"\u0173\t\16\2\2\u0173n\3\2\2\2\u0174\u0175\t\17\2\2\u0175p\3\2\2\2\u0176"+
		"\u0177\t\20\2\2\u0177r\3\2\2\2\u0178\u0179\t\21\2\2\u0179t\3\2\2\2\u017a"+
		"\u017b\t\22\2\2\u017bv\3\2\2\2\u017c\u017d\t\23\2\2\u017dx\3\2\2\2\u017e"+
		"\u017f\t\24\2\2\u017fz\3\2\2\2\u0180\u0181\t\25\2\2\u0181|\3\2\2\2\u0182"+
		"\u0183\t\26\2\2\u0183~\3\2\2\2\u0184\u0185\t\27\2\2\u0185\u0080\3\2\2"+
		"\2\u0186\u0187\t\30\2\2\u0187\u0082\3\2\2\2\u0188\u0189\t\31\2\2\u0189"+
		"\u0084\3\2\2\2\u018a\u018b\t\32\2\2\u018b\u0086\3\2\2\2\u018c\u018d\t"+
		"\33\2\2\u018d\u0088\3\2\2\2\u018e\u018f\t\34\2\2\u018f\u008a\3\2\2\2\u0190"+
		"\u0191\t\35\2\2\u0191\u008c\3\2\2\2\u0192\u0193\t\36\2\2\u0193\u008e\3"+
		"\2\2\2\u0194\u0195\t\37\2\2\u0195\u0090\3\2\2\2\u0196\u0197\t \2\2\u0197"+
		"\u0092\3\2\2\2\f\2\u010c\u0111\u0115\u011a\u011e\u0143\u014a\u0152\u015c"+
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