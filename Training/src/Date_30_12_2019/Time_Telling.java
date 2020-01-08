package Date_30_12_2019;

import java.util.Scanner;

public class Time_Telling 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the time in hours and minutes :");
		int h = sc1.nextInt();
		int m = sc1.nextInt();
		sc1.close();
		printWords(h, m); 
	}
	//Print the time in words
	static void printWords(int h, int m) 
	{ 
		String nums[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
						  "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
						  "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
						  "twenty six", "twenty seven", "twenty eight", "twenty nine" }; 
			
				if (m == 0) 
					System.out.println(nums[h] + " o' clock "); 
			
				else if (m == 15) 
					System.out.println("quarter past " + nums[h]); 
			
				else if (m == 30) 
					System.out.println("half past " + nums[h]); 
			
				else if (m == 45) 
					System.out.println("quarter to " + nums[(h)+ 1]); 
			
				else if (m <= 30) 
					System.out.println( nums[m] + " minutes past " + nums[h]); 
			
				else if (m > 30) 
					System.out.println( nums[60 - m] + " minutes to " +	nums[(h) + 1]); 
	} 

}









