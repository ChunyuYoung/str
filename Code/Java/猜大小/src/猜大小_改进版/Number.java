package �´�С_�Ľ���;
import java.util.Scanner;
public class Number implements Runnable{
	int num,n; 	//num�ǻ�ȡ��������,,,n�������
	Thread One,Two; 	//One�̺߳�Two�߳�
	boolean b = false; 	//����wait()�Ƿ�ִ��
	
	public synchronized void run() { 	//�߳�ͬ��
		n = (int)(Math.random()*100)+1; 	//��ȡ����1-100������
		Scanner sc = new Scanner(System.in); //��ȡһ������
		One = new Thread(); //�߳�1
		Two = new Thread(); //�߳�2
		One.setName("One"); //�̵߳�����
		Two.setName("Two"); //�߳�2������
		
		//�߳�1
		if(Thread.currentThread().getName().equals(One)) {
			while(b == false) { //����߳�1����false
				try {
					wait();
				}
				catch(InterruptedException e) {
					
				}
			}
			System.out.println("��ȡ�����������1-100");
			num = sc.nextInt();
			b = false;
		}
		
		//�߳�2
		if(Thread.currentThread().getName().equals(Two)) {
			while(b == true) {
				try {
					wait();
				}
				catch(InterruptedException e) {
					
				}
			}
			if(num > this.n)
				System.out.println("�´���");
			else if(num < this.n)
				System.out.println("��С��");
			else
				System.out.println("�¶���");
			b = true;
		}
		notifyAll();
	}
}