package com.str.Line;

public class Example16 {

	public static void main(String[] args) {
		People personOne,personTwo;
		StringBuffer str = new StringBuffer(); 	//线程共享str
		personOne = new People("张三",str);
		personTwo = new People("李四",str);
		personOne.start();
		personTwo.start();
	}

}
