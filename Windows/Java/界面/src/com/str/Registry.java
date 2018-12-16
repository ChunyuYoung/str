package com.str;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.*;
public class Registry extends JFrame implements ActionListener{
	//��ʼ����Ͽ��б���Ŀ
	String s[]= {"T1701","T1702","T1703"};	
	
	//��ʼ���ؼ�
	JLabel BiaoTi_BiaoQian = new JLabel("�û�ע��");						//��ǩ
	JLabel YongHuMing_BiaoQian = new JLabel("�û���");
	JLabel MiMa_BiaoQian = new JLabel("����");
	JLabel QueRenMiMa_BiaoQian = new JLabel("ȷ������");
	JLabel XingBie_BiaoQian = new JLabel("�Ա�");
	JLabel NianLing_BiaoQian = new JLabel("����");
	JLabel SuoShuBanJi_BiaoQian = new JLabel("�����༶");
	TextField YongHuMing_BianJiKuang = new TextField("",15);			//�༭��
	TextField NianLing_BianJiKuang = new TextField("",15);
	JPasswordField MiMa_BianJiKuang = new JPasswordField("",15);		//�����
	JPasswordField QueRenMiMa_BianJiKuang = new JPasswordField("",15);
	JRadioButton Nan_DanXuanAnNiu = new JRadioButton("��"); 				//��ѡ��ť
	JRadioButton Nv_DanXuanAnNiu = new JRadioButton("Ů"); 				
	JComboBox SuoShuBanJi_ZuHeKuang = new JComboBox(s);
	JButton ZhuCe_AnNiu = new JButton("ע��");							//ȡ��
	JButton ChongZhi_AnNiu = new JButton("����");
	JButton QuXiao_AnNiu = new JButton("ȡ��");
	
	Registry(){
		//��ʼ���������
		super("�û�ע��");
		setVisible(true);
		setSize(300,250);
		setLocation(683+400,384); 			//������Ļ�ֱ���Ϊ1366*768
		setLayout(new GridLayout(8,1));
		setResizable(false);
		
		//��ʼ�����
		JPanel JPOne = new JPanel(new FlowLayout());		//����
		JPanel JPTwo = new JPanel(new GridLayout(1,2));		//�û���
		JPanel JPThree = new JPanel(new GridLayout(1,2));	//����
		JPanel JPFour = new JPanel(new GridLayout(1,2));	//ȷ������
		JPanel JPFive = new JPanel(new GridLayout(1,3));	//�Ա�
		JPanel JPSix = new JPanel(new GridLayout(1,2)); 	//����
		JPanel JPSeven = new JPanel(new GridLayout(1,2));	//�����༶
		JPanel JPEight = new JPanel(new GridLayout(1,3)); 	//��ť
		
		//��������������
		getContentPane().add(JPOne);
		getContentPane().add(JPTwo);
		getContentPane().add(JPThree);
		getContentPane().add(JPFour);
		getContentPane().add(JPFive);
		getContentPane().add(JPSix);
		getContentPane().add(JPSeven);
		getContentPane().add(JPEight);
		
		//���������ӿؼ�
		JPOne.add(BiaoTi_BiaoQian);								
		JPTwo.add(YongHuMing_BiaoQian);							
		JPTwo.add(YongHuMing_BianJiKuang);
		JPThree.add(MiMa_BiaoQian);
		JPThree.add(MiMa_BianJiKuang);
		JPFour.add(QueRenMiMa_BiaoQian);
		JPFour.add(QueRenMiMa_BianJiKuang);
		
		JPFive.add(XingBie_BiaoQian);
		JPFive.add(Nan_DanXuanAnNiu);
		JPFive.add(Nv_DanXuanAnNiu);
		
		JPSix.add(NianLing_BiaoQian);
		JPSix.add(NianLing_BianJiKuang);
		JPSeven.add(SuoShuBanJi_BiaoQian);
		JPSeven.add(SuoShuBanJi_ZuHeKuang);
		JPEight.add(ZhuCe_AnNiu);
		JPEight.add(ChongZhi_AnNiu);
		JPEight.add(QuXiao_AnNiu);
		
		//������ѡ��ť��
		ButtonGroup DanXuanAnNiuZu = new ButtonGroup();
		DanXuanAnNiuZu.add(Nan_DanXuanAnNiu);
		DanXuanAnNiuZu.add(Nv_DanXuanAnNiu);
		
		//������������
		BiaoTi_BiaoQian.setFont(new Font("��Բ",Font.BOLD,20));
		YongHuMing_BianJiKuang.setFont(new Font("��Բ",Font.PLAIN,20));
		NianLing_BianJiKuang.setFont(new Font("��Բ",Font.PLAIN,20));
		YongHuMing_BiaoQian.setFont(new Font("����",Font.BOLD,15));
		MiMa_BiaoQian.setFont(new Font("����",Font.BOLD,15));
		QueRenMiMa_BiaoQian.setFont(new Font("����",Font.BOLD,15));
		XingBie_BiaoQian.setFont(new Font("����",Font.BOLD,15));
		NianLing_BiaoQian.setFont(new Font("����",Font.BOLD,15));
		SuoShuBanJi_BiaoQian.setFont(new Font("����",Font.BOLD,15));
		
		//�󶨼�������
		ZhuCe_AnNiu.addActionListener(this);
		ChongZhi_AnNiu.addActionListener(this);
		QuXiao_AnNiu.addActionListener(this);
		
	}
	//�¼�����
	public void actionPerformed(ActionEvent e) {
		//��ȡ�û���Ϣ
		String YongHuMing = YongHuMing_BianJiKuang.getText();	//��ȡ�û���
		String MiMa = MiMa_BianJiKuang.getText(); 				//��ȡ����
		String QueRenMiMa = QueRenMiMa_BianJiKuang.getText(); 	//ȷ������
		String NianLing = NianLing_BianJiKuang.getText();		//��ȡ����
		
		//�ж��û����Ƿ�Ϊ��,����д���ļ�
		if(e.getSource() == ZhuCe_AnNiu) {
			if(YongHuMing_BianJiKuang.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "�û�������Ϊ��", "����", 0);
			}
			else {
				try {		//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt");
					fw.write(" "+YongHuMing);
					//�ر��ļ���
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//�ļ�������
					JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt");	//�����ļ�
						fw.write(" "+YongHuMing);
						//�ر��ļ���
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
					}
				}
			}
		}
		//�ж������Ƿ�Ϊ��,����д���ļ�
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			if(MiMa_BianJiKuang.equals("")) {
				JOptionPane.showMessageDialog(this, "���벻��Ϊ��", "����", 0);
			}
			else {
				//�ж���������������Ƿ����
				if(MiMa.equals(QueRenMiMa)) {
					try {		//�ļ�����
						FileReader fr = new FileReader("F:\\reg.txt");
						FileWriter fw = new FileWriter("F:\\reg.txt",true);
						fw.write(MiMa);
						//�ر��ļ���
						fr.close();
						fw.close();
					}
					catch(IOException ioe) {	//�ļ�������
						JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
						try {
							FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
							fw.write(MiMa);
							//�ر��ļ���
							fw.close();
						}
						catch(IOException ioee) {
							JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
						}
					}
				}
				else
					JOptionPane.showMessageDialog(this, "����������������벻ͬ\n���鲢��������", "����", 0);
			}
		}
		//�ж������Ƿ�Ϸ�
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			int age = Integer.valueOf(NianLing); 					//����ת��
			if(NianLing == "")						//Ϊ��
				JOptionPane.showMessageDialog(this, "���䲻�Ϸ�\n����", "����", 0);
			if(age <18 && age > 85)			//���䲻�Ϸ�
				JOptionPane.showMessageDialog(this, "���䲻�Ϸ�\n����", "����", 0);
			else {									//��Ϊ���ҺϷ�
				try {		//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write(NianLing);
					//�ر��ļ���
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//�ļ�������
					JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
						fw.write(NianLing);
						//�ر��ļ���
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
					}
				}
			}
		}
		//�ж��Ա�
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			//��
			if(Nan_DanXuanAnNiu.isSelected() ? true:false) {	//�ж��Ƿ�ѡ��
				Nan_DanXuanAnNiu.setSelected(true);
				try {		//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("����");
					fw.flush();
					//�ر��ļ���
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//�ļ�������
					JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
						fw.write("����");
						fw.flush();
						//�ر��ļ���
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
					}
				}
			}
			else {
				//Ů
				Nv_DanXuanAnNiu.setSelected(true);
				try {		//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("Ů��");
					fw.flush();
					//�ر��ļ���
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//�ļ�������
					JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
						fw.write("Ů��");
						fw.flush();
						//�ر��ļ���
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
					}
				}
			}
		}
		//�ж������༶
		if(e.getSource().equals(ZhuCe_AnNiu)) {
			int n = SuoShuBanJi_ZuHeKuang.getSelectedIndex();		//��ȡ�����༶��Ͽ��б���Ŀ
			switch(n) {
			case 0:
				try {		//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("T1701");
					fw.flush();
					//�ر��ļ���
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//�ļ�������
					JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
						fw.write("T1701");
						fw.flush();
						//�ر��ļ���
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
					}
				}
				break;
			case 1:
				try {		//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("T1702");
					fw.flush();
					//�ر��ļ���
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//�ļ�������
					JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
						fw.write("T1702");
						fw.flush();
						//�ر��ļ���
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
					}
				}
				break;
			case 2:
				try {		//�ļ�����
					FileReader fr = new FileReader("F:\\reg.txt");
					FileWriter fw = new FileWriter("F:\\reg.txt",true);
					fw.write("T1703");
					fw.flush();
					//�ر��ļ���
					fr.close();
					fw.close();
				}
				catch(IOException ioe) {	//�ļ�������
					JOptionPane.showMessageDialog(this,"�Ҳ����ļ�\n���´����ļ�","����",0);
					try {
						FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
						fw.write("T1703");
						fw.flush();
						//�ر��ļ���
						fw.close();
					}
					catch(IOException ioee) {
						JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
					}
				}
				break;
			}
		}
		//����:�����������
		if(e.getSource().equals(ChongZhi_AnNiu)) {
			YongHuMing_BianJiKuang.setText("");
			MiMa_BianJiKuang.setText("");
			QueRenMiMa_BianJiKuang.setText("");
			Nan_DanXuanAnNiu.setSelected(false);				//��Ч
			Nv_DanXuanAnNiu.setSelected(false);					//��Ч
			NianLing_BianJiKuang.setText("");
			SuoShuBanJi_ZuHeKuang.setSelectedIndex(0);			//Ĭ��ѡ����
		}
		//ȡ��:�ر�ע�����
		if(e.getSource().equals(QuXiao_AnNiu)) {
//			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);	//��Ч
			setVisible(false);		//���ش���
		}
		//��ȡ���ݳ���
		if(e.getSource().equals(ZhuCe_AnNiu)) {	
			//��ȡ��½��Ϣ����-->����ת��:����������<--
			String YongHuMing_ChangDu = YongHuMing.length()+"";			//��ȡ�û�������
			String MiMa_ChangDu = MiMa.length()+"";						//��ȡ���볤��
			//�û���:�ı������λ��
			try {
				FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
				fw.write(YongHuMing_ChangDu);
				fw.flush();
//				JOptionPane.showMessageDialog(this, YongHuMing_ChangDu, "Info", 1);	//��֤
				//�ر��ļ���
				fw.close();
			}
			catch(IOException ioee) {
				JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
			}
			
			//����:�ı����һλ��
			try {
				FileWriter fw = new FileWriter("F:\\reg.txt",true);	//�����ļ�
				fw.write(MiMa_ChangDu);
				fw.flush();
//				JOptionPane.showMessageDialog(this, MiMa_ChangDu, "Info", 1);//��֤
				//�ر��ļ���
				fw.close();
			}
			catch(IOException ioee) {
				JOptionPane.showMessageDialog(this,"�ļ�����ʧ��","����",0);
			}
		}
	}
}