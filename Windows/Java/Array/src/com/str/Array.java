package com.str;

import java.util.Arrays;

import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
public class Array extends Exception {


	public static void main(String[] args)throws IntegerException {
		int ch[] = new int[] {1,2,3,4,5};
		int chh[] = new int[] {6,7,8,9,0};
		int chhh[] = new int[5];
		System.arraycopy(ch, 0, chhh, 0, chh.length);
		System.out.println("����a:"+Arrays.toString(ch));
		System.out.println("����b:"+Arrays.toString(chh));
		System.out.println("����c:"+Arrays.toString(chhh));
		
		//ö��s
		Season x = Season.����;
		System.out.println("X:"+x);		//Ĭ��ָ���һ��Ԫ��
		System.out.println(x.����);
		System.out.println(x.�ļ�);
		System.out.println(Season.�＾);
		System.out.println(x.����);	
		//@return ����
		
		//����B��ĳ����ڲ���F
		B bb = new B();
		boolean b = false;
//		assert booleanExpression;
		assert b;
		System.out.println(b);
//		assert booleanExpression:messageException;
		assert b == false: "�������";
		System.out.println(b);

//		//�����Զ����쳣
//		int age=-1;
//		IntegerException ie = new IntegerException(age);
//		if(age < 0) {
//			throw new IntegerException(age);
//		}
		
		//��getBytes����ʱ����д�쳣
		//����:UTF-8������һ������ռ�����ֽ�
		try {
			System.out.println("ʷ���utf-8������ռ���ֽ���");
			byte d[] = "ʷ���".getBytes("utf-8");
			System.out.println(d.length);
		}
		catch(UnsupportedEncodingException e) {
			System.out.println("����֮��������");
		}
		//����:GB2312(Ĭ�ϱ���),һ������ռ�����ֽ�
		try {
			System.out.println("ʷ���GB2312������ռ���ֽ���");
			byte dd[] = "ʷ���".getBytes("GB2312");		//����,��������
			System.out.println(dd.length);
		}
		catch(UnsupportedEncodingException e) {
			System.out.println("����֮��������");
		}
		//������ʽ:ȥ�������ֵ��ַ�
		String str = "1931��09��18����,�ձ������ֻ�ս��,���ס�������";
		String regex = "\\D+";
		String abc[] = str.split(regex);
		//��ô���ַ�������ת��Ϊ�ַ���?
		//���Դ������л�����,���л�������
		//������ʽ:�滻������ַ����е����ַ���
		System.out.println("������һ�������һ��û�");
		Scanner src = new Scanner(System.in);
		String strLine = src.nextLine();	//��������:How are you?
		/*
		 * \\s����ո����ַ�
		 * \\d����0~9�κ�һ������
		 * \\p{Punct}���������
		 * +����һ�λ���
		 */
		String regex1 = "[\\s\\d\\p{Punct}]+";
		String words[] = strLine.split(regex1);
		for(int i=0;i<words.length;i++) {
			int m = i+1;
			System.out.println("����"+m+words[i]);
		}
		
		//StringBuffer
		StringBuffer str233 = new StringBuffer("he likes Java");
		str233.setCharAt(0, 'w');
		str233.setCharAt(1,'e');
		System.out.println(str233); 	//we likes Java
		str233.insert(2, " all");
		System.out.println(str233); 	//weall
		int index = str233.indexOf("Java");
		str233.replace(index, str233.length(), "apple");
		System.out.println(str233);
		
		//StringTokenizer
		String s = "we are stud,ents";
		StringTokenizer fenxi = new StringTokenizer(s," ,");
		int number = fenxi.countTokens();
		while(fenxi.hasMoreTokens()) {
			String str1 = fenxi.nextToken();
			System.out.println(str1);
			System.out.println("��ʣ"+fenxi.countTokens()+"������");
		}
		System.out.println("s���е���:"+number+"��");
		
		//������ʽ:Scanner
		String cost = "�����嵥:�л���76.89Ԫ,��;����167.38Ԫ,���ŷ�12.86Ԫ";
		Scanner scanner = new Scanner(cost);
		scanner.useDelimiter("[^0123456789.]+");
		double sum =0;
		while(scanner.hasNext()) {
			try {
				double price = scanner.nextDouble();
				sum += price;
				System.out.println(price);
			}
			catch(InputMismatchException e) {
				String t = scanner.next();
			}
		}
		System.out.println("�ܷ���:"+sum+"Ԫ");
	}
}

class B{
	class C{
		class D{
			class E{
				abstract class F{
					//ʵ���ڲ���
					public abstract String s();
				}
			}
		}
	}
}