public class DemoThreadDaemonMain {
    public static void main(String args[]){
        DemoThreadDaemon threadDaemon = new DemoThreadDaemon();
        threadDaemon.threadOne.start();
        threadDaemon.threadTwo.setDaemon(true);     //设置threadTwo为守护线程
        threadDaemon.threadTwo.start();
        threadDaemon.threadOne.setName("One");
        threadDaemon.threadTwo.setName("Two");
    }
}
