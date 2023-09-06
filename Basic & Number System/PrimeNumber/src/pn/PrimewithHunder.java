package pn;

import java.util.Scanner;

public class PrimewithHunder {

	
		public static void main(String[] args) {
			//Scanner sc= new Scanner(System.in);
			//System.out.println("enter the range");
			//int n=sc.nextInt();
			int count=0;
			for(int i=2;i<100;i++) {
				boolean rs= isPrime(i);
				if(rs) {
					count++;
					System.out.println(i+"");
				}
			}
			System.out.println("The Number of prime with hunder are  "+count);
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
