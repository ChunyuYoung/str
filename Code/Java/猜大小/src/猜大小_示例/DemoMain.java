package 猜大小_示例;
public class DemoMain {
    public static Boolean bool; 
    public static int number;
    public static int randomNumber;
    public static void main(String[] args) {
        Thread randomThread = new Thread(new RandomNumber()); 			//创建线程1
        Thread checkNumberThread = new Thread(new CheckNumber());		//创建线程2
        randomThread.start();			//启动线程1
        checkNumberThread.start();		//启动线程2
    }
}
