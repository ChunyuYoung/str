package �´�С_��ϸ��;
import java.util.Scanner;
//�߳�1
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
