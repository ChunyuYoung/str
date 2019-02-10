public class DemoGerenicsImplementsMain {
    public static void main(String agrs[]){
        DemoComputerMode<DemoComputerName> mode  = new DemoComputerMode<>();
        DemoGenericsImplements<String> mode1 = new DemoComputerMode<>();
        DemoComputerName name = new DemoComputerName();
        mode.setMode(name);
    }
}
