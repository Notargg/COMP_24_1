lexer grammar AlgumaLexer;

COMENTARIO
    :   '{' ~('\n'|'\r')* '}' {skip();}
    ;

PALAVRA_CHAVE 
	:	'declare' | 'algoritmo' | 'inteiro' | 'literal' | '<-' | 'leia' | 'se' | 'entao' | 'senao' | 'fim_se'
	| 'escreva' | 'fim_algoritmo' | 'e' | 'ou' | 'nao' | 'real' | 'logico' | 'caso' | 'seja'
	; 
NUM_INT	: ('+'|'-')?('0'..'9')+
	;
NUM_REAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;
CADEIA 	: '"' ( ~('\n') )*? '"'
;
fragment
ESC_SEQ	: '\\\'';
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OP_ARIT	:	'+' | '-' | '*' | '/'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;

VIRGULA	:	','
	;

COMENTARIO_NAO_FECHADO: '{' ~('\n'|'\r'|'}')* '\r'? '\n'
    ;

CADEIA_NAO_FECHADA: '"' ( ~('\n'|'"') )*?
    ;

ERRO: .
    ;