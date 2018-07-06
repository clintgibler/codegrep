// Generated from ucb-logo/UCBLogo.g4 by ANTLR 4.7.1
package parsers.ucb-logo;

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UCBLogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TO=3, END=4, MACRO=5, WORD=6, SKIP_=7, OPEN_ARRAY=8, CLOSE_ARRAY=9, 
		OPEN_LIST=10, CLOSE_LIST=11, MINUS=12, PLUS=13, MULT=14, DIV=15, LT=16, 
		GT=17, EQ=18, LT_EQ=19, GT_EQ=20, NOT_EQ=21, QUOTED_WORD=22, NUMBER=23, 
		VARIABLE=24, NAME=25, ANY=26;
	public static final int
		RULE_parse = 0, RULE_instruction = 1, RULE_procedure_def = 2, RULE_macro_def = 3, 
		RULE_variables = 4, RULE_body_def = 5, RULE_body_instruction = 6, RULE_procedure_call_extra_input = 7, 
		RULE_procedure_call = 8, RULE_expressions = 9, RULE_expression = 10, RULE_array = 11, 
		RULE_list = 12;
	public static final String[] ruleNames = {
		"parse", "instruction", "procedure_def", "macro_def", "variables", "body_def", 
		"body_instruction", "procedure_call_extra_input", "procedure_call", "expressions", 
		"expression", "array", "list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, null, null, null, "'{'", "'}'", "'['", 
		"']'", "'-'", "'+'", "'*'", "'/'", "'<'", "'>'", "'='", "'<='", "'>='", 
		"'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "TO", "END", "MACRO", "WORD", "SKIP_", "OPEN_ARRAY", 
		"CLOSE_ARRAY", "OPEN_LIST", "CLOSE_LIST", "MINUS", "PLUS", "MULT", "DIV", 
		"LT", "GT", "EQ", "LT_EQ", "GT_EQ", "NOT_EQ", "QUOTED_WORD", "NUMBER", 
		"VARIABLE", "NAME", "ANY"
	};
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
	public String getGrammarFileName() { return "UCBLogo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	  // A Map keeping track of all procedure (and macro) names and the amount
	  // of parameters each procedure expects.
	  // Taken from: http://www.cs.berkeley.edu/~bh/usermanual
	  final Map<String, Integer> procedures = new HashMap<String, Integer>(){{
	    put("word", 2);
	    put("list", 2);
	    put("sentence", 2);
	    put("se", 2);
	    put("fput", 2);
	    put("lput", 2);
	    put("array", 1);
	    put("mdarray", 1);
	    put("listtoarray", 1);
	    put("arraytolist", 1);
	    put("combine", 2);
	    put("reverse", 1);
	    put("gensym", 0);
	    put("first", 1);
	    put("firsts", 1);
	    put("last", 1);
	    put("butfirst", 1);
	    put("bf", 1);
	    put("butfirsts", 1);
	    put("bfs", 1);
	    put("butlast", 1);
	    put("bl", 1);
	    put("item", 2);
	    put("mditem", 2);
	    put("pick", 1);
	    put("remove", 2);
	    put("remdup", 1);
	    put("quoted", 1);
	    put("setitem", 3);
	    put("mdsetitem", 3);
	    put(".setfirst", 2);
	    put(".setbf", 2);
	    put(".setitem", 3);
	    put("push", 2);
	    put("pop", 1);
	    put("queue", 2);
	    put("dequeue", 1);
	    put("wordp", 1);
	    put("word?", 1);
	    put("listp", 1);
	    put("list?", 1);
	    put("arrayp", 1);
	    put("array?", 1);
	    put("emptyp", 1);
	    put("empty?", 1);
	    put("equalp", 2);
	    put("equal?", 2);
	    put("notequalp", 2);
	    put("notequal?", 2);
	    put("beforep", 2);
	    put("before?", 2);
	    put(".eq", 2);
	    put("memberp", 2);
	    put("member?", 2);
	    put("substringp", 2);
	    put("substring?", 2);
	    put("numberp", 1);
	    put("number?", 1);
	    put("vbarredp", 1);
	    put("vbarred?", 1);
	    put("backslashedp", 1);
	    put("backslashed?", 1);
	    put("count", 1);
	    put("ascii", 1);
	    put("rawascii", 1);
	    put("char", 1);
	    put("member", 2);
	    put("lowercase", 1);
	    put("uppercase", 1);
	    put("standout", 1);
	    put("parse", 1);
	    put("runparse", 1);
	    put("print", 1);
	    put("pr", 1);
	    put("type", 1);
	    put("show", 1);
	    put("readlist", 0);
	    put("rl", 0);
	    put("readword", 0);
	    put("rw", 0);
	    put("readrawline", 0);
	    put("readchar", 0);
	    put("rc", 0);
	    put("readchars", 1);
	    put("rcs", 1);
	    put("shell", 1);
	    put("setprefix", 1);
	    put("prefix", 0);
	    put("openread", 1);
	    put("openwrite", 1);
	    put("openappend", 1);
	    put("openupdate", 1);
	    put("close", 1);
	    put("allopen", 0);
	    put("closeall", 0);
	    put("erasefile", 1);
	    put("erf", 1);
	    put("dribble", 1);
	    put("nodribble", 0);
	    put("setread", 1);
	    put("setwrite", 1);
	    put("reader", 0);
	    put("writer", 0);
	    put("setreadpos", 1);
	    put("setwritepos", 1);
	    put("readpos", 0);
	    put("writepos", 0);
	    put("eofp", 0);
	    put("eof?", 0);
	    put("filep", 1);
	    put("file?", 1);
	    put("keyp", 0);
	    put("key?", 0);
	    put("cleartext", 0);
	    put("ct", 0);
	    put("setcursor", 1);
	    put("cursor", 0);
	    put("setmargins", 1);
	    put("settextcolor", 2);
	    put("settc", 2);
	    put("increasefont", 0);
	    put("decreasefont", 0);
	    put("settextsize", 1);
	    put("textsize", 0);
	    put("setfont", 1);
	    put("font", 0);
	    put("sum", 2);
	    put("difference", 2);
	    put("minus", 1);
	    put("product", 2);
	    put("quotient", 2);
	    put("remainder", 2);
	    put("modulo", 2);
	    put("int", 1);
	    put("round", 1);
	    put("sqrt", 1);
	    put("power", 2);
	    put("exp", 1);
	    put("log10", 1);
	    put("ln", 1);
	    put("sin", 1);
	    put("radsin", 1);
	    put("cos", 1);
	    put("radcos", 1);
	    put("arctan", 1);
	    put("radarctan", 1);
	    put("iseq", 2);
	    put("rseq", 3);
	    put("lessp", 2);
	    put("less?", 2);
	    put("greaterp", 2);
	    put("greater?", 2);
	    put("lessequalp", 2);
	    put("lessequal?", 2);
	    put("greaterequalp", 2);
	    put("greaterequal?", 2);
	    put("random", 1);
	    put("rerandom", 0);
	    put("form", 3);
	    put("bitand", 2);
	    put("bitor", 2);
	    put("bitxor", 2);
	    put("bitnot", 1);
	    put("ashift", 2);
	    put("lshift", 2);
	    put("and", 2);
	    put("or", 2);
	    put("not", 1);
	    put("forward", 1);
	    put("fd", 1);
	    put("back", 1);
	    put("bk", 1);
	    put("left", 1);
	    put("lt", 1);
	    put("right", 1);
	    put("rt", 1);
	    put("setpos", 1);
	    put("setxy", 2);
	    put("setx", 1);
	    put("sety", 1);
	    put("setheading", 1);
	    put("seth", 1);
	    put("home", 0);
	    put("arc", 2);
	    put("pos", 0);
	    put("xcor", 0);
	    put("ycor", 0);
	    put("heading", 0);
	    put("towards", 1);
	    put("scrunch", 0);
	    put("showturtle", 0);
	    put("st", 0);
	    put("hideturtle", 0);
	    put("ht", 0);
	    put("clean", 0);
	    put("clearscreen", 0);
	    put("cs", 0);
	    put("wrap", 0);
	    put("window", 0);
	    put("fence", 0);
	    put("fill", 0);
	    put("filled", 2);
	    put("label", 1);
	    put("setlabelheight", 1);
	    put("textscreen", 0);
	    put("ts", 0);
	    put("fullscreen", 0);
	    put("fs", 0);
	    put("splitscreen", 0);
	    put("ss", 0);
	    put("setscrunch", 2);
	    put("refresh", 0);
	    put("norefresh", 0);
	    put("shownp", 0);
	    put("shown?", 0);
	    put("screenmode", 0);
	    put("turtlemode", 0);
	    put("labelsize", 0);
	    put("pendown", 0);
	    put("pd", 0);
	    put("penup", 0);
	    put("pu", 0);
	    put("penpaint", 0);
	    put("ppt", 0);
	    put("penerase", 0);
	    put("pe", 0);
	    put("penreverse", 0);
	    put("px", 0);
	    put("setpencolor", 1);
	    put("setpc", 1);
	    put("setpalette", 2);
	    put("setpensize", 1);
	    put("setpenpattern", 1);
	    put("setpen", 1);
	    put("setbackground", 1);
	    put("setbg", 1);
	    put("pendownp", 0);
	    put("pendown?", 0);
	    put("penmode", 0);
	    put("pencolor", 0);
	    put("pc", 0);
	    put("palette", 1);
	    put("pensize", 0);
	    put("penpattern", 0);
	    put("pen", 0);
	    put("background", 0);
	    put("bg", 0);
	    put("savepict", 1);
	    put("loadpict", 1);
	    put("epspict", 1);
	    put("mousepos", 0);
	    put("clickpos", 0);
	    put("buttonp", 0);
	    put("button?", 0);
	    put("button", 0);
	    put("define", 2);
	    put("text", 1);
	    put("fulltext", 1);
	    put("copydef", 2);
	    put("make", 2);
	    put("name", 2);
	    put("local", 1);
	    put("localmake", 2);
	    put("thing", 1);
	    put(":quoted.varname", 0);
	    put("global", 1);
	    put("pprop", 3);
	    put("gprop", 2);
	    put("remprop", 2);
	    put("plist", 1);
	    put("procedurep", 1);
	    put("procedure?", 1);
	    put("primitivep", 1);
	    put("primitive?", 1);
	    put("definedp", 1);
	    put("defined?", 1);
	    put("namep", 1);
	    put("name?", 1);
	    put("plistp", 1);
	    put("plist?", 1);
	    put("contents", 0);
	    put("buried", 0);
	    put("traced", 0);
	    put("stepped", 0);
	    put("procedures", 0);
	    put("primitives", 0);
	    put("names", 0);
	    put("plists", 0);
	    put("namelist", 1);
	    put("pllist", 1);
	    put("arity", 1);
	    put("nodes", 0);
	    put("printout", 1);
	    put("po", 1);
	    put("poall", 0);
	    put("pops", 0);
	    put("pons", 0);
	    put("popls", 0);
	    put("pon", 1);
	    put("popl", 1);
	    put("pot", 1);
	    put("pots", 0);
	    put("erase", 1);
	    put("er", 1);
	    put("erall", 0);
	    put("erps", 0);
	    put("erns", 0);
	    put("erpls", 0);
	    put("ern", 1);
	    put("erpl", 1);
	    put("bury", 1);
	    put("buryall", 0);
	    put("buryname", 1);
	    put("unbury", 1);
	    put("unburyall", 0);
	    put("unburyname", 1);
	    put("buriedp", 1);
	    put("buried?", 1);
	    put("trace", 1);
	    put("untrace", 1);
	    put("tracedp", 1);
	    put("traced?", 1);
	    put("step", 1);
	    put("unstep", 1);
	    put("steppedp", 1);
	    put("stepped?", 1);
	    put("edit", 1);
	    put("ed", 1);
	    put("editfile", 1);
	    put("edall", 0);
	    put("edps", 0);
	    put("edns", 0);
	    put("edpls", 0);
	    put("edn", 1);
	    put("edpl", 1);
	    put("save", 1);
	    put("savel", 2);
	    put("load", 1);
	    put("cslsload", 1);
	    put("help", 1);
	    put("seteditor", 1);
	    put("setlibloc", 1);
	    put("sethelploc", 1);
	    put("setcslsloc", 1);
	    put("settemploc", 1);
	    put("gc", 0);
	    put(".setsegmentsize", 1);
	    put("run", 1);
	    put("runresult", 1);
	    put("repeat", 2);
	    put("forever", 1);
	    put("repcount", 0);
	    put("if", 2);
	    put("ifelse", 3);
	    put("test", 1);
	    put("iftrue", 1);
	    put("ift", 1);
	    put("iffalse", 1);
	    put("iff", 1);
	    put("stop", 0);
	    put("output", 1);
	    put("op", 1);
	    put("catch", 2);
	    put("throw", 1);
	    put("error", 0);
	    put("pause", 0);
	    put("continue", 1);
	    put("co", 1);
	    put("wait", 1);
	    put("bye", 0);
	    put(".maybeoutput", 1);
	    put("goto", 1);
	    put("tag", 1);
	    put("ignore", 1);
	    put("`", 1);
	    put("for", 2);
	    put("do.while", 2);
	    put("while", 2);
	    put("do.until", 2);
	    put("until", 2);
	    put("case", 2);
	    put("cond", 1);
	    put("apply", 2);
	    put("invoke", 2);
	    put("foreach", 2);
	    put("map", 2);
	    put("map.se", 2);
	    put("filter", 2);
	    put("find", 2);
	    put("reduce", 2);
	    put("crossmap", 2);
	    put("cascade", 3);
	    put("cascade.2", 5);
	    put("transfer", 3);
	    put(".defmacro", 2);
	    put("macrop", 1);
	    put("macro?", 1);
	    put("macroexpand", 1);
	  }};

	  // A flag keeping track if the parser already looked ahead to resolve user
	  // defined procedures that will be stored in the 'procedures' map.
	  private boolean discoveredAllProcedures = false;

	  /**
	   * Creates a new instance of a {@code UCBLogoParser} where
	   * any user defined procedures will be resolved in an intial
	   * parse.
	   *
	   * @param source
	   *         the UCB Logo source to parse.
	   */
	  public UCBLogoParser(String source) {
	    this(new ANTLRInputStream(source));
	  }

	  /**
	   * Creates a new instance of a {@code UCBLogoParser} where
	   * any user defined procedures will be resolved in an initial
	   * parse.
	   *
	   * @param input
	   *         the inout stream containing the UCB Logo source
	   *         to parse.
	   */
	  public UCBLogoParser(ANTLRInputStream input) {

	    this(new CommonTokenStream(new UCBLogoLexer(input)));

	    // Create a lexer and parser that will resolve user defined procedures.
	    UCBLogoLexer lexer = new UCBLogoLexer(input);
	    UCBLogoParser parser = new UCBLogoParser(new CommonTokenStream(lexer));

	    ParseTreeWalker.DEFAULT.walk(new UCBLogoBaseListener(){

	      @Override
	      public void enterProcedure_def(@NotNull UCBLogoParser.Procedure_defContext ctx) {
	        // Yes, we found a procedure: save it in the procedures-map.
	        procedures.put(ctx.NAME().getText(), ctx.variables.amount);
	      }

	      @Override
	      public void enterMacro_def(@NotNull UCBLogoParser.Macro_defContext ctx) {
	        // Yes, we found a macro: save it in the procedures-map.
	        procedures.put(ctx.NAME().getText(), ctx.variables.amount);
	      }
	    }, parser.parse());

	    // Reset the input stream after having resolved the user defined procedures.
	    input.reset();

	    this.discoveredAllProcedures = true;
	  }

	  /**
	   * Returns the amount of parameters the procedure expects. Note
	   * that this method will only be called after {@link #procedureNameAhead()}
	   * already returned {@code true}.
	   *
	   * @param procedureName
	   *         the name of the procedure.
	   *
	   * @return the amount of parameters the procedure expects.
	   */
	  private int amountParams(String procedureName) {
	    return procedures.get(procedureName.toLowerCase());
	  }

	  /**
	   * Returns {@code true} iff the next token in the stream is of type
	   * {@code NAME} and contains the text defined in {@code name}.
	   *
	   * @param name
	   *         the text the next token should contain.
	   *
	   * @returns {@code true} iff the next token in the stream is of type
	   * {@code NAME} and contains the text defined in {@code name}.
	   */
	  private boolean nameAhead(String name) {
	    Token token = _input.LT(1);
	    return token.getType() == NAME && token.getText().equalsIgnoreCase(name);
	  }

	  /**
	   * Returns {@code true} iff the next token in the inout stream is of
	   * type {@code NAME} and is present in the {@code procedures}.
	   *
	   * @returns {@code true} iff the next token in the inout stream is of
	   * type {@code NAME} and is present in the {@code procedures}.
	   */
	  private boolean procedureNameAhead() {
	    Token token = _input.LT(1);
	    return token.getType() == NAME && procedures.containsKey(token.getText().toLowerCase());
	  }

	public UCBLogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UCBLogoParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					instruction();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(32);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcedureCallInstructionContext extends InstructionContext {
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public ProcedureCallInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedureCallInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedureCallInstruction(this);
		}
	}
	public static class MacroDefInstructionContext extends InstructionContext {
		public Macro_defContext macro_def() {
			return getRuleContext(Macro_defContext.class,0);
		}
		public MacroDefInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterMacroDefInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitMacroDefInstruction(this);
		}
	}
	public static class ProcedureDefInstructionContext extends InstructionContext {
		public Procedure_defContext procedure_def() {
			return getRuleContext(Procedure_defContext.class,0);
		}
		public ProcedureDefInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedureDefInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedureDefInstruction(this);
		}
	}
	public static class ProcedureCallExtraInputInstructionContext extends InstructionContext {
		public Procedure_call_extra_inputContext procedure_call_extra_input() {
			return getRuleContext(Procedure_call_extra_inputContext.class,0);
		}
		public ProcedureCallExtraInputInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedureCallExtraInputInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedureCallExtraInputInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ProcedureDefInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				procedure_def();
				}
				break;
			case 2:
				_localctx = new MacroDefInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				macro_def();
				}
				break;
			case 3:
				_localctx = new ProcedureCallExtraInputInstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				procedure_call_extra_input();
				}
				break;
			case 4:
				_localctx = new ProcedureCallInstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				procedure_call();
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

	public static class Procedure_defContext extends ParserRuleContext {
		public Token NAME;
		public VariablesContext variables;
		public TerminalNode TO() { return getToken(UCBLogoParser.TO, 0); }
		public TerminalNode NAME() { return getToken(UCBLogoParser.NAME, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public Body_defContext body_def() {
			return getRuleContext(Body_defContext.class,0);
		}
		public Procedure_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedure_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedure_def(this);
		}
	}

	public final Procedure_defContext procedure_def() throws RecognitionException {
		Procedure_defContext _localctx = new Procedure_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedure_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(TO);
			setState(41);
			((Procedure_defContext)_localctx).NAME = match(NAME);
			setState(42);
			((Procedure_defContext)_localctx).variables = variables();
			setState(43);
			body_def();

			     procedures.put(((Procedure_defContext)_localctx).NAME.getText(), ((Procedure_defContext)_localctx).variables.amount);
			   
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

	public static class Macro_defContext extends ParserRuleContext {
		public Token NAME;
		public VariablesContext variables;
		public TerminalNode MACRO() { return getToken(UCBLogoParser.MACRO, 0); }
		public TerminalNode NAME() { return getToken(UCBLogoParser.NAME, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public Body_defContext body_def() {
			return getRuleContext(Body_defContext.class,0);
		}
		public Macro_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterMacro_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitMacro_def(this);
		}
	}

	public final Macro_defContext macro_def() throws RecognitionException {
		Macro_defContext _localctx = new Macro_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_macro_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(MACRO);
			setState(47);
			((Macro_defContext)_localctx).NAME = match(NAME);
			setState(48);
			((Macro_defContext)_localctx).variables = variables();
			setState(49);
			body_def();

			     procedures.put(((Macro_defContext)_localctx).NAME.getText(), ((Macro_defContext)_localctx).variables.amount);
			   
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

	public static class VariablesContext extends ParserRuleContext {
		public int amount;
		public List<TerminalNode> VARIABLE() { return getTokens(UCBLogoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(UCBLogoParser.VARIABLE, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((VariablesContext)_localctx).amount =  0;
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					match(VARIABLE);
					_localctx.amount++;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Body_defContext extends ParserRuleContext {
		public List<TerminalNode> END() { return getTokens(UCBLogoParser.END); }
		public TerminalNode END(int i) {
			return getToken(UCBLogoParser.END, i);
		}
		public List<Body_instructionContext> body_instruction() {
			return getRuleContexts(Body_instructionContext.class);
		}
		public Body_instructionContext body_instruction(int i) {
			return getRuleContext(Body_instructionContext.class,i);
		}
		public Body_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterBody_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitBody_def(this);
		}
	}

	public final Body_defContext body_def() throws RecognitionException {
		Body_defContext _localctx = new Body_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body_def);
		int _la;
		try {
			int _alt;
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				if (!(discoveredAllProcedures)) throw new FailedPredicateException(this, "discoveredAllProcedures");
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(61);
						body_instruction();
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(67);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TO) | (1L << MACRO) | (1L << WORD) | (1L << SKIP_) | (1L << OPEN_ARRAY) | (1L << CLOSE_ARRAY) | (1L << OPEN_LIST) | (1L << CLOSE_LIST) | (1L << MINUS) | (1L << PLUS) | (1L << MULT) | (1L << DIV) | (1L << LT) | (1L << GT) | (1L << EQ) | (1L << LT_EQ) | (1L << GT_EQ) | (1L << NOT_EQ) | (1L << QUOTED_WORD) | (1L << NUMBER) | (1L << VARIABLE) | (1L << NAME) | (1L << ANY))) != 0)) {
					{
					{
					setState(68);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==END) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(END);
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

	public static class Body_instructionContext extends ParserRuleContext {
		public Procedure_call_extra_inputContext procedure_call_extra_input() {
			return getRuleContext(Procedure_call_extra_inputContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public Body_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterBody_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitBody_instruction(this);
		}
	}

	public final Body_instructionContext body_instruction() throws RecognitionException {
		Body_instructionContext _localctx = new Body_instructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body_instruction);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				procedure_call_extra_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				procedure_call();
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

	public static class Procedure_call_extra_inputContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(UCBLogoParser.NAME, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Procedure_call_extra_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call_extra_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedure_call_extra_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedure_call_extra_input(this);
		}
	}

	public final Procedure_call_extra_inputContext procedure_call_extra_input() throws RecognitionException {
		Procedure_call_extra_inputContext _localctx = new Procedure_call_extra_inputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedure_call_extra_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			if (!(procedureNameAhead())) throw new FailedPredicateException(this, "procedureNameAhead()");
			setState(83);
			match(NAME);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					expression(0);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(90);
			match(T__1);
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

	public static class Procedure_callContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(UCBLogoParser.NAME, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedure_call(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procedure_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			if (!(procedureNameAhead())) throw new FailedPredicateException(this, "procedureNameAhead()");
			setState(93);
			((Procedure_callContext)_localctx).NAME = match(NAME);
			setState(94);
			expressions(((Procedure_callContext)_localctx).NAME.getText(), amountParams(((Procedure_callContext)_localctx).NAME.getText()));
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

	public static class ExpressionsContext extends ParserRuleContext {
		public String name;
		public int total;
		public int n = 0;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionsContext(ParserRuleContext parent, int invokingState, String name, int total) {
			super(parent, invokingState);
			this.name = name;
			this.total = total;
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions(String name,int total) throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState(), name, total);
		enterRule(_localctx, 18, RULE_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					if (!(_localctx.n < _localctx.total)) throw new FailedPredicateException(this, "$n < $total");
					setState(97);
					expression(0);
					_localctx.n++;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}

			     // Make sure there are enough inputs parsed for 'name'.
			     if (_localctx.total > _localctx.n) {
			       throw new RuntimeException("not enough inputs to " + name);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualsExpressionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterNotEqualsExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitNotEqualsExpressionExpression(this);
		}
	}
	public static class ArrayExpressionContext extends ExpressionContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitArrayExpression(this);
		}
	}
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitAdditionExpression(this);
		}
	}
	public static class WordExpressionContext extends ExpressionContext {
		public TerminalNode WORD() { return getToken(UCBLogoParser.WORD, 0); }
		public WordExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterWordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitWordExpression(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(UCBLogoParser.NUMBER, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitNumberExpression(this);
		}
	}
	public static class ParensExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterParensExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitParensExpression(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitMultiplyExpression(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitGreaterThanExpression(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(UCBLogoParser.VARIABLE, 0); }
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitVariableExpression(this);
		}
	}
	public static class DivideExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitDivideExpression(this);
		}
	}
	public static class LessThanEqualsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterLessThanEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitLessThanEqualsExpression(this);
		}
	}
	public static class GreaterThanEqualsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterGreaterThanEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitGreaterThanEqualsExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class QuotedWordExpressionContext extends ExpressionContext {
		public TerminalNode QUOTED_WORD() { return getToken(UCBLogoParser.QUOTED_WORD, 0); }
		public QuotedWordExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterQuotedWordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitQuotedWordExpression(this);
		}
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitEqualsExpression(this);
		}
	}
	public static class SubtractionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubtractionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterSubtractionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitSubtractionExpression(this);
		}
	}
	public static class ProcedureCallExpressionContext extends ExpressionContext {
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public ProcedureCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedureCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedureCallExpression(this);
		}
	}
	public static class LessThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitLessThanExpression(this);
		}
	}
	public static class ProcedureCallExtraInputContext extends ExpressionContext {
		public Procedure_call_extra_inputContext procedure_call_extra_input() {
			return getRuleContext(Procedure_call_extra_inputContext.class,0);
		}
		public ProcedureCallExtraInputContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterProcedureCallExtraInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitProcedureCallExtraInput(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitListExpression(this);
		}
	}
	public static class NameExpressionContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(UCBLogoParser.NAME, 0); }
		public NameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitNameExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				match(MINUS);
				setState(109);
				expression(21);
				}
				break;
			case 2:
				{
				_localctx = new ProcedureCallExtraInputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				procedure_call_extra_input();
				}
				break;
			case 3:
				{
				_localctx = new ProcedureCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				procedure_call();
				}
				break;
			case 4:
				{
				_localctx = new ParensExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(T__0);
				setState(113);
				expression(0);
				setState(114);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				array();
				}
				break;
			case 6:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				list();
				}
				break;
			case 7:
				{
				_localctx = new WordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(WORD);
				}
				break;
			case 8:
				{
				_localctx = new QuotedWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(QUOTED_WORD);
				}
				break;
			case 9:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(NUMBER);
				}
				break;
			case 10:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(VARIABLE);
				}
				break;
			case 11:
				{
				_localctx = new NameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(NAME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(126);
						match(MULT);
						setState(127);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(129);
						match(DIV);
						setState(130);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(132);
						match(PLUS);
						setState(133);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(135);
						match(MINUS);
						setState(136);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						match(LT);
						setState(139);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(141);
						match(GT);
						setState(142);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new LessThanEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
						match(LT_EQ);
						setState(145);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(147);
						match(GT_EQ);
						setState(148);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(150);
						match(EQ);
						setState(151);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new NotEqualsExpressionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(153);
						match(NOT_EQ);
						setState(154);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(OPEN_ARRAY);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TO) | (1L << END) | (1L << MACRO) | (1L << WORD) | (1L << SKIP_) | (1L << OPEN_ARRAY) | (1L << OPEN_LIST) | (1L << CLOSE_LIST) | (1L << MINUS) | (1L << PLUS) | (1L << MULT) | (1L << DIV) | (1L << LT) | (1L << GT) | (1L << EQ) | (1L << LT_EQ) | (1L << GT_EQ) | (1L << NOT_EQ) | (1L << QUOTED_WORD) | (1L << NUMBER) | (1L << VARIABLE) | (1L << NAME) | (1L << ANY))) != 0)) {
				{
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case TO:
				case END:
				case MACRO:
				case WORD:
				case SKIP_:
				case OPEN_LIST:
				case CLOSE_LIST:
				case MINUS:
				case PLUS:
				case MULT:
				case DIV:
				case LT:
				case GT:
				case EQ:
				case LT_EQ:
				case GT_EQ:
				case NOT_EQ:
				case QUOTED_WORD:
				case NUMBER:
				case VARIABLE:
				case NAME:
				case ANY:
					{
					setState(161);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==OPEN_ARRAY || _la==CLOSE_ARRAY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case OPEN_ARRAY:
					{
					setState(162);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(CLOSE_ARRAY);
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

	public static class ListContext extends ParserRuleContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UCBLogoListener ) ((UCBLogoListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(OPEN_LIST);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TO) | (1L << END) | (1L << MACRO) | (1L << WORD) | (1L << SKIP_) | (1L << OPEN_ARRAY) | (1L << CLOSE_ARRAY) | (1L << OPEN_LIST) | (1L << MINUS) | (1L << PLUS) | (1L << MULT) | (1L << DIV) | (1L << LT) | (1L << GT) | (1L << EQ) | (1L << LT_EQ) | (1L << GT_EQ) | (1L << NOT_EQ) | (1L << QUOTED_WORD) | (1L << NUMBER) | (1L << VARIABLE) | (1L << NAME) | (1L << ANY))) != 0)) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case TO:
				case END:
				case MACRO:
				case WORD:
				case SKIP_:
				case OPEN_ARRAY:
				case CLOSE_ARRAY:
				case MINUS:
				case PLUS:
				case MULT:
				case DIV:
				case LT:
				case GT:
				case EQ:
				case LT_EQ:
				case GT_EQ:
				case NOT_EQ:
				case QUOTED_WORD:
				case NUMBER:
				case VARIABLE:
				case NAME:
				case ANY:
					{
					setState(171);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==OPEN_LIST || _la==CLOSE_LIST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case OPEN_LIST:
					{
					setState(172);
					list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(CLOSE_LIST);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return body_def_sempred((Body_defContext)_localctx, predIndex);
		case 7:
			return procedure_call_extra_input_sempred((Procedure_call_extra_inputContext)_localctx, predIndex);
		case 8:
			return procedure_call_sempred((Procedure_callContext)_localctx, predIndex);
		case 9:
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean body_def_sempred(Body_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return discoveredAllProcedures;
		}
		return true;
	}
	private boolean procedure_call_extra_input_sempred(Procedure_call_extra_inputContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return procedureNameAhead();
		}
		return true;
	}
	private boolean procedure_call_sempred(Procedure_callContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return procedureNameAhead();
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return _localctx.n < _localctx.total;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\7\7A\n\7\f\7\16\7D\13"+
		"\7\3\7\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\5\7N\n\7\3\b\3\b\5\bR\n\b\3\t\3"+
		"\t\3\t\3\t\7\tX\n\t\f\t\16\t[\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r"+
		"\3\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\3\r\3\r\3\16\3\16\3\16\7\16"+
		"\u00b0\n\16\f\16\16\16\u00b3\13\16\3\16\3\16\3\16\2\3\26\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\5\3\2\6\6\3\2\n\13\3\2\f\r\2\u00cc\2\37\3\2"+
		"\2\2\4(\3\2\2\2\6*\3\2\2\2\b\60\3\2\2\2\n\66\3\2\2\2\fM\3\2\2\2\16Q\3"+
		"\2\2\2\20S\3\2\2\2\22^\3\2\2\2\24h\3\2\2\2\26}\3\2\2\2\30\u00a2\3\2\2"+
		"\2\32\u00ac\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2"+
		"\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$)\5\6\4"+
		"\2%)\5\b\5\2&)\5\20\t\2\')\5\22\n\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3"+
		"\2\2\2)\5\3\2\2\2*+\7\5\2\2+,\7\33\2\2,-\5\n\6\2-.\5\f\7\2./\b\4\1\2/"+
		"\7\3\2\2\2\60\61\7\7\2\2\61\62\7\33\2\2\62\63\5\n\6\2\63\64\5\f\7\2\64"+
		"\65\b\5\1\2\65\t\3\2\2\2\66;\b\6\1\2\678\7\32\2\28:\b\6\1\29\67\3\2\2"+
		"\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2=;\3\2\2\2>B\6\7\2\2?A\5\16"+
		"\b\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EN\7\6"+
		"\2\2FH\n\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2"+
		"\2\2LN\7\6\2\2M>\3\2\2\2MI\3\2\2\2N\r\3\2\2\2OR\5\20\t\2PR\5\22\n\2QO"+
		"\3\2\2\2QP\3\2\2\2R\17\3\2\2\2ST\7\3\2\2TU\6\t\3\2UY\7\33\2\2VX\5\26\f"+
		"\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\4"+
		"\2\2]\21\3\2\2\2^_\6\n\4\2_`\7\33\2\2`a\5\24\13\2a\23\3\2\2\2bc\6\13\5"+
		"\3cd\5\26\f\2de\b\13\1\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ik\3\2\2\2jh\3\2\2\2kl\b\13\1\2l\25\3\2\2\2mn\b\f\1\2no\7\16\2\2o"+
		"~\5\26\f\27p~\5\20\t\2q~\5\22\n\2rs\7\3\2\2st\5\26\f\2tu\7\4\2\2u~\3\2"+
		"\2\2v~\5\30\r\2w~\5\32\16\2x~\7\b\2\2y~\7\30\2\2z~\7\31\2\2{~\7\32\2\2"+
		"|~\7\33\2\2}m\3\2\2\2}p\3\2\2\2}q\3\2\2\2}r\3\2\2\2}v\3\2\2\2}w\3\2\2"+
		"\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\u009f\3\2\2\2\177"+
		"\u0080\f\f\2\2\u0080\u0081\7\20\2\2\u0081\u009e\5\26\f\r\u0082\u0083\f"+
		"\13\2\2\u0083\u0084\7\21\2\2\u0084\u009e\5\26\f\f\u0085\u0086\f\n\2\2"+
		"\u0086\u0087\7\17\2\2\u0087\u009e\5\26\f\13\u0088\u0089\f\t\2\2\u0089"+
		"\u008a\7\16\2\2\u008a\u009e\5\26\f\n\u008b\u008c\f\b\2\2\u008c\u008d\7"+
		"\22\2\2\u008d\u009e\5\26\f\t\u008e\u008f\f\7\2\2\u008f\u0090\7\23\2\2"+
		"\u0090\u009e\5\26\f\b\u0091\u0092\f\6\2\2\u0092\u0093\7\25\2\2\u0093\u009e"+
		"\5\26\f\7\u0094\u0095\f\5\2\2\u0095\u0096\7\26\2\2\u0096\u009e\5\26\f"+
		"\6\u0097\u0098\f\4\2\2\u0098\u0099\7\24\2\2\u0099\u009e\5\26\f\5\u009a"+
		"\u009b\f\3\2\2\u009b\u009c\7\27\2\2\u009c\u009e\5\26\f\4\u009d\177\3\2"+
		"\2\2\u009d\u0082\3\2\2\2\u009d\u0085\3\2\2\2\u009d\u0088\3\2\2\2\u009d"+
		"\u008b\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0091\3\2\2\2\u009d\u0094\3\2"+
		"\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a7\7\n\2\2\u00a3\u00a6\n\3\2\2\u00a4\u00a6\5\30\r\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\13\2\2\u00ab\31\3\2\2\2\u00ac\u00b1\7\f\2\2\u00ad\u00b0\n\4\2"+
		"\2\u00ae\u00b0\5\32\16\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5\33\3\2\2\2\22\37(;"+
		"BIMQYh}\u009d\u009f\u00a5\u00a7\u00af\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}