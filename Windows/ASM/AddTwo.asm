;AddTwo.asm - ����32λ�������
; ������ʾ��

.386											;αָ��,��ʾһ��32λ����,�ܷ���32λ�Ĵ����͵�ַ
.model flat,stdcall								;ѡ���˳�����ڴ�ģʽ(flat),��ȷ�����ӳ���ĵ��ù淶(��Ϊstdcall)
.stack 4096										;����ʱ��ջ������4096�ֽڵĴ洢�ռ�(ÿ�����򶼱�����)
ExitProcess PROTO,dwExitCode:DWORD				;ExitProcess����һ��windows�ı�׼����.ԭ�Ͱ�����:������ PROTO�ؼ��� һ������ һ����������б�.ExitProcess����Ĳ�������Ϊ dwExitCode.���Խ��俴���Ǹ�windwos���ص�һ��ֵ,����ֵΪ��,���ʾ����ִ�гɹ�(�κ�����������ֵ������ʾ����Ĵ���)

.code											;αָ��,��־����������
main PROC										;�������
	mov	eax,5	;����5����eax�Ĵ���
	add eax,6	;eax�Ĵ�����6
	
	INVOKE ExitProcess,0
main ENDP										;�������
END main
