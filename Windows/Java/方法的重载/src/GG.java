import java.util.Scanner;
public class GG {
	public static void main(String[] args) {
		//有参数的构造函数
		Student sValue = new Student("StringOD",'女',16,90,20181016);
		sValue.Display();
		//取绝对值
		Scanner value = new Scanner(System.in);
		int n1 = value.nextInt();
		AbsoluteValue aValue = new AbsoluteValue(n1);
		System.out.println("负数取正数"+aValue.number);
	}
}
