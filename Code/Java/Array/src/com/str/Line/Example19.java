package com.str.Line;

//����һ���������ʵ��
public class Example19 {

	public static void main(String[] args) {
		ComputerSun computer = new ComputerSun();
		Thread threadOne = new Thread(computer);
		threadOne.setName("����");
		threadOne.start();
	}
}
