package com.str;
//描述长方体的父类
public class Cuboid{
	float height,width,length;
	public Cuboid(float height,float width,float length){
		this.height = height;
		this.width = width;
		this.length = length;
	}
	//体积
	float volumn(){
		System.out.println("长方体积:"+(this.height*this.length*this.width));
		return (this.height*this.length*this.width);
	}
}
