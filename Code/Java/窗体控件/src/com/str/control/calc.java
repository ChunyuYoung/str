package com.str.control;
import java.awt.*;
import javax.swing.*;
public class calc extends JFrame{

	public calc() {
		super("计算器(布局的嵌套)");
		setSize(600,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	public static void main(String[] args) {
		calc ca = new calc();
		ca.setLayout(new GridLayout(2,1));
		
		ca.add(new TextArea("",4,4));
	}
}
