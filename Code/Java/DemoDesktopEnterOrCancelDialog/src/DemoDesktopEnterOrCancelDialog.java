import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class DemoDesktopEnterOrCancelDialog extends JFrame implements ActionListener{
    JTextField inputNumber;
    JTextArea text;
    DemoDesktopEnterOrCancelDialog(){
        super("带确定按钮和取消按钮的对话框");
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        inputNumber = new JTextField(20);
        text = new JTextArea(20,20);
        text.setEnabled(false);
        inputNumber.addActionListener(this);
        setLayout(new FlowLayout());
        getContentPane().add(new JScrollPane(inputNumber),new BorderLayout().NORTH);
        getContentPane().add(new JScrollPane(text),new BorderLayout().CENTER);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == inputNumber){
            String s = inputNumber.getText();
            if(!(s.isEmpty())){
                JOptionPane.showConfirmDialog(this,"感谢你的支持","信息",JOptionPane.YES_NO_OPTION);
                text.append("\n"+s);
                inputNumber.setText(null);
            }
            else
                JOptionPane.showMessageDialog(this,"不能为空","错误",JOptionPane.ERROR_MESSAGE);
        }
    }
}
