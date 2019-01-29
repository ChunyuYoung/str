package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Mouse extends JFrame implements MouseListener{
	JTextField txt = new JTextField("",10);
	Mouse(){
		super("����¼�");
		setSize(600,100);
		setVisible(true);
		setLocationRelativeTo(null);
		txt.setFont(new Font("��Բ",Font.BOLD,20));
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(txt,BorderLayout.CENTER);
//		txt.setEnabled(false);
		txt.setText("����ʲô��?");
		txt.setBackground(Color.black);
		txt.setForeground(Color.GREEN);
		txt.addMouseListener(this);
	}
	//������ϰ������
	public void mousePressed(MouseEvent e) {
		txt.setText("������ϰ������");
	}
	//��������ͷ����
	public void mouseReleased(MouseEvent e) {
		txt.setText("��������ͷ����");
	}
	//�����������ʱ
	public void mouseEntered(MouseEvent e) {
		txt.setText("�������������\tX:"+e.getX()+"\tY:"+e.getY());
	}
	//������뿪���ʱ
	public void mouseExited(MouseEvent e) {
		txt.setText("����뿪���");
	}
	//������ϵ�������
	public void mouseClicked(MouseEvent e) {
		txt.setText("������ϵ�������");
	}
	public static void main(String args[]) {
		new Mouse();
	}
}