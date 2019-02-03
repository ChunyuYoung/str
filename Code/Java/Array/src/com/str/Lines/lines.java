package com.str.Lines;

public class lines implements Runnable{
	String name;
	int money;
	Thread 存钱 = new Thread();
	Thread 取钱 = new Thread();
	int number1=0;
	int number2=0;
	public synchronized void run() {
		name = Thread.currentThread().getName(); 	//获取当前正在执行线程的名称
		while(true) {
			if(name.equals("存钱")) {
				money+=100;
				System.out.println("存钱总金额:"+money+"万");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					
				}
				取钱.interrupt();
				number1++;
				if(number1 == 3) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						
					}
				}
			}
			else if(name.equals("取钱")) {
					money-=30;
					System.out.println("取钱剩余金额:"+money+"万");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						
					}
					number2++;
					if(number2 == 3) {
					存钱.interrupt();
					try {
						wait();
					}
					catch(InterruptedException e) {
						
					}
				}
			}
//			notifyAll();
		}
	}
}
