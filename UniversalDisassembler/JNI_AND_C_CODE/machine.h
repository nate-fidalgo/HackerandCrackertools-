/*
 * machine.h
 *
 *  Created on: Mar 9, 2021
 *      Author: nate
 */

#ifndef MACHINE_H_
#define MACHINE_H_

  // used by libopcode needs to come before dis-asm.h header
#include<cstring>
#include <dis-asm.h>
#include <iostream>
#include <signal.h>
//Data structures used for libopcode ////////////////////////////////////
static int dis_fprintf(void *stream, const char *fmt, ...) ;
char * disassemble_instruction( unsigned char * mcode , int endian , unsigned long machine , unsigned long platform , int& , int) ;

typedef struct {
  char *insn_buffer;  //THIS IS WHERE THE RESULTING DISASSEMBLED MACHINE CODE IS PUT
  bool reenter;
} stream_state;

static void error(int status, bfd_vma memaddr, struct disassemble_info *dinfo);
void disasmError(int sn, siginfo_t* t, void* ctx) ;

#endif /* MACHINE_H_ */
