package 课外题;
import java.util.Scanner;
public class 补充题 {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		//1.编写应用程序，用两个for语句分别输出大写和小写的字母表
		System.out.println("小写字母\t");
		for(char i='a';i<='z';i++) {
			System.out.printf("%c\t",i);
			System.out.println();
		}
		System.out.println("\t大写字母");
		for(int j='A';j<='Z';j++) {
			System.out.printf("\t%c",j);
			System.out.println();
		}
		//2.编写一个应用程序求满足1+2！+3！+...+n！≤9876的最大整数n.
//		int a,s,i = 0;
//		for(a=1,s=1,s=2;(s+=(a*=i))<=9876;i++)System.out.println(i-1);
		//3.输入用户的用电量，程序输出电费。
		//区间1:对于1-90千瓦（度）的电量，每千瓦0.6元
		//区间2:对于91-150千瓦的电量，每千瓦1.1元
		//区间3:对于大于151千瓦的电量，每千瓦1.7元
		System.out.println("你将输入一个正电量数");
		float all=value.nextInt();	//获取电量
		if(all>=1 && all <=90) {	//区间1
			System.out.printf("电费是:%.1f元",all*0.6f);
		}
		if(all >=91 && all <=150) {	//区间2
			System.out.printf("电费是:%.1f元",all*1.1f);
		}
		if(all >=151) {				//区间3
			System.out.printf("电费是:%.1f元",all*1.7f);
		}
//		public static float 区间1(float all) {
//			
//		}
	}
}
