import java.util.Scanner;

public class Leakybucket {
	static int min(int x,int y)
	{
		if(x<y)
			return x;
		else
			return y;
		
	}
	public static void main(String[] args)
	{
		int drop=0,mini,nsec,cap,count=0,i,process;
		int inp[]=new int [25];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the bucket size\n");
		cap=sc.nextInt();
		System.out.println("enter the operation rate\n");
		process=sc.nextInt();
		System.out.println("enter the no og seconds you want to stimulate\n");
		nsec=sc.nextInt();
		for(i=0;i<nsec;i++)
		{
			System.out.println("enter the size of the packet entering at "+i+1+"sec");
			inp[i]=sc.nextInt();
			
		}
		System.out.println("\n second |packet received| packet sent| paket left| paket dropped\n");
		for(i=0;i<nsec;i++)
		{
			count+=inp[i];
			if(count>cap)
			{
				drop=count-cap;
				count=cap;
			}
			System.out.println(i+1);
			System.out.println("\t\t"+inp[i]);
			mini=min(count,process);
			System.out.println("\t\t"+mini);
			count=count-mini;
			System.out.println("\t\t"+count);
			System.out.println("\t\t"+drop);
			System.out.println();
			
			
		}
		for(i=count;count!=0;i++)
		{
			if(count>cap)
			{
				drop=count-cap;
				count=cap;
			}
			System.out.println(i+1);
			System.out.println("\t\t");
			mini=min(count,process);
			System.out.println("\t\t"+mini);
			count=count-mini;
			System.out.println("\t\t"+count);
			System.out.println("\t\t"+drop);
			System.out.println();
		}
	}

}
