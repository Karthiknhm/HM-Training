package Date_16_12_2019;
import java.util.Scanner;
public class IP_Address
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
		int count = 0;
		int sum = 0;
		//first value must be greater than zero in first segment
		int first_value = 1;
		
		for(int j=0;j<input.length();j++)
		{
			char ch = input.charAt(j);
			
			if(ch!='.')
				sum = sum * 10 + ch - 48;
			if(ch=='.')
			{
				if(sum<=255 && sum>=first_value)
				{
					sum = 0;
					count++;
					
					first_value = 0;
				}
			}
		}
		//Last value count here
		if(sum<=255 && sum>=first_value)
			count++;
		
		if(count==4)
			System.out.println("Valid");
		else
			System.out.println("Not valid");
	}
}


