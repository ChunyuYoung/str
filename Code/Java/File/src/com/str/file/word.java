package com.str.file;
import java.io.*;
public class word {
	public static void main(String args[]) {
		int n = 0;
		try {
			FileInputStream in = new FileInputStream("c:\\users\\hiwin10\\desktop\\test.doc");
			FileOutputStream out = new FileOutputStream("c:\\users\\hiwin10\\desktop\\test_up.doc");
			while((n=in.read()) != -1) {
				out.write(n);
			}
			in.close();
			out.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("找不到文件");
		}
		catch(IOException e) {
			System.out.println("文件不能被写入");
		}
		finally {
			System.out.println("文件写入成功");
		}
	}
}
