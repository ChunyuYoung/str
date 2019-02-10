import java.awt.FlowLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
public class ExampleWindowDialog extends JFrame implements ActionListener{
    static final int YES = 1,NO =0;
    int message = -1;
    JButton yes,no;
    ExampleWindowDialog(JFrame f,String s,boolean b){
        yes = new JButton("Yes");
        yes.addActionListener(this);
        no = new JButton("No");
        no.addActionListener(this);
        setLayout(new FlowLayout());
        add(yes);
        add(no);
        setBounds(60,60,100,100);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                message = -1;
                setVisible(false);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == yes){
            message = YES;
            setVisible(false);
        }
        else if (e.getSource() == no){
            message = NO;
            setVisible(false);
        }
    }
    public int getMessage(){
        return message;
    }
}
