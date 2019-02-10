//引用DemoGenericsImplements接口,并重写接口方法
public class DemoComputerMode<Mode> implements DemoGenericsImplements<Mode> {
    public void setMode(Mode mode){
        mode.toString();
    }
}
