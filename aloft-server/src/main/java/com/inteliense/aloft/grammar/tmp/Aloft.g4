/* author: Ryan Fitzgerald */
/* First ANTLR experience (no clue if it works) */

grammar Aloft;
r : syntax+;
syntax : switch_block | if | loop | functions | class | query  | constructor | source | component | element | model | theme | callable | page | animation | module  | declare_variable | condtional ;
class : CLASS_KEYWORD NAMED curly_block ;
CLASS_KEYWORD : ('class');
component : COMPONENT_KEYWORD NAMED curly_block STATEMENT_END? ;
COMPONENT_KEYWORD :  ('component') ;
element : ELEMENT_KEYWORD NAMED curly_block STATEMENT_END? ;
ELEMENT_KEYWORD :  ('element') ;
theme : THEME_KEYWORD NAMED  curly_block STATEMENT_END? ;
THEME_KEYWORD :  ('theme') ;
model : MODEL_KEYWORD NAMED  curly_block STATEMENT_END? ;
MODEL_KEYWORD :  ('model') ;
page : PAGE_KEYWORD PATH_STRING  curly_block STATEMENT_END? ;
PAGE_KEYWORD :  ('page') ;
animation : ANIMATION_KEYWORD NAMED  curly_block STATEMENT_END? ;
ANIMATION_KEYWORD :  ('animation') ;
module : MODULE_KEYWORD NAMED  curly_block STATEMENT_END? ;
MODULE_KEYWORD :  ('module') ;
query : QUERY_KEYWORD NAMED? (NAMED_WITH_PARAMS_SPECIAL | EMPTY_PARENTHESIS) curly_block STATEMENT_END? ;
QUERY_KEYWORD :  ('query') ;
source : SOURCE_KEYWORD PATH_STRING STATEMENT_END? ;
SOURCE_KEYWORD :  ('source') ;
callable : CALLABLE_KEYWORD PATH_STRING curly_block STATEMENT_END? ;
CALLABLE_KEYWORD :  ('callable') ;
constructor : CONSTRUCTOR_KEYWORD  curly_block STATEMENT_END? ;
CONSTRUCTOR_KEYWORD :  ('create') ;
NAMED : [a-zA-Z]+ ;
NAMED_VAR : NAMED_OBJECT_ARRAY | NAMED_ARRAY | NAMED_OBJECT ;
expression : (EQUALS | OPERATORS) ((NOT? isset) | (NOT? NULL_VALUE) | BRACES_ARRAY_BLOCK | (NOT? ((NAMED_VAR | NAMED))) | path | string | NUMBERS);
isset : NOT? ISSET_KEYWORD ;
ISSET_KEYWORD : ('isset') ;
if : IF_KEYWORD OPEN_PARENTHESES? expression+ CLOSE_PARENTHESES? curly_block ((ELSE_IF (OPEN_PARENTHESES? expression+ CLOSE_PARENTHESES? curly_block)) | (ELSE curly_block))* ;
IF_KEYWORD : ('if') ;
OPEN_PARENTHESES : ([(]) ;
CLOSE_PARENTHESES: ([)]) ;
ELSE : ('else') ;
ELSE_IF : (('elseif') |  ('else if')) ;
declare_variable : (variable variable_options? expression? (STATEMENT_END | (NEW_LINE))) ;
variable : (VAR_ACCESS? ((NAMED_VAR | NAMED))) ;
COMMA : ([,]) ;
VAR_ACCESS : (REQUIRED_FIELD | STATIC_ACCESS) ;
REQUIRED_FIELD : ('*' [^ ]);
variable_options : var_type | var_options | var_type var_options ;
var_options :  VAR_MAGIC;
VAR_MAGIC : 'get' | 'set' | 'none';
loop : LOOP_DECLARATION ;
LOOP_DECLARATION :  ('repeat') ; // (((('through') NAMED  ('as') NAMED) | (('until') ([(])? expression+ ([)])? (('from') NUMBERS)?) | (('while') ([(])? expression+ ([)])?))) curly_block ;
switch_block :  SWITCH_KEYWORD named_switch SWITCH_CURLY_BLOCK ;
SWITCH_KEYWORD : ('switch') ;
// CURLY BLOCK + IF_DECLARATION (if)
//( ((('continue')[;] |  ('break')[;] | ((((GO_TO  | LOOP_DECLARATION | NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,]))*)? (NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)))+ ))
curly_block: (OPEN_BRACKETS) syntax+ (CLOSE_BRACKETS) ;
// SWITCH CURLY BLOCK + IF_DECLARATION (if)
SWITCH_CURLY_BLOCK : 'switch' ; // (OPEN_BRACKETS) (((('case')(([0-9]+)|(["'])([^"'])*(["'])|'null')[:]) | (('default')[:]) | ('break')[;])* | (((((GO_TO | PATH_STRING | LOOP_DECLARATION | NUMBERS | PROPERTY  | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) ([,]))*)? (PATH_STRING | NUMBERS | PROPERTY | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)))* (CLOSE_BRACKETS)) ;
functions : (FUNCTION_TYPES ARRAY_TYPE_SUFFIX? | NAMED_CLASS_ARRAY)? FUNCTION ENCLOSED_WITH_ARGS curly_block STATEMENT_END? ;
ARRAY_TYPE_SUFFIX : [[][\]] ;
FUNCTION : (([:][:])? ((NAMED_PARENTHESIS_FUNCTIONS)  | (NAMED EMPTY_PARENTHESIS))) ;
FUNCTION_TYPES: TYPES |  ('update') | ('void') ;
var_type : TYPES ; //|  ('function') | (('time')(([(])["'])([^"'])*(["']([)]))?) | NAMED ;
TYPES :   ('string') |  ('integer') |  ('int') |  ('decimal') | ('bool') | ('boolean') | ('dynamic') | ('function') ;
ENCLOSED_WITH_ARGS : NAMED_WITH_PARAMS_SPECIAL | (NAMED EMPTY_PARENTHESIS) ;
NAMED_WITH_PARAMS_SPECIAL : ([(]) ((NAMED ((([,]) '...args')?)) | (((([,]) NAMED)+) ((([,])' ...args')?))) ([)]) ;
//NAMED_WITH_PARAMS_VAR : (([(]) ((NAMED_VAR | NAMED) ([,])?)+ ('...' NAMED) ([)])) ;
condtional : expression+ CONDITIONAL_IF expression* CONDITIONAL_ELSE expression* STATEMENT_END? ;
CONDITIONAL_IF : WS '?' WS;
CONDITIONAL_ELSE : WS ':' WS;
OPERATORS : ([.]) | ([&][&]) | ([|][|]) | ([=][=]) | ([*]) | ([+]) | ([\-]) | ([\\]) | ([%]) | ([<]) | ([>]) | ([<][=]) | ([>][=]) | ([=][=][=]) | ([+][=]) | ([-][=]) | ([/][=]) | ([*][=]) | ([%][=]) | ([(]) | ([(]) ;
BRACES_ARRAY_BLOCK : ([[]()?([)]) (((NUMBERS | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,])))*)? (NUMBERS | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)? (()?[\]])) ;
CURLY_OBJECT_BLOCK : ((OPEN_BRACKETS)([)]) (((NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,])))*)? (NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)? ((CLOSE_BRACKETS))) ;
PROPERTY : NAMED_PROPERTY PROPERTY_VALUES STATEMENT_END? ;
NAMED_PROPERTY : ((([a-zA-Z_](([a-zA-Z0-9_-]+))+)?[a-zA-Z_0-9]?)[:]) ;
NAMED_PROPERTY_OBJECT : NAMED ([(]) (((PROPERTY) (PROPERTY_VALUES)?) ([,])?)+ ([)]) ;
PROPERTY_VALUES : NAMED_PROPERTY_OBJECT | NAMED_PROPERTY | HTML_ELEMENT | NAMED | NAMED_DOT | (NAMED_VAR | NAMED) | NUMBERS | PATH_STRING | NULL_VALUE | BRACES_ARRAY_BLOCK ;
NUMBERS : DIGITS | DECIMALS ;
DECIMALS : (DIGITS '.' DIGITS) ;
DIGITS :  ([0-9]+) ;
HTML_ELEMENT :  ([#])([a-zA-Z0-9_-]+) ;
NULL_VALUE :  ('null') ;
EMPTY_PARENTHESIS : ([(]) ([)]) ;
enclosed_var : NAMED_PARENTHESIS_SPECIAL | enclosed_vars ;
NAMED_PARENTHESIS_SPECIAL : (OPEN_PARENTHESES) (NAMED | ((COMMA) NAMED)) (CLOSE_PARENTHESES) ;
NAMED_PARENTHESIS_FUNCTIONS : ([(]) NAMED ([)]) ;
named_switch : OPEN_PARENTHESES (NAMED_VAR | NAMED) CLOSE_PARENTHESES ;
enclosed_vars : OPEN_PARENTHESES (COMMA? (NAMED_VAR | NAMED))+ CLOSE_PARENTHESES ;
NAMED_DOT : (((([+][+])|([-][-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)[.]((([+][+])|([-][-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]+)([a-zA-Z_0-9]))?))+ ;
NAMED_CLASS_ARRAY : (([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)([[][\]])?) ;
NAMED_OBJECT : (([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)([\-][>])) ;
NAMED_OBJECT_ARRAY : (((([+][+])|([-][-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)((([+][+])|([\-][\-]))?)([[]([0-9]+)[\]][\-][>])) ;
NAMED_ARRAY : (((([+][+])|([\-][\-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)([[]([0-9]+)[\]])((([+][+])|([\-][\-]))?)) ;
GO_TO : GOTO_KEYWORD PATH_STRING STATEMENT_END? ;
GOTO_KEYWORD :  ('goto') ;
path : PATH_STRING ;
string: QUOTED_STRING ;
PATH_STRING : (PATH_START? [a-zA-Z\\/._0-9-]+) ;
QUOTED_STRING : QUOTES .*? QUOTES;
EQUALS : '=' ;
NOT : '!' ;
STATIC_ACCESS : '::' ;
APPEND_ADD : '++' ;
APPEND_SUBTRACT : '--' ;
PATH_START : '^' ;
OPEN_BRACKETS : '{' ;
CLOSE_BRACKETS : '}' ;
END_OF_FILE : EOF -> channel(HIDDEN);
QUOTES : ["'] -> channel(HIDDEN) ;
COMMENT_BLOCK_DECLARATION : [/][*]  [^/*]*([*][/]) -> channel(HIDDEN) ;
NEW_LINE : [\n]+ ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
STATEMENT_END : ([;]) ;
