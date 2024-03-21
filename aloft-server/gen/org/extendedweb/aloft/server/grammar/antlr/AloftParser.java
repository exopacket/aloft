// Generated from /home/ryan/aloft/aloft-server/src/main/java/org/extendedweb/aloft/server/grammar/antlr/Aloft.g4 by ANTLR 4.13.1
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
		T__9=10, T__10=11, T__11=12, QUERY_KEYWORD=13, CONSTRUCTOR_KEYWORD=14, 
		CALLABLE_KEYWORD=15, SOURCE_KEYWORD=16, MODULE_KEYWORD=17, THEME_KEYWORD=18, 
		ELEMENT_KEYWORD=19, COMPONENT_KEYWORD=20, ANIMATION_KEYWORD=21, ROUTES_KEYWORD=22, 
		PAGE_KEYWORD=23, MODEL_KEYWORD=24, NAMED=25, NAMED_VAR=26, QUOTED_STRING=27, 
		ARRAY_TYPE_SUFFIX=28, ISSET_KEYWORD=29, IF_KEYWORD=30, OPEN_PARENTHESES=31, 
		CLOSE_PARENTHESES=32, ELSE=33, ELSE_IF=34, COMMA=35, REQUIRED_FIELD=36, 
		VAR_MAGIC=37, LOOP_name_declaration=38, SWITCH_KEYWORD=39, SWITCH_CURLY_BLOCK=40, 
		CONDITIONAL_IF=41, CONDITIONAL_ELSE=42, OPERATORS=43, DECIMALS=44, DIGITS=45, 
		HTML_ELEMENT=46, NULL_VALUE=47, EMPTY_PARENTHESIS=48, NAMED_DOT=49, NAMED_CLASS_ARRAY=50, 
		NAMED_OBJECT=51, NAMED_OBJECT_ARRAY=52, NAMED_ARRAY=53, GOTO_KEYWORD=54, 
		FILE_NAME=55, STATIC_ACCESS=56, COLON=57, EQUALS=58, NOT=59, APPEND_ADD=60, 
		APPEND_SUBTRACT=61, PATH_START=62, OPEN_BRACKETS=63, CLOSE_BRACKETS=64, 
		OPEN_BRACES=65, CLOSE_BRACES=66, END_OF_FILE=67, QUOTES=68, COMMENT_BLOCK_name_declaration=69, 
		WS=70, STATEMENT_END=71, NEW_LINE=72;
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
			null, "'update'", "'void'", "'return'", "'empty'", "'string'", "'number'", 
			"'bool'", "'boolean'", "'dynamic'", "'function'", "'time'", "'...args'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'*'", 
			null, null, null, "'switch'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'::'", null, "'='", 
			"'!'", "'++'", "'--'", null, "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "QUERY_KEYWORD", "CONSTRUCTOR_KEYWORD", "CALLABLE_KEYWORD", "SOURCE_KEYWORD", 
			"MODULE_KEYWORD", "THEME_KEYWORD", "ELEMENT_KEYWORD", "COMPONENT_KEYWORD", 
			"ANIMATION_KEYWORD", "ROUTES_KEYWORD", "PAGE_KEYWORD", "MODEL_KEYWORD", 
			"NAMED", "NAMED_VAR", "QUOTED_STRING", "ARRAY_TYPE_SUFFIX", "ISSET_KEYWORD", 
			"IF_KEYWORD", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", "ELSE", "ELSE_IF", 
			"COMMA", "REQUIRED_FIELD", "VAR_MAGIC", "LOOP_name_declaration", "SWITCH_KEYWORD", 
			"SWITCH_CURLY_BLOCK", "CONDITIONAL_IF", "CONDITIONAL_ELSE", "OPERATORS", 
			"DECIMALS", "DIGITS", "HTML_ELEMENT", "NULL_VALUE", "EMPTY_PARENTHESIS", 
			"NAMED_DOT", "NAMED_CLASS_ARRAY", "NAMED_OBJECT", "NAMED_OBJECT_ARRAY", 
			"NAMED_ARRAY", "GOTO_KEYWORD", "FILE_NAME", "STATIC_ACCESS", "COLON", 
			"EQUALS", "NOT", "APPEND_ADD", "APPEND_SUBTRACT", "PATH_START", "OPEN_BRACKETS", 
			"CLOSE_BRACKETS", "OPEN_BRACES", "CLOSE_BRACES", "END_OF_FILE", "QUOTES", 
			"COMMENT_BLOCK_name_declaration", "WS", "STATEMENT_END", "NEW_LINE"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 72057937702399974L) != 0) || _la==STATEMENT_END );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_syntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_syntaxContext function_syntax() throws RecognitionException {
		Function_syntaxContext _localctx = new Function_syntaxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_syntax);
		try {
			setState(162);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(COMPONENT_KEYWORD);
			setState(165);
			var_name();
			setState(166);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ELEMENT_KEYWORD);
			setState(169);
			var_name();
			setState(170);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(THEME_KEYWORD);
			setState(173);
			var_name();
			setState(174);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(MODEL_KEYWORD);
			setState(177);
			var_name();
			setState(178);
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
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitRoutes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutesContext routes() throws RecognitionException {
		RoutesContext _localctx = new RoutesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_routes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ROUTES_KEYWORD);
			setState(181);
			path();
			setState(182);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(PAGE_KEYWORD);
			setState(185);
			var_name();
			setState(186);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAnimation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_animation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ANIMATION_KEYWORD);
			setState(189);
			var_name();
			setState(190);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(MODULE_KEYWORD);
			setState(193);
			var_name();
			setState(194);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(QUERY_KEYWORD);
			setState(197);
			var_name_with_params();
			setState(198);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(SOURCE_KEYWORD);
			setState(201);
			path();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(202);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitCallable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallableContext callable() throws RecognitionException {
		CallableContext _localctx = new CallableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CALLABLE_KEYWORD);
			setState(206);
			path();
			setState(207);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(CONSTRUCTOR_KEYWORD);
			setState(210);
			var_name();
			setState(211);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPath_with_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_with_varContext path_with_var() throws RecognitionException {
		Path_with_varContext _localctx = new Path_with_varContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_path_with_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			file_name();
			setState(216);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPath_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_varContext path_var() throws RecognitionException {
		Path_varContext _localctx = new Path_varContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_path_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			match(OPEN_BRACKETS);
			}
			setState(219);
			var_name();
			{
			setState(220);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_path);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				path_with_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(OPEN_BRACES);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 2344174188058640385L) != 0)) {
				{
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					property_value();
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(228);
						match(COMMA);
						}
					}

					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 2344174188058640385L) != 0) );
				}
			}

			setState(237);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			function_declaration();
			setState(242);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
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
			setState(244);
			function_types();
			}
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_TYPE_SUFFIX) {
					{
					setState(245);
					match(ARRAY_TYPE_SUFFIX);
					}
				}

				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC_ACCESS) {
					{
					setState(248);
					match(STATIC_ACCESS);
					}
				}

				}
				break;
			}
			{
			setState(253);
			name_declaration();
			setState(254);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			any_var();
			setState(257);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typesContext function_types() throws RecognitionException {
		Function_typesContext _localctx = new Function_typesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_types);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(259);
				match(T__0);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(260);
				match(T__1);
				}
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case NAMED:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(261);
					var_type();
					}
					break;
				case 2:
					{
					setState(262);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitDeclare_variable(this);
			else return visitor.visitChildren(this);
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
			setState(267);
			variable();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_MAGIC) {
				{
				setState(268);
				var_options();
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS) {
				{
				setState(271);
				assignment();
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(272);
					var_expression();
					}
					break;
				case 2:
					{
					setState(273);
					expression();
					}
					break;
				}
				}
			}

			}
			}
			{
			setState(278);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAssign_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_variableContext assign_variable() throws RecognitionException {
		Assign_variableContext _localctx = new Assign_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(282);
				private_named_multiple();
				}
				break;
			case 2:
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REQUIRED_FIELD || _la==STATIC_ACCESS) {
					{
					setState(283);
					var_access();
					}
				}

				setState(286);
				var_names();
				}
				break;
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33558496L) != 0)) {
				{
				setState(289);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_names(this);
			else return visitor.visitChildren(this);
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
			setState(292);
			var_name();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(293);
					match(COMMA);
					setState(294);
					var_name();
					}
					}
					setState(297); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAny_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_varContext any_var() throws RecognitionException {
		Any_varContext _localctx = new Any_varContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_any_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitName_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_declarationContext name_declaration() throws RecognitionException {
		Name_declarationContext _localctx = new Name_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_name_declaration);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				var_name();
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPrivate_named(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Private_namedContext private_named() throws RecognitionException {
		Private_namedContext _localctx = new Private_namedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_private_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(OPEN_PARENTHESES);
			setState(308);
			match(NAMED);
			setState(309);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPrivate_named_multiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Private_named_multipleContext private_named_multiple() throws RecognitionException {
		Private_named_multipleContext _localctx = new Private_named_multipleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_private_named_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			var_access();
			setState(312);
			match(OPEN_PARENTHESES);
			setState(313);
			var_names();
			setState(314);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_name_with_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_name_with_paramsContext var_name_with_params() throws RecognitionException {
		Var_name_with_paramsContext _localctx = new Var_name_with_paramsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_var_name_with_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			var_name();
			setState(317);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESES) {
					{
					setState(321);
					match(OPEN_PARENTHESES);
					}
				}

				{
				setState(324);
				expression_value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				expression_value();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS) {
					{
					setState(329); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(326);
						assignment();
						}
						setState(327);
						expression_value();
						}
						}
						setState(331); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==OPERATORS );
					}
				}

				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(335);
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
		public List<Any_varContext> any_var() {
			return getRuleContexts(Any_varContext.class);
		}
		public Any_varContext any_var(int i) {
			return getRuleContext(Any_varContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitExpression_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_valueContext expression_value() throws RecognitionException {
		Expression_valueContext _localctx = new Expression_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(340);
				var_expression();
				}
				break;
			case 2:
				{
				setState(341);
				any_var();
				}
				break;
			}
			setState(344);
			assignment();
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(345);
				var_expression();
				}
				break;
			case 2:
				{
				setState(346);
				any_var();
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
	public static class Var_expressionContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IssetContext isset() {
			return getRuleContext(IssetContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_expressionContext var_expression() throws RecognitionException {
		Var_expressionContext _localctx = new Var_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_var_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(349);
				path();
				}
				break;
			case 2:
				{
				{
				{
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(350);
					match(NOT);
					}
				}

				{
				setState(353);
				var_name_with_params();
				}
				}
				}
				}
				break;
			case 3:
				{
				setState(354);
				string();
				}
				break;
			case 4:
				{
				setState(355);
				number();
				}
				break;
			case 5:
				{
				setState(356);
				isset();
				}
				break;
			case 6:
				{
				{
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(357);
					match(NOT);
					}
				}

				setState(360);
				match(NULL_VALUE);
				}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__2);
			{
			setState(366);
			match(WS);
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(367);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitIsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IssetContext isset() throws RecognitionException {
		IssetContext _localctx = new IssetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_isset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(370);
				match(NOT);
				}
			}

			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISSET_KEYWORD:
				{
				setState(373);
				match(ISSET_KEYWORD);
				}
				break;
			case T__3:
				{
				setState(374);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitEmpty_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_functionContext empty_function() throws RecognitionException {
		Empty_functionContext _localctx = new Empty_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_empty_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(377);
			match(T__3);
			setState(378);
			match(OPEN_PARENTHESES);
			setState(379);
			any_var();
			setState(380);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IF_KEYWORD);
			setState(383);
			expression();
			setState(384);
			curly_block();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE_IF:
					{
					{
					setState(385);
					match(ELSE_IF);
					{
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESES) {
						{
						setState(386);
						match(OPEN_PARENTHESES);
						}
					}

					setState(390); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(389);
						var_expression();
						}
						}
						setState(392); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 612665471887474704L) != 0) );
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_PARENTHESES) {
						{
						setState(394);
						match(CLOSE_PARENTHESES);
						}
					}

					setState(397);
					curly_block();
					}
					}
					}
					break;
				case ELSE:
					{
					{
					setState(399);
					match(ELSE);
					setState(400);
					curly_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(405);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_accessContext var_access() throws RecognitionException {
		Var_accessContext _localctx = new Var_accessContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_var_access);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRED_FIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				required_field();
				}
				break;
			case STATIC_ACCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitRequired_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Required_fieldContext required_field() throws RecognitionException {
		Required_fieldContext _localctx = new Required_fieldContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_required_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitStatic_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_fieldContext static_field() throws RecognitionException {
		Static_fieldContext _localctx = new Static_fieldContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_static_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_optionsContext var_options() throws RecognitionException {
		Var_optionsContext _localctx = new Var_optionsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_var_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_var_type);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(416);
				match(T__4);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(417);
				match(T__5);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(418);
				match(T__6);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(419);
				match(T__7);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(420);
				match(T__8);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(421);
				match(T__9);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(422);
				match(T__10);
				}
				}
				break;
			case NAMED:
				enterOuterAlt(_localctx, 8);
				{
				setState(423);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitParam_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_valuesContext param_values() throws RecognitionException {
		Param_valuesContext _localctx = new Param_valuesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_param_values);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(EMPTY_PARENTHESIS);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_argsContext var_args() throws RecognitionException {
		Var_argsContext _localctx = new Var_argsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_var_args);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(EMPTY_PARENTHESIS);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			var_name();
			setState(435);
			match(COLON);
			setState(436);
			property_value();
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(437);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitReturn_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_return_value);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				return_property_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(OPEN_BRACES);
				setState(442);
				property();
				setState(443);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitHtml_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_html_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitComponent_tree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_treeContext component_tree() throws RecognitionException {
		Component_treeContext _localctx = new Component_treeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_component_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			var_name();
			setState(450);
			match(OPEN_PARENTHESES);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_ELEMENT) {
				{
				setState(451);
				html_element();
				setState(452);
				match(COMMA);
				}
			}

			setState(456);
			property();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(459); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(457);
					match(COMMA);
					setState(458);
					property();
					}
					}
					setState(461); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(465);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitProperty_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_property_value);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				var_name_with_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				component_tree();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(472);
					number();
					}
					break;
				case 2:
					{
					setState(473);
					string();
					}
					break;
				case 3:
					{
					setState(474);
					html_element();
					}
					break;
				case 4:
					{
					setState(475);
					match(NAMED);
					}
					break;
				case 5:
					{
					setState(476);
					match(NAMED_DOT);
					}
					break;
				case 6:
					{
					setState(477);
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
					setState(478);
					match(NULL_VALUE);
					}
					break;
				case 8:
					{
					setState(479);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitReturn_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_property_valueContext return_property_value() throws RecognitionException {
		Return_property_valueContext _localctx = new Return_property_valueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_return_property_value);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				var_name_with_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(488);
					number();
					}
					break;
				case 2:
					{
					setState(489);
					string();
					}
					break;
				case 3:
					{
					setState(490);
					html_element();
					}
					break;
				case 4:
					{
					setState(491);
					match(NAMED);
					}
					break;
				case 5:
					{
					setState(492);
					match(NAMED_DOT);
					}
					break;
				case 6:
					{
					setState(493);
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
					setState(494);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitSwitch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(SWITCH_KEYWORD);
			setState(502);
			named_switch();
			setState(503);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitCurly_block(this);
			else return visitor.visitChildren(this);
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
			setState(505);
			match(OPEN_BRACKETS);
			}
			setState(507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(506);
				syntax();
				}
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 72057937702399974L) != 0) || _la==STATEMENT_END );
			{
			setState(511);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_curly_block(this);
			else return visitor.visitChildren(this);
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
			setState(513);
			match(OPEN_BRACKETS);
			}
			setState(515); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(514);
				function_syntax();
				}
				}
				setState(517); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 684723685541560344L) != 0) );
			{
			setState(519);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitNamed_with_params_special(this);
			else return visitor.visitChildren(this);
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
			setState(521);
			match(OPEN_PARENTHESES);
			}
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				{
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					{
					setState(522);
					var_name();
					setState(524);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(523);
						match(COMMA);
						}
						break;
					}
					}
					}
					}
					setState(528); 
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
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					{
					setState(530);
					var_name();
					setState(532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(531);
						match(COMMA);
						}
						break;
					}
					}
					}
					}
					setState(536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAMED );
				}
				}
				}
				break;
			}
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(540);
				match(COMMA);
				{
				setState(541);
				match(T__11);
				}
				}
			}

			setState(544);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitNamed_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_switchContext named_switch() throws RecognitionException {
		Named_switchContext _localctx = new Named_switchContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_named_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(OPEN_PARENTHESES);
			setState(547);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==NAMED_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(548);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitEnclosed_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enclosed_varsContext enclosed_vars() throws RecognitionException {
		Enclosed_varsContext _localctx = new Enclosed_varsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enclosed_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(OPEN_PARENTHESES);
			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(551);
					match(COMMA);
					}
				}

				setState(554);
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
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34460401664L) != 0) );
			setState(559);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_goto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(GOTO_KEYWORD);
			setState(562);
			path();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(563);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		"\u0004\u0001H\u0239\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00a3\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00cc\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00e1\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00e6\b\u0013\u0004\u0013\u00e8\b"+
		"\u0013\u000b\u0013\f\u0013\u00e9\u0003\u0013\u00ec\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00f7\b\u0016\u0001\u0016\u0003\u0016"+
		"\u00fa\b\u0016\u0003\u0016\u00fc\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0108\b\u0018\u0003\u0018\u010a\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u010e\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0113\b\u0019\u0003\u0019\u0115\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u011d\b\u001b\u0001\u001b\u0003\u001b\u0120\b\u001b\u0001\u001b"+
		"\u0003\u001b\u0123\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c"+
		"\u0128\b\u001c\u000b\u001c\f\u001c\u0129\u0003\u001c\u012c\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0132\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0003#\u0143\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0004#\u014a\b#\u000b#\f#\u014b\u0003#\u014e"+
		"\b#\u0001#\u0003#\u0151\b#\u0003#\u0153\b#\u0001$\u0001$\u0003$\u0157"+
		"\b$\u0001$\u0001$\u0001$\u0003$\u015c\b$\u0001%\u0001%\u0003%\u0160\b"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0167\b%\u0001%\u0003%\u016a"+
		"\b%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u0171\b\'\u0001(\u0003"+
		"(\u0174\b(\u0001(\u0001(\u0003(\u0178\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0184\b*\u0001*\u0004*\u0187"+
		"\b*\u000b*\f*\u0188\u0001*\u0003*\u018c\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u0192\b*\n*\f*\u0195\t*\u0001+\u0001+\u0003+\u0199\b+\u0001,"+
		"\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u01a9\b/\u00010\u00010\u00030\u01ad\b0\u0001"+
		"1\u00011\u00031\u01b1\b1\u00012\u00012\u00012\u00012\u00032\u01b7\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u01be\b3\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u01c7\b5\u00015\u00015\u00015\u00045\u01cc"+
		"\b5\u000b5\f5\u01cd\u00035\u01d0\b5\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u01e1\b6\u00036\u01e3\b6\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00037\u01f0\b7\u00037\u01f2\b7\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u0001:\u0001:\u0004:\u01fc\b:\u000b"+
		":\f:\u01fd\u0001:\u0001:\u0001;\u0001;\u0004;\u0204\b;\u000b;\f;\u0205"+
		"\u0001;\u0001;\u0001<\u0001<\u0001<\u0003<\u020d\b<\u0004<\u020f\b<\u000b"+
		"<\f<\u0210\u0001<\u0001<\u0003<\u0215\b<\u0004<\u0217\b<\u000b<\f<\u0218"+
		"\u0003<\u021b\b<\u0001<\u0001<\u0003<\u021f\b<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0003>\u0229\b>\u0001>\u0004>\u022c\b>\u000b"+
		">\f>\u022d\u0001>\u0001>\u0001?\u0001?\u0001?\u0003?\u0235\b?\u0001@\u0001"+
		"@\u0001@\u0000\u0000A\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0000\u0001\u0001\u0000\u0019\u001a\u0267\u0000"+
		"\u0083\u0001\u0000\u0000\u0000\u0002\u0099\u0001\u0000\u0000\u0000\u0004"+
		"\u00a2\u0001\u0000\u0000\u0000\u0006\u00a4\u0001\u0000\u0000\u0000\b\u00a8"+
		"\u0001\u0000\u0000\u0000\n\u00ac\u0001\u0000\u0000\u0000\f\u00b0\u0001"+
		"\u0000\u0000\u0000\u000e\u00b4\u0001\u0000\u0000\u0000\u0010\u00b8\u0001"+
		"\u0000\u0000\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00c0\u0001"+
		"\u0000\u0000\u0000\u0016\u00c4\u0001\u0000\u0000\u0000\u0018\u00c8\u0001"+
		"\u0000\u0000\u0000\u001a\u00cd\u0001\u0000\u0000\u0000\u001c\u00d1\u0001"+
		"\u0000\u0000\u0000\u001e\u00d5\u0001\u0000\u0000\u0000 \u00d7\u0001\u0000"+
		"\u0000\u0000\"\u00da\u0001\u0000\u0000\u0000$\u00e0\u0001\u0000\u0000"+
		"\u0000&\u00e2\u0001\u0000\u0000\u0000(\u00ef\u0001\u0000\u0000\u0000*"+
		"\u00f1\u0001\u0000\u0000\u0000,\u00f4\u0001\u0000\u0000\u0000.\u0100\u0001"+
		"\u0000\u0000\u00000\u0109\u0001\u0000\u0000\u00002\u010b\u0001\u0000\u0000"+
		"\u00004\u0118\u0001\u0000\u0000\u00006\u011f\u0001\u0000\u0000\u00008"+
		"\u0124\u0001\u0000\u0000\u0000:\u012d\u0001\u0000\u0000\u0000<\u0131\u0001"+
		"\u0000\u0000\u0000>\u0133\u0001\u0000\u0000\u0000@\u0137\u0001\u0000\u0000"+
		"\u0000B\u013c\u0001\u0000\u0000\u0000D\u013f\u0001\u0000\u0000\u0000F"+
		"\u0152\u0001\u0000\u0000\u0000H\u0156\u0001\u0000\u0000\u0000J\u0169\u0001"+
		"\u0000\u0000\u0000L\u016b\u0001\u0000\u0000\u0000N\u016d\u0001\u0000\u0000"+
		"\u0000P\u0173\u0001\u0000\u0000\u0000R\u0179\u0001\u0000\u0000\u0000T"+
		"\u017e\u0001\u0000\u0000\u0000V\u0198\u0001\u0000\u0000\u0000X\u019a\u0001"+
		"\u0000\u0000\u0000Z\u019c\u0001\u0000\u0000\u0000\\\u019e\u0001\u0000"+
		"\u0000\u0000^\u01a8\u0001\u0000\u0000\u0000`\u01ac\u0001\u0000\u0000\u0000"+
		"b\u01b0\u0001\u0000\u0000\u0000d\u01b2\u0001\u0000\u0000\u0000f\u01bd"+
		"\u0001\u0000\u0000\u0000h\u01bf\u0001\u0000\u0000\u0000j\u01c1\u0001\u0000"+
		"\u0000\u0000l\u01e2\u0001\u0000\u0000\u0000n\u01f1\u0001\u0000\u0000\u0000"+
		"p\u01f3\u0001\u0000\u0000\u0000r\u01f5\u0001\u0000\u0000\u0000t\u01f9"+
		"\u0001\u0000\u0000\u0000v\u0201\u0001\u0000\u0000\u0000x\u0209\u0001\u0000"+
		"\u0000\u0000z\u0222\u0001\u0000\u0000\u0000|\u0226\u0001\u0000\u0000\u0000"+
		"~\u0231\u0001\u0000\u0000\u0000\u0080\u0236\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\u0003\u0002\u0001\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\u0000\u0000\u0001\u0088\u0001\u0001\u0000\u0000\u0000\u0089"+
		"\u009a\u0003p8\u0000\u008a\u009a\u0003*\u0015\u0000\u008b\u009a\u0003"+
		"\u0016\u000b\u0000\u008c\u009a\u0003\u0018\f\u0000\u008d\u009a\u0003\u0006"+
		"\u0003\u0000\u008e\u009a\u0003\b\u0004\u0000\u008f\u009a\u0003\f\u0006"+
		"\u0000\u0090\u009a\u0003\n\u0005\u0000\u0091\u009a\u0003\u001a\r\u0000"+
		"\u0092\u009a\u0003\u000e\u0007\u0000\u0093\u009a\u0003\u0010\b\u0000\u0094"+
		"\u009a\u0003\u0012\t\u0000\u0095\u009a\u0003\u0014\n\u0000\u0096\u009a"+
		"\u0003d2\u0000\u0097\u009a\u00032\u0019\u0000\u0098\u009a\u0005G\u0000"+
		"\u0000\u0099\u0089\u0001\u0000\u0000\u0000\u0099\u008a\u0001\u0000\u0000"+
		"\u0000\u0099\u008b\u0001\u0000\u0000\u0000\u0099\u008c\u0001\u0000\u0000"+
		"\u0000\u0099\u008d\u0001\u0000\u0000\u0000\u0099\u008e\u0001\u0000\u0000"+
		"\u0000\u0099\u008f\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000\u0000"+
		"\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099\u0092\u0001\u0000\u0000"+
		"\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000"+
		"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u0003\u0001\u0000\u0000\u0000\u009b\u00a3\u0003r9\u0000\u009c"+
		"\u00a3\u0003T*\u0000\u009d\u00a3\u00034\u001a\u0000\u009e\u00a3\u0003"+
		"\u001c\u000e\u0000\u009f\u00a3\u0003.\u0017\u0000\u00a0\u00a3\u0003N\'"+
		"\u0000\u00a1\u00a3\u00032\u0019\u0000\u00a2\u009b\u0001\u0000\u0000\u0000"+
		"\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000\u0000"+
		"\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u0005\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0014\u0000\u0000"+
		"\u00a5\u00a6\u0003D\"\u0000\u00a6\u00a7\u0003t:\u0000\u00a7\u0007\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u0013\u0000\u0000\u00a9\u00aa\u0003"+
		"D\"\u0000\u00aa\u00ab\u0003t:\u0000\u00ab\t\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0012\u0000\u0000\u00ad\u00ae\u0003D\"\u0000\u00ae\u00af"+
		"\u0003t:\u0000\u00af\u000b\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0018"+
		"\u0000\u0000\u00b1\u00b2\u0003D\"\u0000\u00b2\u00b3\u0003t:\u0000\u00b3"+
		"\r\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00b6"+
		"\u0003$\u0012\u0000\u00b6\u00b7\u0003t:\u0000\u00b7\u000f\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u0017\u0000\u0000\u00b9\u00ba\u0003D\""+
		"\u0000\u00ba\u00bb\u0003t:\u0000\u00bb\u0011\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0015\u0000\u0000\u00bd\u00be\u0003D\"\u0000\u00be\u00bf"+
		"\u0003t:\u0000\u00bf\u0013\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0011"+
		"\u0000\u0000\u00c1\u00c2\u0003D\"\u0000\u00c2\u00c3\u0003t:\u0000\u00c3"+
		"\u0015\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\r\u0000\u0000\u00c5\u00c6"+
		"\u0003B!\u0000\u00c6\u00c7\u0003t:\u0000\u00c7\u0017\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005\u0010\u0000\u0000\u00c9\u00cb\u0003$\u0012\u0000"+
		"\u00ca\u00cc\u0005G\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u0019\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005\u000f\u0000\u0000\u00ce\u00cf\u0003$\u0012\u0000\u00cf\u00d0"+
		"\u0003t:\u0000\u00d0\u001b\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u000e"+
		"\u0000\u0000\u00d2\u00d3\u0003D\"\u0000\u00d3\u00d4\u0003t:\u0000\u00d4"+
		"\u001d\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005-\u0000\u0000\u00d6\u001f"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003\u0080@\u0000\u00d8\u00d9\u0003"+
		"\"\u0011\u0000\u00d9!\u0001\u0000\u0000\u0000\u00da\u00db\u0005?\u0000"+
		"\u0000\u00db\u00dc\u0003D\"\u0000\u00dc\u00dd\u0005@\u0000\u0000\u00dd"+
		"#\u0001\u0000\u0000\u0000\u00de\u00e1\u0003 \u0010\u0000\u00df\u00e1\u0003"+
		"\u0080@\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1%\u0001\u0000\u0000\u0000\u00e2\u00eb\u0005A\u0000\u0000"+
		"\u00e3\u00e5\u0003l6\u0000\u00e4\u00e6\u0005#\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e7"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005B\u0000\u0000\u00ee\'\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005\u001b\u0000\u0000\u00f0)\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0003,\u0016\u0000\u00f2\u00f3\u0003v;\u0000"+
		"\u00f3+\u0001\u0000\u0000\u0000\u00f4\u00fb\u00030\u0018\u0000\u00f5\u00f7"+
		"\u0005\u001c\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00fa"+
		"\u00058\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f6\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0003<\u001e\u0000\u00fe\u00ff\u0003b1"+
		"\u0000\u00ff-\u0001\u0000\u0000\u0000\u0100\u0101\u0003:\u001d\u0000\u0101"+
		"\u0102\u0003b1\u0000\u0102/\u0001\u0000\u0000\u0000\u0103\u010a\u0005"+
		"\u0001\u0000\u0000\u0104\u010a\u0005\u0002\u0000\u0000\u0105\u0108\u0003"+
		"^/\u0000\u0106\u0108\u0003D\"\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000"+
		"\u0109\u0103\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u010a1\u0001\u0000\u0000\u0000\u010b"+
		"\u010d\u00036\u001b\u0000\u010c\u010e\u0003\\.\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0114\u0001"+
		"\u0000\u0000\u0000\u010f\u0112\u0003L&\u0000\u0110\u0113\u0003J%\u0000"+
		"\u0111\u0113\u0003F#\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u010f"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005G\u0000\u0000\u01173\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0003H$\u0000\u01195\u0001\u0000\u0000\u0000"+
		"\u011a\u0120\u0003@ \u0000\u011b\u011d\u0003V+\u0000\u011c\u011b\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u00038\u001c\u0000\u011f\u011a\u0001\u0000"+
		"\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0003^/\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u01237\u0001\u0000\u0000\u0000\u0124"+
		"\u012b\u0003D\"\u0000\u0125\u0126\u0005#\u0000\u0000\u0126\u0128\u0003"+
		"D\"\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0127\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c9\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0007\u0000\u0000\u0000\u012e;\u0001\u0000\u0000\u0000"+
		"\u012f\u0132\u0003D\"\u0000\u0130\u0132\u0003>\u001f\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132=\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0005\u001f\u0000\u0000\u0134\u0135\u0005"+
		"\u0019\u0000\u0000\u0135\u0136\u0005 \u0000\u0000\u0136?\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0003V+\u0000\u0138\u0139\u0005\u001f\u0000\u0000\u0139"+
		"\u013a\u00038\u001c\u0000\u013a\u013b\u0005 \u0000\u0000\u013bA\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0003D\"\u0000\u013d\u013e\u0003`0\u0000"+
		"\u013eC\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0019\u0000\u0000\u0140"+
		"E\u0001\u0000\u0000\u0000\u0141\u0143\u0005\u001f\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0153\u0003H$\u0000\u0145\u014d\u0003H"+
		"$\u0000\u0146\u0147\u0003L&\u0000\u0147\u0148\u0003H$\u0000\u0148\u014a"+
		"\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u0149"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150"+
		"\u0001\u0000\u0000\u0000\u014f\u0151\u0005 \u0000\u0000\u0150\u014f\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001"+
		"\u0000\u0000\u0000\u0152\u0142\u0001\u0000\u0000\u0000\u0152\u0145\u0001"+
		"\u0000\u0000\u0000\u0153G\u0001\u0000\u0000\u0000\u0154\u0157\u0003J%"+
		"\u0000\u0155\u0157\u0003:\u001d\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u015b\u0003L&\u0000\u0159\u015c\u0003J%\u0000\u015a\u015c\u0003"+
		":\u001d\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000"+
		"\u0000\u0000\u015cI\u0001\u0000\u0000\u0000\u015d\u016a\u0003$\u0012\u0000"+
		"\u015e\u0160\u0005;\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u016a\u0003B!\u0000\u0162\u016a\u0003(\u0014\u0000\u0163\u016a\u0003"+
		"\u001e\u000f\u0000\u0164\u016a\u0003P(\u0000\u0165\u0167\u0005;\u0000"+
		"\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0005/\u0000\u0000"+
		"\u0169\u015d\u0001\u0000\u0000\u0000\u0169\u015f\u0001\u0000\u0000\u0000"+
		"\u0169\u0162\u0001\u0000\u0000\u0000\u0169\u0163\u0001\u0000\u0000\u0000"+
		"\u0169\u0164\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000\u0000\u0000"+
		"\u016aK\u0001\u0000\u0000\u0000\u016b\u016c\u0005+\u0000\u0000\u016cM"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0003\u0000\u0000\u016e\u0170"+
		"\u0005F\u0000\u0000\u016f\u0171\u0003f3\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171O\u0001\u0000\u0000"+
		"\u0000\u0172\u0174\u0005;\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000"+
		"\u0175\u0178\u0005\u001d\u0000\u0000\u0176\u0178\u0003R)\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178Q\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005\u0004\u0000\u0000\u017a\u017b\u0005"+
		"\u001f\u0000\u0000\u017b\u017c\u0003:\u001d\u0000\u017c\u017d\u0005 \u0000"+
		"\u0000\u017dS\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u001e\u0000\u0000"+
		"\u017f\u0180\u0003F#\u0000\u0180\u0193\u0003t:\u0000\u0181\u0183\u0005"+
		"\"\u0000\u0000\u0182\u0184\u0005\u001f\u0000\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0003J%\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000\u0000\u0000"+
		"\u018a\u018c\u0005 \u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0003t:\u0000\u018e\u0192\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"!\u0000\u0000\u0190\u0192\u0003t:\u0000\u0191\u0181\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194U\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0196\u0199\u0003X,\u0000\u0197\u0199\u0003Z-\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199W\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0005$\u0000\u0000\u019bY\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u00058\u0000\u0000\u019d[\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0005%\u0000\u0000\u019f]\u0001\u0000\u0000\u0000\u01a0\u01a9\u0005\u0005"+
		"\u0000\u0000\u01a1\u01a9\u0005\u0006\u0000\u0000\u01a2\u01a9\u0005\u0007"+
		"\u0000\u0000\u01a3\u01a9\u0005\b\u0000\u0000\u01a4\u01a9\u0005\t\u0000"+
		"\u0000\u01a5\u01a9\u0005\n\u0000\u0000\u01a6\u01a9\u0005\u000b\u0000\u0000"+
		"\u01a7\u01a9\u0003D\"\u0000\u01a8\u01a0\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a8\u01a2\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9_\u0001\u0000\u0000\u0000\u01aa\u01ad"+
		"\u00050\u0000\u0000\u01ab\u01ad\u0003x<\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ada\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b1\u00050\u0000\u0000\u01af\u01b1\u0003x<\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"c\u0001\u0000\u0000\u0000\u01b2\u01b3\u0003D\"\u0000\u01b3\u01b4\u0005"+
		"9\u0000\u0000\u01b4\u01b6\u0003l6\u0000\u01b5\u01b7\u0005G\u0000\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7e\u0001\u0000\u0000\u0000\u01b8\u01be\u0003n7\u0000\u01b9\u01ba"+
		"\u0005A\u0000\u0000\u01ba\u01bb\u0003d2\u0000\u01bb\u01bc\u0005B\u0000"+
		"\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bd\u01b9\u0001\u0000\u0000\u0000\u01beg\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0005.\u0000\u0000\u01c0i\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0003D\"\u0000\u01c2\u01c6\u0005\u001f\u0000\u0000\u01c3\u01c4\u0003"+
		"h4\u0000\u01c4\u01c5\u0005#\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01cf\u0003d2\u0000\u01c9"+
		"\u01ca\u0005#\u0000\u0000\u01ca\u01cc\u0003d2\u0000\u01cb\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cb\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005"+
		" \u0000\u0000\u01d2k\u0001\u0000\u0000\u0000\u01d3\u01e3\u0003B!\u0000"+
		"\u01d4\u01e3\u0003$\u0012\u0000\u01d5\u01e3\u0003&\u0013\u0000\u01d6\u01e3"+
		"\u0003F#\u0000\u01d7\u01e3\u0003j5\u0000\u01d8\u01e1\u0003\u001e\u000f"+
		"\u0000\u01d9\u01e1\u0003(\u0014\u0000\u01da\u01e1\u0003h4\u0000\u01db"+
		"\u01e1\u0005\u0019\u0000\u0000\u01dc\u01e1\u00051\u0000\u0000\u01dd\u01e1"+
		"\u0007\u0000\u0000\u0000\u01de\u01e1\u0005/\u0000\u0000\u01df\u01e1\u0005"+
		"$\u0000\u0000\u01e0\u01d8\u0001\u0000\u0000\u0000\u01e0\u01d9\u0001\u0000"+
		"\u0000\u0000\u01e0\u01da\u0001\u0000\u0000\u0000\u01e0\u01db\u0001\u0000"+
		"\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01df\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01e2\u01d4\u0001\u0000\u0000\u0000\u01e2\u01d5\u0001\u0000"+
		"\u0000\u0000\u01e2\u01d6\u0001\u0000\u0000\u0000\u01e2\u01d7\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3m\u0001\u0000\u0000"+
		"\u0000\u01e4\u01f2\u0003B!\u0000\u01e5\u01f2\u0003$\u0012\u0000\u01e6"+
		"\u01f2\u0003&\u0013\u0000\u01e7\u01f2\u0003F#\u0000\u01e8\u01f0\u0003"+
		"\u001e\u000f\u0000\u01e9\u01f0\u0003(\u0014\u0000\u01ea\u01f0\u0003h4"+
		"\u0000\u01eb\u01f0\u0005\u0019\u0000\u0000\u01ec\u01f0\u00051\u0000\u0000"+
		"\u01ed\u01f0\u0007\u0000\u0000\u0000\u01ee\u01f0\u0005/\u0000\u0000\u01ef"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ef\u01e9\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1"+
		"\u01e4\u0001\u0000\u0000\u0000\u01f1\u01e5\u0001\u0000\u0000\u0000\u01f1"+
		"\u01e6\u0001\u0000\u0000\u0000\u01f1\u01e7\u0001\u0000\u0000\u0000\u01f1"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f2o\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0005&\u0000\u0000\u01f4q\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\'"+
		"\u0000\u0000\u01f6\u01f7\u0003z=\u0000\u01f7\u01f8\u0005(\u0000\u0000"+
		"\u01f8s\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005?\u0000\u0000\u01fa\u01fc"+
		"\u0003\u0002\u0001\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0005@\u0000\u0000\u0200u\u0001\u0000\u0000\u0000\u0201\u0203\u0005?"+
		"\u0000\u0000\u0202\u0204\u0003\u0004\u0002\u0000\u0203\u0202\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0005@\u0000\u0000\u0208w\u0001\u0000\u0000\u0000"+
		"\u0209\u021a\u0005\u001f\u0000\u0000\u020a\u020c\u0003D\"\u0000\u020b"+
		"\u020d\u0005#\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u020a"+
		"\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u020e"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u021b"+
		"\u0001\u0000\u0000\u0000\u0212\u0214\u0003D\"\u0000\u0213\u0215\u0005"+
		"#\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000"+
		"\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u0212\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b\u0001\u0000"+
		"\u0000\u0000\u021a\u020e\u0001\u0000\u0000\u0000\u021a\u0216\u0001\u0000"+
		"\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021d\u0005#\u0000"+
		"\u0000\u021d\u021f\u0005\f\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0005 \u0000\u0000\u0221y\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0005\u001f\u0000\u0000\u0223\u0224\u0007\u0000\u0000\u0000\u0224\u0225"+
		"\u0005 \u0000\u0000\u0225{\u0001\u0000\u0000\u0000\u0226\u022b\u0005\u001f"+
		"\u0000\u0000\u0227\u0229\u0005#\u0000\u0000\u0228\u0227\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000"+
		"\u0000\u022a\u022c\u0007\u0000\u0000\u0000\u022b\u0228\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0005 \u0000\u0000\u0230}\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u00056\u0000\u0000\u0232\u0234\u0003$\u0012\u0000\u0233\u0235\u0005"+
		"G\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u007f\u0001\u0000\u0000\u0000\u0236\u0237\u00057\u0000"+
		"\u0000\u0237\u0081\u0001\u0000\u0000\u0000@\u0085\u0099\u00a2\u00cb\u00e0"+
		"\u00e5\u00e9\u00eb\u00f6\u00f9\u00fb\u0107\u0109\u010d\u0112\u0114\u011c"+
		"\u011f\u0122\u0129\u012b\u0131\u0142\u014b\u014d\u0150\u0152\u0156\u015b"+
		"\u015f\u0166\u0169\u0170\u0173\u0177\u0183\u0188\u018b\u0191\u0193\u0198"+
		"\u01a8\u01ac\u01b0\u01b6\u01bd\u01c6\u01cd\u01cf\u01e0\u01e2\u01ef\u01f1"+
		"\u01fd\u0205\u020c\u0210\u0214\u0218\u021a\u021e\u0228\u022d\u0234";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}