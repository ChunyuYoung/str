
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
public class myProject extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel jt,ja,jp;
	JPanel pan;
	JTextField ad;
	JPasswordField pa;
	public myProject(){
		this.setTitle("�û���¼");
		//this.setLayout(new FlowLayout());//��ʽ����
		this.setLocationRelativeTo(null);
		this.setSize(300,200);
		b1=new JButton("��¼");
		//b2=new JButton("ע��");
		b3=new JButton("ȡ��");
		jt=new JLabel("��ӭʹ�ÿ���ϵͳ");
		ja=new JLabel("�û���:");
		
		jp=new JLabel("��  ��:");
		ad=new JTextField(10);
		pa=new JPasswordField(10);
		pa.setEchoChar('*');
		b1.addActionListener(this);
		//b2.addActionListener(this);
		b3.addActionListener(this);
		ad.addActionListener(this);
		pa.addActionListener(this);
		pan =new JPanel();
		jt.setFont(new Font("Helvetica",Font.PLAIN,20));
		pan.add(jt);//����
		pan.add(ja);//�û���
		pan.add(ad);//�û��������
		pan.add(jp);//����
		pan.add(pa);//���������
		pan.add(b1);//��¼
		//pan.add(b2);//ע��
		pan.add(b3);//ȡ��
		add(pan);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new myProject();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			ad.setText("���");
		}
		else if(e.getSource()==b2) {
			ad.setText("��");
		}
		else if(e.getSource()==pa) {
			if(ad.getText().trim().equals("����") && pa.getText().trim().equals("123456")) {
				JOptionPane.showMessageDialog(null, "\t��ӭ���뿼��ϵͳ", "��¼�ɹ�", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}

}
