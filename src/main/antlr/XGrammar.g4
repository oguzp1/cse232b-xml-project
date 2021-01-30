grammar XGrammar;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

ap : 'doc(' '"'FILENAME'"' ')/' rp #AbsoluteImmediate
| 'doc(' '"'FILENAME'"' ')//' rp #AbsoluteRecursive ;

rp : TAGNAME #ExpTagName
| '*' #ExpStar
| '.' #ExpDot
| '..' #ExpDotDot
| 'text()' #ExpText
| '@'TAGNAME #ExpAttname
| '(' rp ')' #ExpRPbrackets
| rp '/' rp #ExpRPDir1
| rp '//' rp #ExpRPDir2
| rp '[' f ']' #ExpRPfilter
| rp ',' rp  #ExpCat
;

f : rp | rp'='rp | rp 'eq' rp | rp '==' rp | rp 'is' rp | rp '=' STRINGCONSTANT
| '(' f ')' |f 'and' f | f 'or' f| 'not' f;

FILENAME : [a-zA-Z0-9_\- ]+ '.' [a-zA-Z0-9_\- ]+ ;
TAGNAME : [a-zA-Z_]+ ;
//ATTNAME : [a-zA-Z_]+ ;
STRINGCONSTANT : [a-z]+ ;