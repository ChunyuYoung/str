package 猜大小_Example;

public class Number implements Runnable{
	//初始化默认参数
	final int SMALLER = -1,LARGER = 1,SUCCESS = 8;
	int realNumber,guessNumber,min=0,max=100,message = SMALLER;
	boolean pleaseGuess = false,isGiveNumber = false; 
	Thread giveNumberThread,guessNumberThread; 				//初始化线程
	
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
	
	public synchronized void setMessage(int count) { 	//计次
		if(Thread.currentThread() == giveNumberThread && isGiveNumber == false) {
			realNumber = (int)(Math.random()*100)+1;
			System.out.println("获取随机正整数包括1-100");
			isGiveNumber = true;
			pleaseGuess = true;
	}
	//线程1
	if(Thread.currentThread() == giveNumberThread) {
		while(pleaseGuess == true) 
			try {
				wait();
			}
			catch(InterruptedException e) {
				
			}
			if(realNumber > guessNumber) {
				message = SMALLER;
				System.out.println("猜小了");
			}
			else if(realNumber < guessNumber) {
				message = LARGER;
				System.out.println("猜大了");
			}
			else {
				message = SUCCESS;
				System.out.println("猜对了");
			}
			pleaseGuess = true;
		}
	//线程2
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
				System.out.println(count+"次:"+guessNumber);
			}
			else if(message == LARGER) {
				max = guessNumber;
				guessNumber = (min+max)/2;
				System.out.println(count+"次:"+guessNumber);
			}
			pleaseGuess = false;
		}
	notifyAll();
	}
}
