.data 		;��Ϊ������
sum DWORD 0 	;������Ϊsum�ı���

.code 		;��Ϊ�����
main PROC
 mov eax,5 	;������5����Ĵ���
 add eax,6 	;eax�Ĵ�����6
 mov sum,eax 	;

 INVOKE ExitProcess,0 	;�������
main ENDP