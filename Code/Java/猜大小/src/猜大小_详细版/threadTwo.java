package �´�С_��ϸ��;

//�߳�2
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
				System.out.println("�´���");
			else if(One.n < this.n)
				System.out.println("��С��");
			else
				System.out.println("�¶���");
		}
	}
}
