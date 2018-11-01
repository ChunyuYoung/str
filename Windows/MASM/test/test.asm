.386
.model flat,stdcall
.stack 4096
ExitProcess PROTO,dwExitCode:DWORD

.data				;数据段
num DWORD 50		;初始化num为DWORD型且初始化变量为50
val DWORD			;声明val为字节型变量
.code				;代码段
main PROC
	mov eax,5		;向eax寄存器移动一个5
	add eax,6		;向eax寄存器添加一个6
	mov ebx,num		;将num源操作数赋值给ebx寄存器
	mul num,eax		;将目的操作数ebx寄存器和源操作数eax寄存器的值相乘

	COMMENT !			;注释语句块
		这是注释
		这也是注释
		这里同样是注释
	!

	COMMENT &			;注释语句块		;其他符号也可以使用,只要该符号不出现在注释行中
		这是注释
		这也是注释
		这里同样是注释
	&

	INVOKE ExitProcess,0	;程序结束,移交控制权给操作系统
main ENDP
END main