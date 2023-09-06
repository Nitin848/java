package pn;

import java.util.Scanner;

public class PrimewithNM {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range with N amd M");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		for(int i=n;i<m;i++) {
			boolean rs= isPrime(i);
			if(rs) {
				count++;
				System.out.println(i+"");
			}
		}
		System.out.println("The prime number  with N amd m  are  "+count);
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
