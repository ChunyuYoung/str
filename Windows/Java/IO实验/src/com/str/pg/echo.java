package com.str.pg;
import java.io.*;
import java.util.Scanner;
import java.util.Date;
public class echo {
	public static void main(String args[]){
		//1.���ư�����Ӣ���ı���ͼƬ�ͱ���Word�ĵ�
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//�ָ���
		try{
			FileInputStream fi = new FileInputStream("F:\\123.docx");
			FileOutputStream fo = new FileOutputStream("F:\\123_bak.docx");
			int n = 0;
			while((n=fi.read()) != -1){
				fo.write(n);
			}
			System.out.println("�ļ����Ƴɹ�");
			fi.close();
			fo.close();
		}
		catch(FileNotFoundException e){
			System.out.println("�Ҳ����ļ�");
		}
		catch(IOException e){
			System.out.println("�ļ����ܱ��ɹ�д��");
		}
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//�ָ���
		//2.��������������ݱ�����D�̵�b.txt�ļ���
		Scanner value = new Scanner(System.in);
		System.out.println("����������");
		String s = value.next();
		try{
			FileWriter out = new FileWriter("F:\\TXT.txt");
			out.write(s);
			out.close();
		}
		catch(IOException e){
			System.out.println("�ļ����ܱ��ɹ�д��");
		}
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//�ָ���
		//3..ʹ��BufferedReader���BufferedWriter��ʵ�ֽ����������n�����ݱ��浽D�̵�c.txt�ļ���
		try{
			//File f = new File("D:\\c.txt");
			FileOutputStream fos = new FileOutputStream("F:\\c.txt");	//�����ļ�
			BufferedReader br = new BufferedReader(new FileReader("F:\\c.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\c.txt"));
			System.out.println("����һ������(�����С��5������,��������ӵķ���)");
			int n1 = value.nextInt();		//��ȡ����
			String ch[] = new String[n1];
			System.out.println("����������");
			int nn=0;
			for(int i =0;i<ch.length;i++){
				ch[i] = value.next();		//��ȡÿ�е�����
				bw.write(ch[i]);
				bw.newLine();				//����
			}
			System.out.println("�ļ�д��ɹ�");
			br.close();
			bw.close();
		}
		catch(FileNotFoundException e){
			System.out.println("�Ҳ����ļ�");
		}
		catch(IOException e){
			System.out.println("�ļ����ܱ�д��");
		}
		//4.��ȡD���ļ�b.txt����>����<�ļ���������ԣ��磺���ȡ�·�����Ƿ�ɶ����Ƿ�Ϊ�ļ��С��Ƿ���ڵ����ԡ�
		//�ļ�����:����,����,�ļ�·��,��С,��������,�޸�����,����[ֻ��,����],������,������,�����
		for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//�ָ���
		System.out.println("����ļ�b.txt������");
		try {
			FileOutputStream fos1 = new FileOutputStream("F:\\b.txt");	//�����ļ�
			Date time = new Date();										//ʵ�������ڶ���
			//System.out.println("���ڵ�ʱ����:"+time.toString());
			FileInputStream fis1 = new FileInputStream("F:\\b.txt");	//��ȡ�ļ�
			File f1 = new File("F:\\b.txt");							//ʵ�����ļ�����
			String property[] = new String[11];							//�ļ�����
			BufferedReader bfr = new BufferedReader(new FileReader("F:\\b.txt"));
			BufferedWriter bfw = new BufferedWriter(new FileWriter("F:\\b.txt"));
			bfw.write("�Ҳ�֪���Ǹ������ĳ�����ָ�ֽڻ���ʲô");						//һ����Ϊ�����ֽ�
			bfw.flush(); 												//ˢ�»�����
			//---------------------------------------------------------------------
			//�����������,����ʹ��ѭ�����ѹ���������ԵĴ���
			
			//�ļ�����
			String sn = f1.getName();									//��ȡ�ļ�����
			System.out.println("����:"+sn.replace(".txt",""));			//ɾ���ļ���չ��
			
			//�ļ�����											
			System.out.println("����:"+sn.replaceAll("b", ""));			//ɾ���ļ���
			
			//�ļ�·��
			System.out.println("·��:"+f1.getPath());						//��ȡ�ļ�·��
			
			//�ļ���С
			System.out.println("��С:"+f1.length()+"�ֽ�");				//��ȡ�ļ�����
			
			//�ļ���������
			System.out.println("��������:"+time.toString());				//�ĵ���������
			
			//�ļ��޸�����(ʱ���ʽ��:δ���)
			System.out.println("�޸�ʱ��:"+f1.lastModified());				//�ĵ����һ���޸�����
//			String sti = f1.lastModified()+"";							//ת��long����Ϊ�ַ���
//			System.out.println(sti.toString());
			
			//��׼�ļ�
			System.out.println("��׼�ļ�:"+f1.isFile()); 					//�Ƿ��Ǳ�׼�ļ�
			
			//ֻ��
			System.out.println("ֻ���ļ�:"+f1.setReadOnly());				//�ļ��Ƿ�ֻ�ܶ�
			
			//�����ļ�
			System.out.println("�����ļ�:"+f1.isHidden()); 				//�ļ��Ƿ�����
			
			//������
			System.out.println("������:����(����ĵ�����Ҫ��������)"); 			//�Ƿ���Ҫ�������
			
			//������
			System.out.println("������:"+f1.setWritable(false));			//���Ȩ�޹���
			
			//·������Hash
			System.out.println("Hash:"+f1.hashCode());					//����·�����Ĺ�ϣֵ
			
			//�ر���
			fos1.close();
			fis1.close();
			bfr.close();
			bfw.close();
		}
		catch(IOException e) {
//			System.out.println("�ļ����ܱ��������ܱ���ȡ");
//			System.out.println("��ɾ��b�ļ�����������");
			
			//ɾ���޷��򿪵Ķ��ļ�
			File f = new File("F:\\b.txt");
			f.delete();
			System.out.println("�ļ���ɾ��,���´����ļ�");
			//���´����ļ�
			try {
			FileOutputStream fos1 = new FileOutputStream("F:\\b.txt");	//�����ļ�
			Date time = new Date();										//ʵ�������ڶ���
			//System.out.println("���ڵ�ʱ����:"+time.toString());
			FileInputStream fis1 = new FileInputStream("F:\\b.txt");	//��ȡ�ļ�
			File f1 = new File("F:\\b.txt");							//ʵ�����ļ�����
			//String property[] = new String[11];							//�ļ�����
			BufferedReader bfr = new BufferedReader(new FileReader("F:\\b.txt"));
			BufferedWriter bfw = new BufferedWriter(new FileWriter("F:\\b.txt"));
			bfw.write("�Ҳ�֪���Ǹ������ĳ�����ָ�ֽڻ���ʲô");						//һ����Ϊ�����ֽ�
			bfw.flush(); 												//ˢ�»�����
			//---------------------------------------------------------------------
			//�����������,����ʹ��ѭ�����ѹ���������ԵĴ���
			
			//�ļ�����
			String sn = f1.getName();									//��ȡ�ļ�����
			System.out.println("����:"+sn.replace(".txt",""));			//ɾ���ļ���չ��
			
			//�ļ�����											
			System.out.println("����:"+sn.replaceAll("b", ""));			//ɾ���ļ���
			
			//�ļ�·��
			System.out.println("·��:"+f1.getPath());						//��ȡ�ļ�·��
			
			//�ļ���С
			System.out.println("��С:"+f1.length()+"�ֽ�");				//��ȡ�ļ�����
			
			//�ļ���������
			System.out.println("��������:"+time.toString());				//�ĵ���������
			
			//�ļ��޸�����
			System.out.println("�޸�ʱ��:"+f1.lastModified());				//�ĵ����һ���޸�����
			
			//��׼�ļ�
			System.out.println("��׼�ļ�:"+f1.isFile()); 					//�Ƿ��Ǳ�׼�ļ�
			
			//ֻ��
			System.out.println("ֻ���ļ�:"+f1.setReadOnly());				//�ļ��Ƿ�ֻ�ܶ�
			
			//�����ļ�
			System.out.println("�����ļ�:"+f1.isHidden()); 				//�ļ��Ƿ�����
			
			//������
			System.out.println("������:����(����ĵ�����Ҫ��������)"); 			//�Ƿ���Ҫ�������
			
			//������
			System.out.println("������:"+f1.setWritable(false));			//���Ȩ�޹���
			
			//·������Hash
			System.out.println("Hash:"+f1.hashCode());					//����·�����Ĺ�ϣֵ
			
			//�ļ���
			System.out.println("�ļ���:"+f1.isDirectory()); 				//�ж��ļ��Ƿ����ļ���
			
			//�ر���
			fos1.close();
			fis1.close();
			bfr.close();
			bfw.close();
		}
		catch(IOException fe) {
			System.out.println("�ļ�д��ʧ��");
		}
			for(int i=0;i<30;i++)System.out.print("=");System.out.println();	//�ָ���
		//5.�ж�D�����Ƿ����a.txt�ļ������������򴴽����ļ���֮������ļ���Ϊb5.txt��
		try {
			File f1 = new File("F:\\b.txt");
			if(f1.getAbsolutePath() == "F:\\a.txt") {
				System.out.println("�ļ���������:a.txt-->b5.txt");
				FileInputStream fis_b5 = new FileInputStream("F:\\a.txt");
				FileOutputStream fos_b5 = new FileOutputStream("F:\\b5.txt"); 	//�����ļ�
				int fnos = 0;
				while((fnos=fis_b5.read()) != -1) {
					fos_b5.write(fnos);
				}
			}
			else {
				FileOutputStream fos = new FileOutputStream("F:\\a.txt");		//�����ļ�
				System.out.println("�ļ���������:a.txt-->b5.txt");
				FileInputStream fis_b5 = new FileInputStream("F:\\a.txt");
				FileOutputStream fos_b5 = new FileOutputStream("F:\\b5.txt"); 	//�����ļ�
				int fnos = 0;
				while((fnos=fis_b5.read()) != -1) {
					fos_b5.write(fnos);
				}
				fis_b5.close();
				fos_b5.close();
			}
		}
		catch(FileNotFoundException fe) {
			System.out.println("�޷������ļ�");
		}
		catch(IOException ioe) {
			System.out.println("�ļ��ܾ���д��");
		}
	}
	}
}