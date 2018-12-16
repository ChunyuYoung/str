package com.str.control;
import java.awt.*;
import javax.swing.*;
public class control extends JFrame{
	public static void main(String args[]) {
		//创建窗体
		JFrame jf = new JFrame("233");
		JPanel jp = new JPanel();
		
		jf.setVisible(true);
		jf.setSize(250, 250);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setBackground(Color.green);
		jf.setLayout(null);
		//创建一个按钮
		JButton jb = new JButton("点我啊");
		jf.getContentPane().add(jb);	//将按钮添加到目前所获取到的容器中
		//jf.add(jb);
		jp.setLayout(null);
		jp.setBackground(Color.red);
		jp.setSize(100,100);
	
		//jf.getContentPane().add(jp);
		
	}
}
