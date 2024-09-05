
grammar Alguma;
	
// Definição de Escape

fragment
ESC_SEQ	: '\\\'';

// Definição de Identificadores para o AL

IDENT : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	 ;
agente: IDENT;
sinergia: IDENT;
mapa: IDENT;

// Definição de WS para o AL

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;

// Definição de Comentario, Cadeia e seus respectivos erros para o AL

COMENTARIO
    :   '{' ~('\n'|'\r'|'{'|'}' )* '}' '\r'? '\n'? {skip();}
    ;

COMENTARIO_NAO_FECHADO: '{' ~('\n'|'\r'|'{'|'}' )* '\r'? '\n'?
    ;

CADEIA :  '"' (~( '"'|'\\' |'\n'|'\r')| ESC_SEQ)* '"'
;

CADEIA_NAO_FECHADA: '"' (~( '"'|'\\' |'\n'|'\r')| ESC_SEQ)* '\r'? '\n'?
    ;

// Declaração - Cópia - da Gramática - T2 + Modificações

programa: declaracoes saida EOF;
declaracoes: (declaracao_agente | declaracao_sinergia | declaracao_mapa)*;
declaracao_agente: 'agente' agente;
declaracao_sinergia: 'sinergia' sinergia ':' agente '+' agente;
declaracao_mapa: 'mapa' mapa 'composicao' agente '+' agente '+' agente '+' agente '+' agente;
saida: 'encontrar' agente (','agente)*;


// Definição final de Erro

ERRO: .
    ;