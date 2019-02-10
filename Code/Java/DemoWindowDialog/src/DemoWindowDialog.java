import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoWindowDialog extends JFrame implements ActionListener{
    //初始化对象
    JButton yes,no;
    int message = -1;
    DemoWindow win;
    String Title;
    static final int YES = 1,NO = 0;
    public DemoWindowDialog(JFrame f,String title,boolean b){
        Title = title;
        //初始化窗体参数
        setVisible(true);
        setSize(300,300);
//        setResizable(false);
        setLocation(400,300);
        setLayout(new FlowLayout());

        //初始化控件参数
        yes = new JButton("Yes");
        no = new JButton("No");

        //添加控件到容器
        getContentPane().add(yes);
        getContentPane().add(no);

        //绑定监听器
        yes.addActionListener(this);
        no.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                message = -1;
                setVisible(false);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        //如果yes按钮发生事件
        if (e.getSource().equals(yes)) {
            message = YES;
            System.out.println(message);
        }
        //如果no按钮发生事件
        else if(e.getSource().equals(no)) {
            message = NO;
            System.out.println(message);
        }
    }
    public int getMessage(){
        return message;
    }
}
