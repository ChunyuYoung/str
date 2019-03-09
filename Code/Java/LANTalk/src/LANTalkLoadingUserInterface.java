import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import static java.lang.Thread.sleep;

public class LANTalkLoadingUserInterface extends JFrame implements Runnable{
    //声明控件对象
    ImageIcon backImage = new ImageIcon();
    JLabel back;
    Thread thread;
    public LANTalkLoadingUserInterface(){
        //初始化窗体参数
        super("正在登陆");
        setSize(533,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        validate();
        setResizable(false);

        //初始化控件对象参数
        backImage = new ImageIcon("LANTalkLoading.gif");
        back = new JLabel(backImage);

        //初始化面板
        JPanel panel = new JPanel(new BorderLayout());

        //添加面板到容器
        getContentPane().add(panel);
        panel.add(back);

        //初始化并启动线程
        thread = new Thread(this);
        thread.start();
    }
    //如果把sleep放在构造函数会导致窗体界面的Lable的背景图无法加载
    public void run(){
        int n= 0;
        //动态图长度23秒
        while(n<23){
            n++;
            try{
                sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            if ((n*5) > 100){
                n = 100;
            }
            setTitle("正在加载:"+n*5+"%");
        }

        //如果这里匿名实例化对象,就不能刷新被调用窗口的布局,就会导致界面可能出现什么都没有
        LANTalkUserInterface lanTalkUserInterface = new LANTalkUserInterface();
        lanTalkUserInterface.validate();

        //当被调用的窗口启动时隐藏当前界面
        setVisible(false);
    }
}
