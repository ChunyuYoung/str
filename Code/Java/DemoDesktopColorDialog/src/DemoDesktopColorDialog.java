import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JColorChooser;
import java.awt.Color;
public class DemoDesktopColorDialog extends JFrame implements ActionListener{
    JButton OpenColorButton;
    DemoDesktopColorDialog(){
        super("带调色板的窗口");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OpenColorButton = new JButton("OpenColorPanel");
        OpenColorButton.addActionListener(this);
        getContentPane().add(new JScrollPane(OpenColorButton),BorderLayout.NORTH);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == OpenColorButton){
            Color color = JColorChooser.showDialog(this,"调色板",getContentPane().getBackground());
            if(color != null){
                getContentPane().setBackground(color);
            }
        }
    }
}
