package Date_20_12_2019;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateToDay 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Date (dd/MM/yyyy) :");
		String date = sc1.nextLine();
		sc1.close();
		//Convert Date to Day in words
		System.out.println(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getDayOfWeek().name());
	        
	}
}


