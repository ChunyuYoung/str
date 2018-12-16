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
		click cl = new click();		//窗体
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5,1));
		
		JButton jb = new JButton("点我啊");
		JButton jbb = new JButton("不要点我啊");
		JButton jbbb = new JButton("轻点");
		JButton jbbbb = new JButton("代码很简单么,多写几遍");
		JButton jbbbbb = new JButton("没有了");
		
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
