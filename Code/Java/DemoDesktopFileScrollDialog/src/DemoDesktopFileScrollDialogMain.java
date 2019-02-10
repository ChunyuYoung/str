import javax.swing.*;
import java.io.*;
import java.awt.*;
public class DemoDesktopFileScrollDialogMain {
    public static void main(String args[]){
        DemoDesktopFileScrollDialog man = new DemoDesktopFileScrollDialog();
        man.setTitle("带进度条的窗口");
        //因为窗体代码不在主类,所以每次打开都要手动修正一下窗体大小才能刷新过来
        man.setSize(man.getWidth()+1,man.getHeight()); //窗体宽度+1

        byte b[] = new byte[30];
        JTextArea text = new JTextArea(20,20);
        JFrame jFrame = new JFrame();
        jFrame.setSize(280,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(new JScrollPane(text),BorderLayout.CENTER);
        jFrame.validate();
        try{
            FileInputStream input = new FileInputStream("E:\\Myself\\文档\\1024  核心层(604262631).txt");
            ProgressMonitorInputStream inputStream = new ProgressMonitorInputStream(null,"读取文件",input);
            ProgressMonitor p = inputStream.getProgressMonitor();
            while (inputStream.read(b) != -1){
                String s = new String(b);
                text.append(s);
                Thread.sleep(200);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
