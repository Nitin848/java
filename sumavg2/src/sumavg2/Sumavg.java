package sumavg2;
import java.util.Scanner;
public class Sumavg {

	public static void main(String[] args) {
		    int sum = 0 , avg = 0;
           Scanner input = new Scanner(System.in);
            int n[]=new int[5];
		   
		    System.out.println("enter the five numbers: ");
	        int i = 0;
			while( i<5 ){
				
				 n[i]= input.nextInt();
				sum += n[i];
	             i++;
	        }
	        System.out.println("sum="+sum);
	       avg=sum/5 ;
	       System.out.println( "avg="+avg);
	       

	}

}
