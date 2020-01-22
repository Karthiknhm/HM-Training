package Method_2;
import java.util.Scanner;
public class ValidPassword
{
	public static void main(String[] args) 
	{
		long startTime = System.nanoTime();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the password :");
		String password = sc1.nextLine();
		sc1.close();
		checkpassword(password);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Nano seconds :"+totalTime);
	}
	
	//Check password is valid or not
	static void checkpassword(String password) 
	{
		int length = password.length();
		
		//check password must be 8 to 15 character
		if(length>=8 && length<=15)
		{
			int small_alphabet = 0, capital_alphabet = 0;
			int numeric = 0, special_character = 0;
			
			for(int i=0;i<length;i++)
			{
				char ch = password.charAt(i);
				
				//small_alphabet
				if(ch>='a' && ch<='z')
					small_alphabet++;
				
				//capital_alphabet
				else if(ch>='A' && ch<='Z')
					capital_alphabet++;
				
				//numeric
				else if(ch>='0' && ch<='9')
					numeric++;
				
				//special_character
				else
					special_character++;
			}
			if(small_alphabet>=1 && capital_alphabet>=1 && numeric>=1 && special_character>=1)
				System.out.println("Password is valid");
			else
				System.out.println("Password is invalid");
		}
		else
			System.out.println("Password is invalid");
	}
}
