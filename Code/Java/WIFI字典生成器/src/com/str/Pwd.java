package com.str;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Pwd extends JFrame implements ActionListener,FocusListener{
	//初始化列表数组
	String number[] = {"0","1","2","3","4","5","6","7","8","9"};
	
	//创建控件
	JLabel bq1 = new JLabel("最小位数");
	JLabel bq2 = new JLabel("最大位数");
	JLabel bq3 = new JLabel("文件大小");
	JTextField bjk = new JTextField("",6);
	JComboBox lbk1 = new JComboBox(number);
	JComboBox lbk2 = new JComboBox(number);
	JButton an = new JButton("生成字典");
	JTextField wbq = new JTextField("字典生成路径,默认在程序运行目录下");
	
	Pwd(){
		//初始化窗体参数
		super("WIFI纯数字密码字典生成器");
		setVisible(true);
		setSize(400,150);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		
		//初始化布局
		JPanel One = new JPanel(new GridLayout(3,1));
		JPanel Two = new JPanel(new GridLayout(1,4));
		JPanel Three = new JPanel(new GridLayout(1,3));
		JPanel Four = new JPanel(new GridLayout(1,1));
		
		//添加布局到容器
		getContentPane().add(One);
		One.add(Two);
		One.add(Three);
		One.add(Four);
		
		//添加控件到容器
		Two.add(bq1);
		Two.add(lbk1);
		Two.add(bq2);
		Two.add(lbk2);
		Three.add(bq3);
		Three.add(bjk);
		Three.add(an);
		Four.add(wbq);
		
		//控件参数设置
		bjk.setEditable(false);
		wbq.setFont(new Font("黑体",Font.BOLD,20));
		wbq.setEnabled(false);
		
		//绑定监听对象
		an.addActionListener(this);
		wbq.addFocusListener(this);
	}
	//事件源
	public void actionPerformed(ActionEvent e) {
		
		//按钮发生事件
		if(e.getSource().equals(an)) {
			//返回现行选中项
			int minNum;
			int maxNum;
			
			//获取字典长度
			int minNumLength=0;
			int maxNumLength=0;
			
			//获取字典最小长度和最大长度
			minNum = lbk1.getSelectedIndex();
			maxNum = lbk2.getSelectedIndex();
			
			//初始化字典最小长度
			switch(minNum) {
			case 0:
				JOptionPane.showMessageDialog(this, "最小长度不能为0", "信息", 1);
				break;
			}
			
			//初始化字典最大长度
			switch(maxNum) {
			case 0:
				JOptionPane.showMessageDialog(this, "长度太小", "信息", 1);
				break;
			case 1:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 9;
				break;
			case 2:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 99;
				break;
			case 3:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 999;
				break;
			case 4:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 9999;
				break;
			case 5:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 99999;
				break;
			case 6:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 999999;
				break;
			case 7:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 9999999;
				break;
			case 8:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 99999999;
				break;
			case 9:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "最大长度不能小于最小长度", "信息", 1);
				else
					maxNumLength = 999999999;
				break;
			}
			//字典计算
			/*猜测:可能赋值成功了,但是都被int识别为了一个0,可能需要转换成字符串累加
			 * 这可能会导致上面的操作被视为同一种
			 * int a = 0; 和  int a = 00000000;	可能在int看来都是0,这导致了最小数不能以000000开始
			 */
			while(maxNumLength >= minNumLength) {
//				System.out.println(maxNumLength +" "+ minNumLength);
				//minNumLength自增,然后每次循环都写入文件
				int n = minNumLength+1;
				String s="";
				try {
					FileWriter fw = new FileWriter("WifiWorlds.txt",true);
					BufferedWriter bfw = new BufferedWriter(fw);
					//===================================================
					//a=00000 == a=0处理方法
					minNumLength+=1;
					if(maxNum>=minNum) {
						//获取当前0的位数
						int x = maxNum-minNum;
						//解决int对一位以上的0不区别
						switch(x) {
						case 1:
							s="0";
							break;
						case 2:
							s="00";
							break;
						case 3:
							s="000";
							break;
						case 4:
							s="0000";
							break;
						case 5:
							s="00000";
							break;
						case 6:
							s="000000";
							break;
						case 7:
							s="0000000";
							break;
						case 8:
							s="00000000";
							break;
						case 9:
							s="000000000";
							break;
						}
						s=s+String.valueOf(minNumLength);
					}
					//仔细想想这一段加不加0好像都没什么意义
					//a=0-a=010,一样是001...009,010这样递增的,,先这样放着吧
					//a=00000 == a=0处理方法
					//===================================================
					fw.write(s+"\r\n");	//换行且当成字符串处理而不是字符
					fw.flush();
					fw.close();
					bfw.close();
				}
				catch(IOException ee) {
					JOptionPane.showMessageDialog(this, "文件创建失败", "错误", 0);
				}
			}
			//计算文件大小
			File f = new File("WifiWorlds.txt");
			bjk.setText((f.length() / 1024)+"KB");
			//设置文件路径
			if(wbq.getText() != "字典生成路径,默认在程序运行目录下") {
				wbq.setText("功能以后在实现,困得眼睛都睁不开了");
			}
		}
	}
	//获取焦点
	public void focusGained(FocusEvent e) {
		//清除文本区中的提示文字
		if(e.getSource().equals(wbq)) {
			if(wbq.getText().equals("字典生成路径,默认在程序运行目录下"))
				wbq.setText(null);
		}
	}
	//失去焦点
	public void focusLost(FocusEvent e) {
		//如果文本区中的文本为空时显示提示文字
		if(e.getSource().equals(wbq)) {
			if(wbq.getText().equals(""))
				wbq.setText("字典生成路径,默认在程序运行目录下");
		}
	}
	//主函数
	public static void main(String[] args) {
		new Pwd();
	}
}
