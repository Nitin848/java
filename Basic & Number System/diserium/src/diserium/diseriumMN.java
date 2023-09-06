package diserium;

import java.util.Scanner;

public class diseriumMN {public static void main(String[] args) {
	Scanner sc = new Scanner(System .in);
	System.out.println("enter the number ");
	int n =sc.nextInt();
	int m=sc.nextInt();
	for(int i=n;i<=m;i++)
	{
		boolean r=isArmStrong(i);
		if(r==true)
			System.out.println(i);
	}
}
static int countDigit(int n) {
	int count= 0;
	do {
		count++;
		n=n/10;

	}while(n!=0);
	return count;
}

static int pow(int n ,int p) {
	int prod=1;
	while(p>0) {
		prod=prod*n;
		p--;

	}
	return prod;
}
static boolean isArmStrong(int x) {
	int dc= countDigit(x);
	int sum=0, temp=x;
	do {
		int d=x%10;
		sum =sum+pow(d,dc);
		x=x/10;
		dc--;
	}while(x!=0);
	return sum ==temp;

}


}
