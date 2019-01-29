package com.str.Line;

//这是一个有问题的实例
public class Example19 {

	public static void main(String[] args) {
		ComputerSun computer = new ComputerSun();
		Thread threadOne = new Thread(computer);
		threadOne.setName("张三");
		threadOne.start();
	}
}
