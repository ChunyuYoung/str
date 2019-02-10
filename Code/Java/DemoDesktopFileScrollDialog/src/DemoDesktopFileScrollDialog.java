import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.InterruptedException;
public class DemoDesktopFileScrollDialog extends JFrame implements ActionListener{
    //初始化对象
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem openFile,saveFile;
    JTextArea text;
    JFileChooser fileChooser;
    byte by[] = new byte[10];
    DemoDesktopFileScrollDialog(){
        //初始化窗体参数
        setVisible(true);
        setSize(300,260);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        validate();
        //初始化控件参数
        openFile = new JMenuItem("打开文件");
        saveFile = new JMenuItem("保存文件");
        menuBar = new JMenuBar();
        menu = new JMenu("文件");
        text = new JTextArea(10,20);
        text.setEnabled(false);
        //添加控件到容器
//        getContentPane().add(menuBar);
        menuBar.add(menu);
        menu.add(openFile);
        menu.add(saveFile);
        setJMenuBar(menuBar);   //必须用这个
        getContentPane().add(new JScrollPane(text),BorderLayout.CENTER);
        //绑定监听对象
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        //如果点击了打开文件
        if (e.getSource().equals(openFile)){
            fileChooser = new JFileChooser();

            if (fileChooser.showOpenDialog(this) == fileChooser.APPROVE_OPTION){
                File file = fileChooser.getCurrentDirectory();
                String name = fileChooser.getSelectedFile().getName();
                text.setText(file+name);
                try{
                    FileInputStream input = new FileInputStream("E:\\Myself\\文档\\1024  核心层(604262631).txt");
                    ProgressMonitorInputStream inputStream = new ProgressMonitorInputStream(null,"读取文件",input);
                    //进度条白屏:猜测:可能是因为不是主类的原因,进度条窗口在加载时没能刷新出来导致的
                    ProgressMonitor p = inputStream.getProgressMonitor();
                    while (inputStream.read(by) != -1){
                        String s = new String(by);
                        text.append(s);
                        Thread.sleep(200);
                    }
                }
                catch(FileNotFoundException ee){
                    JOptionPane.showMessageDialog(this,"不能打开文件","错误",JOptionPane.ERROR_MESSAGE);
                    ee.printStackTrace();
                    System.out.println(ee.toString());
                }
                catch (IOException eee){
                    eee.printStackTrace();
                    System.out.println(eee.toString());
                }
                catch(InterruptedException eeee){
                    eeee.printStackTrace();
                    System.out.println(eeee.toString());
                }
            }
        }
    }
}
