package com.str.Line;

public class Example16 {

	public static void main(String[] args) {
		People personOne,personTwo;
		StringBuffer str = new StringBuffer(); 	//�̹߳���str
		personOne = new People("����",str);
		personTwo = new People("����",str);
		personOne.start();
		personTwo.start();
	}

}
