package Date_30_12_2019;

import java.util.Scanner;

public class Unique_number
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Range value :");
		int input1 = sc1.nextInt();
		int input2 = sc1.nextInt();
		sc1.close();
		
		for(int i=input1;i<=input2;i++)
		{
			if(find_unique(i))
				System.out.println(i);
		}
	}
	//Check the number is unique or not
	static boolean find_unique(int i) 
	{
		int constant = 0;
		int count = 1;
		
		while(i>0)
		{
			int rem = i%10;
			
			if(count == 1)
			{
				constant = rem;
				count++;
			}

			if(rem==constant && count!=2)
				return false;
			
			i = i/10;
			count++;
		}
		return true;
	}
}
