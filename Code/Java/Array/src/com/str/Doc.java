package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.event.*;
public  class Doc extends JFrame implements DocumentListener{
	//��ʼ���ı��ؼ�
	JTextArea ta1 = new JTextArea(4,3);
	JTextArea ta2 = new JTextArea(4,3);
	
	Doc(){
		//��ʼ�����ڲ���
		super("�ı�ά����");
		setVisible(true);
		setSize(400,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new GridLayout(2,1,0,10)); 		//���ñ�񲼾�Ϊ:����һ��,���ñ�񲼾����¼��Ϊ:10,������Ϊ:0
		getContentPane().add(ta1);
		getContentPane().add(ta2);
		
		//�󶨼�������
		ta1.getDocument().addDocumentListener(this);
		ta2.getDocument().addDocumentListener(this);
		
		//��ʼ���ı����е��ı������ʽ
		ta1.setFont(new Font("��Բ",Font.BOLD,20));
		ta2.setFont(new Font("����",Font.BOLD,20));
		
		
		//�����ı������е��ı�ά������ֹ�༭
		ta2.setEnabled(false);
	}
	//���ı����е��ı������ı�ʱ
	public void changedUpdate(DocumentEvent e) {
		String str = ta1.getText();
		String regex = "[\\s\\d\\p{Punct}]+";
		String words[] = str.split(regex);
		Arrays.sort(words);
		ta2.setText(null);
		for(String s:words)
			ta2.setText(s+",");
	}
	//���ı����е��ı���ɾ��ʱ
	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	//���ı����е��ı�����ʱ
	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Doc();
	}
}