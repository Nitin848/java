package ternary2;
import java.util.Scanner;
public class Ternary2 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:"); 
        a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();
		if(a>=b)
		{
			if(a>=c)
				System.out.println("a is largest number");
			else
				System.out.println("c is largest number");		
		}
		else
		{
			if(b>=c)
				System.out.println("b is largest number");
			else
				System.out.println("c is largest number");		
		}
	}
}
