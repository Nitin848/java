package com;

import java.util.Scanner;

public class DectoBin {

	public static void main(String[] args) {
		System.out.println("enter the decimal number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String bin="";
		while(n>0)
		{
		int r=n%2;
		bin= r + bin;
		n=n/2;
		}
		System.out.println("Binary Equivalent:" + bin);

	}

}
