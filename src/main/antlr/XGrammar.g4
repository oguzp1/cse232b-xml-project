grammar XGrammar;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

ap : 'doc' '(' '"' FILENAME '"' ')' '/' rp                    #APDir
   | 'doc' '(' '"' FILENAME '"' ')' '//' rp                   #APDirRecursive
   ;

rp : NAME                                                     #RPTagName
   | '*'                                                      #RPStar
   | '.'                                                      #RPCurrentDir
   | '..'                                                     #RPParentDir
   | 'text' '(' ')'                                           #RPText
   | '@'NAME                                                  #RPAttName
   | '(' rp ')'                                               #RPParantheses
   | rp '/' rp                                                #RPDir
   | rp '//' rp                                               #RPDirRecursive
   | rp '[' f ']'                                             #RPFilter
   | rp ',' rp                                                #RPConcat
   ;

f  : rp                                                       #FRP
   | rp '=' rp                                                #FRPEqual
   | rp 'eq' rp                                               #FRPEqual
   | rp '==' rp                                               #FRPIdentical
   | rp 'is' rp                                               #FRPIdentical
   | rp '=' STRINGCONSTANT                                    #FStringEqual
   | '(' f ')'                                                #FParantheses
   | f 'and' f                                                #FAnd
   | f 'or' f                                                 #FOr
   | 'not' f                                                  #FNot
   ;

xq : VAR                                                      #XQVar
   | STRINGCONSTANT                                           #XQString
   | ap                                                       #XQAbsolute
   | '(' xq ')'                                               #XQParantheses
   | xq ',' xq                                                #XQConcat
   | xq '/' rp                                                #XQDir
   | xq '//' rp                                               #XQDirRecursive
   | '<' NAME '>' '{' xq '}' '<' '/' NAME '>'                 #XQConstructor
   | forClause letClause? whereClause? returnClause           #XQFLWR
   | letClause xq                                             #XQLet
   ;

forClause : 'for' VAR 'in' xq (',' VAR 'in' xq)* ;

letClause : 'let' VAR ':=' xq (',' VAR ':=' xq)* ;

whereClause : 'where' cond ;

returnClause : 'return' xq ;

cond : xq '=' xq                                              #CondEqual
     | xq 'eq' xq                                             #CondEqual
     | xq '==' xq                                             #CondIdentical
     | xq 'is' xq                                             #CondIdentical
     | 'empty' '(' xq ')'                                     #CondEmpty
     | 'some' VAR 'in' xq (',' VAR 'in' xq)* 'satisfies' cond #CondSome
     | '(' cond ')'                                           #CondParantheses
     | cond 'and' cond                                        #CondAnd
     | cond 'or' cond                                         #CondOr
     | 'not' cond                                             #CondNot
     ;

NAME           : [a-zA-Z0-9_]+ ;
FILENAME       : NAME '.' NAME ;
STRINGCONSTANT : ["](',' | '!' | '.' | ':' | '?' | [ a-zA-Z0-9])*["] ;
VAR            : [$][a-zA-Z0-9_]+ ;
