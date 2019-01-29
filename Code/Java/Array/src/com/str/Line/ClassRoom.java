package com.str.Line;

public class ClassRoom implements Runnable{
	//首先定义两个线程
	Thread student,teacher;
	ClassRoom(){
		teacher = new Thread(this);
		student = new Thread(this);
		teacher.setName("雷老师");
		student.setName("障碍水");
	}
	public void run() {
		if(Thread.currentThread() == student) {
			try {
				System.out.println(student.getName()+"正在睡觉,不听课");
				Thread.sleep(1000*60*60); 		//1h
			}
			catch(InterruptedException e) {
				System.out.println(student.getName()+"被老师叫醒了");
			}
			System.out.println(student.getName()+"开始听课");
		}
		else if(Thread.currentThread() == teacher) {
			for(int i=1;i<=3;i++) {
				System.out.println("上课");
				try {
					Thread.sleep(500); 		//500ms
				}
				catch(InterruptedException e) {
					
				}
			}
			student.interrupt(); 	//吵醒student
		}
	}
}
