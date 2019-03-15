import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LANTalkUserInterface extends JFrame implements ActionListener{
    //声明控件对象
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JLabel name;
    JLabel personalInformation;
    JLabel onlineDate;
    JLabel imageFaceLabel;
    ImageIcon imageFace;
    JTextField search;
    GridLayout gridLayout;
    //声明变量
    String str[] = {"日间主题","夜间主题"};
    //声明IP地址和域名
    String LANName,LANIp;

    public LANTalkUserInterface(){
        //初始化窗体参数
        super("LANTalk");
        setSize(350,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);    //固定边界
        validate();             //刷新布局

        //初始化面板对象
        JPanel panel = new JPanel(new GridLayout(4,1));
        JPanel upPanel = new JPanel(new GridLayout(1,1));       //第一层
        JPanel upPanelNest = new JPanel(new GridLayout(1,3));   //第一层第二列嵌套布局
        JPanel centerPanel = new JPanel(new GridLayout(1,1));
        JPanel downPanel = new JPanel(new GridLayout(1,1));

        //初始化控件对象
        //菜单条
        menuBar = new JMenuBar();
        menu = new JMenu();
        menuItem = new JMenuItem();
        //标签
        name = new JLabel("本机IP");
        personalInformation = new JLabel("本机域名");
        onlineDate = new JLabel("SVIP8");
        //图片
        imageFace = new ImageIcon("imageFace.jpg");
        imageFaceLabel = new JLabel(imageFace);
        //编辑框
        search = new JTextField(25);

        //获取本地IP及域名
        try{
            //实例化客户端IP地址和域名字符串的分解实例
            LANTalkGetLocalHost lanTalkGetLocalHost = new LANTalkGetLocalHost(InetAddress.getLocalHost().toString());
            LANIp = lanTalkGetLocalHost.getStrIP();
            LANName = lanTalkGetLocalHost.getStrNmae();
        }
        catch (UnknownHostException e){
            JOptionPane.showMessageDialog(this,"无法获取本地IP地址","错误",JOptionPane.ERROR_MESSAGE);
        }

        //Name标签赋值
        name.setText("IP:"+LANIp);
        //personalInformation标签赋值
        personalInformation.setText("Name:"+LANName);


        //添加面板到布局
        getContentPane().add(panel);
        panel.add(upPanel);
        panel.add(upPanelNest);
        panel.add(centerPanel);
        panel.add(downPanel);

        //添加控件到面板
        //第一层
        gridLayout = new GridLayout(1,3);
        gridLayout.setRows(2);
        upPanel.setLayout(gridLayout);
        upPanel.add(new JScrollPane(imageFaceLabel),BorderLayout.WEST);
        upPanel.add(new JScrollPane(name),BorderLayout.CENTER);
        upPanel.add(personalInformation);
        //第二层
        gridLayout = new GridLayout(1,1);
        gridLayout.setRows(4);
        upPanelNest.setLayout(gridLayout);
        upPanelNest.add(new JScrollPane(search),BorderLayout.CENTER);
        //第三层
        //未使用
        centerPanel.setLayout(new BorderLayout());
        centerPanel.add(new Button("待添加"),BorderLayout.CENTER);
        //第四层
        //未使用
        downPanel.setLayout(new FlowLayout());
        downPanel.add(new Label("待添加底部菜单"));

        //测试:调试信息

    }
    //事件源处理
    public void actionPerformed(ActionEvent e){

    }

}
