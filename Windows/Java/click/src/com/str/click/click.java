package com.str.click;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class click extends JFrame{
	public click() {
		super("click");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	public static void main(String[] args) {
		click cl = new click();		//����
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5,1));
		
		JButton jb = new JButton("���Ұ�");
		JButton jbb = new JButton("��Ҫ���Ұ�");
		JButton jbbb = new JButton("���");
		JButton jbbbb = new JButton("����ܼ�ô,��д����");
		JButton jbbbbb = new JButton("û����");
		
		jb.addActionListener(new MyListener());
		jbb.addActionListener(new MyListener());
		jbbb.addActionListener(new MyListener());
		jbbbb.addActionListener(new MyListener());
		jbbbbb.addActionListener(new MyListener());
		
		cl.add(jp);
		jp.add(jb);
		jp.add(jbb);
		jp.add(jbbb);
		jp.add(jbbbb);
		jp.add(jbbbbb);
	}
	
}
