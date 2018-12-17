package com.str;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;

public class Login extends JFrame implements ActionListener {
	
	//初始化控件
	JLabel BiaoTi_BiaoQian = new JLabel("欢迎使用考试系统");
	JLabel YongHuMing_BiaoQian = new JLabel("用户名");
	JLabel MiMa_BiaoQian = new JLabel("密码");
	TextField YongHuMing_BianJiKuang = new TextField("",15);	
	JPasswordField MiMa_BianJiKuang = new JPasswordField("",15);
	JButton DengLu_AnNiu = new JButton("登陆");
	JButton ZhuCe_AnNiu = new JButton("注册");
	JButton QuXiao_AnNiu = new JButton("取消");
	
	Login(){
		//初始化窗体默认参数
		super("用户登录");
		setVisible(true);
		setSize(300,170);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,1));
		setResizable(false);
		
		//用户提示
		JOptionPane.showMessageDialog(this, "-->注册/登陆<--\n严格区分大小写", "信息", 1);
		
		//初始化面板
		JPanel JPOne = new JPanel(new FlowLayout());		//标题居中
		JPanel JPTwo = new JPanel(new GridLayout(1,2));
		JPanel JPThree = new JPanel(new GridLayout(1,2));
		JPanel JPFour = new JPanel(new GridLayout(1,3));
		
		//添加面板到容器
		getContentPane().add(JPOne);
		getContentPane().add(JPTwo);
		getContentPane().add(JPThree);
		getContentPane().add(JPFour);
		
		//添加控件到面板
		JPOne.add(BiaoTi_BiaoQian); 					//第一行
		JPTwo.add(YongHuMing_BiaoQian);					//第二行
		JPTwo.add(YongHuMing_BianJiKuang);				
		JPThree.add(MiMa_BiaoQian); 					//第三行
		JPThree.add(MiMa_BianJiKuang);
		JPFour.add(DengLu_AnNiu); 						//第四行
		JPFour.add(ZhuCe_AnNiu);
		JPFour.add(QuXiao_AnNiu);
		
		//设置窗口界面字体
		BiaoTi_BiaoQian.setFont(new Font("幼圆",Font.BOLD,25));
		YongHuMing_BianJiKuang.setFont(new Font("宋体",Font.PLAIN,20));
		MiMa_BianJiKuang.setFont(new Font("宋体",Font.PLAIN,20));
		YongHuMing_BiaoQian.setFont(new Font("幼圆",Font.BOLD,20));
		MiMa_BiaoQian.setFont(new Font("幼圆",Font.BOLD,20));
		
		//绑定监听对象
		ZhuCe_AnNiu.addActionListener(this);
		DengLu_AnNiu.addActionListener(this);
		QuXiao_AnNiu.addActionListener(this);
		
	}
	//事件处理
	public void actionPerformed(ActionEvent e) {
		String YongHuMing = YongHuMing_BianJiKuang.getText();
		String MiMa = MiMa_BianJiKuang.getText();
		
		//设置用户名和密码默认为假
		boolean byhm = false,bmm = false;
		
		//注册窗口
		if(e.getSource().equals(ZhuCe_AnNiu))
			new Registry();
		
		
		//判断用户名是否合法
		if(e.getSource().equals(DengLu_AnNiu)) {
			//判断用户名是否为空
			if(YongHuMing_BianJiKuang.getText().equals(""))	//为空
				JOptionPane.showMessageDialog(this, "用户名不能为空", "错误", 0);
			else {		//不为空
				try {						//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");	//读取
					DataInputStream dis = new DataInputStream(new FileInputStream("F:\\reg.txt"));
					File f = new File("F:\\reg.txt");
					String fLength = f.length()-1+"";
					int fl = Integer.valueOf(fLength);
					int n=0;
					int ch[] = new int[fl]; 		//假设文件数据最大长度
					if((n=dis.read()) != -1) {
						for(int i=0;i<ch.length;i++) {
							ch[i] = dis.read();	
//							System.out.println(ch[i]);
						}
					}
					
					//取注册用户名长度
					int YongHuMing_Dec = ch[ch.length-2];
					char YongHuMing_ChangDu_ch = (char)YongHuMing_Dec;
					String YongHuMing_ChangDu_s  =  String.valueOf(YongHuMing_ChangDu_ch);
					int YongHuMing_ChangDu = Integer.valueOf(YongHuMing_ChangDu_s);
					
//					System.out.println("取用户名长度:"+YongHuMing_ChangDu);		//验证
					int syhm[] = new int[YongHuMing_ChangDu];			//取文件中的用户名--dec
					for(int i=0;i<YongHuMing_ChangDu;i++) {
						syhm[i] = ch[i];
					}
					char str[] = new char[syhm.length];
					for(int i=0;i<YongHuMing_ChangDu;i++) {		//dec-->char-->string		
//						System.out.println("取出的用户名十进制:"+(char)syhm[i]);			//验证获取到的用户名
						str[i] =(char)syhm[i];	
					}
					
					//用户名字符数组转换字符串
					StringBuffer sb = new StringBuffer();
					for(int i=0;i<syhm.length;i++) {
						sb.append(str[i]);
					}
//					System.out.println("用户名_字符数组转换字符串:"+sb);		//验证
					String fyhm = sb.toString();
					
					//判断用户名是否与配置文件中的用户名相等
//					if(fyhm != YongHuMing){
//						JOptionPane.showMessageDialog(this, "用户名错误或不存在", "错误", 0);	
//						YongHuMing_BianJiKuang.setText("");
//					}
					 if(fyhm.equals(YongHuMing) && (YongHuMing_BianJiKuang.getText() != "" && MiMa_BianJiKuang.getText() != "")){
						 YongHuMing = fyhm;
						byhm = true;	//用户名正确
					}
//					System.out.println("YongHuMing:"+YongHuMing+"\n"+"fyhm:"+fyhm);		//验证
					//关闭流
					fr.close();
					dis.close();
				}
				catch(IOException ee) {		//文件不存在
					JOptionPane.showMessageDialog(this, "配置文件不存在", "信息", 1);
				}
			}
		}
		
		//判断密码是否合法
		if(e.getSource().equals(DengLu_AnNiu)) {
			//判断密码是否为空
			if(MiMa_BianJiKuang.getText().equals(""))		//为空
				JOptionPane.showMessageDialog(this, "密码不能为空", "错误", 0);
			else {		//不为空
				try {
					FileReader fr = new FileReader("F:\\reg.txt");	//读取
					DataInputStream dis = new DataInputStream(new FileInputStream("F:\\reg.txt"));
					File f = new File("F:\\reg.txt");
					String fLength = f.length()-1+"";
					int fl = Integer.valueOf(fLength);
					int n=0;
					int ch[] = new int[fl]; 		//假设文件数据最大长度
					if((n=dis.read()) != -1) {
						for(int i=0;i<ch.length;i++) {
							ch[i] = dis.read();	
//							System.out.println(ch[i]);
						}
					}
					//取注册用户名长度
					int YongHuMing_Dec = ch[ch.length-2];
					char YongHuMing_ChangDu_ch = (char)YongHuMing_Dec;
					String YongHuMing_ChangDu_s  =  String.valueOf(YongHuMing_ChangDu_ch);
					int YongHuMing_ChangDu = Integer.valueOf(YongHuMing_ChangDu_s);
						
					//取密码长度
					int MiMa_Dec = ch[ch.length-1];					//获取配置文件记录的密码长度
					char MiMa_ChangDu_ch = (char)MiMa_Dec;			//将配置文件中的密码长度解析为实际可用长度位字符
					String MiMa_ChangDu_s  =  String.valueOf(MiMa_ChangDu_ch);	//转换密码实际长度为字符串
					int MiMa_ChangDu = Integer.valueOf(MiMa_ChangDu_s);			//转换密码实际长度为整数
//					System.out.println("取密码长度:"+MiMa_ChangDu);			//验证
					
					//取文件中的密码十进制整数
					int smm[] = new int[MiMa_ChangDu];
					for(int i=0;i<MiMa_ChangDu;i++) {
						smm[i] = ch[YongHuMing_ChangDu];
//						System.out.println("密码:"+smm[i]);		//验证
						YongHuMing_ChangDu++;
					}
					
					//dec-->char
					char cmm[] = new char[MiMa_ChangDu];
					for(int i=0;i<MiMa_ChangDu;i++) {
						cmm[i] = (char)smm[i];
//						System.out.println("dec-->char\t"+cmm[i]);		//验证
					}
					
					//用密码字符数组转换字符串
					StringBuffer sb = new StringBuffer();
					for(int i=0;i<cmm.length;i++)
						sb.append(cmm[i]);
//					System.out.println("密码_字符数组转换字符串:"+sb);		//验证
					String mm = sb.toString();
					
					//判断密码是否与配置文件中的密码相等
//					if(mm != MiMa){
//						JOptionPane.showMessageDialog(this, "密码错误或不存在", "错误", 0);	
//						MiMa_BianJiKuang.setText("");
//					}
					 if(mm.equals(MiMa)) {
						 MiMa = mm;
						bmm = true;
					}
					//关闭流
					fr.close();
					dis.close();
				}
				catch(IOException ee) {
					JOptionPane.showMessageDialog(this, "找不到配置文件", "错误", 0);
				}
			}
		}
		//获取用户和密码匹配成功状态
		if(e.getSource().equals(DengLu_AnNiu)) {
			if(YongHuMing_BianJiKuang.getText() != "" && MiMa_BianJiKuang.getText() != "") {
				if(((byhm == true) && (bmm == true)) == true && (YongHuMing_BianJiKuang.getText() != "" && MiMa_BianJiKuang.getText() != "")){
					JOptionPane.showMessageDialog(this, "登陆成功", "信息", 1);
				}
				else if(byhm != bmm){
					JOptionPane.showMessageDialog(this, "用户不存在或输入错误", "登录失败", 1);
				}
				else{
					JOptionPane.showMessageDialog(this, "非法操作", "信息", 1);
				}
			}
			else
				JOptionPane.showMessageDialog(this, "登陆失败", "信息", 1);
		}
		//取消:退出程序
		if(e.getSource().equals(QuXiao_AnNiu)) {
			setVisible(false);
		}
	}
	public void windowListener(WindowListener e) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Login(); 		//登陆窗体界面
	}
}