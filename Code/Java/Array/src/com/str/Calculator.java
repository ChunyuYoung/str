package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener,ItemListener{
	//创建符号列表
	String str[] = {"+","-","*","/"};
	
	//创建操作符默认选中项
	String ch="+";
	
	//创建窗体控件
	JTextField txt1 = new JTextField("",6);
	JComboBox com1 = new JComboBox(str);
	JTextField txt2 = new JTextField("",6);
	JButton jb = new JButton("计算");
	JTextArea ta = new JTextArea(3,2);
	
	Calculator(){
		//初始化窗体设置
		super("简单的计算器");
		setVisible(true);
		setSize(300,200);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,1)); 	//创建表格式布局
		
		//初始化第一层面板
		JPanel jp = new JPanel(new FlowLayout());
		
		//添加第一层面板到容器第一层
		getContentPane().add(jp);
		
		//向面板中添加控件
		jp.add(txt1);
		jp.add(com1);
		jp.add(txt2);
		jp.add(jb);
		
		//向容器第二层添加控件
		getContentPane().add(ta);
		
		//绑定监听对象
		txt1.addActionListener(this);
		com1.addActionListener(this);
		txt2.addActionListener(this);
		jb.addActionListener(this);
		
		//初始化控件参数
		txt1.setFont(new Font("黑体",Font.BOLD,20));
		com1.setFont(new Font("黑体",Font.BOLD,20));
		txt2.setFont(new Font("黑体",Font.BOLD,20));
		jb.setFont(new Font("黑体",Font.BOLD,20));
		ta.setFont(new Font("黑体",Font.BOLD,20));
	}
	//注册监听器
	public void actionPerformed(ActionEvent e) {
		//初始化文本引用
		String s1 = txt1.getText();
		String s2 = txt2.getText();
		String s3="";
		
		//数据类型转换
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		
		//判断按钮是否被按下
		if(e.getSource().equals(jb)) {
			if(ch=="+")
				ta.setText(s3 = String.valueOf((f1+f2)));
			if(ch=="-")
				ta.setText(s3 = String.valueOf((f1-f2)));
			if(ch=="*")
				ta.setText(s3 = String.valueOf((f1*f2)));
			if(ch=="/")
				ta.setText(s3=String.valueOf((f1/f2)));
		}
		//判断下拉列表是否被选中
		if(e.getSource().equals(com1)) {
			switch(com1.getSelectedIndex()) {
			case 0:ch="+";break; 
			case 1:ch="-";break;
			case 2:ch="*";break;
			case 3:ch="/";break;
			}
		}
	}
	//注册特殊控件监听器
	public void itemStateChanged(ItemEvent e) {
		//不好用
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}
}