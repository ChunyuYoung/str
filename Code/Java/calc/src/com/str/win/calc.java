package com.str.win;
import java.awt.*;
import javax.swing.*;
public class calc extends JFrame{
	public calc(){
		super("calc");
		setSize(250,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
	}
	public static void main(String[] args) {
		calc ca = new calc();	//´°Ìו

		JPanel jp = new JPanel();
		JPanel jpp = new JPanel();
		JPanel jppp = new JPanel();
		BorderLayout bl = new BorderLayout();
		GridLayout gl = new GridLayout(2,1);
		GridLayout gll = new GridLayout(4,4);
		
		//TextField tf = new TextField("",20);
		
		ca.add(jp,bl.CENTER);
//		jp.setBackground(Color.black);
		jp.add(jpp);
		jp.setLayout(gl);
//		jp.setSize(300,100);
		jpp.add(new TextField("",30));
		jpp.add(jppp);
		jppp.setLayout(gll);
//		jppp.setSize(300, 300);
		jppp.add(new JButton("1"));
		jppp.add(new JButton("2"));
		jppp.add(new JButton("3"));
		jppp.add(new JButton("4"));
		jppp.add(new JButton("5"));
		jppp.add(new JButton("6"));
		jppp.add(new JButton("7"));
		jppp.add(new JButton("8"));
		jppp.add(new JButton("9"));
		jppp.add(new JButton("0"));
		jppp.add(new JButton("+"));
		jppp.add(new JButton("-"));
		jppp.add(new JButton("*"));
		jppp.add(new JButton("/"));
		jppp.add(new JButton("."));
		jppp.add(new JButton("ACE"));
	}
}
