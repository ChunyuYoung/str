//GameMain.java
package com.str.game;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class GameMain {

	public static void main(String[] args){
		Scanner src = new Scanner(System.in);
		GameList style = new GameList();
		style.List();							//��Ϸ����������
		System.out.print("��������Ҫ�򿪵���Ϸ���:");
		int number=0;
		
		//�ж������Ƿ�Ϸ�
			try {
				number = src.nextInt();			//��ȡ��Ϸ���
				if(number < 1 || number > 5) {
					System.out.println("����������б��еı��\n�ٸ���һ������Ļ���");
					number = src.nextInt();
				}	
			}
			catch(Exception e) {
				System.out.println("����������б��еı��");
			}
		System.out.println();					//����
		//��ȡ��Ϸ�������
		switch(number) {
		case 1:						//1.����֮·��������������
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("����֮·��������������.html");
				des.open(f);
				System.out.println("�����ɹ�");
			}
			catch(IOException e) {
				System.out.println("��Ϸ\"����֮·��������������\"�����ڻ��ʧ��");
			}
			break;
			
		case 2:								//2:�ƽ��˫�˰�
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("�ƽ��˫�˰�.html");
				des.open(f);
				System.out.println("�����ɹ�");
			}
			catch(IOException e) {
				System.out.println("��Ϸ\"�ƽ��˫�˰�\"�����ڻ��ʧ��");
			}
			break;
		
		case 3: 							//3:���С��ս��
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("���С��ս��.html");
				des.open(f);
				System.out.println("�����ɹ�");
			}
			catch(IOException e) {
				System.out.println("��Ϸ\"���С��ս��\"�����ڻ��ʧ��");
			}
			break;
			
		case 4: 							//4:��¥����
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("��¥����2.html");
				des.open(f);
				System.out.println("�����ɹ�");
			}
			catch(IOException e) {
				System.out.println("��Ϸ\"��¥����2\"�����ڻ��ʧ��");
			}
			break;
			
		case 5:								//5:˫��սʿ
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("˫��սʿ.html");
				des.open(f);
				System.out.println("�����ɹ�");
			}
			catch(IOException e) {
				System.out.println("��Ϸ\"˫��սʿ\"�����ڻ��ʧ��");
			}
			break;
		}
	}
}