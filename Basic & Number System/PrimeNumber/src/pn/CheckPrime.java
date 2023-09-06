package pn;

import java.util.Scanner;

public class CheckPrime {
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		boolean rs=isPrime(n);
		if(rs==true)
			System.out.println(rs);
		else
			System.out.println(rs);
		


	}

}
