/*
 * machine.cpp
 *
 *  Created on: Mar 10, 2021
 *      Author: nate
 */

#include "machine.h"


//#############################################################################

char * disassemble_instruction( unsigned char * mcode , int endian , unsigned long machine , unsigned long platform , int& mbytes , int dialect )
{
	/* disassemble_info has quite a few fields, and we won't be populating all of them.
	 *
	 * We empty initialize here to so that the libopcodes routines won't try to use
	 * garbage data.
	 */
	struct disassemble_info disasm_info = {};
	stream_state ss = {} ;

	/* init_disassemble_info takes three arguments:
	 *  1. a pointer to our disassemble_info
	 *  2. a void pointer to a "stream", which gets fed to...
	 *  3. a function pointer to a fprint-like function
	 *     see fprintf_type in dis-asm.h for the exact prototype
	 */
	init_disassemble_info(&disasm_info, &ss, dis_fprintf);

	/* Specify our disassembly target. These constants are also required when
	 * we create the actual disassembly function later, so I'm not 100% sure
	 * if/why they're necessary here.
	 */
	disasm_info.arch = static_cast<bfd_architecture>(platform) ; //bfd_arch_i386;
	disasm_info.mach = machine ; //bfd_mach_x86_64;

	/* Optionally change the output format to Intel,
	 * over the default of AT&T.
	 */
	if(dialect == 0)
	disasm_info.disassembler_options = "intel-mnemonic" ;   //"intel-mnemonic";

	if(dialect == 1)
	disasm_info.disassembler_options = "att-mnemonic" ;  //"att-mnemonic"



	/* Tell our disassembler how and where to get its raw bytes.
	 * libopcodes provides the buffer_read_memory function;
	 * the buffer and its length are our input.
	 */
	disasm_info.read_memory_func = buffer_read_memory;
	disasm_info.buffer = mcode;
	disasm_info.buffer_vma = 0;
	disasm_info.buffer_length = sizeof(mcode);

	disasm_info.memory_error_func = error ;

	disassemble_init_for_target(&disasm_info);

	disassembler_ftype disasm;

	/* disassembler takes 4 arguments:
	 *  1. The target architecture, same as disasm_info.arch
	 *  2. The endianness (true = big, false = little)
	 *  3. The target machine, same as disasm_info.mach
	 *  4. An optional pointer to a BFD handle
	 *
	 * Returns NULL if libopcodes can't find a suitable disassembly function.
	 */
	if( endian == 0 )
	disasm = disassembler(disasm_info.arch, false, disasm_info.mach, NULL); //little endian
	else
	disasm = disassembler(disasm_info.arch, true, disasm_info.mach, NULL);  //big endian

	unsigned int msize = 0 ;

	msize = disasm(msize, &disasm_info);

	if( msize == 0 )
	{
		printf("Error no machine code decoded %i bytes processed | out of %i bytes given" , msize , (unsigned int)disasm_info.buffer_length) ;
	    return 0 ;
	}

	mbytes = msize ;

	return ss.insn_buffer ;

}


static int dis_fprintf(void *stream, const char *fmt, ...) {
  stream_state *ss = (stream_state *)stream;

  va_list arg;
  va_start(arg, fmt);
  if (!ss->reenter) {
    vasprintf(&ss->insn_buffer, fmt, arg);
    ss->reenter = true;
  } else {
    char *tmp;
    vasprintf(&tmp, fmt, arg);

    char *tmp2;
    asprintf(&tmp2, "%s%s", ss->insn_buffer, tmp);
    free(ss->insn_buffer);
    free(tmp);
    ss->insn_buffer = tmp2;
  }
  va_end(arg);


  return 0;
}

static void error(int status, bfd_vma memaddr, struct disassemble_info *dinfo)
{
	printf("error") ;
	fflush(NULL) ;
}


void disasmError(int sn, siginfo_t* t, void* ctx) {

	printf( "\nDisassemblier Not Found \n" );
	printf( "Make sure you have binutils build for the proper machine/target\n" );
	printf( "Or could be an old machine/target not supported by libopcodes-xxxxxx.so this is on your machine\n" );

	exit(EXIT_FAILURE) ;
}
