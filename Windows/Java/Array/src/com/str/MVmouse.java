package com.str;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class MVmouse extends JFrame implements MouseMotionListener{
	JButton jb = new JButton("据说我可以被拖动");
	JTextField txt1[] = new JTextField[3];
	JTextField txt2[] = new JTextField[3];
	JTextField txt3[] = new JTextField[3];
	MVmouse(){
		super("会动的控件真的存在吗?");
		setSize(300,300);
		setVisible(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jb);
		jb.addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub)
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		new MVmouse();
	}
}
