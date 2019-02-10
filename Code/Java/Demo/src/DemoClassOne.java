import java.util.Scanner;
public class DemoClassOne {
    public static int number;
    public static void main(String args[]){

        int numberRandom = (int)(Math.random()*100)+1;  //获取随机数
        Scanner input = new Scanner(System.in);
        Object obj = new Object();
        //线程1
        Thread One = new Thread(){
          public void run(){
              System.out.println("猜数字:输入一个整数");
              number = input.nextInt();
              synchronized (obj){
                  obj.notify();
              }
          }
        };

        //线程2
        Thread Two = new Thread(){
          public void run(){
              synchronized (obj){
                  try{
                      obj.wait();
                  }
                  catch(InterruptedException e){
                      e.printStackTrace();
                  }
                  if(number > numberRandom)
                      System.out.println("猜大了");
                  else if(number < numberRandom)
                      System.out.println("猜小了");
                  else
                      System.out.println("猜对了");
              }
          }
        };
        One.start();
        Two.start();
    }
}
