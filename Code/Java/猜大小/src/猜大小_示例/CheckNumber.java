package �´�С_ʾ��;
import java.util.Scanner;

public class CheckNumber implements Runnable {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public synchronized void run() {
        while (true) {
            DemoMain.number = scanner.nextInt();
            DemoMain.bool = false;
            if (DemoMain.number > DemoMain.randomNumber) {
                System.out.println("�´���");
            } else if (DemoMain.number < DemoMain.randomNumber) {
                System.out.println("��С��");
            } else {
                System.out.println("�¶���");
            }
            DemoMain.bool = true;
            notifyAll();
        }
    }

}
