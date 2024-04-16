lexer grammar AlgumaLexer;

// Definição de Escape

fragment
ESC_SEQ	: '\\\'';


// Definição de Palavras Chaves para o AL
PALAVRA_CHAVE 
	:	'declare' | 'algoritmo' | 'inteiro' | 'literal'  | 'leia' | 'se' | 'entao' | 'senao' | 'fim_se'
	| 'escreva' | 'fim_algoritmo' | 'e' | 'ou' | 'nao' | 'real' | 'logico' | 'caso' | 'seja' | 'fim_caso' | 'para' | 'fim_para' | 'ate' 
	| 'faca' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' | 'tipo' | 'procedimento' | 'fim_procedimento' 
    | 'var' | 'funcao' | 'fim_funcao' | 'retorne' | 'constante' | 'falso' | 'verdadeiro' 
	; 

// Definição de Número para o AL

NUM_INT	: ('0'..'9')+
	;
NUM_REAL	: ('0'..'9')+ ('.' ('0'..'9')+)?
	;

// Definição de Identificadores para o AL

IDENT : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	 ;

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

// Definição de Separadores para o AL

ABREPAR :	'('
	;
FECHAPAR:	')'
	;

ABRECOL : '['
	;
FECHACOL : ']'
	;

VIRGULA	:	','
	;

DELIM:	':'
	;

DOIS_PONTOS: '..'
	;

// Definição de Operadores para o AL

OP_REL	:	'>=' | '>' | '<=' | '<' | '<>' | '='
	;
OP_ARIT	:	'+' | '-' | '*' | '/' | '%' | '^' | '&'
	;
OP_ATR : '<-'
	;
OP_ACESSO: '.'
	;

// Erros

ERRO: .
    ;