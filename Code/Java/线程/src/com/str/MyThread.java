package com.str;

public class MyThread extends Thread{		//�̵߳ļ̳�ʵ��
	public static void main(String args[]) {
		MyThread myt1 = new MyThread("One");
		MyThread myt2 = new MyThread("Two");
//		myt1.run();							//�����߳��������
//		myt2.run();
		myt1.start();
		myt2.start();
	}
	public MyThread(String s) {
		super(s);	//��ʼ���߳�����
		
	}
	public void run() {
		for(int i=0;i<100;i++)
			System.out.println(this.getName()+":"+i);
	}
}
//Java��֧��������ؼ̳�,��Ҫ�ӿ�ʵ��
class MT implements Runnable{				//�̵߳Ľӿ�ʵ��
	//ʹ���߳̽ӿ�ʱ������дrun����,���̳�����Ҫ
	public void run() {
		
	}
}