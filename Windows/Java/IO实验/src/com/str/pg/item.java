package com.str.pg;
import java.io.*;
public class item {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("F:\\intem.txt");		//判断文件是否存在
			File f = new File("F:\\in.txt");
			f.createNewFile();
		}
		catch(FileNotFoundException e) {
			//文件不存在
			try {
				FileOutputStream fos = new FileOutputStream("F:\\intem.txt");	//创建文件
			}
			catch(FileNotFoundException fe) {
				System.out.println("文件不能被创建");
			}
		}
		catch(IOException e) {
			System.out.println("文件不能被创建");
		}
	}
}
