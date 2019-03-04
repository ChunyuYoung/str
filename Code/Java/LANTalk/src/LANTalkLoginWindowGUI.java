import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JPanel;

public class LANTalkLoginWindowGUI extends JFrame implements ActionListener{
    //声明控件对象
    JLabel name,password;
    JTextField nameText;
    JPasswordField passwordText;
    JButton loginJButton,registerJButton;

    public LANTalkLoginWindowGUI(){
        //初始化窗体参数
        super("登陆");
        setSize(250,125);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);    //固定边界

        //初始化面板对象
        JPanel panel = new JPanel(new GridLayout(3,1));
        JPanel namePanel = new JPanel(new GridLayout(1,2));
        JPanel passwordPanel = new JPanel(new GridLayout(1,2));
        JPanel loginRegisterPanel = new JPanel(new FlowLayout());

        //初始化控件对象
        //标签
        name = new JLabel("账号");
        password = new JLabel("密码");
        //文本框
        nameText = new JTextField(20);
        //密码框
        passwordText = new JPasswordField(20);
        //按钮
        registerJButton = new JButton("注册");
        loginJButton = new JButton("登陆");

        //添加面板到容器
        getContentPane().add(panel);
        panel.add(namePanel);
        panel.add(passwordPanel);
        panel.add(loginRegisterPanel);

        //添加控件到面板
        //账号
        namePanel.add(name);
        namePanel.add(nameText);
        //密码
        passwordPanel.add(password);
        passwordPanel.add(passwordText);
        //按钮
        loginRegisterPanel.setLayout(new FlowLayout());
        loginRegisterPanel.add(new JScrollPane(loginJButton));
        loginRegisterPanel.add(new JScrollPane(registerJButton));

        //初始化密码文本框参数
        passwordText.setEchoChar('*');

        //绑定监听对象
        registerJButton.addActionListener(this);
        loginJButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        //注册按钮发生事件
        if (e.getSource().equals(registerJButton)){
            //如果没有注册账户并且填写了信息,当点击注册按钮时清空登陆界面的已填写的信息
            nameText.setText("");
            passwordText.setText("");
            //跳转到注册界面
            new LANTalkRegisterWindowGUI();
        }

        //登陆按钮发生事件
        if (e.getSource().equals(loginJButton)){
            //声明账号和密码
            String name = null,password = null;
            File file = new File("ConfigurationInformation.txt");

            try{
                Scanner scanner = new Scanner(file);
                //读取账号和密码
                while(scanner.hasNext()){
                    name = scanner.next();
                    password = scanner.next();
                }
            }
            catch (FileNotFoundException e1){
                JOptionPane.showMessageDialog(this,"还没有注册账号","信息",JOptionPane.INFORMATION_MESSAGE);
            }

            //判断账号和密码是否合法
            String loginPass = String.valueOf(passwordText.getPassword());
            //从文件读取到的字符串如果要和在当前界面下的文本框中的字符串对比,则需要将文本框中的字符串赋值给一个变量,在进行比较
            String loginName = nameText.getText();
            //账号和密码不为空
            if (loginName != "" && loginPass != ""){
                //两个字符串在进行比较是否相等时尽量用equals方法,如果用==会产生一些问题
                if (loginName.equals(name) && loginPass.equals(password)){
                    JOptionPane.showMessageDialog(this,"登陆成功","信息",JOptionPane.INFORMATION_MESSAGE);
                    //隐藏窗体
                    setVisible(false);
                    //跳转界面
                    new LANTalkLoadingUserInterface();
                }
            }
        }
    }
}