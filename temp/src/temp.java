import  java.util.*;


public class temp{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature in celuis:");
		double ce= sc.nextDouble();
		
		
		double fa = ((ce*9)/5)+32;
		double celsius =(fa-32)*5/9;
		
		
		System.out.println("celsius  is :"+ ce);
		System.out.println("celsius to faharenheit of temperature is :"+fa);
		System.out.println("faharenheit to  celsius of temperature is :"+ celsius);
	
	


	}

}
