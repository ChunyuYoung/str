package _�ȴ�С;
public class _Max 
{
	public static void main(String[] args) 
	{
		//int a=5,b=4;
		//System.out.println(a > b ? a : b);
		//2.��Eclipse�б�дJava���������Hello Java����
		System.out.println("Hello World!");
		//3.��Eclipse�б�дJava��������Լ��İ༶��ѧ�š���������Ϣ
		System.out.println("ѧ�ţ�177063���Ա�:�У�������ʷ���,�༶��T1702");
		System.out.println();
		
		//����
		System.out.println("�ȴ�С");
		int max=0;
		int[] num = {98,205,23};
		for(int i = 0;i < num.length;i++)
			if(num[i] > max)
				max = num[i];
		System.out.println(max);
	}
}
