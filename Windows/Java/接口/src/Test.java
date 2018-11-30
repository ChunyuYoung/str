import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		//�������������,�����ͼ�ֵ
		//���:v��=abc
		System.out.println("�㽫��������С��/����:�����");
		Scanner value = new Scanner(System.in);
		float f1Value = value.nextFloat();
		float f2Value = value.nextFloat();
		float f3Value = value.nextFloat();
		float fVolumn;	//���
		float fDensity;	//����
		Cuboid c1 = new Cuboid(f1Value,f2Value,f3Value);
		fVolumn = c1.volumn();	//��ȡCuboid�೤�����
		c1.volumn();	//����������
		//�ܶ�=������ܶ�
		System.out.println("�㽫����һ��С��/����:�ܶ�");
		float f4Value = value.nextFloat();
		CuboidWeight c2 = new CuboidWeight(f4Value,fVolumn);
		fDensity = c2.weight();
		c2.weight();
		//��ֵ=�������
		CuboidValue f5 = new CuboidValue(fVolumn,fDensity);
		f5.coust();
	}
}


