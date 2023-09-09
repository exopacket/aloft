// Generated from _Aloft.g4 by ANTLR 4.13.1
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
		CLASS_KEYWORD=1, COMPONENT_DECLARATION=2, COMPONENT_KEYWORD=3, ELEMENT_DECLARATION=4, 
		ELEMENT_KEYWORD=5, THEME_DECLARATION=6, THEME_KEYWORD=7, MODEL_DECLARATION=8, 
		MODEL_KEYWORD=9, PAGE_DECLARATION=10, PAGE_KEYWORD=11, ANIMATION_DECLARATION=12, 
		ANIMATION_KEYWORD=13, MODULE_DECLARATION=14, MODULE_KEYWORD=15, QUERY_DECLARATION=16, 
		QUERY_KEYWORD=17, SOURCE_DECLARATION=18, SOURCE_KEYWORD=19, CALLABLE_DECLARATION=20, 
		CALLABLE_KEYWORD=21, CONSTRUCTOR_DECLARATION=22, CONSTRUCTOR_KEYWORD=23, 
		ISSET_KEYWORD=24, IF_DECLARATION=25, LOOP_DECLARATION=26, SWITCH_BLOCK=27, 
		CURLY_BLOCK=28, SWITCH_CURLY_BLOCK=29, VARIABLE_DECLARATION=30, VARIABLE=31, 
		VARIABLE_OPTIONS=32, VAR_OPTIONS=33, FUNCTIONS=34, FUNCTION=35, FUNCTION_TYPES=36, 
		VAR_TYPES=37, TYPES=38, NAMED_WITH_PARAMS=39, NAMED_WITH_PARAMS_SPECIAL=40, 
		NAMED_WITH_PARAMS_VAR=41, CONDITIONAL=42, EXPRESSION=43, BRACES_ARRAY_BLOCK=44, 
		CURLY_OBJECT_BLOCK=45, PROPERTY=46, NAMED_PROPERTY=47, NAMED_PROPERTY_OBJECT=48, 
		PROPERTY_VALUES=49, NUMBERS=50, HTML_ELEMENT=51, NULL_VALUE=52, EMPTY_PARENTHESIS=53, 
		NAMED_PARENTHESIS=54, NAMED_PARENTHESIS_SPECIAL=55, NAMED_PARENTHESIS_FUNCTIONS=56, 
		NAMED_PARENTHESIS_SWITCH=57, NAMED_PARENTHESIS_VAR=58, NAMED_VAR=59, NAMED=60, 
		NAMED_DOT=61, NAMED_CLASS_ARRAY=62, NAMED_OBJECT=63, NAMED_OBJECT_ARRAY=64, 
		NAMED_ARRAY=65, GOTO_DECLARATION=66, GOTO_KEYWORD=67, PATH_STRING=68, 
		QUOTED_STRING=69, STATEMENT_END=70, SEPARATOR=71, COMMENT_BLOCK_DECLARATION=72, 
		WS=73;
	public static final int
		RULE_r = 0, RULE_syntax = 1, RULE_class_declaration = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "syntax", "class_declaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS_KEYWORD", "COMPONENT_DECLARATION", "COMPONENT_KEYWORD", 
			"ELEMENT_DECLARATION", "ELEMENT_KEYWORD", "THEME_DECLARATION", "THEME_KEYWORD", 
			"MODEL_DECLARATION", "MODEL_KEYWORD", "PAGE_DECLARATION", "PAGE_KEYWORD", 
			"ANIMATION_DECLARATION", "ANIMATION_KEYWORD", "MODULE_DECLARATION", "MODULE_KEYWORD", 
			"QUERY_DECLARATION", "QUERY_KEYWORD", "SOURCE_DECLARATION", "SOURCE_KEYWORD", 
			"CALLABLE_DECLARATION", "CALLABLE_KEYWORD", "CONSTRUCTOR_DECLARATION", 
			"CONSTRUCTOR_KEYWORD", "ISSET_KEYWORD", "IF_DECLARATION", "LOOP_DECLARATION", 
			"SWITCH_BLOCK", "CURLY_BLOCK", "SWITCH_CURLY_BLOCK", "VARIABLE_DECLARATION", 
			"VARIABLE", "VARIABLE_OPTIONS", "VAR_OPTIONS", "FUNCTIONS", "FUNCTION", 
			"FUNCTION_TYPES", "VAR_TYPES", "TYPES", "NAMED_WITH_PARAMS", "NAMED_WITH_PARAMS_SPECIAL", 
			"NAMED_WITH_PARAMS_VAR", "CONDITIONAL", "EXPRESSION", "BRACES_ARRAY_BLOCK", 
			"CURLY_OBJECT_BLOCK", "PROPERTY", "NAMED_PROPERTY", "NAMED_PROPERTY_OBJECT", 
			"PROPERTY_VALUES", "NUMBERS", "HTML_ELEMENT", "NULL_VALUE", "EMPTY_PARENTHESIS", 
			"NAMED_PARENTHESIS", "NAMED_PARENTHESIS_SPECIAL", "NAMED_PARENTHESIS_FUNCTIONS", 
			"NAMED_PARENTHESIS_SWITCH", "NAMED_PARENTHESIS_VAR", "NAMED_VAR", "NAMED", 
			"NAMED_DOT", "NAMED_CLASS_ARRAY", "NAMED_OBJECT", "NAMED_OBJECT_ARRAY", 
			"NAMED_ARRAY", "GOTO_DECLARATION", "GOTO_KEYWORD", "PATH_STRING", "QUOTED_STRING", 
			"STATEMENT_END", "SEPARATOR", "COMMENT_BLOCK_DECLARATION", "WS"
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
	public String getGrammarFileName() { return "_Aloft.g4"; }

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
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				syntax();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4416540595542L) != 0) || _la==COMMENT_BLOCK_DECLARATION );
			setState(11);
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
		public TerminalNode SWITCH_BLOCK() { return getToken(AloftParser.SWITCH_BLOCK, 0); }
		public TerminalNode IF_DECLARATION() { return getToken(AloftParser.IF_DECLARATION, 0); }
		public TerminalNode LOOP_DECLARATION() { return getToken(AloftParser.LOOP_DECLARATION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(AloftParser.FUNCTIONS, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public TerminalNode QUERY_DECLARATION() { return getToken(AloftParser.QUERY_DECLARATION, 0); }
		public TerminalNode CONSTRUCTOR_DECLARATION() { return getToken(AloftParser.CONSTRUCTOR_DECLARATION, 0); }
		public TerminalNode SOURCE_DECLARATION() { return getToken(AloftParser.SOURCE_DECLARATION, 0); }
		public TerminalNode COMPONENT_DECLARATION() { return getToken(AloftParser.COMPONENT_DECLARATION, 0); }
		public TerminalNode ELEMENT_DECLARATION() { return getToken(AloftParser.ELEMENT_DECLARATION, 0); }
		public TerminalNode MODEL_DECLARATION() { return getToken(AloftParser.MODEL_DECLARATION, 0); }
		public TerminalNode THEME_DECLARATION() { return getToken(AloftParser.THEME_DECLARATION, 0); }
		public TerminalNode CALLABLE_DECLARATION() { return getToken(AloftParser.CALLABLE_DECLARATION, 0); }
		public TerminalNode PAGE_DECLARATION() { return getToken(AloftParser.PAGE_DECLARATION, 0); }
		public TerminalNode ANIMATION_DECLARATION() { return getToken(AloftParser.ANIMATION_DECLARATION, 0); }
		public TerminalNode MODULE_DECLARATION() { return getToken(AloftParser.MODULE_DECLARATION, 0); }
		public TerminalNode VARIABLE_DECLARATION() { return getToken(AloftParser.VARIABLE_DECLARATION, 0); }
		public TerminalNode CONDITIONAL() { return getToken(AloftParser.CONDITIONAL, 0); }
		public TerminalNode COMMENT_BLOCK_DECLARATION() { return getToken(AloftParser.COMMENT_BLOCK_DECLARATION, 0); }
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SWITCH_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(SWITCH_BLOCK);
				}
				break;
			case IF_DECLARATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(IF_DECLARATION);
				}
				break;
			case LOOP_DECLARATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(LOOP_DECLARATION);
				}
				break;
			case FUNCTIONS:
				enterOuterAlt(_localctx, 4);
				{
				setState(16);
				match(FUNCTIONS);
				}
				break;
			case CLASS_KEYWORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(17);
				class_declaration();
				}
				break;
			case QUERY_DECLARATION:
				enterOuterAlt(_localctx, 6);
				{
				setState(18);
				match(QUERY_DECLARATION);
				}
				break;
			case CONSTRUCTOR_DECLARATION:
				enterOuterAlt(_localctx, 7);
				{
				setState(19);
				match(CONSTRUCTOR_DECLARATION);
				}
				break;
			case SOURCE_DECLARATION:
				enterOuterAlt(_localctx, 8);
				{
				setState(20);
				match(SOURCE_DECLARATION);
				}
				break;
			case COMPONENT_DECLARATION:
				enterOuterAlt(_localctx, 9);
				{
				setState(21);
				match(COMPONENT_DECLARATION);
				}
				break;
			case ELEMENT_DECLARATION:
				enterOuterAlt(_localctx, 10);
				{
				setState(22);
				match(ELEMENT_DECLARATION);
				}
				break;
			case MODEL_DECLARATION:
				enterOuterAlt(_localctx, 11);
				{
				setState(23);
				match(MODEL_DECLARATION);
				}
				break;
			case THEME_DECLARATION:
				enterOuterAlt(_localctx, 12);
				{
				setState(24);
				match(THEME_DECLARATION);
				}
				break;
			case CALLABLE_DECLARATION:
				enterOuterAlt(_localctx, 13);
				{
				setState(25);
				match(CALLABLE_DECLARATION);
				}
				break;
			case PAGE_DECLARATION:
				enterOuterAlt(_localctx, 14);
				{
				setState(26);
				match(PAGE_DECLARATION);
				}
				break;
			case ANIMATION_DECLARATION:
				enterOuterAlt(_localctx, 15);
				{
				setState(27);
				match(ANIMATION_DECLARATION);
				}
				break;
			case MODULE_DECLARATION:
				enterOuterAlt(_localctx, 16);
				{
				setState(28);
				match(MODULE_DECLARATION);
				}
				break;
			case VARIABLE_DECLARATION:
				enterOuterAlt(_localctx, 17);
				{
				setState(29);
				match(VARIABLE_DECLARATION);
				}
				break;
			case CONDITIONAL:
				enterOuterAlt(_localctx, 18);
				{
				setState(30);
				match(CONDITIONAL);
				}
				break;
			case COMMENT_BLOCK_DECLARATION:
				enterOuterAlt(_localctx, 19);
				{
				setState(31);
				match(COMMENT_BLOCK_DECLARATION);
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
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS_KEYWORD() { return getToken(AloftParser.CLASS_KEYWORD, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(CLASS_KEYWORD);
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
		"\u0004\u0001I%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000\t\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u00004\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004\""+
		"\u0001\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001"+
		"\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000"+
		"\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b"+
		"\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r!\u0005\u001b"+
		"\u0000\u0000\u000e!\u0005\u0019\u0000\u0000\u000f!\u0005\u001a\u0000\u0000"+
		"\u0010!\u0005\"\u0000\u0000\u0011!\u0003\u0004\u0002\u0000\u0012!\u0005"+
		"\u0010\u0000\u0000\u0013!\u0005\u0016\u0000\u0000\u0014!\u0005\u0012\u0000"+
		"\u0000\u0015!\u0005\u0002\u0000\u0000\u0016!\u0005\u0004\u0000\u0000\u0017"+
		"!\u0005\b\u0000\u0000\u0018!\u0005\u0006\u0000\u0000\u0019!\u0005\u0014"+
		"\u0000\u0000\u001a!\u0005\n\u0000\u0000\u001b!\u0005\f\u0000\u0000\u001c"+
		"!\u0005\u000e\u0000\u0000\u001d!\u0005\u001e\u0000\u0000\u001e!\u0005"+
		"*\u0000\u0000\u001f!\u0005H\u0000\u0000 \r\u0001\u0000\u0000\u0000 \u000e"+
		"\u0001\u0000\u0000\u0000 \u000f\u0001\u0000\u0000\u0000 \u0010\u0001\u0000"+
		"\u0000\u0000 \u0011\u0001\u0000\u0000\u0000 \u0012\u0001\u0000\u0000\u0000"+
		" \u0013\u0001\u0000\u0000\u0000 \u0014\u0001\u0000\u0000\u0000 \u0015"+
		"\u0001\u0000\u0000\u0000 \u0016\u0001\u0000\u0000\u0000 \u0017\u0001\u0000"+
		"\u0000\u0000 \u0018\u0001\u0000\u0000\u0000 \u0019\u0001\u0000\u0000\u0000"+
		" \u001a\u0001\u0000\u0000\u0000 \u001b\u0001\u0000\u0000\u0000 \u001c"+
		"\u0001\u0000\u0000\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0001\u0000\u0000#\u0005\u0001\u0000\u0000\u0000\u0002\t ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}