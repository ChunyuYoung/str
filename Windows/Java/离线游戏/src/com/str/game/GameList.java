//GameList.java
package com.str.game;

public class GameList {
	//��Ϸ������������
	public void List() {
		//��Ϸ����
		System.out.println("Game Caption:\t\t\tFlash & Brower Games Offline\t\t\tVersion:0.1.3");
		//�б�ͷ��
		for(int i=0;i<100;i++)
			System.out.print("=");
		System.out.println("\n"); 			//����
		//�б��в�
		for(int i=0;i<5;i++) {
			for(int j=0;j<35;j++) {
				System.out.print(" ");
			}
			//�б���Ŀ
			if(i==0)
				System.out.println("1.����֮·��������������");
			else if(i==1)
				System.out.println("2.�ƽ��˫�˰�");
			else if(i==2)
				System.out.println("3.���С��ս��");
			else if(i==3)
				System.out.println("4.��¥����");
			else if(i==4)
				System.out.println("5.˫��սʿ");
		}
		System.out.println();		//����
		//�б�β��
		for(int i=0;i<100;i++)
			System.out.print("=");	//����Ϸ�б�ײ��߿�
		System.out.println(); 		//����
	}
}
