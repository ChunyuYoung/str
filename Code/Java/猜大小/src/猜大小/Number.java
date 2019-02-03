package �´�С;
import java.util.Random;
import java.util.Scanner;
public class Number implements Runnable{
	Thread One = new Thread();
	Thread Two = new Thread();
	int n;
	String name;
	int input=0;
	
	public synchronized void run() {
		name = Thread.currentThread().getName();
		Scanner src = new Scanner(System.in);
		while(true) {
			n = (int)(Math.random()*100)+1; 	//��ȡ1-100�������
			if(name.equals("One")) {
				System.out.println("�߳�\""+name+"\"ִ��:");
				input = src.nextInt();
				try {
					wait();
				}
				catch(InterruptedException e) {
					
				}
			}
			else if(name.equals("Two")) {
				System.out.println("�߳�\""+name+"\"ִ��:");
				if(input > n)
					System.out.println("�´���");
				else if(input < n)
					System.out.println("��С��");
				else if(input == n)
					System.out.println("�¶���");
				try {
					wait();
				}
				catch(InterruptedException e) {
					
				}
			}
			notifyAll();
		}
	}
	
	public static void main(String[] args) {
		Number num = new Number();
		Thread One = new Thread(num);
		Thread Two = new Thread(num);
		One.setName("One");
		Two.setName("Two");
		One.start();
		Two.start();
	}
}
