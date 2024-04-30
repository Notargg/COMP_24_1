// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t3;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TIPO_VAR=16, 
		NUMINT=17, NUMREAL=18, CADEIA=19, OP_ARIT1=20, OP_ARIT2=21, OP_REL=22, 
		OP_BOOL=23, VARIAVEL=24, COMENTARIO=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "TIPO_VAR", "NUMINT", 
			"NUMREAL", "CADEIA", "ESC_SEQ", "OP_ARIT1", "OP_ARIT2", "OP_REL", "OP_BOOL", 
			"VARIAVEL", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'DECLARACOES'", "'ALGORITMO'", "'('", "')'", "'ATRIBUIR'", 
			"'A'", "'LER'", "'IMPRIMIR'", "'SE'", "'ENTAO'", "'SENAO'", "'ENQUANTO'", 
			"'INICIO'", "'FIM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TIPO_VAR", "NUMINT", "NUMREAL", "CADEIA", "OP_ARIT1", 
			"OP_ARIT2", "OP_REL", "OP_BOOL", "VARIAVEL", "COMENTARIO", "WS"
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

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00e5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u009a\b\u000f\u0001\u0010\u0004"+
		"\u0010\u009d\b\u0010\u000b\u0010\f\u0010\u009e\u0001\u0011\u0004\u0011"+
		"\u00a2\b\u0011\u000b\u0011\f\u0011\u00a3\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u00a8\b\u0011\u000b\u0011\f\u0011\u00a9\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00af\b\u0012\n\u0012\f\u0012\u00b2\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00c6\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00cb"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u00cf\b\u0018\n\u0018\f\u0018"+
		"\u00d2\t\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u00d6\b\u0019\n\u0019"+
		"\f\u0019\u00d9\t\u0019\u0001\u0019\u0003\u0019\u00dc\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0000)\u0014+\u0015-\u0016/\u00171\u00183\u00195\u001a\u0001\u0000"+
		"\u0007\u0002\u0000\'\'\\\\\u0002\u0000++--\u0002\u0000**//\u0002\u0000"+
		"AZaz\u0003\u000009AZaz\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u00f2"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005"+
		"E\u0001\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000\tQ\u0001\u0000"+
		"\u0000\u0000\u000bS\u0001\u0000\u0000\u0000\r\\\u0001\u0000\u0000\u0000"+
		"\u000f^\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013k"+
		"\u0001\u0000\u0000\u0000\u0015n\u0001\u0000\u0000\u0000\u0017t\u0001\u0000"+
		"\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b\u0083\u0001\u0000\u0000"+
		"\u0000\u001d\u008a\u0001\u0000\u0000\u0000\u001f\u0099\u0001\u0000\u0000"+
		"\u0000!\u009c\u0001\u0000\u0000\u0000#\u00a1\u0001\u0000\u0000\u0000%"+
		"\u00ab\u0001\u0000\u0000\u0000\'\u00b5\u0001\u0000\u0000\u0000)\u00b8"+
		"\u0001\u0000\u0000\u0000+\u00ba\u0001\u0000\u0000\u0000-\u00c5\u0001\u0000"+
		"\u0000\u0000/\u00ca\u0001\u0000\u0000\u00001\u00cc\u0001\u0000\u0000\u0000"+
		"3\u00d3\u0001\u0000\u0000\u00005\u00e1\u0001\u0000\u0000\u000078\u0005"+
		":\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005D\u0000\u0000:;\u0005"+
		"E\u0000\u0000;<\u0005C\u0000\u0000<=\u0005L\u0000\u0000=>\u0005A\u0000"+
		"\u0000>?\u0005R\u0000\u0000?@\u0005A\u0000\u0000@A\u0005C\u0000\u0000"+
		"AB\u0005O\u0000\u0000BC\u0005E\u0000\u0000CD\u0005S\u0000\u0000D\u0004"+
		"\u0001\u0000\u0000\u0000EF\u0005A\u0000\u0000FG\u0005L\u0000\u0000GH\u0005"+
		"G\u0000\u0000HI\u0005O\u0000\u0000IJ\u0005R\u0000\u0000JK\u0005I\u0000"+
		"\u0000KL\u0005T\u0000\u0000LM\u0005M\u0000\u0000MN\u0005O\u0000\u0000"+
		"N\u0006\u0001\u0000\u0000\u0000OP\u0005(\u0000\u0000P\b\u0001\u0000\u0000"+
		"\u0000QR\u0005)\u0000\u0000R\n\u0001\u0000\u0000\u0000ST\u0005A\u0000"+
		"\u0000TU\u0005T\u0000\u0000UV\u0005R\u0000\u0000VW\u0005I\u0000\u0000"+
		"WX\u0005B\u0000\u0000XY\u0005U\u0000\u0000YZ\u0005I\u0000\u0000Z[\u0005"+
		"R\u0000\u0000[\f\u0001\u0000\u0000\u0000\\]\u0005A\u0000\u0000]\u000e"+
		"\u0001\u0000\u0000\u0000^_\u0005L\u0000\u0000_`\u0005E\u0000\u0000`a\u0005"+
		"R\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005I\u0000\u0000cd\u0005"+
		"M\u0000\u0000de\u0005P\u0000\u0000ef\u0005R\u0000\u0000fg\u0005I\u0000"+
		"\u0000gh\u0005M\u0000\u0000hi\u0005I\u0000\u0000ij\u0005R\u0000\u0000"+
		"j\u0012\u0001\u0000\u0000\u0000kl\u0005S\u0000\u0000lm\u0005E\u0000\u0000"+
		"m\u0014\u0001\u0000\u0000\u0000no\u0005E\u0000\u0000op\u0005N\u0000\u0000"+
		"pq\u0005T\u0000\u0000qr\u0005A\u0000\u0000rs\u0005O\u0000\u0000s\u0016"+
		"\u0001\u0000\u0000\u0000tu\u0005S\u0000\u0000uv\u0005E\u0000\u0000vw\u0005"+
		"N\u0000\u0000wx\u0005A\u0000\u0000xy\u0005O\u0000\u0000y\u0018\u0001\u0000"+
		"\u0000\u0000z{\u0005E\u0000\u0000{|\u0005N\u0000\u0000|}\u0005Q\u0000"+
		"\u0000}~\u0005U\u0000\u0000~\u007f\u0005A\u0000\u0000\u007f\u0080\u0005"+
		"N\u0000\u0000\u0080\u0081\u0005T\u0000\u0000\u0081\u0082\u0005O\u0000"+
		"\u0000\u0082\u001a\u0001\u0000\u0000\u0000\u0083\u0084\u0005I\u0000\u0000"+
		"\u0084\u0085\u0005N\u0000\u0000\u0085\u0086\u0005I\u0000\u0000\u0086\u0087"+
		"\u0005C\u0000\u0000\u0087\u0088\u0005I\u0000\u0000\u0088\u0089\u0005O"+
		"\u0000\u0000\u0089\u001c\u0001\u0000\u0000\u0000\u008a\u008b\u0005F\u0000"+
		"\u0000\u008b\u008c\u0005I\u0000\u0000\u008c\u008d\u0005M\u0000\u0000\u008d"+
		"\u001e\u0001\u0000\u0000\u0000\u008e\u008f\u0005I\u0000\u0000\u008f\u0090"+
		"\u0005N\u0000\u0000\u0090\u0091\u0005T\u0000\u0000\u0091\u0092\u0005E"+
		"\u0000\u0000\u0092\u0093\u0005I\u0000\u0000\u0093\u0094\u0005R\u0000\u0000"+
		"\u0094\u009a\u0005O\u0000\u0000\u0095\u0096\u0005R\u0000\u0000\u0096\u0097"+
		"\u0005E\u0000\u0000\u0097\u0098\u0005A\u0000\u0000\u0098\u009a\u0005L"+
		"\u0000\u0000\u0099\u008e\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000"+
		"\u0000\u0000\u009a \u0001\u0000\u0000\u0000\u009b\u009d\u000209\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\"\u0001\u0000\u0000\u0000\u00a0\u00a2\u000209\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005.\u0000\u0000\u00a6\u00a8\u0002"+
		"09\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa$\u0001\u0000\u0000\u0000\u00ab\u00b0\u0005\'\u0000\u0000"+
		"\u00ac\u00af\u0003\'\u0013\u0000\u00ad\u00af\b\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\'\u0000\u0000\u00b4&"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\\\u0000\u0000\u00b6\u00b7\u0005"+
		"\'\u0000\u0000\u00b7(\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0001"+
		"\u0000\u0000\u00b9*\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0002\u0000"+
		"\u0000\u00bb,\u0001\u0000\u0000\u0000\u00bc\u00c6\u0005>\u0000\u0000\u00bd"+
		"\u00be\u0005>\u0000\u0000\u00be\u00c6\u0005=\u0000\u0000\u00bf\u00c6\u0005"+
		"<\u0000\u0000\u00c0\u00c1\u0005<\u0000\u0000\u00c1\u00c6\u0005=\u0000"+
		"\u0000\u00c2\u00c3\u0005<\u0000\u0000\u00c3\u00c6\u0005>\u0000\u0000\u00c4"+
		"\u00c6\u0005=\u0000\u0000\u00c5\u00bc\u0001\u0000\u0000\u0000\u00c5\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6.\u0001\u0000\u0000\u0000\u00c7\u00cb\u0005"+
		"E\u0000\u0000\u00c8\u00c9\u0005O\u0000\u0000\u00c9\u00cb\u0005U\u0000"+
		"\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb0\u0001\u0000\u0000\u0000\u00cc\u00d0\u0007\u0003\u0000\u0000"+
		"\u00cd\u00cf\u0007\u0004\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d12\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d7\u0005%\u0000\u0000\u00d4\u00d6"+
		"\b\u0005\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00dc\u0005\r\u0000\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\n\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0006\u0019\u0000\u0000\u00e04\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0007\u0006\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0006\u001a\u0000\u0000\u00e46\u0001\u0000\u0000\u0000\f"+
		"\u0000\u0099\u009e\u00a3\u00a9\u00ae\u00b0\u00c5\u00ca\u00d0\u00d7\u00db"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}