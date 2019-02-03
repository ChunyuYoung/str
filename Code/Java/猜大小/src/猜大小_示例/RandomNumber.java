package 猜大小_示例;

import java.util.Scanner;

public class RandomNumber implements Runnable {
	private Scanner scanner = new Scanner(System.in);
    @Override
    public synchronized void run() {
        while (true) {
//            DemoMain.randomNumber = (int) (Math.random() * 100) + 1;
            while (DemoMain.bool == false) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("锟斤拷取锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�1-100");
            DemoMain.number = scanner.nextInt();
            DemoMain.bool = false;
        }
    }
}
