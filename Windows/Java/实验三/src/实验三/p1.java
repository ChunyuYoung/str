package ʵ����;
import java.util.Scanner;
public class p1 {
	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);	//���뺯��
		//1. �ж������Ƿ���
		int tz,sg;					//����,���
		char xb;					//�Ա�
		int bz=0;					//��׼����
		char exit;					//�˳�
		boolean bool = true;		//��
		System.out.println("������:����,���,�Ա�<-����ո�ֿ����߻���->");
		tz = ch.nextInt();sg = ch.nextInt();	//��ȡ<--����,���-->
		xb=ch.next().charAt(0);					//��ȡ<--�Ա�-->
		while(bool) {
			if(xb == '��') {				//����
				bz=tz-100;
				System.out.print(tz>bz?"��Ҫ����":"����Ҫ����");
			}
			else if(xb == 'Ů') {		//Ů��
				bz=tz-105;
				System.out.print(tz<=bz?"��Ҫ����":"����Ҫ����");
			}
			System.out.println("\n������:����,���,�Ա�<-����ո�ֿ����߻���->(����q���˳�ѭ��)");	
			if((exit = ch.next().charAt(0)) == 'q')
				bool=false;		//�˳�ѭ��
		}
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//�ָ���
		//2.�ж���ĩ�Ƿ������
		System.out.println("�������Ӧ���ַ�:a.����һ   b.���ڶ�   c.������,d.������   e.������   f.������   g.��ĩ");
		char ch1 = (char)ch.next().charAt(0);		//��ȡ������ַ� 
		switch(ch1){
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':System.out.println("��������!");break;
		case 'f':
		case 'g':System.out.println("��ĩ������");break;
		default:System.out.println("�������!");break;
		}
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//�ָ���
		//3.������
		float a = 200000,b=0;		//�����ܳ��� �� ������		//a=200000f�ᵼ�½�����0.0
		while((a*=2/3f)>=1)b++;		//2/3f�Ż����ȷ�Ľ��
		System.out.printf("һ��20�����׵����Ӽ���%.0f��\n",b);
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//�ָ���
		//4.��Ҫ��
		int GJ = 3,MJ = 5,XJ = /*3ֻ1Ԫ*/ 1;	//ֻ/Ԫ
		System.out.printf("100Ԫ����:����:%d,ĸ��:%d,С��:%d(ֻ)\n",GJ=100/3,MJ=100/5,XJ=100*3);
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//�ָ���
		//5.�����ӡ5λ����
		int[] num = {1,2,3,4,5};	//5λ������
		System.out.print("�����������:");
		for(int o=0;o < num.length;o++)System.out.print(num[o]);System.out.println("\tУ��:����"+num.length+"λ������");//�����������
		for(int i = 0;i < num.length;i++) {
			for(int k = 0;k < num.length -1;k++) {
				if(num[k]<num[k+1]) {
					int temp = num[k];
					num[k] = num[k+1];
					num[k+1] = temp;
				}
			}
		}
		System.out.print("�����������:");for(int j = 0; j < num.length;j++)System.out.print(num[j]);System.out.print("\tУ��:����"+num.length+"λ������");	//���鵹�����
	}
}