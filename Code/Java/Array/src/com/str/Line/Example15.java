package com.str.Line;

public class Example15 {

	//主线程
	public static void main(String[] args) {
		//创建线程
		Hello hello = new Hello();
		World world = new World();
		//启动线程
		hello.start();
		world.start();
		//主线程中的方法
		int n=0;
		while(n++<100)
			System.out.println(n+":Hello World!");
	}
}
