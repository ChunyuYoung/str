package com.str.Line;

//�����������
public class ComputerSun implements Runnable{
	int i=1,sum=0;
	public void run() {
		Thread threadOne = Thread.currentThread(); 		//��ȡ�̶߳���
		System.out.println(threadOne.getName()+"��ʼ����");
		while(i<=10) {
			sum+=i;
			System.out.println(""+sum);
			if(i==5) {
				System.out.println(threadOne.getName()+"���������!i="+i);
				//�߳�2
				Thread threadTwo = new Thread(this); 	//threadOne��threadTwoĿ�������ͬ
				threadTwo.setName("����");
				threadTwo.start();
				i++;	//���߳�1����֮ǰ����iΪ6
			}
			return; 	//�߳�1����
		}
		i++;
		try {
			Thread.sleep(300);
		}
		catch(InterruptedException e) {
			
		}
	}
}
