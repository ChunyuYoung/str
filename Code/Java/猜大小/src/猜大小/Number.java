package 猜大小;
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
			n = (int)(Math.random()*100)+1; 	//获取1-100的随机数
			if(name.equals("One")) {
				System.out.println("线程\""+name+"\"执行:");
				input = src.nextInt();
				try {
					wait();
				}
				catch(InterruptedException e) {
					
				}
			}
			else if(name.equals("Two")) {
				System.out.println("线程\""+name+"\"执行:");
				if(input > n)
					System.out.println("猜大了");
				else if(input < n)
					System.out.println("猜小了");
				else if(input == n)
					System.out.println("猜对了");
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
