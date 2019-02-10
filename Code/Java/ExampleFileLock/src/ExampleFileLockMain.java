import java.io.File;

public class ExampleFileLockMain {
    public static void main(String args[]){
        File file = new File("F:\\1024  核心层(604262631).txt");
        ExampleFileLock man = new ExampleFileLock(file);
        man.setTitle("文件锁");
        man.setSize(man.getWidth()+1,man.getHeight());
    }
}
