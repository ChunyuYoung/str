package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class reg extends JFrame implements ActionListener{
	public reg() {
		//初始化窗体设置
		super("注册");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
		String stuClass[] = new String[]{"T1701","T1702","T1703"};			//所属班级
		//初始化布局
		JPanel jp = new JPanel(new GridLayout(8,1));			//外层
		JPanel jpp = new JPanel(new GridLayout(1,1));			//1.标签
		JPanel jppp = new JPanel(new GridLayout(1,2));			//2.用户名
		JPanel jpppp = new JPanel(new GridLayout(1,2));			//3.密码
		JPanel jppppp = new JPanel(new GridLayout(1,2)); 		//4.确认密码
		JPanel jpppppp = new JPanel(new GridLayout(1,3));		//5.性别
		JPanel jppppppp = new JPanel(new GridLayout(1,2)); 		//6.年龄
		JPanel jpppppppp = new JPanel(new GridLayout(1,2));		//7.所属班级
		JPanel jppppppppp = new JPanel(new GridLayout(1,3)); 	//8.按钮
		//创建控件和面板
		JLabel 			jb = new JLabel("用户注册");		//标题
		JLabel 			jbb = new JLabel("用户名:");				//用户名
		TextField 		jbbb = new TextField("",10);			//文本框
		JLabel 			jbbbb = new JLabel("密码:");					//标签
		JPasswordField 	jbbbbb = new JPasswordField("",10);			//密码框 
		JLabel 			jbbbbbb = new JLabel("确认密码:");				//标签
		JPasswordField  jbbbbbbb = new JPasswordField("",10);			//确认密码
		JLabel 			jbbbbbbbb = new JLabel("性别:");						//性别
		JRadioButton 	jbbbbbbbbb = new JRadioButton("男"); 				//单选钮
		JRadioButton 	jbbbbbbbbbb = new JRadioButton("女");				//单选钮
		JLabel 			jbbbbbbbbbbb = new JLabel("年龄:");		 				//标签
		TextField 		jbbbbbbbbbbbb = new TextField("",20);					//文本框
		JLabel 			jbbbbbbbbbbbbb = new JLabel("所属班级:"); 					//标签
		JComboBox 		jbbbbbbbbbbbbbb = new JComboBox(stuClass);						//组合框
		JButton 		jbbbbbbbbbbbbbbb = new JButton("注册");								//注册
		JButton 		jbbbbbbbbbbbbbbbb = new JButton("重置");								//重置
		JButton 		jbbbbbbbbbbbbbbbbb = new JButton("取消");							//取消
		//初始化文本字体
		jb.setFont(new Font("幼圆",Font.BOLD,30));
		//向容器中添加面板
		getContentPane().add(jp);
		jp.add(jpp);
		jp.add(jppp);
		jp.add(jpppp);
		jp.add(jppppp);
		jp.add(jpppppp);
		jp.add(jppppppp);
		jp.add(jpppppppp);
		jp.add(jppppppppp);
		//向面板中添加控件
		jpp.add(jb);						//标题
		jppp.add(jbb);						//用户名
		jppp.add(jbbb);
		jpppp.add(jbbbb);					//密码框
		jpppp.add(jbbbbb);
		jppppp.add(jbbbbbb);				//确认密码
		jppppp.add(jbbbbbbb);
		jpppppp.add(jbbbbbbbb);				//性别
		jpppppp.add(jbbbbbbbbb);
		jpppppp.add(jbbbbbbbbbb);
		jppppppp.add(jbbbbbbbbbbb);			//年龄
		jppppppp.add(jbbbbbbbbbbbb);
		jpppppppp.add(jbbbbbbbbbbbbb);		//标签
		jpppppppp.add(jbbbbbbbbbbbbbb);		//组合框[数组]
		jppppppppp.add(jbbbbbbbbbbbbbbb);	//注册
		jppppppppp.add(jbbbbbbbbbbbbbbbb);	//重置
		jppppppppp.add(jbbbbbbbbbbbbbbbbb);	//取消
		
		//绑定监听对象
		jbbbbbbbbb.addActionListener(this);			//单选框-->男
		jbbbbbbbbbb.addActionListener(this); 		//单选框-->女
		
		//注册信息
//		reg r = new reg();
//		try {	//文件存在
//			FileInputStream fi = new FileInputStream("C:\\reg.ini");
//			JOptionPane.showMessageDialog(r, "配置文件状态:已存在[良好]", "信息:已注册", 1);
//		}
//		catch(FileNotFoundException e) {	//文件不存在
//			JOptionPane.showMessageDialog(r, "配置文件状态:不存在[糟糕的]\n重新创建配置文件", "严重错误:未注册:", 0);
//			try {
//				FileOutputStream fos = new FileOutputStream("CC:\\reg.ini");		//创建配置文件
//				String yhm = jbb.getText();		//获取用户名文本框中的内容
//				//FileWriter fw =new FileWriter("CC:\\reg.ini");
//			}
//			catch(FileNotFoundException ee) {
//				JOptionPane.showMessageDialog(r, "配置文件状态:不存在[糟糕的]\n重新创建配置文件", "严重错误:", 0);
//			}
//		}
	}
	//当组件被按下时调用
	public void actionPerformed(ActionEvent e) {
		boolean b = (e.getSource() == "男");
		boolean bb = (e.getSource() == "女");
		if((b == bb) == false ? false : true)		//为假时执行
			JOptionPane.showMessageDialog(this, "两个单选按钮只能选择一个", "信息", 1);
	}
	public static void main(String args) {
//		reg r = new reg();
//		try {	//文件存在
//			FileInputStream fi = new FileInputStream("C:\\reg.ini");
//			JOptionPane.showMessageDialog(r, "配置文件状态:已存在[良好]", "信息:已注册", 1);
//		}
//		catch(FileNotFoundException e) {	//文件不存在
//			JOptionPane.showMessageDialog(r, "配置文件状态:不存在[糟糕的]\n重新创建配置文件", "严重错误:未注册:", 0);
//			try {
//				FileOutputStream fo = new FileOutputStream("CC:\\reg.ini");		//创建配置文件
//			}
//			catch(FileNotFoundException ee) {
//				JOptionPane.showMessageDialog(r, "配置文件状态:不存在[糟糕的]\n重新创建配置文件", "严重错误:", 0);
//			}
//		}
	}
}
