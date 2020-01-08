package Date_16_12_2019;
import java.util.Scanner;
public class IP_Address
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter IP Address :");
		String input = sc1.next();
		sc1.close();
		check(input);
	}
	//Check the IP Address
	static void check(String input)
	{
		int count = 0;
		int sum = 0;
		int f = 1;
		
		for(int j=0;j<input.length();j++)
		{
			char ch = input.charAt(j);
			if(ch!='.')
				sum = sum * 10 + ch - 48;
			if(ch=='.')
			{
				if(sum<=255 && sum>=f)
				{
					sum = 0;
					count++;
					f = 0;
				}
			}
		}
		if(sum<=255 && sum>=f)
			count++;
		if(count==4)
			System.out.println("Valid");
		else
			System.out.println("Not valid");
	}
}


