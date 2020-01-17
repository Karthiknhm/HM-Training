package Date_13_12_2019;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CountDays 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter From (yyyy-mm-dd) :");
		String from_date = sc1.next();
		System.out.println("Enter To (yyyy-mm-dd) :");
		String to_date = sc1.next();
		sc1.close();
		count(from_date,to_date);
	}
	
	//Counting days between two days
	static void count(String from_date, String to_date)
	{
		LocalDate dateBefore = LocalDate.parse(from_date);
		LocalDate dateAfter = LocalDate.parse(to_date);
		
		//Difference between to days
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		
		System.out.println(noOfDaysBetween);
	}
}