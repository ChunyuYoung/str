package 实验三;
import java.util.Scanner;
public class p1 {
	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);	//输入函数
		//1. 判断体重是否超重
		int tz,sg;					//体重,身高
		char xb;					//性别
		int bz=0;					//标准体重
		char exit;					//退出
		boolean bool = true;		//真
		System.out.println("请输入:体重,身高,性别<-输入空格分开或者换行->");
		tz = ch.nextInt();sg = ch.nextInt();	//获取<--体重,身高-->
		xb=ch.next().charAt(0);					//获取<--性别-->
		while(bool) {
			if(xb == '男') {				//男生
				bz=tz-100;
				System.out.print(tz>bz?"需要减肥":"不需要减肥");
			}
			else if(xb == '女') {		//女生
				bz=tz-105;
				System.out.print(tz<=bz?"需要减肥":"不需要减肥");
			}
			System.out.println("\n请输入:体重,身高,性别<-输入空格分开或者换行->(输入q则退出循环)");	
			if((exit = ch.next().charAt(0)) == 'q')
				bool=false;		//退出循环
		}
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//分隔符
		//2.判断周末是否更快乐
		System.out.println("请输入对应的字符:a.星期一   b.星期二   c.星期三,d.星期四   e.星期五   f.星期六   g.周末");
		char ch1 = (char)ch.next().charAt(0);		//获取输入的字符 
		switch(ch1){
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':System.out.println("工作快乐!");break;
		case 'f':
		case 'g':System.out.println("周末更快乐");break;
		default:System.out.println("输入错误!");break;
		}
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//分隔符
		//3.剪绳子
		float a = 200000,b=0;		//绳子总长度 和 计数器		//a=200000f会导致结果变成0.0
		while((a*=2/3f)>=1)b++;		//2/3f才会出正确的结果
		System.out.printf("一根20万厘米的绳子剪了%.0f天\n",b);
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//分隔符
		//4.我要买鸡
		int GJ = 3,MJ = 5,XJ = /*3只1元*/ 1;	//只/元
		System.out.printf("100元能买:公鸡:%d,母鸡:%d,小鸡:%d(只)\n",GJ=100/3,MJ=100/5,XJ=100*3);
		for(int h = 0;h<60;h++)System.out.print("=");System.out.println();		//分隔符
		//5.逆序打印5位整数
		int[] num = {1,2,3,4,5};	//5位正整数
		System.out.print("正序输出数组:");
		for(int o=0;o < num.length;o++)System.out.print(num[o]);System.out.println("\t校验:共有"+num.length+"位正整数");//数组正序输出
		for(int i = 0;i < num.length;i++) {
			for(int k = 0;k < num.length -1;k++) {
				if(num[k]<num[k+1]) {
					int temp = num[k];
					num[k] = num[k+1];
					num[k+1] = temp;
				}
			}
		}
		System.out.print("倒序输出数组:");for(int j = 0; j < num.length;j++)System.out.print(num[j]);System.out.print("\t校验:共有"+num.length+"位正整数");	//数组倒序输出
	}
}