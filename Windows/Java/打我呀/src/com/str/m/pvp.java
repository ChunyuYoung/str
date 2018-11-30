package com.str.m;
import java.util.*;
public class pvp {

	public static void main(String[] args) {
		System.out.println("请输入x然后回车");
		int n = 1000;
		Scanner re = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			n--;
			char ch = re.next().charAt(0);
			System.out.println(n);
		}
	}
}
