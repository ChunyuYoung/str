package 猜大小_改进版;
import java.util.Scanner;
public class Number implements Runnable{
	int num,n; 	//num是获取输入整数,,,n是随机数
	Thread One,Two; 	//One线程和Two线程
	boolean b = false; 	//决定wait()是否执行
	
	public synchronized void run() { 	//线程同步
		n = (int)(Math.random()*100)+1; 	//获取包括1-100的整数
		Scanner sc = new Scanner(System.in); //获取一个整数
		One = new Thread(); //线程1
		Two = new Thread(); //线程2
		One.setName("One"); //线程的名字
		Two.setName("Two"); //线程2的名字
		
		//线程1
		if(Thread.currentThread().getName().equals(One)) {
			while(b == false) { //如果线程1等于false
				try {
					wait();
				}
				catch(InterruptedException e) {
					
				}
			}
			System.out.println("获取随机整数包括1-100");
			num = sc.nextInt();
			b = false;
		}
		
		//线程2
		if(Thread.currentThread().getName().equals(Two)) {
			while(b == true) {
				try {
					wait();
				}
				catch(InterruptedException e) {
					
				}
			}
			if(num > this.n)
				System.out.println("猜大了");
			else if(num < this.n)
				System.out.println("猜小了");
			else
				System.out.println("猜对了");
			b = true;
		}
		notifyAll();
	}
}