package ������;
import java.util.Scanner;
public class �׳� {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("�㽫����һ���Ǹ�����!");
		int sum = value.nextInt();	//��ȡһ������
		for(int i=2,s=1;i<=5;i++)
			sum=sum*(sum-s);
		System.out.println(sum);
	}
}
