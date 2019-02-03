package 猜大小_改进版;
public class major {
	public static void main(String args[]) {
		Number number = new Number();
		Thread One = new Thread(number);
		Thread Two = new Thread(number);
		One.setName("One");
		Two.setName("Two");
		One.start();
		Two.start();
	}
}
