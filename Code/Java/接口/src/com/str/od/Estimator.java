package com.str.od;

public class Estimator{
	public static void main(String args[]){
		double a[]={9.89,9.88,9.99,9.12,9.69,9.76,8.97};
		double b[]={56,55.5,65,50,51.5,53.6,70,49,66,62,46};
		CompurerAverage computer;
		computer = new SongGame();
		double result= computer.average(a);
		System.out.printf("%n");
		System.out.println();
	}
}