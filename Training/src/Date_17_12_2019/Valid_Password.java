package Date_17_12_2019;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Valid_Password
{
	public static void main(String[] args)  
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Password :");
		String pw = sc1.next();
		sc1.close();
		check(pw);
	}
	//Regular Expression to check the password is valid or not
	static void check(String pw) 
	{
		Pattern sma = Pattern.compile(".*[a-z].*");
		Pattern cap = Pattern.compile(".*[A-Z].*");
		Pattern num = Pattern.compile(".*[0-9].*");
		Pattern spe = Pattern.compile(".*\\W.*");

		Matcher m1 = sma.matcher(pw);
		Matcher m2 = cap.matcher(pw);
		Matcher m3 = num.matcher(pw);
		Matcher m4 = spe.matcher(pw);
		int total = pw.length();
			
		if(m1.find() && m2.find() && m3.find() && m4.find() && total>=8 && total<=15)
			System.out.println("Password Valid");
		else
			System.out.println("Password Not Valid : \n* Password must be 8 to 15 characters \n* At least one Capital letter "
					+ "\n* At least one small letter \n* At least one Number \n* At least one Special character");
	}
}

