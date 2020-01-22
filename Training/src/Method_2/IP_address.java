package Method_2;
import java.util.Scanner;
public class IP_address
{
	public static void main(String[] args) 
	{
		long startTime   = System.nanoTime();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter IP Address :");
		String input = sc1.next();
		sc1.close();
		check(input);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Nano seconds :"+totalTime);
	}

	//Check the IP Address
	static void check(String input)
	{
		String[] arr = input.split("[.]");
		int result = 0;
		int first = 1;
		
		if(arr.length==4)
		{
	      for(int i=0;i<arr.length;i++)
	      {
	    	  if(Integer.parseInt(arr[i])>=first && Integer.parseInt(arr[i])<=255)
	    	  {
	    		   result++;
	    		   first = 0;
	    	  }
	      }
	      if(result==4)
	    	  System.out.println("valid");
	      else
	    	  System.out.println("Not valid");
		}
		else
			System.out.println("Not valid");
	}
}
