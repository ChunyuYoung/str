package com.str.Line;

public class Bank implements Runnable{
	private int number=0; 	//number����������ȫ�ֱ���
	public void setMoney(int m) {
		number=m;
	}
	Bank(){
		
	}
	//��дRunnable�ӿ��е�run����
	public void run() {
		while(true) {
			String name = Thread.currentThread().getName();		//currentThread()��ȡ��ǰ���������
			if(name.equals("One")) {
				if(number<=160) {
					System.out.println(name+"��������״̬");
					return; 	//threadOne��������
				}
				number+=10;		//����Ϊʲônumberû���������������ܱ�С��,����Ϊ�߳�2����������������ֵ������number���ȫ�ֱ���,Ȼ�����߳�1���в���ʱnumber�ͱ�С��
				System.out.println("����"+name+"���� number = "+number);
			}
			if(Thread.currentThread().getName().equals("Two")) {
				if(number<=0) {
					System.out.println(name+"��������״̬");
					return; 	//threadTwo��������
				}
				number-=100;
				System.out.println("����"+name+"����number="+number);
			}
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {		//Interr upted Exception
				
			}
		}
	}
}
