// Generated from masm/MASM.g4 by ANTLR 4.7.1
package parsers.masm;
 
 	 package com.Ostermiller.Syntax;
 	 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MASMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Identifier=10, DS=11, ES=12, CS=13, SS=14, GS=15, FS=16, AH=17, AL=18, 
		AX=19, BH=20, BL=21, BX=22, CH=23, CL=24, CX=25, DH=26, DL=27, DX=28, 
		SI=29, DI=30, SP=31, BP=32, EAX=33, EBX=34, ECX=35, EDX=36, ESI=37, EDI=38, 
		ESP=39, EBP=40, MOV=41, CMP=42, TEST=43, PUSH=44, POP=45, IDIV=46, INC=47, 
		DEC=48, NEG=49, MUL=50, DIV=51, IMUL=52, NOT=53, SETPO=54, SETAE=55, SETNLE=56, 
		SETC=57, SETNO=58, SETNB=59, SETP=60, SETNGE=61, SETL=62, SETGE=63, SETPE=64, 
		SETNL=65, SETNZ=66, SETNE=67, SETNC=68, SETBE=69, SETNP=70, SETNS=71, 
		SETO=72, SETNA=73, SETNAE=74, SETZ=75, SETLE=76, SETNBE=77, SETS=78, SETE=79, 
		SETB=80, SETA=81, SETG=82, SETNG=83, XCHG=84, POPAD=85, AAA=86, POPA=87, 
		POPFD=88, CWD=89, LAHF=90, PUSHAD=91, PUSHF=92, AAS=93, BSWAP=94, PUSHFD=95, 
		CBW=96, CWDE=97, XLAT=98, AAM=99, AAD=100, CDQ=101, DAA=102, SAHF=103, 
		DAS=104, INTO=105, IRET=106, CLC=107, STC=108, CMC=109, CLD=110, STD=111, 
		CLI=112, STI=113, MOVSB=114, MOVSW=115, MOVSD=116, LODS=117, LODSB=118, 
		LODSW=119, LODSD=120, STOS=121, STOSB=122, STOSW=123, SOTSD=124, SCAS=125, 
		SCASB=126, SCASW=127, SCASD=128, CMPS=129, CMPSB=130, CMPSW=131, CMPSD=132, 
		INSB=133, INSW=134, INSD=135, OUTSB=136, OUTSW=137, OUTSD=138, ADC=139, 
		ADD=140, SUB=141, CBB=142, XOR=143, OR=144, JNBE=145, JNZ=146, JPO=147, 
		JZ=148, JS=149, LOOPNZ=150, JGE=151, JB=152, JNB=153, JO=154, JP=155, 
		JNO=156, JNL=157, JNAE=158, LOOPZ=159, JMP=160, JNP=161, LOOP=162, JL=163, 
		JCXZ=164, JAE=165, JNGE=166, JA=167, LOOPNE=168, LOOPE=169, JG=170, JNLE=171, 
		JE=172, JNC=173, JC=174, JNA=175, JBE=176, JLE=177, JPE=178, JNS=179, 
		JECXZ=180, JNG=181, MOVZX=182, BSF=183, BSR=184, LES=185, LEA=186, LDS=187, 
		INS=188, OUTS=189, XADD=190, CMPXCHG=191, SHL=192, SHR=193, ROR=194, ROL=195, 
		RCL=196, SAL=197, RCR=198, SAR=199, SHRD=200, SHLD=201, BTR=202, BT=203, 
		BTC=204, CALL=205, INT=206, RETN=207, RET=208, RETF=209, IN=210, OUT=211, 
		REP=212, REPE=213, REPZ=214, REPNE=215, REPNZ=216, ALPHA=217, CONST=218, 
		CREF=219, XCREF=220, DATA=221, DATA2=222, DOSSEG=223, ERR=224, ERR1=225, 
		ERR2=226, ERRE=227, ERRNZ=228, ERRDEF=229, ERRNDEF=230, ERRB=231, ERRNB=232, 
		ERRIDN=233, ERRDIF=234, EVEN=235, LIST=236, WIDTH=237, MASK=238, SEQ=239, 
		XLIST=240, EXIT=241, MODEL=242, BYTE=243, SBYTE=244, DB=245, WORD=246, 
		SWORD=247, DW=248, DWORD=249, SDWORD=250, DD=251, FWORD=252, DF=253, QWORD=254, 
		DQ=255, TBYTE=256, DT=257, REAL4=258, REAL8=259, REAL=260, FAR=261, NEAR=262, 
		PROC=263, QUESTION=264, TIMES=265, Hexnum=266, Integer=267, Octalnum=268, 
		FloatingPointLiteral=269, String=270, Etiqueta=271, Separator=272, WS=273, 
		LINE_COMMENT=274;
	public static final int
		RULE_compilationUnit = 0, RULE_segments = 1, RULE_proc = 2, RULE_code = 3, 
		RULE_binary_exp1 = 4, RULE_unuary_exp1 = 5, RULE_unuary_exp2 = 6, RULE_binary_exp2 = 7, 
		RULE_notarguments = 8, RULE_binary_exp3 = 9, RULE_unuary_exp3 = 10, RULE_binary_exp4 = 11, 
		RULE_binary_exp5 = 12, RULE_binary_exp6 = 13, RULE_binary_exp7 = 14, RULE_binary_exp8 = 15, 
		RULE_binary_exp9 = 16, RULE_unuary_exp4 = 17, RULE_unuary_exp5 = 18, RULE_binary_exp10 = 19, 
		RULE_binary_exp11 = 20, RULE_binary_exp12 = 21, RULE_directive_exp1 = 22, 
		RULE_variabledeclaration = 23, RULE_memory = 24, RULE_segmentos = 25, 
		RULE_register = 26, RULE_o = 27, RULE_op = 28, RULE_ope = 29, RULE_oper = 30, 
		RULE_opera = 31, RULE_operat = 32, RULE_operato = 33, RULE_operator = 34, 
		RULE_l = 35, RULE_x = 36, RULE_s = 37, RULE_sh = 38, RULE_b = 39, RULE_call = 40, 
		RULE_interruption = 41, RULE_in = 42, RULE_out = 43, RULE_re = 44, RULE_directives = 45, 
		RULE_ty = 46, RULE_question = 47, RULE_time = 48;
	public static final String[] ruleNames = {
		"compilationUnit", "segments", "proc", "code", "binary_exp1", "unuary_exp1", 
		"unuary_exp2", "binary_exp2", "notarguments", "binary_exp3", "unuary_exp3", 
		"binary_exp4", "binary_exp5", "binary_exp6", "binary_exp7", "binary_exp8", 
		"binary_exp9", "unuary_exp4", "unuary_exp5", "binary_exp10", "binary_exp11", 
		"binary_exp12", "directive_exp1", "variabledeclaration", "memory", "segmentos", 
		"register", "o", "op", "ope", "oper", "opera", "operat", "operato", "operator", 
		"l", "x", "s", "sh", "b", "call", "interruption", "in", "out", "re", "directives", 
		"ty", "question", "time"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "'segments'", "'para'", "'public'", "'ends'", "'endp'", 
		"'['", "'+'", "']'", null, "'ds'", "'es'", "'cs'", "'ss'", "'gs'", "'fs'", 
		"'ah'", "'al'", "'ax'", "'bh'", "'bl'", "'bx'", "'ch'", "'cl'", "'cx'", 
		"'dh'", "'dl'", "'dx'", "'si'", "'di'", "'sp'", "'bp'", "'eax'", "'ebx'", 
		"'ecx'", "'edx'", "'esi'", "'edi'", "'esp'", "'ebp'", "'mov'", "'cmp'", 
		"'test'", "'push'", "'pop'", "'idiv'", "'inc'", "'dec'", "'neg'", "'mul'", 
		"'div'", "'imul'", "'not'", "'setpo'", "'setae'", "'setnle'", "'setc'", 
		"'setno'", "'setnb'", "'setp'", "'setnge'", "'setl'", "'setge'", "'setpe'", 
		"'setnl'", "'setnz'", "'setne'", "'setnc'", "'setbe'", "'setnp'", "'setns'", 
		"'seto'", "'setna'", "'setnae'", "'setz'", "'setle'", "'setnbe'", "'sets'", 
		"'sete'", "'setb'", "'seta'", "'setg'", "'setng'", "'xchg'", "'popad'", 
		"'aaa'", "'popa'", "'popfd'", "'cwd'", "'lahf'", "'pushad'", "'pushf'", 
		"'aas'", "'bswap'", "'pushfd'", "'cbw'", "'cwde'", "'xlat'", "'aam'", 
		"'aad'", "'cdq'", "'daa'", "'sahf'", "'das'", "'into'", "'iret'", "'clc'", 
		"'stc'", "'cmc'", "'cld'", "'std'", "'cli'", "'sti'", "'movsb'", "'movsw'", 
		"'movsd'", "'lods'", "'lodsb'", "'lodsw'", "'lodsd'", "'stos'", "'stosb'", 
		"'stosw'", "'sotsd'", "'scas'", "'scasb'", "'scasw'", "'scasd'", "'cmps'", 
		"'cmpsb'", "'cmpsw'", "'cmpsd'", "'insb'", "'insw'", "'insd'", "'outsb'", 
		"'outsw'", "'outsd'", "'adc'", "'add'", "'sub'", "'cbb'", "'xor'", "'or'", 
		"'jnbe'", "'jnz'", "'jpo'", "'jz'", "'js'", "'loopnz'", "'jge'", "'jb'", 
		"'jnb'", "'jo'", "'jp'", "'jno'", "'jnl'", "'jnae'", "'loopz'", "'jmp'", 
		"'jnp'", "'loop'", "'jl'", "'jcxz'", "'jae'", "'jnge'", "'ja'", "'loopne'", 
		"'loope'", "'jg'", "'jnle'", "'je'", "'jnc'", "'jc'", "'jna'", "'jbe'", 
		"'jle'", "'jpe'", "'jns'", "'jecxz'", "'jng'", "'movzx'", "'bsf'", "'bsr'", 
		"'les'", "'lea'", "'lds'", "'ins'", "'outs'", "'xadd'", "'cmpxchg'", "'shl'", 
		"'shr'", "'ror'", "'rol'", "'rcl'", "'sal'", "'rcr'", "'sar'", "'shrd'", 
		"'shld'", "'btr'", "'bt'", "'btc'", "'call'", "'int'", "'retn'", "'ret'", 
		"'retf'", "'in'", "'out'", "'rep'", "'repe'", "'repz'", "'repne'", "'repnz'", 
		"'.alpha'", "'.const'", "'.cref'", "'.xcref'", "'data'", "'data?'", "'dosseg'", 
		"'.err'", "'.err1'", "'.err2'", "'.erre'", "'.errnz'", "'.errdef'", "'.errndef'", 
		"'.errb'", "'.errnb'", "'.erridn[i]'", "'.errdif[i]'", "'even'", "'.list'", 
		"'width'", "'mask'", "'.seq'", "'.xlist'", "'.exit'", "'.model'", "'byte'", 
		"'sbyte'", "'db'", "'word'", "'sword'", "'dw'", "'dword'", "'sdword'", 
		"'dd'", "'fword'", "'df'", "'qword'", "'dq'", "'tbyte'", "'dt'", "'real4'", 
		"'real8'", "'real'", "'far'", "'near'", "'proc'", "'?'", "'times'", null, 
		null, null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Identifier", 
		"DS", "ES", "CS", "SS", "GS", "FS", "AH", "AL", "AX", "BH", "BL", "BX", 
		"CH", "CL", "CX", "DH", "DL", "DX", "SI", "DI", "SP", "BP", "EAX", "EBX", 
		"ECX", "EDX", "ESI", "EDI", "ESP", "EBP", "MOV", "CMP", "TEST", "PUSH", 
		"POP", "IDIV", "INC", "DEC", "NEG", "MUL", "DIV", "IMUL", "NOT", "SETPO", 
		"SETAE", "SETNLE", "SETC", "SETNO", "SETNB", "SETP", "SETNGE", "SETL", 
		"SETGE", "SETPE", "SETNL", "SETNZ", "SETNE", "SETNC", "SETBE", "SETNP", 
		"SETNS", "SETO", "SETNA", "SETNAE", "SETZ", "SETLE", "SETNBE", "SETS", 
		"SETE", "SETB", "SETA", "SETG", "SETNG", "XCHG", "POPAD", "AAA", "POPA", 
		"POPFD", "CWD", "LAHF", "PUSHAD", "PUSHF", "AAS", "BSWAP", "PUSHFD", "CBW", 
		"CWDE", "XLAT", "AAM", "AAD", "CDQ", "DAA", "SAHF", "DAS", "INTO", "IRET", 
		"CLC", "STC", "CMC", "CLD", "STD", "CLI", "STI", "MOVSB", "MOVSW", "MOVSD", 
		"LODS", "LODSB", "LODSW", "LODSD", "STOS", "STOSB", "STOSW", "SOTSD", 
		"SCAS", "SCASB", "SCASW", "SCASD", "CMPS", "CMPSB", "CMPSW", "CMPSD", 
		"INSB", "INSW", "INSD", "OUTSB", "OUTSW", "OUTSD", "ADC", "ADD", "SUB", 
		"CBB", "XOR", "OR", "JNBE", "JNZ", "JPO", "JZ", "JS", "LOOPNZ", "JGE", 
		"JB", "JNB", "JO", "JP", "JNO", "JNL", "JNAE", "LOOPZ", "JMP", "JNP", 
		"LOOP", "JL", "JCXZ", "JAE", "JNGE", "JA", "LOOPNE", "LOOPE", "JG", "JNLE", 
		"JE", "JNC", "JC", "JNA", "JBE", "JLE", "JPE", "JNS", "JECXZ", "JNG", 
		"MOVZX", "BSF", "BSR", "LES", "LEA", "LDS", "INS", "OUTS", "XADD", "CMPXCHG", 
		"SHL", "SHR", "ROR", "ROL", "RCL", "SAL", "RCR", "SAR", "SHRD", "SHLD", 
		"BTR", "BT", "BTC", "CALL", "INT", "RETN", "RET", "RETF", "IN", "OUT", 
		"REP", "REPE", "REPZ", "REPNE", "REPNZ", "ALPHA", "CONST", "CREF", "XCREF", 
		"DATA", "DATA2", "DOSSEG", "ERR", "ERR1", "ERR2", "ERRE", "ERRNZ", "ERRDEF", 
		"ERRNDEF", "ERRB", "ERRNB", "ERRIDN", "ERRDIF", "EVEN", "LIST", "WIDTH", 
		"MASK", "SEQ", "XLIST", "EXIT", "MODEL", "BYTE", "SBYTE", "DB", "WORD", 
		"SWORD", "DW", "DWORD", "SDWORD", "DD", "FWORD", "DF", "QWORD", "DQ", 
		"TBYTE", "DT", "REAL4", "REAL8", "REAL", "FAR", "NEAR", "PROC", "QUESTION", 
		"TIMES", "Hexnum", "Integer", "Octalnum", "FloatingPointLiteral", "String", 
		"Etiqueta", "Separator", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "MASM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MASMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MASMParser.Identifier, 0); }
		public List<SegmentsContext> segments() {
			return getRuleContexts(SegmentsContext.class);
		}
		public SegmentsContext segments(int i) {
			return getRuleContext(SegmentsContext.class,i);
		}
		public List<Directive_exp1Context> directive_exp1() {
			return getRuleContexts(Directive_exp1Context.class);
		}
		public Directive_exp1Context directive_exp1(int i) {
			return getRuleContext(Directive_exp1Context.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier || ((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (ALPHA - 217)) | (1L << (CONST - 217)) | (1L << (CREF - 217)) | (1L << (XCREF - 217)) | (1L << (DATA - 217)) | (1L << (DATA2 - 217)) | (1L << (DOSSEG - 217)) | (1L << (ERR - 217)) | (1L << (ERR1 - 217)) | (1L << (ERR2 - 217)) | (1L << (ERRE - 217)) | (1L << (ERRNZ - 217)) | (1L << (ERRDEF - 217)) | (1L << (ERRNDEF - 217)) | (1L << (ERRB - 217)) | (1L << (ERRNB - 217)) | (1L << (ERRIDN - 217)) | (1L << (ERRDIF - 217)) | (1L << (EVEN - 217)) | (1L << (LIST - 217)) | (1L << (WIDTH - 217)) | (1L << (MASK - 217)) | (1L << (SEQ - 217)) | (1L << (XLIST - 217)) | (1L << (EXIT - 217)) | (1L << (MODEL - 217)))) != 0)) {
				{
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(98);
					segments();
					}
					break;
				case ALPHA:
				case CONST:
				case CREF:
				case XCREF:
				case DATA:
				case DATA2:
				case DOSSEG:
				case ERR:
				case ERR1:
				case ERR2:
				case ERRE:
				case ERRNZ:
				case ERRDEF:
				case ERRNDEF:
				case ERRB:
				case ERRNB:
				case ERRIDN:
				case ERRDIF:
				case EVEN:
				case LIST:
				case WIDTH:
				case MASK:
				case SEQ:
				case XLIST:
				case EXIT:
				case MODEL:
					{
					setState(99);
					directive_exp1();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__0);
			setState(106);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentsContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MASMParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MASMParser.Identifier, i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public SegmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterSegments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitSegments(this);
		}
	}

	public final SegmentsContext segments() throws RecognitionException {
		SegmentsContext _localctx = new SegmentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_segments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(Identifier);
			setState(109);
			match(T__1);
			setState(110);
			match(T__2);
			setState(111);
			match(T__3);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(112);
						code();
						}
						break;
					case 2:
						{
						setState(113);
						proc();
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(119);
			match(Identifier);
			setState(120);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(MASMParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MASMParser.Identifier, i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitProc(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_proc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Identifier);
			setState(123);
			match(PROC);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					code();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(130);
			match(RET);
			setState(131);
			match(Identifier);
			setState(132);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public Binary_exp1Context binary_exp1() {
			return getRuleContext(Binary_exp1Context.class,0);
		}
		public Binary_exp10Context binary_exp10() {
			return getRuleContext(Binary_exp10Context.class,0);
		}
		public Binary_exp11Context binary_exp11() {
			return getRuleContext(Binary_exp11Context.class,0);
		}
		public Binary_exp12Context binary_exp12() {
			return getRuleContext(Binary_exp12Context.class,0);
		}
		public Binary_exp2Context binary_exp2() {
			return getRuleContext(Binary_exp2Context.class,0);
		}
		public Binary_exp3Context binary_exp3() {
			return getRuleContext(Binary_exp3Context.class,0);
		}
		public Binary_exp4Context binary_exp4() {
			return getRuleContext(Binary_exp4Context.class,0);
		}
		public Binary_exp5Context binary_exp5() {
			return getRuleContext(Binary_exp5Context.class,0);
		}
		public Binary_exp6Context binary_exp6() {
			return getRuleContext(Binary_exp6Context.class,0);
		}
		public Binary_exp7Context binary_exp7() {
			return getRuleContext(Binary_exp7Context.class,0);
		}
		public Binary_exp8Context binary_exp8() {
			return getRuleContext(Binary_exp8Context.class,0);
		}
		public Binary_exp9Context binary_exp9() {
			return getRuleContext(Binary_exp9Context.class,0);
		}
		public Unuary_exp1Context unuary_exp1() {
			return getRuleContext(Unuary_exp1Context.class,0);
		}
		public Unuary_exp2Context unuary_exp2() {
			return getRuleContext(Unuary_exp2Context.class,0);
		}
		public Unuary_exp3Context unuary_exp3() {
			return getRuleContext(Unuary_exp3Context.class,0);
		}
		public Unuary_exp4Context unuary_exp4() {
			return getRuleContext(Unuary_exp4Context.class,0);
		}
		public Unuary_exp5Context unuary_exp5() {
			return getRuleContext(Unuary_exp5Context.class,0);
		}
		public NotargumentsContext notarguments() {
			return getRuleContext(NotargumentsContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public Directive_exp1Context directive_exp1() {
			return getRuleContext(Directive_exp1Context.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOV:
			case CMP:
			case TEST:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				binary_exp1();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				binary_exp10();
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				binary_exp11();
				}
				break;
			case REP:
			case REPE:
			case REPZ:
			case REPNE:
			case REPNZ:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				binary_exp12();
				}
				break;
			case XCHG:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				binary_exp2();
				}
				break;
			case ADC:
			case ADD:
			case SUB:
			case CBB:
			case XOR:
			case OR:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				binary_exp3();
				}
				break;
			case MOVZX:
			case BSF:
			case BSR:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				binary_exp4();
				}
				break;
			case LES:
			case LEA:
			case LDS:
			case INS:
			case OUTS:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				binary_exp5();
				}
				break;
			case XADD:
			case CMPXCHG:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				binary_exp6();
				}
				break;
			case SHL:
			case SHR:
			case ROR:
			case ROL:
			case RCL:
			case SAL:
			case RCR:
			case SAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				binary_exp7();
				}
				break;
			case SHRD:
			case SHLD:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				binary_exp8();
				}
				break;
			case BTR:
			case BT:
			case BTC:
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				binary_exp9();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 13);
				{
				setState(146);
				unuary_exp1();
				}
				break;
			case POP:
			case IDIV:
			case INC:
			case DEC:
			case NEG:
			case MUL:
			case DIV:
			case IMUL:
			case NOT:
			case SETPO:
			case SETAE:
			case SETNLE:
			case SETC:
			case SETNO:
			case SETNB:
			case SETP:
			case SETNGE:
			case SETL:
			case SETGE:
			case SETPE:
			case SETNL:
			case SETNZ:
			case SETNE:
			case SETNC:
			case SETBE:
			case SETNP:
			case SETNS:
			case SETO:
			case SETNA:
			case SETNAE:
			case SETZ:
			case SETLE:
			case SETNBE:
			case SETS:
			case SETE:
			case SETB:
			case SETA:
			case SETG:
			case SETNG:
				enterOuterAlt(_localctx, 14);
				{
				setState(147);
				unuary_exp2();
				}
				break;
			case JNBE:
			case JNZ:
			case JPO:
			case JZ:
			case JS:
			case LOOPNZ:
			case JGE:
			case JB:
			case JNB:
			case JO:
			case JP:
			case JNO:
			case JNL:
			case JNAE:
			case LOOPZ:
			case JMP:
			case JNP:
			case LOOP:
			case JL:
			case JCXZ:
			case JAE:
			case JNGE:
			case JA:
			case LOOPNE:
			case LOOPE:
			case JG:
			case JNLE:
			case JE:
			case JNC:
			case JC:
			case JNA:
			case JBE:
			case JLE:
			case JPE:
			case JNS:
			case JECXZ:
			case JNG:
				enterOuterAlt(_localctx, 15);
				{
				setState(148);
				unuary_exp3();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 16);
				{
				setState(149);
				unuary_exp4();
				}
				break;
			case INT:
			case RETN:
			case RET:
			case RETF:
				enterOuterAlt(_localctx, 17);
				{
				setState(150);
				unuary_exp5();
				}
				break;
			case POPAD:
			case AAA:
			case POPA:
			case POPFD:
			case CWD:
			case LAHF:
			case PUSHAD:
			case PUSHF:
			case AAS:
			case BSWAP:
			case PUSHFD:
			case CBW:
			case CWDE:
			case XLAT:
			case AAM:
			case AAD:
			case CDQ:
			case DAA:
			case SAHF:
			case DAS:
			case INTO:
			case IRET:
			case CLC:
			case STC:
			case CMC:
			case CLD:
			case STD:
			case CLI:
			case STI:
			case MOVSB:
			case MOVSW:
			case MOVSD:
			case LODS:
			case LODSB:
			case LODSW:
			case LODSD:
			case STOS:
			case STOSB:
			case STOSW:
			case SOTSD:
			case SCAS:
			case SCASB:
			case SCASW:
			case SCASD:
			case CMPS:
			case CMPSB:
			case CMPSW:
			case CMPSD:
			case INSB:
			case INSW:
			case INSD:
			case OUTSB:
			case OUTSW:
			case OUTSD:
				enterOuterAlt(_localctx, 18);
				{
				setState(151);
				notarguments();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 19);
				{
				setState(152);
				variabledeclaration();
				}
				break;
			case ALPHA:
			case CONST:
			case CREF:
			case XCREF:
			case DATA:
			case DATA2:
			case DOSSEG:
			case ERR:
			case ERR1:
			case ERR2:
			case ERRE:
			case ERRNZ:
			case ERRDEF:
			case ERRNDEF:
			case ERRB:
			case ERRNB:
			case ERRIDN:
			case ERRDIF:
			case EVEN:
			case LIST:
			case WIDTH:
			case MASK:
			case SEQ:
			case XLIST:
			case EXIT:
			case MODEL:
				enterOuterAlt(_localctx, 20);
				{
				setState(153);
				directive_exp1();
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

	public static class Binary_exp1Context extends ParserRuleContext {
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public Binary_exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp1(this);
		}
	}

	public final Binary_exp1Context binary_exp1() throws RecognitionException {
		Binary_exp1Context _localctx = new Binary_exp1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_binary_exp1);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				o();
				setState(157);
				register();
				setState(158);
				match(Separator);
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AH:
				case AL:
				case AX:
				case BH:
				case BL:
				case BX:
				case CH:
				case CL:
				case CX:
				case DH:
				case DL:
				case DX:
				case SI:
				case DI:
				case SP:
				case BP:
				case EAX:
				case EBX:
				case ECX:
				case EDX:
				case ESI:
				case EDI:
				case ESP:
				case EBP:
					{
					setState(159);
					register();
					}
					break;
				case Integer:
					{
					setState(160);
					match(Integer);
					}
					break;
				case T__6:
					{
					setState(161);
					memory();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				o();
				setState(165);
				memory();
				setState(166);
				match(Separator);
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AH:
				case AL:
				case AX:
				case BH:
				case BL:
				case BX:
				case CH:
				case CL:
				case CX:
				case DH:
				case DL:
				case DX:
				case SI:
				case DI:
				case SP:
				case BP:
				case EAX:
				case EBX:
				case ECX:
				case EDX:
				case ESI:
				case EDI:
				case ESP:
				case EBP:
					{
					setState(167);
					register();
					}
					break;
				case Integer:
					{
					setState(168);
					match(Integer);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Unuary_exp1Context extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public Unuary_exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unuary_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterUnuary_exp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitUnuary_exp1(this);
		}
	}

	public final Unuary_exp1Context unuary_exp1() throws RecognitionException {
		Unuary_exp1Context _localctx = new Unuary_exp1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_unuary_exp1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			op();
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				setState(174);
				match(Integer);
				}
				break;
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(175);
				register();
				}
				break;
			case T__6:
				{
				setState(176);
				memory();
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

	public static class Unuary_exp2Context extends ParserRuleContext {
		public OpeContext ope() {
			return getRuleContext(OpeContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public Unuary_exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unuary_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterUnuary_exp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitUnuary_exp2(this);
		}
	}

	public final Unuary_exp2Context unuary_exp2() throws RecognitionException {
		Unuary_exp2Context _localctx = new Unuary_exp2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_unuary_exp2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			ope();
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(180);
				register();
				}
				break;
			case T__6:
				{
				setState(181);
				memory();
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

	public static class Binary_exp2Context extends ParserRuleContext {
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public Binary_exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp2(this);
		}
	}

	public final Binary_exp2Context binary_exp2() throws RecognitionException {
		Binary_exp2Context _localctx = new Binary_exp2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_binary_exp2);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				oper();
				setState(185);
				register();
				setState(186);
				match(Separator);
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AH:
				case AL:
				case AX:
				case BH:
				case BL:
				case BX:
				case CH:
				case CL:
				case CX:
				case DH:
				case DL:
				case DX:
				case SI:
				case DI:
				case SP:
				case BP:
				case EAX:
				case EBX:
				case ECX:
				case EDX:
				case ESI:
				case EDI:
				case ESP:
				case EBP:
					{
					setState(187);
					register();
					}
					break;
				case T__6:
					{
					setState(188);
					memory();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				oper();
				setState(192);
				memory();
				setState(193);
				match(Separator);
				setState(194);
				register();
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

	public static class NotargumentsContext extends ParserRuleContext {
		public OperaContext opera() {
			return getRuleContext(OperaContext.class,0);
		}
		public NotargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterNotarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitNotarguments(this);
		}
	}

	public final NotargumentsContext notarguments() throws RecognitionException {
		NotargumentsContext _localctx = new NotargumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_notarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			opera();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_exp3Context extends ParserRuleContext {
		public OperatContext operat() {
			return getRuleContext(OperatContext.class,0);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public List<MemoryContext> memory() {
			return getRuleContexts(MemoryContext.class);
		}
		public MemoryContext memory(int i) {
			return getRuleContext(MemoryContext.class,i);
		}
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public Binary_exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp3(this);
		}
	}

	public final Binary_exp3Context binary_exp3() throws RecognitionException {
		Binary_exp3Context _localctx = new Binary_exp3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_binary_exp3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			operat();
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(201);
				register();
				}
				break;
			case T__6:
				{
				setState(202);
				memory();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			match(Separator);
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(206);
				register();
				}
				break;
			case Integer:
				{
				setState(207);
				match(Integer);
				}
				break;
			case T__6:
				{
				setState(208);
				memory();
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

	public static class Unuary_exp3Context extends ParserRuleContext {
		public OperatoContext operato() {
			return getRuleContext(OperatoContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MASMParser.Identifier, 0); }
		public Unuary_exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unuary_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterUnuary_exp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitUnuary_exp3(this);
		}
	}

	public final Unuary_exp3Context unuary_exp3() throws RecognitionException {
		Unuary_exp3Context _localctx = new Unuary_exp3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_unuary_exp3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			operato();
			setState(212);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_exp4Context extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public Binary_exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp4(this);
		}
	}

	public final Binary_exp4Context binary_exp4() throws RecognitionException {
		Binary_exp4Context _localctx = new Binary_exp4Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_binary_exp4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			operator();
			setState(215);
			register();
			setState(216);
			match(Separator);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(217);
				register();
				}
				break;
			case T__6:
				{
				setState(218);
				memory();
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

	public static class Binary_exp5Context extends ParserRuleContext {
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public Binary_exp5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp5(this);
		}
	}

	public final Binary_exp5Context binary_exp5() throws RecognitionException {
		Binary_exp5Context _localctx = new Binary_exp5Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_binary_exp5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			l();
			setState(222);
			register();
			setState(223);
			match(Separator);
			setState(224);
			memory();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_exp6Context extends ParserRuleContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public Binary_exp6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp6(this);
		}
	}

	public final Binary_exp6Context binary_exp6() throws RecognitionException {
		Binary_exp6Context _localctx = new Binary_exp6Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_binary_exp6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			x();
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(227);
				register();
				}
				break;
			case T__6:
				{
				setState(228);
				memory();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			match(Separator);
			setState(232);
			register();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_exp7Context extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public Binary_exp7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp7(this);
		}
	}

	public final Binary_exp7Context binary_exp7() throws RecognitionException {
		Binary_exp7Context _localctx = new Binary_exp7Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_exp7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			s();
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(235);
				register();
				}
				break;
			case T__6:
				{
				setState(236);
				memory();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			match(Separator);
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				setState(240);
				match(Integer);
				}
				break;
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(241);
				register();
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

	public static class Binary_exp8Context extends ParserRuleContext {
		public ShContext sh() {
			return getRuleContext(ShContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(MASMParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(MASMParser.Separator, i);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public Binary_exp8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp8(this);
		}
	}

	public final Binary_exp8Context binary_exp8() throws RecognitionException {
		Binary_exp8Context _localctx = new Binary_exp8Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_binary_exp8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			sh();
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(245);
				register();
				}
				break;
			case T__6:
				{
				setState(246);
				memory();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
			match(Separator);
			setState(250);
			register();
			setState(251);
			match(Separator);
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(252);
				register();
				}
				break;
			case Integer:
				{
				setState(253);
				match(Integer);
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

	public static class Binary_exp9Context extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public List<MemoryContext> memory() {
			return getRuleContexts(MemoryContext.class);
		}
		public MemoryContext memory(int i) {
			return getRuleContext(MemoryContext.class,i);
		}
		public Binary_exp9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp9(this);
		}
	}

	public final Binary_exp9Context binary_exp9() throws RecognitionException {
		Binary_exp9Context _localctx = new Binary_exp9Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_binary_exp9);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			b();
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(257);
				register();
				}
				break;
			case T__6:
				{
				setState(258);
				memory();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(261);
			match(Separator);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(262);
				register();
				}
				break;
			case T__6:
				{
				setState(263);
				memory();
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

	public static class Unuary_exp4Context extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public Unuary_exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unuary_exp4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterUnuary_exp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitUnuary_exp4(this);
		}
	}

	public final Unuary_exp4Context unuary_exp4() throws RecognitionException {
		Unuary_exp4Context _localctx = new Unuary_exp4Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_unuary_exp4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			call();
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(267);
				register();
				}
				break;
			case T__6:
				{
				setState(268);
				memory();
				}
				break;
			case Integer:
				{
				setState(269);
				match(Integer);
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

	public static class Unuary_exp5Context extends ParserRuleContext {
		public InterruptionContext interruption() {
			return getRuleContext(InterruptionContext.class,0);
		}
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public Unuary_exp5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unuary_exp5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterUnuary_exp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitUnuary_exp5(this);
		}
	}

	public final Unuary_exp5Context unuary_exp5() throws RecognitionException {
		Unuary_exp5Context _localctx = new Unuary_exp5Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_unuary_exp5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			interruption();
			setState(273);
			match(Integer);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_exp10Context extends ParserRuleContext {
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public Binary_exp10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp10(this);
		}
	}

	public final Binary_exp10Context binary_exp10() throws RecognitionException {
		Binary_exp10Context _localctx = new Binary_exp10Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_binary_exp10);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			in();
			setState(276);
			register();
			setState(277);
			match(Separator);
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(278);
				register();
				}
				break;
			case Integer:
				{
				setState(279);
				match(Integer);
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

	public static class Binary_exp11Context extends ParserRuleContext {
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public TerminalNode Separator() { return getToken(MASMParser.Separator, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public Binary_exp11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp11(this);
		}
	}

	public final Binary_exp11Context binary_exp11() throws RecognitionException {
		Binary_exp11Context _localctx = new Binary_exp11Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_binary_exp11);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			out();
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(283);
				register();
				}
				break;
			case Integer:
				{
				setState(284);
				match(Integer);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
			match(Separator);
			setState(288);
			register();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_exp12Context extends ParserRuleContext {
		public ReContext re() {
			return getRuleContext(ReContext.class,0);
		}
		public OperaContext opera() {
			return getRuleContext(OperaContext.class,0);
		}
		public Binary_exp12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_exp12; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterBinary_exp12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitBinary_exp12(this);
		}
	}

	public final Binary_exp12Context binary_exp12() throws RecognitionException {
		Binary_exp12Context _localctx = new Binary_exp12Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_binary_exp12);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			re();
			setState(291);
			opera();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directive_exp1Context extends ParserRuleContext {
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MASMParser.Identifier, 0); }
		public Directive_exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterDirective_exp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitDirective_exp1(this);
		}
	}

	public final Directive_exp1Context directive_exp1() throws RecognitionException {
		Directive_exp1Context _localctx = new Directive_exp1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_directive_exp1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(293);
				directives();
				setState(294);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(296);
				directives();
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MASMParser.Identifier, 0); }
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public TerminalNode String() { return getToken(MASMParser.String, 0); }
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterVariabledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitVariabledeclaration(this);
		}
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variabledeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(Identifier);
			setState(300);
			ty();
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
				{
				setState(301);
				question();
				}
				break;
			case String:
				{
				setState(302);
				match(String);
				}
				break;
			case Integer:
				{
				setState(303);
				match(Integer);
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

	public static class MemoryContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MASMParser.Identifier, 0); }
		public TerminalNode Integer() { return getToken(MASMParser.Integer, 0); }
		public TerminalNode Hexnum() { return getToken(MASMParser.Hexnum, 0); }
		public TerminalNode Octalnum() { return getToken(MASMParser.Octalnum, 0); }
		public MemoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterMemory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitMemory(this);
		}
	}

	public final MemoryContext memory() throws RecognitionException {
		MemoryContext _localctx = new MemoryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__6);
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AH:
			case AL:
			case AX:
			case BH:
			case BL:
			case BX:
			case CH:
			case CL:
			case CX:
			case DH:
			case DL:
			case DX:
			case SI:
			case DI:
			case SP:
			case BP:
			case EAX:
			case EBX:
			case ECX:
			case EDX:
			case ESI:
			case EDI:
			case ESP:
			case EBP:
				{
				setState(307);
				register();
				}
				break;
			case Identifier:
				{
				setState(308);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(311);
				match(T__7);
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AH:
				case AL:
				case AX:
				case BH:
				case BL:
				case BX:
				case CH:
				case CL:
				case CX:
				case DH:
				case DL:
				case DX:
				case SI:
				case DI:
				case SP:
				case BP:
				case EAX:
				case EBX:
				case ECX:
				case EDX:
				case ESI:
				case EDI:
				case ESP:
				case EBP:
					{
					{
					setState(312);
					register();
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(313);
						match(T__7);
						setState(314);
						_la = _input.LA(1);
						if ( !(((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (Hexnum - 266)) | (1L << (Integer - 266)) | (1L << (Octalnum - 266)))) != 0)) ) {
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
					break;
				case Integer:
					{
					setState(317);
					match(Integer);
					}
					break;
				case Hexnum:
					{
					setState(318);
					match(Hexnum);
					}
					break;
				case Octalnum:
					{
					setState(319);
					match(Octalnum);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(324);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentosContext extends ParserRuleContext {
		public TerminalNode DS() { return getToken(MASMParser.DS, 0); }
		public TerminalNode ES() { return getToken(MASMParser.ES, 0); }
		public TerminalNode CS() { return getToken(MASMParser.CS, 0); }
		public TerminalNode SS() { return getToken(MASMParser.SS, 0); }
		public TerminalNode GS() { return getToken(MASMParser.GS, 0); }
		public TerminalNode FS() { return getToken(MASMParser.FS, 0); }
		public SegmentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterSegmentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitSegmentos(this);
		}
	}

	public final SegmentosContext segmentos() throws RecognitionException {
		SegmentosContext _localctx = new SegmentosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_segmentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DS) | (1L << ES) | (1L << CS) | (1L << SS) | (1L << GS) | (1L << FS))) != 0)) ) {
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

	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode AH() { return getToken(MASMParser.AH, 0); }
		public TerminalNode AL() { return getToken(MASMParser.AL, 0); }
		public TerminalNode AX() { return getToken(MASMParser.AX, 0); }
		public TerminalNode BH() { return getToken(MASMParser.BH, 0); }
		public TerminalNode BL() { return getToken(MASMParser.BL, 0); }
		public TerminalNode BX() { return getToken(MASMParser.BX, 0); }
		public TerminalNode CH() { return getToken(MASMParser.CH, 0); }
		public TerminalNode CL() { return getToken(MASMParser.CL, 0); }
		public TerminalNode CX() { return getToken(MASMParser.CX, 0); }
		public TerminalNode DH() { return getToken(MASMParser.DH, 0); }
		public TerminalNode DL() { return getToken(MASMParser.DL, 0); }
		public TerminalNode DX() { return getToken(MASMParser.DX, 0); }
		public TerminalNode SI() { return getToken(MASMParser.SI, 0); }
		public TerminalNode DI() { return getToken(MASMParser.DI, 0); }
		public TerminalNode SP() { return getToken(MASMParser.SP, 0); }
		public TerminalNode BP() { return getToken(MASMParser.BP, 0); }
		public TerminalNode EAX() { return getToken(MASMParser.EAX, 0); }
		public TerminalNode EBX() { return getToken(MASMParser.EBX, 0); }
		public TerminalNode ECX() { return getToken(MASMParser.ECX, 0); }
		public TerminalNode EDX() { return getToken(MASMParser.EDX, 0); }
		public TerminalNode ESI() { return getToken(MASMParser.ESI, 0); }
		public TerminalNode EDI() { return getToken(MASMParser.EDI, 0); }
		public TerminalNode ESP() { return getToken(MASMParser.ESP, 0); }
		public TerminalNode EBP() { return getToken(MASMParser.EBP, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AH) | (1L << AL) | (1L << AX) | (1L << BH) | (1L << BL) | (1L << BX) | (1L << CH) | (1L << CL) | (1L << CX) | (1L << DH) | (1L << DL) | (1L << DX) | (1L << SI) | (1L << DI) | (1L << SP) | (1L << BP) | (1L << EAX) | (1L << EBX) | (1L << ECX) | (1L << EDX) | (1L << ESI) | (1L << EDI) | (1L << ESP) | (1L << EBP))) != 0)) ) {
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

	public static class OContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(MASMParser.MOV, 0); }
		public TerminalNode CMP() { return getToken(MASMParser.CMP, 0); }
		public TerminalNode TEST() { return getToken(MASMParser.TEST, 0); }
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitO(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOV) | (1L << CMP) | (1L << TEST))) != 0)) ) {
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(MASMParser.PUSH, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(PUSH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpeContext extends ParserRuleContext {
		public TerminalNode POP() { return getToken(MASMParser.POP, 0); }
		public TerminalNode IDIV() { return getToken(MASMParser.IDIV, 0); }
		public TerminalNode INC() { return getToken(MASMParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MASMParser.DEC, 0); }
		public TerminalNode NEG() { return getToken(MASMParser.NEG, 0); }
		public TerminalNode MUL() { return getToken(MASMParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MASMParser.DIV, 0); }
		public TerminalNode IMUL() { return getToken(MASMParser.IMUL, 0); }
		public TerminalNode NOT() { return getToken(MASMParser.NOT, 0); }
		public TerminalNode SETPO() { return getToken(MASMParser.SETPO, 0); }
		public TerminalNode SETAE() { return getToken(MASMParser.SETAE, 0); }
		public TerminalNode SETNLE() { return getToken(MASMParser.SETNLE, 0); }
		public TerminalNode SETC() { return getToken(MASMParser.SETC, 0); }
		public TerminalNode SETNO() { return getToken(MASMParser.SETNO, 0); }
		public TerminalNode SETNB() { return getToken(MASMParser.SETNB, 0); }
		public TerminalNode SETP() { return getToken(MASMParser.SETP, 0); }
		public TerminalNode SETNGE() { return getToken(MASMParser.SETNGE, 0); }
		public TerminalNode SETL() { return getToken(MASMParser.SETL, 0); }
		public TerminalNode SETGE() { return getToken(MASMParser.SETGE, 0); }
		public TerminalNode SETPE() { return getToken(MASMParser.SETPE, 0); }
		public TerminalNode SETNL() { return getToken(MASMParser.SETNL, 0); }
		public TerminalNode SETNZ() { return getToken(MASMParser.SETNZ, 0); }
		public TerminalNode SETNE() { return getToken(MASMParser.SETNE, 0); }
		public TerminalNode SETNC() { return getToken(MASMParser.SETNC, 0); }
		public TerminalNode SETBE() { return getToken(MASMParser.SETBE, 0); }
		public TerminalNode SETNP() { return getToken(MASMParser.SETNP, 0); }
		public TerminalNode SETNS() { return getToken(MASMParser.SETNS, 0); }
		public TerminalNode SETO() { return getToken(MASMParser.SETO, 0); }
		public TerminalNode SETNA() { return getToken(MASMParser.SETNA, 0); }
		public TerminalNode SETNAE() { return getToken(MASMParser.SETNAE, 0); }
		public TerminalNode SETZ() { return getToken(MASMParser.SETZ, 0); }
		public TerminalNode SETLE() { return getToken(MASMParser.SETLE, 0); }
		public TerminalNode SETNBE() { return getToken(MASMParser.SETNBE, 0); }
		public TerminalNode SETS() { return getToken(MASMParser.SETS, 0); }
		public TerminalNode SETE() { return getToken(MASMParser.SETE, 0); }
		public TerminalNode SETB() { return getToken(MASMParser.SETB, 0); }
		public TerminalNode SETA() { return getToken(MASMParser.SETA, 0); }
		public TerminalNode SETG() { return getToken(MASMParser.SETG, 0); }
		public TerminalNode SETNG() { return getToken(MASMParser.SETNG, 0); }
		public OpeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOpe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOpe(this);
		}
	}

	public final OpeContext ope() throws RecognitionException {
		OpeContext _localctx = new OpeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (POP - 45)) | (1L << (IDIV - 45)) | (1L << (INC - 45)) | (1L << (DEC - 45)) | (1L << (NEG - 45)) | (1L << (MUL - 45)) | (1L << (DIV - 45)) | (1L << (IMUL - 45)) | (1L << (NOT - 45)) | (1L << (SETPO - 45)) | (1L << (SETAE - 45)) | (1L << (SETNLE - 45)) | (1L << (SETC - 45)) | (1L << (SETNO - 45)) | (1L << (SETNB - 45)) | (1L << (SETP - 45)) | (1L << (SETNGE - 45)) | (1L << (SETL - 45)) | (1L << (SETGE - 45)) | (1L << (SETPE - 45)) | (1L << (SETNL - 45)) | (1L << (SETNZ - 45)) | (1L << (SETNE - 45)) | (1L << (SETNC - 45)) | (1L << (SETBE - 45)) | (1L << (SETNP - 45)) | (1L << (SETNS - 45)) | (1L << (SETO - 45)) | (1L << (SETNA - 45)) | (1L << (SETNAE - 45)) | (1L << (SETZ - 45)) | (1L << (SETLE - 45)) | (1L << (SETNBE - 45)) | (1L << (SETS - 45)) | (1L << (SETE - 45)) | (1L << (SETB - 45)) | (1L << (SETA - 45)) | (1L << (SETG - 45)) | (1L << (SETNG - 45)))) != 0)) ) {
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

	public static class OperContext extends ParserRuleContext {
		public TerminalNode XCHG() { return getToken(MASMParser.XCHG, 0); }
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOper(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(XCHG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperaContext extends ParserRuleContext {
		public TerminalNode POPAD() { return getToken(MASMParser.POPAD, 0); }
		public TerminalNode AAA() { return getToken(MASMParser.AAA, 0); }
		public TerminalNode POPA() { return getToken(MASMParser.POPA, 0); }
		public TerminalNode POPFD() { return getToken(MASMParser.POPFD, 0); }
		public TerminalNode CWD() { return getToken(MASMParser.CWD, 0); }
		public TerminalNode LAHF() { return getToken(MASMParser.LAHF, 0); }
		public TerminalNode PUSHAD() { return getToken(MASMParser.PUSHAD, 0); }
		public TerminalNode PUSHF() { return getToken(MASMParser.PUSHF, 0); }
		public TerminalNode AAS() { return getToken(MASMParser.AAS, 0); }
		public TerminalNode BSWAP() { return getToken(MASMParser.BSWAP, 0); }
		public TerminalNode PUSHFD() { return getToken(MASMParser.PUSHFD, 0); }
		public TerminalNode CBW() { return getToken(MASMParser.CBW, 0); }
		public TerminalNode CWDE() { return getToken(MASMParser.CWDE, 0); }
		public TerminalNode XLAT() { return getToken(MASMParser.XLAT, 0); }
		public TerminalNode AAM() { return getToken(MASMParser.AAM, 0); }
		public TerminalNode AAD() { return getToken(MASMParser.AAD, 0); }
		public TerminalNode CDQ() { return getToken(MASMParser.CDQ, 0); }
		public TerminalNode DAA() { return getToken(MASMParser.DAA, 0); }
		public TerminalNode SAHF() { return getToken(MASMParser.SAHF, 0); }
		public TerminalNode DAS() { return getToken(MASMParser.DAS, 0); }
		public TerminalNode INTO() { return getToken(MASMParser.INTO, 0); }
		public TerminalNode IRET() { return getToken(MASMParser.IRET, 0); }
		public TerminalNode CLC() { return getToken(MASMParser.CLC, 0); }
		public TerminalNode STC() { return getToken(MASMParser.STC, 0); }
		public TerminalNode CMC() { return getToken(MASMParser.CMC, 0); }
		public TerminalNode CLD() { return getToken(MASMParser.CLD, 0); }
		public TerminalNode STD() { return getToken(MASMParser.STD, 0); }
		public TerminalNode CLI() { return getToken(MASMParser.CLI, 0); }
		public TerminalNode STI() { return getToken(MASMParser.STI, 0); }
		public TerminalNode MOVSB() { return getToken(MASMParser.MOVSB, 0); }
		public TerminalNode MOVSW() { return getToken(MASMParser.MOVSW, 0); }
		public TerminalNode MOVSD() { return getToken(MASMParser.MOVSD, 0); }
		public TerminalNode LODS() { return getToken(MASMParser.LODS, 0); }
		public TerminalNode LODSB() { return getToken(MASMParser.LODSB, 0); }
		public TerminalNode LODSW() { return getToken(MASMParser.LODSW, 0); }
		public TerminalNode LODSD() { return getToken(MASMParser.LODSD, 0); }
		public TerminalNode STOS() { return getToken(MASMParser.STOS, 0); }
		public TerminalNode STOSB() { return getToken(MASMParser.STOSB, 0); }
		public TerminalNode STOSW() { return getToken(MASMParser.STOSW, 0); }
		public TerminalNode SOTSD() { return getToken(MASMParser.SOTSD, 0); }
		public TerminalNode SCAS() { return getToken(MASMParser.SCAS, 0); }
		public TerminalNode SCASB() { return getToken(MASMParser.SCASB, 0); }
		public TerminalNode SCASW() { return getToken(MASMParser.SCASW, 0); }
		public TerminalNode SCASD() { return getToken(MASMParser.SCASD, 0); }
		public TerminalNode CMPS() { return getToken(MASMParser.CMPS, 0); }
		public TerminalNode CMPSB() { return getToken(MASMParser.CMPSB, 0); }
		public TerminalNode CMPSW() { return getToken(MASMParser.CMPSW, 0); }
		public TerminalNode CMPSD() { return getToken(MASMParser.CMPSD, 0); }
		public TerminalNode INSB() { return getToken(MASMParser.INSB, 0); }
		public TerminalNode INSW() { return getToken(MASMParser.INSW, 0); }
		public TerminalNode INSD() { return getToken(MASMParser.INSD, 0); }
		public TerminalNode OUTSB() { return getToken(MASMParser.OUTSB, 0); }
		public TerminalNode OUTSW() { return getToken(MASMParser.OUTSW, 0); }
		public TerminalNode OUTSD() { return getToken(MASMParser.OUTSD, 0); }
		public OperaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOpera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOpera(this);
		}
	}

	public final OperaContext opera() throws RecognitionException {
		OperaContext _localctx = new OperaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (POPAD - 85)) | (1L << (AAA - 85)) | (1L << (POPA - 85)) | (1L << (POPFD - 85)) | (1L << (CWD - 85)) | (1L << (LAHF - 85)) | (1L << (PUSHAD - 85)) | (1L << (PUSHF - 85)) | (1L << (AAS - 85)) | (1L << (BSWAP - 85)) | (1L << (PUSHFD - 85)) | (1L << (CBW - 85)) | (1L << (CWDE - 85)) | (1L << (XLAT - 85)) | (1L << (AAM - 85)) | (1L << (AAD - 85)) | (1L << (CDQ - 85)) | (1L << (DAA - 85)) | (1L << (SAHF - 85)) | (1L << (DAS - 85)) | (1L << (INTO - 85)) | (1L << (IRET - 85)) | (1L << (CLC - 85)) | (1L << (STC - 85)) | (1L << (CMC - 85)) | (1L << (CLD - 85)) | (1L << (STD - 85)) | (1L << (CLI - 85)) | (1L << (STI - 85)) | (1L << (MOVSB - 85)) | (1L << (MOVSW - 85)) | (1L << (MOVSD - 85)) | (1L << (LODS - 85)) | (1L << (LODSB - 85)) | (1L << (LODSW - 85)) | (1L << (LODSD - 85)) | (1L << (STOS - 85)) | (1L << (STOSB - 85)) | (1L << (STOSW - 85)) | (1L << (SOTSD - 85)) | (1L << (SCAS - 85)) | (1L << (SCASB - 85)) | (1L << (SCASW - 85)) | (1L << (SCASD - 85)) | (1L << (CMPS - 85)) | (1L << (CMPSB - 85)) | (1L << (CMPSW - 85)) | (1L << (CMPSD - 85)) | (1L << (INSB - 85)) | (1L << (INSW - 85)) | (1L << (INSD - 85)) | (1L << (OUTSB - 85)) | (1L << (OUTSW - 85)) | (1L << (OUTSD - 85)))) != 0)) ) {
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

	public static class OperatContext extends ParserRuleContext {
		public TerminalNode ADC() { return getToken(MASMParser.ADC, 0); }
		public TerminalNode ADD() { return getToken(MASMParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MASMParser.SUB, 0); }
		public TerminalNode CBB() { return getToken(MASMParser.CBB, 0); }
		public TerminalNode XOR() { return getToken(MASMParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MASMParser.OR, 0); }
		public OperatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOperat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOperat(this);
		}
	}

	public final OperatContext operat() throws RecognitionException {
		OperatContext _localctx = new OperatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ADC - 139)) | (1L << (ADD - 139)) | (1L << (SUB - 139)) | (1L << (CBB - 139)) | (1L << (XOR - 139)) | (1L << (OR - 139)))) != 0)) ) {
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

	public static class OperatoContext extends ParserRuleContext {
		public TerminalNode JNBE() { return getToken(MASMParser.JNBE, 0); }
		public TerminalNode JNZ() { return getToken(MASMParser.JNZ, 0); }
		public TerminalNode JPO() { return getToken(MASMParser.JPO, 0); }
		public TerminalNode JZ() { return getToken(MASMParser.JZ, 0); }
		public TerminalNode JS() { return getToken(MASMParser.JS, 0); }
		public TerminalNode LOOPNZ() { return getToken(MASMParser.LOOPNZ, 0); }
		public TerminalNode JGE() { return getToken(MASMParser.JGE, 0); }
		public TerminalNode JB() { return getToken(MASMParser.JB, 0); }
		public TerminalNode JNB() { return getToken(MASMParser.JNB, 0); }
		public TerminalNode JO() { return getToken(MASMParser.JO, 0); }
		public TerminalNode JP() { return getToken(MASMParser.JP, 0); }
		public TerminalNode JNO() { return getToken(MASMParser.JNO, 0); }
		public TerminalNode JNL() { return getToken(MASMParser.JNL, 0); }
		public TerminalNode JNAE() { return getToken(MASMParser.JNAE, 0); }
		public TerminalNode LOOPZ() { return getToken(MASMParser.LOOPZ, 0); }
		public TerminalNode JMP() { return getToken(MASMParser.JMP, 0); }
		public TerminalNode JNP() { return getToken(MASMParser.JNP, 0); }
		public TerminalNode LOOP() { return getToken(MASMParser.LOOP, 0); }
		public TerminalNode JL() { return getToken(MASMParser.JL, 0); }
		public TerminalNode JCXZ() { return getToken(MASMParser.JCXZ, 0); }
		public TerminalNode JAE() { return getToken(MASMParser.JAE, 0); }
		public TerminalNode JNGE() { return getToken(MASMParser.JNGE, 0); }
		public TerminalNode JA() { return getToken(MASMParser.JA, 0); }
		public TerminalNode LOOPNE() { return getToken(MASMParser.LOOPNE, 0); }
		public TerminalNode LOOPE() { return getToken(MASMParser.LOOPE, 0); }
		public TerminalNode JG() { return getToken(MASMParser.JG, 0); }
		public TerminalNode JNLE() { return getToken(MASMParser.JNLE, 0); }
		public TerminalNode JE() { return getToken(MASMParser.JE, 0); }
		public TerminalNode JNC() { return getToken(MASMParser.JNC, 0); }
		public TerminalNode JC() { return getToken(MASMParser.JC, 0); }
		public TerminalNode JNA() { return getToken(MASMParser.JNA, 0); }
		public TerminalNode JBE() { return getToken(MASMParser.JBE, 0); }
		public TerminalNode JLE() { return getToken(MASMParser.JLE, 0); }
		public TerminalNode JPE() { return getToken(MASMParser.JPE, 0); }
		public TerminalNode JNS() { return getToken(MASMParser.JNS, 0); }
		public TerminalNode JECXZ() { return getToken(MASMParser.JECXZ, 0); }
		public TerminalNode JNG() { return getToken(MASMParser.JNG, 0); }
		public OperatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOperato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOperato(this);
		}
	}

	public final OperatoContext operato() throws RecognitionException {
		OperatoContext _localctx = new OperatoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (JNBE - 145)) | (1L << (JNZ - 145)) | (1L << (JPO - 145)) | (1L << (JZ - 145)) | (1L << (JS - 145)) | (1L << (LOOPNZ - 145)) | (1L << (JGE - 145)) | (1L << (JB - 145)) | (1L << (JNB - 145)) | (1L << (JO - 145)) | (1L << (JP - 145)) | (1L << (JNO - 145)) | (1L << (JNL - 145)) | (1L << (JNAE - 145)) | (1L << (LOOPZ - 145)) | (1L << (JMP - 145)) | (1L << (JNP - 145)) | (1L << (LOOP - 145)) | (1L << (JL - 145)) | (1L << (JCXZ - 145)) | (1L << (JAE - 145)) | (1L << (JNGE - 145)) | (1L << (JA - 145)) | (1L << (LOOPNE - 145)) | (1L << (LOOPE - 145)) | (1L << (JG - 145)) | (1L << (JNLE - 145)) | (1L << (JE - 145)) | (1L << (JNC - 145)) | (1L << (JC - 145)) | (1L << (JNA - 145)) | (1L << (JBE - 145)) | (1L << (JLE - 145)) | (1L << (JPE - 145)) | (1L << (JNS - 145)) | (1L << (JECXZ - 145)) | (1L << (JNG - 145)))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode MOVZX() { return getToken(MASMParser.MOVZX, 0); }
		public TerminalNode BSF() { return getToken(MASMParser.BSF, 0); }
		public TerminalNode BSR() { return getToken(MASMParser.BSR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !(((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (MOVZX - 182)) | (1L << (BSF - 182)) | (1L << (BSR - 182)))) != 0)) ) {
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

	public static class LContext extends ParserRuleContext {
		public TerminalNode LES() { return getToken(MASMParser.LES, 0); }
		public TerminalNode LEA() { return getToken(MASMParser.LEA, 0); }
		public TerminalNode LDS() { return getToken(MASMParser.LDS, 0); }
		public TerminalNode INS() { return getToken(MASMParser.INS, 0); }
		public TerminalNode OUTS() { return getToken(MASMParser.OUTS, 0); }
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_l);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (LES - 185)) | (1L << (LEA - 185)) | (1L << (LDS - 185)) | (1L << (INS - 185)) | (1L << (OUTS - 185)))) != 0)) ) {
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

	public static class XContext extends ParserRuleContext {
		public TerminalNode XADD() { return getToken(MASMParser.XADD, 0); }
		public TerminalNode CMPXCHG() { return getToken(MASMParser.CMPXCHG, 0); }
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(_la==XADD || _la==CMPXCHG) ) {
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode SHL() { return getToken(MASMParser.SHL, 0); }
		public TerminalNode SHR() { return getToken(MASMParser.SHR, 0); }
		public TerminalNode ROR() { return getToken(MASMParser.ROR, 0); }
		public TerminalNode ROL() { return getToken(MASMParser.ROL, 0); }
		public TerminalNode RCL() { return getToken(MASMParser.RCL, 0); }
		public TerminalNode SAL() { return getToken(MASMParser.SAL, 0); }
		public TerminalNode RCR() { return getToken(MASMParser.RCR, 0); }
		public TerminalNode SAR() { return getToken(MASMParser.SAR, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SHL - 192)) | (1L << (SHR - 192)) | (1L << (ROR - 192)) | (1L << (ROL - 192)) | (1L << (RCL - 192)) | (1L << (SAL - 192)) | (1L << (RCR - 192)) | (1L << (SAR - 192)))) != 0)) ) {
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

	public static class ShContext extends ParserRuleContext {
		public TerminalNode SHRD() { return getToken(MASMParser.SHRD, 0); }
		public TerminalNode SHLD() { return getToken(MASMParser.SHLD, 0); }
		public ShContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterSh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitSh(this);
		}
	}

	public final ShContext sh() throws RecognitionException {
		ShContext _localctx = new ShContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sh);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==SHRD || _la==SHLD) ) {
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

	public static class BContext extends ParserRuleContext {
		public TerminalNode BTR() { return getToken(MASMParser.BTR, 0); }
		public TerminalNode BT() { return getToken(MASMParser.BT, 0); }
		public TerminalNode BTC() { return getToken(MASMParser.BTC, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & ((1L << (BTR - 202)) | (1L << (BT - 202)) | (1L << (BTC - 202)))) != 0)) ) {
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(MASMParser.CALL, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(CALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterruptionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MASMParser.INT, 0); }
		public TerminalNode RETN() { return getToken(MASMParser.RETN, 0); }
		public TerminalNode RET() { return getToken(MASMParser.RET, 0); }
		public TerminalNode RETF() { return getToken(MASMParser.RETF, 0); }
		public InterruptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interruption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterInterruption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitInterruption(this);
		}
	}

	public final InterruptionContext interruption() throws RecognitionException {
		InterruptionContext _localctx = new InterruptionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interruption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (INT - 206)) | (1L << (RETN - 206)) | (1L << (RET - 206)) | (1L << (RETF - 206)))) != 0)) ) {
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

	public static class InContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(MASMParser.IN, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitIn(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(IN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(MASMParser.OUT, 0); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitOut(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(OUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(MASMParser.REP, 0); }
		public TerminalNode REPE() { return getToken(MASMParser.REPE, 0); }
		public TerminalNode REPZ() { return getToken(MASMParser.REPZ, 0); }
		public TerminalNode REPNE() { return getToken(MASMParser.REPNE, 0); }
		public TerminalNode REPNZ() { return getToken(MASMParser.REPNZ, 0); }
		public ReContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_re; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterRe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitRe(this);
		}
	}

	public final ReContext re() throws RecognitionException {
		ReContext _localctx = new ReContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_re);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (REP - 212)) | (1L << (REPE - 212)) | (1L << (REPZ - 212)) | (1L << (REPNE - 212)) | (1L << (REPNZ - 212)))) != 0)) ) {
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

	public static class DirectivesContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(MASMParser.ALPHA, 0); }
		public TerminalNode CONST() { return getToken(MASMParser.CONST, 0); }
		public TerminalNode CREF() { return getToken(MASMParser.CREF, 0); }
		public TerminalNode XCREF() { return getToken(MASMParser.XCREF, 0); }
		public TerminalNode DATA() { return getToken(MASMParser.DATA, 0); }
		public TerminalNode DATA2() { return getToken(MASMParser.DATA2, 0); }
		public TerminalNode DOSSEG() { return getToken(MASMParser.DOSSEG, 0); }
		public TerminalNode ERR() { return getToken(MASMParser.ERR, 0); }
		public TerminalNode ERR1() { return getToken(MASMParser.ERR1, 0); }
		public TerminalNode ERR2() { return getToken(MASMParser.ERR2, 0); }
		public TerminalNode ERRE() { return getToken(MASMParser.ERRE, 0); }
		public TerminalNode ERRNZ() { return getToken(MASMParser.ERRNZ, 0); }
		public TerminalNode ERRDEF() { return getToken(MASMParser.ERRDEF, 0); }
		public TerminalNode ERRNDEF() { return getToken(MASMParser.ERRNDEF, 0); }
		public TerminalNode ERRB() { return getToken(MASMParser.ERRB, 0); }
		public TerminalNode ERRNB() { return getToken(MASMParser.ERRNB, 0); }
		public TerminalNode ERRIDN() { return getToken(MASMParser.ERRIDN, 0); }
		public TerminalNode ERRDIF() { return getToken(MASMParser.ERRDIF, 0); }
		public TerminalNode EVEN() { return getToken(MASMParser.EVEN, 0); }
		public TerminalNode LIST() { return getToken(MASMParser.LIST, 0); }
		public TerminalNode WIDTH() { return getToken(MASMParser.WIDTH, 0); }
		public TerminalNode MASK() { return getToken(MASMParser.MASK, 0); }
		public TerminalNode SEQ() { return getToken(MASMParser.SEQ, 0); }
		public TerminalNode XLIST() { return getToken(MASMParser.XLIST, 0); }
		public TerminalNode EXIT() { return getToken(MASMParser.EXIT, 0); }
		public TerminalNode MODEL() { return getToken(MASMParser.MODEL, 0); }
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterDirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitDirectives(this);
		}
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !(((((_la - 217)) & ~0x3f) == 0 && ((1L << (_la - 217)) & ((1L << (ALPHA - 217)) | (1L << (CONST - 217)) | (1L << (CREF - 217)) | (1L << (XCREF - 217)) | (1L << (DATA - 217)) | (1L << (DATA2 - 217)) | (1L << (DOSSEG - 217)) | (1L << (ERR - 217)) | (1L << (ERR1 - 217)) | (1L << (ERR2 - 217)) | (1L << (ERRE - 217)) | (1L << (ERRNZ - 217)) | (1L << (ERRDEF - 217)) | (1L << (ERRNDEF - 217)) | (1L << (ERRB - 217)) | (1L << (ERRNB - 217)) | (1L << (ERRIDN - 217)) | (1L << (ERRDIF - 217)) | (1L << (EVEN - 217)) | (1L << (LIST - 217)) | (1L << (WIDTH - 217)) | (1L << (MASK - 217)) | (1L << (SEQ - 217)) | (1L << (XLIST - 217)) | (1L << (EXIT - 217)) | (1L << (MODEL - 217)))) != 0)) ) {
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

	public static class TyContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(MASMParser.BYTE, 0); }
		public TerminalNode SBYTE() { return getToken(MASMParser.SBYTE, 0); }
		public TerminalNode DB() { return getToken(MASMParser.DB, 0); }
		public TerminalNode WORD() { return getToken(MASMParser.WORD, 0); }
		public TerminalNode SWORD() { return getToken(MASMParser.SWORD, 0); }
		public TerminalNode DW() { return getToken(MASMParser.DW, 0); }
		public TerminalNode DWORD() { return getToken(MASMParser.DWORD, 0); }
		public TerminalNode SDWORD() { return getToken(MASMParser.SDWORD, 0); }
		public TerminalNode DD() { return getToken(MASMParser.DD, 0); }
		public TerminalNode FWORD() { return getToken(MASMParser.FWORD, 0); }
		public TerminalNode DF() { return getToken(MASMParser.DF, 0); }
		public TerminalNode QWORD() { return getToken(MASMParser.QWORD, 0); }
		public TerminalNode DQ() { return getToken(MASMParser.DQ, 0); }
		public TerminalNode TBYTE() { return getToken(MASMParser.TBYTE, 0); }
		public TerminalNode DT() { return getToken(MASMParser.DT, 0); }
		public TerminalNode REAL4() { return getToken(MASMParser.REAL4, 0); }
		public TerminalNode REAL8() { return getToken(MASMParser.REAL8, 0); }
		public TerminalNode REAL() { return getToken(MASMParser.REAL, 0); }
		public TerminalNode FAR() { return getToken(MASMParser.FAR, 0); }
		public TerminalNode NEAR() { return getToken(MASMParser.NEAR, 0); }
		public TerminalNode PROC() { return getToken(MASMParser.PROC, 0); }
		public TyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterTy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitTy(this);
		}
	}

	public final TyContext ty() throws RecognitionException {
		TyContext _localctx = new TyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (BYTE - 243)) | (1L << (SBYTE - 243)) | (1L << (DB - 243)) | (1L << (WORD - 243)) | (1L << (SWORD - 243)) | (1L << (DW - 243)) | (1L << (DWORD - 243)) | (1L << (SDWORD - 243)) | (1L << (DD - 243)) | (1L << (FWORD - 243)) | (1L << (DF - 243)) | (1L << (QWORD - 243)) | (1L << (DQ - 243)) | (1L << (TBYTE - 243)) | (1L << (DT - 243)) | (1L << (REAL4 - 243)) | (1L << (REAL8 - 243)) | (1L << (REAL - 243)) | (1L << (FAR - 243)) | (1L << (NEAR - 243)) | (1L << (PROC - 243)))) != 0)) ) {
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(MASMParser.QUESTION, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(QUESTION);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TIMES() { return getToken(MASMParser.TIMES, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MASMListener ) ((MASMListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(TIMES);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0114\u0179\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3u\n\3\f\3\16\3"+
		"x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a5\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\5\6\u00ae\n\6\3\7\3\7\3\7\3\7\5\7"+
		"\u00b4\n\7\3\b\3\b\3\b\5\b\u00b9\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00c0\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00c7\n\t\3\n\3\n\3\13\3\13\3\13\5\13\u00ce\n"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00d4\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00de\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00e8\n"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00f0\n\20\3\20\3\20\3\20\5\20"+
		"\u00f5\n\20\3\21\3\21\3\21\5\21\u00fa\n\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0101\n\21\3\22\3\22\3\22\5\22\u0106\n\22\3\22\3\22\3\22\5\22\u010b"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u0111\n\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u011b\n\25\3\26\3\26\3\26\5\26\u0120\n\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u012c\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0133\n\31\3\32\3\32\3\32\5\32\u0138\n\32\3\32\3\32\3"+
		"\32\3\32\5\32\u013e\n\32\3\32\3\32\3\32\5\32\u0143\n\32\5\32\u0145\n\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\2\2\63\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`b\2\24\3\2\u010c\u010e\3\2\r\22\3\2\23*\3\2+-\3\2/U\3\2W\u008c"+
		"\3\2\u008d\u0092\3\2\u0093\u00b7\3\2\u00b8\u00ba\3\2\u00bb\u00bf\3\2\u00c0"+
		"\u00c1\3\2\u00c2\u00c9\3\2\u00ca\u00cb\3\2\u00cc\u00ce\3\2\u00d0\u00d3"+
		"\3\2\u00d6\u00da\3\2\u00db\u00f4\3\2\u00f5\u0109\2\u0180\2h\3\2\2\2\4"+
		"n\3\2\2\2\6|\3\2\2\2\b\u009c\3\2\2\2\n\u00ad\3\2\2\2\f\u00af\3\2\2\2\16"+
		"\u00b5\3\2\2\2\20\u00c6\3\2\2\2\22\u00c8\3\2\2\2\24\u00ca\3\2\2\2\26\u00d5"+
		"\3\2\2\2\30\u00d8\3\2\2\2\32\u00df\3\2\2\2\34\u00e4\3\2\2\2\36\u00ec\3"+
		"\2\2\2 \u00f6\3\2\2\2\"\u0102\3\2\2\2$\u010c\3\2\2\2&\u0112\3\2\2\2(\u0115"+
		"\3\2\2\2*\u011c\3\2\2\2,\u0124\3\2\2\2.\u012b\3\2\2\2\60\u012d\3\2\2\2"+
		"\62\u0134\3\2\2\2\64\u0148\3\2\2\2\66\u014a\3\2\2\28\u014c\3\2\2\2:\u014e"+
		"\3\2\2\2<\u0150\3\2\2\2>\u0152\3\2\2\2@\u0154\3\2\2\2B\u0156\3\2\2\2D"+
		"\u0158\3\2\2\2F\u015a\3\2\2\2H\u015c\3\2\2\2J\u015e\3\2\2\2L\u0160\3\2"+
		"\2\2N\u0162\3\2\2\2P\u0164\3\2\2\2R\u0166\3\2\2\2T\u0168\3\2\2\2V\u016a"+
		"\3\2\2\2X\u016c\3\2\2\2Z\u016e\3\2\2\2\\\u0170\3\2\2\2^\u0172\3\2\2\2"+
		"`\u0174\3\2\2\2b\u0176\3\2\2\2dg\5\4\3\2eg\5.\30\2fd\3\2\2\2fe\3\2\2\2"+
		"gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\3\2\2lm\7\f\2\2"+
		"m\3\3\2\2\2no\7\f\2\2op\7\4\2\2pq\7\5\2\2qv\7\6\2\2ru\5\b\5\2su\5\6\4"+
		"\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2"+
		"\2yz\7\f\2\2z{\7\7\2\2{\5\3\2\2\2|}\7\f\2\2}\u0081\7\u0109\2\2~\u0080"+
		"\5\b\5\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\u00d2\2"+
		"\2\u0085\u0086\7\f\2\2\u0086\u0087\7\b\2\2\u0087\7\3\2\2\2\u0088\u009d"+
		"\5\n\6\2\u0089\u009d\5(\25\2\u008a\u009d\5*\26\2\u008b\u009d\5,\27\2\u008c"+
		"\u009d\5\20\t\2\u008d\u009d\5\24\13\2\u008e\u009d\5\30\r\2\u008f\u009d"+
		"\5\32\16\2\u0090\u009d\5\34\17\2\u0091\u009d\5\36\20\2\u0092\u009d\5 "+
		"\21\2\u0093\u009d\5\"\22\2\u0094\u009d\5\f\7\2\u0095\u009d\5\16\b\2\u0096"+
		"\u009d\5\26\f\2\u0097\u009d\5$\23\2\u0098\u009d\5&\24\2\u0099\u009d\5"+
		"\22\n\2\u009a\u009d\5\60\31\2\u009b\u009d\5.\30\2\u009c\u0088\3\2\2\2"+
		"\u009c\u0089\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u008b\3\2\2\2\u009c\u008c"+
		"\3\2\2\2\u009c\u008d\3\2\2\2\u009c\u008e\3\2\2\2\u009c\u008f\3\2\2\2\u009c"+
		"\u0090\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u0093\3\2"+
		"\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\t\3\2\2\2\u009e\u009f\58\35\2\u009f\u00a0"+
		"\5\66\34\2\u00a0\u00a4\7\u0112\2\2\u00a1\u00a5\5\66\34\2\u00a2\u00a5\7"+
		"\u010d\2\2\u00a3\u00a5\5\62\32\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00ae\3\2\2\2\u00a6\u00a7\58\35\2\u00a7\u00a8"+
		"\5\62\32\2\u00a8\u00ab\7\u0112\2\2\u00a9\u00ac\5\66\34\2\u00aa\u00ac\7"+
		"\u010d\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ae\3\2\2\2"+
		"\u00ad\u009e\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ae\13\3\2\2\2\u00af\u00b3"+
		"\5:\36\2\u00b0\u00b4\7\u010d\2\2\u00b1\u00b4\5\66\34\2\u00b2\u00b4\5\62"+
		"\32\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\r\3\2\2\2\u00b5\u00b8\5<\37\2\u00b6\u00b9\5\66\34\2\u00b7\u00b9\5\62"+
		"\32\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\17\3\2\2\2\u00ba\u00bb"+
		"\5> \2\u00bb\u00bc\5\66\34\2\u00bc\u00bf\7\u0112\2\2\u00bd\u00c0\5\66"+
		"\34\2\u00be\u00c0\5\62\32\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c7\3\2\2\2\u00c1\u00c2\5> \2\u00c2\u00c3\5\62\32\2\u00c3\u00c4\7\u0112"+
		"\2\2\u00c4\u00c5\5\66\34\2\u00c5\u00c7\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6"+
		"\u00c1\3\2\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\5@!\2\u00c9\23\3\2\2\2\u00ca"+
		"\u00cd\5B\"\2\u00cb\u00ce\5\66\34\2\u00cc\u00ce\5\62\32\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\7\u0112\2"+
		"\2\u00d0\u00d4\5\66\34\2\u00d1\u00d4\7\u010d\2\2\u00d2\u00d4\5\62\32\2"+
		"\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\25"+
		"\3\2\2\2\u00d5\u00d6\5D#\2\u00d6\u00d7\7\f\2\2\u00d7\27\3\2\2\2\u00d8"+
		"\u00d9\5F$\2\u00d9\u00da\5\66\34\2\u00da\u00dd\7\u0112\2\2\u00db\u00de"+
		"\5\66\34\2\u00dc\u00de\5\62\32\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2"+
		"\2\u00de\31\3\2\2\2\u00df\u00e0\5H%\2\u00e0\u00e1\5\66\34\2\u00e1\u00e2"+
		"\7\u0112\2\2\u00e2\u00e3\5\62\32\2\u00e3\33\3\2\2\2\u00e4\u00e7\5J&\2"+
		"\u00e5\u00e8\5\66\34\2\u00e6\u00e8\5\62\32\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\u0112\2\2\u00ea\u00eb"+
		"\5\66\34\2\u00eb\35\3\2\2\2\u00ec\u00ef\5L\'\2\u00ed\u00f0\5\66\34\2\u00ee"+
		"\u00f0\5\62\32\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f1\u00f4\7\u0112\2\2\u00f2\u00f5\7\u010d\2\2\u00f3\u00f5\5\66"+
		"\34\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00f9"+
		"\5N(\2\u00f7\u00fa\5\66\34\2\u00f8\u00fa\5\62\32\2\u00f9\u00f7\3\2\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\u0112\2\2\u00fc"+
		"\u00fd\5\66\34\2\u00fd\u0100\7\u0112\2\2\u00fe\u0101\5\66\34\2\u00ff\u0101"+
		"\7\u010d\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101!\3\2\2\2\u0102"+
		"\u0105\5P)\2\u0103\u0106\5\66\34\2\u0104\u0106\5\62\32\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\7\u0112\2\2"+
		"\u0108\u010b\5\66\34\2\u0109\u010b\5\62\32\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b#\3\2\2\2\u010c\u0110\5R*\2\u010d\u0111\5\66\34\2"+
		"\u010e\u0111\5\62\32\2\u010f\u0111\7\u010d\2\2\u0110\u010d\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111%\3\2\2\2\u0112\u0113\5T+\2\u0113"+
		"\u0114\7\u010d\2\2\u0114\'\3\2\2\2\u0115\u0116\5V,\2\u0116\u0117\5\66"+
		"\34\2\u0117\u011a\7\u0112\2\2\u0118\u011b\5\66\34\2\u0119\u011b\7\u010d"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b)\3\2\2\2\u011c\u011f"+
		"\5X-\2\u011d\u0120\5\66\34\2\u011e\u0120\7\u010d\2\2\u011f\u011d\3\2\2"+
		"\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\u0112\2\2\u0122"+
		"\u0123\5\66\34\2\u0123+\3\2\2\2\u0124\u0125\5Z.\2\u0125\u0126\5@!\2\u0126"+
		"-\3\2\2\2\u0127\u0128\5\\/\2\u0128\u0129\7\f\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u012c\5\\/\2\u012b\u0127\3\2\2\2\u012b\u012a\3\2\2\2\u012c/\3\2\2\2\u012d"+
		"\u012e\7\f\2\2\u012e\u0132\5^\60\2\u012f\u0133\5`\61\2\u0130\u0133\7\u0110"+
		"\2\2\u0131\u0133\7\u010d\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\61\3\2\2\2\u0134\u0137\7\t\2\2\u0135\u0138\5\66\34"+
		"\2\u0136\u0138\7\f\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0144"+
		"\3\2\2\2\u0139\u0142\7\n\2\2\u013a\u013d\5\66\34\2\u013b\u013c\7\n\2\2"+
		"\u013c\u013e\t\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0143"+
		"\3\2\2\2\u013f\u0143\7\u010d\2\2\u0140\u0143\7\u010c\2\2\u0141\u0143\7"+
		"\u010e\2\2\u0142\u013a\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0139\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\13\2\2\u0147\63\3\2\2\2\u0148"+
		"\u0149\t\3\2\2\u0149\65\3\2\2\2\u014a\u014b\t\4\2\2\u014b\67\3\2\2\2\u014c"+
		"\u014d\t\5\2\2\u014d9\3\2\2\2\u014e\u014f\7.\2\2\u014f;\3\2\2\2\u0150"+
		"\u0151\t\6\2\2\u0151=\3\2\2\2\u0152\u0153\7V\2\2\u0153?\3\2\2\2\u0154"+
		"\u0155\t\7\2\2\u0155A\3\2\2\2\u0156\u0157\t\b\2\2\u0157C\3\2\2\2\u0158"+
		"\u0159\t\t\2\2\u0159E\3\2\2\2\u015a\u015b\t\n\2\2\u015bG\3\2\2\2\u015c"+
		"\u015d\t\13\2\2\u015dI\3\2\2\2\u015e\u015f\t\f\2\2\u015fK\3\2\2\2\u0160"+
		"\u0161\t\r\2\2\u0161M\3\2\2\2\u0162\u0163\t\16\2\2\u0163O\3\2\2\2\u0164"+
		"\u0165\t\17\2\2\u0165Q\3\2\2\2\u0166\u0167\7\u00cf\2\2\u0167S\3\2\2\2"+
		"\u0168\u0169\t\20\2\2\u0169U\3\2\2\2\u016a\u016b\7\u00d4\2\2\u016bW\3"+
		"\2\2\2\u016c\u016d\7\u00d5\2\2\u016dY\3\2\2\2\u016e\u016f\t\21\2\2\u016f"+
		"[\3\2\2\2\u0170\u0171\t\22\2\2\u0171]\3\2\2\2\u0172\u0173\t\23\2\2\u0173"+
		"_\3\2\2\2\u0174\u0175\7\u010a\2\2\u0175a\3\2\2\2\u0176\u0177\7\u010b\2"+
		"\2\u0177c\3\2\2\2\"fhtv\u0081\u009c\u00a4\u00ab\u00ad\u00b3\u00b8\u00bf"+
		"\u00c6\u00cd\u00d3\u00dd\u00e7\u00ef\u00f4\u00f9\u0100\u0105\u010a\u0110"+
		"\u011a\u011f\u012b\u0132\u0137\u013d\u0142\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}