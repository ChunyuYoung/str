public class DemoThreadUnited implements Runnable {
    DemoThreadUnitedCar car;
    Thread customer,carMaker;
    DemoThreadUnited(){
        customer = new Thread(this);
        carMaker = new Thread(this);
        customer.setName("顾客");
        carMaker.setName("汽车生产商");
    }
    public void run(){
        //线程1
        if(Thread.currentThread().getName().equals("顾客")){
            System.out.println(customer.getName()+"等"+carMaker.getName()+"生产汽车");
            try{
                carMaker.start();       //线程2启动
                carMaker.join();        //线程1等待
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(customer.getName()+"买了一辆汽车:"+car.name+"价格是:"+car.price);
        }
        //线程2
        else if(Thread.currentThread().getName().equals("汽车生产商")){
            System.out.println(carMaker.getName()+"开始生产汽车");
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            car = new DemoThreadUnitedCar("超时空采矿车",20000000.233f);
            System.out.println(carMaker.getName()+"生产完毕");
        }
    }
}
