public class DemoThreadUnitedMain {
    public static void main(String args[]){
        DemoThreadUnited man = new DemoThreadUnited();
        man.customer.start();   //线程1启动
    }
}
