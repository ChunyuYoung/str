package com.str;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Pwd extends JFrame implements ActionListener,FocusListener{
	//��ʼ���б�����
	String number[] = {"0","1","2","3","4","5","6","7","8","9"};
	
	//�����ؼ�
	JLabel bq1 = new JLabel("��Сλ��");
	JLabel bq2 = new JLabel("���λ��");
	JLabel bq3 = new JLabel("�ļ���С");
	JTextField bjk = new JTextField("",6);
	JComboBox lbk1 = new JComboBox(number);
	JComboBox lbk2 = new JComboBox(number);
	JButton an = new JButton("�����ֵ�");
	JTextField wbq = new JTextField("�ֵ�����·��,Ĭ���ڳ�������Ŀ¼��");
	
	Pwd(){
		//��ʼ���������
		super("WIFI�����������ֵ�������");
		setVisible(true);
		setSize(400,150);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		
		//��ʼ������
		JPanel One = new JPanel(new GridLayout(3,1));
		JPanel Two = new JPanel(new GridLayout(1,4));
		JPanel Three = new JPanel(new GridLayout(1,3));
		JPanel Four = new JPanel(new GridLayout(1,1));
		
		//��Ӳ��ֵ�����
		getContentPane().add(One);
		One.add(Two);
		One.add(Three);
		One.add(Four);
		
		//��ӿؼ�������
		Two.add(bq1);
		Two.add(lbk1);
		Two.add(bq2);
		Two.add(lbk2);
		Three.add(bq3);
		Three.add(bjk);
		Three.add(an);
		Four.add(wbq);
		
		//�ؼ���������
		bjk.setEditable(false);
		wbq.setFont(new Font("����",Font.BOLD,20));
		wbq.setEnabled(false);
		
		//�󶨼�������
		an.addActionListener(this);
		wbq.addFocusListener(this);
	}
	//�¼�Դ
	public void actionPerformed(ActionEvent e) {
		
		//��ť�����¼�
		if(e.getSource().equals(an)) {
			//��������ѡ����
			int minNum;
			int maxNum;
			
			//��ȡ�ֵ䳤��
			int minNumLength=0;
			int maxNumLength=0;
			
			//��ȡ�ֵ���С���Ⱥ���󳤶�
			minNum = lbk1.getSelectedIndex();
			maxNum = lbk2.getSelectedIndex();
			
			//��ʼ���ֵ���С����
			switch(minNum) {
			case 0:
				JOptionPane.showMessageDialog(this, "��С���Ȳ���Ϊ0", "��Ϣ", 1);
				break;
			}
			
			//��ʼ���ֵ���󳤶�
			switch(maxNum) {
			case 0:
				JOptionPane.showMessageDialog(this, "����̫С", "��Ϣ", 1);
				break;
			case 1:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 9;
				break;
			case 2:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 99;
				break;
			case 3:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 999;
				break;
			case 4:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 9999;
				break;
			case 5:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 99999;
				break;
			case 6:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 999999;
				break;
			case 7:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 9999999;
				break;
			case 8:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 99999999;
				break;
			case 9:
				if(maxNum<minNum)
					JOptionPane.showMessageDialog(this, "��󳤶Ȳ���С����С����", "��Ϣ", 1);
				else
					maxNumLength = 999999999;
				break;
			}
			//�ֵ����
			/*�²�:���ܸ�ֵ�ɹ���,���Ƕ���intʶ��Ϊ��һ��0,������Ҫת�����ַ����ۼ�
			 * ����ܻᵼ������Ĳ�������Ϊͬһ��
			 * int a = 0; ��  int a = 00000000;	������int��������0,�⵼������С��������000000��ʼ
			 */
			while(maxNumLength >= minNumLength) {
//				System.out.println(maxNumLength +" "+ minNumLength);
				//minNumLength����,Ȼ��ÿ��ѭ����д���ļ�
				int n = minNumLength+1;
				String s="";
				try {
					FileWriter fw = new FileWriter("WifiWorlds.txt",true);
					BufferedWriter bfw = new BufferedWriter(fw);
					//===================================================
					//a=00000 == a=0������
					minNumLength+=1;
					if(maxNum>=minNum) {
						//��ȡ��ǰ0��λ��
						int x = maxNum-minNum;
						//���int��һλ���ϵ�0������
						switch(x) {
						case 1:
							s="0";
							break;
						case 2:
							s="00";
							break;
						case 3:
							s="000";
							break;
						case 4:
							s="0000";
							break;
						case 5:
							s="00000";
							break;
						case 6:
							s="000000";
							break;
						case 7:
							s="0000000";
							break;
						case 8:
							s="00000000";
							break;
						case 9:
							s="000000000";
							break;
						}
						s=s+String.valueOf(minNumLength);
					}
					//��ϸ������һ�μӲ���0����ûʲô����
					//a=0-a=010,һ����001...009,010����������,,���������Ű�
					//a=00000 == a=0������
					//===================================================
					fw.write(s+"\r\n");	//�����ҵ����ַ�������������ַ�
					fw.flush();
					fw.close();
					bfw.close();
				}
				catch(IOException ee) {
					JOptionPane.showMessageDialog(this, "�ļ�����ʧ��", "����", 0);
				}
			}
			//�����ļ���С
			File f = new File("WifiWorlds.txt");
			bjk.setText((f.length() / 1024)+"KB");
			//�����ļ�·��
			if(wbq.getText() != "�ֵ�����·��,Ĭ���ڳ�������Ŀ¼��") {
				wbq.setText("�����Ժ���ʵ��,�����۾�����������");
			}
		}
	}
	//��ȡ����
	public void focusGained(FocusEvent e) {
		//����ı����е���ʾ����
		if(e.getSource().equals(wbq)) {
			if(wbq.getText().equals("�ֵ�����·��,Ĭ���ڳ�������Ŀ¼��"))
				wbq.setText(null);
		}
	}
	//ʧȥ����
	public void focusLost(FocusEvent e) {
		//����ı����е��ı�Ϊ��ʱ��ʾ��ʾ����
		if(e.getSource().equals(wbq)) {
			if(wbq.getText().equals(""))
				wbq.setText("�ֵ�����·��,Ĭ���ڳ�������Ŀ¼��");
		}
	}
	//������
	public static void main(String[] args) {
		new Pwd();
	}
}
