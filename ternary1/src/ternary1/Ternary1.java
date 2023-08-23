package ternary1;
import java.util.Scanner;
public class Ternary1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:"); 
        a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println(a+ "a is largest number");	
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b+ "b is largest number");
		}
		else
		{
			System.out.println(c+ "c is largest number");
		}
	}
}
