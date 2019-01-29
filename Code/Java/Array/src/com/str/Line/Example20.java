package com.str.Line;

public class Example20 {

	public static void main(String[] args) {
		Time time = new Time();
		Thread thread = new Thread(time);
		thread.start();
	}
}
