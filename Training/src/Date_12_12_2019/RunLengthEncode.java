package Date_12_12_2019;

import java.util.Scanner;

public class RunLengthEncode
{
	public static void main(String[] args) 
	{
		long startTime   = System.nanoTime();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Encode value :");
		String s1 = sc1.next();
		sc1.close();
		String s2 = "";
		int count = 0;
		encode(s1,s2,count);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("\nNano seconds :"+totalTime);
	}
	
	//Find number value and then before letter is printed the number value times
	static void encode(String s1, String s2, int count)
	{
		for(int i=0;i<s1.length();i++)
		{
			// check the value is not in the range of 'a - z' means count the value
			if(!(s1.charAt(i)>=97 && s1.charAt(i)<=122))
			{
				int n = s1.charAt(i) - 48;
				count = count*10 + n;
				
				//Count is Zero means s2 String empty here
				if(count==0)
					s2 = "";
			}
			else
			{
				//Count time print the before letter
				for(int j=1;j<=count;j++)
				{
					System.out.print(s2);
					
					//Last count time s2 String empty here
					if(count==j)
						s2 = "";
				}
				
				//Letter one by one Store s2 string here and then count also Zero
				s2 = s2 + s1.charAt(i);
				count = 0;
			}
		}
		
		//last stored value print here
		for(int j=1;j<=count;j++)
			System.out.print(s2);
	}
}