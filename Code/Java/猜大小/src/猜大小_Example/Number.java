package �´�С_Example;

public class Number implements Runnable{
	//��ʼ��Ĭ�ϲ���
	final int SMALLER = -1,LARGER = 1,SUCCESS = 8;
	int realNumber,guessNumber,min=0,max=100,message = SMALLER;
	boolean pleaseGuess = false,isGiveNumber = false; 
	Thread giveNumberThread,guessNumberThread; 				//��ʼ���߳�
	
	Number(){
		giveNumberThread = new Thread(this);
		guessNumberThread = new Thread(this);
	}
	public void run() {
		for(int count =1;true;count++) {
			setMessage(count);
			if(message == SUCCESS)
				return;
		}
	}
	
	public synchronized void setMessage(int count) { 	//�ƴ�
		if(Thread.currentThread() == giveNumberThread && isGiveNumber == false) {
			realNumber = (int)(Math.random()*100)+1;
			System.out.println("��ȡ�������������1-100");
			isGiveNumber = true;
			pleaseGuess = true;
	}
	//�߳�1
	if(Thread.currentThread() == giveNumberThread) {
		while(pleaseGuess == true) 
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
			if(realNumber > guessNumber) {
				message = SMALLER;
				System.out.println("��С��");
			}
			else if(realNumber < guessNumber) {
				message = LARGER;
				System.out.println("�´���");
			}
			else {
				message = SUCCESS;
				System.out.println("�¶���");
			}
			pleaseGuess = true;
		}
	//�߳�2
	if(Thread.currentThread() == guessNumberThread && isGiveNumber == true){
		while(pleaseGuess == false)
			try {
				wait();
			}
			catch(InterruptedException e) {
					
			}
		
			if(message == SMALLER) {
				min = guessNumber;
				guessNumber = (min+max)/2;
				System.out.println(count+"��:"+guessNumber);
			}
			else if(message == LARGER) {
				max = guessNumber;
				guessNumber = (min+max)/2;
				System.out.println(count+"��:"+guessNumber);
			}
			pleaseGuess = false;
		}
	notifyAll();
	}
}
