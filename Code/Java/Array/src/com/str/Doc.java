package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.event.*;
public  class Doc extends JFrame implements DocumentListener{
	//初始化文本控件
	JTextArea ta1 = new JTextArea(4,3);
	JTextArea ta2 = new JTextArea(4,3);
	
	Doc(){
		//初始化窗口参数
		super("文本维护区");
		setVisible(true);
		setSize(400,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new GridLayout(2,1,0,10)); 		//设置表格布局为:两行一列,设置表格布局上下间距为:10,横向间距为:0
		getContentPane().add(ta1);
		getContentPane().add(ta2);
		
		//绑定监听对象
		ta1.getDocument().addDocumentListener(this);
		ta2.getDocument().addDocumentListener(this);
		
		//初始化文本区中的文本字体格式
		ta1.setFont(new Font("幼圆",Font.BOLD,20));
		ta2.setFont(new Font("黑体",Font.BOLD,20));
		
		
		//设置文本区二中的文本维护区禁止编辑
		ta2.setEnabled(false);
	}
	//当文本区中的文本发生改变时
	public void changedUpdate(DocumentEvent e) {
		String str = ta1.getText();
		String regex = "[\\s\\d\\p{Punct}]+";
		String words[] = str.split(regex);
		Arrays.sort(words);
		ta2.setText(null);
		for(String s:words)
			ta2.setText(s+",");
	}
	//当文本区中的文本被删除时
	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	//当文本区中的文本增加时
	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Doc();
	}
}