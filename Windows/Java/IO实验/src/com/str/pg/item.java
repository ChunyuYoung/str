package com.str.pg;
import java.io.*;
public class item {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("F:\\intem.txt");		//�ж��ļ��Ƿ����
			File f = new File("F:\\in.txt");
			f.createNewFile();
		}
		catch(FileNotFoundException e) {
			//�ļ�������
			try {
				FileOutputStream fos = new FileOutputStream("F:\\intem.txt");	//�����ļ�
			}
			catch(FileNotFoundException fe) {
				System.out.println("�ļ����ܱ�����");
			}
		}
		catch(IOException e) {
			System.out.println("�ļ����ܱ�����");
		}
	}
}
