package sumavg3;
import java.util.Scanner;
public class Sumavg3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int n[]=new int[5];
		 System.out.println("enter the five numbers: ");   
		   int i=0, sum = 0 , avg = 0;
		   do {
			   n[i]=input.nextInt();
			   sum+=n[i];
			   i++;
			 
			   }while(i<5);
		  
		   System.out.println("Sum = " +sum);
		   avg=sum/5;
		   System.out.println("avg = " +avg);
	       
	}

}
