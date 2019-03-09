
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
		this.setTitle("用户登录");
		//this.setLayout(new FlowLayout());//流式布局
		this.setLocationRelativeTo(null);
		this.setSize(300,200);
		b1=new JButton("登录");
		//b2=new JButton("注册");
		b3=new JButton("取消");
		jt=new JLabel("欢迎使用考试系统");
		ja=new JLabel("用户名:");
		
		jp=new JLabel("密  码:");
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
		pan.add(jt);//标题
		pan.add(ja);//用户名
		pan.add(ad);//用户名输入框
		pan.add(jp);//密码
		pan.add(pa);//密码输入框
		pan.add(b1);//登录
		//pan.add(b2);//注册
		pan.add(b3);//取消
		add(pan);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new myProject();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			ad.setText("你好");
		}
		else if(e.getSource()==b2) {
			ad.setText("空");
		}
		else if(e.getSource()==pa) {
			if(ad.getText().trim().equals("张三") && pa.getText().trim().equals("123456")) {
				JOptionPane.showMessageDialog(null, "\t欢迎进入考试系统", "登录成功", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}

}
