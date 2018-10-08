package p1;
import java.util.Arrays;
import java.util.Scanner;
public class pp {
	public static void main(String[] args) {
		//1.数组的操作
		System.out.println("输入一个整数");
		Scanner num = new Scanner(System.in);	
		int n= num.nextInt();	//获取输入最大个数
		int n1[] = new int[n];	//初始化数组最大空间
		int sum=0;				//求数组元素值总和
		int adv=0;				//求数组元素值平均值
		for(int i = 0; i < n1.length;i++){
			n1[i] = num.nextInt();	//给数组元素赋值
		}
		for(int j = 0;j<n1.length;j++){
			System.out.print(n1[j]);	//输出数组元素
		}
		//求n个数的和
		for(int i =0;i<n1.length;i++){
			sum += n1[i];
		}
		System.out.println("\n数组元素总和:"+sum);
		//求数组元素平均值
		for (int i = 0; i < n1.length; i++) {
			adv = sum/n1.length;
		}
		System.out.println("数组元素平均值:"+adv);
		//数组元素升序输出
		Arrays.sort(n1);
		System.out.print("升序输出数组:");for(int i =0;i<n1.length;i++)System.out.print(n1[i]);
		//2.求数组a[]={2,5,8,31,6,8,14}和数组b[]={4,12,10,9,21,6}中所有元素之和.
		int[] a = {2,5,8,31,6,8,14};
		int a1 = 0;
		int[] b = {4,12,10,9,21,6};
		int b1=0;
		//计算数组a所有元素之和
		for (int i = 0; i < a.length; i++) {
			a1 += a[i];
		}
		//计算数组b所有元素之和
		for(int j=0;j<b.length;j++) {
			b1 +=b[j];
		}
		System.out.print("\n数组a所有元素总和:"+a1+"\n"+"数组b所有元素总和:"+b1+"\n"+"数组a和b所有元素总和为"+(a1+b1)+"\n");
		//分割线
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//换行
		//3.创建的二维数组(4*3)实现行列转换
		//行列转换前:
		int[][] ch_2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};	//初始化二维数组
		System.out.println("二维数组行列转换前");
		for(int i = 0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ch_2[i][j]+"\t");		//控制输出格式
			}
			System.out.println();		//换行
		}
		for(int k=0;k<60;k++)
			System.out.print("=");	 	//分割线
		System.out.println(); 		//换行
		//行列转换后:
		System.out.println("二维数组行列转换后");
		for(int i = 0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(ch_2[j][i]+"\t");		//控制输出格式
			}
			System.out.println();		//换行
		}
		for(int k=0;k<60;k++)
			System.out.print("=");	 	//分割线
		System.out.println(); 		//换行
		//4.两个二维数组分别为{{0,1,2},{3,4,5},{6,7,9}}和 {{10,11,22},{33,24,55},{66,27,19}}，进行如下操作：
		int[][] ch_21 = {{0,1,2},{3,4,5},{6,7,9}};				//初始化第一个二维数组
		int[][] ch_22 =  {{10,11,22},{33,24,55},{66,27,19}};	//初始化第二个二维数组
		//输出第一个二维数组
		System.out.println("输出第一个二维数组:\n");
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ch_21[i][j]+"\t");	 		//制表符
			}
			System.out.println(); 		//换行
		}
		//分割线
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//换行
		//输出第二个二维数组
		System.out.println("输出第二个二维数组:\n");
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ch_22[i][j]+"\t");	 		//制表符
			}
			System.out.println(); 		//换行
		}
		//分割线
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//换行
		//输出二维数组元素只和
		int sum1=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				sum1 += ch_21[i][j];
		}
		System.out.println("二维数组元素之和:"+sum1);
		//分割线
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//换行
		int sum2=0;		//初始化二维数组第一列
		//二维数组列相加求和
		System.out.println("ch_21二维数组对应的单列数组元素总和");
		for (int i = 0; i < ch_21.length; i++) {			//行
			for (int j = 0; j < ch_21.length; j++) {		//列
				sum += ch_21[i][j];
			}
			System.out.print(sum+"\t");
		}
	}
}
