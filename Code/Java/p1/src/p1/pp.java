package p1;
import java.util.Arrays;
import java.util.Scanner;
public class pp {
	public static void main(String[] args) {
		//1.����Ĳ���
		System.out.println("����һ������");
		Scanner num = new Scanner(System.in);	
		int n= num.nextInt();	//��ȡ����������
		int n1[] = new int[n];	//��ʼ���������ռ�
		int sum=0;				//������Ԫ��ֵ�ܺ�
		int adv=0;				//������Ԫ��ֵƽ��ֵ
		for(int i = 0; i < n1.length;i++){
			n1[i] = num.nextInt();	//������Ԫ�ظ�ֵ
		}
		for(int j = 0;j<n1.length;j++){
			System.out.print(n1[j]);	//�������Ԫ��
		}
		//��n�����ĺ�
		for(int i =0;i<n1.length;i++){
			sum += n1[i];
		}
		System.out.println("\n����Ԫ���ܺ�:"+sum);
		//������Ԫ��ƽ��ֵ
		for (int i = 0; i < n1.length; i++) {
			adv = sum/n1.length;
		}
		System.out.println("����Ԫ��ƽ��ֵ:"+adv);
		//����Ԫ���������
		Arrays.sort(n1);
		System.out.print("�����������:");for(int i =0;i<n1.length;i++)System.out.print(n1[i]);
		//2.������a[]={2,5,8,31,6,8,14}������b[]={4,12,10,9,21,6}������Ԫ��֮��.
		int[] a = {2,5,8,31,6,8,14};
		int a1 = 0;
		int[] b = {4,12,10,9,21,6};
		int b1=0;
		//��������a����Ԫ��֮��
		for (int i = 0; i < a.length; i++) {
			a1 += a[i];
		}
		//��������b����Ԫ��֮��
		for(int j=0;j<b.length;j++) {
			b1 +=b[j];
		}
		System.out.print("\n����a����Ԫ���ܺ�:"+a1+"\n"+"����b����Ԫ���ܺ�:"+b1+"\n"+"����a��b����Ԫ���ܺ�Ϊ"+(a1+b1)+"\n");
		//�ָ���
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//����
		//3.�����Ķ�ά����(4*3)ʵ������ת��
		//����ת��ǰ:
		int[][] ch_2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};	//��ʼ����ά����
		System.out.println("��ά��������ת��ǰ");
		for(int i = 0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ch_2[i][j]+"\t");		//���������ʽ
			}
			System.out.println();		//����
		}
		for(int k=0;k<60;k++)
			System.out.print("=");	 	//�ָ���
		System.out.println(); 		//����
		//����ת����:
		System.out.println("��ά��������ת����");
		for(int i = 0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(ch_2[j][i]+"\t");		//���������ʽ
			}
			System.out.println();		//����
		}
		for(int k=0;k<60;k++)
			System.out.print("=");	 	//�ָ���
		System.out.println(); 		//����
		//4.������ά����ֱ�Ϊ{{0,1,2},{3,4,5},{6,7,9}}�� {{10,11,22},{33,24,55},{66,27,19}}���������²�����
		int[][] ch_21 = {{0,1,2},{3,4,5},{6,7,9}};				//��ʼ����һ����ά����
		int[][] ch_22 =  {{10,11,22},{33,24,55},{66,27,19}};	//��ʼ���ڶ�����ά����
		//�����һ����ά����
		System.out.println("�����һ����ά����:\n");
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ch_21[i][j]+"\t");	 		//�Ʊ��
			}
			System.out.println(); 		//����
		}
		//�ָ���
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//����
		//����ڶ�����ά����
		System.out.println("����ڶ�����ά����:\n");
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ch_22[i][j]+"\t");	 		//�Ʊ��
			}
			System.out.println(); 		//����
		}
		//�ָ���
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//����
		//�����ά����Ԫ��ֻ��
		int sum1=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				sum1 += ch_21[i][j];
		}
		System.out.println("��ά����Ԫ��֮��:"+sum1);
		//�ָ���
		for(int k=0;k<60;k++)
			System.out.print("=");
		System.out.println(); 		//����
		int sum2=0;		//��ʼ����ά�����һ��
		//��ά������������
		System.out.println("ch_21��ά�����Ӧ�ĵ�������Ԫ���ܺ�");
		for (int i = 0; i < ch_21.length; i++) {			//��
			for (int j = 0; j < ch_21.length; j++) {		//��
				sum += ch_21[i][j];
			}
			System.out.print(sum+"\t");
		}
	}
}
