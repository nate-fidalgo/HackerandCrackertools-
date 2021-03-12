This is a java disassemblier for any arch supported by binutils.
<pre>
<code>
package com.tools.mcode.disasm;

public class Mcode {

	public native String[] disassemble(char machinecode[] , int endian , long machine , long platform, int dialect ) ;
	
	static {
		// the library you need from my site is libmachine.so 
		// Built on 
		// 5.4.0-66-generic #74~18.04.2-Ubuntu SMP Fri Feb 5 11:17:31 UTC 2021 x86_64 x86_64 x86_64 GNU/Linux
        //But i plan to support windows and all the other major OS currently available
		//The bridge is thru mingw for windows
		//But for now those of you on x64 bit machines running on a gnu/unix/linux OS should work for you!!!
		System.loadLibrary("machine");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mcode mc = new Mcode() ;  // YOU WILL HAVE TO IMPLEMENT YOUR OWN MAIN CLASS AND INSTANTIATE Mcode CLASS TO USE
		//JUST A TEST CLASS FOR DEBUGGING THAT I LEFT IN FOR DEMONSTRATION PURPOSES!!!
		
		//Test machine code disassembling the first instruction below :)
		 char mmcc[] = {
				  0x55,            /* push rbp */
			      0x48, 0x89, 0xe5, /* mov rbp, rsp */
			      0x89, 0x7d, 0xfc, /* mov DWORD PTR [rbp-0x4], edi */
			      0x8b, 0x45, 0xfc, /* mov eax, DWORD PTR [rbp-0x4] */
			      0x0f, 0xaf, 0xc0, /* imul eax, rax */
			      0x5d,             /* pop ebp */
			      0xc3,             /* ret */
			  }; 

		String result[] = mc.disassemble(mmcc, McodeUtils.ENDIAN_LITTLE, McodeUtils.bfd_mach_x86_64, McodeUtils.bfd_arch_i386,8) ;
	//	String result[] = mc.disassemble(mmcc, McodeUtils.ENDIAN_LITTLE, McodeUtils.bfd_mach_avrxmega7, McodeUtils.bfd_arch_avr,0) ;
		System.out.println("Decompiled result ===>  "+ result[0]) ; 
		System.out.println("Number of instruction bytes = " +result[1]) ;
		System.exit(0);
		
		
	}  

}

</code>
</pre>

<br>
The result from the test main i have should give you this. Warning remember to include the library and the jar in the class path correctly or you will get
<br>

<code>
<pre>
Exception in thread "main" java.lang.UnsatisfiedLinkError: no machine in java.library.path: [/usr/java/packages/lib, /usr/lib/x86_64-linux-gnu/jni, /lib/x86_64-linux-gnu, /usr/lib/x86_64-linux-gnu, /usr/lib/jni, /lib, /usr/lib]
	at java.base/java.lang.ClassLoader.loadLibrary(ClassLoader.java:2670)
	at java.base/java.lang.Runtime.loadLibrary0(Runtime.java:830)
	at java.base/java.lang.System.loadLibrary(System.java:1873)
	at com.tools.mcode.disasm.Mcode.<clinit>(Mcode.java:14)

</code>
</pre>


<br>
<pre>
<code>
Decompiled result ===>  push   %rbp
Number of instruction bytes = 1
</code>
</pre>
