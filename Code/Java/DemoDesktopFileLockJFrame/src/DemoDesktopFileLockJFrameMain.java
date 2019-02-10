import java.io.File;
public class DemoDesktopFileLockJFrameMain {
    public static void main(String args[]){
        File file = new File("F:\\reg.txt");
        DemoDesktopFileLockJFrame man = new DemoDesktopFileLockJFrame(file);
        man.setTitle("文件锁");
    }
}
