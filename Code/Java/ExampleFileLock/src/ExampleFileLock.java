import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class ExampleFileLock extends JFrame implements ActionListener {
    JTextArea text;
    JButton button;
    RandomAccessFile in;
    Channel channel;
    FileLock lock;
    File file;

    ExampleFileLock(File f){
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JTextArea(5,5);
        button = new JButton("读文件");
        file = f;
        try{
            in = new RandomAccessFile(file,"rw"); //指向要加锁的文件
            channel = in.getChannel();  //连接底层
            lock = ((FileChannel) channel).tryLock();
        }
        catch(FileNotFoundException v1){
            v1.printStackTrace();
        }
        catch(IOException v2){
            v2.printStackTrace();
        }
        getContentPane().add(new JScrollPane(text),BorderLayout.CENTER);
        getContentPane().add(new JScrollPane(button),BorderLayout.SOUTH);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent v1){
        if(v1.getSource() == button){
            try{
                lock.release();     //解锁
                String str = in.readLine();     //每次读入一行
                text.append("\n"+str);  //每次读入的字符串都追加给文本框
                lock = ((FileChannel)channel).tryLock();    //必须这么写
                if(str == null)
                    in.close();
            }
            catch(IOException v2){
                v2.printStackTrace();
            }
        }
    }
}
