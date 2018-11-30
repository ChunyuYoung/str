package com.str.file;
import java.util.Scanner;
import java.io.*;
public class sc {
	public static void main(String args[])throws FileNotFoundException,IOException {
		Scanner value = new Scanner(System.in);
		System.out.println("«Î ‰»Îƒ⁄»›");
		String s = value.next();	
		FileInputStream fi = new FileInputStream(s);
		FileOutputStream fo = new FileOutputStream("C:\\Users\\HiWin10\\Desktop\\test.txt");
	}
}