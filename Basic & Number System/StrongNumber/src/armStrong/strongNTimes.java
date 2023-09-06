package armStrong;

import java.util.Scanner;

public class strongNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n= sc.nextInt();
		//int m=sc.nextInt();
		for(int i=1;n>0;i++) {
			boolean rs = isStrong(i);
			if (rs== true )
				System.out.println(i);
				n--;
		}


	}
	static boolean isStrong(int x) {
		int sum=0, temp=x;
		do {
			int d= x%10;
			sum =sum+fat(d);
			x=x/10;
		}while(x!=0);

		return sum==temp;


	}
	static int fat(int n )
	{
		int fact=1;
		while(n!=1) {
			fact=fact*n;
			n--;

		}
		return fact;


	}

}
