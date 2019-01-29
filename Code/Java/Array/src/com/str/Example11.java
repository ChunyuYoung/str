package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example11 extends JFrame {

	JMenuBar menubar = new JMenuBar();	//这应该是菜单条
	JMenu menu = new JMenu("这是菜单"),subMenu = new JMenu("这也是菜单");
	JMenuItem item1 = new JMenuItem("这就是菜单项了吧",new ImageIcon("a.jpg")),item2 = new JMenuItem("这个也是菜单项",new ImageIcon("b.gif"));
	Example11(){
		super("这不是点餐的菜单");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300,300);
		setLayout(new GridLayout(4,4));	//设置网格式布局
		this.getContentPane().add(menubar);
		menubar.add(menu);
		menu.add(item1);
		menu.addSeparator(); 	//华丽的分割线
		menu.add(item2);
		menu.add(subMenu); 		//嵌套菜单为子菜单
		subMenu.add(new JMenuItem("这就是子菜单项了吧",new ImageIcon("c.gif")));
	}
	public static void main(String[] args) {
		new Example11();
	}

}
