package com.str;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;

public class Login extends JFrame implements ActionListener {
	//��ʼ���ؼ�
	JLabel BiaoTi_BiaoQian = new JLabel("��ӭʹ�ÿ���ϵͳ");
	JLabel YongHuMing_BiaoQian = new JLabel("�û���");
	JLabel MiMa_BiaoQian = new JLabel("����");
	TextField YongHuMing_BianJiKuang = new TextField("",15);	
	JPasswordField MiMa_BianJiKuang = new JPasswordField("",15);
	JButton DengLu_AnNiu = new JButton("��½");
	JButton ZhuCe_AnNiu = new JButton("ע��");
	JButton QuXiao_AnNiu = new JButton("ȡ��");
	
	Login(){
		//��ʼ������Ĭ�ϲ���
		super("�û���¼");
		setVisible(true);
		setSize(300,170);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4,1));
		setResizable(false);
		//��ʼ�����
		JPanel JPOne = new JPanel(new FlowLayout());		//�������
		JPanel JPTwo = new JPanel(new GridLayout(1,2));
		JPanel JPThree = new JPanel(new GridLayout(1,2));
		JPanel JPFour = new JPanel(new GridLayout(1,3));
		//�����嵽����
		getContentPane().add(JPOne);
		getContentPane().add(JPTwo);
		getContentPane().add(JPThree);
		getContentPane().add(JPFour);
		//��ӿؼ������
		JPOne.add(BiaoTi_BiaoQian); 					//��һ��
		JPTwo.add(YongHuMing_BiaoQian);					//�ڶ���
		JPTwo.add(YongHuMing_BianJiKuang);				
		JPThree.add(MiMa_BiaoQian); 					//������
		JPThree.add(MiMa_BianJiKuang);
		JPFour.add(DengLu_AnNiu); 						//������
		JPFour.add(ZhuCe_AnNiu);
		JPFour.add(QuXiao_AnNiu);
		//���ô��ڽ�������
		BiaoTi_BiaoQian.setFont(new Font("��Բ",Font.BOLD,25));
		YongHuMing_BianJiKuang.setFont(new Font("����",Font.PLAIN,20));
		MiMa_BianJiKuang.setFont(new Font("����",Font.PLAIN,20));
		YongHuMing_BiaoQian.setFont(new Font("��Բ",Font.BOLD,20));
		MiMa_BiaoQian.setFont(new Font("��Բ",Font.BOLD,20));
		//�󶨼�������
		ZhuCe_AnNiu.addActionListener(this);
		DengLu_AnNiu.addActionListener(this);
	}
	//�¼�����
	public void actionPerformed(ActionEvent e) {
		String YongHuMing = YongHuMing_BianJiKuang.getText();
		String MiMa = MiMa_BianJiKuang.getText();
		//ע�ᴰ��
		if(e.getSource().equals(ZhuCe_AnNiu))
			new Registry();
		
		//�ж��û����Ƿ�Ϸ�
		if(e.getSource().equals(DengLu_AnNiu)) {
			//�ж��û����Ƿ�Ϊ��
			if(YongHuMing_BianJiKuang.getText().equals(""))	//Ϊ��
				JOptionPane.showMessageDialog(this, "�û�������Ϊ��", "����", 0);
			else {		//��Ϊ��
				try {						//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");	//��ȡ
					DataInputStream dis = new DataInputStream(new FileInputStream("F:\\reg.txt"));
					File f = new File("F:\\reg.txt");
					String fLength = f.length()-1+"";
					int fl = Integer.valueOf(fLength);
					int n=0;
					int ch[] = new int[fl]; 		//�����ļ�������󳤶�
					if((n=dis.read()) != -1) {
						for(int i=0;i<ch.length;i++) {
							ch[i] = dis.read();	
							System.out.println(ch[i]);
						}
					}
					//ȡע���û�������
					int YongHuMing_Dec = ch[ch.length-2];
					char YongHuMing_ChangDu_ch = (char)YongHuMing_Dec;
					String YongHuMing_ChangDu_s  =  String.valueOf(YongHuMing_ChangDu_ch);
					int YongHuMing_ChangDu = Integer.valueOf(YongHuMing_ChangDu_s);
					
					System.out.println("ȡ�û�������:"+YongHuMing_ChangDu);		//��֤
					int syhm[] = new int[YongHuMing_ChangDu];			//ȡ�ļ��е��û���--dec
					for(int i=0;i<YongHuMing_ChangDu;i++) {
						syhm[i] = ch[i];
					}
					for(int i=0;i<YongHuMing_ChangDu;i++)
						System.out.println("ȡ�����û���ʮ����:"+syhm[i]);
				}
				catch(IOException ee) {		//�ļ�������
					JOptionPane.showMessageDialog(this, "�����ļ�������", "��Ϣ", 1);
				}
			}
		}
	}
	public static void main(String[] args) {
		new Login(); 		//��½�������
	}
}