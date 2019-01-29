package com.str.Line;

public class Move implements Runnable{
	Move(){
		
	}
	public void run() {
		String name = Thread.currentThread().getName();		//获取线程对象的名字
		StringBuffer str = new StringBuffer();				//局部变量str
		for(int i=1;i<=3;i++) {
			if(name.equals("张三")) {
				str.append(name);	//每次都给str追加一个当前线程的名字,所以会随着次数的增加而增加
				System.out.println(name+"线程的局部变量i="+i+",str="+str);
			}
			else if(name.equals("李四")) {
				str.append(name);
				System.out.println(name+"线程的局部变量i="+i+",str="+str);
			}
			try {
				Thread.sleep(800); 		//休眠800ms
			}
			catch(InterruptedException e){
				System.out.println("其他线程中断了当前线程");
			}
		}
	}
}
