package ²Â´óÐ¡_Ê¾Àý;
import java.util.Scanner;

public class CheckNumber implements Runnable {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public synchronized void run() {
        while (true) {
            DemoMain.number = scanner.nextInt();
            DemoMain.bool = false;
            if (DemoMain.number > DemoMain.randomNumber) {
                System.out.println("ï¿½Â´ï¿½ï¿½ï¿½");
            } else if (DemoMain.number < DemoMain.randomNumber) {
                System.out.println("ï¿½ï¿½Ð¡ï¿½ï¿½");
            } else {
                System.out.println("ï¿½Â¶ï¿½ï¿½ï¿½");
            }
            DemoMain.bool = true;
            notifyAll();
        }
    }

}
