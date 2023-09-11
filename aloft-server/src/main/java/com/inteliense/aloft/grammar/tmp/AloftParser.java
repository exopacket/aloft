// Generated from Aloft.g4 by ANTLR 4.13.1
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
		CLASS_KEYWORD=1, CLASS_ACCESS=2, COMPONENT_KEYWORD=3, ELEMENT_KEYWORD=4, 
		THEME_KEYWORD=5, MODEL_KEYWORD=6, PAGE_KEYWORD=7, ANIMATION_KEYWORD=8, 
		MODULE_KEYWORD=9, QUERY_KEYWORD=10, SOURCE_KEYWORD=11, CALLABLE_KEYWORD=12, 
		CONSTRUCTOR_KEYWORD=13, NAMED=14, NAMED_WITH_EMPTY_PARAMS=15, NAMED_VAR=16, 
		ISSET_KEYWORD=17, IF_KEYWORD=18, OPEN_PARENTHESES=19, CLOSE_PARENTHESES=20, 
		ELSE=21, ELSE_IF=22, COMMA=23, VAR_ACCESS=24, REQUIRED_FIELD=25, VAR_MAGIC=26, 
		LOOP_DECLARATION=27, SWITCH_KEYWORD=28, SWITCH_CURLY_BLOCK=29, ARRAY_TYPE_SUFFIX=30, 
		FUNCTION=31, FUNCTION_TYPES=32, TYPES=33, ENCLOSED_WITH_ARGS=34, NAMED_WITH_PARAMS_SPECIAL=35, 
		CONDITIONAL_IF=36, CONDITIONAL_ELSE=37, OPERATORS=38, PROPERTY_VALUES=39, 
		NUMBERS=40, DECIMALS=41, DIGITS=42, HTML_ELEMENT=43, NULL_VALUE=44, EMPTY_PARENTHESIS=45, 
		NAMED_PARENTHESIS_SPECIAL=46, NAMED_PARENTHESIS_FUNCTIONS=47, NAMED_DOT=48, 
		NAMED_CLASS_ARRAY=49, NAMED_OBJECT=50, NAMED_OBJECT_ARRAY=51, NAMED_ARRAY=52, 
		GO_TO=53, GOTO_KEYWORD=54, PATH_STRING=55, QUOTED_STRING=56, STATIC_ACCESS=57, 
		COLON=58, EQUALS=59, NOT=60, APPEND_ADD=61, APPEND_SUBTRACT=62, PATH_START=63, 
		OPEN_BRACKETS=64, CLOSE_BRACKETS=65, END_OF_FILE=66, QUOTES=67, COMMENT_BLOCK_DECLARATION=68, 
		NEW_LINE=69, WS=70, STATEMENT_END=71, BRACES_ARRAY_BLOCK=72;
	public static final int
		RULE_r = 0, RULE_syntax = 1, RULE_class = 2, RULE_component = 3, RULE_element = 4, 
		RULE_theme = 5, RULE_model = 6, RULE_page = 7, RULE_animation = 8, RULE_module = 9, 
		RULE_query = 10, RULE_source = 11, RULE_callable = 12, RULE_constructor = 13, 
		RULE_expression = 14, RULE_isset = 15, RULE_if = 16, RULE_declare_variable = 17, 
		RULE_variable = 18, RULE_var_name = 19, RULE_variable_options = 20, RULE_var_options = 21, 
		RULE_property = 22, RULE_property_value = 23, RULE_loop = 24, RULE_switch_block = 25, 
		RULE_curly_block = 26, RULE_functions = 27, RULE_var_type = 28, RULE_condtional = 29, 
		RULE_enclosed_var = 30, RULE_named_switch = 31, RULE_enclosed_vars = 32, 
		RULE_path = 33, RULE_string = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "syntax", "class", "component", "element", "theme", "model", "page", 
			"animation", "module", "query", "source", "callable", "constructor", 
			"expression", "isset", "if", "declare_variable", "variable", "var_name", 
			"variable_options", "var_options", "property", "property_value", "loop", 
			"switch_block", "curly_block", "functions", "var_type", "condtional", 
			"enclosed_var", "named_switch", "enclosed_vars", "path", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'switch'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'::'", null, 
			"'='", "'!'", "'++'", "'--'", "'^'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS_KEYWORD", "CLASS_ACCESS", "COMPONENT_KEYWORD", "ELEMENT_KEYWORD", 
			"THEME_KEYWORD", "MODEL_KEYWORD", "PAGE_KEYWORD", "ANIMATION_KEYWORD", 
			"MODULE_KEYWORD", "QUERY_KEYWORD", "SOURCE_KEYWORD", "CALLABLE_KEYWORD", 
			"CONSTRUCTOR_KEYWORD", "NAMED", "NAMED_WITH_EMPTY_PARAMS", "NAMED_VAR", 
			"ISSET_KEYWORD", "IF_KEYWORD", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
			"ELSE", "ELSE_IF", "COMMA", "VAR_ACCESS", "REQUIRED_FIELD", "VAR_MAGIC", 
			"LOOP_DECLARATION", "SWITCH_KEYWORD", "SWITCH_CURLY_BLOCK", "ARRAY_TYPE_SUFFIX", 
			"FUNCTION", "FUNCTION_TYPES", "TYPES", "ENCLOSED_WITH_ARGS", "NAMED_WITH_PARAMS_SPECIAL", 
			"CONDITIONAL_IF", "CONDITIONAL_ELSE", "OPERATORS", "PROPERTY_VALUES", 
			"NUMBERS", "DECIMALS", "DIGITS", "HTML_ELEMENT", "NULL_VALUE", "EMPTY_PARENTHESIS", 
			"NAMED_PARENTHESIS_SPECIAL", "NAMED_PARENTHESIS_FUNCTIONS", "NAMED_DOT", 
			"NAMED_CLASS_ARRAY", "NAMED_OBJECT", "NAMED_OBJECT_ARRAY", "NAMED_ARRAY", 
			"GO_TO", "GOTO_KEYWORD", "PATH_STRING", "QUOTED_STRING", "STATIC_ACCESS", 
			"COLON", "EQUALS", "NOT", "APPEND_ADD", "APPEND_SUBTRACT", "PATH_START", 
			"OPEN_BRACKETS", "CLOSE_BRACKETS", "END_OF_FILE", "QUOTES", "COMMENT_BLOCK_DECLARATION", 
			"NEW_LINE", "WS", "STATEMENT_END", "BRACES_ARRAY_BLOCK"
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				syntax();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 577023983996993530L) != 0) );
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
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				switch_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				functions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				class_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				query();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				constructor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				source();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				component();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				element();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
				model();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(86);
				theme();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(87);
				callable();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(88);
				page();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(89);
				animation();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(90);
				module();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(91);
				declare_variable();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(92);
				condtional();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(93);
				property();
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS_KEYWORD() { return getToken(AloftParser.CLASS_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitClass(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CLASS_KEYWORD);
			setState(97);
			match(NAMED);
			setState(98);
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT_KEYWORD() { return getToken(AloftParser.COMPONENT_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
			setState(100);
			match(COMPONENT_KEYWORD);
			setState(101);
			match(NAMED);
			setState(102);
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
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
			setState(104);
			match(ELEMENT_KEYWORD);
			setState(105);
			match(NAMED);
			setState(106);
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
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
			setState(108);
			match(THEME_KEYWORD);
			setState(109);
			match(NAMED);
			setState(110);
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
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
			setState(112);
			match(MODEL_KEYWORD);
			setState(113);
			match(NAMED);
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
	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE_KEYWORD() { return getToken(AloftParser.PAGE_KEYWORD, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
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
		enterRule(_localctx, 14, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PAGE_KEYWORD);
			setState(117);
			match(PATH_STRING);
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
	public static class AnimationContext extends ParserRuleContext {
		public TerminalNode ANIMATION_KEYWORD() { return getToken(AloftParser.ANIMATION_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
		enterRule(_localctx, 16, RULE_animation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ANIMATION_KEYWORD);
			setState(121);
			match(NAMED);
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
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE_KEYWORD() { return getToken(AloftParser.MODULE_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
		enterRule(_localctx, 18, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(MODULE_KEYWORD);
			setState(125);
			match(NAMED);
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
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERY_KEYWORD() { return getToken(AloftParser.QUERY_KEYWORD, 0); }
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public TerminalNode NAMED_WITH_PARAMS_SPECIAL() { return getToken(AloftParser.NAMED_WITH_PARAMS_SPECIAL, 0); }
		public TerminalNode NAMED_WITH_EMPTY_PARAMS() { return getToken(AloftParser.NAMED_WITH_EMPTY_PARAMS, 0); }
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
		enterRule(_localctx, 20, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(QUERY_KEYWORD);
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==NAMED_WITH_EMPTY_PARAMS || _la==NAMED_WITH_PARAMS_SPECIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SOURCE_KEYWORD() { return getToken(AloftParser.SOURCE_KEYWORD, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
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
		enterRule(_localctx, 22, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(SOURCE_KEYWORD);
			setState(133);
			match(PATH_STRING);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(134);
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
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
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
		enterRule(_localctx, 24, RULE_callable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(CALLABLE_KEYWORD);
			setState(138);
			match(PATH_STRING);
			setState(139);
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
		enterRule(_localctx, 26, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(CONSTRUCTOR_KEYWORD);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(AloftParser.EQUALS, 0); }
		public TerminalNode OPERATORS() { return getToken(AloftParser.OPERATORS, 0); }
		public TerminalNode BRACES_ARRAY_BLOCK() { return getToken(AloftParser.BRACES_ARRAY_BLOCK, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NUMBERS() { return getToken(AloftParser.NUMBERS, 0); }
		public IssetContext isset() {
			return getRuleContext(IssetContext.class,0);
		}
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==OPERATORS || _la==EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(145);
					match(NOT);
					}
					break;
				}
				setState(148);
				isset();
				}
				}
				break;
			case 2:
				{
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(149);
					match(NOT);
					}
				}

				setState(152);
				match(NULL_VALUE);
				}
				}
				break;
			case 3:
				{
				setState(153);
				match(BRACES_ARRAY_BLOCK);
				}
				break;
			case 4:
				{
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(154);
					match(NOT);
					}
				}

				{
				setState(157);
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
				break;
			case 5:
				{
				setState(158);
				path();
				}
				break;
			case 6:
				{
				setState(159);
				string();
				}
				break;
			case 7:
				{
				setState(160);
				match(NUMBERS);
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
	public static class IssetContext extends ParserRuleContext {
		public TerminalNode ISSET_KEYWORD() { return getToken(AloftParser.ISSET_KEYWORD, 0); }
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
		enterRule(_localctx, 30, RULE_isset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(163);
				match(NOT);
				}
			}

			setState(166);
			match(ISSET_KEYWORD);
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
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF_KEYWORD);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESES) {
				{
				setState(169);
				match(OPEN_PARENTHESES);
				}
			}

			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				expression();
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPERATORS || _la==EQUALS );
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PARENTHESES) {
				{
				setState(177);
				match(CLOSE_PARENTHESES);
				}
			}

			setState(180);
			curly_block();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE_IF:
					{
					{
					setState(181);
					match(ELSE_IF);
					{
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESES) {
						{
						setState(182);
						match(OPEN_PARENTHESES);
						}
					}

					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(185);
						expression();
						}
						}
						setState(188); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==OPERATORS || _la==EQUALS );
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_PARENTHESES) {
						{
						setState(190);
						match(CLOSE_PARENTHESES);
						}
					}

					setState(193);
					curly_block();
					}
					}
					}
					break;
				case ELSE:
					{
					{
					setState(195);
					match(ELSE);
					setState(196);
					curly_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201);
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
	public static class Declare_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public Variable_optionsContext variable_options() {
			return getRuleContext(Variable_optionsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(AloftParser.NEW_LINE, 0); }
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
		enterRule(_localctx, 34, RULE_declare_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			variable();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_MAGIC || _la==TYPES) {
				{
				setState(203);
				variable_options();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS || _la==EQUALS) {
				{
				setState(206);
				expression();
				}
			}

			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STATEMENT_END:
				{
				setState(209);
				match(STATEMENT_END);
				}
				break;
			case NEW_LINE:
				{
				{
				setState(210);
				match(NEW_LINE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_ACCESS) {
				{
				setState(213);
				match(VAR_ACCESS);
				}
			}

			{
			setState(216);
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
		enterRule(_localctx, 38, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
	public static class Variable_optionsContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_optionsContext var_options() {
			return getRuleContext(Var_optionsContext.class,0);
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
	}

	public final Variable_optionsContext variable_options() throws RecognitionException {
		Variable_optionsContext _localctx = new Variable_optionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable_options);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				var_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				var_options();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				var_type();
				setState(223);
				var_options();
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
		enterRule(_localctx, 42, RULE_var_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			var_name();
			setState(230);
			match(COLON);
			setState(231);
			property_value();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE || _la==STATEMENT_END) {
				{
				setState(232);
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
		public TerminalNode PROPERTY_VALUES() { return getToken(AloftParser.PROPERTY_VALUES, 0); }
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
		enterRule(_localctx, 46, RULE_property_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PROPERTY_VALUES);
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
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(SWITCH_KEYWORD);
			setState(240);
			named_switch();
			setState(241);
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
		enterRule(_localctx, 52, RULE_curly_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			match(OPEN_BRACKETS);
			}
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				syntax();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 577023983996993530L) != 0) );
			{
			setState(249);
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
	public static class FunctionsContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AloftParser.FUNCTION, 0); }
		public TerminalNode ENCLOSED_WITH_ARGS() { return getToken(AloftParser.ENCLOSED_WITH_ARGS, 0); }
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public TerminalNode FUNCTION_TYPES() { return getToken(AloftParser.FUNCTION_TYPES, 0); }
		public TerminalNode NAMED_CLASS_ARRAY() { return getToken(AloftParser.NAMED_CLASS_ARRAY, 0); }
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
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_TYPES:
				{
				setState(251);
				match(FUNCTION_TYPES);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_TYPE_SUFFIX) {
					{
					setState(252);
					match(ARRAY_TYPE_SUFFIX);
					}
				}

				}
				break;
			case NAMED_CLASS_ARRAY:
				{
				setState(255);
				match(NAMED_CLASS_ARRAY);
				}
				break;
			case FUNCTION:
				break;
			default:
				break;
			}
			setState(258);
			match(FUNCTION);
			setState(259);
			match(ENCLOSED_WITH_ARGS);
			setState(260);
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
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(AloftParser.TYPES, 0); }
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
		enterRule(_localctx, 56, RULE_var_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(TYPES);
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
	}

	public final CondtionalContext condtional() throws RecognitionException {
		CondtionalContext _localctx = new CondtionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condtional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264);
				expression();
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPERATORS || _la==EQUALS );
			setState(269);
			match(CONDITIONAL_IF);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORS || _la==EQUALS) {
				{
				{
				setState(270);
				expression();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(CONDITIONAL_ELSE);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					expression();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(283);
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
	public static class Enclosed_varContext extends ParserRuleContext {
		public TerminalNode NAMED_PARENTHESIS_SPECIAL() { return getToken(AloftParser.NAMED_PARENTHESIS_SPECIAL, 0); }
		public Enclosed_varsContext enclosed_vars() {
			return getRuleContext(Enclosed_varsContext.class,0);
		}
		public Enclosed_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosed_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterEnclosed_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitEnclosed_var(this);
		}
	}

	public final Enclosed_varContext enclosed_var() throws RecognitionException {
		Enclosed_varContext _localctx = new Enclosed_varContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enclosed_var);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED_PARENTHESIS_SPECIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(NAMED_PARENTHESIS_SPECIAL);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				enclosed_vars();
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
		enterRule(_localctx, 62, RULE_named_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(OPEN_PARENTHESES);
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==NAMED_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
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
		enterRule(_localctx, 64, RULE_enclosed_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(OPEN_PARENTHESES);
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(295);
					match(COMMA);
					}
				}

				setState(298);
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
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8470528L) != 0) );
			setState(303);
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
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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

	public static final String _serializedATN =
		"\u0004\u0001H\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0004\u0000H\b\u0000\u000b\u0000\f\u0000I\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"_\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0088\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u0093\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0097\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u009c\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00a2\b\u000e\u0001\u000f\u0003\u000f\u00a5\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00ab\b\u0010\u0001"+
		"\u0010\u0004\u0010\u00ae\b\u0010\u000b\u0010\f\u0010\u00af\u0001\u0010"+
		"\u0003\u0010\u00b3\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00b8\b\u0010\u0001\u0010\u0004\u0010\u00bb\b\u0010\u000b\u0010\f\u0010"+
		"\u00bc\u0001\u0010\u0003\u0010\u00c0\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00c6\b\u0010\n\u0010\f\u0010\u00c9\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00cd\b\u0011\u0001\u0011\u0003\u0011"+
		"\u00d0\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d4\b\u0011\u0001"+
		"\u0012\u0003\u0012\u00d7\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00e2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00ea\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0004\u001a\u00f6\b\u001a\u000b\u001a\f\u001a\u00f7"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u00fe\b\u001b"+
		"\u0001\u001b\u0003\u001b\u0101\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u010a\b\u001d"+
		"\u000b\u001d\f\u001d\u010b\u0001\u001d\u0001\u001d\u0005\u001d\u0110\b"+
		"\u001d\n\u001d\f\u001d\u0113\t\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0117\b\u001d\n\u001d\f\u001d\u011a\t\u001d\u0001\u001d\u0003\u001d\u011d"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0121\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0129\b \u0001"+
		" \u0004 \u012c\b \u000b \f \u012d\u0001 \u0001 \u0001!\u0001!\u0001\""+
		"\u0001\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0004"+
		"\u0002\u0000\u000f\u000f##\u0002\u0000&&;;\u0002\u0000\u000e\u000e\u0010"+
		"\u0010\u0002\u0000EEGG\u014a\u0000G\u0001\u0000\u0000\u0000\u0002^\u0001"+
		"\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000"+
		"\u0000\bh\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fp\u0001"+
		"\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000"+
		"\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000\u0000\u0000"+
		"\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000"+
		"\u001a\u008d\u0001\u0000\u0000\u0000\u001c\u0090\u0001\u0000\u0000\u0000"+
		"\u001e\u00a4\u0001\u0000\u0000\u0000 \u00a8\u0001\u0000\u0000\u0000\""+
		"\u00ca\u0001\u0000\u0000\u0000$\u00d6\u0001\u0000\u0000\u0000&\u00da\u0001"+
		"\u0000\u0000\u0000(\u00e1\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000\u0000"+
		"\u0000,\u00e5\u0001\u0000\u0000\u0000.\u00eb\u0001\u0000\u0000\u00000"+
		"\u00ed\u0001\u0000\u0000\u00002\u00ef\u0001\u0000\u0000\u00004\u00f3\u0001"+
		"\u0000\u0000\u00006\u0100\u0001\u0000\u0000\u00008\u0106\u0001\u0000\u0000"+
		"\u0000:\u0109\u0001\u0000\u0000\u0000<\u0120\u0001\u0000\u0000\u0000>"+
		"\u0122\u0001\u0000\u0000\u0000@\u0126\u0001\u0000\u0000\u0000B\u0131\u0001"+
		"\u0000\u0000\u0000D\u0133\u0001\u0000\u0000\u0000FH\u0003\u0002\u0001"+
		"\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0001\u0001\u0000\u0000\u0000"+
		"K_\u00032\u0019\u0000L_\u0003 \u0010\u0000M_\u00030\u0018\u0000N_\u0003"+
		"6\u001b\u0000O_\u0003\u0004\u0002\u0000P_\u0003\u0014\n\u0000Q_\u0003"+
		"\u001a\r\u0000R_\u0003\u0016\u000b\u0000S_\u0003\u0006\u0003\u0000T_\u0003"+
		"\b\u0004\u0000U_\u0003\f\u0006\u0000V_\u0003\n\u0005\u0000W_\u0003\u0018"+
		"\f\u0000X_\u0003\u000e\u0007\u0000Y_\u0003\u0010\b\u0000Z_\u0003\u0012"+
		"\t\u0000[_\u0003\"\u0011\u0000\\_\u0003:\u001d\u0000]_\u0003,\u0016\u0000"+
		"^K\u0001\u0000\u0000\u0000^L\u0001\u0000\u0000\u0000^M\u0001\u0000\u0000"+
		"\u0000^N\u0001\u0000\u0000\u0000^O\u0001\u0000\u0000\u0000^P\u0001\u0000"+
		"\u0000\u0000^Q\u0001\u0000\u0000\u0000^R\u0001\u0000\u0000\u0000^S\u0001"+
		"\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000^U\u0001\u0000\u0000\u0000"+
		"^V\u0001\u0000\u0000\u0000^W\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000"+
		"\u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0003"+
		"\u0001\u0000\u0000\u0000`a\u0005\u0001\u0000\u0000ab\u0005\u000e\u0000"+
		"\u0000bc\u00034\u001a\u0000c\u0005\u0001\u0000\u0000\u0000de\u0005\u0003"+
		"\u0000\u0000ef\u0005\u000e\u0000\u0000fg\u00034\u001a\u0000g\u0007\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0004\u0000\u0000ij\u0005\u000e\u0000\u0000"+
		"jk\u00034\u001a\u0000k\t\u0001\u0000\u0000\u0000lm\u0005\u0005\u0000\u0000"+
		"mn\u0005\u000e\u0000\u0000no\u00034\u001a\u0000o\u000b\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0006\u0000\u0000qr\u0005\u000e\u0000\u0000rs\u00034\u001a"+
		"\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\u0007\u0000\u0000uv\u00057\u0000"+
		"\u0000vw\u00034\u001a\u0000w\u000f\u0001\u0000\u0000\u0000xy\u0005\b\u0000"+
		"\u0000yz\u0005\u000e\u0000\u0000z{\u00034\u001a\u0000{\u0011\u0001\u0000"+
		"\u0000\u0000|}\u0005\t\u0000\u0000}~\u0005\u000e\u0000\u0000~\u007f\u0003"+
		"4\u001a\u0000\u007f\u0013\u0001\u0000\u0000\u0000\u0080\u0081\u0005\n"+
		"\u0000\u0000\u0081\u0082\u0007\u0000\u0000\u0000\u0082\u0083\u00034\u001a"+
		"\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u000b\u0000"+
		"\u0000\u0085\u0087\u00057\u0000\u0000\u0086\u0088\u0005G\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0017\u0001\u0000\u0000\u0000\u0089\u008a\u0005\f\u0000\u0000\u008a\u008b"+
		"\u00057\u0000\u0000\u008b\u008c\u00034\u001a\u0000\u008c\u0019\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\r\u0000\u0000\u008e\u008f\u00034\u001a"+
		"\u0000\u008f\u001b\u0001\u0000\u0000\u0000\u0090\u00a1\u0007\u0001\u0000"+
		"\u0000\u0091\u0093\u0005<\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u00a2\u0003\u001e\u000f\u0000\u0095\u0097\u0005<\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u00a2\u0005,\u0000\u0000\u0099\u00a2"+
		"\u0005H\u0000\u0000\u009a\u009c\u0005<\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u00a2\u0007\u0002\u0000\u0000\u009e\u00a2\u0003B!\u0000"+
		"\u009f\u00a2\u0003D\"\u0000\u00a0\u00a2\u0005(\u0000\u0000\u00a1\u0092"+
		"\u0001\u0000\u0000\u0000\u00a1\u0096\u0001\u0000\u0000\u0000\u00a1\u0099"+
		"\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u001d\u0001\u0000\u0000\u0000\u00a3\u00a5"+
		"\u0005<\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0011\u0000\u0000\u00a7\u001f\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005"+
		"\u0012\u0000\u0000\u00a9\u00ab\u0005\u0013\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0003\u001c\u000e\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0005\u0014\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00c7\u00034\u001a\u0000\u00b5\u00b7\u0005\u0016"+
		"\u0000\u0000\u00b6\u00b8\u0005\u0013\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0003\u001c\u000e\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0005\u0014\u0000\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u00034\u001a\u0000\u00c2\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0015\u0000\u0000\u00c4\u00c6\u00034\u001a\u0000"+
		"\u00c5\u00b5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8!\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003$\u0012\u0000\u00cb\u00cd"+
		"\u0003(\u0014\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003"+
		"\u001c\u000e\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00d4\u0005"+
		"G\u0000\u0000\u00d2\u00d4\u0005E\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4#\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d7\u0005\u0018\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0007\u0002\u0000\u0000\u00d9%\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005\u000e\u0000\u0000\u00db\'\u0001\u0000\u0000\u0000\u00dc\u00e2"+
		"\u00038\u001c\u0000\u00dd\u00e2\u0003*\u0015\u0000\u00de\u00df\u00038"+
		"\u001c\u0000\u00df\u00e0\u0003*\u0015\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e2)\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\u001a\u0000\u0000\u00e4+\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0003&\u0013\u0000\u00e6\u00e7\u0005:\u0000\u0000\u00e7\u00e9\u0003"+
		".\u0017\u0000\u00e8\u00ea\u0007\u0003\u0000\u0000\u00e9\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea-\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005\'\u0000\u0000\u00ec/\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005\u001b\u0000\u0000\u00ee1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005\u001c\u0000\u0000\u00f0\u00f1\u0003>\u001f\u0000\u00f1\u00f2"+
		"\u0005\u001d\u0000\u0000\u00f23\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005"+
		"@\u0000\u0000\u00f4\u00f6\u0003\u0002\u0001\u0000\u00f5\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005A\u0000\u0000\u00fa5\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fd\u0005 \u0000\u0000\u00fc\u00fe\u0005\u001e\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u0001\u0000\u0000\u0000\u00ff\u0101\u00051\u0000\u0000\u0100\u00fb"+
		"\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\u001f\u0000\u0000\u0103\u0104\u0005\"\u0000\u0000\u0104\u0105\u0003"+
		"4\u001a\u0000\u01057\u0001\u0000\u0000\u0000\u0106\u0107\u0005!\u0000"+
		"\u0000\u01079\u0001\u0000\u0000\u0000\u0108\u010a\u0003\u001c\u000e\u0000"+
		"\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u0111\u0005$\u0000\u0000\u010e"+
		"\u0110\u0003\u001c\u000e\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u0118\u0005%\u0000\u0000\u0115\u0117"+
		"\u0003\u001c\u000e\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0005G\u0000\u0000\u011c\u011b\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d;\u0001\u0000"+
		"\u0000\u0000\u011e\u0121\u0005.\u0000\u0000\u011f\u0121\u0003@ \u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0121=\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0013\u0000\u0000\u0123"+
		"\u0124\u0007\u0002\u0000\u0000\u0124\u0125\u0005\u0014\u0000\u0000\u0125"+
		"?\u0001\u0000\u0000\u0000\u0126\u012b\u0005\u0013\u0000\u0000\u0127\u0129"+
		"\u0005\u0017\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c"+
		"\u0007\u0002\u0000\u0000\u012b\u0128\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0005\u0014\u0000\u0000\u0130A\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"7\u0000\u0000\u0132C\u0001\u0000\u0000\u0000\u0133\u0134\u00058\u0000"+
		"\u0000\u0134E\u0001\u0000\u0000\u0000 I^\u0087\u0092\u0096\u009b\u00a1"+
		"\u00a4\u00aa\u00af\u00b2\u00b7\u00bc\u00bf\u00c5\u00c7\u00cc\u00cf\u00d3"+
		"\u00d6\u00e1\u00e9\u00f7\u00fd\u0100\u010b\u0111\u0118\u011c\u0120\u0128"+
		"\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}