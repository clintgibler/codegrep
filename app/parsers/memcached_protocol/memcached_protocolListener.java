// Generated from memcached_protocol/memcached_protocol.g4 by ANTLR 4.7.1
package parsers.memcached_protocol;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link memcached_protocolParser}.
 */
public interface memcached_protocolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#command_line}.
	 * @param ctx the parse tree
	 */
	void enterCommand_line(memcached_protocolParser.Command_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#command_line}.
	 * @param ctx the parse tree
	 */
	void exitCommand_line(memcached_protocolParser.Command_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#storage_command}.
	 * @param ctx the parse tree
	 */
	void enterStorage_command(memcached_protocolParser.Storage_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#storage_command}.
	 * @param ctx the parse tree
	 */
	void exitStorage_command(memcached_protocolParser.Storage_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#storage_command_name}.
	 * @param ctx the parse tree
	 */
	void enterStorage_command_name(memcached_protocolParser.Storage_command_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#storage_command_name}.
	 * @param ctx the parse tree
	 */
	void exitStorage_command_name(memcached_protocolParser.Storage_command_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#retrieval_command}.
	 * @param ctx the parse tree
	 */
	void enterRetrieval_command(memcached_protocolParser.Retrieval_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#retrieval_command}.
	 * @param ctx the parse tree
	 */
	void exitRetrieval_command(memcached_protocolParser.Retrieval_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#delete_command}.
	 * @param ctx the parse tree
	 */
	void enterDelete_command(memcached_protocolParser.Delete_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#delete_command}.
	 * @param ctx the parse tree
	 */
	void exitDelete_command(memcached_protocolParser.Delete_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#increment_command}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_command(memcached_protocolParser.Increment_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#increment_command}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_command(memcached_protocolParser.Increment_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#decrement_command}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_command(memcached_protocolParser.Decrement_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#decrement_command}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_command(memcached_protocolParser.Decrement_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#statistics_command}.
	 * @param ctx the parse tree
	 */
	void enterStatistics_command(memcached_protocolParser.Statistics_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#statistics_command}.
	 * @param ctx the parse tree
	 */
	void exitStatistics_command(memcached_protocolParser.Statistics_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#statistics_option}.
	 * @param ctx the parse tree
	 */
	void enterStatistics_option(memcached_protocolParser.Statistics_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#statistics_option}.
	 * @param ctx the parse tree
	 */
	void exitStatistics_option(memcached_protocolParser.Statistics_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#flush_command}.
	 * @param ctx the parse tree
	 */
	void enterFlush_command(memcached_protocolParser.Flush_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#flush_command}.
	 * @param ctx the parse tree
	 */
	void exitFlush_command(memcached_protocolParser.Flush_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#version_command}.
	 * @param ctx the parse tree
	 */
	void enterVersion_command(memcached_protocolParser.Version_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#version_command}.
	 * @param ctx the parse tree
	 */
	void exitVersion_command(memcached_protocolParser.Version_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#verbosity_command}.
	 * @param ctx the parse tree
	 */
	void enterVerbosity_command(memcached_protocolParser.Verbosity_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#verbosity_command}.
	 * @param ctx the parse tree
	 */
	void exitVerbosity_command(memcached_protocolParser.Verbosity_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#quit_command}.
	 * @param ctx the parse tree
	 */
	void enterQuit_command(memcached_protocolParser.Quit_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#quit_command}.
	 * @param ctx the parse tree
	 */
	void exitQuit_command(memcached_protocolParser.Quit_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#storage_response}.
	 * @param ctx the parse tree
	 */
	void enterStorage_response(memcached_protocolParser.Storage_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#storage_response}.
	 * @param ctx the parse tree
	 */
	void exitStorage_response(memcached_protocolParser.Storage_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#retrieval_response}.
	 * @param ctx the parse tree
	 */
	void enterRetrieval_response(memcached_protocolParser.Retrieval_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#retrieval_response}.
	 * @param ctx the parse tree
	 */
	void exitRetrieval_response(memcached_protocolParser.Retrieval_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#deletion_response}.
	 * @param ctx the parse tree
	 */
	void enterDeletion_response(memcached_protocolParser.Deletion_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#deletion_response}.
	 * @param ctx the parse tree
	 */
	void exitDeletion_response(memcached_protocolParser.Deletion_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#incr_or_decr_response}.
	 * @param ctx the parse tree
	 */
	void enterIncr_or_decr_response(memcached_protocolParser.Incr_or_decr_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#incr_or_decr_response}.
	 * @param ctx the parse tree
	 */
	void exitIncr_or_decr_response(memcached_protocolParser.Incr_or_decr_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#statistics_response}.
	 * @param ctx the parse tree
	 */
	void enterStatistics_response(memcached_protocolParser.Statistics_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#statistics_response}.
	 * @param ctx the parse tree
	 */
	void exitStatistics_response(memcached_protocolParser.Statistics_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#error_response}.
	 * @param ctx the parse tree
	 */
	void enterError_response(memcached_protocolParser.Error_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#error_response}.
	 * @param ctx the parse tree
	 */
	void exitError_response(memcached_protocolParser.Error_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#general_statistic}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_statistic(memcached_protocolParser.General_statisticContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#general_statistic}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_statistic(memcached_protocolParser.General_statisticContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#size_statistic}.
	 * @param ctx the parse tree
	 */
	void enterSize_statistic(memcached_protocolParser.Size_statisticContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#size_statistic}.
	 * @param ctx the parse tree
	 */
	void exitSize_statistic(memcached_protocolParser.Size_statisticContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#general_error}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_error(memcached_protocolParser.General_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#general_error}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_error(memcached_protocolParser.General_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#client_error_message}.
	 * @param ctx the parse tree
	 */
	void enterClient_error_message(memcached_protocolParser.Client_error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#client_error_message}.
	 * @param ctx the parse tree
	 */
	void exitClient_error_message(memcached_protocolParser.Client_error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#server_error_message}.
	 * @param ctx the parse tree
	 */
	void enterServer_error_message(memcached_protocolParser.Server_error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#server_error_message}.
	 * @param ctx the parse tree
	 */
	void exitServer_error_message(memcached_protocolParser.Server_error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(memcached_protocolParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(memcached_protocolParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#noreply}.
	 * @param ctx the parse tree
	 */
	void enterNoreply(memcached_protocolParser.NoreplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#noreply}.
	 * @param ctx the parse tree
	 */
	void exitNoreply(memcached_protocolParser.NoreplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(memcached_protocolParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(memcached_protocolParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#flags}.
	 * @param ctx the parse tree
	 */
	void enterFlags(memcached_protocolParser.FlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#flags}.
	 * @param ctx the parse tree
	 */
	void exitFlags(memcached_protocolParser.FlagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#exptime}.
	 * @param ctx the parse tree
	 */
	void enterExptime(memcached_protocolParser.ExptimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#exptime}.
	 * @param ctx the parse tree
	 */
	void exitExptime(memcached_protocolParser.ExptimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#bytes}.
	 * @param ctx the parse tree
	 */
	void enterBytes(memcached_protocolParser.BytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#bytes}.
	 * @param ctx the parse tree
	 */
	void exitBytes(memcached_protocolParser.BytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#cas_unique}.
	 * @param ctx the parse tree
	 */
	void enterCas_unique(memcached_protocolParser.Cas_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#cas_unique}.
	 * @param ctx the parse tree
	 */
	void exitCas_unique(memcached_protocolParser.Cas_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(memcached_protocolParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(memcached_protocolParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(memcached_protocolParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(memcached_protocolParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#delay}.
	 * @param ctx the parse tree
	 */
	void enterDelay(memcached_protocolParser.DelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#delay}.
	 * @param ctx the parse tree
	 */
	void exitDelay(memcached_protocolParser.DelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#verbosity_level}.
	 * @param ctx the parse tree
	 */
	void enterVerbosity_level(memcached_protocolParser.Verbosity_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#verbosity_level}.
	 * @param ctx the parse tree
	 */
	void exitVerbosity_level(memcached_protocolParser.Verbosity_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#statistic_name}.
	 * @param ctx the parse tree
	 */
	void enterStatistic_name(memcached_protocolParser.Statistic_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#statistic_name}.
	 * @param ctx the parse tree
	 */
	void exitStatistic_name(memcached_protocolParser.Statistic_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#statistic_value}.
	 * @param ctx the parse tree
	 */
	void enterStatistic_value(memcached_protocolParser.Statistic_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#statistic_value}.
	 * @param ctx the parse tree
	 */
	void exitStatistic_value(memcached_protocolParser.Statistic_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(memcached_protocolParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(memcached_protocolParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link memcached_protocolParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(memcached_protocolParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link memcached_protocolParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(memcached_protocolParser.CountContext ctx);
}