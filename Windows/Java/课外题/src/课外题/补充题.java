package ������;
import java.util.Scanner;
public class ������ {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		//1.��дӦ�ó���������for���ֱ������д��Сд����ĸ��
		System.out.println("Сд��ĸ\t");
		for(char i='a';i<='z';i++) {
			System.out.printf("%c\t",i);
			System.out.println();
		}
		System.out.println("\t��д��ĸ");
		for(int j='A';j<='Z';j++) {
			System.out.printf("\t%c",j);
			System.out.println();
		}
		//2.��дһ��Ӧ�ó���������1+2��+3��+...+n����9876���������n.
//		int a,s,i = 0;
//		for(a=1,s=1,s=2;(s+=(a*=i))<=9876;i++)System.out.println(i-1);
		//3.�����û����õ��������������ѡ�
		//����1:����1-90ǧ�ߣ��ȣ��ĵ�����ÿǧ��0.6Ԫ
		//����2:����91-150ǧ�ߵĵ�����ÿǧ��1.1Ԫ
		//����3:���ڴ���151ǧ�ߵĵ�����ÿǧ��1.7Ԫ
		System.out.println("�㽫����һ����������");
		float all=value.nextInt();	//��ȡ����
		if(all>=1 && all <=90) {	//����1
			System.out.printf("�����:%.1fԪ",all*0.6f);
		}
		if(all >=91 && all <=150) {	//����2
			System.out.printf("�����:%.1fԪ",all*1.1f);
		}
		if(all >=151) {				//����3
			System.out.printf("�����:%.1fԪ",all*1.7f);
		}
//		public static float ����1(float all) {
//			
//		}
	}
}
