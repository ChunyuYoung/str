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
			System.out.println("�Ҳ����ļ�");
		}
		catch(IOException e) {
			System.out.println("�ļ����ܱ�д��");
		}
		finally {
			System.out.println("�ļ�д��ɹ�");
		}
	}
}
