package com;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scn.nextInt();
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
		fact=fact*i;
		}
		System.out.println(fact);
		
	}
}
