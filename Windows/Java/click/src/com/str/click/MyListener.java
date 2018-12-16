package com.str.click;
import java.awt.event.*;
public class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "点我啊")
			System.out.println("不要啊");
		if(e.getActionCommand() == "不要点我啊")
			System.out.println("啊啊啊啊啊啊啊啊,好疼");
		if(e.getActionCommand() == "轻点")
			System.out.println("K摸鸡一一一");
		if(e.getActionCommand() == "代码很简单么,多写几遍"){
			System.out.println("1--> jb.addActionListener(new MyListener()");
			System.out.println("2--> implements ActionListener");
			System.out.println("3--> public void actionPerformed(ActionEvent e)");
		}
		if(e.getActionCommand() == "没有了")
			System.out.println("没了");
	}
}
