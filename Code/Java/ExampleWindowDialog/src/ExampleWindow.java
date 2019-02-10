import java.awt.FlowLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
public class ExampleWindow extends JFrame implements ActionListener{
    JTextArea text;
    JButton button;
    ExampleWindowDialog dialog;
    public ExampleWindow(){
        init();
        setBounds(60,60,300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        text = new JTextArea(5,22);
        button = new JButton("打开对话框");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(button);
        add(text);
        dialog = new ExampleWindowDialog(this,"对话框",true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            int x = this.getBounds().x+this.getBounds().width;
            int y = this.getBounds().y;
            dialog.setLocation(x,y);
            dialog.setVisible(true);
            if(dialog.getMessage() == ExampleWindowDialog.YES){
                text.append("淡季了Yes");
            }
            else if (dialog.getMessage() == ExampleWindowDialog.NO)
                text.append("淡季了No");
            else
                text.append("淡季了关闭图标");
        }
    }
}
