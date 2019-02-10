import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DemoWindow extends JFrame implements ActionListener{
    //初始化对象
    JButton button;
    JTextArea txt;
    DemoWindowDialog dialog;
    String Message = null;
    public DemoWindow(){
        //初始化窗体参数
        super("带对话框的窗口");
        setVisible(true);
        setSize(300,300);
//        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        //初始化控件参数
        button = new JButton("打开对话框");
        txt = new JTextArea(10,10);

        //添加控件到容器
        getContentPane().add(button);
        getContentPane().add(txt);

        //绑定监听器
        button.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        //如果按钮发生事件
        if(e.getSource().equals(button)) {
            int x = this.getLocation().x;
            int y = this.getLocation().y;
            dialog = new DemoWindowDialog(this,"对话框", true);
            dialog.setVisible(true);
            if (dialog.getMessage() == DemoWindowDialog.YES){
                txt.append("你点击了yes按钮");
                System.out.println(Message+"\t233");
            }
            else if (dialog.getMessage() == DemoWindowDialog.NO){
                txt.append("你点击了no按钮");
                System.out.println(Message+"\t233");
            }
        }
    }
}
