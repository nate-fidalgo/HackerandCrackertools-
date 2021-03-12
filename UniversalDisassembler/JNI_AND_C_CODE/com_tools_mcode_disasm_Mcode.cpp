/*
 * com_tools_mcode_disasm_Mcode.cpp
 *
 *  Created on: Mar 10, 2021
 *      Author: nate
 */

#include "com_tools_mcode_disasm_Mcode.h"
#include "machine.h"
#define MAX_DIGITS  10


JNIEXPORT jobjectArray JNICALL Java_com_tools_mcode_disasm_Mcode_disassemble(JNIEnv * env , jobject jo, jcharArray mcode, jint endian, jlong machine , jlong platform, jint dialect )
{


	struct sigaction act ;
	memset(&act, 0, sizeof(act) );
    act.sa_sigaction = disasmError ;

	sigaction(SIGSEGV, &act, NULL);

	/* get size of the array */
//	jsize len = env->GetArrayLength(mcode);

	/* get the body of array; it will be referecende by C pointer */
	jchar * code = env->GetCharArrayElements(mcode, 0);

	int msize = 0 ;  //number of machine bytes processed
	char * instr = disassemble_instruction( (unsigned char *)code , endian , (unsigned long)machine , (unsigned long)platform, msize , (int)dialect ) ;

	if( instr == 0)
	{
		return env->NewObjectArray(2, env->FindClass("java/lang/String"), env->NewStringUTF("error")) ;
	}

	jstring instrstr = env->NewStringUTF(instr) ;
	/* release code when you decide it is no longer needed */
	env->ReleaseCharArrayElements(mcode, code, 0);

	//char * instr = disassemble_instruction( mcode , endian , machine , platform ) ;
    jobjectArray joa = env->NewObjectArray(2, env->FindClass("java/lang/String"), env->NewStringUTF("")) ;

    char num_char[MAX_DIGITS + sizeof(char)];

    sprintf(num_char, "%d", msize);
    env->SetObjectArrayElement(joa, 0, instrstr) ;
    env->SetObjectArrayElement(joa, 1, env->NewStringUTF( num_char ) ) ;

    return joa ;
}

