package com.str.control;
import java.awt.*;
import javax.swing.*;
public class Bcontrol extends JFrame{
	 public Bcontrol() {
		 super("控件示例");
		 setVisible(true);
		 setSize(300,200);
		 setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		//实例化窗口对象
		Bcontrol bc = new Bcontrol();
		//实例化容器对象
		JPanel jp = new JPanel();
		//实例化控件对象
		//标签
		JLabel jl1 = new JLabel("欢迎使用考试系统");
		jl1.setFont(new Font("幼圆",Font.BOLD,30));
		//标签
		JLabel jl2 = new JLabel("用户名:");
		jl2.setFont(new Font("宋体",Font.BOLD,20));
		//用户名输入框
		JTextField jtf1 = new JTextField("",15);
		//标签
		JLabel jl3 = new JLabel("密    码:");
		jl3.setFont(new Font("宋体:",Font.BOLD,20));
		//密码输入框
		JPasswordField jpf = new JPasswordField("",15);
		jpf.setEchoChar('#');
		//登陆
		JButton jb1 = new JButton("登陆");
		//注册
		JButton jb2 = new JButton("注册");
		//退出
		JButton jb3 = new JButton("退出");
		//向主容器添加自定义容器
		bc.add(jp);
		//向自定义容器添加控件
		jp.add(jl1);
		jp.add(jl2);
		jp.add(jtf1);
		jp.add(jl3);
		jp.add(jpf);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
	}
}
