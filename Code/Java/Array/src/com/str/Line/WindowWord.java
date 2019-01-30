package com.str.Line;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowWord extends JFrame implements ActionListener,Runnable{
	//��ʼ���ؼ�
	JTextField inputText,showText;
	JLabel label = new JLabel("��ӭʹ�ñ��ֵ�");
	JButton fast = new JButton("���ٹ���");
	Thread scrollWord = null; 		//��������Ļ
	Police police; 					//������
	
	public WindowWord() {
		setLayout(new FlowLayout());
		scrollWord = new Thread(this);
		inputText = new JTextField(6);
		showText = new JTextField(6);
		label.setFont(new Font("����_GB2312",Font.BOLD,24));
		getContentPane().add(inputText);
		getContentPane().add(showText);
		getContentPane().add(fast);
		getContentPane().add(label);
		police = new Police();
		police.setJTextField(showText);
		inputText.addActionListener(police);
		fast.addActionListener(this);
		setBounds(100,100,400,280);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scrollWord.start(); 	//��AWT-Windwos�߳�������scrooWord�߳�
	}
	public void run() {
		while(true) {
			int x = label.getBounds().x;
			int y=50;
			x+=5;
			label.setLocation(x,y);
			if(x>380) {
				x=10;
				label.setLocation(x,y);
			}
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e) {
				
			}
			String str = inputText.getText();
			if(str.equals("end"))
				return; 	//�����߳�
		}
	}
	public void actionPerformed(ActionEvent e) {	//action Per formed
		scrollWord.interrupt(); 	//�������ߵ��߳�
	}
}