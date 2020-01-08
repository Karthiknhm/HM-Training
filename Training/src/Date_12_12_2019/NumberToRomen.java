package Date_12_12_2019;
import java.util.Scanner;
public class NumberToRomen 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Integer value :");
		int input = sc1.nextInt();
		sc1.close();
		//Call the function to convert Integer to Roman 
		System.out.println(integertoroman(input));
	}
	static String integertoroman(int input) 
	{
		int[] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
		String[] rom = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		
		int i = value.length-1;
		String result = "";
		int rem = 0;
		
		while(input>0)
		{
			if(input>=value[i])
			{
				rem = input % value[i];
				input = input / value[i];

				for(int j=0;j<input;j++)
					result = result + rom[i];
				
				input = rem;
			}
			i--;
		}
		return result;
	}
}
