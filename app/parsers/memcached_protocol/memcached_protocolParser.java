// Generated from memcached_protocol/memcached_protocol.g4 by ANTLR 4.7.1
package parsers.memcached_protocol;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class memcached_protocolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		INTEGER=32, WORD=33, WHITESPACE=34;
	public static final int
		RULE_command_line = 0, RULE_storage_command = 1, RULE_storage_command_name = 2, 
		RULE_retrieval_command = 3, RULE_delete_command = 4, RULE_increment_command = 5, 
		RULE_decrement_command = 6, RULE_statistics_command = 7, RULE_statistics_option = 8, 
		RULE_flush_command = 9, RULE_version_command = 10, RULE_verbosity_command = 11, 
		RULE_quit_command = 12, RULE_storage_response = 13, RULE_retrieval_response = 14, 
		RULE_deletion_response = 15, RULE_incr_or_decr_response = 16, RULE_statistics_response = 17, 
		RULE_error_response = 18, RULE_general_statistic = 19, RULE_size_statistic = 20, 
		RULE_general_error = 21, RULE_client_error_message = 22, RULE_server_error_message = 23, 
		RULE_end = 24, RULE_noreply = 25, RULE_key = 26, RULE_flags = 27, RULE_exptime = 28, 
		RULE_bytes = 29, RULE_cas_unique = 30, RULE_value = 31, RULE_time = 32, 
		RULE_delay = 33, RULE_verbosity_level = 34, RULE_statistic_name = 35, 
		RULE_statistic_value = 36, RULE_size = 37, RULE_count = 38;
	public static final String[] ruleNames = {
		"command_line", "storage_command", "storage_command_name", "retrieval_command", 
		"delete_command", "increment_command", "decrement_command", "statistics_command", 
		"statistics_option", "flush_command", "version_command", "verbosity_command", 
		"quit_command", "storage_response", "retrieval_response", "deletion_response", 
		"incr_or_decr_response", "statistics_response", "error_response", "general_statistic", 
		"size_statistic", "general_error", "client_error_message", "server_error_message", 
		"end", "noreply", "key", "flags", "exptime", "bytes", "cas_unique", "value", 
		"time", "delay", "verbosity_level", "statistic_name", "statistic_value", 
		"size", "count"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cas'", "'set'", "'add'", "'replace'", "'append'", "'prepend'", 
		"'get'", "'gets'", "'delete'", "'incr'", "'decr'", "'stats'", "'items'", 
		"'slabs'", "'sizes'", "'flush_all'", "'version'", "'verbosity'", "'quit'", 
		"'STORED'", "'NOT_STORED'", "'EXISTS'", "'NOT_FOUND'", "'VALUE'", "'DELETED'", 
		"'STAT'", "'ERROR'", "'CLIENT_ERROR'", "'SERVER_ERROR'", "'END'", "'noreply'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "INTEGER", "WORD", "WHITESPACE"
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
	public String getGrammarFileName() { return "memcached_protocol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public memcached_protocolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Command_lineContext extends ParserRuleContext {
		public List<Storage_commandContext> storage_command() {
			return getRuleContexts(Storage_commandContext.class);
		}
		public Storage_commandContext storage_command(int i) {
			return getRuleContext(Storage_commandContext.class,i);
		}
		public List<Retrieval_commandContext> retrieval_command() {
			return getRuleContexts(Retrieval_commandContext.class);
		}
		public Retrieval_commandContext retrieval_command(int i) {
			return getRuleContext(Retrieval_commandContext.class,i);
		}
		public List<Delete_commandContext> delete_command() {
			return getRuleContexts(Delete_commandContext.class);
		}
		public Delete_commandContext delete_command(int i) {
			return getRuleContext(Delete_commandContext.class,i);
		}
		public List<Increment_commandContext> increment_command() {
			return getRuleContexts(Increment_commandContext.class);
		}
		public Increment_commandContext increment_command(int i) {
			return getRuleContext(Increment_commandContext.class,i);
		}
		public List<Decrement_commandContext> decrement_command() {
			return getRuleContexts(Decrement_commandContext.class);
		}
		public Decrement_commandContext decrement_command(int i) {
			return getRuleContext(Decrement_commandContext.class,i);
		}
		public List<Statistics_commandContext> statistics_command() {
			return getRuleContexts(Statistics_commandContext.class);
		}
		public Statistics_commandContext statistics_command(int i) {
			return getRuleContext(Statistics_commandContext.class,i);
		}
		public List<Flush_commandContext> flush_command() {
			return getRuleContexts(Flush_commandContext.class);
		}
		public Flush_commandContext flush_command(int i) {
			return getRuleContext(Flush_commandContext.class,i);
		}
		public List<Version_commandContext> version_command() {
			return getRuleContexts(Version_commandContext.class);
		}
		public Version_commandContext version_command(int i) {
			return getRuleContext(Version_commandContext.class,i);
		}
		public List<Verbosity_commandContext> verbosity_command() {
			return getRuleContexts(Verbosity_commandContext.class);
		}
		public Verbosity_commandContext verbosity_command(int i) {
			return getRuleContext(Verbosity_commandContext.class,i);
		}
		public List<Quit_commandContext> quit_command() {
			return getRuleContexts(Quit_commandContext.class);
		}
		public Quit_commandContext quit_command(int i) {
			return getRuleContext(Quit_commandContext.class,i);
		}
		public Command_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterCommand_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitCommand_line(this);
		}
	}

	public final Command_lineContext command_line() throws RecognitionException {
		Command_lineContext _localctx = new Command_lineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
					{
					setState(78);
					storage_command();
					}
					break;
				case T__6:
				case T__7:
					{
					setState(79);
					retrieval_command();
					}
					break;
				case T__8:
					{
					setState(80);
					delete_command();
					}
					break;
				case T__9:
					{
					setState(81);
					increment_command();
					}
					break;
				case T__10:
					{
					setState(82);
					decrement_command();
					}
					break;
				case T__11:
					{
					setState(83);
					statistics_command();
					}
					break;
				case T__15:
					{
					setState(84);
					flush_command();
					}
					break;
				case T__16:
					{
					setState(85);
					version_command();
					}
					break;
				case T__17:
					{
					setState(86);
					verbosity_command();
					}
					break;
				case T__18:
					{
					setState(87);
					quit_command();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0) );
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

	public static class Storage_commandContext extends ParserRuleContext {
		public NoreplyContext noreply() {
			return getRuleContext(NoreplyContext.class,0);
		}
		public Storage_command_nameContext storage_command_name() {
			return getRuleContext(Storage_command_nameContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public FlagsContext flags() {
			return getRuleContext(FlagsContext.class,0);
		}
		public ExptimeContext exptime() {
			return getRuleContext(ExptimeContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public Cas_uniqueContext cas_unique() {
			return getRuleContext(Cas_uniqueContext.class,0);
		}
		public Storage_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStorage_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStorage_command(this);
		}
	}

	public final Storage_commandContext storage_command() throws RecognitionException {
		Storage_commandContext _localctx = new Storage_commandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_storage_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				{
				{
				setState(92);
				storage_command_name();
				setState(93);
				key();
				setState(94);
				flags();
				setState(95);
				exptime();
				setState(96);
				bytes();
				}
				}
				break;
			case T__0:
				{
				{
				setState(98);
				match(T__0);
				setState(99);
				key();
				setState(100);
				flags();
				setState(101);
				exptime();
				setState(102);
				bytes();
				setState(103);
				cas_unique();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(107);
				noreply();
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

	public static class Storage_command_nameContext extends ParserRuleContext {
		public Storage_command_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_command_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStorage_command_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStorage_command_name(this);
		}
	}

	public final Storage_command_nameContext storage_command_name() throws RecognitionException {
		Storage_command_nameContext _localctx = new Storage_command_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_storage_command_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class Retrieval_commandContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public Retrieval_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrieval_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterRetrieval_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitRetrieval_command(this);
		}
	}

	public final Retrieval_commandContext retrieval_command() throws RecognitionException {
		Retrieval_commandContext _localctx = new Retrieval_commandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retrieval_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(113);
					key();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Delete_commandContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public NoreplyContext noreply() {
			return getRuleContext(NoreplyContext.class,0);
		}
		public Delete_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterDelete_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitDelete_command(this);
		}
	}

	public final Delete_commandContext delete_command() throws RecognitionException {
		Delete_commandContext _localctx = new Delete_commandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delete_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__8);
			setState(119);
			key();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(120);
				time();
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(123);
				noreply();
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

	public static class Increment_commandContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NoreplyContext noreply() {
			return getRuleContext(NoreplyContext.class,0);
		}
		public Increment_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterIncrement_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitIncrement_command(this);
		}
	}

	public final Increment_commandContext increment_command() throws RecognitionException {
		Increment_commandContext _localctx = new Increment_commandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_increment_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__9);
			setState(127);
			key();
			setState(128);
			value();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(129);
				noreply();
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

	public static class Decrement_commandContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NoreplyContext noreply() {
			return getRuleContext(NoreplyContext.class,0);
		}
		public Decrement_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterDecrement_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitDecrement_command(this);
		}
	}

	public final Decrement_commandContext decrement_command() throws RecognitionException {
		Decrement_commandContext _localctx = new Decrement_commandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decrement_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__10);
			setState(133);
			key();
			setState(134);
			value();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(135);
				noreply();
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

	public static class Statistics_commandContext extends ParserRuleContext {
		public Statistics_optionContext statistics_option() {
			return getRuleContext(Statistics_optionContext.class,0);
		}
		public Statistics_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStatistics_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStatistics_command(this);
		}
	}

	public final Statistics_commandContext statistics_command() throws RecognitionException {
		Statistics_commandContext _localctx = new Statistics_commandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statistics_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__11);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(139);
				statistics_option();
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

	public static class Statistics_optionContext extends ParserRuleContext {
		public Statistics_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStatistics_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStatistics_option(this);
		}
	}

	public final Statistics_optionContext statistics_option() throws RecognitionException {
		Statistics_optionContext _localctx = new Statistics_optionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statistics_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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

	public static class Flush_commandContext extends ParserRuleContext {
		public DelayContext delay() {
			return getRuleContext(DelayContext.class,0);
		}
		public NoreplyContext noreply() {
			return getRuleContext(NoreplyContext.class,0);
		}
		public Flush_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterFlush_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitFlush_command(this);
		}
	}

	public final Flush_commandContext flush_command() throws RecognitionException {
		Flush_commandContext _localctx = new Flush_commandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flush_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__15);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(145);
				delay();
				}
			}

			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(148);
				noreply();
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

	public static class Version_commandContext extends ParserRuleContext {
		public Version_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterVersion_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitVersion_command(this);
		}
	}

	public final Version_commandContext version_command() throws RecognitionException {
		Version_commandContext _localctx = new Version_commandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_version_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__16);
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

	public static class Verbosity_commandContext extends ParserRuleContext {
		public Verbosity_levelContext verbosity_level() {
			return getRuleContext(Verbosity_levelContext.class,0);
		}
		public Verbosity_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbosity_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterVerbosity_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitVerbosity_command(this);
		}
	}

	public final Verbosity_commandContext verbosity_command() throws RecognitionException {
		Verbosity_commandContext _localctx = new Verbosity_commandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_verbosity_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__17);
			setState(154);
			verbosity_level();
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

	public static class Quit_commandContext extends ParserRuleContext {
		public Quit_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterQuit_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitQuit_command(this);
		}
	}

	public final Quit_commandContext quit_command() throws RecognitionException {
		Quit_commandContext _localctx = new Quit_commandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quit_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__18);
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

	public static class Storage_responseContext extends ParserRuleContext {
		public Error_responseContext error_response() {
			return getRuleContext(Error_responseContext.class,0);
		}
		public Storage_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStorage_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStorage_response(this);
		}
	}

	public final Storage_responseContext storage_response() throws RecognitionException {
		Storage_responseContext _localctx = new Storage_responseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_storage_response);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				error_response();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(T__22);
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

	public static class Retrieval_responseContext extends ParserRuleContext {
		public Error_responseContext error_response() {
			return getRuleContext(Error_responseContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public FlagsContext flags() {
			return getRuleContext(FlagsContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public Cas_uniqueContext cas_unique() {
			return getRuleContext(Cas_uniqueContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Retrieval_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrieval_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterRetrieval_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitRetrieval_response(this);
		}
	}

	public final Retrieval_responseContext retrieval_response() throws RecognitionException {
		Retrieval_responseContext _localctx = new Retrieval_responseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retrieval_response);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				error_response();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(166);
				match(T__23);
				setState(167);
				key();
				setState(168);
				flags();
				setState(169);
				bytes();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER) {
					{
					setState(170);
					cas_unique();
					}
				}

				}
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				end();
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

	public static class Deletion_responseContext extends ParserRuleContext {
		public Error_responseContext error_response() {
			return getRuleContext(Error_responseContext.class,0);
		}
		public Deletion_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletion_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterDeletion_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitDeletion_response(this);
		}
	}

	public final Deletion_responseContext deletion_response() throws RecognitionException {
		Deletion_responseContext _localctx = new Deletion_responseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deletion_response);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				error_response();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__24);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__22);
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

	public static class Incr_or_decr_responseContext extends ParserRuleContext {
		public Error_responseContext error_response() {
			return getRuleContext(Error_responseContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public Incr_or_decr_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr_or_decr_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterIncr_or_decr_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitIncr_or_decr_response(this);
		}
	}

	public final Incr_or_decr_responseContext incr_or_decr_response() throws RecognitionException {
		Incr_or_decr_responseContext _localctx = new Incr_or_decr_responseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_incr_or_decr_response);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				error_response();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__22);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(INTEGER);
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

	public static class Statistics_responseContext extends ParserRuleContext {
		public Error_responseContext error_response() {
			return getRuleContext(Error_responseContext.class,0);
		}
		public General_statisticContext general_statistic() {
			return getRuleContext(General_statisticContext.class,0);
		}
		public Size_statisticContext size_statistic() {
			return getRuleContext(Size_statisticContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Statistics_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStatistics_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStatistics_response(this);
		}
	}

	public final Statistics_responseContext statistics_response() throws RecognitionException {
		Statistics_responseContext _localctx = new Statistics_responseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statistics_response);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				error_response();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				general_statistic();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				size_statistic();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				end();
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

	public static class Error_responseContext extends ParserRuleContext {
		public General_errorContext general_error() {
			return getRuleContext(General_errorContext.class,0);
		}
		public Client_error_messageContext client_error_message() {
			return getRuleContext(Client_error_messageContext.class,0);
		}
		public Server_error_messageContext server_error_message() {
			return getRuleContext(Server_error_messageContext.class,0);
		}
		public Error_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterError_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitError_response(this);
		}
	}

	public final Error_responseContext error_response() throws RecognitionException {
		Error_responseContext _localctx = new Error_responseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_error_response);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				general_error();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				client_error_message();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				server_error_message();
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

	public static class General_statisticContext extends ParserRuleContext {
		public Statistic_nameContext statistic_name() {
			return getRuleContext(Statistic_nameContext.class,0);
		}
		public Statistic_valueContext statistic_value() {
			return getRuleContext(Statistic_valueContext.class,0);
		}
		public General_statisticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_statistic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterGeneral_statistic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitGeneral_statistic(this);
		}
	}

	public final General_statisticContext general_statistic() throws RecognitionException {
		General_statisticContext _localctx = new General_statisticContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_general_statistic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__25);
			setState(198);
			statistic_name();
			setState(199);
			statistic_value();
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

	public static class Size_statisticContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public Size_statisticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_statistic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterSize_statistic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitSize_statistic(this);
		}
	}

	public final Size_statisticContext size_statistic() throws RecognitionException {
		Size_statisticContext _localctx = new Size_statisticContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_size_statistic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			size();
			setState(202);
			count();
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

	public static class General_errorContext extends ParserRuleContext {
		public General_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterGeneral_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitGeneral_error(this);
		}
	}

	public final General_errorContext general_error() throws RecognitionException {
		General_errorContext _localctx = new General_errorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_general_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__26);
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

	public static class Client_error_messageContext extends ParserRuleContext {
		public Client_error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_client_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterClient_error_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitClient_error_message(this);
		}
	}

	public final Client_error_messageContext client_error_message() throws RecognitionException {
		Client_error_messageContext _localctx = new Client_error_messageContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_client_error_message);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__27);
			setState(208); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(207);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Server_error_messageContext extends ParserRuleContext {
		public Server_error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterServer_error_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitServer_error_message(this);
		}
	}

	public final Server_error_messageContext server_error_message() throws RecognitionException {
		Server_error_messageContext _localctx = new Server_error_messageContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_server_error_message);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__28);
			setState(214); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(213);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__29);
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

	public static class NoreplyContext extends ParserRuleContext {
		public NoreplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noreply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterNoreply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitNoreply(this);
		}
	}

	public final NoreplyContext noreply() throws RecognitionException {
		NoreplyContext _localctx = new NoreplyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_noreply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__30);
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

	public static class KeyContext extends ParserRuleContext {
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			matchWildcard();
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

	public static class FlagsContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public FlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitFlags(this);
		}
	}

	public final FlagsContext flags() throws RecognitionException {
		FlagsContext _localctx = new FlagsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_flags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(INTEGER);
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

	public static class ExptimeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public ExptimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterExptime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitExptime(this);
		}
	}

	public final ExptimeContext exptime() throws RecognitionException {
		ExptimeContext _localctx = new ExptimeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exptime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(INTEGER);
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

	public static class BytesContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public BytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitBytes(this);
		}
	}

	public final BytesContext bytes() throws RecognitionException {
		BytesContext _localctx = new BytesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(INTEGER);
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

	public static class Cas_uniqueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public Cas_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cas_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterCas_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitCas_unique(this);
		}
	}

	public final Cas_uniqueContext cas_unique() throws RecognitionException {
		Cas_uniqueContext _localctx = new Cas_uniqueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cas_unique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(INTEGER);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(INTEGER);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(INTEGER);
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

	public static class DelayContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public DelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitDelay(this);
		}
	}

	public final DelayContext delay() throws RecognitionException {
		DelayContext _localctx = new DelayContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_delay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(INTEGER);
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

	public static class Verbosity_levelContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public Verbosity_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbosity_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterVerbosity_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitVerbosity_level(this);
		}
	}

	public final Verbosity_levelContext verbosity_level() throws RecognitionException {
		Verbosity_levelContext _localctx = new Verbosity_levelContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_verbosity_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(INTEGER);
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

	public static class Statistic_nameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(memcached_protocolParser.WORD, 0); }
		public Statistic_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistic_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStatistic_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStatistic_name(this);
		}
	}

	public final Statistic_nameContext statistic_name() throws RecognitionException {
		Statistic_nameContext _localctx = new Statistic_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statistic_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WORD);
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

	public static class Statistic_valueContext extends ParserRuleContext {
		public Statistic_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistic_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterStatistic_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitStatistic_value(this);
		}
	}

	public final Statistic_valueContext statistic_value() throws RecognitionException {
		Statistic_valueContext _localctx = new Statistic_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statistic_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			matchWildcard();
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(INTEGER);
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

	public static class CountContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(memcached_protocolParser.INTEGER, 0); }
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memcached_protocolListener ) ((memcached_protocolListener)listener).exitCount(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(INTEGER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\6\2[\n\2\r\2\16\2\\\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\3\5\3o\n\3\3\4\3\4\3\5\3\5\6\5u\n\5"+
		"\r\5\16\5v\3\6\3\6\3\6\5\6|\n\6\3\6\5\6\177\n\6\3\7\3\7\3\7\3\7\5\7\u0085"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\13"+
		"\3\13\5\13\u0095\n\13\3\13\5\13\u0098\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ae\n\20\3\20\5\20\u00b1\n\20\3\21\3\21\3\21\5\21\u00b6\n"+
		"\21\3\22\3\22\3\22\5\22\u00bb\n\22\3\23\3\23\3\23\3\23\5\23\u00c1\n\23"+
		"\3\24\3\24\3\24\5\24\u00c6\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\6\30\u00d3\n\30\r\30\16\30\u00d4\3\31\3\31\6\31\u00d9"+
		"\n\31\r\31\16\31\u00da\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3(\4\u00d4\u00da\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLN\2\5\3\2\4\b\3\2\t\n\3\2\17\21\2\u00f9\2Z\3\2"+
		"\2\2\4k\3\2\2\2\6p\3\2\2\2\br\3\2\2\2\nx\3\2\2\2\f\u0080\3\2\2\2\16\u0086"+
		"\3\2\2\2\20\u008c\3\2\2\2\22\u0090\3\2\2\2\24\u0092\3\2\2\2\26\u0099\3"+
		"\2\2\2\30\u009b\3\2\2\2\32\u009e\3\2\2\2\34\u00a5\3\2\2\2\36\u00b0\3\2"+
		"\2\2 \u00b5\3\2\2\2\"\u00ba\3\2\2\2$\u00c0\3\2\2\2&\u00c5\3\2\2\2(\u00c7"+
		"\3\2\2\2*\u00cb\3\2\2\2,\u00ce\3\2\2\2.\u00d0\3\2\2\2\60\u00d6\3\2\2\2"+
		"\62\u00dc\3\2\2\2\64\u00de\3\2\2\2\66\u00e0\3\2\2\28\u00e2\3\2\2\2:\u00e4"+
		"\3\2\2\2<\u00e6\3\2\2\2>\u00e8\3\2\2\2@\u00ea\3\2\2\2B\u00ec\3\2\2\2D"+
		"\u00ee\3\2\2\2F\u00f0\3\2\2\2H\u00f2\3\2\2\2J\u00f4\3\2\2\2L\u00f6\3\2"+
		"\2\2N\u00f8\3\2\2\2P[\5\4\3\2Q[\5\b\5\2R[\5\n\6\2S[\5\f\7\2T[\5\16\b\2"+
		"U[\5\20\t\2V[\5\24\13\2W[\5\26\f\2X[\5\30\r\2Y[\5\32\16\2ZP\3\2\2\2ZQ"+
		"\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2Z"+
		"X\3\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\3\3\2\2\2^_\5\6"+
		"\4\2_`\5\66\34\2`a\58\35\2ab\5:\36\2bc\5<\37\2cl\3\2\2\2de\7\3\2\2ef\5"+
		"\66\34\2fg\58\35\2gh\5:\36\2hi\5<\37\2ij\5> \2jl\3\2\2\2k^\3\2\2\2kd\3"+
		"\2\2\2ln\3\2\2\2mo\5\64\33\2nm\3\2\2\2no\3\2\2\2o\5\3\2\2\2pq\t\2\2\2"+
		"q\7\3\2\2\2rt\t\3\2\2su\5\66\34\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2w\t\3\2\2\2xy\7\13\2\2y{\5\66\34\2z|\5B\"\2{z\3\2\2\2{|\3\2\2\2|~"+
		"\3\2\2\2}\177\5\64\33\2~}\3\2\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080\u0081"+
		"\7\f\2\2\u0081\u0082\5\66\34\2\u0082\u0084\5@!\2\u0083\u0085\5\64\33\2"+
		"\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7"+
		"\r\2\2\u0087\u0088\5\66\34\2\u0088\u008a\5@!\2\u0089\u008b\5\64\33\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2\2\u008c\u008e\7\16\2"+
		"\2\u008d\u008f\5\22\n\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u0091\t\4\2\2\u0091\23\3\2\2\2\u0092\u0094\7\22\2\2"+
		"\u0093\u0095\5D#\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0098\5\64\33\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\25\3\2\2\2\u0099\u009a\7\23\2\2\u009a\27\3\2\2\2\u009b\u009c\7"+
		"\24\2\2\u009c\u009d\5F$\2\u009d\31\3\2\2\2\u009e\u009f\7\25\2\2\u009f"+
		"\33\3\2\2\2\u00a0\u00a6\5&\24\2\u00a1\u00a6\7\26\2\2\u00a2\u00a6\7\27"+
		"\2\2\u00a3\u00a6\7\30\2\2\u00a4\u00a6\7\31\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\35\3\2\2\2\u00a7\u00b1\5&\24\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa"+
		"\5\66\34\2\u00aa\u00ab\58\35\2\u00ab\u00ad\5<\37\2\u00ac\u00ae\5> \2\u00ad"+
		"\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\5\62"+
		"\32\2\u00b0\u00a7\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\37\3\2\2\2\u00b2\u00b6\5&\24\2\u00b3\u00b6\7\33\2\2\u00b4\u00b6\7\31"+
		"\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"!\3\2\2\2\u00b7\u00bb\5&\24\2\u00b8\u00bb\7\31\2\2\u00b9\u00bb\7\"\2\2"+
		"\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb#\3"+
		"\2\2\2\u00bc\u00c1\5&\24\2\u00bd\u00c1\5(\25\2\u00be\u00c1\5*\26\2\u00bf"+
		"\u00c1\5\62\32\2\u00c0\u00bc\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00bf\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c6\5,\27\2\u00c3\u00c6"+
		"\5.\30\2\u00c4\u00c6\5\60\31\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c5\u00c4\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00c8\7\34\2\2\u00c8\u00c9"+
		"\5H%\2\u00c9\u00ca\5J&\2\u00ca)\3\2\2\2\u00cb\u00cc\5L\'\2\u00cc\u00cd"+
		"\5N(\2\u00cd+\3\2\2\2\u00ce\u00cf\7\35\2\2\u00cf-\3\2\2\2\u00d0\u00d2"+
		"\7\36\2\2\u00d1\u00d3\13\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5/\3\2\2\2\u00d6\u00d8\7"+
		"\37\2\2\u00d7\u00d9\13\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\61\3\2\2\2\u00dc\u00dd\7 \2\2"+
		"\u00dd\63\3\2\2\2\u00de\u00df\7!\2\2\u00df\65\3\2\2\2\u00e0\u00e1\13\2"+
		"\2\2\u00e1\67\3\2\2\2\u00e2\u00e3\7\"\2\2\u00e39\3\2\2\2\u00e4\u00e5\7"+
		"\"\2\2\u00e5;\3\2\2\2\u00e6\u00e7\7\"\2\2\u00e7=\3\2\2\2\u00e8\u00e9\7"+
		"\"\2\2\u00e9?\3\2\2\2\u00ea\u00eb\7\"\2\2\u00ebA\3\2\2\2\u00ec\u00ed\7"+
		"\"\2\2\u00edC\3\2\2\2\u00ee\u00ef\7\"\2\2\u00efE\3\2\2\2\u00f0\u00f1\7"+
		"\"\2\2\u00f1G\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3I\3\2\2\2\u00f4\u00f5\13"+
		"\2\2\2\u00f5K\3\2\2\2\u00f6\u00f7\7\"\2\2\u00f7M\3\2\2\2\u00f8\u00f9\7"+
		"\"\2\2\u00f9O\3\2\2\2\27Z\\knv{~\u0084\u008a\u008e\u0094\u0097\u00a5\u00ad"+
		"\u00b0\u00b5\u00ba\u00c0\u00c5\u00d4\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}