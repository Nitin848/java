package ternary3;
import java.util.Scanner;
public class Ternary3 {

	public static void main(String[] args) {
		int a, b, c;  
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is largest number");	
		}
		if (b>a && b>c)
		{
			System.out.println("b is largest number");
		}
		if(c>a && c>b)
		{
			System.out.println(" c is largest number");
		}
			

	}

}
