public class DemoGenericsMain<peopleName> implements People<peopleName>{
    public static void main(String agrs[]){
        DemoGenericsComputer demoGenericsComputer = new DemoGenericsComputer();
        demoGenericsComputer.setName("战神");
        demoGenericsComputer.setMode("K670E-G6D1");
        demoGenericsComputer.setMoney(5100.00f);
        demoGenericsComputer.infoComputer();

    }
    public void setName(peopleName name){

        name.toString();
    }
}