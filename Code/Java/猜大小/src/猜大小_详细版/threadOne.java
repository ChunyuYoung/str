package 猜大小_详细版;
import java.util.Scanner;
//线程1
public class threadOne implements Runnable{
	Thread One;
	int n;
	String name = Thread.currentThread().getName();
	public synchronized void run() {
		if(name.equals("One")) {
			One = new Thread();
			One.setName("One:");
			Scanner src = new Scanner(System.in);
			n = src.nextInt();
			System.out.println(Thread.currentThread().getName()+n);
		}
	}
}
