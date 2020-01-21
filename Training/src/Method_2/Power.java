package Method_2;

import java.util.Scanner;

public class Power 
{
	public static void main(String[] args) 
	{
		long startTime   = System.nanoTime();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value :");
		String s1 = sc1.next();
		sc1.close();
		power(s1);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Nano seconds :"+totalTime);
	}
	
	//Input number is convert into string
	//String value is segregate first and neighbor letter and then power the two values
	//Adding Power values
	static void power(String s1)
	{
		double result = 0;
		
		for(int i=0;i<s1.length()-1;i++)
		{
			int n1 = s1.charAt(i) - 48;
			int n2 = s1.charAt(i+1) - 48;
			int temp = n1;
			
			//Power the first and second letter
			for(int j=1;j<n2;j++)
			{
				n1 = n1 * temp;
			}
			result = result + n1;
		}
		//Last letter adding into result
		int l1 = s1.charAt(s1.length()-1) - 48;
		int l2 = s1.charAt(0) - 48;
		int temp = l1;
		
		//Power the first and second letter
		for(int j=1;j<l2;j++)
			l1 = l1 * temp;
		
		result = result + l1;
		
		System.out.println("Result : "+result);
	}
}
