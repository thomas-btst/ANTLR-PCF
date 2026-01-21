// Generated from /home/tito/Documents/imt/math/logique/prog/untitled/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PCFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LIT=1, OPP=2, OP=3, IFZ=4, THEN=5, ELSE=6, LET=7, EQUAL=8, IN=9, FUN=10, 
		ARROW=11, PARENLEFT=12, PARENRIGHT=13, VAR=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LIT", "OPP", "OP", "IFZ", "THEN", "ELSE", "LET", "EQUAL", "IN", "FUN", 
			"ARROW", "PARENLEFT", "PARENRIGHT", "VAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'ifz'", "'then'", "'else'", "'let'", "'='", 
			"'in'", "'fun'", "'->'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LIT", "OPP", "OP", "IFZ", "THEN", "ELSE", "LET", "EQUAL", "IN", 
			"FUN", "ARROW", "PARENLEFT", "PARENRIGHT", "VAR", "WS"
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


	public PCFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PCF.g4"; }

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
		"\u0004\u0000\u000fZ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t"+
		"\u0000\u0003\u0000(\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0005\rR\b\r\n\r\f\rU\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0007"+
		"\u0001\u000019\u0001\u000009\u0002\u0000**//\u0002\u0000++--\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \\\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005"+
		"+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t1\u0001\u0000"+
		"\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000"+
		"\u000f?\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013D"+
		"\u0001\u0000\u0000\u0000\u0015H\u0001\u0000\u0000\u0000\u0017K\u0001\u0000"+
		"\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001bO\u0001\u0000\u0000\u0000"+
		"\u001dV\u0001\u0000\u0000\u0000\u001f(\u00050\u0000\u0000 $\u0007\u0000"+
		"\u0000\u0000!#\u0007\u0001\u0000\u0000\"!\u0001\u0000\u0000\u0000#&\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'\u001f\u0001\u0000"+
		"\u0000\u0000\' \u0001\u0000\u0000\u0000(\u0002\u0001\u0000\u0000\u0000"+
		")*\u0007\u0002\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0007\u0003"+
		"\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005i\u0000\u0000./\u0005"+
		"f\u0000\u0000/0\u0005z\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005"+
		"t\u0000\u000023\u0005h\u0000\u000034\u0005e\u0000\u000045\u0005n\u0000"+
		"\u00005\n\u0001\u0000\u0000\u000067\u0005e\u0000\u000078\u0005l\u0000"+
		"\u000089\u0005s\u0000\u00009:\u0005e\u0000\u0000:\f\u0001\u0000\u0000"+
		"\u0000;<\u0005l\u0000\u0000<=\u0005e\u0000\u0000=>\u0005t\u0000\u0000"+
		">\u000e\u0001\u0000\u0000\u0000?@\u0005=\u0000\u0000@\u0010\u0001\u0000"+
		"\u0000\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000C\u0012\u0001\u0000"+
		"\u0000\u0000DE\u0005f\u0000\u0000EF\u0005u\u0000\u0000FG\u0005n\u0000"+
		"\u0000G\u0014\u0001\u0000\u0000\u0000HI\u0005-\u0000\u0000IJ\u0005>\u0000"+
		"\u0000J\u0016\u0001\u0000\u0000\u0000KL\u0005(\u0000\u0000L\u0018\u0001"+
		"\u0000\u0000\u0000MN\u0005)\u0000\u0000N\u001a\u0001\u0000\u0000\u0000"+
		"OS\u0007\u0004\u0000\u0000PR\u0007\u0005\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000T\u001c\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u0007\u0006\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006\u000e\u0000"+
		"\u0000Y\u001e\u0001\u0000\u0000\u0000\u0004\u0000$\'S\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}