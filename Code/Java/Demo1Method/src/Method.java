import java.util.Scanner;
public class Method {
	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);			//����һ��re�����뺯��
		System.out.println("�㽫����һ������!");						//�Ӽ����ϻ�ȡһ������
		//forѭ��
		for (int i = 0; i < 5; i++) {
			System.out.print("��"+i+"���:");
			int a[] = new int[i];//�Ӽ����ϻ�ȡһ������
			System.out.println(a+"��ֵ");
		}
	}
}