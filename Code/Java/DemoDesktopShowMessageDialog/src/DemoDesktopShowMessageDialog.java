import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DemoDesktopShowMessageDialog extends JFrame implements ActionListener{
    //初始化对象
    JTextField inputNumberText;
    JTextArea text;
    BorderLayout bordLayout;
    DemoDesktopShowMessageDialog(){
        //初始化窗体参数
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //初始化控件参数
        inputNumberText = new JTextField(20);
        text = new JTextArea();
        bordLayout = new BorderLayout();
        //设置容器布局
        setLayout(bordLayout);
        //添加控件到容器
        getContentPane().add(inputNumberText,bordLayout.NORTH);
        getContentPane().add(text,bordLayout.CENTER);
        //绑定监听对象
        inputNumberText.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == inputNumberText){
            String str = inputNumberText.getText();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(!(Character.isDigit(ch))){   //如果不是数字
                    JOptionPane.showMessageDialog(this,"必须为数字","信息",JOptionPane.ERROR_MESSAGE);
                    inputNumberText.setText(null);
                }
                else
                    JOptionPane.showMessageDialog(this,"正确","信息",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
