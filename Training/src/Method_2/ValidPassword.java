package Method_2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword 
{
	public static void main(String[] args) 
	{
		long startTime   = System.nanoTime();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Password :");
		String pw = sc1.next();
		sc1.close();
		check(pw);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Nano seconds :"+totalTime);
	}
	
	//check the password is valid or not
	static void check(String pw) 
	{
		String[] s1 = {".*[a-z].*", ".*[A-Z].*", ".*[0-9].*", ".*\\W.*"};
		int length = s1.length;
		int total = pw.length();
		int count = 0;
			
		for(int i=0;i<length;i++)
		{
			Pattern p = Pattern.compile(s1[i]);
			Matcher m1 = p.matcher(pw);
			
			if(m1.find())
				count++;
			else
				break;
		}
		
		if(count==4 && total>=8 && total<=15)
			System.out.println("Password Valid");
		else
			System.out.println("Password Not Valid : \n* Password must be 8 to 15 characters \n* At least one Capital letter "
					+ "\n* At least one small letter \n* At least one Number \n* At least one Special character");
	}
}
