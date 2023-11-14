/* author: Ryan Fitzgerald */
/* First ANTLR experience (no clue if it works) */
grammar Aloft;
r : syntax+ EOF;
syntax : switch_block | if | loop | functions  | query  | constructor | source | component | element | model | theme | callable | page | animation | module  | declare_variable | condtional | property | NEW_LINE+;
component : COMPONENT_KEYWORD var_name curly_block ;
element : ELEMENT_KEYWORD var_name curly_block ;
theme : THEME_KEYWORD var_name curly_block ;
model : MODEL_KEYWORD var_name curly_block ;
page : PAGE_KEYWORD var_name curly_block ;
animation : ANIMATION_KEYWORD var_name curly_block ;
module : MODULE_KEYWORD var_name curly_block ;
//TODO make params a rule for query and more (arg1, arg2, ...args)
query : QUERY_KEYWORD  (NAMED_WITH_PARAMS_SPECIAL | NAMED_WITH_EMPTY_PARAMS) curly_block ;
source : SOURCE_KEYWORD path STATEMENT_END? ;
callable : CALLABLE_KEYWORD path curly_block ;
constructor : CONSTRUCTOR_KEYWORD var_name curly_block ;
//class : class_declaration var_name curly_block ;
//class_declaration : class_access? ('class') ;
//CLASS_ACCESS : ( 'universal ' | 'server ' | 'client ' ) ;
//class_access : CLASS_ACCESS ;
QUERY_KEYWORD : ('query')  ;
CONSTRUCTOR_KEYWORD : ('create') ;
CALLABLE_KEYWORD : ('callable') ;
SOURCE_KEYWORD : ('source') ;
MODULE_KEYWORD : ('module') ;
THEME_KEYWORD : ('theme') ;
ELEMENT_KEYWORD : ('element') ;
COMPONENT_KEYWORD : ('component') ;
ANIMATION_KEYWORD : ('animation') ;
PAGE_KEYWORD : ('page') ;
MODEL_KEYWORD : ('model') ;
NAMED : ([a-zA-Z0-9_](([a-zA-Z0-9-_]+)[a-zA-Z0-9_])?) ;
NAMED_WITH_EMPTY_PARAMS : NAMED WS? OPEN_PARENTHESES WS? CLOSE_PARENTHESES ;
NAMED_VAR : NAMED_OBJECT_ARRAY | NAMED_ARRAY | NAMED_OBJECT ;
path : PATH_STRING ;
string: QUOTED_STRING ;
QUOTED_STRING : QUOTES .*? QUOTES;
expression : (EQUALS | OPERATORS) (path | string | (NOT? ((NAMED_VAR | NAMED))) | NUMBERS | isset | (NOT? NULL_VALUE)) ; // | BRACES ARRAY BLOCK;
isset : NOT? (ISSET_KEYWORD | empty_function);
ISSET_KEYWORD : ('isset') ;
empty_function : ('empty' OPEN_PARENTHESES any_var CLOSE_PARENTHESES) ;
if : IF_KEYWORD OPEN_PARENTHESES? expression+ CLOSE_PARENTHESES? curly_block ((ELSE_IF (OPEN_PARENTHESES? expression+ CLOSE_PARENTHESES? curly_block)) | (ELSE curly_block))* ;
IF_KEYWORD : ('if') ;
OPEN_PARENTHESES : ([(]) ;
CLOSE_PARENTHESES: ([)]) ;
ELSE : ('else') ;
ELSE_IF : (('elseif') |  ('else if')) ;
declare_variable : (variable var_type expression?) | (variable variable_options? expression? (STATEMENT_END | (NEW_LINE))) ;
variable : (VAR_ACCESS? ((NAMED_VAR | NAMED))) ;
any_var : NAMED_VAR | NAMED ;
var_name : NAMED ;
COMMA : ([,]) ;
VAR_ACCESS : (REQUIRED_FIELD | STATIC_ACCESS) ;
REQUIRED_FIELD : ('*' [^ ]);
variable_options : var_type | var_options | var_type var_options ;
var_options :  VAR_MAGIC;
VAR_MAGIC : 'get' | 'set' | 'none';
property : var_name COLON property_value (STATEMENT_END | NEW_LINE)?;
property_value : QUOTED_STRING | PATH_STRING | HTML_ELEMENT | NAMED | NAMED_DOT | (NAMED_VAR | NAMED) | NUMBERS | NULL_VALUE  ;
PROPERTY_VALUES : QUOTED_STRING | PATH_STRING | HTML_ELEMENT | NAMED | NAMED_DOT | (NAMED_VAR | NAMED) | NUMBERS | NULL_VALUE ; // | BRACES_ARRAY_BLOCK | NAMED_PROPERTY_OBJECT | NAMED_PROPERTY ;
loop : LOOP_DECLARATION ;
LOOP_DECLARATION :  ('repeat') ; // (((('through') NAMED  ('as') NAMED) | (('until') ([(])? expression+ ([)])? (('from') NUMBERS)?) | (('while') ([(])? expression+ ([)])?))) curly_block ;
switch_block :  SWITCH_KEYWORD named_switch SWITCH_CURLY_BLOCK ;
SWITCH_KEYWORD : ('switch') ;
// CURLY BLOCK + IF_DECLARATION (if)
//( ((('continue')[;] |  ('break')[;] | ((((GO_TO  | LOOP_DECLARATION | NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,]))*)? (NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)))+ ))
curly_block: (OPEN_BRACKETS) syntax+ (CLOSE_BRACKETS) ;
// SWITCH CURLY BLOCK + IF_DECLARATION (if)
SWITCH_CURLY_BLOCK : 'switch' ; // (OPEN_BRACKETS) (((('case')(([0-9]+)|(["'])([^"'])*(["'])|'null')[:]) | (('default')[:]) | ('break')[;])* | (((((GO_TO | PATH_STRING | LOOP_DECLARATION | NUMBERS | PROPERTY  | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) ([,]))*)? (PATH_STRING | NUMBERS | PROPERTY | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)))* (CLOSE_BRACKETS)) ;
functions : (FUNCTION_TYPES ARRAY_TYPE_SUFFIX? | NAMED_CLASS_ARRAY)? FUNCTION ENCLOSED_WITH_ARGS curly_block ;
ARRAY_TYPE_SUFFIX : [[][\]] ;
FUNCTION : ((STATIC_ACCESS)? ((NAMED_PARENTHESIS_FUNCTIONS)  | (NAMED EMPTY_PARENTHESIS))) ;
FUNCTION_TYPES: TYPES | ('update') | ('void') | ('element') | ('component') | ('model') | NAMED;
var_type : ('string') | ('number') | ('bool') | ('boolean') | ('dynamic') | ('function') | ('time') | ('id') ;
TYPES :   ('string') | ('number') | ('bool') | ('boolean') | ('dynamic') | ('function') | ('time') | ('id');
ENCLOSED_WITH_ARGS : NAMED_WITH_PARAMS_SPECIAL | (NAMED EMPTY_PARENTHESIS) ;
NAMED_WITH_PARAMS_SPECIAL : ([(]) ((NAMED ((([,]) '...args')?)) | (((([,]) NAMED)+) ((([,])' ...args')?))) ([)]) ;
//NAMED_WITH_PARAMS_VAR : (([(]) ((NAMED_VAR | NAMED) ([,])?)+ ('...' NAMED) ([)])) ;
condtional : expression+ CONDITIONAL_IF expression* CONDITIONAL_ELSE expression* STATEMENT_END? ;
CONDITIONAL_IF : WS '?' WS;
CONDITIONAL_ELSE : WS ':' WS;
OPERATORS : ([.]) | ([&][&]) | ([|][|]) | ([=][=]) | ([*]) | ([+]) | ([\-]) | ([\\]) | ([%]) | ([<]) | ([>]) | ([<][=]) | ([>][=]) | ([=][=][=]) | ([+][=]) | ([-][=]) | ([/][=]) | ([*][=]) | ([%][=]) | ([(]) | ([(]) ;
//BRACES_ARRAY_BLOCK : ([[]()?([)]) (((NUMBERS | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,])))*)? (NUMBERS | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)? (()?[\]])) ;
//CURLY_OBJECT_BLOCK : ((OPEN_BRACKETS)([)]) (((NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,])))*)? (NUMBERS | PROPERTY | PATH_STRING | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)? ((CLOSE_BRACKETS))) ;
//PROPERTY : NAMED_PROPERTY PROPERTY_VALUES STATEMENT_END? ;
//NAMED_PROPERTY_OBJECT : NAMED ([(]) (((PROPERTY) (PROPERTY_VALUES)?) ([,])?)+ ([)]) ;
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
PATH_STRING : (PATH_START? [a-zA-Z\\/._0-9-]+) ;
STATIC_ACCESS : '::' ;
COLON : [:] ;
EQUALS : '=' ;
NOT : '!' ;
APPEND_ADD : '++' ;
APPEND_SUBTRACT : '--' ;
PATH_START : '^' ;
OPEN_BRACKETS : '{' ;
CLOSE_BRACKETS : '}' ;
NEW_LINE : ([\n]+) -> channel(HIDDEN) ;
END_OF_FILE : EOF;
QUOTES : (["']) ;
COMMENT_BLOCK_DECLARATION : [/][*]  [^/*]*([*][/]) -> channel(HIDDEN) ;
WS : [ \t\r]+ -> channel(HIDDEN) ;
STATEMENT_END : ([;]) ;
