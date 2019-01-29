package com.str.Line;

public class World extends Thread{
	public void run() {
		int n=0;
		while(n++<100)
			System.out.println(n+":World");
	}
}
