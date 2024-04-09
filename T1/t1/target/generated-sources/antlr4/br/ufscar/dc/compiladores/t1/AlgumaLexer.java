// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t1;
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
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, VARIAVEL=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_REL=8, OP_ARIT=9, DELIM=10, ABREPAR=11, FECHAPAR=12, CADEIA_NAO_FECHADA=13, 
		ERRO=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", 
			"CADEIA_NAO_FECHADA", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "VARIAVEL", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "CADEIA_NAO_FECHADA", 
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
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

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
		case 6:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u00c9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000n\b\u0000\u0001\u0001\u0003\u0001q\b\u0001\u0001\u0001\u0004"+
		"\u0001t\b\u0001\u000b\u0001\f\u0001u\u0001\u0002\u0003\u0002y\b\u0002"+
		"\u0001\u0002\u0004\u0002|\b\u0002\u000b\u0002\f\u0002}\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u0082\b\u0002\u000b\u0002\f\u0002\u0083\u0003\u0002"+
		"\u0086\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u008a\b\u0003\n\u0003"+
		"\f\u0003\u008d\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u0091\b\u0004"+
		"\n\u0004\f\u0004\u0094\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u009d\b\u0006\n"+
		"\u0006\f\u0006\u00a0\t\u0006\u0001\u0006\u0003\u0006\u00a3\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00b4\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00c1\b\r\n\r\f\r\u00c4\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u0092\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0000\r\u0006"+
		"\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d"+
		"\u000e\u0001\u0000\b\u0002\u0000++--\u0002\u0000AZaz\u0003\u000009AZa"+
		"z\u0001\u0000\n\n\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0003\u0000"+
		"*+--//\u0003\u0000\n\n\'\'\\\\\u00e6\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001m\u0001\u0000\u0000\u0000\u0003p\u0001\u0000"+
		"\u0000\u0000\u0005x\u0001\u0000\u0000\u0000\u0007\u0087\u0001\u0000\u0000"+
		"\u0000\t\u008e\u0001\u0000\u0000\u0000\u000b\u0097\u0001\u0000\u0000\u0000"+
		"\r\u009a\u0001\u0000\u0000\u0000\u000f\u00a7\u0001\u0000\u0000\u0000\u0011"+
		"\u00b3\u0001\u0000\u0000\u0000\u0013\u00b5\u0001\u0000\u0000\u0000\u0015"+
		"\u00b7\u0001\u0000\u0000\u0000\u0017\u00b9\u0001\u0000\u0000\u0000\u0019"+
		"\u00bb\u0001\u0000\u0000\u0000\u001b\u00bd\u0001\u0000\u0000\u0000\u001d"+
		"\u00c7\u0001\u0000\u0000\u0000\u001f \u0005D\u0000\u0000 !\u0005E\u0000"+
		"\u0000!\"\u0005C\u0000\u0000\"#\u0005L\u0000\u0000#$\u0005A\u0000\u0000"+
		"$%\u0005R\u0000\u0000%&\u0005A\u0000\u0000&\'\u0005C\u0000\u0000\'(\u0005"+
		"O\u0000\u0000()\u0005E\u0000\u0000)n\u0005S\u0000\u0000*+\u0005A\u0000"+
		"\u0000+,\u0005L\u0000\u0000,-\u0005G\u0000\u0000-.\u0005O\u0000\u0000"+
		"./\u0005R\u0000\u0000/0\u0005I\u0000\u000001\u0005T\u0000\u000012\u0005"+
		"M\u0000\u00002n\u0005O\u0000\u000034\u0005I\u0000\u000045\u0005N\u0000"+
		"\u000056\u0005T\u0000\u000067\u0005E\u0000\u000078\u0005I\u0000\u0000"+
		"89\u0005R\u0000\u00009n\u0005O\u0000\u0000:;\u0005R\u0000\u0000;<\u0005"+
		"E\u0000\u0000<=\u0005A\u0000\u0000=n\u0005L\u0000\u0000>?\u0005A\u0000"+
		"\u0000?@\u0005T\u0000\u0000@A\u0005R\u0000\u0000AB\u0005I\u0000\u0000"+
		"BC\u0005B\u0000\u0000CD\u0005U\u0000\u0000DE\u0005I\u0000\u0000En\u0005"+
		"R\u0000\u0000Fn\u0005A\u0000\u0000GH\u0005L\u0000\u0000HI\u0005E\u0000"+
		"\u0000In\u0005R\u0000\u0000JK\u0005I\u0000\u0000KL\u0005M\u0000\u0000"+
		"LM\u0005P\u0000\u0000MN\u0005R\u0000\u0000NO\u0005I\u0000\u0000OP\u0005"+
		"M\u0000\u0000PQ\u0005I\u0000\u0000Qn\u0005R\u0000\u0000RS\u0005S\u0000"+
		"\u0000Sn\u0005E\u0000\u0000TU\u0005E\u0000\u0000UV\u0005N\u0000\u0000"+
		"VW\u0005T\u0000\u0000WX\u0005A\u0000\u0000Xn\u0005O\u0000\u0000YZ\u0005"+
		"E\u0000\u0000Z[\u0005N\u0000\u0000[\\\u0005Q\u0000\u0000\\]\u0005U\u0000"+
		"\u0000]^\u0005A\u0000\u0000^_\u0005N\u0000\u0000_`\u0005T\u0000\u0000"+
		"`n\u0005O\u0000\u0000ab\u0005I\u0000\u0000bc\u0005N\u0000\u0000cd\u0005"+
		"I\u0000\u0000de\u0005C\u0000\u0000ef\u0005I\u0000\u0000fn\u0005O\u0000"+
		"\u0000gh\u0005F\u0000\u0000hi\u0005I\u0000\u0000in\u0005M\u0000\u0000"+
		"jn\u0005E\u0000\u0000kl\u0005O\u0000\u0000ln\u0005U\u0000\u0000m\u001f"+
		"\u0001\u0000\u0000\u0000m*\u0001\u0000\u0000\u0000m3\u0001\u0000\u0000"+
		"\u0000m:\u0001\u0000\u0000\u0000m>\u0001\u0000\u0000\u0000mF\u0001\u0000"+
		"\u0000\u0000mG\u0001\u0000\u0000\u0000mJ\u0001\u0000\u0000\u0000mR\u0001"+
		"\u0000\u0000\u0000mT\u0001\u0000\u0000\u0000mY\u0001\u0000\u0000\u0000"+
		"ma\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000n\u0002\u0001\u0000\u0000\u0000oq\u0007"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rt\u000209\u0000sr\u0001\u0000\u0000\u0000t"+
		"u\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u0004\u0001\u0000\u0000\u0000wy\u0007\u0000\u0000\u0000xw\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000"+
		"z|\u000209\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}"+
		"{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0085\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0005.\u0000\u0000\u0080\u0082\u000209\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0006\u0001\u0000\u0000\u0000"+
		"\u0087\u008b\u0007\u0001\u0000\u0000\u0088\u008a\u0007\u0002\u0000\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\b\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e"+
		"\u0092\u0005\'\u0000\u0000\u008f\u0091\b\u0003\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\'\u0000\u0000\u0096\n\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\\\u0000\u0000\u0098\u0099\u0005\'\u0000\u0000\u0099\f\u0001\u0000\u0000"+
		"\u0000\u009a\u009e\u0005%\u0000\u0000\u009b\u009d\b\u0004\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0005\r\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\n\u0000\u0000\u00a5\u00a6\u0006\u0006\u0000\u0000\u00a6\u000e"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0005\u0000\u0000\u00a8\u00a9"+
		"\u0006\u0007\u0001\u0000\u00a9\u0010\u0001\u0000\u0000\u0000\u00aa\u00b4"+
		"\u0005>\u0000\u0000\u00ab\u00ac\u0005>\u0000\u0000\u00ac\u00b4\u0005="+
		"\u0000\u0000\u00ad\u00b4\u0005<\u0000\u0000\u00ae\u00af\u0005<\u0000\u0000"+
		"\u00af\u00b4\u0005=\u0000\u0000\u00b0\u00b1\u0005<\u0000\u0000\u00b1\u00b4"+
		"\u0005>\u0000\u0000\u00b2\u00b4\u0005=\u0000\u0000\u00b3\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0012\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0007\u0006\u0000\u0000\u00b6\u0014\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005:\u0000\u0000\u00b8\u0016\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005(\u0000\u0000\u00ba\u0018\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005)\u0000\u0000\u00bc\u001a\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c2\u0005\'\u0000\u0000\u00be\u00c1\u0003\u000b\u0005\u0000\u00bf\u00c1"+
		"\b\u0007\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\n\u0000\u0000\u00c6\u001c\u0001\u0000\u0000\u0000\u00c7\u00c8\t\u0000"+
		"\u0000\u0000\u00c8\u001e\u0001\u0000\u0000\u0000\u000f\u0000mpux}\u0083"+
		"\u0085\u008b\u0092\u009e\u00a2\u00b3\u00c0\u00c2\u0002\u0001\u0006\u0000"+
		"\u0001\u0007\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}