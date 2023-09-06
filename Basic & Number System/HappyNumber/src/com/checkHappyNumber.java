package com;

import java.util.Scanner;
public class checkHappyNumber {
	static boolean isHappy(int n) {
		while(n>9)
		{
			int sum=0;
			do{
				int d=n%10;
				sum= sum+d*d;
				n=n/10;
			}while(n!=0);
			n=sum;

		}
		return n==1||n==7;
	}

	public static void main(String[] args) {
		Scanner s= new  Scanner(System.in);
		System.out.println("enter th number:");
		int n=s.nextInt();
		boolean rs =isHappy(n);
		if(rs) {
			System.out.println(rs+" is a Happy number");
		}
		else {
			System.out.println(rs+" is not aHappy Number");
		}
	}
}
