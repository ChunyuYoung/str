package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Police extends JFrame implements ActionListener{
	JTextField txt = new JTextField("",10);
	JTextField txt1 = new JTextField("",10);
	Police(){
		super("�ı���س��¼�");
		setVisible(true);
		setSize(100,100);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		getContentPane().add(txt);
		add(txt1);
		txt1.setEditable(false);
		txt.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(txt)) {
			String s = e.getActionCommand();
			int n = Integer.valueOf(s);
//			System.out.println(n+"ƽ������:"+(n*n));		//�ڿ���̨���
			txt1.setText(n*n+"");						//�ڲ��ܱ༭���ı��������
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Police();
	}

}
