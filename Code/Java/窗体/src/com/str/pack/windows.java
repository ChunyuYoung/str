package com.str.pack;
import java.awt.Button;
import java.awt.Color;
import javax.swing.*;

class f extends JFrame{
	
	public f(String s){
		super(s);	//����
		this.setVisible(true);	//��ʾ����
		//this.setBounds(100, 200, 300, 400);
		this.getContentPane().setBackground(Color.red);		//��ȡ��ǰ���������ñ�����ɫ
		this.setSize(250, 250);			//����ߴ�
		this.setLocationRelativeTo(null);	//����
	}
}
public class windows {
	public static void main(String[] args) {
		new f("123");
		JFrame f1 = new JFrame("233");
		f1.setVisible(true);	//���ڿ���
		f1.getContentPane().setBackground(Color.green); 	//��ɫ
		f1.setSize(250, 250); 		//���ý����С
		//f1.setLocationRelativeTo(null); 	//�������
		f1.setLocation(842+300,395);
	}
}