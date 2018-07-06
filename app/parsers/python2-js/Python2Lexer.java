// Generated from python2-js/Python2.g4 by ANTLR 4.7.1
package parsers.python2-js;

    var Python2Parser = require('./Python2Parser').Python2Parser;
    var CommonToken = require('antlr4').CommonToken
    class IndentStack {
        constructor() {
            this._s = [];
        }
        empty() {
            return this._s.length === 0;
        }
        push(wsval) {
            this._s.push(wsval);
        }
        pop() {
            this._s.pop();
        }
        wsval() {
            if (this._s.length) return this._s[this._s.length - 1];
            else return 0;
        }
    }

    class TokenQueue {
        constructor() {
            this._q = [];
        }
        empty() {
            return this._q.length === 0;
        }
        enq(t) {
            this._q.push(t);
        }
        deq() {
            return this._q.shift();
        }
    }

    function ord(char) {
        return char.charCodeAt();
    }

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Python2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, NAME=70, NUMBER=71, STRING=72, LINENDING=73, 
		WHITESPACE=74, COMMENT=75, OPEN_PAREN=76, CLOSE_PAREN=77, OPEN_BRACE=78, 
		CLOSE_BRACE=79, OPEN_BRACKET=80, CLOSE_BRACKET=81, UNKNOWN=82;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"T__65", "T__66", "T__67", "T__68", "NAME", "NUMBER", "STRING", "LINENDING", 
		"WHITESPACE", "COMMENT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "UNKNOWN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'def'", "':'", "'='", "','", "'*'", "'**'", "';'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", 
		"'**='", "'//='", "'>>'", "'del'", "'pass'", "'break'", "'continue'", 
		"'return'", "'raise'", "'import'", "'from'", "'.'", "'as'", "'global'", 
		"'exec'", "'in'", "'assert'", "'if'", "'elif'", "'else'", "'while'", "'for'", 
		"'try'", "'finally'", "'with'", "'except'", "'lambda'", "'or'", "'and'", 
		"'not'", "'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'is'", 
		"'|'", "'^'", "'&'", "'<<'", "'+'", "'-'", "'/'", "'%'", "'//'", "'~'", 
		"'`'", "'class'", "'yield'", null, null, null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NAME", "NUMBER", 
		"STRING", "LINENDING", "WHITESPACE", "COMMENT", "OPEN_PAREN", "CLOSE_PAREN", 
		"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "UNKNOWN"
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


	    var old_lexer = Python2Lexer;
	    Python2Lexer = function() {
	        old_lexer.apply(this, arguments);
	        this._openBRCount       = 0
	        this._suppressNewlines  = false
	        this._lineContinuation  = false
	        this._tokens            = new TokenQueue();
	        this._indents           = new IndentStack();
	        antlr4.Lexer.prototype.reset.call(this);
	    }

	    Python2Lexer.prototype = Object.create(old_lexer.prototype);
	    Python2Lexer.prototype.constructor = Python2Lexer;

	    Python2Lexer.prototype.nextToken = function() {
	        if (!this._tokens.empty()) {
	            return this._tokens.deq();
	        } else {
	            var t = antlr4.Lexer.prototype.nextToken.call(this);
	            if (t.type !== Python2Parser.EOF) return t;
	            else {
	                if (!this._suppressNewlines) {
	                    this.emitNewline();
	                }
	                this.emitFullDedent();
	                this.emitEndmarker();
	                this.emitEndToken(t);
	                return this._tokens.deq();
	            }
	        }

	    }

	    Python2Lexer.prototype.emitEndToken = function (token) {
	        this._tokens.enq(token);
	    }

	    Python2Lexer.prototype.emitIndent = function (length = 0, text = 'INDENT') {
	        var t = this.createToken(Python2Parser.INDENT, text, length);
	        this._tokens.enq(t);
	    }

	    Python2Lexer.prototype.emitDedent = function () {
	        var t = this.createToken(Python2Parser.DEDENT, 'DEDENT');
	        this._tokens.enq(t);
	    }

	    Python2Lexer.prototype.emitFullDedent = function () {
	        while (!this._indents.empty()) {
	            this._indents.pop();
	            this.emitDedent();
	        }
	    }

	    Python2Lexer.prototype.emitEndmarker = function () {
	        var t = this.createToken(Python2Parser.ENDMARKER, 'ENDMARKER');
	        this._tokens.enq(t);
	    }

	    Python2Lexer.prototype.emitNewline = function () {
	        var t = this.createToken(Python2Parser.NEWLINE, 'NEWLINE');
	        this._tokens.enq(t);
	    }   

	    Python2Lexer.prototype.createToken = function (type_, text="", length=0) {
	        var start = this._tokenStartCharIndex;
	        var stop = start + length;
	        var t = new CommonToken(this._tokenFactorySourcePair,
	                type_, this.DEFAULT_TOKEN_CHANNEL,
	                start, stop);
	        t.text = text;
	        return t;
	    }  


	public Python2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 72:
			LINENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
			WHITESPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 75:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 76:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
			OPEN_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 78:
			CLOSE_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 79:
			OPEN_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			CLOSE_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LINENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			this._lineContinuation=false
			break;
		case 1:
			this._lineContinuation=true
			break;
		case 2:

			if (this._openBRCount == 0 && !this._lineContinuation) {
			    if (!this._suppressNewlines) {
			        this.emitNewline()
			        this._suppressNewlines = true
			    }
			    var la = this._input.LA(1)
			    if ([ord(' '), ord('\t'), ord('#')].indexOf(la) === -1) {
			        this._suppressNewlines = false
			        this.emitFullDedent()
			    }
			}

			break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			if (this._tokenStartColumn == 0 && this._openBRCount == 0
			    && !this._lineContinuation) {

			    var la = this._input.LA(1);
			    if ([ord('\r'), ord('\n'), ord('#'), -1].indexOf(la)===-1)
			        this._suppressNewlines = false
			        var wsCount = 0;
			        for (var ch in this.text) {
			            ch = this.text[ch];
			            if (ch == ' ') wsCount += 1
			            else if (ch == '\t') wsCount += 8
			        }

			        if (wsCount > this._indents.wsval()) {
			            this.emitIndent(this.text.length)
			            this._indents.push(wsCount)
			        }
			        else {
			            while (wsCount < this._indents.wsval()) {
			                this.emitDedent()
			                this._indents.pop()
			            }
			            if (wsCount != this._indents.wsval()) {
			                // throw new Error('wsCount')
			            }
			        }
			    }

			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			this._openBRCount  += 1
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			this._openBRCount  -= 1
			break;
		}
	}
	private void OPEN_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			this._openBRCount  += 1
			break;
		}
	}
	private void CLOSE_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			this._openBRCount  -= 1
			break;
		}
	}
	private void OPEN_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			this._openBRCount  += 1
			break;
		}
	}
	private void CLOSE_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			this._openBRCount  -= 1
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u02b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A"+
		"\3B\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\7G\u01af"+
		"\nG\fG\16G\u01b2\13G\3H\3H\3H\6H\u01b7\nH\rH\16H\u01b8\3H\3H\3H\5H\u01be"+
		"\nH\3H\6H\u01c1\nH\rH\16H\u01c2\5H\u01c5\nH\3H\3H\6H\u01c9\nH\rH\16H\u01ca"+
		"\3H\5H\u01ce\nH\3H\3H\6H\u01d2\nH\rH\16H\u01d3\3H\5H\u01d7\nH\5H\u01d9"+
		"\nH\3H\6H\u01dc\nH\rH\16H\u01dd\3H\3H\7H\u01e2\nH\fH\16H\u01e5\13H\3H"+
		"\3H\6H\u01e9\nH\rH\16H\u01ea\5H\u01ed\nH\3H\3H\5H\u01f1\nH\3H\6H\u01f4"+
		"\nH\rH\16H\u01f5\5H\u01f8\nH\3H\5H\u01fb\nH\3H\6H\u01fe\nH\rH\16H\u01ff"+
		"\3H\3H\3H\5H\u0205\nH\3H\6H\u0208\nH\rH\16H\u0209\3H\5H\u020d\nH\3H\5"+
		"H\u0210\nH\5H\u0212\nH\3I\5I\u0215\nI\3I\5I\u0218\nI\3I\5I\u021b\nI\3"+
		"I\5I\u021e\nI\5I\u0220\nI\3I\3I\3I\6I\u0225\nI\rI\16I\u0226\3I\5I\u022a"+
		"\nI\3I\5I\u022d\nI\3I\5I\u0230\nI\3I\7I\u0233\nI\fI\16I\u0236\13I\3I\3"+
		"I\3I\3I\6I\u023c\nI\rI\16I\u023d\3I\5I\u0241\nI\3I\5I\u0244\nI\3I\5I\u0247"+
		"\nI\3I\7I\u024a\nI\fI\16I\u024d\13I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u0257\n"+
		"I\fI\16I\u025a\13I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u0266\nI\fI\16I\u0269"+
		"\13I\3I\3I\3I\5I\u026e\nI\3J\5J\u0271\nJ\3J\6J\u0274\nJ\rJ\16J\u0275\3"+
		"J\3J\3J\7J\u027b\nJ\fJ\16J\u027e\13J\3J\5J\u0281\nJ\3J\3J\3J\5J\u0286"+
		"\nJ\3J\3J\3J\3J\3K\6K\u028d\nK\rK\16K\u028e\3K\3K\3K\3K\3L\3L\7L\u0297"+
		"\nL\fL\16L\u029a\13L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3"+
		"Q\3R\3R\3R\3S\3S\3S\3S\4\u0258\u0267\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\3\2\26\5\2C\\aac|\6"+
		"\2\62;C\\aac|\4\2ZZzz\5\2\62;CHch\4\2NNnn\4\2GGgg\4\2--//\3\2\62;\4\2"+
		"QQqq\3\2\629\4\2DDdd\3\2\62\63\4\2LLll\6\2DDWWddww\4\2TTtt\4\2\13\13\""+
		"\"\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\3\2^^\4\2\f\f\17\17\2\u02ee\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\3\u00a7\3\2\2\2\5\u00a9"+
		"\3\2\2\2\7\u00ad\3\2\2\2\t\u00af\3\2\2\2\13\u00b1\3\2\2\2\r\u00b3\3\2"+
		"\2\2\17\u00b5\3\2\2\2\21\u00b8\3\2\2\2\23\u00ba\3\2\2\2\25\u00bd\3\2\2"+
		"\2\27\u00c0\3\2\2\2\31\u00c3\3\2\2\2\33\u00c6\3\2\2\2\35\u00c9\3\2\2\2"+
		"\37\u00cc\3\2\2\2!\u00cf\3\2\2\2#\u00d2\3\2\2\2%\u00d6\3\2\2\2\'\u00da"+
		"\3\2\2\2)\u00de\3\2\2\2+\u00e2\3\2\2\2-\u00e5\3\2\2\2/\u00e9\3\2\2\2\61"+
		"\u00ee\3\2\2\2\63\u00f4\3\2\2\2\65\u00fd\3\2\2\2\67\u0104\3\2\2\29\u010a"+
		"\3\2\2\2;\u0111\3\2\2\2=\u0116\3\2\2\2?\u0118\3\2\2\2A\u011b\3\2\2\2C"+
		"\u0122\3\2\2\2E\u0127\3\2\2\2G\u012a\3\2\2\2I\u0131\3\2\2\2K\u0134\3\2"+
		"\2\2M\u0139\3\2\2\2O\u013e\3\2\2\2Q\u0144\3\2\2\2S\u0148\3\2\2\2U\u014c"+
		"\3\2\2\2W\u0154\3\2\2\2Y\u0159\3\2\2\2[\u0160\3\2\2\2]\u0167\3\2\2\2_"+
		"\u016a\3\2\2\2a\u016e\3\2\2\2c\u0172\3\2\2\2e\u0174\3\2\2\2g\u0176\3\2"+
		"\2\2i\u0179\3\2\2\2k\u017c\3\2\2\2m\u017f\3\2\2\2o\u0182\3\2\2\2q\u0185"+
		"\3\2\2\2s\u0188\3\2\2\2u\u018a\3\2\2\2w\u018c\3\2\2\2y\u018e\3\2\2\2{"+
		"\u0191\3\2\2\2}\u0193\3\2\2\2\177\u0195\3\2\2\2\u0081\u0197\3\2\2\2\u0083"+
		"\u0199\3\2\2\2\u0085\u019c\3\2\2\2\u0087\u019e\3\2\2\2\u0089\u01a0\3\2"+
		"\2\2\u008b\u01a6\3\2\2\2\u008d\u01ac\3\2\2\2\u008f\u0211\3\2\2\2\u0091"+
		"\u021f\3\2\2\2\u0093\u0285\3\2\2\2\u0095\u028c\3\2\2\2\u0097\u0294\3\2"+
		"\2\2\u0099\u029d\3\2\2\2\u009b\u02a0\3\2\2\2\u009d\u02a3\3\2\2\2\u009f"+
		"\u02a6\3\2\2\2\u00a1\u02a9\3\2\2\2\u00a3\u02ac\3\2\2\2\u00a5\u02af\3\2"+
		"\2\2\u00a7\u00a8\7B\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7h\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\7<\2\2\u00ae\b"+
		"\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\n\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2\f"+
		"\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6"+
		"\u00b7\7,\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\7=\2\2\u00b9\22\3\2\2\2\u00ba"+
		"\u00bb\7-\2\2\u00bb\u00bc\7?\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7/\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\7?\2\2\u00c2"+
		"\30\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\7?\2\2\u00c5\32\3\2\2\2\u00c6"+
		"\u00c7\7\'\2\2\u00c7\u00c8\7?\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\7(\2\2"+
		"\u00ca\u00cb\7?\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7~\2\2\u00cd\u00ce\7"+
		"?\2\2\u00ce \3\2\2\2\u00cf\u00d0\7`\2\2\u00d0\u00d1\7?\2\2\u00d1\"\3\2"+
		"\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7?\2\2\u00d5$\3"+
		"\2\2\2\u00d6\u00d7\7@\2\2\u00d7\u00d8\7@\2\2\u00d8\u00d9\7?\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00dc\7,\2\2\u00dc\u00dd\7?\2\2\u00dd"+
		"(\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\7?\2\2"+
		"\u00e1*\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4\7@\2\2\u00e4,\3\2\2\2\u00e5"+
		"\u00e6\7f\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7n\2\2\u00e8.\3\2\2\2\u00e9"+
		"\u00ea\7r\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7u\2\2"+
		"\u00ed\60\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7"+
		"g\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7m\2\2\u00f3\62\3\2\2\2\u00f4\u00f5"+
		"\7e\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc\64\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7"+
		"v\2\2\u0100\u0101\7w\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2\u0103\66"+
		"\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106\7c\2\2\u0106\u0107\7k\2\2\u0107"+
		"\u0108\7u\2\2\u0108\u0109\7g\2\2\u01098\3\2\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7o\2\2\u010c\u010d\7r\2\2\u010d\u010e\7q\2\2\u010e\u010f\7t\2\2"+
		"\u010f\u0110\7v\2\2\u0110:\3\2\2\2\u0111\u0112\7h\2\2\u0112\u0113\7t\2"+
		"\2\u0113\u0114\7q\2\2\u0114\u0115\7o\2\2\u0115<\3\2\2\2\u0116\u0117\7"+
		"\60\2\2\u0117>\3\2\2\2\u0118\u0119\7c\2\2\u0119\u011a\7u\2\2\u011a@\3"+
		"\2\2\2\u011b\u011c\7i\2\2\u011c\u011d\7n\2\2\u011d\u011e\7q\2\2\u011e"+
		"\u011f\7d\2\2\u011f\u0120\7c\2\2\u0120\u0121\7n\2\2\u0121B\3\2\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7z\2\2\u0124\u0125\7g\2\2\u0125\u0126\7e\2\2"+
		"\u0126D\3\2\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129F\3\2\2\2\u012a"+
		"\u012b\7c\2\2\u012b\u012c\7u\2\2\u012c\u012d\7u\2\2\u012d\u012e\7g\2\2"+
		"\u012e\u012f\7t\2\2\u012f\u0130\7v\2\2\u0130H\3\2\2\2\u0131\u0132\7k\2"+
		"\2\u0132\u0133\7h\2\2\u0133J\3\2\2\2\u0134\u0135\7g\2\2\u0135\u0136\7"+
		"n\2\2\u0136\u0137\7k\2\2\u0137\u0138\7h\2\2\u0138L\3\2\2\2\u0139\u013a"+
		"\7g\2\2\u013a\u013b\7n\2\2\u013b\u013c\7u\2\2\u013c\u013d\7g\2\2\u013d"+
		"N\3\2\2\2\u013e\u013f\7y\2\2\u013f\u0140\7j\2\2\u0140\u0141\7k\2\2\u0141"+
		"\u0142\7n\2\2\u0142\u0143\7g\2\2\u0143P\3\2\2\2\u0144\u0145\7h\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7t\2\2\u0147R\3\2\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u014a\7t\2\2\u014a\u014b\7{\2\2\u014bT\3\2\2\2\u014c\u014d\7h\2\2\u014d"+
		"\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f\u0150\7c\2\2\u0150\u0151\7n\2\2"+
		"\u0151\u0152\7n\2\2\u0152\u0153\7{\2\2\u0153V\3\2\2\2\u0154\u0155\7y\2"+
		"\2\u0155\u0156\7k\2\2\u0156\u0157\7v\2\2\u0157\u0158\7j\2\2\u0158X\3\2"+
		"\2\2\u0159\u015a\7g\2\2\u015a\u015b\7z\2\2\u015b\u015c\7e\2\2\u015c\u015d"+
		"\7g\2\2\u015d\u015e\7r\2\2\u015e\u015f\7v\2\2\u015fZ\3\2\2\2\u0160\u0161"+
		"\7n\2\2\u0161\u0162\7c\2\2\u0162\u0163\7o\2\2\u0163\u0164\7d\2\2\u0164"+
		"\u0165\7f\2\2\u0165\u0166\7c\2\2\u0166\\\3\2\2\2\u0167\u0168\7q\2\2\u0168"+
		"\u0169\7t\2\2\u0169^\3\2\2\2\u016a\u016b\7c\2\2\u016b\u016c\7p\2\2\u016c"+
		"\u016d\7f\2\2\u016d`\3\2\2\2\u016e\u016f\7p\2\2\u016f\u0170\7q\2\2\u0170"+
		"\u0171\7v\2\2\u0171b\3\2\2\2\u0172\u0173\7>\2\2\u0173d\3\2\2\2\u0174\u0175"+
		"\7@\2\2\u0175f\3\2\2\2\u0176\u0177\7?\2\2\u0177\u0178\7?\2\2\u0178h\3"+
		"\2\2\2\u0179\u017a\7@\2\2\u017a\u017b\7?\2\2\u017bj\3\2\2\2\u017c\u017d"+
		"\7>\2\2\u017d\u017e\7?\2\2\u017el\3\2\2\2\u017f\u0180\7>\2\2\u0180\u0181"+
		"\7@\2\2\u0181n\3\2\2\2\u0182\u0183\7#\2\2\u0183\u0184\7?\2\2\u0184p\3"+
		"\2\2\2\u0185\u0186\7k\2\2\u0186\u0187\7u\2\2\u0187r\3\2\2\2\u0188\u0189"+
		"\7~\2\2\u0189t\3\2\2\2\u018a\u018b\7`\2\2\u018bv\3\2\2\2\u018c\u018d\7"+
		"(\2\2\u018dx\3\2\2\2\u018e\u018f\7>\2\2\u018f\u0190\7>\2\2\u0190z\3\2"+
		"\2\2\u0191\u0192\7-\2\2\u0192|\3\2\2\2\u0193\u0194\7/\2\2\u0194~\3\2\2"+
		"\2\u0195\u0196\7\61\2\2\u0196\u0080\3\2\2\2\u0197\u0198\7\'\2\2\u0198"+
		"\u0082\3\2\2\2\u0199\u019a\7\61\2\2\u019a\u019b\7\61\2\2\u019b\u0084\3"+
		"\2\2\2\u019c\u019d\7\u0080\2\2\u019d\u0086\3\2\2\2\u019e\u019f\7b\2\2"+
		"\u019f\u0088\3\2\2\2\u01a0\u01a1\7e\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3"+
		"\7c\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7u\2\2\u01a5\u008a\3\2\2\2\u01a6"+
		"\u01a7\7{\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7n\2\2"+
		"\u01aa\u01ab\7f\2\2\u01ab\u008c\3\2\2\2\u01ac\u01b0\t\2\2\2\u01ad\u01af"+
		"\t\3\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u008e\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01d8\7\62"+
		"\2\2\u01b4\u01b6\t\4\2\2\u01b5\u01b7\t\5\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c4\3\2"+
		"\2\2\u01ba\u01c5\t\6\2\2\u01bb\u01bd\t\7\2\2\u01bc\u01be\t\b\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01c1\t\t"+
		"\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01ba\3\2\2\2\u01c4\u01bb\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01d9\3\2\2\2\u01c6\u01c8\t\n\2\2\u01c7"+
		"\u01c9\t\13\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3"+
		"\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\t\6\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d9\3\2\2\2\u01cf\u01d1\t\f"+
		"\2\2\u01d0\u01d2\t\r\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\t\6"+
		"\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8"+
		"\u01b4\3\2\2\2\u01d8\u01c6\3\2\2\2\u01d8\u01cf\3\2\2\2\u01d9\u0212\3\2"+
		"\2\2\u01da\u01dc\t\t\2\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e3\7\60"+
		"\2\2\u01e0\u01e2\t\t\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ed\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e6\u01e8\7\60\2\2\u01e7\u01e9\t\t\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2"+
		"\2\2\u01ec\u01db\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ed\u01f7\3\2\2\2\u01ee"+
		"\u01f0\t\7\2\2\u01ef\u01f1\t\b\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f4\t\t\2\2\u01f3\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2"+
		"\2\2\u01f7\u01ee\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01fb\t\16\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0212\3"+
		"\2\2\2\u01fc\u01fe\t\t\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u020f\3\2\2\2\u0201\u0210\t\6"+
		"\2\2\u0202\u0204\t\7\2\2\u0203\u0205\t\b\2\2\u0204\u0203\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0208\t\t\2\2\u0207\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u020d\t\16\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3"+
		"\2\2\2\u020d\u0210\3\2\2\2\u020e\u0210\t\16\2\2\u020f\u0201\3\2\2\2\u020f"+
		"\u0202\3\2\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2"+
		"\2\2\u0211\u01b3\3\2\2\2\u0211\u01ec\3\2\2\2\u0211\u01fd\3\2\2\2\u0212"+
		"\u0090\3\2\2\2\u0213\u0215\t\17\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3"+
		"\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\t\20\2\2\u0217\u0216\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0220\3\2\2\2\u0219\u021b\t\20\2\2\u021a\u0219\3"+
		"\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021e\t\17\2\2\u021d"+
		"\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u0214\3\2"+
		"\2\2\u021f\u021a\3\2\2\2\u0220\u026d\3\2\2\2\u0221\u0234\7)\2\2\u0222"+
		"\u022f\7^\2\2\u0223\u0225\t\21\2\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022c\3\2\2\2\u0228"+
		"\u022a\7\17\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3"+
		"\2\2\2\u022b\u022d\7\f\2\2\u022c\u0229\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u0230\3\2\2\2\u022e\u0230\13\2\2\2\u022f\u0224\3\2\2\2\u022f\u022e\3"+
		"\2\2\2\u0230\u0233\3\2\2\2\u0231\u0233\n\22\2\2\u0232\u0222\3\2\2\2\u0232"+
		"\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u026e\7)\2\2\u0238"+
		"\u024b\7$\2\2\u0239\u0246\7^\2\2\u023a\u023c\t\21\2\2\u023b\u023a\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u0243\3\2\2\2\u023f\u0241\7\17\2\2\u0240\u023f\3\2\2\2\u0240\u0241\3"+
		"\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\7\f\2\2\u0243\u0240\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0247\13\2\2\2\u0246\u023b\3"+
		"\2\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u024a\n\23\2\2\u0249"+
		"\u0239\3\2\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e"+
		"\u026e\7$\2\2\u024f\u0250\7$\2\2\u0250\u0251\7$\2\2\u0251\u0252\7$\2\2"+
		"\u0252\u0258\3\2\2\2\u0253\u0254\7^\2\2\u0254\u0257\13\2\2\2\u0255\u0257"+
		"\n\24\2\2\u0256\u0253\3\2\2\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2"+
		"\u0258\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0258"+
		"\3\2\2\2\u025b\u025c\7$\2\2\u025c\u025d\7$\2\2\u025d\u026e\7$\2\2\u025e"+
		"\u025f\7)\2\2\u025f\u0260\7)\2\2\u0260\u0261\7)\2\2\u0261\u0267\3\2\2"+
		"\2\u0262\u0263\7^\2\2\u0263\u0266\13\2\2\2\u0264\u0266\n\24\2\2\u0265"+
		"\u0262\3\2\2\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0268\3\2"+
		"\2\2\u0267\u0265\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026b\7)\2\2\u026b\u026c\7)\2\2\u026c\u026e\7)\2\2\u026d\u0221\3\2\2"+
		"\2\u026d\u0238\3\2\2\2\u026d\u024f\3\2\2\2\u026d\u025e\3\2\2\2\u026e\u0092"+
		"\3\2\2\2\u026f\u0271\7\17\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2"+
		"\u0271\u0272\3\2\2\2\u0272\u0274\7\f\2\2\u0273\u0270\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0286\bJ\2\2\u0278\u027c\7^\2\2\u0279\u027b\t\21\2\2\u027a\u0279\3\2"+
		"\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0281\7\17\2\2\u0280\u027f\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\7\f\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0286\bJ\3\2\u0285\u0273\3\2\2\2\u0285\u0278\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287\u0288\bJ\4\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\bJ\5\2\u028a\u0094\3\2\2\2\u028b\u028d\t\21\2\2\u028c\u028b\3\2"+
		"\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0291\bK\6\2\u0291\u0292\3\2\2\2\u0292\u0293\bK\5"+
		"\2\u0293\u0096\3\2\2\2\u0294\u0298\7%\2\2\u0295\u0297\n\25\2\2\u0296\u0295"+
		"\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u029c\bL\7\2\u029c\u0098\3\2"+
		"\2\2\u029d\u029e\7*\2\2\u029e\u029f\bM\b\2\u029f\u009a\3\2\2\2\u02a0\u02a1"+
		"\7+\2\2\u02a1\u02a2\bN\t\2\u02a2\u009c\3\2\2\2\u02a3\u02a4\7}\2\2\u02a4"+
		"\u02a5\bO\n\2\u02a5\u009e\3\2\2\2\u02a6\u02a7\7\177\2\2\u02a7\u02a8\b"+
		"P\13\2\u02a8\u00a0\3\2\2\2\u02a9\u02aa\7]\2\2\u02aa\u02ab\bQ\f\2\u02ab"+
		"\u00a2\3\2\2\2\u02ac\u02ad\7_\2\2\u02ad\u02ae\bR\r\2\u02ae\u00a4\3\2\2"+
		"\2\u02af\u02b0\13\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\bS\7\2\u02b2\u00a6"+
		"\3\2\2\28\2\u01b0\u01b8\u01bd\u01c2\u01c4\u01ca\u01cd\u01d3\u01d6\u01d8"+
		"\u01dd\u01e3\u01ea\u01ec\u01f0\u01f5\u01f7\u01fa\u01ff\u0204\u0209\u020c"+
		"\u020f\u0211\u0214\u0217\u021a\u021d\u021f\u0226\u0229\u022c\u022f\u0232"+
		"\u0234\u023d\u0240\u0243\u0246\u0249\u024b\u0256\u0258\u0265\u0267\u026d"+
		"\u0270\u0275\u027c\u0280\u0285\u028e\u0298\16\3J\2\3J\3\3J\4\2\3\2\3K"+
		"\5\b\2\2\3M\6\3N\7\3O\b\3P\t\3Q\n\3R\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}