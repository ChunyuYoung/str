import java.util.Scanner;
public class GG {
	public static void main(String[] args) {
		//�в����Ĺ��캯��
		Student sValue = new Student("StringOD",'Ů',16,90,20181016);
		sValue.Display();
		//ȡ����ֵ
		Scanner value = new Scanner(System.in);
		int n1 = value.nextInt();
		AbsoluteValue aValue = new AbsoluteValue(n1);
		System.out.println("����ȡ����"+aValue.number);
	}
}
