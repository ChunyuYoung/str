.386
.model flat,stdcall
.stack 4096
ExitProcess PROTO,dwExitCode:DWORD

.data				;���ݶ�
num DWORD 50		;��ʼ��numΪDWORD���ҳ�ʼ������Ϊ50
val DWORD			;����valΪ�ֽ��ͱ���
.code				;�����
main PROC
	mov eax,5		;��eax�Ĵ����ƶ�һ��5
	add eax,6		;��eax�Ĵ������һ��6
	mov ebx,num		;��numԴ��������ֵ��ebx�Ĵ���
	mul num,eax		;��Ŀ�Ĳ�����ebx�Ĵ�����Դ������eax�Ĵ�����ֵ���

	COMMENT !			;ע������
		����ע��
		��Ҳ��ע��
		����ͬ����ע��
	!

	COMMENT &			;ע������		;��������Ҳ����ʹ��,ֻҪ�÷��Ų�������ע������
		����ע��
		��Ҳ��ע��
		����ͬ����ע��
	&

	INVOKE ExitProcess,0	;�������,�ƽ�����Ȩ������ϵͳ
main ENDP
END main