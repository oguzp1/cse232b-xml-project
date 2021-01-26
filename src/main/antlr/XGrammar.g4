grammar XGrammar;
r  : 'hello' ID ;
ID : [a-z]+ ;
WS : [ \t\n]+ -> skip ;
