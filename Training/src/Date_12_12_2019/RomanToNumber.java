package Date_12_12_2019;
import java.util.Scanner;
public class RomanToNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Roman value :");
		String input = sc1.next();
		sc1.close();
		//Call the function to convert Roman to Integer
		System.out.println(romantointeger(input));
	}
	static int romantointeger(String roman) 
	{
		//Initially declare result value
		int result = 0;
		
		for(int i=0;i<roman.length();i++)
		{
			int value_1 = number(roman.charAt(i));
			
			if(roman.length()>i+1)
			{
				int value_2 = number(roman.charAt(i+1));
				
				//value_1 is greater than or equal 
				if(value_1 >= value_2)
					result = result + value_1;
				
				else //value_1 is less means subtract value_2 - value_1 
					 //Increment the i value why means again value_2 come to check
				{
					result = result + value_2 - value_1;
					i++;
				}
			}
			else //Last value add to the result 
				result = result + value_1;
		}
		return result;
	}
	static int number(char ch)
	{
		int num = -1;
		switch(ch)
		{
			case 'I' : num = 1; break;
			case 'V' : num = 5; break;
			case 'X' : num = 10; break;
			case 'L' : num = 50; break;
			case 'C' : num = 100; break;
			case 'D' : num = 500; break;
			case 'M' : num = 1000; break;
			default : System.out.println("Not a Roman Value");
		}
		return num;
	}
}