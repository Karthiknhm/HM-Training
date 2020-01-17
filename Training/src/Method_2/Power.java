package Method_2;
import java.util.Scanner;
public class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		int number = sc1.nextInt();
		sc1.close();
		power(number);
	}
	
	//Input number is convert into string
	//String value is segregate first and neighbor letter and then power the two values
	//Adding Power values
	static void power(int number) 
	{
		double result = 0;
		String s1 = Integer.toString(number);
		
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
		
		System.out.println(result);
	}
}
