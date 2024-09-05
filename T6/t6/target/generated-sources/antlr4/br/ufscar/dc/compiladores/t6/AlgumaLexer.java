// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IDENT=9, 
		WS=10, COMENTARIO=11, COMENTARIO_NAO_FECHADO=12, CADEIA=13, CADEIA_NAO_FECHADA=14, 
		ERRO=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ESC_SEQ", 
			"IDENT", "WS", "COMENTARIO", "COMENTARIO_NAO_FECHADO", "CADEIA", "CADEIA_NAO_FECHADA", 
			"ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'agente'", "'sinergia'", "':'", "'+'", "'mapa'", "'composicao'", 
			"'encontrar'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "IDENT", "WS", 
			"COMENTARIO", "COMENTARIO_NAO_FECHADO", "CADEIA", "CADEIA_NAO_FECHADA", 
			"ERRO"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

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
		case 10:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u0095\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005"+
		"\tW\b\t\n\t\f\tZ\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000ba\b\u000b\n\u000b\f\u000bd\t\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000bh\b\u000b\u0001\u000b\u0003\u000bk\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\fq\b\f\n\f\f\ft\t\f\u0001\f\u0003\fw\b\f\u0001"+
		"\f\u0003\fz\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u007f\b\r\n\r\f\r\u0082"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0089"+
		"\b\u000e\n\u000e\f\u000e\u008c\t\u000e\u0001\u000e\u0003\u000e\u008f\b"+
		"\u000e\u0001\u000e\u0003\u000e\u0092\b\u000e\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\u0000\u0013\t\u0015\n\u0017\u000b\u0019\f"+
		"\u001b\r\u001d\u000e\u001f\u000f\u0001\u0000\u0005\u0002\u0000AZaz\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u0004\u0000\n\n\r\r{{}}\u0004\u0000"+
		"\n\n\r\r\"\"\\\\\u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000"+
		"\u0000\u0003(\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007"+
		"3\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b:\u0001\u0000"+
		"\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fO\u0001\u0000\u0000\u0000"+
		"\u0011Q\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000\u0015["+
		"\u0001\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019n\u0001\u0000"+
		"\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d\u0085\u0001\u0000\u0000"+
		"\u0000\u001f\u0093\u0001\u0000\u0000\u0000!\"\u0005a\u0000\u0000\"#\u0005"+
		"g\u0000\u0000#$\u0005e\u0000\u0000$%\u0005n\u0000\u0000%&\u0005t\u0000"+
		"\u0000&\'\u0005e\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005s"+
		"\u0000\u0000)*\u0005i\u0000\u0000*+\u0005n\u0000\u0000+,\u0005e\u0000"+
		"\u0000,-\u0005r\u0000\u0000-.\u0005g\u0000\u0000./\u0005i\u0000\u0000"+
		"/0\u0005a\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005:\u0000\u0000"+
		"2\u0006\u0001\u0000\u0000\u000034\u0005+\u0000\u00004\b\u0001\u0000\u0000"+
		"\u000056\u0005m\u0000\u000067\u0005a\u0000\u000078\u0005p\u0000\u0000"+
		"89\u0005a\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005c\u0000\u0000"+
		";<\u0005o\u0000\u0000<=\u0005m\u0000\u0000=>\u0005p\u0000\u0000>?\u0005"+
		"o\u0000\u0000?@\u0005s\u0000\u0000@A\u0005i\u0000\u0000AB\u0005c\u0000"+
		"\u0000BC\u0005a\u0000\u0000CD\u0005o\u0000\u0000D\f\u0001\u0000\u0000"+
		"\u0000EF\u0005e\u0000\u0000FG\u0005n\u0000\u0000GH\u0005c\u0000\u0000"+
		"HI\u0005o\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005t\u0000\u0000KL\u0005"+
		"r\u0000\u0000LM\u0005a\u0000\u0000MN\u0005r\u0000\u0000N\u000e\u0001\u0000"+
		"\u0000\u0000OP\u0005,\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QR\u0005"+
		"\\\u0000\u0000RS\u0005\'\u0000\u0000S\u0012\u0001\u0000\u0000\u0000TX"+
		"\u0007\u0000\u0000\u0000UW\u0007\u0001\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0007\u0002\u0000\u0000\\]\u0006\n\u0000\u0000]\u0016\u0001\u0000"+
		"\u0000\u0000^b\u0005{\u0000\u0000_a\b\u0003\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"eg\u0005}\u0000\u0000fh\u0005\r\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ik\u0005\n\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0006\u000b\u0001\u0000m\u0018\u0001\u0000\u0000\u0000nr\u0005"+
		"{\u0000\u0000oq\b\u0003\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0005\r\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xz\u0005\n\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u001a\u0001\u0000\u0000\u0000{\u0080\u0005\"\u0000\u0000|\u007f"+
		"\b\u0004\u0000\u0000}\u007f\u0003\u0011\b\u0000~|\u0001\u0000\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\"\u0000\u0000\u0084\u001c\u0001\u0000\u0000\u0000\u0085\u008a\u0005"+
		"\"\u0000\u0000\u0086\u0089\b\u0004\u0000\u0000\u0087\u0089\u0003\u0011"+
		"\b\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0005\r\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0092\u0005\n\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u001e\u0001\u0000\u0000\u0000\u0093\u0094\t\u0000\u0000\u0000\u0094 "+
		"\u0001\u0000\u0000\u0000\u000e\u0000Xbgjrvy~\u0080\u0088\u008a\u008e\u0091"+
		"\u0002\u0001\n\u0000\u0001\u000b\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}