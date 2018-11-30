package com.str;

//密度=长宽高密度
public class CuboidWeight{
	float density;
	float fVolumn;
	public CuboidWeight(float density,float fVolumn){
		this.density = density;
		this.fVolumn = fVolumn;
	}
	//重量
	float weight(){
		System.out.println("长方体密度:"+(this.density*fVolumn));
		return (this.density*fVolumn);
	}
}
