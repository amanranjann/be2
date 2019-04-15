
import java.io.*;  
import java.net.*; 
import java.util.Scanner;
public class client 
{  
    public static void main(String[] args)
    {  
    	try
    	{      
    		Socket s=new Socket("localhost",1236);  
    		DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
			DataInputStream dis = new DataInputStream(s.getInputStream());

    		Scanner in = new Scanner(System.in); 
		    System.out.printf("Enter i Value:  ");
		    int i = in.nextInt();
		    System.out.printf("Enter j Value:  ");
		    int j = in.nextInt();
		    
		    dout.writeInt(i);
		    dout.writeInt(j);
		    
		    int ch;
			System.out.println("Enter 1 for addition\n");
		    System.out.println("Enter 2 for subtraction\n");
//		    System.out.println("Enter 3 for multiplication\n");
//		    System.out.println("Enter 4 for division\n");
		    ch = in.nextInt();
		    dout.writeInt(ch);
		    
		    int sum = dis.readInt(); 
		    
		    System.out.println("Sum: " + sum);
		    
/*		    dout.writeUTF(""+ sum);  
		    dout.flush();  
		    dout.close();  
*/		    s.close();  
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}  
    }  
}  













