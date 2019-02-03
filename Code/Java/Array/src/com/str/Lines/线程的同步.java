package com.str.Lines;
public class 线程的同步{

	public static void main(String[] args) {
		lines lin = new lines();
		Thread 存钱 = new Thread(lin);
		Thread 取钱 = new Thread(lin);
		存钱.setName("存钱");
		取钱.setName("取钱");
		存钱.start();
		取钱.start();
	}
}
