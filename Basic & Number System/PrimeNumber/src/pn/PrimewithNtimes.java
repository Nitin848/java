package pn;

import java.util.Scanner;

public class PrimewithNtimes {
	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;n>i;i++) {
			boolean rs= isPrime(i);
			if(rs) {
				count++;
				System.out.println(i+"");
			}
		}
		System.out.println("The primes number with n times are s  "+count);
	}
	static  boolean isPrime(int x) {
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				return false;
			}

		}
		return true; 
	}
}


