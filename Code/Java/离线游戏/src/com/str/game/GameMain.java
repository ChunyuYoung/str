//GameMain.java
package com.str.game;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class GameMain {

	public static void main(String[] args){
		Scanner src = new Scanner(System.in);
		GameList style = new GameList();
		style.List();							//游戏启动器界面
		System.out.print("请输入你要打开的游戏编号:");
		int number=0;
		
		//判断输入是否合法
			try {
				number = src.nextInt();			//获取游戏编号
				if(number < 1 || number > 5) {
					System.out.println("你必须输入列表有的编号\n再给你一次输入的机会");
					number = src.nextInt();
				}	
			}
			catch(Exception e) {
				System.out.println("你必须输入列表中的编号");
			}
		System.out.println();					//换行
		//获取游戏启动编号
		switch(number) {
		case 1:						//1.勇者之路精灵物语速升版
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("勇者之路精灵物语速升版.html");
				des.open(f);
				System.out.println("启动成功");
			}
			catch(IOException e) {
				System.out.println("游戏\"勇者之路精灵物语速升版\"不存在或打开失败");
			}
			break;
			
		case 2:								//2:黄金矿工双人版
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("黄金矿工双人版.html");
				des.open(f);
				System.out.println("启动成功");
			}
			catch(IOException e) {
				System.out.println("游戏\"黄金矿工双人版\"不存在或打开失败");
			}
			break;
		
		case 3: 							//3:疯狂小人战斗
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("疯狂小人战斗.html");
				des.open(f);
				System.out.println("启动成功");
			}
			catch(IOException e) {
				System.out.println("游戏\"疯狂小人战斗\"不存在或打开失败");
			}
			break;
			
		case 4: 							//4:高楼爆破
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("高楼爆破2.html");
				des.open(f);
				System.out.println("启动成功");
			}
			catch(IOException e) {
				System.out.println("游戏\"高楼爆破2\"不存在或打开失败");
			}
			break;
			
		case 5:								//5:双刃战士
			try {
				Desktop des = Desktop.getDesktop();
				File f = new File("双刃战士.html");
				des.open(f);
				System.out.println("启动成功");
			}
			catch(IOException e) {
				System.out.println("游戏\"双刃战士\"不存在或打开失败");
			}
			break;
		}
	}
}