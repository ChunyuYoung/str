import java.util.Scanner;
public class GG {
	public static void main(String[] args) {
		//�в����Ĺ��캯��
		Student sValue = new Student("StringOD",'Ů',16,90,20181016);
		sValue.Display();
		//ȡ����ֵ
		Scanner value = new Scanner(System.in);
		System.out.println("�㽫�������Ը�����(��ֻ��һ������Ļ���)");
		int n1 = value.nextInt();
		if (n1<0) {
			AbsoluteValue aValue = new AbsoluteValue(n1);
			System.out.println("����ȡ����" + aValue.number);
		}
		else
			System.out.println("�����㲢û������Լ��");
	}
}
