// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, IDENT=9, 
		WS=10, COMENTARIO=11, COMENTARIO_NAO_FECHADO=12, CADEIA=13, CADEIA_NAO_FECHADA=14, 
		ERRO=15;
	public static final int
		RULE_agente = 0, RULE_sinergia = 1, RULE_mapa = 2, RULE_programa = 3, 
		RULE_declaracoes = 4, RULE_declaracao_agente = 5, RULE_declaracao_sinergia = 6, 
		RULE_declaracao_mapa = 7, RULE_saida = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"agente", "sinergia", "mapa", "programa", "declaracoes", "declaracao_agente", 
			"declaracao_sinergia", "declaracao_mapa", "saida"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgenteContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public AgenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterAgente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitAgente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitAgente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgenteContext agente() throws RecognitionException {
		AgenteContext _localctx = new AgenteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_agente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SinergiaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public SinergiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinergia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSinergia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSinergia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitSinergia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinergiaContext sinergia() throws RecognitionException {
		SinergiaContext _localctx = new SinergiaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sinergia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public MapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterMapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitMapa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitMapa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapaContext mapa() throws RecognitionException {
		MapaContext _localctx = new MapaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlgumaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			declaracoes();
			setState(25);
			saida();
			setState(26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Declaracao_agenteContext> declaracao_agente() {
			return getRuleContexts(Declaracao_agenteContext.class);
		}
		public Declaracao_agenteContext declaracao_agente(int i) {
			return getRuleContext(Declaracao_agenteContext.class,i);
		}
		public List<Declaracao_sinergiaContext> declaracao_sinergia() {
			return getRuleContexts(Declaracao_sinergiaContext.class);
		}
		public Declaracao_sinergiaContext declaracao_sinergia(int i) {
			return getRuleContext(Declaracao_sinergiaContext.class,i);
		}
		public List<Declaracao_mapaContext> declaracao_mapa() {
			return getRuleContexts(Declaracao_mapaContext.class);
		}
		public Declaracao_mapaContext declaracao_mapa(int i) {
			return getRuleContext(Declaracao_mapaContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 38L) != 0) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(28);
					declaracao_agente();
					}
					break;
				case T__1:
					{
					setState(29);
					declaracao_sinergia();
					}
					break;
				case T__4:
					{
					setState(30);
					declaracao_mapa();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_agenteContext extends ParserRuleContext {
		public AgenteContext agente() {
			return getRuleContext(AgenteContext.class,0);
		}
		public Declaracao_agenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_agente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_agente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_agente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao_agente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_agenteContext declaracao_agente() throws RecognitionException {
		Declaracao_agenteContext _localctx = new Declaracao_agenteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_agente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			agente();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_sinergiaContext extends ParserRuleContext {
		public SinergiaContext sinergia() {
			return getRuleContext(SinergiaContext.class,0);
		}
		public List<AgenteContext> agente() {
			return getRuleContexts(AgenteContext.class);
		}
		public AgenteContext agente(int i) {
			return getRuleContext(AgenteContext.class,i);
		}
		public Declaracao_sinergiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_sinergia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_sinergia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_sinergia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao_sinergia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_sinergiaContext declaracao_sinergia() throws RecognitionException {
		Declaracao_sinergiaContext _localctx = new Declaracao_sinergiaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_sinergia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__1);
			setState(40);
			sinergia();
			setState(41);
			match(T__2);
			setState(42);
			agente();
			setState(43);
			match(T__3);
			setState(44);
			agente();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_mapaContext extends ParserRuleContext {
		public MapaContext mapa() {
			return getRuleContext(MapaContext.class,0);
		}
		public List<AgenteContext> agente() {
			return getRuleContexts(AgenteContext.class);
		}
		public AgenteContext agente(int i) {
			return getRuleContext(AgenteContext.class,i);
		}
		public Declaracao_mapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_mapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_mapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_mapa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao_mapa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_mapaContext declaracao_mapa() throws RecognitionException {
		Declaracao_mapaContext _localctx = new Declaracao_mapaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracao_mapa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__4);
			setState(47);
			mapa();
			setState(48);
			match(T__5);
			setState(49);
			agente();
			setState(50);
			match(T__3);
			setState(51);
			agente();
			setState(52);
			match(T__3);
			setState(53);
			agente();
			setState(54);
			match(T__3);
			setState(55);
			agente();
			setState(56);
			match(T__3);
			setState(57);
			agente();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SaidaContext extends ParserRuleContext {
		public List<AgenteContext> agente() {
			return getRuleContexts(AgenteContext.class);
		}
		public AgenteContext agente(int i) {
			return getRuleContext(AgenteContext.class,i);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_saida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__6);
			setState(60);
			agente();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(61);
				match(T__7);
				setState(62);
				agente();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000fE\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004 \b\u0004\n\u0004\f\u0004#\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b@\b\b\n\b\f\bC\t\b\u0001\b\u0000\u0000\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000?\u0000\u0012\u0001\u0000"+
		"\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000"+
		"\u0000\u0000\u0006\u0018\u0001\u0000\u0000\u0000\b!\u0001\u0000\u0000"+
		"\u0000\n$\u0001\u0000\u0000\u0000\f\'\u0001\u0000\u0000\u0000\u000e.\u0001"+
		"\u0000\u0000\u0000\u0010;\u0001\u0000\u0000\u0000\u0012\u0013\u0005\t"+
		"\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005\t\u0000"+
		"\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0005\t\u0000\u0000"+
		"\u0017\u0005\u0001\u0000\u0000\u0000\u0018\u0019\u0003\b\u0004\u0000\u0019"+
		"\u001a\u0003\u0010\b\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0007"+
		"\u0001\u0000\u0000\u0000\u001c \u0003\n\u0005\u0000\u001d \u0003\f\u0006"+
		"\u0000\u001e \u0003\u000e\u0007\u0000\u001f\u001c\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"\t\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0001\u0000\u0000%&\u0003\u0000\u0000\u0000&\u000b\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0003"+
		"\u0000\u0000*+\u0003\u0000\u0000\u0000+,\u0005\u0004\u0000\u0000,-\u0003"+
		"\u0000\u0000\u0000-\r\u0001\u0000\u0000\u0000./\u0005\u0005\u0000\u0000"+
		"/0\u0003\u0004\u0002\u000001\u0005\u0006\u0000\u000012\u0003\u0000\u0000"+
		"\u000023\u0005\u0004\u0000\u000034\u0003\u0000\u0000\u000045\u0005\u0004"+
		"\u0000\u000056\u0003\u0000\u0000\u000067\u0005\u0004\u0000\u000078\u0003"+
		"\u0000\u0000\u000089\u0005\u0004\u0000\u00009:\u0003\u0000\u0000\u0000"+
		":\u000f\u0001\u0000\u0000\u0000;<\u0005\u0007\u0000\u0000<A\u0003\u0000"+
		"\u0000\u0000=>\u0005\b\u0000\u0000>@\u0003\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B\u0011\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000\u0003\u001f!A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}