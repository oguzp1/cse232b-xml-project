grammar XGrammar;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

ap : 'doc(' '"'FILENAME'"' ')/' rp | 'doc(' '"'FILENAME'"' ')//' rp ;

rp : TAGNAME | '*' | '.' | '..' | 'text()' | '@'ATTNAME
| '(' rp ')' | rp '/' rp | rp '//' rp | rp '[' f ']'| rp ',' rp ;

f : rp | rp'='rp | rp 'eq' rp | rp '==' rp | rp 'is' rp | rp '=' STRINGCONSTANT
| '(' f ')' |f 'and' f | f 'or' f| 'not' f;

FILENAME : [a-zA-Z0-9_\- ]+ '.' [a-zA-Z0-9_\- ]+ ;
TAGNAME : [a-zA-Z]+ ;
ATTNAME : [a-zA-Z]+ ;
STRINGCONSTANT : [a-z]+ ;