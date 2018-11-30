package com.str;

//计算价值
public class CuboidValue extends CuboidWeight{
	float value;
	public CuboidValue(float density, float fVolumn) {
		super(density, fVolumn);
	}

	//价值
	void coust(){	
		System.out.println(density*fVolumn);
	}
}
