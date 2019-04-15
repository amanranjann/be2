import java.io.*;
import java.util.*;


 public class Bully {

	static int pid[] = new int[100];
	static int status[] = new int[100];
	static int n, co;
	
	public static void main(String agrs[])throws IOException
	{
		int i;
		System.out.println("Enter the number of process : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(i=0;i<n;i++)
		{
			//For procees i+1 process id is assigned
			pid[i]= i+1 ;
			
		}
		
		System.out.println("Which process sends a message to the co-ordinator ?");
		int elect = in.nextInt();
		
		System.out.println("Process "+ elect + " does not recieve an ok message from co-ordinator.");
		
		election(elect);
		
		System.out.println("Final co-ordinator is "+ co);
		System.out.println(co + " sends a message to all processes that it is the co-ordinator.");
		
		close(in);
		
	}
	
	private static void close(Scanner in) {
		// TODO Auto-generated method stub
		
	}

	public static void election(int elect_co)
	{
		elect_co = elect_co - 1;
		
		for(int i=0; i<n; i++)
		{
			if(pid[elect_co] < pid[i])
			{
				System.out.println("Election message is sent from "+ (elect_co+1) +" to "+ (i+1));
				if(i+1 == n)
				{
					System.out.println(i+1 +" has not replied.");
				}
				else
				{
					System.out.println(i+1 +" has replied with an ok message.");
					co = i+1;
					election(i+1);
				}
			}
		}
	}
	
}
