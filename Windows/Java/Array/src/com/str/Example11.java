package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example11 extends JFrame {

	JMenuBar menubar = new JMenuBar();	//��Ӧ���ǲ˵���
	JMenu menu = new JMenu("���ǲ˵�"),subMenu = new JMenu("��Ҳ�ǲ˵�");
	JMenuItem item1 = new JMenuItem("����ǲ˵����˰�",new ImageIcon("a.jpg")),item2 = new JMenuItem("���Ҳ�ǲ˵���",new ImageIcon("b.gif"));
	Example11(){
		super("�ⲻ�ǵ�͵Ĳ˵�");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300,300);
		setLayout(new GridLayout(4,4));	//��������ʽ����
		this.getContentPane().add(menubar);
		menubar.add(menu);
		menu.add(item1);
		menu.addSeparator(); 	//�����ķָ���
		menu.add(item2);
		menu.add(subMenu); 		//Ƕ�ײ˵�Ϊ�Ӳ˵�
		subMenu.add(new JMenuItem("������Ӳ˵����˰�",new ImageIcon("c.gif")));
	}
	public static void main(String[] args) {
		new Example11();
	}

}
