package game;
import java.util.Scanner;
public class game {
	//������̬�ֶ�ģ��ȫ�ֱ���
	//�ƻ�ʹ��75������
	public static int[] Maps = new int[100];			//������ͼ��С
	//������ʹ���û��������ĸ������
	public static char[] Players = new char [2];		//�������
	//�洢�û��ǳ�
	public static String[] Name = new String[2];		//�����ǳ�
	//���λ�ü��
	public static boolean[] Flags = new boolean[2];		//�ж�ʤ��/����
	
	//���������
	public static void main(String[] args) {
		boolean b = true;					//�����ж�
		//��ȡ������� �� �ж��쳣������
		Scanner value = new Scanner(System.in);
		//�ж����1�ǳ��Ƿ�Ϊ��
		System.out.println("�������һ����ҵ���Ϸ�ǳ�(�ǳƲ���Ϊ��\"��\"����ǳƲ�����ͬ)");
		Name[0] = value.next();			//��ȡ���1����Ϸ�ǳ�
		while(Name[0] == " ") {
			System.out.println("����Ŷ,����밴��Ҫ�������һ����ҵ���Ϸ�ǳ�");
			Name[0] = value.next();		//��ȡ���1����Ϸ�ǳ�
		}
		System.out.println("������ڶ�����ҵ���Ϸ�ǳ�(�ǳƲ���Ϊ��\"��\"����ǳƲ�����ͬ)");	//�ж����2�ǳ��Ƿ�Ϊ������ͬ
		Name[1] = value.next();			//��ȡ���2����Ϸ�ǳ�
		while(Name[1] == " " || Name[0] == Name[1]) {
			System.out.println("���Ҳ����Ү,����밴��Ҫ������ڶ�����ҵ���Ϸ�ǳ�");
			if(Name[1] == " ") {
				System.out.println("��Ϸ�ǳƲ���Ϊ��,����밴��Ҫ������");
				Name[1] = value.next();			//��ȡ���2����Ϸ�ǳ�
			}
			else {
				System.out.println("��Ϸ�ǳƲ�����ͬ,����밴��Ҫ������");
				Name[1] = value.next();			//��ȡ���2����Ϸ�ǳ�
			}
		}
		//���������Ҫ����
		for(int i=0;i<50;i++)
			System.out.println();		//��50��
		//��ұ�־�����ǳ�
		System.out.printf(Name[0]+"O����\t"+Name[1]+"Q����\n");
		Players[0] = 'O';	//���1
		Players[1] = 'Q';	//���2
		//�����O��Qû��һ�����յ�ʱ,��Ϸ������
	}
}
