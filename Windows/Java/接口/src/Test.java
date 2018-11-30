package com.str;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		//输出长方体的体积,重量和价值
		//体积:v长=abc
		System.out.println("你将输入三个小数/整数:长宽高");
		Scanner value = new Scanner(System.in);
		float f1Value = value.nextFloat();
		float f2Value = value.nextFloat();
		float f3Value = value.nextFloat();
		float fVolumn;	//体积
		float fDensity;	//重量
		Cuboid c1 = new Cuboid(f1Value,f2Value,f3Value);
		fVolumn = c1.volumn();	//获取Cuboid类长方体积
		c1.volumn();	//输出长方体积
		//密度=长宽高密度
		System.out.println("你将输入一个小数/整数:密度");
		float f4Value = value.nextFloat();
		CuboidWeight c2 = new CuboidWeight(f4Value,fVolumn);
		fDensity = c2.weight();
		c2.weight();
		//价值=体积重量
		CuboidValue f5 = new CuboidValue(fVolumn,fDensity);
		f5.coust();
	}
}


