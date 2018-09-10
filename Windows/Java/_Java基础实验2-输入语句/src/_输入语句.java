import java.util.Scanner;
public class _输入语句 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		//1.从键盘输入2个数,输出两个数的差,和.
		System.out.print("请输入两个整数\n");
		int n1,n2;
		n1 = num.nextInt();
		n2 = num.nextInt();
		System.out.print(n1+"+"+n2+"="+(n1+n2)+",");
		System.out.print(n1+"-"+n2+"="+(n1-n2));

		//2.从键盘上输入一个4位整数,分解后输出.(运算符:/ %)
		System.out.println("\n输入四个整数");
		int c1 = num.nextInt();
		int c2 = num.nextInt();
		int c3 = num.nextInt();
		int c4 = num.nextInt();
		System.out.print(c1+"\t"+c2+"\n"+c3+"\t"+c4);
		
		//3.输入圆的半径,求周长和面积
		//周长:2πr
		System.out.println("\n输入圆周率");
		float pi = num.nextFloat();
		System.out.println("\n输入半径");
		float banjing = num.nextFloat();
		System.out.println("\n圆的周长是:");
		System.out.print((2*pi)*banjing);
		//面积:πr²
		System.out.println("\n圆的面积是:");
		System.out.print(pi*(banjing*banjing));
		
		//4.某人翻越一座山用了2小时，返回用了2.5小时，
		//他上山的速度是3000米/小时，下山的速度是4500米/小时，
		//编写Java程序计算翻越这座山要走多少米（结果保留2位小数）
		//上山
		float ss= 3000f;
		float ss_h = 2f;
		float ss_mi = ss*ss_h;
		//下山
		float xs=4500f;
		float xs_h=2.5f;
		float xs_mi = xs*xs_h;
		
		//System.out.println("\n\n下山路程:"+(xs_mi)+"\n上山路程:"+(ss_mi)+"\n总路程:"+(ss_mi+xs_mi));
		System.out.printf("\n下山路程是:%.2f\n上山路程是:%.2f\n总路程是:%.2f",xs_mi,ss_mi,(ss_mi+xs_mi));
	}
}
