package com.str.click;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class button extends JFrame{
	public button() {
		super("Button Click");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]) {
		button bu = new button();
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(2,1));
		JButton jb = new JButton("µ„Œ“∞°");
		TextField txt = new TextField("",20);
		button_click my = new button_click();
		
		bu.add(jp);
		jp.add(jb);
		jp.add(txt);
		
		jb.addKeyListener(my);
		
	}
}
