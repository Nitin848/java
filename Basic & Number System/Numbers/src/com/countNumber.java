package com;

import java.util.Scanner;

public class countNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int c= isCount(n);
		System.out.println("total number of digits are "+c);

	}

	static int isCount(int a){
		int count=0;
		do {
			a=a/10;
			count++;
		}while(a!=0);
		return count;
	}

}






