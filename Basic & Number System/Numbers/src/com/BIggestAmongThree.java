package com;

import java.util.Scanner;

public class BIggestAmongThree {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  three  number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is Biggest Number");
		else if(b>c)
			System.out.println(b+" is Biggest Number");
		else 
			System.out.println(c+"is Biggest Number");

	}

}
