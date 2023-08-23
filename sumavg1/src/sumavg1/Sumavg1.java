package sumavg1;
import java.util.Scanner;
public class Sumavg1 {
	public static void main(String[] args) {
		   
		   int sum = 0 , avg = 0;
	        System.out.println("enter the five numbers: ");
	       
			for(int i=0; i<5; i++){
				 Scanner input = new Scanner(System.in);
				 int n = input.nextInt();
	            sum += n;
	            
	        }
	        System.out.println("sum="+sum);
	       avg=sum/5 ;
	       System.out.println( "avg="+avg);
	       
	       
	}
}
