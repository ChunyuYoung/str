package com.strException;
import java.util.Scanner;
public class strException {
	public static int a=5;
	public static void main(String args[]) throws NoSuchFieldException {
		Scanner strValue = new Scanner(System.in);
		//捕获异常
		try {
			int arr[]={1,2,3};
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException x) {
			x.printStackTrace();
			System.out.println("数组越界"+x);
		}
		app(a);
	}
	public static void app(int x)throws NoSuchFieldException{
		throw new NoSuchFieldException();
	}
	//所有异常都必须是Throwable的子类
	//自定义检查性异常类,需要继承Exception类
	class MyException extends Exception{
		//只继承Exception类来创建的异常类是检查性异常类
		//一个异常类和其他任何类一样,包含有变量和方法
	}
	
}