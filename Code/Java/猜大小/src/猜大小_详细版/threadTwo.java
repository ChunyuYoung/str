package 猜大小_详细版;

//线程2
public class threadTwo implements Runnable{
	Thread Two;
	threadOne One;
	numRandom rand;
	int n;
	String name = Thread.currentThread().getName();
	public synchronized void run() {
		if(name.equals("Two")) {
			Two = new Thread();
			Two.setName("Two");
			One = new threadOne();
			rand = new numRandom();
			n = rand.num;
			if(One.n > this.n)
				System.out.println("猜大了");
			else if(One.n < this.n)
				System.out.println("猜小了");
			else
				System.out.println("猜对了");
		}
	}
}
