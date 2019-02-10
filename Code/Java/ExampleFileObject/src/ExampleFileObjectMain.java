import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.io.*;

public class ExampleFileObjectMain extends JFrame implements ActionListener{
    JTextArea text;
    JButton cloneButton;
    ExampleFileObjectMain(){
        setVisible(true);
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        text = new JTextArea(5,5);
        cloneButton = new JButton("Clone");

        getContentPane().add(new JScrollPane(text));
        getContentPane().add(new JScrollPane(cloneButton));

        cloneButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cloneButton){
            try{
                //写出对象
                File file = new File("ObjectStates.txt");
                FileOutputStream fileOut = new FileOutputStream(file);
                ObjectOutputStream objectFileOut = new ObjectOutputStream(fileOut);
                objectFileOut.writeObject(text);
                //读入对象
                FileInputStream fileInput = new FileInputStream(file);
                ObjectInputStream objectFileInput = new ObjectInputStream(fileInput);
                JTextArea textClone = (JTextArea)objectFileInput.readObject();
                textClone.setBackground(Color.pink);
                textClone.setForeground(Color.white);
                getContentPane().add(new JScrollPane(textClone));
                this.validate();    //可以看做是刷新布局,实际上API中说的是校验对象并重新布置
            }
            catch(FileNotFoundException v1){
                v1.printStackTrace();
            }
            catch(IOException v2){
                v2.printStackTrace();
            }
            catch(ClassNotFoundException v3){
                v3.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        ExampleFileObjectMain objectMain = new ExampleFileObjectMain();
        objectMain.setTitle("克隆对象");
        objectMain.setSize(objectMain.getWidth()+1,objectMain.getHeight());

    }
}
