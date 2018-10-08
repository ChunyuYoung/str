package 课外题;
import java.util.Scanner;
public class 阶乘 {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("你将输入一个非负整数!");
		int sum = value.nextInt();	//获取一个整数
		for(int i=2,s=1;i<=5;i++)
			sum=sum*(sum-s);
		System.out.println(sum);
	}
}
