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
		System.out.println("数组a:"+Arrays.toString(ch));
		System.out.println("数组b:"+Arrays.toString(chh));
		System.out.println("数组c:"+Arrays.toString(chhh));
		
		//枚举s
		Season x = Season.春季;
		System.out.println("X:"+x);		//默认指向第一个元素
		System.out.println(x.春季);
		System.out.println(x.夏季);
		System.out.println(Season.秋季);
		System.out.println(x.冬季);	
		//@return 返回
		
		//调用B类的抽象内部类F
		B bb = new B();
		boolean b = false;
//		assert booleanExpression;
		assert b;
		System.out.println(b);
//		assert booleanExpression:messageException;
		assert b == false: "能输出吗";
		System.out.println(b);

//		//调用自定义异常
//		int age=-1;
//		IntegerException ie = new IntegerException(age);
//		if(age < 0) {
//			throw new IntegerException(age);
//		}
		
		//加getBytes方法时必须写异常
		//编码:UTF-8编码中一个汉字占三个字节
		try {
			System.out.println("史钿睿的utf-8编码所占的字节数");
			byte d[] = "史钿睿".getBytes("utf-8");
			System.out.println(d.length);
		}
		catch(UnsupportedEncodingException e) {
			System.out.println("编码之大出马达咧");
		}
		//编码:GB2312(默认编码),一个汉字占两个字节
		try {
			System.out.println("史钿睿的GB2312编码所占的字节数");
			byte dd[] = "史钿睿".getBytes("GB2312");		//国标,简体中文
			System.out.println(dd.length);
		}
		catch(UnsupportedEncodingException e) {
			System.out.println("编码之大出马达咧");
		}
		//正则表达式:去除非数字的字符
		String str = "1931年09月18日晚,日本发动侵华战争,请记住这个日子";
		String regex = "\\D+";
		String abc[] = str.split(regex);
		//怎么将字符串数组转换为字符串?
		//尝试创建序列化对象,序列化对象名
		//正则表达式:替换输入的字符串中的子字符串
		System.out.println("请输入一个短语或一句好话");
		Scanner src = new Scanner(System.in);
		String strLine = src.nextLine();	//假设输入:How are you?
		/*
		 * \\s代表空格类字符
		 * \\d代表0~9任何一个数字
		 * \\p{Punct}代表标点符号
		 * +出现一次或多次
		 */
		String regex1 = "[\\s\\d\\p{Punct}]+";
		String words[] = strLine.split(regex1);
		for(int i=0;i<words.length;i++) {
			int m = i+1;
			System.out.println("单词"+m+words[i]);
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
			System.out.println("还剩"+fenxi.countTokens()+"个单词");
		}
		System.out.println("s共有单词:"+number+"个");
		
		//正则表达式:Scanner
		String cost = "话费清单:市话费76.89元,长途话费167.38元,短信费12.86元";
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
		System.out.println("总费用:"+sum+"元");
	}
}

class B{
	class C{
		class D{
			class E{
				abstract class F{
					//实现内部类
					public abstract String s();
				}
			}
		}
	}
}