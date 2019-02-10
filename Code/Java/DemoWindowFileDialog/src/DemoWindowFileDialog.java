import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
public class DemoWindowFileDialog extends JFrame implements ActionListener{
    JFileChooser fileDialog;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem itemSave,itemOpen;
    JTextArea text;
    DemoWindowFileDialog(){
        super("支持文件对话框");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        text = new JTextArea(10,10);
        add(new JScrollPane(text),BorderLayout.CENTER);
        menubar = new JMenuBar();
        menu = new JMenu("文件");
        itemSave = new JMenuItem("保存文件");
        itemOpen = new JMenuItem("打开文件");
        itemSave.addActionListener(this);
        itemOpen.addActionListener(this);
        menu.add(itemSave);
        menu.add(itemOpen);
        menubar.add(menu);
        setJMenuBar(menubar);
        fileDialog = new JFileChooser();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == itemSave){
//            int state = fileDialog.showSaveDialog(this);
            if (fileDialog.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                text.append("\n单机了对话框上的\"确定\"按钮");
                text.append("\"保存的文件名字:"+fileDialog.getSelectedFile());
            }
            else
                text.append("\n单机了对话框上的\"取消\"按钮或关闭图标");
        }
        else if (e.getSource() == itemOpen){
            int state = fileDialog.showOpenDialog(this);
            if (state == JFileChooser.APPROVE_OPTION){
                text.append("\n单机了对话框上的\"确定\"按钮");
                text.append("\"保存的文件名字:"+fileDialog.getSelectedFile());
            }
            else
                text.append("\n单机了对话框上的\"取消\"按钮或关闭图标");
        }
    }
}
