package com.str.control;
import java.awt.*;
import javax.swing.*;
public class control extends JFrame{
	public static void main(String args[]) {
		//��������
		JFrame jf = new JFrame("233");
		JPanel jp = new JPanel();
		
		jf.setVisible(true);
		jf.setSize(250, 250);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setBackground(Color.green);
		jf.setLayout(null);
		//����һ����ť
		JButton jb = new JButton("���Ұ�");
		jf.getContentPane().add(jb);	//����ť��ӵ�Ŀǰ����ȡ����������
		//jf.add(jb);
		jp.setLayout(null);
		jp.setBackground(Color.red);
		jp.setSize(100,100);
	
		//jf.getContentPane().add(jp);
		
	}
}
