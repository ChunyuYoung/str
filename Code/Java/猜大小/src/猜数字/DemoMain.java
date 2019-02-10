package 猜数字;

public class DemoMain {
    public static void main(String args[]){
        //线程1
        Object obj = new Object();
        Thread download = new Thread() {
            public void run() {
                System.out.println("开始下载图片");
                for (int i = 0; i < 101; i += 10) {
                    System.out.println("下载" + i + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("图片下载成功");
                synchronized (obj){
                    obj.notify();
                }
                System.out.println("开始下载附件");
                for (int i = 0;i<101;i+=10){
                    System.out.println("附件下载"+i+"%");
                    try{
                        Thread.sleep(50);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("附件下载成功");
            }
        };
        //线程2
        Thread show = new Thread(){
            public void run(){
                synchronized (obj){
                    try{
                        obj.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("开始展示图片");
                    System.out.println("图片展示完毕");
                }
            }
        };
        download.start();
        show.start();
    }
}
