package com.tools.mcode.disasm;

public class McodeUtils {

    public static final long bfd_arch_unknown  = 0 ;   /* File arch not known.  */  
    public static final long bfd_arch_obscure = 1;   /* Arch known, not one of these.  */
    public static final long  bfd_arch_m68k = 2 ;      /* Motorola 68xxx.  */
	public static final long bfd_mach_m68000               = 1;
	public static final long bfd_mach_m68008              =  2;
	public static final long bfd_mach_m68010               = 3;
	public static final long bfd_mach_m68020               = 4;
	public static final long bfd_mach_m68030               = 5;
	public static final long bfd_mach_m68040               = 6;
	public static final long bfd_mach_m68060               = 7;
	public static final long bfd_mach_cpu32                = 8;
	public static final long bfd_mach_fido                 = 9;
	public static final long bfd_mach_mcf_isa_a_nodiv      = 10;
	public static final long bfd_mach_mcf_isa_a            = 11;
	public static final long bfd_mach_mcf_isa_a_mac        = 12;
	public static final long bfd_mach_mcf_isa_a_emac       = 13;
	public static final long bfd_mach_mcf_isa_aplus        = 14;
	public static final long bfd_mach_mcf_isa_aplus_mac    = 15;
	public static final long bfd_mach_mcf_isa_aplus_emac   = 16;
	public static final long bfd_mach_mcf_isa_b_nousp      = 17;
	public static final long bfd_mach_mcf_isa_b_nousp_mac  = 18;
	public static final long bfd_mach_mcf_isa_b_nousp_emac =  19;
	public static final long bfd_mach_mcf_isa_b           =  20;
	public static final long bfd_mach_mcf_isa_b_mac       =  21;
	public static final long bfd_mach_mcf_isa_b_emac      =  22;
	public static final long bfd_mach_mcf_isa_b_float     =  23;
	public static final long bfd_mach_mcf_isa_b_float_mac =  24;
	public static final long bfd_mach_mcf_isa_b_float_emac =  25;
	public static final long bfd_mach_mcf_isa_c           =  26;
	public static final long bfd_mach_mcf_isa_c_mac       =  27;
	public static final long bfd_mach_mcf_isa_c_emac      =  28;
	public static final long bfd_mach_mcf_isa_c_nodiv      =  29;
	public static final long bfd_mach_mcf_isa_c_nodiv_mac   =  30;
	public static final long bfd_mach_mcf_isa_c_nodiv_emac  =  31;
	public static final long  bfd_arch_vax = 3 ;       /* DEC Vax.  */
	public static final long  bfd_arch_i960 = 4 ;      /* Intel 960.  */
	    /* The order of the following is important.
	       lower number indicates a machine type that
	       only accepts a subset of the instructions
	       available to machines with higher numbers.
	       The exception is the "ca", which is
	       incompatible with all other machines except
	       "core".  */

	public static final long bfd_mach_i960_core  =   1;
	public static final long bfd_mach_i960_ka_sa =   2;
	public static final long bfd_mach_i960_kb_sb =   3;
	public static final long bfd_mach_i960_mc   =    4;
	public static final long bfd_mach_i960_xa   =    5;
	public static final long bfd_mach_i960_ca   =    6;
	public static final long bfd_mach_i960_jx   =    7;
	public static final long bfd_mach_i960_hx   =    8;

	public static final long  bfd_arch_or1k = 5 ;      /* OpenRISC 1000.  */
	public static final long bfd_mach_or1k      =    1;
	public static final long bfd_mach_or1knd    =    2;
	
	public static final long  bfd_arch_sparc  = 6 ;     /* SPARC.  */
	public static final long bfd_mach_sparc              =   1;
	/* The difference between v8plus and v9 is that v9 is a true 64 bit env.  */
	public static final long bfd_mach_sparc_sparclet     =   2;
	public static final long bfd_mach_sparc_sparclite    =   3;
	public static final long bfd_mach_sparc_v8plus       =   4;
	public static final long bfd_mach_sparc_v8plusa      =   5 ;/* with ultrasparc add'ns.  */
	public static final long bfd_mach_sparc_sparclite_le =   6;
	public static final long bfd_mach_sparc_v9          =    7;
	public static final long bfd_mach_sparc_v9a         =    8 ;/* with ultrasparc add'ns.  */
	public static final long bfd_mach_sparc_v8plusb     =    9 ;/* with cheetah add'ns.  */
	public static final long bfd_mach_sparc_v9b         =    10 ;/* with cheetah add'ns.  */
	public static final long bfd_mach_sparc_v8plusc     =    11 ;/* with UA2005 and T1 add'ns.  */
	public static final long bfd_mach_sparc_v9c         =    12 ;/* with UA2005 and T1 add'ns.  */
	public static final long bfd_mach_sparc_v8plusd     =    13 ;/* with UA2007 and T3 add'ns.  */
	public static final long bfd_mach_sparc_v9d         =    14 ;/* with UA2007 and T3 add'ns.  */
	public static final long bfd_mach_sparc_v8pluse     =    15 ;/* with OSA2001 and T4 add'ns (no IMA).  */
	public static final long bfd_mach_sparc_v9e         =    16 ;/* with OSA2001 and T4 add'ns (no IMA).  */
	public static final long bfd_mach_sparc_v8plusv     =    17 ;/* with OSA2011 and T4 and IMA and FJMAU add'ns.  */
	public static final long bfd_mach_sparc_v9v         =    18 ;/* with OSA2011 and T4 and IMA and FJMAU add'ns.  */
	public static final long bfd_mach_sparc_v8plusm     =    19 ;/* with OSA2015 and M7 add'ns.  */
	public static final long bfd_mach_sparc_v9m         =    20 ;/* with OSA2015 and M7 add'ns.  */
	public static final long bfd_mach_sparc_v8plusm8    =    21 ;/* with OSA2017 and M8 add'ns.  */
	public static final long bfd_mach_sparc_v9m8        =    22 ;/* with OSA2017 and M8 add'ns.  */

//NEEDS A CLOSER LOOK SOME DAY MAY NOT BE NEEDED BUT FOR NOW THESE MACROS ARE NOT CONVERTED FRO THE//////////////////
//BFD.H HEADER FILE OF LIBOPCODE 
	
	/* Nonzero if MACH has the v9 instruction set.  */
//	public static final long bfd_mach_sparc_v9_p(mach) \
//	  ((mach) >= bfd_mach_sparc_v8plus && (mach) <= bfd_mach_sparc_v9m8 \
//	   && (mach) != bfd_mach_sparc_sparclite_le)
	/* Nonzero if MACH is a 64 bit sparc architecture.  */
//	public static final long bfd_mach_sparc_64bit_p(mach) \
//	  ((mach) >= bfd_mach_sparc_v9 \
//	   && (mach) != bfd_mach_sparc_v8plusb \
//	   && (mach) != bfd_mach_sparc_v8plusc \
//	   && (mach) != bfd_mach_sparc_v8plusd \
//	   && (mach) != bfd_mach_sparc_v8pluse \
//	   && (mach) != bfd_mach_sparc_v8plusv \
//	   && (mach) != bfd_mach_sparc_v8plusm \
//	   && (mach) != bfd_mach_sparc_v8plusm8)
	  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	  
	public static final long  bfd_arch_spu  = 7 ;       /* PowerPC SPU.  */
	public static final long bfd_mach_spu       =    256;
	public static final long  bfd_arch_mips = 8 ;      /* MIPS Rxxxx.  */
	public static final long bfd_mach_mips3000            =  3000;
	public static final long bfd_mach_mips3900            =  3900;
	public static final long bfd_mach_mips4000            =  4000;
	public static final long bfd_mach_mips4010            =  4010;
	public static final long bfd_mach_mips4100            =  4100;
	public static final long bfd_mach_mips4111            =  4111;
	public static final long bfd_mach_mips4120            =  4120;
	public static final long bfd_mach_mips4300            =  4300;
	public static final long bfd_mach_mips4400            =  4400;
	public static final long bfd_mach_mips4600            =  4600;
	public static final long bfd_mach_mips4650            =  4650;
	public static final long bfd_mach_mips5000            =  5000;
	public static final long bfd_mach_mips5400            =  5400;
	public static final long bfd_mach_mips5500            =  5500;
	public static final long bfd_mach_mips5900            =  5900;
	public static final long bfd_mach_mips6000            =  6000;
	public static final long bfd_mach_mips7000            =  7000;
	public static final long bfd_mach_mips8000            =  8000;
	public static final long bfd_mach_mips9000            =  9000;
	public static final long bfd_mach_mips10000           =  10000;
	public static final long bfd_mach_mips12000           =  12000;
	public static final long bfd_mach_mips14000           =  14000;
	public static final long bfd_mach_mips16000           =  16000;
	public static final long bfd_mach_mips16              =  16;
	public static final long bfd_mach_mips5               =  5;
	public static final long bfd_mach_mips_loongson_2e    =  3001;
	public static final long bfd_mach_mips_loongson_2f    =  3002;
	public static final long bfd_mach_mips_loongson_3a    =  3003;
	public static final long bfd_mach_mips_sb1            =  12310201; /* octal 'SB', 01.  */
	public static final long bfd_mach_mips_octeon         =  6501;
	public static final long bfd_mach_mips_octeonp        =  6601;
	public static final long bfd_mach_mips_octeon2        =  6502;
	public static final long bfd_mach_mips_octeon3        =  6503;
	public static final long bfd_mach_mips_xlr            =  887682 ;  /* decimal 'XLR'.  */
	public static final long bfd_mach_mips_interaptiv_mr2 =  736550  ; /* decimal 'IA2'.  */
	public static final long bfd_mach_mipsisa32          =   32;
	public static final long bfd_mach_mipsisa32r2        =   33;
	public static final long bfd_mach_mipsisa32r3        =   34;
	public static final long bfd_mach_mipsisa32r5        =   36;
	public static final long bfd_mach_mipsisa32r6        =   37;
	public static final long bfd_mach_mipsisa64          =   64;
	public static final long bfd_mach_mipsisa64r2        =   65;
	public static final long bfd_mach_mipsisa64r3        =   66;
	public static final long bfd_mach_mipsisa64r5        =   68;
	public static final long bfd_mach_mipsisa64r6        =   69;
	public static final long bfd_mach_mips_micromips     =   96;
	public static final long  bfd_arch_i386 = 9;      /* Intel 386.  */
	public static final long bfd_mach_i386_intel_syntax  =   (1 << 0);
	public static final long bfd_mach_i386_i8086         =   (1 << 1);
	public static final long bfd_mach_i386_i386          =   (1 << 2);
	public static final long bfd_mach_x86_64             =   (1 << 3);
	public static final long bfd_mach_x64_32             =   (1 << 4);
	public static final long bfd_mach_i386_i386_intel_syntax = (bfd_mach_i386_i386 | bfd_mach_i386_intel_syntax);
	public static final long bfd_mach_x86_64_intel_syntax =  (bfd_mach_x86_64 | bfd_mach_i386_intel_syntax);
	public static final long bfd_mach_x64_32_intel_syntax =  (bfd_mach_x64_32 | bfd_mach_i386_intel_syntax);
	public static final long  bfd_arch_l1om  = 10 ;      /* Intel L1OM.  */
	public static final long bfd_mach_l1om                =  (1 << 5);
	public static final long bfd_mach_l1om_intel_syntax   =  (bfd_mach_l1om | bfd_mach_i386_intel_syntax);
	public static final long  bfd_arch_k1om = 11 ;      /* Intel K1OM.  */
	public static final long bfd_mach_k1om                =  (1 << 6);
	public static final long bfd_mach_k1om_intel_syntax   =  (bfd_mach_k1om | bfd_mach_i386_intel_syntax);
	public static final long bfd_mach_i386_nacl           =  (1 << 7);
	public static final long bfd_mach_i386_i386_nacl      =  (bfd_mach_i386_i386 | bfd_mach_i386_nacl);
	public static final long bfd_mach_x86_64_nacl         =  (bfd_mach_x86_64 | bfd_mach_i386_nacl);
	public static final long bfd_mach_x64_32_nacl         =  (bfd_mach_x64_32 | bfd_mach_i386_nacl);
 	public static final long  bfd_arch_iamcu = 12 ;     /* Intel MCU.  */
	public static final long bfd_mach_iamcu              =   (1 << 8);
	public static final long bfd_mach_i386_iamcu         =   (bfd_mach_i386_i386 | bfd_mach_iamcu);
	public static final long bfd_mach_i386_iamcu_intel_syntax = (bfd_mach_i386_iamcu | bfd_mach_i386_intel_syntax);
	public static final long  bfd_arch_we32k = 13 ;     /* AT&T WE32xxx.  */
	public static final long  bfd_arch_tahoe = 14 ;     /* CCI/Harris Tahoe.  */
	public static final long  bfd_arch_i860 = 15 ;      /* Intel 860.  */
	public static final long  bfd_arch_i370 = 16 ;      /* IBM 360/370 Mainframes.  */
	public static final long  bfd_arch_romp = 17 ;      /* IBM ROMP PC/RT.  */
	public static final long  bfd_arch_convex = 18 ;    /* Convex.  */
	public static final long  bfd_arch_m88k =19 ;      /* Motorola 88xxx.  */
	public static final long  bfd_arch_m98k = 20 ;      /* Motorola 98xxx.  */
	public static final long  bfd_arch_pyramid = 21 ;   /* Pyramid Technology.  */
	public static final long  bfd_arch_h8300 = 22 ;     /* Renesas H8/300 (formerly Hitachi H8/300).  */
	public static final long bfd_mach_h8300        = 1;
	public static final long bfd_mach_h8300h       = 2;
	public static final long bfd_mach_h8300s       = 3;
	public static final long bfd_mach_h8300hn      = 4;
	public static final long bfd_mach_h8300sn      = 5;
	public static final long bfd_mach_h8300sx      = 6;
	public static final long bfd_mach_h8300sxn     = 7;
	public static final long  bfd_arch_pdp11  = 23;     /* DEC PDP-11.  */
	public static final long  bfd_arch_plugin = 24 ;
	public static final long  bfd_arch_powerpc = 25 ;   /* PowerPC.  */
	public static final long bfd_mach_ppc          = 32;
	public static final long bfd_mach_ppc64        = 64;
	public static final long bfd_mach_ppc_403      = 403;
	public static final long bfd_mach_ppc_403gc    = 4030;
	public static final long bfd_mach_ppc_405      = 405;
	public static final long bfd_mach_ppc_505      = 505;
	public static final long bfd_mach_ppc_601      = 601;
	public static final long bfd_mach_ppc_602      = 602;
	public static final long bfd_mach_ppc_603      = 603;
	public static final long bfd_mach_ppc_ec603e   = 6031;
	public static final long bfd_mach_ppc_604      = 604;
	public static final long bfd_mach_ppc_620      = 620;
	public static final long bfd_mach_ppc_630      = 630;
	public static final long bfd_mach_ppc_750      = 750;
	public static final long bfd_mach_ppc_860      = 860;
	public static final long bfd_mach_ppc_a35      = 35;
	public static final long bfd_mach_ppc_rs64ii   = 642;
	public static final long bfd_mach_ppc_rs64iii  = 643;
	public static final long bfd_mach_ppc_7400     = 7400;
	public static final long bfd_mach_ppc_e500     = 500;
	public static final long bfd_mach_ppc_e500mc   = 5001;
	public static final long bfd_mach_ppc_e500mc64 = 5005;
	public static final long bfd_mach_ppc_e5500    = 5006;
	public static final long bfd_mach_ppc_e6500    = 5007;
	public static final long bfd_mach_ppc_titan    = 83;
	public static final long bfd_mach_ppc_vle     =  84;
	public static final long  bfd_arch_rs6000 = 26 ;    /* IBM RS/6000.  */
	public static final long bfd_mach_rs6k       =   6000;
	public static final long bfd_mach_rs6k_rs1   =   6001;
	public static final long bfd_mach_rs6k_rsc   =   6003;
	public static final long bfd_mach_rs6k_rs2   =   6002;
	public static final long  bfd_arch_hppa = 27 ;      /* HP PA RISC.  */
	public static final long bfd_mach_hppa10    =    10;
	public static final long bfd_mach_hppa11    =    11;
	public static final long bfd_mach_hppa20    =    20;
	public static final long bfd_mach_hppa20w   =    25;
	public static final long  bfd_arch_d10v = 28 ;      /* Mitsubishi D10V.  */
	public static final long bfd_mach_d10v        =  1;
	public static final long bfd_mach_d10v_ts2    =  2;
	public static final long bfd_mach_d10v_ts3    =  3;
	public static final long  bfd_arch_d30v = 29 ;      /* Mitsubishi D30V.  */
	public static final long  bfd_arch_dlx = 30;       /* DLX.  */
	public static final long  bfd_arch_m68hc11 = 31 ;   /* Motorola 68HC11.  */
	public static final long  bfd_arch_m68hc12 = 32 ;   /* Motorola 68HC12.  */
	public static final long bfd_mach_m6812_default  = 0;
	public static final long bfd_mach_m6812       =  1;
	public static final long bfd_mach_m6812s      =  2;
	public static final long  bfd_arch_m9s12x  = 33 ;    /* Freescale S12X.  */
	public static final long  bfd_arch_m9s12xg = 34 ;   /* Freescale XGATE.  */
	public static final long  bfd_arch_z8k = 35 ;       /* Zilog Z8000.  */
	public static final long bfd_mach_z8001       =  1;
	public static final long bfd_mach_z8002       =  2;
	public static final long  bfd_arch_h8500 = 36 ;     /* Renesas H8/500 (formerly Hitachi H8/500).  */
	public static final long  bfd_arch_sh  = 37 ;        /* Renesas / SuperH SH (formerly Hitachi SH).  */
	public static final long bfd_mach_sh                           = 1;
	public static final long bfd_mach_sh2                          = 0x20;
	public static final long bfd_mach_sh_dsp                       = 0x2d;
	public static final long bfd_mach_sh2a                         = 0x2a;
	public static final long bfd_mach_sh2a_nofpu                   = 0x2b;
	public static final long bfd_mach_sh2a_nofpu_or_sh4_nommu_nofpu = 0x2a1;
	public static final long bfd_mach_sh2a_nofpu_or_sh3_nommu =      0x2a2;
	public static final long bfd_mach_sh2a_or_sh4           =        0x2a3;
	public static final long bfd_mach_sh2a_or_sh3e          =        0x2a4;
	public static final long bfd_mach_sh2e                  =        0x2e;
	public static final long bfd_mach_sh3                   =        0x30;
	public static final long bfd_mach_sh3_nommu             =        0x31;
	public static final long bfd_mach_sh3_dsp               =        0x3d;
	public static final long bfd_mach_sh3e                  =        0x3e;
	public static final long bfd_mach_sh4                   =        0x40;
	public static final long bfd_mach_sh4_nofpu             =        0x41;
	public static final long bfd_mach_sh4_nommu_nofpu       =        0x42;
	public static final long bfd_mach_sh4a          =                0x4a;
	public static final long bfd_mach_sh4a_nofpu    =                0x4b;
	public static final long bfd_mach_sh4al_dsp     =                0x4d;
	public static final long bfd_mach_sh5           =                0x50;
	public static final long  bfd_arch_alpha  = 38 ;     /* Dec Alpha.  */
	public static final long bfd_mach_alpha_ev4    = 0x10;
	public static final long bfd_mach_alpha_ev5    = 0x20;
	public static final long bfd_mach_alpha_ev6    = 0x30;
	public static final long  bfd_arch_arm  = 39 ;       /* Advanced Risc Machines ARM.  */
	public static final long bfd_mach_arm_unknown  = 0;
	public static final long bfd_mach_arm_2        = 1;
	public static final long bfd_mach_arm_2a       = 2;
	public static final long bfd_mach_arm_3        = 3;
	public static final long bfd_mach_arm_3M       = 4;
	public static final long bfd_mach_arm_4        = 5;
	public static final long bfd_mach_arm_4T       = 6;
	public static final long bfd_mach_arm_5        = 7;
	public static final long bfd_mach_arm_5T       = 8;
	public static final long bfd_mach_arm_5TE      = 9;
	public static final long bfd_mach_arm_XScale   = 10;
	public static final long bfd_mach_arm_ep9312   = 11;
	public static final long bfd_mach_arm_iWMMXt   = 12;
	public static final long bfd_mach_arm_iWMMXt2  = 13;
	public static final long  bfd_arch_nds32 = 40 ;     /* Andes NDS32.  */
	public static final long bfd_mach_n1           = 1;
	public static final long bfd_mach_n1h          = 2;
	public static final long bfd_mach_n1h_v2       = 3;
	public static final long bfd_mach_n1h_v3       = 4;
	public static final long bfd_mach_n1h_v3m      = 5;
	public static final long  bfd_arch_ns32k = 41 ;     /* National Semiconductors ns32000.  */
	public static final long  bfd_arch_w65  = 42 ;       /* WDC 65816.  */
	public static final long  bfd_arch_tic30 = 43;     /* Texas Instruments TMS320C30.  */
	public static final long  bfd_arch_tic4x = 44 ;     /* Texas Instruments TMS320C3X/4X.  */
	public static final long bfd_mach_tic3x        = 30;
	public static final long bfd_mach_tic4x        = 40;
	public static final long  bfd_arch_tic54x = 45;    /* Texas Instruments TMS320C54X.  */
	public static final long  bfd_arch_tic6x = 46 ;     /* Texas Instruments TMS320C6X.  */
	public static final long  bfd_arch_tic80 = 47 ;     /* TI TMS320c80 (MVP).  */
	public static final long  bfd_arch_v850 = 48 ;      /* NEC V850.  */
	public static final long  bfd_arch_v850_rh850 = 49 ;/* NEC V850 (using RH850 ABI).  */
	public static final long bfd_mach_v850         = 1;
/*DOUBLE CHECK ON IF IT SHOULD BE CHARACTER OR LONG */	public static final long bfd_mach_v850e        = 'E';
/*DOUBLE CHECK ON IF IT SHOULD BE CHARACTER OR LONG */	public static final long bfd_mach_v850e1       = '1';
	public static final long bfd_mach_v850e2       = 0x4532;
	public static final long bfd_mach_v850e2v3     = 0x45325633;
	public static final long bfd_mach_v850e3v5     = 0x45335635 ;/* ('E'|'3'|'V'|'5').  */
	public static final long  bfd_arch_arc  = 50 ;       /* ARC Cores.  */
	public static final long bfd_mach_arc_a4       = 0;
	public static final long bfd_mach_arc_a5       = 1;
	public static final long bfd_mach_arc_arc600   = 2;
	public static final long bfd_mach_arc_arc601   = 4;
	public static final long bfd_mach_arc_arc700   = 3;
	public static final long bfd_mach_arc_arcv2    = 5;
	public static final long bfd_arch_m32c = 51 ;       /* Renesas M16C/M32C.  */
	public static final long bfd_mach_m16c         = 0x75;
	public static final long bfd_mach_m32c         = 0x78;
	public static final long  bfd_arch_m32r = 52 ;      /* Renesas M32R (formerly Mitsubishi M32R/D).  */
	public static final long bfd_mach_m32r         = 1; /* For backwards compatibility.  */
	/*DOUBLE CHECK ON IF IT SHOULD BE CHARACTER OR LONG */	public static final long bfd_mach_m32rx        = 'x';
	/*DOUBLE CHECK ON IF IT SHOULD BE CHARACTER OR LONG */	public static final long bfd_mach_m32r2        = '2';
	public static final long  bfd_arch_mn10200 = 53 ;   /* Matsushita MN10200.  */
	public static final long  bfd_arch_mn10300 = 54 ;   /* Matsushita MN10300.  */
	public static final long bfd_mach_mn10300      = 300;
	public static final long bfd_mach_am33         = 330;
	public static final long bfd_mach_am33_2       = 332;
	public static final long  bfd_arch_fr30  = 55 ;
	public static final long bfd_mach_fr30         = 0x46523330;
	public static final long  bfd_arch_frv = 56 ;
	public static final long bfd_mach_frv          = 1;
	public static final long bfd_mach_frvsimple    = 2;
	public static final long bfd_mach_fr300        = 300;
	public static final long bfd_mach_fr400        = 400;
	public static final long bfd_mach_fr450        = 450;
	public static final long bfd_mach_frvtomcat    = 499 ;    /* fr500 prototype.  */
	public static final long bfd_mach_fr500        = 500;
	public static final long bfd_mach_fr550        = 550;
	public static final long  bfd_arch_moxie = 57 ;     /* The moxie processor.  */
	public static final long bfd_mach_moxie        = 1;
	public static final long  bfd_arch_ft32 = 58;      /* The ft32 processor.  */
	public static final long bfd_mach_ft32         = 1;
	public static final long bfd_mach_ft32b        = 2;
	public static final long  bfd_arch_mcore = 59 ;
	public static final long  bfd_arch_mep = 60 ;
	public static final long bfd_mach_mep          = 1;
	public static final long bfd_mach_mep_h1       = 0x6831;
	public static final long bfd_mach_mep_c5       = 0x6335;
	public static final long  bfd_arch_metag = 61 ;
	public static final long bfd_mach_metag        = 1;
	public static final long  bfd_arch_ia64 = 62 ;      /* HP/Intel ia64.  */
	public static final long bfd_mach_ia64_elf64   = 64;
	public static final long bfd_mach_ia64_elf32   = 32;
	public static final long  bfd_arch_ip2k = 63 ;      /* Ubicom IP2K microcontrollers. */
	public static final long bfd_mach_ip2022       = 1;
	public static final long bfd_mach_ip2022ext    = 2;
	public static final long bfd_arch_iq2000 = 64 ;     /* Vitesse IQ2000.  */
	public static final long bfd_mach_iq2000       = 1;
	public static final long bfd_mach_iq10         = 2;
	public static final long  bfd_arch_epiphany = 65 ;  /* Adapteva EPIPHANY.  */
	public static final long bfd_mach_epiphany16   = 1;
	public static final long bfd_mach_epiphany32   = 2;
	public static final long  bfd_arch_mt = 66 ;
	public static final long bfd_mach_ms1          = 1;
	public static final long bfd_mach_mrisc2       = 2;
	public static final long bfd_mach_ms2          = 3;
	public static final long  bfd_arch_pj = 67 ;
	public static final long  bfd_arch_avr = 68 ;       /* Atmel AVR microcontrollers.  */
	public static final long bfd_mach_avr1         = 1;
	public static final long bfd_mach_avr2         = 2;
	public static final long bfd_mach_avr25        = 25;
	public static final long bfd_mach_avr3         = 3;
	public static final long bfd_mach_avr31        = 31;
	public static final long bfd_mach_avr35        = 35;
	public static final long bfd_mach_avr4         = 4;
	public static final long bfd_mach_avr5         = 5;
	public static final long bfd_mach_avr51        = 51;
	public static final long bfd_mach_avr6         = 6;
	public static final long bfd_mach_avrtiny      = 100;
	public static final long bfd_mach_avrxmega1    = 101;
	public static final long bfd_mach_avrxmega2    = 102;
	public static final long bfd_mach_avrxmega3    = 103;
	public static final long bfd_mach_avrxmega4    = 104;
	public static final long bfd_mach_avrxmega5    = 105;
	public static final long bfd_mach_avrxmega6    = 106;
	public static final long bfd_mach_avrxmega7    = 107;
	public static final long  bfd_arch_bfin = 69 ;      /* ADI Blackfin.  */
	public static final long bfd_mach_bfin         = 1;
	public static final long  bfd_arch_cr16 = 70 ;      /* National Semiconductor CompactRISC (ie CR16).  */
	public static final long bfd_mach_cr16         = 1;
	public static final long  bfd_arch_cr16c = 71 ;     /* National Semiconductor CompactRISC.  */
	public static final long bfd_mach_cr16c        = 1;
	public static final long  bfd_arch_crx = 72 ;       /*  National Semiconductor CRX.  */
	public static final long bfd_mach_crx          = 1;
	public static final long  bfd_arch_cris = 73 ;      /* Axis CRIS.  */
	public static final long bfd_mach_cris_v0_v10  = 255;
	public static final long bfd_mach_cris_v32     = 32;
	public static final long bfd_mach_cris_v10_v32 = 1032;
	public static final long  bfd_arch_riscv  = 74 ;
	public static final long bfd_mach_riscv32      = 132;
	public static final long bfd_mach_riscv64      = 164;
	public static final long  bfd_arch_rl78  = 75 ;
	public static final long bfd_mach_rl78         = 0x75;
	public static final long  bfd_arch_rx = 76 ;        /* Renesas RX.  */
	public static final long bfd_mach_rx           = 0x75;
	public static final long  bfd_arch_s390 = 77 ;      /* IBM s390.  */
	public static final long bfd_mach_s390_31      = 31;
	public static final long bfd_mach_s390_64      = 64;
	public static final long  bfd_arch_score  = 78 ;     /* Sunplus score.  */
	public static final long bfd_mach_score3       = 3;
	public static final long bfd_mach_score7       = 7;
	public static final long  bfd_arch_mmix  = 79 ;      /* Donald Knuth's educational processor.  */
	public static final long  bfd_arch_xstormy16 = 80 ;
	public static final long bfd_mach_xstormy16    = 1;
	public static final long  bfd_arch_msp430 = 81;    /* Texas Instruments MSP430 architecture.  */
	public static final long bfd_mach_msp11        = 11;
	public static final long bfd_mach_msp110       = 110;
	public static final long bfd_mach_msp12        = 12;
	public static final long bfd_mach_msp13        = 13;
	public static final long bfd_mach_msp14        = 14;
	public static final long bfd_mach_msp15        = 15;
	public static final long bfd_mach_msp16        = 16;
	public static final long bfd_mach_msp20        = 20;
	public static final long bfd_mach_msp21        = 21;
	public static final long bfd_mach_msp22        = 22;
	public static final long bfd_mach_msp23        = 23;
	public static final long bfd_mach_msp24        = 24;
	public static final long bfd_mach_msp26        = 26;
	public static final long bfd_mach_msp31        = 31;
	public static final long bfd_mach_msp32        = 32;
	public static final long bfd_mach_msp33        = 33;
	public static final long bfd_mach_msp41        = 41;
	public static final long bfd_mach_msp42        = 42;
	public static final long bfd_mach_msp43        = 43;
	public static final long bfd_mach_msp44        = 44;
	public static final long bfd_mach_msp430x      = 45;
	public static final long bfd_mach_msp46        = 46;
	public static final long bfd_mach_msp47        = 47;
	public static final long bfd_mach_msp54        = 54;
	public static final long  bfd_arch_xc16x  = 82 ;     /* Infineon's XC16X Series.  */
	public static final long bfd_mach_xc16x        = 1;
	public static final long bfd_mach_xc16xl       = 2;
	public static final long bfd_mach_xc16xs       = 3;
	public static final long  bfd_arch_xgate  = 83 ;     /* Freescale XGATE.  */
	public static final long bfd_mach_xgate        = 1;
	public static final long  bfd_arch_xtensa = 84;    /* Tensilica's Xtensa cores.  */
	public static final long bfd_mach_xtensa       = 1;
	public static final long  bfd_arch_z80  = 85 ;
	public static final long bfd_mach_z80strict   =  1 ;/* No undocumented opcodes.  */
	public static final long bfd_mach_z80          = 3 ;/* With ixl, ixh, iyl, and iyh.  */
	public static final long bfd_mach_z80full      = 7 ;/* All undocumented instructions.  */
	public static final long bfd_mach_r800         = 11 ;/* R800: successor with multiplication.  */
	public static final long  bfd_arch_lm32 = 86 ;      /* Lattice Mico32.  */
	public static final long bfd_mach_lm32         = 1;
	public static final long  bfd_arch_microblaze  = 87 ;/* Xilinx MicroBlaze.  */
	public static final long  bfd_arch_tilepro = 88 ;   /* Tilera TILEPro.  */
	public static final long  bfd_arch_tilegx = 89 ;    /* Tilera TILE-Gx.  */
	public static final long bfd_mach_tilepro     =  1;
	public static final long bfd_mach_tilegx     =   1;
	public static final long bfd_mach_tilegx32  =    2;
	public static final long  bfd_arch_aarch64 = 90 ;   /* AArch64.  */
	public static final long bfd_mach_aarch64 = 0;
	public static final long bfd_mach_aarch64_ilp32 = 32;
	public static final long  bfd_arch_nios2  = 91 ;     /* Nios II.  */
	public static final long bfd_mach_nios2       = 0;
	public static final long bfd_mach_nios2r1     =  1;
	public static final long bfd_mach_nios2r2    =   2;
	public static final long  bfd_arch_visium = 92 ;    /* Visium.  */
	public static final long bfd_mach_visium    =    1;
	public static final long  bfd_arch_wasm32  = 93 ;    /* WebAssembly.  */
	public static final long bfd_mach_wasm32   =     1;
	public static final long bfd_arch_pru  = 94 ;       /* PRU.  */
	public static final long bfd_mach_pru     =      0;
	public static final long  bfd_arch_last  = 95 ;

	
	public static final int ENDIAN_LITTLE = 0;
	public static final int ENDIAN_BIG = 1 ;
	
	public static final int DIALECT_INTEL = 0 ;
	public static final int DIALECT_AT_T = 1 ;

	
//Test main class uncomment to debug or test/dump constants to screen	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

//		long g = McodeUtils.bfd_mach_avrxmega4 ;  //test data blablabla
		
		
//	}
/////////////////////////////////////////////////////////////////
	
	
}

