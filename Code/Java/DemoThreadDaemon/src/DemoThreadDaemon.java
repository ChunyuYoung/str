public class DemoThreadDaemon implements Runnable{
    Thread threadOne,threadTwo;
    DemoThreadDaemon(){
        threadOne = new Thread(this);
        threadTwo = new Thread(this);
    }
    public void run(){
        if(Thread.currentThread().equals(threadOne)){
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        //当其他线程(用户)线程结束时,守护线程也会立即结束.
        else if(Thread.currentThread().equals(threadTwo)){
            while(true){
                System.out.println(threadTwo.getName()+"是"+threadOne.getName()+"的守护线程");
                //如果加上currentThread()属性则会获取当前执行的线程的名字,所以会出现Two是Two的守护线程而不是Two是One的守护线程
//              System.out.println(threadTwo.currentThread().getName()+"是"+threadOne.currentThread().getName()+"的守护线程");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
