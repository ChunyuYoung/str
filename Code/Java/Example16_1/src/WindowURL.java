import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class WindowURL extends JFrame implements ActionListener,Runnable{
    JButton button;
    URL url;
    JTextField text;
    JEditorPane editorPane;
    byte b[] = new byte[118];
    Thread thread;
    public WindowURL(){
        text = new JTextField(20);
        editorPane = new JEditorPane();
        editorPane.setEditable(false);
        button = new JButton("确定");
        button.addActionListener(this);
        thread = new Thread(this);
        JPanel p = new JPanel();
        p.add(new JLabel("输入网址:"));
        p.add(text);
        p.add(button);
        JScrollPane scrollPane = new JScrollPane(editorPane);
        add(scrollPane,BorderLayout.CENTER);
        add(p,BorderLayout.NORTH);
        setBounds(160,60,420,300);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(!(thread.isAlive()))
            thread = new Thread(this);
        try{
            thread.start();
        }
        catch(Exception v1){
            text.setText("我正在读取"+url);
        }
    }
    public void run(){
        try{
            int n = -1;
            editorPane.setText(null);
            url = new URL(text.getText().trim());
            editorPane.setPage(url);
        }
        catch (Exception v1){
            text.setText(""+v1);
            return;
        }
    }
}
