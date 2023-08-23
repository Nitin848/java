package ternary;
import java.util.*;
public class Ternary {

	public static void main(String[] args) {
		int a, b, c, largest, min;  
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();
		
		min=a>b?a:b;
		largest=c>min?c:min;  
		 
	 
		System.out.println(largest);
		

	}

}
