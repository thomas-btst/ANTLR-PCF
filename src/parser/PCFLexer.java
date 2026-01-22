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
		FIX=11, ARROW=12, PARENLEFT=13, PARENRIGHT=14, VAR=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LIT", "OPP", "OP", "IFZ", "THEN", "ELSE", "LET", "EQUAL", "IN", "FUN", 
			"FIX", "ARROW", "PARENLEFT", "PARENRIGHT", "VAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'ifz'", "'then'", "'else'", "'let'", "'='", 
			"'in'", "'fun'", "'fix'", "'->'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LIT", "OPP", "OP", "IFZ", "THEN", "ELSE", "LET", "EQUAL", "IN", 
			"FUN", "FIX", "ARROW", "PARENLEFT", "PARENRIGHT", "VAR", "WS"
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
		"\u0004\u0000\u0010`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b"+
		"\u0000\n\u0000\f\u0000(\t\u0000\u0003\u0000*\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0005\u000eX\b\u000e\n\u000e\f\u000e[\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010\u0001\u0000\u0007\u0001\u000019\u0001\u000009\u0002"+
		"\u0000**//\u0002\u0000++--\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005"+
		"-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t3\u0001\u0000"+
		"\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000"+
		"\u000fA\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013F"+
		"\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017N\u0001\u0000"+
		"\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000"+
		"\u001dU\u0001\u0000\u0000\u0000\u001f\\\u0001\u0000\u0000\u0000!*\u0005"+
		"0\u0000\u0000\"&\u0007\u0000\u0000\u0000#%\u0007\u0001\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000)!\u0001\u0000\u0000\u0000)\"\u0001\u0000\u0000\u0000*\u0002\u0001"+
		"\u0000\u0000\u0000+,\u0007\u0002\u0000\u0000,\u0004\u0001\u0000\u0000"+
		"\u0000-.\u0007\u0003\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005"+
		"i\u0000\u000001\u0005f\u0000\u000012\u0005z\u0000\u00002\b\u0001\u0000"+
		"\u0000\u000034\u0005t\u0000\u000045\u0005h\u0000\u000056\u0005e\u0000"+
		"\u000067\u0005n\u0000\u00007\n\u0001\u0000\u0000\u000089\u0005e\u0000"+
		"\u00009:\u0005l\u0000\u0000:;\u0005s\u0000\u0000;<\u0005e\u0000\u0000"+
		"<\f\u0001\u0000\u0000\u0000=>\u0005l\u0000\u0000>?\u0005e\u0000\u0000"+
		"?@\u0005t\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005=\u0000\u0000"+
		"B\u0010\u0001\u0000\u0000\u0000CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000"+
		"E\u0012\u0001\u0000\u0000\u0000FG\u0005f\u0000\u0000GH\u0005u\u0000\u0000"+
		"HI\u0005n\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005f\u0000\u0000"+
		"KL\u0005i\u0000\u0000LM\u0005x\u0000\u0000M\u0016\u0001\u0000\u0000\u0000"+
		"NO\u0005-\u0000\u0000OP\u0005>\u0000\u0000P\u0018\u0001\u0000\u0000\u0000"+
		"QR\u0005(\u0000\u0000R\u001a\u0001\u0000\u0000\u0000ST\u0005)\u0000\u0000"+
		"T\u001c\u0001\u0000\u0000\u0000UY\u0007\u0004\u0000\u0000VX\u0007\u0005"+
		"\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u001e\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\]\u0007\u0006\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^_\u0006\u000f\u0000\u0000_ \u0001\u0000\u0000\u0000\u0004"+
		"\u0000&)Y\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}