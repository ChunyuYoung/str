package com.str.pg;
import java.io.*;
import java.util.Random;
public class ran {
	public static void main(String args[]){
		//1.����10��1��100�����������������ı��ļ�a.txt��
		try{
			FileInputStream fis = new FileInputStream("F:\\a.txt");	//�ļ�����
			System.out.println("�ļ��Ѵ���");
			try{
//				FileOutputStream fos = new FileOutputStream("D:\\a.txt");	//�����ļ�
				int num[] = new int[10];			//��ʼ������
				for(int i=0;i<num.length;i++){
					Random rd = new Random();		//���������
					num[i] = rd.nextInt(100)+1;
					System.out.print(num[i]+"\t");
				}
				//���ļ��������ɵ������
				DataOutputStream dis = new DataOutputStream(new FileOutputStream("F:\\a.txt"));
				for(int i=0;i<num.length;i++){
					dis.write(num[i]);		//���ļ�����ÿ�������
				}
				System.out.println(); 		//����
				System.out.println("��������ļ�д��ɹ�");
				//�ر���
				dis.close();
			}
			catch(FileNotFoundException fe){
				System.out.println("�ļ�����ʧ��");
			}
			catch(IOException fe){
				System.out.println("�ļ�д��ʧ��");
			}
		}
		catch(FileNotFoundException e){
			//�ļ�������
			System.out.println("�Ҳ����ļ�,���´����ļ�");
			System.out.println("����10�������:");
			try{
				FileOutputStream fos = new FileOutputStream("F:\\a.txt");	//�����ļ�
				int num[] = new int[10];			//��ʼ������
				for(int i=0;i<num.length;i++){
					Random rd = new Random();		//���������
					num[i] = rd.nextInt(100)+1;
					System.out.print(num[i]+"\t");
				}
				//���ļ��������ɵ������
				DataOutputStream dis = new DataOutputStream(new FileOutputStream("F:\\a.txt"));
				for(int i=0;i<num.length;i++){
					dis.write(num[i]);		//���ļ�����ÿ�������
				}
				System.out.println(); 		//����
				System.out.println("��������ļ�д��ɹ�");
				//�ر���
				fos.close();
				dis.close();
			}
			catch(FileNotFoundException fe){
				System.out.println("�ļ�����ʧ��");
			}
			catch(IOException fe){
				System.out.println("�ļ�д��ʧ��");
			}
		}
		for(int i=0;i<30;i++)System.out.print("=");System.out.println(); 	//�ָ���
		//2.���ļ��ж�ȡ��100�����������������ֵ����Сֵ��ƽ��ֵ��������
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("D:\\a.txt"));//�ļ��Ƿ����
			System.out.println("�ļ��Ѵ���");
			System.out.println("����֪�ļ���ȡ����");
			int num[] = new int[10];
			int n=0;
			while((n=dis.read())!= -1){
				for(int i=0;i<num.length;i++){
						num[i] = dis.read();
						//�������һ������Ԫ��Ϊ�ļ�������ʾ,���¸����ֵ
						if(num[i] == -1){
							Random r = new Random();
							num[i]=r.nextInt(100)+1;
						}
					System.out.print(num[i]+"\t");
				}
			}
			int max=0,min=0,adv=0;	//��ʼ�����ֵ,��Сֵ,ƽ��ֵ
			System.out.println(); 	//����
			//��ȡ���ֵ
			for(int i=0;i<num.length-1;i++){
				max= Math.max(num[i], num[i+1]);
			}
			//��ȡ��Сֵ
			for(int i=0;i<num.length-1;i++){
				min = Math.min(num[i], num[i+1]);
			}
			//��ȡƽ��ֵ
			for(int i=0;i<num.length-1;i++){
				int nu =  num[i++];
				adv = nu/num.length;
			}
			System.out.println("���ֵ��:"+max+"\t"+"��Сֵ��:"+min+"\t"+"ƽ��ֵ��:"+adv);
			//�ر���
			dis.close();
		}
		catch(FileNotFoundException e){
			//�ļ�������
			System.out.println("�ļ������ڻ��ܱ���");
		}
		catch(IOException e){
			System.out.println("�ļ����ܱ���ȡ��д��");
		}
	}
}
