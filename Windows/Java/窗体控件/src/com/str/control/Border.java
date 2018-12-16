package com.str.control;
import java.awt.*;
import javax.swing.*;
public class Border extends JFrame{
	public Border() {
		super("Border Layout");
		setVisible(true);
		setSize(300,200);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]) {
		Border bo = new Border();
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(0,5));
		JButton jb = new JButton("打我啊");
		
		bo.add(jp);
		jp.add(jb,BorderLayout.NORTH);
		jp.add(new JButton("别打我"),BorderLayout.SOUTH);
		jp.add(new JButton("打啊"),BorderLayout.WEST);
		jp.add(new JButton("别啊"),BorderLayout.EAST);
		jp.add(new TextArea("",5,50),BorderLayout.CENTER);
	}
}
