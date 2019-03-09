import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
	TextField jbbb = new TextField("",20);				//文本框
	JPasswordField jbbbbb = new JPasswordField("",20);	//密码框
	JButton jbbbbbb = new JButton("登陆");
	JButton jbbbbbbb = new JButton("注册");
	JButton jbbbbbbbb = new JButton("取消");				//按钮
	public Login() {
		//窗体设置
		super("用户登陆");
		setVisible(true);
		setSize(220,150);
		setLocationRelativeTo(null);
		//setResizable(false);
		setLayout(new BorderLayout());
		//实例化面板
		JPanel jp = new JPanel(new GridLayout(4,1));			//外层		
		JPanel jpp = new JPanel(new FlowLayout());				//第一层
		JPanel jppp = new JPanel(new GridLayout(1,2));			//第二层
		JPanel jpppp = new JPanel(new GridLayout(1,2));			//第三层
		JPanel jppppp = new JPanel(new GridLayout(1,3));		//第四层
		jp.setSize(30, 20);			//设置外层面板尺寸(好像没用)
		//创建控件和面板
		JLabel jb = new JLabel("欢迎使用考试系统");			//标签
		jb.setFont(new Font("幼圆",Font.BOLD,20));
		JLabel jbb = new JLabel("用户名:");
		
		jbbb.setFont(new Font("",Font.BOLD,20));
		JLabel jbbbb = new JLabel("密   码:");
		

		//向容器中添加面板
		this.getContentPane().add(jp);
		jp.setSize(220, 180);
		jp.add(jpp);
		jp.add(jppp);
		jp.add(jpppp);
		jp.add(jppppp);
		//向面板中添加控件
		jpp.add(jb);				//第一行
		jppp.add(jbb);				//第二行
		jppp.add(jbbb);
		jpppp.add(jbbbb);			//第三行
		jpppp.add(jbbbbb);
		jppppp.add(jbbbbbb);		//第四行
		jppppp.add(jbbbbbbb);
		jppppp.add(jbbbbbbbb);
		//绑定监听对象
		jbbbbbb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(jbbb.getText() == "admin" && jbbbbb.getText() == "123456")
			JOptionPane.showMessageDialog(this, "登陆成功", "信息", 1);
	}
	public static void main(String[] args) {
		new Login();	//登陆界面
	}
}
