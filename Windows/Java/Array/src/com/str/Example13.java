package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example13 extends JFrame{
	
	JLabel WenBenBiaoQian = new JLabel("�ı���:");
	JTextField WenBenBianJiKuang = new JTextField("",10);
	JButton QueDingAnNiu = new JButton("ȷ��");
	JCheckBox comYinYue = new 
	Example13(){
		super("�������");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//�˳�����
		
	}
	public static void main(String[] args) {
		new Example13();
	}
}
