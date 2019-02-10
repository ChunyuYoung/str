import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;

public class DemoDesktopFileDialog extends JFrame implements ActionListener{
    //初始化对象
    JTextArea txt;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem openFile,saveFile;
    JFileChooser chooser;
    public DemoDesktopFileDialog(){
        //初始化窗体参数
        super("带文件浏览的对话框");
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //初始化对象参数
        txt = new JTextArea(20,20);
        menubar = new JMenuBar();
        menu = new JMenu("文件");
        openFile = new JMenuItem("打开文件");
        saveFile = new JMenuItem("保存文件");
        chooser = new JFileChooser();
        //添加控件到容器
        getContentPane().add(menubar);
        setJMenuBar(menubar);
        menubar.add(menu);
        menu.add(openFile);
        menu.add(saveFile);
        getContentPane().add(new JScrollPane(txt),new BorderLayout().CENTER);
        //绑定监听对象
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        //判断是否单击了打开文件
        if (e.getSource() == openFile){
            //判断是否单击确定按钮
            if (chooser.showOpenDialog(null) == chooser.APPROVE_OPTION){
                txt.append("我单机了打开按钮");
            }
            else
                txt.append("我没有单击打开按钮");
        }
        //判断是否单机了保存文件
        if(e.getSource() == saveFile){
            //判断是否单机了保存按钮
            if (chooser.showSaveDialog(null) == chooser.APPROVE_OPTION){
                txt.append("我单机了保存按钮");
            }
            else
                txt.append("我没有单机保存按钮");
        }
    }
}
