import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
public class DemoDesktopCodeUrlWindow extends JFrame implements ActionListener{
    //初始化静态字段
    private static String str = null;
    //声明控件对象
    JButton button;
    JTextField textField;
    JEditorPane editorPane;
    JLabel label;
    URL url;
    InputStream inputStream;
    InputStreamReader inputStreamReader;
    JScrollPane scrollPane;

    public DemoDesktopCodeUrlWindow(){
        //初始化窗体参数
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        //初始化控件参数
        button = new JButton("打开");
        label = new JLabel("网址:");
        textField = new JTextField(20);
        editorPane = new JEditorPane();

        //添加控件到容器
        getContentPane().add(label);
        getContentPane().add(textField);
        getContentPane().add(button);
        getContentPane().add(new JScrollPane(editorPane),BorderLayout.CENTER);
        //绑定监听对象
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent v1){
        //当按钮发生事件
        if (v1.getSource().equals(button)){
            str = textField.getText().trim();
            if (str != null){
                try{
                    url = new URL(str);
                    inputStream = url.openStream();
                    inputStreamReader = new InputStreamReader(inputStream);
                    editorPane.setPage(str);
                }
                catch (MalformedURLException v2){
                    editorPane.setText("正在读取源码");
                }
                catch (IOException v3){
                    v3.printStackTrace();
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"必须写入有效的地址","信息",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
