package com.strException;
import java.util.Scanner;
public class strException {
	public static int a=5;
	public static void main(String args[]) throws NoSuchFieldException {
		Scanner strValue = new Scanner(System.in);
		//�����쳣
		try {
			int arr[]={1,2,3};
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException x) {
			x.printStackTrace();
			System.out.println("����Խ��"+x);
		}
		app(a);
	}
	public static void app(int x)throws NoSuchFieldException{
		throw new NoSuchFieldException();
	}
	//�����쳣��������Throwable������
	//�Զ��������쳣��,��Ҫ�̳�Exception��
	class MyException extends Exception{
		//ֻ�̳�Exception�����������쳣���Ǽ�����쳣��
		//һ���쳣��������κ���һ��,�����б����ͷ���
	}
	
}