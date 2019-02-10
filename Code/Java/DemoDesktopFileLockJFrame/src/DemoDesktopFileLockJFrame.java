import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class DemoDesktopFileLockJFrame extends JFrame implements ActionListener {
    JTextArea text;
    JButton button;
    File file;
    RandomAccessFile input;
    FileChannel channel;
    FileLock lock;
    DemoDesktopFileLockJFrame(File f){
        file = f;
        try{
            input = new RandomAccessFile(file,"rw");
            channel = input.getChannel();
            lock = channel.tryLock();
        }
        catch (FileNotFoundException v1){
            v1.printStackTrace();
        }
        catch(IOException v2){
            v2.printStackTrace();
        }
        text = new JTextArea();
        button = new JButton("读取一行");
        button.addActionListener(this);
        add(new JScrollPane(text), BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent v1){
        try{
            lock.release();
            String line = input.readLine();
            text.append("\n"+line);
            lock = channel.tryLock();
            if (line == null)
                input.close();
        }
        catch (IOException v2){
            v2.printStackTrace();
        }
    }
}
