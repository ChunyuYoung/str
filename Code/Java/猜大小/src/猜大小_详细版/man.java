package �´�С_��ϸ��;

//����
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
