grammar qlcoder;
file:  dtype+;
dtype:	'type' ID NEWLINE          	    #Rtype
	 	| ID ':=' 'new'  ID NEWLINE  	#Rnew
	 	| ID '='  ID NEWLINE		 	#Rassign
	 	| NEWLINE
	  ;
ID   : [a-zA-Z]+;
WS : [ \t]+ -> skip;
NEWLINE:'\r'? '\n' ;