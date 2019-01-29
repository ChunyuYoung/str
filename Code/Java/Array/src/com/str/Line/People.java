package com.str.Line;

public class People extends Thread{
	StringBuffer str;	//定义这个字符串过滤流是为了使用getName来获取线程的名称
	People(String s,StringBuffer str){
		setName(s);		//设置线程名称
		this.str=str;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			str.append(getName()+","); 	//将当前线程的名字尾加到str
			/*str为共享资源可以被线程1和线程2所修饰,所以线程1输出线程1的名字后,当线程2执行时str被修改
			 * 因为使用了append函数的原因,在第一次输出自己的名字后在追加名字,这个追加的名字就会被线程2
			 * 所使用,所以出现了一个线程内有两个线程的名字
			 */
			System.out.println("我是"+getName()+",字符串为:"+str);	
			try {
				sleep(200); 	//中断200ms
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
