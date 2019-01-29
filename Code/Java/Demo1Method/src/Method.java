import java.util.Scanner;
public class Method {
	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);			//创建一个re的输入函数
		System.out.println("你将输入一个整数!");						//从键盘上获取一个整数
		//for循环
		for (int i = 0; i < 5; i++) {
			System.out.print("第"+i+"输出:");
			int a[] = new int[i];//从键盘上获取一个整数
			System.out.println(a+"得值");
		}
	}
}