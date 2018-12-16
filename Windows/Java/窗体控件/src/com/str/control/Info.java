package com.str.control;
import java.awt.*;
import javax.swing.*;
public class Info extends JFrame{

	public Info() {
		super("公司职员信息");
		setVisible(true);
		setSize(1000,200);				//窗口大小
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());	//边界式布局
		//setResizable(false);			//禁止调整布局
	}
	public static void main(String[] args) {
		Info in = new Info();	//窗体
		JPanel jp = new JPanel();	//第一行容器
		in.add(jp);
		
		jp.setLayout(new GridLayout(1,14));		//网格式布局
		jp.add(new JLabel("身份证号:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("姓名:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("性别:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("出生日期:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("籍贯:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("居住地:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("职工号:"));
		jp.add(new TextField("",10));
		jp.setLocation(0, 0);		//设置第一个布局的位置
		jp.setSize(1000, 50); 		//设置jp布局
		
		JPanel jpp = new JPanel();	//第二行容器
		BorderLayout bd = new BorderLayout(0,0);
		jpp.setLayout(bd); 		
		in.add(jpp);
		JButton jb1 = new JButton("操作");
		JButton jb2 = new JButton("退出");
		jpp.add(jb1,bd.WEST);
		jpp.add(jb2,bd.EAST);
		jpp.setLocation(0, 60);		//设置第二个布局的位置
		jpp.setSize(1000,50);		//设置第二个布局大小
		//jpp.setBackground(Color.BLACK);
	}
}
