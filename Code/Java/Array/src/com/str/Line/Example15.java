package com.str.Line;

public class Example15 {

	//���߳�
	public static void main(String[] args) {
		//�����߳�
		Hello hello = new Hello();
		World world = new World();
		//�����߳�
		hello.start();
		world.start();
		//���߳��еķ���
		int n=0;
		while(n++<100)
			System.out.println(n+":Hello World!");
	}
}
