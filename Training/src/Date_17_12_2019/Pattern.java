package Date_17_12_2019;
import java.util.Scanner;
public class Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc1.nextInt();
		sc1.close();
		
		//Print the Triangle
		for(int i=n;i>=0;i--)
		{
			for(int j=i;j>=1;j--)
				System.out.print("  ");
			for(int k=i;k<=n;k++)
				System.out.print(k+" ");
			for(int l=n-1;l>=i;l--)
				System.out.print(l+" ");
			System.out.println();
		}
	}
}

