package rectangle;
import  java.util.*;


public class rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of rectangle:");
		System.out.println("enter the breath of rectangle:");
		double le= sc.nextDouble();
		double br= sc.nextDouble();
		double area = le* br;
		double pre= 2*(le+br);
		System.out.println("length is :"+ le);
		System.out.println("breath is :"+br);
		System.out.println("area of rectangle is:"+area);
		System.out.println("perimeter of retangle is :"+pre);
				


	}

}
