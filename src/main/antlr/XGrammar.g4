grammar XGrammar;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

ap : 'doc(' '"'FILENAME'"' ')/' rp  #APDir
   | 'doc(' '"'FILENAME'"' ')//' rp #APDirRecursive
   ;

rp : NAME                           #RPTagName
   | '*'                            #RPStar
   | '.'                            #RPCurrentDir
   | '..'                           #RPParentDir
   | 'text()'                       #RPText
   | '@'NAME                        #RPAttName
   | '(' rp ')'                     #RPParantheses
   | rp '/' rp                      #RPDir
   | rp '//' rp                     #RPDirRecursive
   | rp '[' f ']'                   #RPFilter
   | rp ',' rp                      #RPConcat
   ;

f  : rp                             #FRP
   | rp '=' rp                      #FRPEqual
   | rp 'eq' rp                     #FRPEqual
   | rp '==' rp                     #FRPIdentical
   | rp 'is' rp                     #FRPIdentical
   | rp '=' STRINGCONSTANT          #FStringEqual
   | '(' f ')'                      #FParantheses
   | f 'and' f                      #FAnd
   | f 'or' f                       #FOr
   | 'not' f                        #FNot
   ;

NAME           : [a-zA-Z0-9_]+ ;
FILENAME       : NAME '.' NAME ;
STRINGCONSTANT : ["][ a-zA-Z0-9]*["] ;
