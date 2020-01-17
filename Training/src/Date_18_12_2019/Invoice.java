package Date_18_12_2019;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Invoice
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Details :");
		String input = sc1.nextLine();
		sc1.close();

		find_name(input);
		find_date(input);
		find_phone(input);
		find_amount(input);
		find_tax(input);
	}
	//Check name
	static void find_name(String input) 
	{
		Pattern p1 = Pattern.compile("Name[:]\\s");
		Matcher m1 = p1.matcher(input);
		m1.find();
		Pattern p2 = Pattern.compile("[a-zA-Z]+\\s");
		Matcher m2 = p2.matcher(input);
		m2.find(m1.end());
		System.out.println("Name: "+m2.group());
	}
	//Check Date
	static void find_date(String input) 
	{
		Pattern p1 = Pattern.compile("Date[:]\\s");
		Matcher m1 = p1.matcher(input);
		m1.find();
		Pattern p2 = Pattern.compile("\\d\\d-\\d\\d-\\d{4}");
		Matcher m2 = p2.matcher(input);
		m2.find(m1.end());
		System.out.println("Date: "+m2.group());
	}
	//Check Phone number
	static void find_phone(String input) 
	{
		Pattern p1 = Pattern.compile("Phone[:]\\s");
		Matcher m1 = p1.matcher(input);
		m1.find();
		Pattern p2 = Pattern.compile("[6-9][0-9]{9}");
		Matcher m2 = p2.matcher(input);
		m2.find(m1.end());
		System.out.println("Phone: "+m2.group());
	}
	//Check Total amount
	static void find_amount(String input)
	{
		Pattern p1 = Pattern.compile("Total amount[:]\\s");
		Matcher m1 = p1.matcher(input);
		m1.find();
		Pattern p2 = Pattern.compile("\\d{0,9}[.]\\d\\d");
		Matcher m2 = p2.matcher(input);
		m2.find(m1.end());
		System.out.println("Total amount: "+m2.group());
	}
	//Check Tax amount
	static void find_tax(String input) 
	{
		Pattern p1 = Pattern.compile("Tax[:]\\s");
		Matcher m1 = p1.matcher(input);
		m1.find();
		Pattern p2 = Pattern.compile("\\d{0,9}[.]\\d\\d");
		Matcher m2 = p2.matcher(input);
		m2.find(m1.end());
		System.out.println("Tax: "+m2.group());
	}
	
}


//String input = "Date: 24-11-2000 Tax: 1000.00 Name: Sabhari  Phone: 8248216179 Total amount: 15000.00 ";

