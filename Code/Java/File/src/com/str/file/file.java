package com.str.file;
import java.io.*;
public class file {
	public static void main(String args[]){
		//String file = "E:\\����������Ϣ �C ���ԹܼҼ����.txt";
		int b=0;	//�ж��ļ������Ƿ񱻶�ȡ��
		try {
			FileInputStream in = new FileInputStream("E:\\����������Ϣ �C ���ԹܼҼ����.txt");		//�����ļ�
			FileOutputStream out = new FileOutputStream("E:\\����������Ϣ �C ���ԹܼҼ����1.txt");	//д���ļ�
			while((b=in.read()) != -1) {
				out.write(b);
			}
			in.close();
			out.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("�Ҳ����ļ�");
		}
		catch(IOException e) {
			System.out.println("�ļ����ܱ�����");
		}
		finally {
			System.out.println("�ļ��Ը���");
		}
	}
}
