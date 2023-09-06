import java.util.Scanner;

public class arirthmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value  of a:");
		System.out.println("enter the value of b :");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		double add= a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		double mod = a%b;
		
		
		System.out.println("a is :"+ a);
		System.out.println("b is :"+b);
		System.out.println("addition of two numbers:"+add);
		System.out.println("subration of two numbers:"+sub);
		System.out.println("multipliction of two numbers:"+mul);
		System.out.println("divison of two numbers:"+div);
		System.out.println("modulus of two numbers:"+mod);
				

	}

}
