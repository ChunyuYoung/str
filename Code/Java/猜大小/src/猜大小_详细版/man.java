package 猜大小_详细版;

//主类
public class man {

	public static void main(String[] args) {	
		threadOne one = new threadOne();
		threadTwo two = new threadTwo();
		Thread One = new Thread(one);
		Thread Two = new Thread(two);
		One.start();
		Two.start();
	}
}
