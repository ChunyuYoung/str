package com.str.Line;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Time implements Runnable{
	public void run() {
		int time =0;
		SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
		while(true) {
			Date date = new Date(); 	//定义在循环外就会一直打印一个值
			System.out.println(m.format(date));
			time++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				if(time == 3) {
					Thread thread = Thread.currentThread();
					thread = new Thread(this);
					thread.start();
				}
			}
		}
	}
}