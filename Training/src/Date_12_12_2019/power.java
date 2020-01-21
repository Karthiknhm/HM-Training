package Date_12_12_2019;

import java.util.Scanner;

public class power
{
	public static void main(String[] args) 
	{
		long startTime   = System.nanoTime();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value :");
		String s1 = sc1.next();
		sc1.close();
		powertoAdding(s1);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Nano seconds :"+totalTime);
	}
	
	//Input value is segregate first and neighbor letter and then power the two values
	//Adding Power values
	static void powertoAdding(String s1) 
	{
		double result = 0;
		
		for(int i=0;i<s1.length()-1;i++)
		{
			int n1 = s1.charAt(i) - 48;
			int n2 = s1.charAt(i+1) - 48;
			
			//Power the first and second letter
			double d1 = Math.pow(n1, n2);
			result = result + d1;
		}
		
		//Last letter adding into result 
		int l1 = s1.charAt(s1.length()-1) - 48;
		int l2 = s1.charAt(0) - 48;
		
		//Power the first and second letter
		double d1 = Math.pow(l1, l2);
		result = result + d1;
		
		System.out.println("Result : "+result);
	}
}