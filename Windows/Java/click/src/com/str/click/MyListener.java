package com.str.click;
import java.awt.event.*;
public class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "���Ұ�")
			System.out.println("��Ҫ��");
		if(e.getActionCommand() == "��Ҫ���Ұ�")
			System.out.println("����������������,����");
		if(e.getActionCommand() == "���")
			System.out.println("K����һһһ");
		if(e.getActionCommand() == "����ܼ�ô,��д����"){
			System.out.println("1--> jb.addActionListener(new MyListener()");
			System.out.println("2--> implements ActionListener");
			System.out.println("3--> public void actionPerformed(ActionEvent e)");
		}
		if(e.getActionCommand() == "û����")
			System.out.println("û��");
	}
}
