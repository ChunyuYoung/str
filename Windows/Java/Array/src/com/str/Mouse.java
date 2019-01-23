package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Mouse extends JFrame implements MouseListener{
	JTextField txt = new JTextField("",10);
	Mouse(){
		super("鼠标事件");
		setSize(600,100);
		setVisible(true);
		setLocationRelativeTo(null);
		txt.setFont(new Font("幼圆",Font.BOLD,20));
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(txt,BorderLayout.CENTER);
//		txt.setEnabled(false);
		txt.setText("这是什么啊?");
		txt.setBackground(Color.black);
		txt.setForeground(Color.GREEN);
		txt.addMouseListener(this);
	}
	//在组件上按下鼠标
	public void mousePressed(MouseEvent e) {
		txt.setText("在组件上按下鼠标");
	}
	//在组件上释放鼠标
	public void mouseReleased(MouseEvent e) {
		txt.setText("在组件上释放鼠标");
	}
	//在鼠标进入组件时
	public void mouseEntered(MouseEvent e) {
		txt.setText("鼠标进入组件坐标\tX:"+e.getX()+"\tY:"+e.getY());
	}
	//在鼠标离开组件时
	public void mouseExited(MouseEvent e) {
		txt.setText("鼠标离开组件");
	}
	//在组件上单击鼠标键
	public void mouseClicked(MouseEvent e) {
		txt.setText("在组件上单击鼠标键");
	}
	public static void main(String args[]) {
		new Mouse();
	}
}