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
		String f_date = sc1.next();
		System.out.println("Enter To (yyyy-mm-dd) :");
		String t_date = sc1.next();
		sc1.close();
		
		LocalDate dateBefore = LocalDate.parse(f_date);
		LocalDate dateAfter = LocalDate.parse(t_date);
		
		//Difference between to days
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		
		System.out.println(noOfDaysBetween);
		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Enter the From (dd-mm-yyyy) :");
//		String f_date = sc1.nextLine();
//		System.out.println("Enter the To (dd-mm-yyyy) :");
//		String t_date = sc1.nextLine();
//		sc1.close();
//		
//		String[] a1 = f_date.split("-");
//		String[] a2 = t_date.split("-");
//		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
//		
//		int d1 = Integer.parseInt(a1[0]);
//		int d2 = Integer.parseInt(a2[0]);
//		
//		int m1 = Integer.parseInt(a1[1]);
//		int m2 = Integer.parseInt(a2[1]);
//		int m1sum = 0;
//		for(int i=0;i<m1-1;i++)
//			m1sum = m1sum + month[i];
//		
//		int m2sum = 0;
//		for(int i=0;i<m2-1;i++)
//			m2sum = m2sum + month[i];
//	
//		int y1 = Integer.parseInt(a1[2]);
//		int y2 = Integer.parseInt(a2[2]);
//		
//		int l1 = y1/4 - y1/100 + y1/400;
//		int l2 = y2/4 - y2/100 + y2/400;
//		
//		int f1 = d1 + m1sum + (y1-l1)*365 + l1*366;
//		int f2 = d2 + m2sum + (y2-l2)*365 + l2*366;
//		int diff = f2 - f1;
//		
//		System.out.println(diff);
	}
}