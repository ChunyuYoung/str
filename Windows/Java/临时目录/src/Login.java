import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
	TextField jbbb = new TextField("",20);				//�ı���
	JPasswordField jbbbbb = new JPasswordField("",20);	//�����
	JButton jbbbbbb = new JButton("��½");
	JButton jbbbbbbb = new JButton("ע��");
	JButton jbbbbbbbb = new JButton("ȡ��");				//��ť
	public Login() {
		//��������
		super("�û���½");
		setVisible(true);
		setSize(220,150);
		setLocationRelativeTo(null);
		//setResizable(false);
		setLayout(new BorderLayout());
		//ʵ�������
		JPanel jp = new JPanel(new GridLayout(4,1));			//���		
		JPanel jpp = new JPanel(new FlowLayout());				//��һ��
		JPanel jppp = new JPanel(new GridLayout(1,2));			//�ڶ���
		JPanel jpppp = new JPanel(new GridLayout(1,2));			//������
		JPanel jppppp = new JPanel(new GridLayout(1,3));		//���Ĳ�
		jp.setSize(30, 20);			//����������ߴ�(����û��)
		//�����ؼ������
		JLabel jb = new JLabel("��ӭʹ�ÿ���ϵͳ");			//��ǩ
		jb.setFont(new Font("��Բ",Font.BOLD,20));
		JLabel jbb = new JLabel("�û���:");
		
		jbbb.setFont(new Font("",Font.BOLD,20));
		JLabel jbbbb = new JLabel("��   ��:");
		

		//��������������
		this.getContentPane().add(jp);
		jp.setSize(220, 180);
		jp.add(jpp);
		jp.add(jppp);
		jp.add(jpppp);
		jp.add(jppppp);
		//���������ӿؼ�
		jpp.add(jb);				//��һ��
		jppp.add(jbb);				//�ڶ���
		jppp.add(jbbb);
		jpppp.add(jbbbb);			//������
		jpppp.add(jbbbbb);
		jppppp.add(jbbbbbb);		//������
		jppppp.add(jbbbbbbb);
		jppppp.add(jbbbbbbbb);
		//�󶨼�������
		jbbbbbb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(jbbb.getText() == "admin" && jbbbbb.getText() == "123456")
			JOptionPane.showMessageDialog(this, "��½�ɹ�", "��Ϣ", 1);
	}
	public static void main(String[] args) {
		new Login();	//��½����
	}
}
