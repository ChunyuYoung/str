package com.str.control;
import java.awt.*;
import javax.swing.*;
public class Bcontrol extends JFrame{
	 public Bcontrol() {
		 super("�ؼ�ʾ��");
		 setVisible(true);
		 setSize(300,200);
		 setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		//ʵ�������ڶ���
		Bcontrol bc = new Bcontrol();
		//ʵ������������
		JPanel jp = new JPanel();
		//ʵ�����ؼ�����
		//��ǩ
		JLabel jl1 = new JLabel("��ӭʹ�ÿ���ϵͳ");
		jl1.setFont(new Font("��Բ",Font.BOLD,30));
		//��ǩ
		JLabel jl2 = new JLabel("�û���:");
		jl2.setFont(new Font("����",Font.BOLD,20));
		//�û��������
		JTextField jtf1 = new JTextField("",15);
		//��ǩ
		JLabel jl3 = new JLabel("��    ��:");
		jl3.setFont(new Font("����:",Font.BOLD,20));
		//���������
		JPasswordField jpf = new JPasswordField("",15);
		jpf.setEchoChar('#');
		//��½
		JButton jb1 = new JButton("��½");
		//ע��
		JButton jb2 = new JButton("ע��");
		//�˳�
		JButton jb3 = new JButton("�˳�");
		//������������Զ�������
		bc.add(jp);
		//���Զ���������ӿؼ�
		jp.add(jl1);
		jp.add(jl2);
		jp.add(jtf1);
		jp.add(jl3);
		jp.add(jpf);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
	}
}
