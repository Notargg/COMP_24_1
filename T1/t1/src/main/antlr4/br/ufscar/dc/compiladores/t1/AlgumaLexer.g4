lexer grammar AlgumaLexer;


PALAVRA_CHAVE 
	:	'declare' | 'algoritmo' | 'inteiro' | 'literal' | 'ATRIBUIR' | 'A' | 'LER' | 'IMPRIMIR' | 'SE' | 'ENTAO' 
	| 'ENQUANTO' | 'escreva' | 'fim_algoritmo' | 'E' | 'OU' 
	; 
NUMINT	: ('+'|'-')?('0'..'9')+
	;
NUMREAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;
CADEIA 	: '"' ( ~('\n') )*? '"'
;
fragment
ESC_SEQ	: '\\\'';
COMENTARIO
    :   '{' ~('\n'|'\r')* '\r'? '}' '\r'? '\n' {skip();}
    ;
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

COMENTARIO_NAO_FECHADO: '{' ~('\n'|'\r')* '\r'? '\n'
    ;

CADEIA_NAO_FECHADA: '"' ( ~('\n') )*?
    ;

ERRO: .
    ;