package com;
//sum of digits is eqaual to sum of Products

import java.util.Scanner;

public class checkSpyNo {
	static boolean isSpyNumber(int n) {
		int sum=0,mul=1,tep=n;
		do {
			int d=n/10;
			sum=sum+d;
			mul=mul*d;
			n=n/10;
		}while(n!=0);	
		return sum==mul ;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter th number:");
	int n= sc.nextInt();
	boolean rs = isSpyNumber(n);
	if(rs) {
		System.out.println(rs+"is a Spy Number");
	}
	else
	{
		System.out.println(rs+"is a not spy Number");
	}

	

	}

}
