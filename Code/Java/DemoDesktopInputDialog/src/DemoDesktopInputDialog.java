import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DemoDesktopInputDialog extends JFrame implements ActionListener{
    JButton openInput;
    DemoDesktopInputDialog(){
        super("输入对话框");
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        openInput = new JButton("openInputMessage");
        getContentPane().add(new JScrollPane(openInput),BorderLayout.CENTER);
        openInput.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String str = JOptionPane.showInputDialog(this,"输入整数","信息",JOptionPane.INFORMATION_MESSAGE);
        if(str != null){
            try{
                int n = Integer.parseInt(str);
                JOptionPane.showMessageDialog(this,"得到的整数:"+n,"信息",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(this,"不能正确转换为整数","错误",JOptionPane.ERROR_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(this,"不能为空","信息",JOptionPane.ERROR_MESSAGE);
    }
}
