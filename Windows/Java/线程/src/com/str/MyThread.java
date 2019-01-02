package com.str;

public class MyThread extends Thread{		//线程的继承实现
	public static void main(String args[]) {
		MyThread myt1 = new MyThread("One");
		MyThread myt2 = new MyThread("Two");
//		myt1.run();							//创建线程运行入口
//		myt2.run();
		myt1.start();
		myt2.start();
	}
	public MyThread(String s) {
		super(s);	//初始化线程名称
		
	}
	public void run() {
		for(int i=0;i<100;i++)
			System.out.println(this.getName()+":"+i);
	}
}
//Java不支持子类多重继承,需要接口实现
class MT implements Runnable{				//线程的接口实现
	//使用线程接口时必须重写run方法,而继承则不需要
	public void run() {
		
	}
}