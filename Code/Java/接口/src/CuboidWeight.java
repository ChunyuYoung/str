//�ܶ�=������ܶ�
public class CuboidWeight{
	float density;
	float fVolumn;
	public CuboidWeight(float density,float fVolumn){
		this.density = density;
		this.fVolumn = fVolumn;
	}
	//����
	float weight(){
		System.out.println("�������ܶ�:"+(this.density*fVolumn));
		return (this.density*fVolumn);
	}
}
