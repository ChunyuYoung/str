package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener,ItemListener{
	//���������б�
	String str[] = {"+","-","*","/"};
	
	//����������Ĭ��ѡ����
	String ch="+";
	
	//��������ؼ�
	JTextField txt1 = new JTextField("",6);
	JComboBox com1 = new JComboBox(str);
	JTextField txt2 = new JTextField("",6);
	JButton jb = new JButton("����");
	JTextArea ta = new JTextArea(3,2);
	
	Calculator(){
		//��ʼ����������
		super("�򵥵ļ�����");
		setVisible(true);
		setSize(300,200);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,1)); 	//�������ʽ����
		
		//��ʼ����һ�����
		JPanel jp = new JPanel(new FlowLayout());
		
		//��ӵ�һ����嵽������һ��
		getContentPane().add(jp);
		
		//���������ӿؼ�
		jp.add(txt1);
		jp.add(com1);
		jp.add(txt2);
		jp.add(jb);
		
		//�������ڶ�����ӿؼ�
		getContentPane().add(ta);
		
		//�󶨼�������
		txt1.addActionListener(this);
		com1.addActionListener(this);
		txt2.addActionListener(this);
		jb.addActionListener(this);
		
		//��ʼ���ؼ�����
		txt1.setFont(new Font("����",Font.BOLD,20));
		com1.setFont(new Font("����",Font.BOLD,20));
		txt2.setFont(new Font("����",Font.BOLD,20));
		jb.setFont(new Font("����",Font.BOLD,20));
		ta.setFont(new Font("����",Font.BOLD,20));
	}
	//ע�������
	public void actionPerformed(ActionEvent e) {
		//��ʼ���ı�����
		String s1 = txt1.getText();
		String s2 = txt2.getText();
		String s3="";
		
		//��������ת��
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		
		//�жϰ�ť�Ƿ񱻰���
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
		//�ж������б��Ƿ�ѡ��
		if(e.getSource().equals(com1)) {
			switch(com1.getSelectedIndex()) {
			case 0:ch="+";break; 
			case 1:ch="-";break;
			case 2:ch="*";break;
			case 3:ch="/";break;
			}
		}
	}
	//ע������ؼ�������
	public void itemStateChanged(ItemEvent e) {
		//������
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}
}