package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class reg extends JFrame implements ActionListener{
	public reg() {
		//��ʼ����������
		super("ע��");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
		String stuClass[] = new String[]{"T1701","T1702","T1703"};			//�����༶
		//��ʼ������
		JPanel jp = new JPanel(new GridLayout(8,1));			//���
		JPanel jpp = new JPanel(new GridLayout(1,1));			//1.��ǩ
		JPanel jppp = new JPanel(new GridLayout(1,2));			//2.�û���
		JPanel jpppp = new JPanel(new GridLayout(1,2));			//3.����
		JPanel jppppp = new JPanel(new GridLayout(1,2)); 		//4.ȷ������
		JPanel jpppppp = new JPanel(new GridLayout(1,3));		//5.�Ա�
		JPanel jppppppp = new JPanel(new GridLayout(1,2)); 		//6.����
		JPanel jpppppppp = new JPanel(new GridLayout(1,2));		//7.�����༶
		JPanel jppppppppp = new JPanel(new GridLayout(1,3)); 	//8.��ť
		//�����ؼ������
		JLabel 			jb = new JLabel("�û�ע��");		//����
		JLabel 			jbb = new JLabel("�û���:");				//�û���
		TextField 		jbbb = new TextField("",10);			//�ı���
		JLabel 			jbbbb = new JLabel("����:");					//��ǩ
		JPasswordField 	jbbbbb = new JPasswordField("",10);			//����� 
		JLabel 			jbbbbbb = new JLabel("ȷ������:");				//��ǩ
		JPasswordField  jbbbbbbb = new JPasswordField("",10);			//ȷ������
		JLabel 			jbbbbbbbb = new JLabel("�Ա�:");						//�Ա�
		JRadioButton 	jbbbbbbbbb = new JRadioButton("��"); 				//��ѡť
		JRadioButton 	jbbbbbbbbbb = new JRadioButton("Ů");				//��ѡť
		JLabel 			jbbbbbbbbbbb = new JLabel("����:");		 				//��ǩ
		TextField 		jbbbbbbbbbbbb = new TextField("",20);					//�ı���
		JLabel 			jbbbbbbbbbbbbb = new JLabel("�����༶:"); 					//��ǩ
		JComboBox 		jbbbbbbbbbbbbbb = new JComboBox(stuClass);						//��Ͽ�
		JButton 		jbbbbbbbbbbbbbbb = new JButton("ע��");								//ע��
		JButton 		jbbbbbbbbbbbbbbbb = new JButton("����");								//����
		JButton 		jbbbbbbbbbbbbbbbbb = new JButton("ȡ��");							//ȡ��
		//��ʼ���ı�����
		jb.setFont(new Font("��Բ",Font.BOLD,30));
		//��������������
		getContentPane().add(jp);
		jp.add(jpp);
		jp.add(jppp);
		jp.add(jpppp);
		jp.add(jppppp);
		jp.add(jpppppp);
		jp.add(jppppppp);
		jp.add(jpppppppp);
		jp.add(jppppppppp);
		//���������ӿؼ�
		jpp.add(jb);						//����
		jppp.add(jbb);						//�û���
		jppp.add(jbbb);
		jpppp.add(jbbbb);					//�����
		jpppp.add(jbbbbb);
		jppppp.add(jbbbbbb);				//ȷ������
		jppppp.add(jbbbbbbb);
		jpppppp.add(jbbbbbbbb);				//�Ա�
		jpppppp.add(jbbbbbbbbb);
		jpppppp.add(jbbbbbbbbbb);
		jppppppp.add(jbbbbbbbbbbb);			//����
		jppppppp.add(jbbbbbbbbbbbb);
		jpppppppp.add(jbbbbbbbbbbbbb);		//��ǩ
		jpppppppp.add(jbbbbbbbbbbbbbb);		//��Ͽ�[����]
		jppppppppp.add(jbbbbbbbbbbbbbbb);	//ע��
		jppppppppp.add(jbbbbbbbbbbbbbbbb);	//����
		jppppppppp.add(jbbbbbbbbbbbbbbbbb);	//ȡ��
		
		//�󶨼�������
		jbbbbbbbbb.addActionListener(this);			//��ѡ��-->��
		jbbbbbbbbbb.addActionListener(this); 		//��ѡ��-->Ů
		
		//ע����Ϣ
//		reg r = new reg();
//		try {	//�ļ�����
//			FileInputStream fi = new FileInputStream("C:\\reg.ini");
//			JOptionPane.showMessageDialog(r, "�����ļ�״̬:�Ѵ���[����]", "��Ϣ:��ע��", 1);
//		}
//		catch(FileNotFoundException e) {	//�ļ�������
//			JOptionPane.showMessageDialog(r, "�����ļ�״̬:������[����]\n���´��������ļ�", "���ش���:δע��:", 0);
//			try {
//				FileOutputStream fos = new FileOutputStream("CC:\\reg.ini");		//���������ļ�
//				String yhm = jbb.getText();		//��ȡ�û����ı����е�����
//				//FileWriter fw =new FileWriter("CC:\\reg.ini");
//			}
//			catch(FileNotFoundException ee) {
//				JOptionPane.showMessageDialog(r, "�����ļ�״̬:������[����]\n���´��������ļ�", "���ش���:", 0);
//			}
//		}
	}
	//�����������ʱ����
	public void actionPerformed(ActionEvent e) {
		boolean b = (e.getSource() == "��");
		boolean bb = (e.getSource() == "Ů");
		if((b == bb) == false ? false : true)		//Ϊ��ʱִ��
			JOptionPane.showMessageDialog(this, "������ѡ��ťֻ��ѡ��һ��", "��Ϣ", 1);
	}
	public static void main(String args) {
//		reg r = new reg();
//		try {	//�ļ�����
//			FileInputStream fi = new FileInputStream("C:\\reg.ini");
//			JOptionPane.showMessageDialog(r, "�����ļ�״̬:�Ѵ���[����]", "��Ϣ:��ע��", 1);
//		}
//		catch(FileNotFoundException e) {	//�ļ�������
//			JOptionPane.showMessageDialog(r, "�����ļ�״̬:������[����]\n���´��������ļ�", "���ش���:δע��:", 0);
//			try {
//				FileOutputStream fo = new FileOutputStream("CC:\\reg.ini");		//���������ļ�
//			}
//			catch(FileNotFoundException ee) {
//				JOptionPane.showMessageDialog(r, "�����ļ�״̬:������[����]\n���´��������ļ�", "���ش���:", 0);
//			}
//		}
	}
}
