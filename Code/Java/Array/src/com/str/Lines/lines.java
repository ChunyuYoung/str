package com.str.Lines;

public class lines implements Runnable{
	String name;
	int money;
	Thread ��Ǯ = new Thread();
	Thread ȡǮ = new Thread();
	int number1=0;
	int number2=0;
	public synchronized void run() {
		name = Thread.currentThread().getName(); 	//��ȡ��ǰ����ִ���̵߳�����
		while(true) {
			if(name.equals("��Ǯ")) {
				money+=100;
				System.out.println("��Ǯ�ܽ��:"+money+"��");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					
				}
				ȡǮ.interrupt();
				number1++;
				if(number1 == 3) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						
					}
				}
			}
			else if(name.equals("ȡǮ")) {
					money-=30;
					System.out.println("ȡǮʣ����:"+money+"��");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						
					}
					number2++;
					if(number2 == 3) {
					��Ǯ.interrupt();
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
