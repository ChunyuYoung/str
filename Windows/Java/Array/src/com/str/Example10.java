package com.str;
import java.awt.*;
import javax.swing.*;
public class Example10 extends JFrame{

	Example10(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window1 = new JFrame("��һ������");
		JFrame window2 = new JFrame("�ڶ�������");
		Container con = window1.getContentPane();
		con.setBackground(Color.YELLOW);
		window1.setBounds(60,100,188,108);
		window2.setBounds(260, 100, 188, 108);
		window1.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//�ر�������
		window2.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//�ر���������е����д���
	}

}
