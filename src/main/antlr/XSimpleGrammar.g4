grammar XSimpleGrammar;

WS : [ \t\r\n] -> skip ;

xq : forClause whereClause returnClause;

forClause : 'for' VAR 'in' path (',' VAR 'in' path)* ;

whereClause : 'where' cond ;

returnClause : 'return' ret ;

path : ('doc' '(' '"' FILENAME '"' ')' | VAR) (sep NAME)* sep NAME
     | ('doc' '(' '"' FILENAME '"' ')' | VAR) (sep NAME)* sep 'text' '(' ')'
     ;

sep : '/' | '//' ;

ret : VAR
    | ret ',' ret
    | '<' NAME '>' ret '<' '/' NAME '>'
    | path
    ;

cond : (VAR | STRINGCONSTANT) 'eq' (VAR | STRINGCONSTANT)
     | (VAR | STRINGCONSTANT) '=' (VAR | STRINGCONSTANT)
     | cond 'and' cond
     ;

NAME           : [a-zA-Z0-9_]+ ;
FILENAME       : NAME '.' NAME ;
STRINGCONSTANT : ["](',' | '!' | '.' | ':' | '?' | [ a-zA-Z0-9])*["] ;
VAR            : [$][a-zA-Z0-9_]+ ;
