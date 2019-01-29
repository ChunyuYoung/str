package com.str.Line;

//这个类有问题
public class ComputerSun implements Runnable{
	int i=1,sum=0;
	public void run() {
		Thread threadOne = Thread.currentThread(); 		//获取线程对象
		System.out.println(threadOne.getName()+"开始计算");
		while(i<=10) {
			sum+=i;
			System.out.println(""+sum);
			if(i==5) {
				System.out.println(threadOne.getName()+"完成任务了!i="+i);
				//线程2
				Thread threadTwo = new Thread(this); 	//threadOne和threadTwo目标对象相同
				threadTwo.setName("李四");
				threadTwo.start();
				i++;	//在线程1死亡之前递增i为6
			}
			return; 	//线程1死亡
		}
		i++;
		try {
			Thread.sleep(300);
		}
		catch(InterruptedException e) {
			
		}
	}
}
