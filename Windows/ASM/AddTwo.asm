;AddTwo.asm - 两个32位整数相加
; 第三章示例

.386											;伪指令,表示一个32位程序,能访问32位寄存器和地址
.model flat,stdcall								;选择了程序的内存模式(flat),并确定了子程序的调用规范(称为stdcall)
.stack 4096										;运行时堆栈保留了4096字节的存储空间(每个程序都必须有)
ExitProcess PROTO,dwExitCode:DWORD				;ExitProcess它是一个windows的标准服务.原型包含了:函数名 PROTO关键字 一个逗号 一个输入参数列表.ExitProcess输入的参数名称为 dwExitCode.可以将其看作是给windwos返回的一个值,返回值为零,则表示程序执行成功(任何其他整数的值都将表示错误的代码)

.code											;伪指令,标志这代码块的起点
main PROC										;程序入口
	mov	eax,5	;数字5送入eax寄存器
	add eax,6	;eax寄存器加6
	
	INVOKE ExitProcess,0
main ENDP										;程序结束
END main
