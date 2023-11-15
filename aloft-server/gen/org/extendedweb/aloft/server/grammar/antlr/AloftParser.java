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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, QUERY_KEYWORD=15, CONSTRUCTOR_KEYWORD=16, 
		CALLABLE_KEYWORD=17, SOURCE_KEYWORD=18, MODULE_KEYWORD=19, THEME_KEYWORD=20, 
		ELEMENT_KEYWORD=21, COMPONENT_KEYWORD=22, ANIMATION_KEYWORD=23, PAGE_KEYWORD=24, 
		MODEL_KEYWORD=25, NUMBERS=26, NAMED=27, NAMED_WITH_EMPTY_PARAMS=28, NAMED_VAR=29, 
		QUOTED_STRING=30, ARRAY_TYPE_SUFFIX=31, ISSET_KEYWORD=32, IF_KEYWORD=33, 
		OPEN_PARENTHESES=34, CLOSE_PARENTHESES=35, ELSE=36, ELSE_IF=37, COMMA=38, 
		VAR_ACCESS=39, REQUIRED_FIELD=40, VAR_MAGIC=41, TYPES=42, PROPERTY_VALUES=43, 
		LOOP_DECLARATION=44, SWITCH_KEYWORD=45, SWITCH_CURLY_BLOCK=46, NAMED_WITH_PARAMS_SPECIAL=47, 
		CONDITIONAL_IF=48, CONDITIONAL_ELSE=49, OPERATORS=50, DECIMALS=51, DIGITS=52, 
		HTML_ELEMENT=53, NULL_VALUE=54, EMPTY_PARENTHESIS=55, NAMED_PARENTHESIS_SPECIAL=56, 
		NAMED_DOT=57, NAMED_CLASS_ARRAY=58, NAMED_OBJECT=59, NAMED_OBJECT_ARRAY=60, 
		NAMED_ARRAY=61, GO_TO=62, GOTO_KEYWORD=63, PATH_STRING=64, STATIC_ACCESS=65, 
		COLON=66, EQUALS=67, NOT=68, APPEND_ADD=69, APPEND_SUBTRACT=70, PATH_START=71, 
		OPEN_BRACKETS=72, CLOSE_BRACKETS=73, NEW_LINE=74, END_OF_FILE=75, QUOTES=76, 
		COMMENT_BLOCK_DECLARATION=77, WS=78, STATEMENT_END=79;
	public static final int
		RULE_r = 0, RULE_syntax = 1, RULE_component = 2, RULE_element = 3, RULE_theme = 4, 
		RULE_model = 5, RULE_page = 6, RULE_animation = 7, RULE_module = 8, RULE_query = 9, 
		RULE_source = 10, RULE_callable = 11, RULE_constructor = 12, RULE_path = 13, 
		RULE_string = 14, RULE_declare_variable = 15, RULE_variable = 16, RULE_any_var = 17, 
		RULE_any_function = 18, RULE_var_name_with_params = 19, RULE_var_name = 20, 
		RULE_expression = 21, RULE_functions = 22, RULE_function = 23, RULE_function_types = 24, 
		RULE_assignment = 25, RULE_isset = 26, RULE_empty_function = 27, RULE_if = 28, 
		RULE_variable_options = 29, RULE_var_options = 30, RULE_var_type = 31, 
		RULE_param_values = 32, RULE_var_args = 33, RULE_property = 34, RULE_property_value = 35, 
		RULE_loop = 36, RULE_switch_block = 37, RULE_curly_block = 38, RULE_condtional = 39, 
		RULE_named_switch = 40, RULE_enclosed_vars = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "syntax", "component", "element", "theme", "model", "page", "animation", 
			"module", "query", "source", "callable", "constructor", "path", "string", 
			"declare_variable", "variable", "any_var", "any_function", "var_name_with_params", 
			"var_name", "expression", "functions", "function", "function_types", 
			"assignment", "isset", "empty_function", "if", "variable_options", "var_options", 
			"var_type", "param_values", "var_args", "property", "property_value", 
			"loop", "switch_block", "curly_block", "condtional", "named_switch", 
			"enclosed_vars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'update'", "'void'", "'element'", "'component'", "'model'", "'empty'", 
			"'string'", "'number'", "'bool'", "'boolean'", "'dynamic'", "'function'", 
			"'time'", "'id'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'switch'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'::'", null, "'='", "'!'", "'++'", 
			"'--'", "'^'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "QUERY_KEYWORD", "CONSTRUCTOR_KEYWORD", "CALLABLE_KEYWORD", 
			"SOURCE_KEYWORD", "MODULE_KEYWORD", "THEME_KEYWORD", "ELEMENT_KEYWORD", 
			"COMPONENT_KEYWORD", "ANIMATION_KEYWORD", "PAGE_KEYWORD", "MODEL_KEYWORD", 
			"NUMBERS", "NAMED", "NAMED_WITH_EMPTY_PARAMS", "NAMED_VAR", "QUOTED_STRING", 
			"ARRAY_TYPE_SUFFIX", "ISSET_KEYWORD", "IF_KEYWORD", "OPEN_PARENTHESES", 
			"CLOSE_PARENTHESES", "ELSE", "ELSE_IF", "COMMA", "VAR_ACCESS", "REQUIRED_FIELD", 
			"VAR_MAGIC", "TYPES", "PROPERTY_VALUES", "LOOP_DECLARATION", "SWITCH_KEYWORD", 
			"SWITCH_CURLY_BLOCK", "NAMED_WITH_PARAMS_SPECIAL", "CONDITIONAL_IF", 
			"CONDITIONAL_ELSE", "OPERATORS", "DECIMALS", "DIGITS", "HTML_ELEMENT", 
			"NULL_VALUE", "EMPTY_PARENTHESIS", "NAMED_PARENTHESIS_SPECIAL", "NAMED_DOT", 
			"NAMED_CLASS_ARRAY", "NAMED_OBJECT", "NAMED_OBJECT_ARRAY", "NAMED_ARRAY", 
			"GO_TO", "GOTO_KEYWORD", "PATH_STRING", "STATIC_ACCESS", "COLON", "EQUALS", 
			"NOT", "APPEND_ADD", "APPEND_SUBTRACT", "PATH_START", "OPEN_BRACKETS", 
			"CLOSE_BRACKETS", "NEW_LINE", "END_OF_FILE", "QUOTES", "COMMENT_BLOCK_DECLARATION", 
			"WS", "STATEMENT_END"
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				syntax();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 306302530965438590L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1043L) != 0) );
			setState(89);
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
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
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
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public AnimationContext animation() {
			return getRuleContext(AnimationContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public CondtionalContext condtional() {
			return getRuleContext(CondtionalContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(AloftParser.NEW_LINE, 0); }
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				switch_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				functions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				query();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				constructor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				source();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				component();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				element();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				model();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(101);
				theme();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(102);
				callable();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(103);
				page();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(104);
				animation();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(105);
				module();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(106);
				declare_variable();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(107);
				condtional();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(108);
				property();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(109);
				match(NEW_LINE);
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
		enterRule(_localctx, 4, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(COMPONENT_KEYWORD);
			setState(113);
			var_name();
			setState(114);
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
		enterRule(_localctx, 6, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ELEMENT_KEYWORD);
			setState(117);
			var_name();
			setState(118);
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
		enterRule(_localctx, 8, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(THEME_KEYWORD);
			setState(121);
			var_name();
			setState(122);
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
		enterRule(_localctx, 10, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(MODEL_KEYWORD);
			setState(125);
			var_name();
			setState(126);
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
		enterRule(_localctx, 12, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(PAGE_KEYWORD);
			setState(129);
			var_name();
			setState(130);
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
		enterRule(_localctx, 14, RULE_animation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ANIMATION_KEYWORD);
			setState(133);
			var_name();
			setState(134);
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
		enterRule(_localctx, 16, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(MODULE_KEYWORD);
			setState(137);
			var_name();
			setState(138);
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
		enterRule(_localctx, 18, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(QUERY_KEYWORD);
			setState(141);
			var_name_with_params();
			setState(142);
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
		enterRule(_localctx, 20, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(SOURCE_KEYWORD);
			setState(145);
			path();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(146);
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
		enterRule(_localctx, 22, RULE_callable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CALLABLE_KEYWORD);
			setState(150);
			path();
			setState(151);
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
		enterRule(_localctx, 24, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CONSTRUCTOR_KEYWORD);
			setState(154);
			var_name();
			setState(155);
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
	public static class PathContext extends ParserRuleContext {
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
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
		enterRule(_localctx, 26, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(PATH_STRING);
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
		enterRule(_localctx, 28, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
	public static class Declare_variableContext extends ParserRuleContext {
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public TerminalNode NEW_LINE() { return getToken(AloftParser.NEW_LINE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_optionsContext variable_options() {
			return getRuleContext(Variable_optionsContext.class,0);
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
		enterRule(_localctx, 30, RULE_declare_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(161);
				variable();
				setState(162);
				var_type();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS || _la==EQUALS) {
					{
					setState(163);
					assignment();
					setState(164);
					expression();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(168);
				variable();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199157505920L) != 0)) {
					{
					setState(169);
					variable_options();
					}
				}

				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS || _la==EQUALS) {
					{
					setState(172);
					assignment();
					setState(173);
					expression();
					}
				}

				}
				}
				break;
			}
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==NEW_LINE || _la==STATEMENT_END) ) {
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR_ACCESS() { return getToken(AloftParser.VAR_ACCESS, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
		enterRule(_localctx, 32, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_ACCESS) {
				{
				setState(181);
				match(VAR_ACCESS);
				}
			}

			{
			setState(184);
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
		enterRule(_localctx, 34, RULE_any_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
	public static class Any_functionContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Any_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAny_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAny_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAny_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_functionContext any_function() throws RecognitionException {
		Any_functionContext _localctx = new Any_functionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_any_function);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(188);
				var_name();
				}
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(189);
				match(OPEN_PARENTHESES);
				setState(190);
				var_name();
				setState(191);
				match(CLOSE_PARENTHESES);
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
		enterRule(_localctx, 38, RULE_var_name_with_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			var_name();
			setState(196);
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
		enterRule(_localctx, 40, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		public TerminalNode NUMBERS() { return getToken(AloftParser.NUMBERS, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IssetContext isset() {
			return getRuleContext(IssetContext.class,0);
		}
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
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
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(NUMBERS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				isset();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(204);
					match(NOT);
					}
				}

				setState(207);
				match(NULL_VALUE);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(208);
					match(NOT);
					}
				}

				setState(211);
				var_name_with_params();
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
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public TerminalNode NAMED_CLASS_ARRAY() { return getToken(AloftParser.NAMED_CLASS_ARRAY, 0); }
		public Function_typesContext function_types() {
			return getRuleContext(Function_typesContext.class,0);
		}
		public TerminalNode ARRAY_TYPE_SUFFIX() { return getToken(AloftParser.ARRAY_TYPE_SUFFIX, 0); }
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case TYPES:
				{
				{
				setState(214);
				function_types();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_TYPE_SUFFIX) {
					{
					setState(215);
					match(ARRAY_TYPE_SUFFIX);
					}
				}

				}
				}
				break;
			case NAMED_CLASS_ARRAY:
				{
				setState(218);
				match(NAMED_CLASS_ARRAY);
				}
				break;
			case NAMED:
			case OPEN_PARENTHESES:
			case STATIC_ACCESS:
				break;
			default:
				break;
			}
			setState(221);
			function();
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
	public static class FunctionContext extends ParserRuleContext {
		public Any_functionContext any_function() {
			return getRuleContext(Any_functionContext.class,0);
		}
		public Var_argsContext var_args() {
			return getRuleContext(Var_argsContext.class,0);
		}
		public TerminalNode STATIC_ACCESS() { return getToken(AloftParser.STATIC_ACCESS, 0); }
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
		enterRule(_localctx, 46, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC_ACCESS) {
				{
				setState(224);
				match(STATIC_ACCESS);
				}
			}

			}
			{
			setState(227);
			any_function();
			setState(228);
			var_args();
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
	public static class Function_typesContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(AloftParser.TYPES, 0); }
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
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPES:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(TYPES);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(231);
				match(T__0);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(232);
				match(T__1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(233);
				match(T__2);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(234);
				match(T__3);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(235);
				match(T__4);
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
		public TerminalNode EQUALS() { return getToken(AloftParser.EQUALS, 0); }
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
		enterRule(_localctx, 50, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==OPERATORS || _la==EQUALS) ) {
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
		enterRule(_localctx, 52, RULE_isset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(240);
				match(NOT);
				}
			}

			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISSET_KEYWORD:
				{
				setState(243);
				match(ISSET_KEYWORD);
				}
				break;
			case T__5:
				{
				setState(244);
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
		enterRule(_localctx, 54, RULE_empty_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(247);
			match(T__5);
			setState(248);
			match(OPEN_PARENTHESES);
			setState(249);
			any_var();
			setState(250);
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
		public List<Curly_blockContext> curly_block() {
			return getRuleContexts(Curly_blockContext.class);
		}
		public Curly_blockContext curly_block(int i) {
			return getRuleContext(Curly_blockContext.class,i);
		}
		public List<TerminalNode> OPEN_PARENTHESES() { return getTokens(AloftParser.OPEN_PARENTHESES); }
		public TerminalNode OPEN_PARENTHESES(int i) {
			return getToken(AloftParser.OPEN_PARENTHESES, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PARENTHESES() { return getTokens(AloftParser.CLOSE_PARENTHESES); }
		public TerminalNode CLOSE_PARENTHESES(int i) {
			return getToken(AloftParser.CLOSE_PARENTHESES, i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(AloftParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(AloftParser.ELSE_IF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(AloftParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AloftParser.ELSE, i);
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
		enterRule(_localctx, 56, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(IF_KEYWORD);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESES) {
				{
				setState(253);
				match(OPEN_PARENTHESES);
				}
			}

			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				expression();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 4900197869642842113L) != 0) );
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PARENTHESES) {
				{
				setState(261);
				match(CLOSE_PARENTHESES);
				}
			}

			setState(264);
			curly_block();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(281);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE_IF:
					{
					{
					setState(265);
					match(ELSE_IF);
					{
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESES) {
						{
						setState(266);
						match(OPEN_PARENTHESES);
						}
					}

					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(269);
						expression();
						}
						}
						setState(272); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 4900197869642842113L) != 0) );
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_PARENTHESES) {
						{
						setState(274);
						match(CLOSE_PARENTHESES);
						}
					}

					setState(277);
					curly_block();
					}
					}
					}
					break;
				case ELSE:
					{
					{
					setState(279);
					match(ELSE);
					setState(280);
					curly_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(285);
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
	public static class Variable_optionsContext extends ParserRuleContext {
		public Var_optionsContext var_options() {
			return getRuleContext(Var_optionsContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Variable_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVariable_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVariable_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVariable_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_optionsContext variable_options() throws RecognitionException {
		Variable_optionsContext _localctx = new Variable_optionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variable_options);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_MAGIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				var_options();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case NAMED:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				var_type();
				setState(288);
				var_options();
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
		enterRule(_localctx, 60, RULE_var_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		enterRule(_localctx, 62, RULE_var_type);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(294);
				match(T__6);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(295);
				match(T__7);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(296);
				match(T__8);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(297);
				match(T__9);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(298);
				match(T__10);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(299);
				match(T__11);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(300);
				match(T__12);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(301);
				match(T__13);
				}
				}
				break;
			case NAMED:
				enterOuterAlt(_localctx, 9);
				{
				setState(302);
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
		public TerminalNode NAMED_WITH_PARAMS_SPECIAL() { return getToken(AloftParser.NAMED_WITH_PARAMS_SPECIAL, 0); }
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
		enterRule(_localctx, 64, RULE_param_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==NAMED_WITH_PARAMS_SPECIAL || _la==EMPTY_PARENTHESIS) ) {
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
	public static class Var_argsContext extends ParserRuleContext {
		public TerminalNode EMPTY_PARENTHESIS() { return getToken(AloftParser.EMPTY_PARENTHESIS, 0); }
		public TerminalNode NAMED_WITH_PARAMS_SPECIAL() { return getToken(AloftParser.NAMED_WITH_PARAMS_SPECIAL, 0); }
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
		enterRule(_localctx, 66, RULE_var_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==NAMED_WITH_PARAMS_SPECIAL || _la==EMPTY_PARENTHESIS) ) {
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
	public static class PropertyContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AloftParser.COLON, 0); }
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public TerminalNode NEW_LINE() { return getToken(AloftParser.NEW_LINE, 0); }
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
		enterRule(_localctx, 68, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			var_name();
			setState(310);
			match(COLON);
			setState(311);
			property_value();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==NEW_LINE || _la==STATEMENT_END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
	public static class Property_valueContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(AloftParser.NUMBERS, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(AloftParser.QUOTED_STRING, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
		public TerminalNode HTML_ELEMENT() { return getToken(AloftParser.HTML_ELEMENT, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode NAMED_DOT() { return getToken(AloftParser.NAMED_DOT, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
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
		enterRule(_localctx, 70, RULE_property_value);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(NUMBERS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(QUOTED_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(PATH_STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(HTML_ELEMENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				match(NAMED);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(NAMED_DOT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				match(NULL_VALUE);
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
		public TerminalNode LOOP_DECLARATION() { return getToken(AloftParser.LOOP_DECLARATION, 0); }
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
		enterRule(_localctx, 72, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(LOOP_DECLARATION);
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
		enterRule(_localctx, 74, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(SWITCH_KEYWORD);
			setState(328);
			named_switch();
			setState(329);
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
		enterRule(_localctx, 76, RULE_curly_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(331);
			match(OPEN_BRACKETS);
			}
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				syntax();
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 306302530965438590L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1043L) != 0) );
			{
			setState(337);
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
	public static class CondtionalContext extends ParserRuleContext {
		public TerminalNode CONDITIONAL_IF() { return getToken(AloftParser.CONDITIONAL_IF, 0); }
		public TerminalNode CONDITIONAL_ELSE() { return getToken(AloftParser.CONDITIONAL_ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public CondtionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condtional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterCondtional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitCondtional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitCondtional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondtionalContext condtional() throws RecognitionException {
		CondtionalContext _localctx = new CondtionalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condtional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				expression();
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 4900197869642842113L) != 0) );
			setState(344);
			match(CONDITIONAL_IF);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 4900197869642842113L) != 0)) {
				{
				{
				setState(345);
				expression();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(CONDITIONAL_ELSE);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					expression();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(358);
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
		enterRule(_localctx, 80, RULE_named_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(OPEN_PARENTHESES);
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==NAMED_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(363);
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
		enterRule(_localctx, 82, RULE_enclosed_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(OPEN_PARENTHESES);
			setState(370); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(366);
					match(COMMA);
					}
				}

				setState(369);
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
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 275548995584L) != 0) );
			setState(374);
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

	public static final String _serializedATN =
		"\u0004\u0001O\u0179\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0004\u0000V\b\u0000\u000b\u0000\f"+
		"\u0000W\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001o\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0094\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00a7\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ab\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b0\b\u000f\u0003\u000f"+
		"\u00b2\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u00b7\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c2\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ce\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00d2\b\u0015\u0001\u0015\u0003\u0015\u00d5"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00d9\b\u0016\u0001\u0016"+
		"\u0003\u0016\u00dc\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0003\u0017\u00e2\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u00ed\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u00f2\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00f6\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u00ff\b\u001c\u0001\u001c\u0004\u001c\u0102\b\u001c\u000b\u001c"+
		"\f\u001c\u0103\u0001\u001c\u0003\u001c\u0107\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u010c\b\u001c\u0001\u001c\u0004\u001c\u010f"+
		"\b\u001c\u000b\u001c\f\u001c\u0110\u0001\u001c\u0003\u001c\u0114\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u011a\b\u001c"+
		"\n\u001c\f\u001c\u011d\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0123\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0130\b\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u013a\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0144\b#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0004&\u014e\b&\u000b&\f&\u014f\u0001"+
		"&\u0001&\u0001\'\u0004\'\u0155\b\'\u000b\'\f\'\u0156\u0001\'\u0001\'\u0005"+
		"\'\u015b\b\'\n\'\f\'\u015e\t\'\u0001\'\u0001\'\u0005\'\u0162\b\'\n\'\f"+
		"\'\u0165\t\'\u0001\'\u0003\'\u0168\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0003)\u0170\b)\u0001)\u0004)\u0173\b)\u000b)\f)\u0174\u0001"+
		")\u0001)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"\u0000\u0004\u0002\u0000JJOO\u0002\u0000\u001b\u001b\u001d\u001d\u0002"+
		"\u000022CC\u0002\u0000//77\u019a\u0000U\u0001\u0000\u0000\u0000\u0002"+
		"n\u0001\u0000\u0000\u0000\u0004p\u0001\u0000\u0000\u0000\u0006t\u0001"+
		"\u0000\u0000\u0000\bx\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000"+
		"\f\u0080\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010"+
		"\u0088\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000\u0014"+
		"\u0090\u0001\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018"+
		"\u0099\u0001\u0000\u0000\u0000\u001a\u009d\u0001\u0000\u0000\u0000\u001c"+
		"\u009f\u0001\u0000\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00b6"+
		"\u0001\u0000\u0000\u0000\"\u00ba\u0001\u0000\u0000\u0000$\u00c1\u0001"+
		"\u0000\u0000\u0000&\u00c3\u0001\u0000\u0000\u0000(\u00c6\u0001\u0000\u0000"+
		"\u0000*\u00d4\u0001\u0000\u0000\u0000,\u00db\u0001\u0000\u0000\u0000."+
		"\u00e1\u0001\u0000\u0000\u00000\u00ec\u0001\u0000\u0000\u00002\u00ee\u0001"+
		"\u0000\u0000\u00004\u00f1\u0001\u0000\u0000\u00006\u00f7\u0001\u0000\u0000"+
		"\u00008\u00fc\u0001\u0000\u0000\u0000:\u0122\u0001\u0000\u0000\u0000<"+
		"\u0124\u0001\u0000\u0000\u0000>\u012f\u0001\u0000\u0000\u0000@\u0131\u0001"+
		"\u0000\u0000\u0000B\u0133\u0001\u0000\u0000\u0000D\u0135\u0001\u0000\u0000"+
		"\u0000F\u0143\u0001\u0000\u0000\u0000H\u0145\u0001\u0000\u0000\u0000J"+
		"\u0147\u0001\u0000\u0000\u0000L\u014b\u0001\u0000\u0000\u0000N\u0154\u0001"+
		"\u0000\u0000\u0000P\u0169\u0001\u0000\u0000\u0000R\u016d\u0001\u0000\u0000"+
		"\u0000TV\u0003\u0002\u0001\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0000\u0000\u0001Z\u0001\u0001\u0000\u0000"+
		"\u0000[o\u0003J%\u0000\\o\u00038\u001c\u0000]o\u0003H$\u0000^o\u0003,"+
		"\u0016\u0000_o\u0003\u0012\t\u0000`o\u0003\u0018\f\u0000ao\u0003\u0014"+
		"\n\u0000bo\u0003\u0004\u0002\u0000co\u0003\u0006\u0003\u0000do\u0003\n"+
		"\u0005\u0000eo\u0003\b\u0004\u0000fo\u0003\u0016\u000b\u0000go\u0003\f"+
		"\u0006\u0000ho\u0003\u000e\u0007\u0000io\u0003\u0010\b\u0000jo\u0003\u001e"+
		"\u000f\u0000ko\u0003N\'\u0000lo\u0003D\"\u0000mo\u0005J\u0000\u0000n["+
		"\u0001\u0000\u0000\u0000n\\\u0001\u0000\u0000\u0000n]\u0001\u0000\u0000"+
		"\u0000n^\u0001\u0000\u0000\u0000n_\u0001\u0000\u0000\u0000n`\u0001\u0000"+
		"\u0000\u0000na\u0001\u0000\u0000\u0000nb\u0001\u0000\u0000\u0000nc\u0001"+
		"\u0000\u0000\u0000nd\u0001\u0000\u0000\u0000ne\u0001\u0000\u0000\u0000"+
		"nf\u0001\u0000\u0000\u0000ng\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000"+
		"\u0000ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0003"+
		"\u0001\u0000\u0000\u0000pq\u0005\u0016\u0000\u0000qr\u0003(\u0014\u0000"+
		"rs\u0003L&\u0000s\u0005\u0001\u0000\u0000\u0000tu\u0005\u0015\u0000\u0000"+
		"uv\u0003(\u0014\u0000vw\u0003L&\u0000w\u0007\u0001\u0000\u0000\u0000x"+
		"y\u0005\u0014\u0000\u0000yz\u0003(\u0014\u0000z{\u0003L&\u0000{\t\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0019\u0000\u0000}~\u0003(\u0014\u0000~\u007f"+
		"\u0003L&\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0018"+
		"\u0000\u0000\u0081\u0082\u0003(\u0014\u0000\u0082\u0083\u0003L&\u0000"+
		"\u0083\r\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0017\u0000\u0000\u0085"+
		"\u0086\u0003(\u0014\u0000\u0086\u0087\u0003L&\u0000\u0087\u000f\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005\u0013\u0000\u0000\u0089\u008a\u0003"+
		"(\u0014\u0000\u008a\u008b\u0003L&\u0000\u008b\u0011\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u000f\u0000\u0000\u008d\u008e\u0003&\u0013\u0000"+
		"\u008e\u008f\u0003L&\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0012\u0000\u0000\u0091\u0093\u0003\u001a\r\u0000\u0092\u0094\u0005"+
		"O\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0011"+
		"\u0000\u0000\u0096\u0097\u0003\u001a\r\u0000\u0097\u0098\u0003L&\u0000"+
		"\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0010\u0000\u0000"+
		"\u009a\u009b\u0003(\u0014\u0000\u009b\u009c\u0003L&\u0000\u009c\u0019"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005@\u0000\u0000\u009e\u001b\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u001e\u0000\u0000\u00a0\u001d\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0003 \u0010\u0000\u00a2\u00a6\u0003>\u001f"+
		"\u0000\u00a3\u00a4\u00032\u0019\u0000\u00a4\u00a5\u0003*\u0015\u0000\u00a5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00b2\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0003 \u0010\u0000\u00a9\u00ab\u0003:\u001d\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00af\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u00032\u0019\u0000\u00ad\u00ae\u0003*\u0015"+
		"\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b1\u00a1\u0001\u0000\u0000\u0000\u00b1\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0000\u0000"+
		"\u0000\u00b4\u001f\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\'\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0001\u0000\u0000"+
		"\u00b9!\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0001\u0000\u0000\u00bb"+
		"#\u0001\u0000\u0000\u0000\u00bc\u00c2\u0003(\u0014\u0000\u00bd\u00be\u0005"+
		"\"\u0000\u0000\u00be\u00bf\u0003(\u0014\u0000\u00bf\u00c0\u0005#\u0000"+
		"\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c2%\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0003(\u0014\u0000\u00c4\u00c5\u0003@ \u0000\u00c5\'\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\u001b\u0000\u0000\u00c7)\u0001\u0000"+
		"\u0000\u0000\u00c8\u00d5\u0005\u001a\u0000\u0000\u00c9\u00d5\u0003\u001a"+
		"\r\u0000\u00ca\u00d5\u0003\u001c\u000e\u0000\u00cb\u00d5\u00034\u001a"+
		"\u0000\u00cc\u00ce\u0005D\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d5\u00056\u0000\u0000\u00d0\u00d2\u0005D\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003&\u0013\u0000\u00d4\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d4\u00c9\u0001\u0000\u0000\u0000\u00d4\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5+\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u00030\u0018\u0000\u00d7\u00d9\u0005\u001f\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00dc\u0005:\u0000\u0000"+
		"\u00db\u00d6\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0003.\u0017\u0000\u00de\u00df\u0003L&\u0000\u00df-\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0005A\u0000\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0003$\u0012\u0000\u00e4\u00e5\u0003B!\u0000"+
		"\u00e5/\u0001\u0000\u0000\u0000\u00e6\u00ed\u0005*\u0000\u0000\u00e7\u00ed"+
		"\u0005\u0001\u0000\u0000\u00e8\u00ed\u0005\u0002\u0000\u0000\u00e9\u00ed"+
		"\u0005\u0003\u0000\u0000\u00ea\u00ed\u0005\u0004\u0000\u0000\u00eb\u00ed"+
		"\u0005\u0005\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ec\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ec\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed1\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007"+
		"\u0002\u0000\u0000\u00ef3\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005D\u0000"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f6\u0005 \u0000\u0000"+
		"\u00f4\u00f6\u00036\u001b\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f65\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005\u0006\u0000\u0000\u00f8\u00f9\u0005\"\u0000\u0000\u00f9\u00fa\u0003"+
		"\"\u0011\u0000\u00fa\u00fb\u0005#\u0000\u0000\u00fb7\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0005!\u0000\u0000\u00fd\u00ff\u0005\"\u0000\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u0102\u0003*\u0015\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u0107\u0005#\u0000\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u011b\u0003L&\u0000\u0109\u010b\u0005%"+
		"\u0000\u0000\u010a\u010c\u0005\"\u0000\u0000\u010b\u010a\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0003*\u0015\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000"+
		"\u0112\u0114\u0005#\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0003L&\u0000\u0116\u011a\u0001\u0000\u0000\u0000\u0117\u0118\u0005"+
		"$\u0000\u0000\u0118\u011a\u0003L&\u0000\u0119\u0109\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c9\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u0123\u0003<\u001e\u0000\u011f\u0120\u0003>\u001f\u0000\u0120\u0121"+
		"\u0003<\u001e\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u011e\u0001"+
		"\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123;\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005)\u0000\u0000\u0125=\u0001\u0000\u0000\u0000"+
		"\u0126\u0130\u0005\u0007\u0000\u0000\u0127\u0130\u0005\b\u0000\u0000\u0128"+
		"\u0130\u0005\t\u0000\u0000\u0129\u0130\u0005\n\u0000\u0000\u012a\u0130"+
		"\u0005\u000b\u0000\u0000\u012b\u0130\u0005\f\u0000\u0000\u012c\u0130\u0005"+
		"\r\u0000\u0000\u012d\u0130\u0005\u000e\u0000\u0000\u012e\u0130\u0003("+
		"\u0014\u0000\u012f\u0126\u0001\u0000\u0000\u0000\u012f\u0127\u0001\u0000"+
		"\u0000\u0000\u012f\u0128\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000"+
		"\u0000\u0000\u012f\u012a\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000"+
		"\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130?\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0007\u0003\u0000\u0000\u0132A\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0007\u0003\u0000\u0000\u0134C\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0003(\u0014\u0000\u0136\u0137\u0005B\u0000\u0000\u0137\u0139\u0003"+
		"F#\u0000\u0138\u013a\u0007\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013aE\u0001\u0000\u0000\u0000"+
		"\u013b\u0144\u0005\u001a\u0000\u0000\u013c\u0144\u0005\u001e\u0000\u0000"+
		"\u013d\u0144\u0005@\u0000\u0000\u013e\u0144\u00055\u0000\u0000\u013f\u0144"+
		"\u0005\u001b\u0000\u0000\u0140\u0144\u00059\u0000\u0000\u0141\u0144\u0007"+
		"\u0001\u0000\u0000\u0142\u0144\u00056\u0000\u0000\u0143\u013b\u0001\u0000"+
		"\u0000\u0000\u0143\u013c\u0001\u0000\u0000\u0000\u0143\u013d\u0001\u0000"+
		"\u0000\u0000\u0143\u013e\u0001\u0000\u0000\u0000\u0143\u013f\u0001\u0000"+
		"\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144G\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005,\u0000\u0000\u0146I\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005-\u0000\u0000\u0148\u0149\u0003P(\u0000\u0149\u014a\u0005"+
		".\u0000\u0000\u014aK\u0001\u0000\u0000\u0000\u014b\u014d\u0005H\u0000"+
		"\u0000\u014c\u014e\u0003\u0002\u0001\u0000\u014d\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0005I\u0000\u0000\u0152M\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0003*\u0015\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015c"+
		"\u00050\u0000\u0000\u0159\u015b\u0003*\u0015\u0000\u015a\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0163\u00051\u0000"+
		"\u0000\u0160\u0162\u0003*\u0015\u0000\u0161\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000"+
		"\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0168\u0005O\u0000\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"O\u0001\u0000\u0000\u0000\u0169\u016a\u0005\"\u0000\u0000\u016a\u016b"+
		"\u0007\u0001\u0000\u0000\u016b\u016c\u0005#\u0000\u0000\u016cQ\u0001\u0000"+
		"\u0000\u0000\u016d\u0172\u0005\"\u0000\u0000\u016e\u0170\u0005&\u0000"+
		"\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0007\u0001\u0000"+
		"\u0000\u0172\u016f\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0005#\u0000\u0000"+
		"\u0177S\u0001\u0000\u0000\u0000%Wn\u0093\u00a6\u00aa\u00af\u00b1\u00b6"+
		"\u00c1\u00cd\u00d1\u00d4\u00d8\u00db\u00e1\u00ec\u00f1\u00f5\u00fe\u0103"+
		"\u0106\u010b\u0110\u0113\u0119\u011b\u0122\u012f\u0139\u0143\u014f\u0156"+
		"\u015c\u0163\u0167\u016f\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}