package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.*;
public class Registry extends JFrame implements ActionListener{
	//初始化组合框列表项目
	String s[]= {"T1701","T1702","T1703"};	
	
	//初始化控件
	JLabel BiaoTi_BiaoQian = new JLabel("用户注册");						//标签
	JLabel YongHuMing_BiaoQian = new JLabel("用户名");
	JLabel MiMa_BiaoQian = new JLabel("密码");
	JLabel QueRenMiMa_BiaoQian = new JLabel("确认密码");
	JLabel XingBie_BiaoQian = new JLabel("性别");
	JLabel NianLing_BiaoQian = new JLabel("年龄");
	JLabel SuoShuBanJi_BiaoQian = new JLabel("所属班级");
	TextField YongHuMing_BianJiKuang = new TextField("",15);			//编辑框
	TextField NianLing_BianJiKuang = new TextField("",15);
	JPasswordField MiMa_BianJiKuang = new JPasswordField("",15);		//密码框
	JPasswordField QueRenMiMa_BianJiKuang = new JPasswordField("",15);
	JRadioButton Nan_DanXuanAnNiu = new JRadioButton("男"); 				//单选按钮
	JRadioButton Nv_DanXuanAnNiu = new JRadioButton("女"); 				
	JComboBox SuoShuBanJi_ZuHeKuang = new JComboBox(s);
	JButton ZhuCe_AnNiu = new JButton("注册");							//取消
	JButton ChongZhi_AnNiu = new JButton("重置");
	JButton QuXiao_AnNiu = new JButton("取消");
	
	Registry(){
		//初始化窗体参数
		super("用户注册");
		setVisible(true);
		setSize(300,250);
		setLocation(683+400,384); 			//假设屏幕分辨率为1366*768
		setLayout(new GridLayout(8,1));
		setResizable(false);
		
		//初始化面板
		JPanel JPOne = new JPanel(new FlowLayout());		//标题
		JPanel JPTwo = new JPanel(new GridLayout(1,2));		//用户名
		JPanel JPThree = new JPanel(new GridLayout(1,2));	//密码
		JPanel JPFour = new JPanel(new GridLayout(1,2));	//确认密码
		JPanel JPFive = new JPanel(new GridLayout(1,3));	//性别
		JPanel JPSix = new JPanel(new GridLayout(1,2)); 	//年龄
		JPanel JPSeven = new JPanel(new GridLayout(1,2));	//所属班级
		JPanel JPEight = new JPanel(new GridLayout(1,3)); 	//按钮
		
		//向容器中添加面板
		getContentPane().add(JPOne);
		getContentPane().add(JPTwo);
		getContentPane().add(JPThree);
		getContentPane().add(JPFour);
		getContentPane().add(JPFive);
		getContentPane().add(JPSix);
		getContentPane().add(JPSeven);
		getContentPane().add(JPEight);
		
		//向面板中添加控件
		JPOne.add(BiaoTi_BiaoQian);								
		JPTwo.add(YongHuMing_BiaoQian);							
		JPTwo.add(YongHuMing_BianJiKuang);
		JPThree.add(MiMa_BiaoQian);
		JPThree.add(MiMa_BianJiKuang);
		JPFour.add(QueRenMiMa_BiaoQian);
		JPFour.add(QueRenMiMa_BianJiKuang);
		
		JPFive.add(XingBie_BiaoQian);
		JPFive.add(Nan_DanXuanAnNiu);
		JPFive.add(Nv_DanXuanAnNiu);
		
		JPSix.add(NianLing_BiaoQian);
		JPSix.add(NianLing_BianJiKuang);
		JPSeven.add(SuoShuBanJi_BiaoQian);
		JPSeven.add(SuoShuBanJi_ZuHeKuang);
		JPEight.add(ZhuCe_AnNiu);
		JPEight.add(ChongZhi_AnNiu);
		JPEight.add(QuXiao_AnNiu);
		
		//创建单选按钮组
		ButtonGroup DanXuanAnNiuZu = new ButtonGroup();
		DanXuanAnNiuZu.add(Nan_DanXuanAnNiu);
		DanXuanAnNiuZu.add(Nv_DanXuanAnNiu);
		
		//界面字体设置
		BiaoTi_BiaoQian.setFont(new Font("幼圆",Font.BOLD,20));
		YongHuMing_BianJiKuang.setFont(new Font("幼圆",Font.PLAIN,20));
		NianLing_BianJiKuang.setFont(new Font("幼圆",Font.PLAIN,20));
		YongHuMing_BiaoQian.setFont(new Font("黑体",Font.BOLD,15));
		MiMa_BiaoQian.setFont(new Font("黑体",Font.BOLD,15));
		QueRenMiMa_BiaoQian.setFont(new Font("黑体",Font.BOLD,15));
		XingBie_BiaoQian.setFont(new Font("黑体",Font.BOLD,15));
		NianLing_BiaoQian.setFont(new Font("黑体",Font.BOLD,15));
		SuoShuBanJi_BiaoQian.setFont(new Font("黑体",Font.BOLD,15));
		
		//绑定监听对象
		ZhuCe_AnNiu.addActionListener(this);
		ChongZhi_AnNiu.addActionListener(this);
		QuXiao_AnNiu.addActionListener(this);
		
	}
	//事件处理
	public void actionPerformed(ActionEvent e) {
		//获取用户信息
		String YongHuMing = YongHuMing_BianJiKuang.getText();	//获取用户名
		String MiMa = MiMa_BianJiKuang.getText(); 				//获取密码
		String QueRenMiMa = QueRenMiMa_BianJiKuang.getText(); 	//确认密码
		String NianLing = NianLing_BianJiKuang.getText();		//获取年龄
		
		//判断用户名是否为空,否则写入文件
		if(e.getSource() == ZhuCe_AnNiu) {
			if(YongHuMing_BianJiKuang.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "用户名不能为空", "错误", 0);
			}
			else {
				try {		//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt");
					fw.write(" "+YongHuMing);
					//关闭文件流
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//文件不存在
					JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt");	//创建文件
						fw.write(" "+YongHuMing);
						//关闭文件流
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
					}
				}
			}
		}
		//判断密码是否为空,否则写入文件
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			if(MiMa_BianJiKuang.equals("")) {
				JOptionPane.showMessageDialog(this, "密码不能为空", "错误", 0);
			}
			else {
				//判断两次输入的密码是否相等
				if(MiMa.equals(QueRenMiMa)) {
					try {		//文件存在
						FileReader fr = new FileReader("F:\\reg.txt");
						FileWriter fw = new FileWriter("F:\\reg.txt",true);
						fw.write(MiMa);
						//关闭文件流
						fr.close();
						fw.close();
					}
					catch(IOException ioe) {	//文件不存在
						JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
						try {
							FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
							fw.write(MiMa);
							//关闭文件流
							fw.close();
						}
						catch(IOException ioee) {
							JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
						}
					}
				}
				else
					JOptionPane.showMessageDialog(this, "错误两次输入的密码不同\n请检查并重新输入", "错误", 0);
			}
		}
		//判断年龄是否合法
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			int age = Integer.valueOf(NianLing); 					//类型转换
			if(NianLing == "")						//为空
				JOptionPane.showMessageDialog(this, "年龄不合法\n请检查", "错误", 0);
			if(age <18 && age > 85)			//年龄不合法
				JOptionPane.showMessageDialog(this, "年龄不合法\n请检查", "错误", 0);
			else {									//不为空且合法
				try {		//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write(NianLing);
					//关闭文件流
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//文件不存在
					JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
						fw.write(NianLing);
						//关闭文件流
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
					}
				}
			}
		}
		//判断性别
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			//男
			if(Nan_DanXuanAnNiu.isSelected() ? true:false) {	//判断是否被选中
				Nan_DanXuanAnNiu.setSelected(true);
				try {		//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("男生");
					fw.flush();
					//关闭文件流
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//文件不存在
					JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
						fw.write("男生");
						fw.flush();
						//关闭文件流
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
					}
				}
			}
			else {
				//女
				Nv_DanXuanAnNiu.setSelected(true);
				try {		//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("女生");
					fw.flush();
					//关闭文件流
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//文件不存在
					JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
						fw.write("女生");
						fw.flush();
						//关闭文件流
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
					}
				}
			}
		}
		//判断所属班级
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			int n = SuoShuBanJi_ZuHeKuang.getSelectedIndex();		//获取所属班级组合框列表项目
			switch(n) {
			case 0:
				try {		//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("T1701");
					fw.flush();
					//关闭文件流
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//文件不存在
					JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
						fw.write("T1701");
						fw.flush();
						//关闭文件流
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
					}
				}
				break;
			case 1:
				try {		//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("T1702");
					fw.flush();
					//关闭文件流
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//文件不存在
					JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
						fw.write("T1702");
						fw.flush();
						//关闭文件流
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
					}
				}
				break;
			case 2:
				try {		//文件存在
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("T1703");
					fw.flush();
					//关闭文件流
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//文件不存在
					JOptionPane.showMessageDialog(this,"找不到文件\n重新创建文件","错误",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
						fw.write("T1703");
						fw.flush();
						//关闭文件流
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
					}
				}
				break;
			}
		}
		//重置:清除所有内容
		if(e.getSource().equals(ChongZhi_AnNiu)) {
			YongHuMing_BianJiKuang.setText("");
			MiMa_BianJiKuang.setText("");
			QueRenMiMa_BianJiKuang.setText("");
			Nan_DanXuanAnNiu.setSelected(false);				//无效
			Nv_DanXuanAnNiu.setSelected(false);					//无效
			NianLing_BianJiKuang.setText("");
			SuoShuBanJi_ZuHeKuang.setSelectedIndex(0);			//默认选中项
		}
		//取消:关闭注册界面
		if(e.getSource().equals(QuXiao_AnNiu)) {
//			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);	//无效
			setVisible(false);		//隐藏窗体
		}
		//获取数据长度
		if(e.getSource().equals(ZhuCe_AnNiu)) {	
			//获取登陆信息长度-->类型转换:整数会乱码<--
			String YongHuMing_ChangDu = YongHuMing.length()+"";			//获取用户名长度
			String MiMa_ChangDu = MiMa.length()+"";						//获取密码长度
			//用户名:文本最后两位数
			try {
				FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
				fw.write(YongHuMing_ChangDu);
				fw.flush();
//				JOptionPane.showMessageDialog(this, YongHuMing_ChangDu, "Info", 1);	//验证
				//关闭文件流
				fw.close();
			}
			catch(IOException ioee) {
				JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
			}
			
			//密码:文本最后一位数
			try {
				FileWriter fw = new FileWriter("F:\\reg.txt",true);	//创建文件
				fw.write(MiMa_ChangDu);
				fw.flush();
//				JOptionPane.showMessageDialog(this, MiMa_ChangDu, "Info", 1);//验证
				//关闭文件流
				fw.close();
			}
			catch(IOException ioee) {
				JOptionPane.showMessageDialog(this,"文件创建失败","错误",0);
			}
		}
	}
}