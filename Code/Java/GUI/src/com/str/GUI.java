package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{
	public GUI(){
		super("用户登录");
		setSize(250,180);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
	}
	public static void main(String[] args) {
		GUI g = new GUI();		//界面
		JPanel jp = new JPanel(new GridLayout(4,1));	//初始布局
		JPanel jpp = new JPanel(new GridLayout(1,2));		
		JPanel jppp = new JPanel(new GridLayout(1,2));	
		JPanel jpppp = new JPanel(new GridLayout(1,3));	//流式布局
		JLabel jl = new JLabel("欢迎使用考试系统");
		jl.setFont(new Font("幼圆",Font.BOLD,20));		//加载慢
		JLabel jll = new JLabel("用户名:");			//标签
		TextField tf = new TextField("",10);		//文本框

		JLabel jlll = new JLabel("密   码:");			//标签
		TextField tff = new TextField("",10);		//文本框
		
		JButton jb = new JButton("登陆");
		JButton jbb = new JButton("注册");
		JButton jbbb = new JButton("取消");
		
		g.add(jp);			//外层	
		
		jp.add(jl);			//网格第一层
		
		jp.add(jpp);		//第一层嵌套第二层
		
		jpp.add(jll);		//网格第二层
		jpp.add(tf);		//标签
		
		jp.add(jppp);		//第二层嵌套第三层
		
		jppp.add(jlll);		//网格第三层布局
		jppp.add(tff);
		
		jp.add(jpppp);	//第三层嵌套第四层
		
		jpppp.add(jb);
		jpppp.add(jbb);
		jpppp.add(jbbb);	//第四层布局
		
		jb.addActionListener(new GUI());
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == "登陆")
			System.out.println("登陆");
	}
}
