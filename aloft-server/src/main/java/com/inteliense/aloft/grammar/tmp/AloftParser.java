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
		CLASS_KEYWORD=1, COMPONENT_KEYWORD=2, ELEMENT_KEYWORD=3, THEME_KEYWORD=4, 
		MODEL_KEYWORD=5, PAGE_KEYWORD=6, ANIMATION_KEYWORD=7, MODULE_KEYWORD=8, 
		QUERY_KEYWORD=9, SOURCE_KEYWORD=10, CALLABLE_KEYWORD=11, CONSTRUCTOR_KEYWORD=12, 
		NAMED=13, NAMED_VAR=14, ISSET_KEYWORD=15, IF_KEYWORD=16, OPEN_PARENTHESES=17, 
		CLOSE_PARENTHESES=18, ELSE=19, ELSE_IF=20, COMMA=21, VAR_ACCESS=22, REQUIRED_FIELD=23, 
		VAR_MAGIC=24, LOOP_DECLARATION=25, SWITCH_KEYWORD=26, SWITCH_CURLY_BLOCK=27, 
		ARRAY_TYPE_SUFFIX=28, FUNCTION=29, FUNCTION_TYPES=30, TYPES=31, ENCLOSED_WITH_ARGS=32, 
		NAMED_WITH_PARAMS_SPECIAL=33, CONDITIONAL_IF=34, CONDITIONAL_ELSE=35, 
		OPERATORS=36, BRACES_ARRAY_BLOCK=37, CURLY_OBJECT_BLOCK=38, PROPERTY=39, 
		NAMED_PROPERTY=40, NAMED_PROPERTY_OBJECT=41, PROPERTY_VALUES=42, NUMBERS=43, 
		DECIMALS=44, DIGITS=45, HTML_ELEMENT=46, NULL_VALUE=47, EMPTY_PARENTHESIS=48, 
		NAMED_PARENTHESIS_SPECIAL=49, NAMED_PARENTHESIS_FUNCTIONS=50, NAMED_DOT=51, 
		NAMED_CLASS_ARRAY=52, NAMED_OBJECT=53, NAMED_OBJECT_ARRAY=54, NAMED_ARRAY=55, 
		GO_TO=56, GOTO_KEYWORD=57, PATH_STRING=58, QUOTED_STRING=59, EQUALS=60, 
		NOT=61, STATIC_ACCESS=62, APPEND_ADD=63, APPEND_SUBTRACT=64, PATH_START=65, 
		OPEN_BRACKETS=66, CLOSE_BRACKETS=67, END_OF_FILE=68, QUOTES=69, COMMENT_BLOCK_DECLARATION=70, 
		NEW_LINE=71, WS=72, STATEMENT_END=73;
	public static final int
		RULE_r = 0, RULE_syntax = 1, RULE_class = 2, RULE_component = 3, RULE_element = 4, 
		RULE_theme = 5, RULE_model = 6, RULE_page = 7, RULE_animation = 8, RULE_module = 9, 
		RULE_query = 10, RULE_source = 11, RULE_callable = 12, RULE_constructor = 13, 
		RULE_expression = 14, RULE_isset = 15, RULE_if = 16, RULE_declare_variable = 17, 
		RULE_variable = 18, RULE_variable_options = 19, RULE_var_options = 20, 
		RULE_loop = 21, RULE_switch_block = 22, RULE_curly_block = 23, RULE_functions = 24, 
		RULE_var_type = 25, RULE_condtional = 26, RULE_enclosed_var = 27, RULE_named_switch = 28, 
		RULE_enclosed_vars = 29, RULE_path = 30, RULE_string = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "syntax", "class", "component", "element", "theme", "model", "page", 
			"animation", "module", "query", "source", "callable", "constructor", 
			"expression", "isset", "if", "declare_variable", "variable", "variable_options", 
			"var_options", "loop", "switch_block", "curly_block", "functions", "var_type", 
			"condtional", "enclosed_var", "named_switch", "enclosed_vars", "path", 
			"string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'switch'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'='", "'!'", "'::'", "'++'", "'--'", "'^'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS_KEYWORD", "COMPONENT_KEYWORD", "ELEMENT_KEYWORD", "THEME_KEYWORD", 
			"MODEL_KEYWORD", "PAGE_KEYWORD", "ANIMATION_KEYWORD", "MODULE_KEYWORD", 
			"QUERY_KEYWORD", "SOURCE_KEYWORD", "CALLABLE_KEYWORD", "CONSTRUCTOR_KEYWORD", 
			"NAMED", "NAMED_VAR", "ISSET_KEYWORD", "IF_KEYWORD", "OPEN_PARENTHESES", 
			"CLOSE_PARENTHESES", "ELSE", "ELSE_IF", "COMMA", "VAR_ACCESS", "REQUIRED_FIELD", 
			"VAR_MAGIC", "LOOP_DECLARATION", "SWITCH_KEYWORD", "SWITCH_CURLY_BLOCK", 
			"ARRAY_TYPE_SUFFIX", "FUNCTION", "FUNCTION_TYPES", "TYPES", "ENCLOSED_WITH_ARGS", 
			"NAMED_WITH_PARAMS_SPECIAL", "CONDITIONAL_IF", "CONDITIONAL_ELSE", "OPERATORS", 
			"BRACES_ARRAY_BLOCK", "CURLY_OBJECT_BLOCK", "PROPERTY", "NAMED_PROPERTY", 
			"NAMED_PROPERTY_OBJECT", "PROPERTY_VALUES", "NUMBERS", "DECIMALS", "DIGITS", 
			"HTML_ELEMENT", "NULL_VALUE", "EMPTY_PARENTHESIS", "NAMED_PARENTHESIS_SPECIAL", 
			"NAMED_PARENTHESIS_FUNCTIONS", "NAMED_DOT", "NAMED_CLASS_ARRAY", "NAMED_OBJECT", 
			"NAMED_OBJECT_ARRAY", "NAMED_ARRAY", "GO_TO", "GOTO_KEYWORD", "PATH_STRING", 
			"QUOTED_STRING", "EQUALS", "NOT", "STATIC_ACCESS", "APPEND_ADD", "APPEND_SUBTRACT", 
			"PATH_START", "OPEN_BRACKETS", "CLOSE_BRACKETS", "END_OF_FILE", "QUOTES", 
			"COMMENT_BLOCK_DECLARATION", "NEW_LINE", "WS", "STATEMENT_END"
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
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				syntax();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1157425174669262846L) != 0) );
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
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SWITCH_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				switch_block();
				}
				break;
			case IF_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				if_();
				}
				break;
			case LOOP_DECLARATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				loop();
				}
				break;
			case FUNCTION:
			case FUNCTION_TYPES:
			case NAMED_CLASS_ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				functions();
				}
				break;
			case CLASS_KEYWORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				class_();
				}
				break;
			case QUERY_KEYWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				query();
				}
				break;
			case CONSTRUCTOR_KEYWORD:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				constructor();
				}
				break;
			case SOURCE_KEYWORD:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				source();
				}
				break;
			case COMPONENT_KEYWORD:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				component();
				}
				break;
			case ELEMENT_KEYWORD:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				element();
				}
				break;
			case MODEL_KEYWORD:
				enterOuterAlt(_localctx, 11);
				{
				setState(79);
				model();
				}
				break;
			case THEME_KEYWORD:
				enterOuterAlt(_localctx, 12);
				{
				setState(80);
				theme();
				}
				break;
			case CALLABLE_KEYWORD:
				enterOuterAlt(_localctx, 13);
				{
				setState(81);
				callable();
				}
				break;
			case PAGE_KEYWORD:
				enterOuterAlt(_localctx, 14);
				{
				setState(82);
				page();
				}
				break;
			case ANIMATION_KEYWORD:
				enterOuterAlt(_localctx, 15);
				{
				setState(83);
				animation();
				}
				break;
			case MODULE_KEYWORD:
				enterOuterAlt(_localctx, 16);
				{
				setState(84);
				module();
				}
				break;
			case NAMED:
			case NAMED_VAR:
			case VAR_ACCESS:
				enterOuterAlt(_localctx, 17);
				{
				setState(85);
				declare_variable();
				}
				break;
			case OPERATORS:
			case EQUALS:
				enterOuterAlt(_localctx, 18);
				{
				setState(86);
				condtional();
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
			setState(89);
			match(CLASS_KEYWORD);
			setState(90);
			match(NAMED);
			setState(91);
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
			setState(93);
			match(COMPONENT_KEYWORD);
			setState(94);
			match(NAMED);
			setState(95);
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
			setState(97);
			match(ELEMENT_KEYWORD);
			setState(98);
			match(NAMED);
			setState(99);
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
			setState(101);
			match(THEME_KEYWORD);
			setState(102);
			match(NAMED);
			setState(103);
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
			setState(105);
			match(MODEL_KEYWORD);
			setState(106);
			match(NAMED);
			setState(107);
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
			setState(109);
			match(PAGE_KEYWORD);
			setState(110);
			match(PATH_STRING);
			setState(111);
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
			setState(113);
			match(ANIMATION_KEYWORD);
			setState(114);
			match(NAMED);
			setState(115);
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
			setState(117);
			match(MODULE_KEYWORD);
			setState(118);
			match(NAMED);
			setState(119);
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
		public TerminalNode EMPTY_PARENTHESIS() { return getToken(AloftParser.EMPTY_PARENTHESIS, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
			setState(121);
			match(QUERY_KEYWORD);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMED) {
				{
				setState(122);
				match(NAMED);
				}
			}

			setState(125);
			_la = _input.LA(1);
			if ( !(_la==NAMED_WITH_PARAMS_SPECIAL || _la==EMPTY_PARENTHESIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			setState(128);
			match(SOURCE_KEYWORD);
			setState(129);
			match(PATH_STRING);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(130);
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
			setState(133);
			match(CALLABLE_KEYWORD);
			setState(134);
			match(PATH_STRING);
			setState(135);
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
			setState(137);
			match(CONSTRUCTOR_KEYWORD);
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
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==OPERATORS || _la==EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				{
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(141);
					match(NOT);
					}
					break;
				}
				setState(144);
				isset();
				}
				}
				break;
			case 2:
				{
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(145);
					match(NOT);
					}
				}

				setState(148);
				match(NULL_VALUE);
				}
				}
				break;
			case 3:
				{
				setState(149);
				match(BRACES_ARRAY_BLOCK);
				}
				break;
			case 4:
				{
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(150);
					match(NOT);
					}
				}

				{
				setState(153);
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
				setState(154);
				path();
				}
				break;
			case 6:
				{
				setState(155);
				string();
				}
				break;
			case 7:
				{
				setState(156);
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
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(159);
				match(NOT);
				}
			}

			setState(162);
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
			setState(164);
			match(IF_KEYWORD);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESES) {
				{
				setState(165);
				match(OPEN_PARENTHESES);
				}
			}

			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				expression();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPERATORS || _la==EQUALS );
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PARENTHESES) {
				{
				setState(173);
				match(CLOSE_PARENTHESES);
				}
			}

			setState(176);
			curly_block();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE_IF:
					{
					{
					setState(177);
					match(ELSE_IF);
					{
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESES) {
						{
						setState(178);
						match(OPEN_PARENTHESES);
						}
					}

					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(181);
						expression();
						}
						}
						setState(184); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==OPERATORS || _la==EQUALS );
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_PARENTHESES) {
						{
						setState(186);
						match(CLOSE_PARENTHESES);
						}
					}

					setState(189);
					curly_block();
					}
					}
					}
					break;
				case ELSE:
					{
					{
					setState(191);
					match(ELSE);
					setState(192);
					curly_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
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
			setState(198);
			variable();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_MAGIC || _la==TYPES) {
				{
				setState(199);
				variable_options();
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS || _la==EQUALS) {
				{
				setState(202);
				expression();
				}
			}

			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STATEMENT_END:
				{
				setState(205);
				match(STATEMENT_END);
				}
				break;
			case NEW_LINE:
				{
				{
				setState(206);
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
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_ACCESS) {
				{
				setState(209);
				match(VAR_ACCESS);
				}
			}

			{
			setState(212);
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
		enterRule(_localctx, 38, RULE_variable_options);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				var_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				var_options();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				var_type();
				setState(217);
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
		enterRule(_localctx, 40, RULE_var_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 42, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
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
		enterRule(_localctx, 44, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SWITCH_KEYWORD);
			setState(226);
			named_switch();
			setState(227);
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
		enterRule(_localctx, 46, RULE_curly_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			match(OPEN_BRACKETS);
			}
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				syntax();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1157425174669262846L) != 0) );
			{
			setState(235);
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
		enterRule(_localctx, 48, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_TYPES:
				{
				setState(237);
				match(FUNCTION_TYPES);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_TYPE_SUFFIX) {
					{
					setState(238);
					match(ARRAY_TYPE_SUFFIX);
					}
				}

				}
				break;
			case NAMED_CLASS_ARRAY:
				{
				setState(241);
				match(NAMED_CLASS_ARRAY);
				}
				break;
			case FUNCTION:
				break;
			default:
				break;
			}
			setState(244);
			match(FUNCTION);
			setState(245);
			match(ENCLOSED_WITH_ARGS);
			setState(246);
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
		enterRule(_localctx, 50, RULE_var_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 52, RULE_condtional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				expression();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPERATORS || _la==EQUALS );
			setState(255);
			match(CONDITIONAL_IF);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORS || _la==EQUALS) {
				{
				{
				setState(256);
				expression();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(CONDITIONAL_ELSE);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					expression();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(269);
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
		enterRule(_localctx, 54, RULE_enclosed_var);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED_PARENTHESIS_SPECIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(NAMED_PARENTHESIS_SPECIAL);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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
		enterRule(_localctx, 56, RULE_named_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OPEN_PARENTHESES);
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==NAMED_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(278);
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
		enterRule(_localctx, 58, RULE_enclosed_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(OPEN_PARENTHESES);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(281);
					match(COMMA);
					}
				}

				setState(284);
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
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2121728L) != 0) );
			setState(289);
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
		enterRule(_localctx, 60, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 62, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		"\u0004\u0001I\u0128\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0004\u0000B\b\u0000\u000b\u0000"+
		"\f\u0000C\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n|\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0084\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u008f\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0093"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0098\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e"+
		"\u0001\u000f\u0003\u000f\u00a1\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00a7\b\u0010\u0001\u0010\u0004\u0010\u00aa\b"+
		"\u0010\u000b\u0010\f\u0010\u00ab\u0001\u0010\u0003\u0010\u00af\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b4\b\u0010\u0001\u0010"+
		"\u0004\u0010\u00b7\b\u0010\u000b\u0010\f\u0010\u00b8\u0001\u0010\u0003"+
		"\u0010\u00bc\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00c2\b\u0010\n\u0010\f\u0010\u00c5\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00c9\b\u0011\u0001\u0011\u0003\u0011\u00cc\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00d0\b\u0011\u0001\u0012\u0003\u0012\u00d3"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00dc\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u00e8\b\u0017\u000b\u0017\f\u0017\u00e9"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00f0\b\u0018"+
		"\u0001\u0018\u0003\u0018\u00f3\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u00fc\b\u001a"+
		"\u000b\u001a\f\u001a\u00fd\u0001\u001a\u0001\u001a\u0005\u001a\u0102\b"+
		"\u001a\n\u001a\f\u001a\u0105\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0109\b\u001a\n\u001a\f\u001a\u010c\t\u001a\u0001\u001a\u0003\u001a\u010f"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0113\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u011b\b\u001d\u0001\u001d\u0004\u001d\u011e\b\u001d\u000b\u001d\f\u001d"+
		"\u011f\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0003"+
		"\u0002\u0000!!00\u0002\u0000$$<<\u0001\u0000\r\u000e\u013e\u0000A\u0001"+
		"\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000"+
		"\u0000\u0006]\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000\ne\u0001"+
		"\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000"+
		"\u0000\u0010q\u0001\u0000\u0000\u0000\u0012u\u0001\u0000\u0000\u0000\u0014"+
		"y\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u0085"+
		"\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000\u0000\u001c\u008c"+
		"\u0001\u0000\u0000\u0000\u001e\u00a0\u0001\u0000\u0000\u0000 \u00a4\u0001"+
		"\u0000\u0000\u0000\"\u00c6\u0001\u0000\u0000\u0000$\u00d2\u0001\u0000"+
		"\u0000\u0000&\u00db\u0001\u0000\u0000\u0000(\u00dd\u0001\u0000\u0000\u0000"+
		"*\u00df\u0001\u0000\u0000\u0000,\u00e1\u0001\u0000\u0000\u0000.\u00e5"+
		"\u0001\u0000\u0000\u00000\u00f2\u0001\u0000\u0000\u00002\u00f8\u0001\u0000"+
		"\u0000\u00004\u00fb\u0001\u0000\u0000\u00006\u0112\u0001\u0000\u0000\u0000"+
		"8\u0114\u0001\u0000\u0000\u0000:\u0118\u0001\u0000\u0000\u0000<\u0123"+
		"\u0001\u0000\u0000\u0000>\u0125\u0001\u0000\u0000\u0000@B\u0003\u0002"+
		"\u0001\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0001\u0001\u0000\u0000"+
		"\u0000EX\u0003,\u0016\u0000FX\u0003 \u0010\u0000GX\u0003*\u0015\u0000"+
		"HX\u00030\u0018\u0000IX\u0003\u0004\u0002\u0000JX\u0003\u0014\n\u0000"+
		"KX\u0003\u001a\r\u0000LX\u0003\u0016\u000b\u0000MX\u0003\u0006\u0003\u0000"+
		"NX\u0003\b\u0004\u0000OX\u0003\f\u0006\u0000PX\u0003\n\u0005\u0000QX\u0003"+
		"\u0018\f\u0000RX\u0003\u000e\u0007\u0000SX\u0003\u0010\b\u0000TX\u0003"+
		"\u0012\t\u0000UX\u0003\"\u0011\u0000VX\u00034\u001a\u0000WE\u0001\u0000"+
		"\u0000\u0000WF\u0001\u0000\u0000\u0000WG\u0001\u0000\u0000\u0000WH\u0001"+
		"\u0000\u0000\u0000WI\u0001\u0000\u0000\u0000WJ\u0001\u0000\u0000\u0000"+
		"WK\u0001\u0000\u0000\u0000WL\u0001\u0000\u0000\u0000WM\u0001\u0000\u0000"+
		"\u0000WN\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000"+
		"\u0000\u0000WQ\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001"+
		"\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X\u0003\u0001\u0000\u0000\u0000YZ\u0005\u0001"+
		"\u0000\u0000Z[\u0005\r\u0000\u0000[\\\u0003.\u0017\u0000\\\u0005\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0002\u0000\u0000^_\u0005\r\u0000\u0000_`\u0003"+
		".\u0017\u0000`\u0007\u0001\u0000\u0000\u0000ab\u0005\u0003\u0000\u0000"+
		"bc\u0005\r\u0000\u0000cd\u0003.\u0017\u0000d\t\u0001\u0000\u0000\u0000"+
		"ef\u0005\u0004\u0000\u0000fg\u0005\r\u0000\u0000gh\u0003.\u0017\u0000"+
		"h\u000b\u0001\u0000\u0000\u0000ij\u0005\u0005\u0000\u0000jk\u0005\r\u0000"+
		"\u0000kl\u0003.\u0017\u0000l\r\u0001\u0000\u0000\u0000mn\u0005\u0006\u0000"+
		"\u0000no\u0005:\u0000\u0000op\u0003.\u0017\u0000p\u000f\u0001\u0000\u0000"+
		"\u0000qr\u0005\u0007\u0000\u0000rs\u0005\r\u0000\u0000st\u0003.\u0017"+
		"\u0000t\u0011\u0001\u0000\u0000\u0000uv\u0005\b\u0000\u0000vw\u0005\r"+
		"\u0000\u0000wx\u0003.\u0017\u0000x\u0013\u0001\u0000\u0000\u0000y{\u0005"+
		"\t\u0000\u0000z|\u0005\r\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0007\u0000\u0000\u0000"+
		"~\u007f\u0003.\u0017\u0000\u007f\u0015\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\n\u0000\u0000\u0081\u0083\u0005:\u0000\u0000\u0082\u0084\u0005"+
		"I\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0017\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000b"+
		"\u0000\u0000\u0086\u0087\u0005:\u0000\u0000\u0087\u0088\u0003.\u0017\u0000"+
		"\u0088\u0019\u0001\u0000\u0000\u0000\u0089\u008a\u0005\f\u0000\u0000\u008a"+
		"\u008b\u0003.\u0017\u0000\u008b\u001b\u0001\u0000\u0000\u0000\u008c\u009d"+
		"\u0007\u0001\u0000\u0000\u008d\u008f\u0005=\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u009e\u0003\u001e\u000f\u0000\u0091\u0093\u0005"+
		"=\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u009e\u0005/\u0000"+
		"\u0000\u0095\u009e\u0005%\u0000\u0000\u0096\u0098\u0005=\u0000\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u009e\u0007\u0002\u0000\u0000\u009a"+
		"\u009e\u0003<\u001e\u0000\u009b\u009e\u0003>\u001f\u0000\u009c\u009e\u0005"+
		"+\u0000\u0000\u009d\u008e\u0001\u0000\u0000\u0000\u009d\u0092\u0001\u0000"+
		"\u0000\u0000\u009d\u0095\u0001\u0000\u0000\u0000\u009d\u0097\u0001\u0000"+
		"\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u001d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0005=\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u000f\u0000\u0000\u00a3\u001f\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0005\u0010\u0000\u0000\u00a5\u00a7\u0005\u0011\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u001c\u000e"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00af\u0005\u0012\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00c3\u0003.\u0017\u0000"+
		"\u00b1\u00b3\u0005\u0014\u0000\u0000\u00b2\u00b4\u0005\u0011\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\u001c\u000e\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u0012\u0000\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0003.\u0017\u0000\u00be"+
		"\u00c2\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0013\u0000\u0000\u00c0"+
		"\u00c2\u0003.\u0017\u0000\u00c1\u00b1\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4!\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003"+
		"$\u0012\u0000\u00c7\u00c9\u0003&\u0013\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cc\u0003\u001c\u000e\u0000\u00cb\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0005I\u0000\u0000\u00ce\u00d0\u0005G\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"#\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005\u0016\u0000\u0000\u00d2\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0007\u0002\u0000\u0000\u00d5%\u0001"+
		"\u0000\u0000\u0000\u00d6\u00dc\u00032\u0019\u0000\u00d7\u00dc\u0003(\u0014"+
		"\u0000\u00d8\u00d9\u00032\u0019\u0000\u00d9\u00da\u0003(\u0014\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d6\u0001\u0000\u0000\u0000\u00db"+
		"\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\'\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0018\u0000\u0000\u00de)"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0019\u0000\u0000\u00e0+\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\u001a\u0000\u0000\u00e2\u00e3\u0003"+
		"8\u001c\u0000\u00e3\u00e4\u0005\u001b\u0000\u0000\u00e4-\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e7\u0005B\u0000\u0000\u00e6\u00e8\u0003\u0002\u0001\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005C\u0000\u0000\u00ec"+
		"/\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005\u001e\u0000\u0000\u00ee\u00f0"+
		"\u0005\u001c\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00f3"+
		"\u00054\u0000\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005\u001d\u0000\u0000\u00f5\u00f6\u0005"+
		" \u0000\u0000\u00f6\u00f7\u0003.\u0017\u0000\u00f71\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005\u001f\u0000\u0000\u00f93\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0003\u001c\u000e\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0103\u0005\"\u0000\u0000\u0100\u0102\u0003\u001c\u000e\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u010a\u0005#\u0000\u0000\u0107\u0109\u0003\u001c\u000e\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010e"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0005I\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f5\u0001\u0000\u0000\u0000\u0110\u0113\u00051\u0000"+
		"\u0000\u0111\u0113\u0003:\u001d\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u01137\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005\u0011\u0000\u0000\u0115\u0116\u0007\u0002\u0000\u0000\u0116"+
		"\u0117\u0005\u0012\u0000\u0000\u01179\u0001\u0000\u0000\u0000\u0118\u011d"+
		"\u0005\u0011\u0000\u0000\u0119\u011b\u0005\u0015\u0000\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0001\u0000\u0000\u0000\u011c\u011e\u0007\u0002\u0000\u0000\u011d\u011a"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0012\u0000\u0000\u0122;\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005:\u0000\u0000\u0124=\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005;\u0000\u0000\u0126?\u0001\u0000\u0000\u0000 "+
		"CW{\u0083\u008e\u0092\u0097\u009d\u00a0\u00a6\u00ab\u00ae\u00b3\u00b8"+
		"\u00bb\u00c1\u00c3\u00c8\u00cb\u00cf\u00d2\u00db\u00e9\u00ef\u00f2\u00fd"+
		"\u0103\u010a\u010e\u0112\u011a\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}