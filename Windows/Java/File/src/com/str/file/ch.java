package com.str.file;
import java.io.*;
public class ch {
	public static void main(String args[]) {
		int fb = 0;
		try {
			FileReader fi = new FileReader("E:\\����������Ϣ �C ���ԹܼҼ����.txt");	//��ȡ�ļ�����
			FileWriter fo = new FileWriter("E:\\test.txt");		//��write��������
			while((fb = fi.read()) != -1) {		//�ж��ļ������Ƿ��ȡ��β��
				fo.write(fb);					//����ļ�(���ն�ȡ�ļ�ʱ������[�ַ�]Ȼ�����������ת��Ϊ�ַ�)
			}
			fi.close();
			fo.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("�Ҳ����ļ�");
		}
		catch(IOException e) {
			System.out.println("�ļ����ܱ�д��");
		}
		finally {
			System.out.println("�ļ��ɹ���д��");
		}
	}
}
