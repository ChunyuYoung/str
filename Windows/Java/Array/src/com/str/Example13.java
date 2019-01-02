package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example13 extends JFrame{
	
	JLabel WenBenBiaoQian = new JLabel("文本框:");
	JTextField WenBenBianJiKuang = new JTextField("",10);
	JButton QueDingAnNiu = new JButton("确定");
	JCheckBox comYinYue = new 
	Example13(){
		super("常用组件");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//退出程序
		
	}
	public static void main(String[] args) {
		new Example13();
	}
}
