package qlcoder;

// Generated from qlcoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qlcoderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, WS=6, NEWLINE=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "ID", "WS", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'type'", "':='", "'new'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ID", "WS", "NEWLINE"
	};
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


	public qlcoderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "qlcoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\60\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\7\6\7&\n"+
		"\7\r\7\16\7\'\3\7\3\7\3\b\5\b-\n\b\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\3\2\4\6\2\f\f\17\17$$..\4\2\13\13\"\"\62\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21"+
		"\3\2\2\2\5\26\3\2\2\2\7\31\3\2\2\2\t\35\3\2\2\2\13 \3\2\2\2\r%\3\2\2\2"+
		"\17,\3\2\2\2\21\22\7v\2\2\22\23\7{\2\2\23\24\7r\2\2\24\25\7g\2\2\25\4"+
		"\3\2\2\2\26\27\7<\2\2\27\30\7?\2\2\30\6\3\2\2\2\31\32\7p\2\2\32\33\7g"+
		"\2\2\33\34\7y\2\2\34\b\3\2\2\2\35\36\7?\2\2\36\n\3\2\2\2\37!\n\2\2\2 "+
		"\37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\f\3\2\2\2$&\t\3\2\2%$\3"+
		"\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\7\2\2*\16\3\2\2"+
		"\2+-\7\17\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\f\2\2/\20\3\2\2\2\6\2"+
		"\"\',\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}