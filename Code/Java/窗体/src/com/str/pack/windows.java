package com.str.pack;
import java.awt.Button;
import java.awt.Color;
import javax.swing.*;

class f extends JFrame{
	
	public f(String s){
		super(s);	//标题
		this.setVisible(true);	//显示窗口
		//this.setBounds(100, 200, 300, 400);
		this.getContentPane().setBackground(Color.red);		//获取当前容器并设置背景颜色
		this.setSize(250, 250);			//界面尺寸
		this.setLocationRelativeTo(null);	//居中
	}
}
public class windows {
	public static void main(String[] args) {
		new f("123");
		JFrame f1 = new JFrame("233");
		f1.setVisible(true);	//窗口可视
		f1.getContentPane().setBackground(Color.green); 	//绿色
		f1.setSize(250, 250); 		//设置界面大小
		//f1.setLocationRelativeTo(null); 	//界面居中
		f1.setLocation(842+300,395);
	}
}