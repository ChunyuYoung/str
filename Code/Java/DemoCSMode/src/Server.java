import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Server extends JFrame implements ActionListener,Runnable {
    JButton enter;
    JTextField txt;
    JTextArea text;
    public Server(){
        setSize(300,300);
        try{
            setTitle(InetAddress.getLocalHost().getHostAddress());
        }
        catch (UnknownHostException e){
            e.printStackTrace();
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        enter = new JButton("发送");
        txt = new JTextField(20);
        text = new JTextArea(10,20);

        JPanel panel = new JPanel(new FlowLayout());
        getContentPane().add(panel);
        panel.add(new JScrollPane(text));
        panel.add(txt);
        panel.add(enter);

        enter.addActionListener(this);

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(enter)){
            byte[] info = txt.getText().trim().getBytes();
            try{
                InetAddress inetAddress = InetAddress.getByName(InetAddress.getLocalHost().getHostAddress());
                DatagramPacket datagramPacket = new DatagramPacket(info,info.length,inetAddress,5418);
                DatagramSocket socket = new DatagramSocket();
                socket.send(datagramPacket);
            }
            catch (Exception e1){
                e1.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        DatagramPacket packet = null;
        DatagramSocket socket = null;
        byte data[] = new byte[8192];
        try{
            packet = new DatagramPacket(data,data.length);
            socket = new DatagramSocket(2333);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        while (true){
            if (socket == null)
                break;
            else {
                try{
                    socket.receive(packet);
                    String message = new String(packet.getData(),0,packet.getLength());
                    text.append("\n"+message+"\n");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]){
        Server main = new Server();
        main.validate();
    }
}

