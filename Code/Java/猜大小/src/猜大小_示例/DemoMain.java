package �´�С_ʾ��;
public class DemoMain {
    public static Boolean bool; 
    public static int number;
    public static int randomNumber;
    public static void main(String[] args) {
        Thread randomThread = new Thread(new RandomNumber()); 			//�����߳�1
        Thread checkNumberThread = new Thread(new CheckNumber());		//�����߳�2
        randomThread.start();			//�����߳�1
        checkNumberThread.start();		//�����߳�2
    }
}
