//�����ֵ
public class CuboidValue extends CuboidWeight{
	float value;
	public CuboidValue(float density, float fVolumn) {
		super(density, fVolumn);
	}

	//��ֵ
	void coust(){	
		System.out.println(density*fVolumn);
	}
}
