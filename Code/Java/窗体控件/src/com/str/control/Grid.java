package com.str.control;
import java.awt.*;
import javax.swing.*;
public class Grid extends JFrame{

	Grid(){
		super("GirdLayout");
		setVisible(true);
		setSize(300,200);
		setLocationRelativeTo(null);
		this.setResizable(false);
	}
	public static void main(String[] args) {
		Grid gr = new Grid();
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3,2));
		
		JButton b1 = new JButton("第六");
		JButton b2 = new JButton("第七");
		JPanel jpp = new JPanel();
		jp.add(jpp);
		jpp.setLayout(new GridLayout(1,2));
		jpp.add(b1);
		jpp.add(b2);
		
		gr.add(jp);
		jp.add(new JButton("第一个按钮"));
		jp.add(new JButton("第二个按钮"));
		jp.add(new JButton("第三个按钮"));
		jp.add(new JButton("第四个按钮"));
		jp.add(new JButton("第五个按钮"));
		jp.add(jpp);
		
	}
}
