package com.str.Line;

public class Bank implements Runnable{
	private int number=0; 	//number在这类中是全局变量
	public void setMoney(int m) {
		number=m;
	}
	Bank(){
		
	}
	//重写Runnable接口中的run方法
	public void run() {
		while(true) {
			String name = Thread.currentThread().getName();		//currentThread()获取当前对象的引用
			if(name.equals("One")) {
				if(number<=160) {
					System.out.println(name+"进入死亡状态");
					return; 	//threadOne方法结束
				}
				number+=10;		//这里为什么number没有做减法操作还能变小呢,是因为线程2在做完减法操作后把值赋给了number这个全局变量,然后在线程1进行操作时number就变小了
				System.out.println("我是"+name+"现在 number = "+number);
			}
			if(Thread.currentThread().getName().equals("Two")) {
				if(number<=0) {
					System.out.println(name+"进入死亡状态");
					return; 	//threadTwo方法结束
				}
				number-=100;
				System.out.println("我是"+name+"现在number="+number);
			}
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {		//Interr upted Exception
				
			}
		}
	}
}
