package com.str.Lines;
public class �̵߳�ͬ��{

	public static void main(String[] args) {
		lines lin = new lines();
		Thread ��Ǯ = new Thread(lin);
		Thread ȡǮ = new Thread(lin);
		��Ǯ.setName("��Ǯ");
		ȡǮ.setName("ȡǮ");
		��Ǯ.start();
		ȡǮ.start();
	}
}
