.data 		;此为数据区
sum DWORD 0 	;定义名为sum的变量

.code 		;此为代码段
main PROC
 mov eax,5 	;将数字5送入寄存器
 add eax,6 	;eax寄存器加6
 mov sum,eax 	;

 INVOKE ExitProcess,0 	;程序结束
main ENDP