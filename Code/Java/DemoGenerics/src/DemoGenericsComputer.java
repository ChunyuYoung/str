public class DemoGenericsComputer<Computer> {
    String name;
    public void setName(String name){
        this.name = name;
    }
    Computer mode;
    public void setMode(Computer mode){
        this.mode = mode;
    }
    float money;
    public void setMoney(float money){
        this.money = money;
    }
    public void infoComputer(){
        System.out.println(this.name);
        System.out.println(this.mode);
        System.out.println(this.money);
    }
}