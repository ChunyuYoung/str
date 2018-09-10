package _比大小;
public class _Max 
{
	public static void main(String[] args) 
	{
		//int a=5,b=4;
		//System.out.println(a > b ? a : b);
		//2.在Eclipse中编写Java程序，输出“Hello Java！”
		System.out.println("Hello World!");
		//3.在Eclipse中编写Java程序，输出自己的班级、学号、姓名等信息
		System.out.println("学号：177063，性别:男，姓名：史钿睿,班级：T1702");
		System.out.println();
		
		//数组
		System.out.println("比大小");
		int max=0;
		int[] num = {98,205,23};
		for(int i = 0;i < num.length;i++)
			if(num[i] > max)
				max = num[i];
		System.out.println(max);
	}
}
