import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class DemoDesktopWindowClone extends JFrame implements ActionListener{
    JTextArea text = null;
    JButton button;
    DemoDesktopWindowClone(){
        setLayout(new FlowLayout());
        text = new JTextArea(5,8);
        button = new JButton("克隆");
        button.addActionListener(this);
        setVisible(true);
        add(new JScrollPane(text));
        add(button);
        setSize(580,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        try{
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(text);

            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream objectIn = new ObjectInputStream(in);
            JTextArea cloneText = (JTextArea)objectIn.readObject();
            cloneText.setBackground(Color.PINK);
            this.add(new JScrollPane(cloneText));
            this.validate();
        }
        catch(Exception ee) {
            ee.printStackTrace();
        }
    }
}
