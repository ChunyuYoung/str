package com.str.control;
import java.awt.*;
import javax.swing.*;
public class Info extends JFrame{

	public Info() {
		super("��˾ְԱ��Ϣ");
		setVisible(true);
		setSize(1000,200);				//���ڴ�С
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());	//�߽�ʽ����
		//setResizable(false);			//��ֹ��������
	}
	public static void main(String[] args) {
		Info in = new Info();	//����
		JPanel jp = new JPanel();	//��һ������
		in.add(jp);
		
		jp.setLayout(new GridLayout(1,14));		//����ʽ����
		jp.add(new JLabel("���֤��:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("����:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("�Ա�:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("��������:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("����:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("��ס��:"));
		jp.add(new TextField("",10));
		jp.add(new JLabel("ְ����:"));
		jp.add(new TextField("",10));
		jp.setLocation(0, 0);		//���õ�һ�����ֵ�λ��
		jp.setSize(1000, 50); 		//����jp����
		
		JPanel jpp = new JPanel();	//�ڶ�������
		BorderLayout bd = new BorderLayout(0,0);
		jpp.setLayout(bd); 		
		in.add(jpp);
		JButton jb1 = new JButton("����");
		JButton jb2 = new JButton("�˳�");
		jpp.add(jb1,bd.WEST);
		jpp.add(jb2,bd.EAST);
		jpp.setLocation(0, 60);		//���õڶ������ֵ�λ��
		jpp.setSize(1000,50);		//���õڶ������ִ�С
		//jpp.setBackground(Color.BLACK);
	}
}
