import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class LANTalkRegisterWindowGUI extends JFrame implements ActionListener{
    //声明控件对象
    JLabel name,password,enterPassword;
    JTextField nameText;
    JPasswordField passwordText,enterPasswordText;
    JButton registerJButton;

    public LANTalkRegisterWindowGUI(){
        //初始化窗体参数
        super("注册");
        setVisible(true);
        setSize(300,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);    //固定边界
        validate();     //刷新布局

        //初始化面板对象
        JPanel panel = new JPanel(new GridLayout(4,1));
        JPanel panelName = new JPanel(new GridLayout(1,2));
        JPanel panelPassword = new JPanel(new GridLayout(1,2));
        JPanel panelEnterPassword = new JPanel(new GridLayout(1,2));
        JPanel panelRegisterButton = new JPanel(new FlowLayout());

        //初始化控件对象
        //标签
        name = new JLabel("账号");
        password = new JLabel("密码");
        enterPassword = new JLabel("确认密码");
        //文本框
        nameText = new JTextField(30);
        passwordText = new JPasswordField(30);
        enterPasswordText = new JPasswordField(30);
        //按钮
        registerJButton = new JButton("注册");

        //添加面板到容器
        getContentPane().add(panel);
        panel.add(panelName);
        panel.add(panelPassword);
        panel.add(panelEnterPassword);
        panel.add(panelRegisterButton);

        //添加控件到面板
        //账号
        panelName.add(name);
        panelName.add(nameText);
        //密码
        panelPassword.add(password);
        panelPassword.add(passwordText);
        //确认密码
        panelEnterPassword.add(enterPassword);
        panelEnterPassword.add(enterPasswordText);
        //注册按钮
        panelRegisterButton.add(new JScrollPane(registerJButton));

        //初始化密码文本框参数
        passwordText.setEchoChar('*');
        enterPasswordText.setEchoChar('*');

        //绑定监听对象
        registerJButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        //注册按钮发生事件
        if (e.getSource().equals(registerJButton)){
            try{
                File file = new File("ConfigurationInformation.txt");
                FileWriter fileWriter = new FileWriter(file);

                //判断账号,密码和确认密码是否为空
                String pass = String.valueOf(passwordText.getPassword()) ;
                String enterPass = String.valueOf(enterPasswordText.getPassword());
                String name = nameText.getText();

                //账号不为空
                if (name != ""){
                    //密码个确认密码不为空
                    if (pass != "" && enterPass != ""){
                        //密码和确认密码相等
                        if (pass.equals(enterPass)){
                            fileWriter.write(name+" "+enterPass);
                            fileWriter.flush();
                            JOptionPane.showMessageDialog(this,"注册成功","信息",JOptionPane.INFORMATION_MESSAGE);
                            setVisible(false);  //隐藏窗体
                        }
                    }
                }

            }
            catch (FileNotFoundException e1){
                JOptionPane.showMessageDialog(this,"程序在创建文件时发生了错误","错误",JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException e1){
                JOptionPane.showMessageDialog(this,"程序向文件写入数据发生了错误","错误",JOptionPane.ERROR_MESSAGE);
            }

        }
    }

}