package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{
	public GUI(){
		super("�û���¼");
		setSize(250,180);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
	}
	public static void main(String[] args) {
		GUI g = new GUI();		//����
		JPanel jp = new JPanel(new GridLayout(4,1));	//��ʼ����
		JPanel jpp = new JPanel(new GridLayout(1,2));		
		JPanel jppp = new JPanel(new GridLayout(1,2));	
		JPanel jpppp = new JPanel(new GridLayout(1,3));	//��ʽ����
		JLabel jl = new JLabel("��ӭʹ�ÿ���ϵͳ");
		jl.setFont(new Font("��Բ",Font.BOLD,20));		//������
		JLabel jll = new JLabel("�û���:");			//��ǩ
		TextField tf = new TextField("",10);		//�ı���

		JLabel jlll = new JLabel("��   ��:");			//��ǩ
		TextField tff = new TextField("",10);		//�ı���
		
		JButton jb = new JButton("��½");
		JButton jbb = new JButton("ע��");
		JButton jbbb = new JButton("ȡ��");
		
		g.add(jp);			//���	
		
		jp.add(jl);			//�����һ��
		
		jp.add(jpp);		//��һ��Ƕ�׵ڶ���
		
		jpp.add(jll);		//����ڶ���
		jpp.add(tf);		//��ǩ
		
		jp.add(jppp);		//�ڶ���Ƕ�׵�����
		
		jppp.add(jlll);		//��������㲼��
		jppp.add(tff);
		
		jp.add(jpppp);	//������Ƕ�׵��Ĳ�
		
		jpppp.add(jb);
		jpppp.add(jbb);
		jpppp.add(jbbb);	//���Ĳ㲼��
		
		jb.addActionListener(new GUI());
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == "��½")
			System.out.println("��½");
	}
}
