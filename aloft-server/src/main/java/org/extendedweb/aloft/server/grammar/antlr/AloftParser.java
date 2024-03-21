// Generated from Aloft.g4 by ANTLR 4.13.1
package org.extendedweb.aloft.server.grammar.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AloftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, QUERY_KEYWORD=14, CONSTRUCTOR_KEYWORD=15, 
		CALLABLE_KEYWORD=16, SOURCE_KEYWORD=17, MODULE_KEYWORD=18, THEME_KEYWORD=19, 
		ELEMENT_KEYWORD=20, COMPONENT_KEYWORD=21, ANIMATION_KEYWORD=22, ROUTES_KEYWORD=23, 
		PAGE_KEYWORD=24, MODEL_KEYWORD=25, DECIMALS=26, DIGITS=27, HTML_ELEMENT=28, 
		NAMED=29, NAMED_VAR=30, QUOTED_STRING=31, ARRAY_TYPE_SUFFIX=32, ISSET_KEYWORD=33, 
		IF_KEYWORD=34, OPEN_PARENTHESES=35, CLOSE_PARENTHESES=36, ELSE=37, ELSE_IF=38, 
		COMMA=39, REQUIRED_FIELD=40, VAR_MAGIC=41, LOOP_name_declaration=42, SWITCH_KEYWORD=43, 
		SWITCH_CURLY_BLOCK=44, CONDITIONAL_IF=45, CONDITIONAL_ELSE=46, OPERATORS=47, 
		NULL_VALUE=48, EMPTY_PARENTHESIS=49, NAMED_DOT=50, NAMED_CLASS_ARRAY=51, 
		NAMED_OBJECT=52, NAMED_OBJECT_ARRAY=53, NAMED_ARRAY=54, GOTO_KEYWORD=55, 
		FILE_NAME=56, STATIC_ACCESS=57, COLON=58, EQUALS=59, NOT=60, APPEND_ADD=61, 
		APPEND_SUBTRACT=62, PATH_START=63, OPEN_BRACKETS=64, CLOSE_BRACKETS=65, 
		OPEN_BRACES=66, CLOSE_BRACES=67, END_OF_FILE=68, QUOTES=69, COMMENT_BLOCK_name_declaration=70, 
		WS=71, STATEMENT_END=72, NEW_LINE=73;
	public static final int
		RULE_r = 0, RULE_syntax = 1, RULE_function_syntax = 2, RULE_component = 3, 
		RULE_element = 4, RULE_theme = 5, RULE_model = 6, RULE_routes = 7, RULE_page = 8, 
		RULE_animation = 9, RULE_module = 10, RULE_query = 11, RULE_source = 12, 
		RULE_callable = 13, RULE_constructor = 14, RULE_number = 15, RULE_path_with_var = 16, 
		RULE_path_var = 17, RULE_path = 18, RULE_array = 19, RULE_string = 20, 
		RULE_function = 21, RULE_function_declaration = 22, RULE_function_call = 23, 
		RULE_function_types = 24, RULE_declare_variable = 25, RULE_assign_variable = 26, 
		RULE_variable = 27, RULE_var_names = 28, RULE_any_var = 29, RULE_name_declaration = 30, 
		RULE_private_named = 31, RULE_private_named_multiple = 32, RULE_var_name_with_params = 33, 
		RULE_var_name = 34, RULE_expression = 35, RULE_expression_value = 36, 
		RULE_var_expression = 37, RULE_assignment = 38, RULE_return = 39, RULE_isset = 40, 
		RULE_empty_function = 41, RULE_if = 42, RULE_var_access = 43, RULE_required_field = 44, 
		RULE_static_field = 45, RULE_var_options = 46, RULE_var_type = 47, RULE_param_values = 48, 
		RULE_var_args = 49, RULE_property = 50, RULE_return_value = 51, RULE_html_element = 52, 
		RULE_component_tree = 53, RULE_property_value = 54, RULE_return_property_value = 55, 
		RULE_loop = 56, RULE_switch_block = 57, RULE_curly_block = 58, RULE_function_curly_block = 59, 
		RULE_named_with_params_special = 60, RULE_named_switch = 61, RULE_enclosed_vars = 62, 
		RULE_goto = 63, RULE_file_name = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "syntax", "function_syntax", "component", "element", "theme", "model", 
			"routes", "page", "animation", "module", "query", "source", "callable", 
			"constructor", "number", "path_with_var", "path_var", "path", "array", 
			"string", "function", "function_declaration", "function_call", "function_types", 
			"declare_variable", "assign_variable", "variable", "var_names", "any_var", 
			"name_declaration", "private_named", "private_named_multiple", "var_name_with_params", 
			"var_name", "expression", "expression_value", "var_expression", "assignment", 
			"return", "isset", "empty_function", "if", "var_access", "required_field", 
			"static_field", "var_options", "var_type", "param_values", "var_args", 
			"property", "return_value", "html_element", "component_tree", "property_value", 
			"return_property_value", "loop", "switch_block", "curly_block", "function_curly_block", 
			"named_with_params_special", "named_switch", "enclosed_vars", "goto", 
			"file_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'through'", "'update'", "'void'", "'return'", "'empty'", "'string'", 
			"'number'", "'bool'", "'boolean'", "'dynamic'", "'function'", "'time'", 
			"'...args'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'*'", null, null, null, "'switch'", null, null, 
			null, null, null, null, null, null, null, null, null, null, "'::'", null, 
			"'='", "'!'", "'++'", "'--'", null, "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "QUERY_KEYWORD", "CONSTRUCTOR_KEYWORD", "CALLABLE_KEYWORD", 
			"SOURCE_KEYWORD", "MODULE_KEYWORD", "THEME_KEYWORD", "ELEMENT_KEYWORD", 
			"COMPONENT_KEYWORD", "ANIMATION_KEYWORD", "ROUTES_KEYWORD", "PAGE_KEYWORD", 
			"MODEL_KEYWORD", "DECIMALS", "DIGITS", "HTML_ELEMENT", "NAMED", "NAMED_VAR", 
			"QUOTED_STRING", "ARRAY_TYPE_SUFFIX", "ISSET_KEYWORD", "IF_KEYWORD", 
			"OPEN_PARENTHESES", "CLOSE_PARENTHESES", "ELSE", "ELSE_IF", "COMMA", 
			"REQUIRED_FIELD", "VAR_MAGIC", "LOOP_name_declaration", "SWITCH_KEYWORD", 
			"SWITCH_CURLY_BLOCK", "CONDITIONAL_IF", "CONDITIONAL_ELSE", "OPERATORS", 
			"NULL_VALUE", "EMPTY_PARENTHESIS", "NAMED_DOT", "NAMED_CLASS_ARRAY", 
			"NAMED_OBJECT", "NAMED_OBJECT_ARRAY", "NAMED_ARRAY", "GOTO_KEYWORD", 
			"FILE_NAME", "STATIC_ACCESS", "COLON", "EQUALS", "NOT", "APPEND_ADD", 
			"APPEND_SUBTRACT", "PATH_START", "OPEN_BRACKETS", "CLOSE_BRACKETS", "OPEN_BRACES", 
			"CLOSE_BRACES", "END_OF_FILE", "QUOTES", "COMMENT_BLOCK_name_declaration", 
			"WS", "STATEMENT_END", "NEW_LINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Aloft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AloftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AloftParser.EOF, 0); }
		public List<SyntaxContext> syntax() {
			return getRuleContexts(SyntaxContext.class);
		}
		public SyntaxContext syntax(int i) {
			return getRuleContext(SyntaxContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				syntax();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 144120686237933516L) != 0) || _la==STATEMENT_END );
			setState(135);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyntaxContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public ThemeContext theme() {
			return getRuleContext(ThemeContext.class,0);
		}
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public RoutesContext routes() {
			return getRuleContext(RoutesContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public AnimationContext animation() {
			return getRuleContext(AnimationContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitSyntax(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				query();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				component();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				element();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				model();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				theme();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				callable();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
				routes();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(147);
				page();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(148);
				animation();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(149);
				module();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(150);
				property();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(151);
				declare_variable();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(152);
				match(STATEMENT_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_syntaxContext extends ParserRuleContext {
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public Assign_variableContext assign_variable() {
			return getRuleContext(Assign_variableContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public Function_syntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_syntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_syntax(this);
		}
	}

	public final Function_syntaxContext function_syntax() throws RecognitionException {
		Function_syntaxContext _localctx = new Function_syntaxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_syntax);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				switch_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				assign_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				constructor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				return_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				declare_variable();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				match(STATEMENT_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT_KEYWORD() { return getToken(AloftParser.COMPONENT_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(COMPONENT_KEYWORD);
			setState(166);
			var_name();
			setState(167);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ELEMENT_KEYWORD() { return getToken(AloftParser.ELEMENT_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ELEMENT_KEYWORD);
			setState(170);
			var_name();
			setState(171);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThemeContext extends ParserRuleContext {
		public TerminalNode THEME_KEYWORD() { return getToken(AloftParser.THEME_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitTheme(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(THEME_KEYWORD);
			setState(174);
			var_name();
			setState(175);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode MODEL_KEYWORD() { return getToken(AloftParser.MODEL_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MODEL_KEYWORD);
			setState(178);
			var_name();
			setState(179);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoutesContext extends ParserRuleContext {
		public TerminalNode ROUTES_KEYWORD() { return getToken(AloftParser.ROUTES_KEYWORD, 0); }
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public RoutesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterRoutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitRoutes(this);
		}
	}

	public final RoutesContext routes() throws RecognitionException {
		RoutesContext _localctx = new RoutesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_routes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ROUTES_KEYWORD);
			setState(182);
			var_name();
			{
			setState(183);
			match(T__0);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED:
				{
				setState(184);
				var_name();
				}
				break;
			case COMMA:
				{
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185);
					match(COMMA);
					setState(186);
					var_name();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(193);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE_KEYWORD() { return getToken(AloftParser.PAGE_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(PAGE_KEYWORD);
			setState(196);
			var_name();
			setState(197);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnimationContext extends ParserRuleContext {
		public TerminalNode ANIMATION_KEYWORD() { return getToken(AloftParser.ANIMATION_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public AnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAnimation(this);
		}
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_animation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ANIMATION_KEYWORD);
			setState(200);
			var_name();
			setState(201);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE_KEYWORD() { return getToken(AloftParser.MODULE_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(MODULE_KEYWORD);
			setState(204);
			var_name();
			setState(205);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERY_KEYWORD() { return getToken(AloftParser.QUERY_KEYWORD, 0); }
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(QUERY_KEYWORD);
			setState(208);
			var_name_with_params();
			setState(209);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SOURCE_KEYWORD() { return getToken(AloftParser.SOURCE_KEYWORD, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(SOURCE_KEYWORD);
			setState(212);
			path();
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(213);
				match(STATEMENT_END);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallableContext extends ParserRuleContext {
		public TerminalNode CALLABLE_KEYWORD() { return getToken(AloftParser.CALLABLE_KEYWORD, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public CallableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterCallable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitCallable(this);
		}
	}

	public final CallableContext callable() throws RecognitionException {
		CallableContext _localctx = new CallableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CALLABLE_KEYWORD);
			setState(217);
			path();
			setState(218);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR_KEYWORD() { return getToken(AloftParser.CONSTRUCTOR_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(CONSTRUCTOR_KEYWORD);
			setState(221);
			var_name();
			setState(222);
			curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(AloftParser.DIGITS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(DIGITS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Path_with_varContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Path_varContext path_var() {
			return getRuleContext(Path_varContext.class,0);
		}
		public Path_with_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_with_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPath_with_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPath_with_var(this);
		}
	}

	public final Path_with_varContext path_with_var() throws RecognitionException {
		Path_with_varContext _localctx = new Path_with_varContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_path_with_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			file_name();
			setState(227);
			path_var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Path_varContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACKETS() { return getToken(AloftParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(AloftParser.CLOSE_BRACKETS, 0); }
		public Path_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPath_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPath_var(this);
		}
	}

	public final Path_varContext path_var() throws RecognitionException {
		Path_varContext _localctx = new Path_varContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_path_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			match(OPEN_BRACKETS);
			}
			setState(230);
			var_name();
			{
			setState(231);
			match(CLOSE_BRACKETS);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public Path_with_varContext path_with_var() {
			return getRuleContext(Path_with_varContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_path);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				path_with_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				file_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACES() { return getToken(AloftParser.OPEN_BRACES, 0); }
		public TerminalNode CLOSE_BRACES() { return getToken(AloftParser.CLOSE_BRACES, 0); }
		public List<Property_valueContext> property_value() {
			return getRuleContexts(Property_valueContext.class);
		}
		public Property_valueContext property_value(int i) {
			return getRuleContext(Property_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(OPEN_BRACES);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 2344167622343393281L) != 0)) {
				{
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					property_value();
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(239);
						match(COMMA);
						}
					}

					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 2344167622343393281L) != 0) );
				}
			}

			setState(248);
			match(CLOSE_BRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(AloftParser.QUOTED_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_curly_blockContext function_curly_block() {
			return getRuleContext(Function_curly_blockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			function_declaration();
			setState(253);
			function_curly_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_typesContext function_types() {
			return getRuleContext(Function_typesContext.class,0);
		}
		public Name_declarationContext name_declaration() {
			return getRuleContext(Name_declarationContext.class,0);
		}
		public Var_argsContext var_args() {
			return getRuleContext(Var_argsContext.class,0);
		}
		public TerminalNode ARRAY_TYPE_SUFFIX() { return getToken(AloftParser.ARRAY_TYPE_SUFFIX, 0); }
		public TerminalNode STATIC_ACCESS() { return getToken(AloftParser.STATIC_ACCESS, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(255);
			function_types();
			}
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_TYPE_SUFFIX) {
					{
					setState(256);
					match(ARRAY_TYPE_SUFFIX);
					}
				}

				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC_ACCESS) {
					{
					setState(259);
					match(STATIC_ACCESS);
					}
				}

				}
				break;
			}
			{
			setState(264);
			name_declaration();
			setState(265);
			var_args();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Any_varContext any_var() {
			return getRuleContext(Any_varContext.class,0);
		}
		public Var_argsContext var_args() {
			return getRuleContext(Var_argsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			any_var();
			setState(268);
			var_args();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typesContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Function_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_types(this);
		}
	}

	public final Function_typesContext function_types() throws RecognitionException {
		Function_typesContext _localctx = new Function_typesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_types);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(270);
				match(T__1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(271);
				match(T__2);
				}
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case NAMED:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(272);
					var_type();
					}
					break;
				case 2:
					{
					setState(273);
					var_name();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_variableContext extends ParserRuleContext {
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Var_optionsContext var_options() {
			return getRuleContext(Var_optionsContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Var_expressionContext var_expression() {
			return getRuleContext(Var_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declare_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterDeclare_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitDeclare_variable(this);
		}
	}

	public final Declare_variableContext declare_variable() throws RecognitionException {
		Declare_variableContext _localctx = new Declare_variableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(278);
			variable();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_MAGIC) {
				{
				setState(279);
				var_options();
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS) {
				{
				setState(282);
				assignment();
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(283);
					var_expression();
					}
					break;
				case 2:
					{
					setState(284);
					expression();
					}
					break;
				}
				}
			}

			}
			}
			{
			setState(289);
			match(STATEMENT_END);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_variableContext extends ParserRuleContext {
		public Expression_valueContext expression_value() {
			return getRuleContext(Expression_valueContext.class,0);
		}
		public Assign_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAssign_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAssign_variable(this);
		}
	}

	public final Assign_variableContext assign_variable() throws RecognitionException {
		Assign_variableContext _localctx = new Assign_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			expression_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public Private_named_multipleContext private_named_multiple() {
			return getRuleContext(Private_named_multipleContext.class,0);
		}
		public Var_namesContext var_names() {
			return getRuleContext(Var_namesContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_accessContext var_access() {
			return getRuleContext(Var_accessContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(293);
				private_named_multiple();
				}
				break;
			case 2:
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REQUIRED_FIELD || _la==STATIC_ACCESS) {
					{
					setState(294);
					var_access();
					}
				}

				setState(297);
				var_names();
				}
				break;
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536879040L) != 0)) {
				{
				setState(300);
				var_type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_namesContext extends ParserRuleContext {
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public Var_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_names(this);
		}
	}

	public final Var_namesContext var_names() throws RecognitionException {
		Var_namesContext _localctx = new Var_namesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			var_name();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(304);
					match(COMMA);
					setState(305);
					var_name();
					}
					}
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_varContext extends ParserRuleContext {
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public Any_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAny_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAny_var(this);
		}
	}

	public final Any_varContext any_var() throws RecognitionException {
		Any_varContext _localctx = new Any_varContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_any_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==NAMED_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_declarationContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Private_namedContext private_named() {
			return getRuleContext(Private_namedContext.class,0);
		}
		public Name_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterName_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitName_declaration(this);
		}
	}

	public final Name_declarationContext name_declaration() throws RecognitionException {
		Name_declarationContext _localctx = new Name_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_name_declaration);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				var_name();
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				private_named();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Private_namedContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Private_namedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_private_named; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPrivate_named(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPrivate_named(this);
		}
	}

	public final Private_namedContext private_named() throws RecognitionException {
		Private_namedContext _localctx = new Private_namedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_private_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(OPEN_PARENTHESES);
			setState(319);
			match(NAMED);
			setState(320);
			match(CLOSE_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Private_named_multipleContext extends ParserRuleContext {
		public Var_accessContext var_access() {
			return getRuleContext(Var_accessContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public Var_namesContext var_names() {
			return getRuleContext(Var_namesContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Private_named_multipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_private_named_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPrivate_named_multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPrivate_named_multiple(this);
		}
	}

	public final Private_named_multipleContext private_named_multiple() throws RecognitionException {
		Private_named_multipleContext _localctx = new Private_named_multipleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_private_named_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			var_access();
			setState(323);
			match(OPEN_PARENTHESES);
			setState(324);
			var_names();
			setState(325);
			match(CLOSE_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_name_with_paramsContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Param_valuesContext param_values() {
			return getRuleContext(Param_valuesContext.class,0);
		}
		public Var_name_with_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name_with_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_name_with_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_name_with_params(this);
		}
	}

	public final Var_name_with_paramsContext var_name_with_params() throws RecognitionException {
		Var_name_with_paramsContext _localctx = new Var_name_with_paramsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_var_name_with_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			var_name();
			setState(328);
			param_values();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_name(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(NAMED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Expression_valueContext> expression_value() {
			return getRuleContexts(Expression_valueContext.class);
		}
		public Expression_valueContext expression_value(int i) {
			return getRuleContext(Expression_valueContext.class,i);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESES) {
					{
					setState(332);
					match(OPEN_PARENTHESES);
					}
				}

				{
				setState(335);
				expression_value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				expression_value();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS) {
					{
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(337);
						assignment();
						}
						setState(338);
						expression_value();
						}
						}
						setState(342); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==OPERATORS );
					}
				}

				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(346);
					match(CLOSE_PARENTHESES);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_valueContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<Var_expressionContext> var_expression() {
			return getRuleContexts(Var_expressionContext.class);
		}
		public Var_expressionContext var_expression(int i) {
			return getRuleContext(Var_expressionContext.class,i);
		}
		public Expression_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterExpression_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitExpression_value(this);
		}
	}

	public final Expression_valueContext expression_value() throws RecognitionException {
		Expression_valueContext _localctx = new Expression_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(351);
			var_expression();
			}
			setState(352);
			assignment();
			{
			setState(353);
			var_expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public IssetContext isset() {
			return getRuleContext(IssetContext.class,0);
		}
		public Any_varContext any_var() {
			return getRuleContext(Any_varContext.class,0);
		}
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public Var_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_expression(this);
		}
	}

	public final Var_expressionContext var_expression() throws RecognitionException {
		Var_expressionContext _localctx = new Var_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_var_expression);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				number();
				}
				break;
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				string();
				}
				break;
			case FILE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				path();
				}
				break;
			case T__4:
			case NAMED:
			case NAMED_VAR:
			case ISSET_KEYWORD:
			case NULL_VALUE:
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					{
					{
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(358);
						match(NOT);
						}
					}

					{
					setState(361);
					var_name_with_params();
					}
					}
					}
					}
					break;
				case 2:
					{
					setState(362);
					isset();
					}
					break;
				case 3:
					{
					{
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(363);
						match(NOT);
						}
					}

					setState(366);
					match(NULL_VALUE);
					}
					}
					break;
				case 4:
					{
					setState(367);
					any_var();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode OPERATORS() { return getToken(AloftParser.OPERATORS, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(OPERATORS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(AloftParser.WS, 0); }
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__3);
			{
			setState(375);
			match(WS);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(376);
				return_value();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IssetContext extends ParserRuleContext {
		public TerminalNode ISSET_KEYWORD() { return getToken(AloftParser.ISSET_KEYWORD, 0); }
		public Empty_functionContext empty_function() {
			return getRuleContext(Empty_functionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public IssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterIsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitIsset(this);
		}
	}

	public final IssetContext isset() throws RecognitionException {
		IssetContext _localctx = new IssetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_isset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(379);
				match(NOT);
				}
			}

			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISSET_KEYWORD:
				{
				setState(382);
				match(ISSET_KEYWORD);
				}
				break;
			case T__4:
				{
				setState(383);
				empty_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Empty_functionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public Any_varContext any_var() {
			return getRuleContext(Any_varContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Empty_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterEmpty_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitEmpty_function(this);
		}
	}

	public final Empty_functionContext empty_function() throws RecognitionException {
		Empty_functionContext _localctx = new Empty_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_empty_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			match(T__4);
			setState(387);
			match(OPEN_PARENTHESES);
			setState(388);
			any_var();
			setState(389);
			match(CLOSE_PARENTHESES);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(AloftParser.IF_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Curly_blockContext> curly_block() {
			return getRuleContexts(Curly_blockContext.class);
		}
		public Curly_blockContext curly_block(int i) {
			return getRuleContext(Curly_blockContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(AloftParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(AloftParser.ELSE_IF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(AloftParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AloftParser.ELSE, i);
		}
		public List<TerminalNode> OPEN_PARENTHESES() { return getTokens(AloftParser.OPEN_PARENTHESES); }
		public TerminalNode OPEN_PARENTHESES(int i) {
			return getToken(AloftParser.OPEN_PARENTHESES, i);
		}
		public List<Var_expressionContext> var_expression() {
			return getRuleContexts(Var_expressionContext.class);
		}
		public Var_expressionContext var_expression(int i) {
			return getRuleContext(Var_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PARENTHESES() { return getTokens(AloftParser.CLOSE_PARENTHESES); }
		public TerminalNode CLOSE_PARENTHESES(int i) {
			return getToken(AloftParser.CLOSE_PARENTHESES, i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(IF_KEYWORD);
			setState(392);
			expression();
			setState(393);
			curly_block();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE_IF:
					{
					{
					setState(394);
					match(ELSE_IF);
					{
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESES) {
						{
						setState(395);
						match(OPEN_PARENTHESES);
						}
					}

					setState(399); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(398);
						var_expression();
						}
						}
						setState(401); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1225260586103734304L) != 0) );
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_PARENTHESES) {
						{
						setState(403);
						match(CLOSE_PARENTHESES);
						}
					}

					setState(406);
					curly_block();
					}
					}
					}
					break;
				case ELSE:
					{
					{
					setState(408);
					match(ELSE);
					setState(409);
					curly_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_accessContext extends ParserRuleContext {
		public Required_fieldContext required_field() {
			return getRuleContext(Required_fieldContext.class,0);
		}
		public Static_fieldContext static_field() {
			return getRuleContext(Static_fieldContext.class,0);
		}
		public Var_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_access(this);
		}
	}

	public final Var_accessContext var_access() throws RecognitionException {
		Var_accessContext _localctx = new Var_accessContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_var_access);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRED_FIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				required_field();
				}
				break;
			case STATIC_ACCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				static_field();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Required_fieldContext extends ParserRuleContext {
		public TerminalNode REQUIRED_FIELD() { return getToken(AloftParser.REQUIRED_FIELD, 0); }
		public Required_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterRequired_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitRequired_field(this);
		}
	}

	public final Required_fieldContext required_field() throws RecognitionException {
		Required_fieldContext _localctx = new Required_fieldContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_required_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(REQUIRED_FIELD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Static_fieldContext extends ParserRuleContext {
		public TerminalNode STATIC_ACCESS() { return getToken(AloftParser.STATIC_ACCESS, 0); }
		public Static_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterStatic_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitStatic_field(this);
		}
	}

	public final Static_fieldContext static_field() throws RecognitionException {
		Static_fieldContext _localctx = new Static_fieldContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_static_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(STATIC_ACCESS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_optionsContext extends ParserRuleContext {
		public TerminalNode VAR_MAGIC() { return getToken(AloftParser.VAR_MAGIC, 0); }
		public Var_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_options(this);
		}
	}

	public final Var_optionsContext var_options() throws RecognitionException {
		Var_optionsContext _localctx = new Var_optionsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_var_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(VAR_MAGIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_var_type);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(425);
				match(T__5);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(426);
				match(T__6);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(427);
				match(T__7);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(428);
				match(T__8);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(429);
				match(T__9);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(430);
				match(T__10);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(431);
				match(T__11);
				}
				}
				break;
			case NAMED:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				var_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_valuesContext extends ParserRuleContext {
		public TerminalNode EMPTY_PARENTHESIS() { return getToken(AloftParser.EMPTY_PARENTHESIS, 0); }
		public Named_with_params_specialContext named_with_params_special() {
			return getRuleContext(Named_with_params_specialContext.class,0);
		}
		public Param_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterParam_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitParam_values(this);
		}
	}

	public final Param_valuesContext param_values() throws RecognitionException {
		Param_valuesContext _localctx = new Param_valuesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_param_values);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(EMPTY_PARENTHESIS);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				named_with_params_special();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_argsContext extends ParserRuleContext {
		public TerminalNode EMPTY_PARENTHESIS() { return getToken(AloftParser.EMPTY_PARENTHESIS, 0); }
		public Named_with_params_specialContext named_with_params_special() {
			return getRuleContext(Named_with_params_specialContext.class,0);
		}
		public Var_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_args(this);
		}
	}

	public final Var_argsContext var_args() throws RecognitionException {
		Var_argsContext _localctx = new Var_argsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_var_args);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(EMPTY_PARENTHESIS);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				named_with_params_special();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AloftParser.COLON, 0); }
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			var_name();
			setState(444);
			match(COLON);
			setState(445);
			property_value();
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(446);
				match(STATEMENT_END);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_valueContext extends ParserRuleContext {
		public Return_property_valueContext return_property_value() {
			return getRuleContext(Return_property_valueContext.class,0);
		}
		public TerminalNode OPEN_BRACES() { return getToken(AloftParser.OPEN_BRACES, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(AloftParser.CLOSE_BRACES, 0); }
		public Return_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterReturn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitReturn_value(this);
		}
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_return_value);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				return_property_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(OPEN_BRACES);
				setState(451);
				property();
				setState(452);
				match(CLOSE_BRACES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_elementContext extends ParserRuleContext {
		public TerminalNode HTML_ELEMENT() { return getToken(AloftParser.HTML_ELEMENT, 0); }
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterHtml_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitHtml_element(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_html_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(HTML_ELEMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_treeContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public Component_treeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterComponent_tree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitComponent_tree(this);
		}
	}

	public final Component_treeContext component_tree() throws RecognitionException {
		Component_treeContext _localctx = new Component_treeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_component_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			var_name();
			setState(459);
			match(OPEN_PARENTHESES);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_ELEMENT) {
				{
				setState(460);
				html_element();
				setState(461);
				match(COMMA);
				}
			}

			setState(465);
			property();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(466);
					match(COMMA);
					setState(467);
					property();
					}
					}
					setState(470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(474);
			match(CLOSE_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Property_valueContext extends ParserRuleContext {
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Component_treeContext component_tree() {
			return getRuleContext(Component_treeContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode NAMED_DOT() { return getToken(AloftParser.NAMED_DOT, 0); }
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode REQUIRED_FIELD() { return getToken(AloftParser.REQUIRED_FIELD, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public Property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterProperty_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitProperty_value(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_property_value);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				var_name_with_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				component_tree();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(481);
					number();
					}
					break;
				case 2:
					{
					setState(482);
					string();
					}
					break;
				case 3:
					{
					setState(483);
					html_element();
					}
					break;
				case 4:
					{
					setState(484);
					match(NAMED);
					}
					break;
				case 5:
					{
					setState(485);
					match(NAMED_DOT);
					}
					break;
				case 6:
					{
					setState(486);
					_la = _input.LA(1);
					if ( !(_la==NAMED || _la==NAMED_VAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 7:
					{
					setState(487);
					match(NULL_VALUE);
					}
					break;
				case 8:
					{
					setState(488);
					match(REQUIRED_FIELD);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_property_valueContext extends ParserRuleContext {
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode NAMED_DOT() { return getToken(AloftParser.NAMED_DOT, 0); }
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public Return_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterReturn_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitReturn_property_value(this);
		}
	}

	public final Return_property_valueContext return_property_value() throws RecognitionException {
		Return_property_valueContext _localctx = new Return_property_valueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_return_property_value);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				var_name_with_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(497);
					number();
					}
					break;
				case 2:
					{
					setState(498);
					string();
					}
					break;
				case 3:
					{
					setState(499);
					html_element();
					}
					break;
				case 4:
					{
					setState(500);
					match(NAMED);
					}
					break;
				case 5:
					{
					setState(501);
					match(NAMED_DOT);
					}
					break;
				case 6:
					{
					setState(502);
					_la = _input.LA(1);
					if ( !(_la==NAMED || _la==NAMED_VAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 7:
					{
					setState(503);
					match(NULL_VALUE);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP_name_declaration() { return getToken(AloftParser.LOOP_name_declaration, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(LOOP_name_declaration);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_blockContext extends ParserRuleContext {
		public TerminalNode SWITCH_KEYWORD() { return getToken(AloftParser.SWITCH_KEYWORD, 0); }
		public Named_switchContext named_switch() {
			return getRuleContext(Named_switchContext.class,0);
		}
		public TerminalNode SWITCH_CURLY_BLOCK() { return getToken(AloftParser.SWITCH_CURLY_BLOCK, 0); }
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitSwitch_block(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(SWITCH_KEYWORD);
			setState(511);
			named_switch();
			setState(512);
			match(SWITCH_CURLY_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Curly_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKETS() { return getToken(AloftParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(AloftParser.CLOSE_BRACKETS, 0); }
		public List<SyntaxContext> syntax() {
			return getRuleContexts(SyntaxContext.class);
		}
		public SyntaxContext syntax(int i) {
			return getRuleContext(SyntaxContext.class,i);
		}
		public Curly_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curly_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterCurly_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitCurly_block(this);
		}
	}

	public final Curly_blockContext curly_block() throws RecognitionException {
		Curly_blockContext _localctx = new Curly_blockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_curly_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(514);
			match(OPEN_BRACKETS);
			}
			setState(516); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(515);
				syntax();
				}
				}
				setState(518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 144120686237933516L) != 0) || _la==STATEMENT_END );
			{
			setState(520);
			match(CLOSE_BRACKETS);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_curly_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKETS() { return getToken(AloftParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(AloftParser.CLOSE_BRACKETS, 0); }
		public List<Function_syntaxContext> function_syntax() {
			return getRuleContexts(Function_syntaxContext.class);
		}
		public Function_syntaxContext function_syntax(int i) {
			return getRuleContext(Function_syntaxContext.class,i);
		}
		public Function_curly_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_curly_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_curly_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_curly_block(this);
		}
	}

	public final Function_curly_blockContext function_curly_block() throws RecognitionException {
		Function_curly_blockContext _localctx = new Function_curly_blockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_function_curly_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(522);
			match(OPEN_BRACKETS);
			}
			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(523);
				function_syntax();
				}
				}
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1369385686964142128L) != 0) || _la==STATEMENT_END );
			{
			setState(528);
			match(CLOSE_BRACKETS);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_with_params_specialContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public Named_with_params_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_with_params_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterNamed_with_params_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitNamed_with_params_special(this);
		}
	}

	public final Named_with_params_specialContext named_with_params_special() throws RecognitionException {
		Named_with_params_specialContext _localctx = new Named_with_params_specialContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_named_with_params_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(530);
			match(OPEN_PARENTHESES);
			}
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				{
				setState(535); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					{
					setState(531);
					var_name();
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						setState(532);
						match(COMMA);
						}
						break;
					}
					}
					}
					}
					setState(537); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAMED );
				}
				}
				break;
			case 2:
				{
				{
				{
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					{
					setState(539);
					var_name();
					setState(541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(540);
						match(COMMA);
						}
						break;
					}
					}
					}
					}
					setState(545); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAMED );
				}
				}
				}
				break;
			}
			{
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(549);
				match(COMMA);
				{
				setState(550);
				match(T__12);
				}
				}
			}

			setState(553);
			match(CLOSE_PARENTHESES);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_switchContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public Named_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterNamed_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitNamed_switch(this);
		}
	}

	public final Named_switchContext named_switch() throws RecognitionException {
		Named_switchContext _localctx = new Named_switchContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_named_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(OPEN_PARENTHESES);
			setState(556);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==NAMED_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(557);
			match(CLOSE_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enclosed_varsContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public List<TerminalNode> NAMED_VAR() { return getTokens(AloftParser.NAMED_VAR); }
		public TerminalNode NAMED_VAR(int i) {
			return getToken(AloftParser.NAMED_VAR, i);
		}
		public List<TerminalNode> NAMED() { return getTokens(AloftParser.NAMED); }
		public TerminalNode NAMED(int i) {
			return getToken(AloftParser.NAMED, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public Enclosed_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosed_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterEnclosed_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitEnclosed_vars(this);
		}
	}

	public final Enclosed_varsContext enclosed_vars() throws RecognitionException {
		Enclosed_varsContext _localctx = new Enclosed_varsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enclosed_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(OPEN_PARENTHESES);
			setState(564); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(560);
					match(COMMA);
					}
				}

				setState(563);
				_la = _input.LA(1);
				if ( !(_la==NAMED || _la==NAMED_VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 551366426624L) != 0) );
			setState(568);
			match(CLOSE_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode GOTO_KEYWORD() { return getToken(AloftParser.GOTO_KEYWORD, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitGoto(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_goto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(GOTO_KEYWORD);
			setState(571);
			path();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(572);
				match(STATEMENT_END);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode FILE_NAME() { return getToken(AloftParser.FILE_NAME, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFile_name(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(FILE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u0242\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0004\u0000\u0084\b\u0000\u000b\u0000\f\u0000\u0085\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u009a\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a4\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00bc\b\u0007\u000b\u0007"+
		"\f\u0007\u00bd\u0003\u0007\u00c0\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00d7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00ec\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00f1\b\u0013\u0004\u0013\u00f3\b\u0013"+
		"\u000b\u0013\f\u0013\u00f4\u0003\u0013\u00f7\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0102\b\u0016\u0001\u0016\u0003\u0016\u0105"+
		"\b\u0016\u0003\u0016\u0107\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0113\b\u0018\u0003\u0018\u0115\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0119\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u011e\b\u0019\u0003\u0019\u0120\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0128\b\u001b\u0001\u001b\u0003\u001b\u012b\b\u001b\u0001\u001b\u0003"+
		"\u001b\u012e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u0133"+
		"\b\u001c\u000b\u001c\f\u001c\u0134\u0003\u001c\u0137\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u013d\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0003#\u014e\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0004#\u0155\b#\u000b#\f#\u0156\u0003#\u0159\b"+
		"#\u0001#\u0003#\u015c\b#\u0003#\u015e\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u0168\b%\u0001%\u0001%\u0001%\u0003%\u016d"+
		"\b%\u0001%\u0001%\u0003%\u0171\b%\u0003%\u0173\b%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u017a\b\'\u0001(\u0003(\u017d\b(\u0001(\u0001"+
		"(\u0003(\u0181\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u018d\b*\u0001*\u0004*\u0190\b*\u000b*\f*\u0191"+
		"\u0001*\u0003*\u0195\b*\u0001*\u0001*\u0001*\u0001*\u0005*\u019b\b*\n"+
		"*\f*\u019e\t*\u0001+\u0001+\u0003+\u01a2\b+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u01b2\b/\u00010\u00010\u00030\u01b6\b0\u00011\u00011\u00031\u01ba"+
		"\b1\u00012\u00012\u00012\u00012\u00032\u01c0\b2\u00013\u00013\u00013\u0001"+
		"3\u00013\u00033\u01c7\b3\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00035\u01d0\b5\u00015\u00015\u00015\u00045\u01d5\b5\u000b5\f5\u01d6"+
		"\u00035\u01d9\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u01ea\b6\u0003"+
		"6\u01ec\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u01f9\b7\u00037\u01fb\b7\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u0001:\u0001:\u0004:\u0205\b:\u000b:\f:\u0206\u0001:\u0001"+
		":\u0001;\u0001;\u0004;\u020d\b;\u000b;\f;\u020e\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0003<\u0216\b<\u0004<\u0218\b<\u000b<\f<\u0219\u0001<\u0001"+
		"<\u0003<\u021e\b<\u0004<\u0220\b<\u000b<\f<\u0221\u0003<\u0224\b<\u0001"+
		"<\u0001<\u0003<\u0228\b<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0003>\u0232\b>\u0001>\u0004>\u0235\b>\u000b>\f>\u0236\u0001"+
		">\u0001>\u0001?\u0001?\u0001?\u0003?\u023e\b?\u0001@\u0001@\u0001@\u0000"+
		"\u0000A\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0000\u0001\u0001\u0000\u001d\u001e\u0272\u0000\u0083\u0001\u0000\u0000"+
		"\u0000\u0002\u0099\u0001\u0000\u0000\u0000\u0004\u00a3\u0001\u0000\u0000"+
		"\u0000\u0006\u00a5\u0001\u0000\u0000\u0000\b\u00a9\u0001\u0000\u0000\u0000"+
		"\n\u00ad\u0001\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000\u0000\u000e"+
		"\u00b5\u0001\u0000\u0000\u0000\u0010\u00c3\u0001\u0000\u0000\u0000\u0012"+
		"\u00c7\u0001\u0000\u0000\u0000\u0014\u00cb\u0001\u0000\u0000\u0000\u0016"+
		"\u00cf\u0001\u0000\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a"+
		"\u00d8\u0001\u0000\u0000\u0000\u001c\u00dc\u0001\u0000\u0000\u0000\u001e"+
		"\u00e0\u0001\u0000\u0000\u0000 \u00e2\u0001\u0000\u0000\u0000\"\u00e5"+
		"\u0001\u0000\u0000\u0000$\u00eb\u0001\u0000\u0000\u0000&\u00ed\u0001\u0000"+
		"\u0000\u0000(\u00fa\u0001\u0000\u0000\u0000*\u00fc\u0001\u0000\u0000\u0000"+
		",\u00ff\u0001\u0000\u0000\u0000.\u010b\u0001\u0000\u0000\u00000\u0114"+
		"\u0001\u0000\u0000\u00002\u0116\u0001\u0000\u0000\u00004\u0123\u0001\u0000"+
		"\u0000\u00006\u012a\u0001\u0000\u0000\u00008\u012f\u0001\u0000\u0000\u0000"+
		":\u0138\u0001\u0000\u0000\u0000<\u013c\u0001\u0000\u0000\u0000>\u013e"+
		"\u0001\u0000\u0000\u0000@\u0142\u0001\u0000\u0000\u0000B\u0147\u0001\u0000"+
		"\u0000\u0000D\u014a\u0001\u0000\u0000\u0000F\u015d\u0001\u0000\u0000\u0000"+
		"H\u015f\u0001\u0000\u0000\u0000J\u0172\u0001\u0000\u0000\u0000L\u0174"+
		"\u0001\u0000\u0000\u0000N\u0176\u0001\u0000\u0000\u0000P\u017c\u0001\u0000"+
		"\u0000\u0000R\u0182\u0001\u0000\u0000\u0000T\u0187\u0001\u0000\u0000\u0000"+
		"V\u01a1\u0001\u0000\u0000\u0000X\u01a3\u0001\u0000\u0000\u0000Z\u01a5"+
		"\u0001\u0000\u0000\u0000\\\u01a7\u0001\u0000\u0000\u0000^\u01b1\u0001"+
		"\u0000\u0000\u0000`\u01b5\u0001\u0000\u0000\u0000b\u01b9\u0001\u0000\u0000"+
		"\u0000d\u01bb\u0001\u0000\u0000\u0000f\u01c6\u0001\u0000\u0000\u0000h"+
		"\u01c8\u0001\u0000\u0000\u0000j\u01ca\u0001\u0000\u0000\u0000l\u01eb\u0001"+
		"\u0000\u0000\u0000n\u01fa\u0001\u0000\u0000\u0000p\u01fc\u0001\u0000\u0000"+
		"\u0000r\u01fe\u0001\u0000\u0000\u0000t\u0202\u0001\u0000\u0000\u0000v"+
		"\u020a\u0001\u0000\u0000\u0000x\u0212\u0001\u0000\u0000\u0000z\u022b\u0001"+
		"\u0000\u0000\u0000|\u022f\u0001\u0000\u0000\u0000~\u023a\u0001\u0000\u0000"+
		"\u0000\u0080\u023f\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0002\u0001"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0000\u0000"+
		"\u0001\u0088\u0001\u0001\u0000\u0000\u0000\u0089\u009a\u0003p8\u0000\u008a"+
		"\u009a\u0003*\u0015\u0000\u008b\u009a\u0003\u0016\u000b\u0000\u008c\u009a"+
		"\u0003\u0018\f\u0000\u008d\u009a\u0003\u0006\u0003\u0000\u008e\u009a\u0003"+
		"\b\u0004\u0000\u008f\u009a\u0003\f\u0006\u0000\u0090\u009a\u0003\n\u0005"+
		"\u0000\u0091\u009a\u0003\u001a\r\u0000\u0092\u009a\u0003\u000e\u0007\u0000"+
		"\u0093\u009a\u0003\u0010\b\u0000\u0094\u009a\u0003\u0012\t\u0000\u0095"+
		"\u009a\u0003\u0014\n\u0000\u0096\u009a\u0003d2\u0000\u0097\u009a\u0003"+
		"2\u0019\u0000\u0098\u009a\u0005H\u0000\u0000\u0099\u0089\u0001\u0000\u0000"+
		"\u0000\u0099\u008a\u0001\u0000\u0000\u0000\u0099\u008b\u0001\u0000\u0000"+
		"\u0000\u0099\u008c\u0001\u0000\u0000\u0000\u0099\u008d\u0001\u0000\u0000"+
		"\u0000\u0099\u008e\u0001\u0000\u0000\u0000\u0099\u008f\u0001\u0000\u0000"+
		"\u0000\u0099\u0090\u0001\u0000\u0000\u0000\u0099\u0091\u0001\u0000\u0000"+
		"\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000"+
		"\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000"+
		"\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0003\u0001\u0000\u0000"+
		"\u0000\u009b\u00a4\u0003r9\u0000\u009c\u00a4\u0003T*\u0000\u009d\u00a4"+
		"\u00034\u001a\u0000\u009e\u00a4\u0003\u001c\u000e\u0000\u009f\u00a4\u0003"+
		".\u0017\u0000\u00a0\u00a4\u0003N\'\u0000\u00a1\u00a4\u00032\u0019\u0000"+
		"\u00a2\u00a4\u0005H\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000\u00a3"+
		"\u009c\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3"+
		"\u009e\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u0005\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a7\u0003D\"\u0000\u00a7\u00a8"+
		"\u0003t:\u0000\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0014"+
		"\u0000\u0000\u00aa\u00ab\u0003D\"\u0000\u00ab\u00ac\u0003t:\u0000\u00ac"+
		"\t\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0013\u0000\u0000\u00ae\u00af"+
		"\u0003D\"\u0000\u00af\u00b0\u0003t:\u0000\u00b0\u000b\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0019\u0000\u0000\u00b2\u00b3\u0003D\"\u0000"+
		"\u00b3\u00b4\u0003t:\u0000\u00b4\r\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0017\u0000\u0000\u00b6\u00b7\u0003D\"\u0000\u00b7\u00bf\u0005"+
		"\u0001\u0000\u0000\u00b8\u00c0\u0003D\"\u0000\u00b9\u00ba\u0005\'\u0000"+
		"\u0000\u00ba\u00bc\u0003D\"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b8\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003t:\u0000\u00c2\u000f"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0018\u0000\u0000\u00c4\u00c5"+
		"\u0003D\"\u0000\u00c5\u00c6\u0003t:\u0000\u00c6\u0011\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0016\u0000\u0000\u00c8\u00c9\u0003D\"\u0000"+
		"\u00c9\u00ca\u0003t:\u0000\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0012\u0000\u0000\u00cc\u00cd\u0003D\"\u0000\u00cd\u00ce\u0003"+
		"t:\u0000\u00ce\u0015\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u000e\u0000"+
		"\u0000\u00d0\u00d1\u0003B!\u0000\u00d1\u00d2\u0003t:\u0000\u00d2\u0017"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0011\u0000\u0000\u00d4\u00d6"+
		"\u0003$\u0012\u0000\u00d5\u00d7\u0005H\u0000\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u0019\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0010\u0000\u0000\u00d9\u00da\u0003$\u0012"+
		"\u0000\u00da\u00db\u0003t:\u0000\u00db\u001b\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u000f\u0000\u0000\u00dd\u00de\u0003D\"\u0000\u00de\u00df"+
		"\u0003t:\u0000\u00df\u001d\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u001b"+
		"\u0000\u0000\u00e1\u001f\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u0080"+
		"@\u0000\u00e3\u00e4\u0003\"\u0011\u0000\u00e4!\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005@\u0000\u0000\u00e6\u00e7\u0003D\"\u0000\u00e7\u00e8"+
		"\u0005A\u0000\u0000\u00e8#\u0001\u0000\u0000\u0000\u00e9\u00ec\u0003 "+
		"\u0010\u0000\u00ea\u00ec\u0003\u0080@\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec%\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f6\u0005B\u0000\u0000\u00ee\u00f0\u0003l6\u0000\u00ef\u00f1"+
		"\u0005\'\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"C\u0000\u0000\u00f9\'\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u001f"+
		"\u0000\u0000\u00fb)\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003,\u0016\u0000"+
		"\u00fd\u00fe\u0003v;\u0000\u00fe+\u0001\u0000\u0000\u0000\u00ff\u0106"+
		"\u00030\u0018\u0000\u0100\u0102\u0005 \u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u0105\u00059\u0000\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000"+
		"\u0000\u0106\u0101\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0003<\u001e\u0000"+
		"\u0109\u010a\u0003b1\u0000\u010a-\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0003:\u001d\u0000\u010c\u010d\u0003b1\u0000\u010d/\u0001\u0000\u0000"+
		"\u0000\u010e\u0115\u0005\u0002\u0000\u0000\u010f\u0115\u0005\u0003\u0000"+
		"\u0000\u0110\u0113\u0003^/\u0000\u0111\u0113\u0003D\"\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0001\u0000\u0000\u0000\u0114\u010e\u0001\u0000\u0000\u0000\u0114\u010f"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u01151\u0001"+
		"\u0000\u0000\u0000\u0116\u0118\u00036\u001b\u0000\u0117\u0119\u0003\\"+
		".\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011f\u0001\u0000\u0000\u0000\u011a\u011d\u0003L&\u0000\u011b"+
		"\u011e\u0003J%\u0000\u011c\u011e\u0003F#\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005H\u0000"+
		"\u0000\u01223\u0001\u0000\u0000\u0000\u0123\u0124\u0003H$\u0000\u0124"+
		"5\u0001\u0000\u0000\u0000\u0125\u012b\u0003@ \u0000\u0126\u0128\u0003"+
		"V+\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u00038\u001c\u0000"+
		"\u012a\u0125\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012e\u0003^/\u0000\u012d\u012c"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e7\u0001"+
		"\u0000\u0000\u0000\u012f\u0136\u0003D\"\u0000\u0130\u0131\u0005\'\u0000"+
		"\u0000\u0131\u0133\u0003D\"\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000"+
		"\u0136\u0132\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u01379\u0001\u0000\u0000\u0000\u0138\u0139\u0007\u0000\u0000\u0000\u0139"+
		";\u0001\u0000\u0000\u0000\u013a\u013d\u0003D\"\u0000\u013b\u013d\u0003"+
		">\u001f\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000"+
		"\u0000\u0000\u013d=\u0001\u0000\u0000\u0000\u013e\u013f\u0005#\u0000\u0000"+
		"\u013f\u0140\u0005\u001d\u0000\u0000\u0140\u0141\u0005$\u0000\u0000\u0141"+
		"?\u0001\u0000\u0000\u0000\u0142\u0143\u0003V+\u0000\u0143\u0144\u0005"+
		"#\u0000\u0000\u0144\u0145\u00038\u001c\u0000\u0145\u0146\u0005$\u0000"+
		"\u0000\u0146A\u0001\u0000\u0000\u0000\u0147\u0148\u0003D\"\u0000\u0148"+
		"\u0149\u0003`0\u0000\u0149C\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		"\u001d\u0000\u0000\u014bE\u0001\u0000\u0000\u0000\u014c\u014e\u0005#\u0000"+
		"\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u015e\u0003H$\u0000\u0150"+
		"\u0158\u0003H$\u0000\u0151\u0152\u0003L&\u0000\u0152\u0153\u0003H$\u0000"+
		"\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0151\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000"+
		"\u0158\u0154\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u015c\u0005$\u0000\u0000\u015b"+
		"\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015e\u0001\u0000\u0000\u0000\u015d\u014d\u0001\u0000\u0000\u0000\u015d"+
		"\u0150\u0001\u0000\u0000\u0000\u015eG\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0003J%\u0000\u0160\u0161\u0003L&\u0000\u0161\u0162\u0003J%\u0000\u0162"+
		"I\u0001\u0000\u0000\u0000\u0163\u0173\u0003\u001e\u000f\u0000\u0164\u0173"+
		"\u0003(\u0014\u0000\u0165\u0173\u0003$\u0012\u0000\u0166\u0168\u0005<"+
		"\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0171\u0003B!\u0000"+
		"\u016a\u0171\u0003P(\u0000\u016b\u016d\u0005<\u0000\u0000\u016c\u016b"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u0171\u00050\u0000\u0000\u016f\u0171\u0003"+
		":\u001d\u0000\u0170\u0167\u0001\u0000\u0000\u0000\u0170\u016a\u0001\u0000"+
		"\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0163\u0001\u0000"+
		"\u0000\u0000\u0172\u0164\u0001\u0000\u0000\u0000\u0172\u0165\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173K\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005/\u0000\u0000\u0175M\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005\u0004\u0000\u0000\u0177\u0179\u0005G\u0000\u0000\u0178\u017a"+
		"\u0003f3\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u017aO\u0001\u0000\u0000\u0000\u017b\u017d\u0005<\u0000\u0000"+
		"\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u0181\u0005!\u0000\u0000\u017f"+
		"\u0181\u0003R)\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001"+
		"\u0000\u0000\u0000\u0181Q\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0005"+
		"\u0000\u0000\u0183\u0184\u0005#\u0000\u0000\u0184\u0185\u0003:\u001d\u0000"+
		"\u0185\u0186\u0005$\u0000\u0000\u0186S\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0005\"\u0000\u0000\u0188\u0189\u0003F#\u0000\u0189\u019c\u0003t:\u0000"+
		"\u018a\u018c\u0005&\u0000\u0000\u018b\u018d\u0005#\u0000\u0000\u018c\u018b"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f"+
		"\u0001\u0000\u0000\u0000\u018e\u0190\u0003J%\u0000\u018f\u018e\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000"+
		"\u0000\u0000\u0193\u0195\u0005$\u0000\u0000\u0194\u0193\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0003t:\u0000\u0197\u019b\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0005%\u0000\u0000\u0199\u019b\u0003t:\u0000\u019a\u018a\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019dU\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01a2\u0003X,\u0000\u01a0\u01a2\u0003Z-\u0000\u01a1"+
		"\u019f\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2"+
		"W\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005(\u0000\u0000\u01a4Y\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u00059\u0000\u0000\u01a6[\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005)\u0000\u0000\u01a8]\u0001\u0000\u0000\u0000\u01a9"+
		"\u01b2\u0005\u0006\u0000\u0000\u01aa\u01b2\u0005\u0007\u0000\u0000\u01ab"+
		"\u01b2\u0005\b\u0000\u0000\u01ac\u01b2\u0005\t\u0000\u0000\u01ad\u01b2"+
		"\u0005\n\u0000\u0000\u01ae\u01b2\u0005\u000b\u0000\u0000\u01af\u01b2\u0005"+
		"\f\u0000\u0000\u01b0\u01b2\u0003D\"\u0000\u01b1\u01a9\u0001\u0000\u0000"+
		"\u0000\u01b1\u01aa\u0001\u0000\u0000\u0000\u01b1\u01ab\u0001\u0000\u0000"+
		"\u0000\u01b1\u01ac\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b1\u01ae\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2_\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b6\u00051\u0000\u0000\u01b4\u01b6\u0003x<\u0000\u01b5\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6a\u0001"+
		"\u0000\u0000\u0000\u01b7\u01ba\u00051\u0000\u0000\u01b8\u01ba\u0003x<"+
		"\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bac\u0001\u0000\u0000\u0000\u01bb\u01bc\u0003D\"\u0000\u01bc"+
		"\u01bd\u0005:\u0000\u0000\u01bd\u01bf\u0003l6\u0000\u01be\u01c0\u0005"+
		"H\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0e\u0001\u0000\u0000\u0000\u01c1\u01c7\u0003n7\u0000"+
		"\u01c2\u01c3\u0005B\u0000\u0000\u01c3\u01c4\u0003d2\u0000\u01c4\u01c5"+
		"\u0005C\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c2\u0001\u0000\u0000\u0000\u01c7g\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0005\u001c\u0000\u0000\u01c9i\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0003D\"\u0000\u01cb\u01cf\u0005#\u0000\u0000\u01cc"+
		"\u01cd\u0003h4\u0000\u01cd\u01ce\u0005\'\u0000\u0000\u01ce\u01d0\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d8\u0003"+
		"d2\u0000\u01d2\u01d3\u0005\'\u0000\u0000\u01d3\u01d5\u0003d2\u0000\u01d4"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d4\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0005$\u0000\u0000\u01dbk\u0001\u0000\u0000\u0000\u01dc\u01ec\u0003"+
		"B!\u0000\u01dd\u01ec\u0003$\u0012\u0000\u01de\u01ec\u0003&\u0013\u0000"+
		"\u01df\u01ec\u0003F#\u0000\u01e0\u01ec\u0003j5\u0000\u01e1\u01ea\u0003"+
		"\u001e\u000f\u0000\u01e2\u01ea\u0003(\u0014\u0000\u01e3\u01ea\u0003h4"+
		"\u0000\u01e4\u01ea\u0005\u001d\u0000\u0000\u01e5\u01ea\u00052\u0000\u0000"+
		"\u01e6\u01ea\u0007\u0000\u0000\u0000\u01e7\u01ea\u00050\u0000\u0000\u01e8"+
		"\u01ea\u0005(\u0000\u0000\u01e9\u01e1\u0001\u0000\u0000\u0000\u01e9\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e9\u01e3\u0001\u0000\u0000\u0000\u01e9\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01e9\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01dc"+
		"\u0001\u0000\u0000\u0000\u01eb\u01dd\u0001\u0000\u0000\u0000\u01eb\u01de"+
		"\u0001\u0000\u0000\u0000\u01eb\u01df\u0001\u0000\u0000\u0000\u01eb\u01e0"+
		"\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ecm\u0001"+
		"\u0000\u0000\u0000\u01ed\u01fb\u0003B!\u0000\u01ee\u01fb\u0003$\u0012"+
		"\u0000\u01ef\u01fb\u0003&\u0013\u0000\u01f0\u01fb\u0003F#\u0000\u01f1"+
		"\u01f9\u0003\u001e\u000f\u0000\u01f2\u01f9\u0003(\u0014\u0000\u01f3\u01f9"+
		"\u0003h4\u0000\u01f4\u01f9\u0005\u001d\u0000\u0000\u01f5\u01f9\u00052"+
		"\u0000\u0000\u01f6\u01f9\u0007\u0000\u0000\u0000\u01f7\u01f9\u00050\u0000"+
		"\u0000\u01f8\u01f1\u0001\u0000\u0000\u0000\u01f8\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f3\u0001\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f5\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fa\u01ed\u0001\u0000\u0000\u0000\u01fa\u01ee\u0001\u0000\u0000"+
		"\u0000\u01fa\u01ef\u0001\u0000\u0000\u0000\u01fa\u01f0\u0001\u0000\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fbo\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0005*\u0000\u0000\u01fdq\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0005+\u0000\u0000\u01ff\u0200\u0003z=\u0000\u0200\u0201\u0005,\u0000"+
		"\u0000\u0201s\u0001\u0000\u0000\u0000\u0202\u0204\u0005@\u0000\u0000\u0203"+
		"\u0205\u0003\u0002\u0001\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005A\u0000\u0000\u0209u\u0001\u0000\u0000\u0000\u020a\u020c\u0005"+
		"@\u0000\u0000\u020b\u020d\u0003\u0004\u0002\u0000\u020c\u020b\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0005A\u0000\u0000\u0211w\u0001\u0000\u0000\u0000"+
		"\u0212\u0223\u0005#\u0000\u0000\u0213\u0215\u0003D\"\u0000\u0214\u0216"+
		"\u0005\'\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0213\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u0217\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u0224\u0001"+
		"\u0000\u0000\u0000\u021b\u021d\u0003D\"\u0000\u021c\u021e\u0005\'\u0000"+
		"\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000"+
		"\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u021b\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000\u0000"+
		"\u0000\u0223\u0217\u0001\u0000\u0000\u0000\u0223\u021f\u0001\u0000\u0000"+
		"\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0226\u0005\'\u0000\u0000"+
		"\u0226\u0228\u0005\r\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0005$\u0000\u0000\u022ay\u0001\u0000\u0000\u0000\u022b\u022c\u0005"+
		"#\u0000\u0000\u022c\u022d\u0007\u0000\u0000\u0000\u022d\u022e\u0005$\u0000"+
		"\u0000\u022e{\u0001\u0000\u0000\u0000\u022f\u0234\u0005#\u0000\u0000\u0230"+
		"\u0232\u0005\'\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0235"+
		"\u0007\u0000\u0000\u0000\u0234\u0231\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0005$\u0000\u0000\u0239}\u0001\u0000\u0000\u0000\u023a\u023b\u00057"+
		"\u0000\u0000\u023b\u023d\u0003$\u0012\u0000\u023c\u023e\u0005H\u0000\u0000"+
		"\u023d\u023c\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u007f\u0001\u0000\u0000\u0000\u023f\u0240\u00058\u0000\u0000\u0240"+
		"\u0081\u0001\u0000\u0000\u0000A\u0085\u0099\u00a3\u00bd\u00bf\u00d6\u00eb"+
		"\u00f0\u00f4\u00f6\u0101\u0104\u0106\u0112\u0114\u0118\u011d\u011f\u0127"+
		"\u012a\u012d\u0134\u0136\u013c\u014d\u0156\u0158\u015b\u015d\u0167\u016c"+
		"\u0170\u0172\u0179\u017c\u0180\u018c\u0191\u0194\u019a\u019c\u01a1\u01b1"+
		"\u01b5\u01b9\u01bf\u01c6\u01cf\u01d6\u01d8\u01e9\u01eb\u01f8\u01fa\u0206"+
		"\u020e\u0215\u0219\u021d\u0221\u0223\u0227\u0231\u0236\u023d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}