package qlcoder;

// Generated from qlcoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qlcoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, WS=6, NEWLINE=7;
	public static final int
		RULE_file = 0, RULE_dtype = 1;
	public static final String[] ruleNames = {
		"file", "dtype"
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

	@Override
	public String getGrammarFileName() { return "qlcoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qlcoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<DtypeContext> dtype() {
			return getRuleContexts(DtypeContext.class);
		}
		public DtypeContext dtype(int i) {
			return getRuleContext(DtypeContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qlcoderVisitor ) return ((qlcoderVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				dtype();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==ID );
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

	public static class DtypeContext extends ParserRuleContext {
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
	 
		public DtypeContext() { }
		public void copyFrom(DtypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RnewContext extends DtypeContext {
		public List<TerminalNode> ID() { return getTokens(qlcoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(qlcoderParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(qlcoderParser.NEWLINE, 0); }
		public RnewContext(DtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).enterRnew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).exitRnew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qlcoderVisitor ) return ((qlcoderVisitor<? extends T>)visitor).visitRnew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RassignContext extends DtypeContext {
		public List<TerminalNode> ID() { return getTokens(qlcoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(qlcoderParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(qlcoderParser.NEWLINE, 0); }
		public RassignContext(DtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).enterRassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).exitRassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qlcoderVisitor ) return ((qlcoderVisitor<? extends T>)visitor).visitRassign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RtypeContext extends DtypeContext {
		public TerminalNode ID() { return getToken(qlcoderParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(qlcoderParser.NEWLINE, 0); }
		public RtypeContext(DtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).enterRtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof qlcoderListener ) ((qlcoderListener)listener).exitRtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof qlcoderVisitor ) return ((qlcoderVisitor<? extends T>)visitor).visitRtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dtype);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new RtypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(T__0);
				setState(10);
				match(ID);
				setState(11);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new RnewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(ID);
				setState(13);
				match(T__1);
				setState(14);
				match(T__2);
				setState(15);
				match(ID);
				setState(16);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new RassignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(ID);
				setState(18);
				match(T__3);
				setState(19);
				match(ID);
				setState(20);
				match(NEWLINE);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t\32\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\3\2\2\4\2\4\2\2\32\2\7\3\2\2\2\4\27\3\2\2\2\6\b"+
		"\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13"+
		"\f\7\3\2\2\f\r\7\7\2\2\r\30\7\t\2\2\16\17\7\7\2\2\17\20\7\4\2\2\20\21"+
		"\7\5\2\2\21\22\7\7\2\2\22\30\7\t\2\2\23\24\7\7\2\2\24\25\7\6\2\2\25\26"+
		"\7\7\2\2\26\30\7\t\2\2\27\13\3\2\2\2\27\16\3\2\2\2\27\23\3\2\2\2\30\5"+
		"\3\2\2\2\4\t\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}