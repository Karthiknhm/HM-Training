package Method_2;
import java.util.Scanner;
public class Countdays 
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the From (dd-mm-yyyy) :");
		String from_date = sc1.nextLine();
		System.out.println("Enter the To (dd-mm-yyyy) :");
		String to_date = sc1.nextLine();
		sc1.close();
		count(from_date,to_date);
	}
	
	//Counting days between two days
	static void count(String from_date, String to_date)
	{
		String[] a1 = from_date.split("-");
		String[] a2 = to_date.split("-");
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//Date is convert into integer
		int d1 = Integer.parseInt(a1[0]);
		int d2 = Integer.parseInt(a2[0]);
		
		//Month is convert into integer
		int m1 = Integer.parseInt(a1[1]);
		int m2 = Integer.parseInt(a2[1]);
		
		//Month wise adding days
		int m1sum = 0;
		for(int i=0;i<m1-1;i++)
			m1sum = m1sum + month[i];
		
		//Month wise adding days
		int m2sum = 0;
		for(int i=0;i<m2-1;i++)
			m2sum = m2sum + month[i];
	
		//Year is convert into integer
		int y1 = Integer.parseInt(a1[2]);
		int y2 = Integer.parseInt(a2[2]);
		
		//Count Leap year 
		int l1 = y1/4 - y1/100 + y1/400;
		int l2 = y2/4 - y2/100 + y2/400;
		
		//Final of adding days
		int f1 = d1 + m1sum + (y1-l1)*365 + l1*366;
		int f2 = d2 + m2sum + (y2-l2)*365 + l2*366;
		int diff = f2 - f1;
		
		System.out.println(diff);
	}
	
}
