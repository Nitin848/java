package com;

import java.util.Scanner;

public class OcttoDec {

	public static void main(String[] args) {
		System.out.println("enter the octal number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int dec=0;
		int count=0;
		while(n>0)
		{
			int r=n%10;
			dec=dec + r*pow(8,count);
			count++;
			n/=10;
		}
		System.out.println("decimal Equivalent:" +dec);
	}
	static int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;

	}

}
