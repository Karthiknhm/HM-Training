package Date_12_12_2019;
import java.util.Scanner;
public class QueencutHorse 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Queen Position(Row and column):");
		int Qr = sc1.nextInt();
		int Qc = sc1.nextInt();
		System.out.println("Enter Horse Position(Row and column):");
		int Hr = sc1.nextInt();
		int Hc = sc1.nextInt();
		sc1.close();
		position(Qr,Qc,Hr,Hc);
	}
	static void position(int Qr,int Qc,int Hr,int Hc)
	{
		if(Qr==Hr) //check Queen and Horse row equal
			System.out.println("Queen cut Horse");
		
		else if(Qc==Hc) //check Queen and Horse column equal
			System.out.println("Queen cut Horse");
		
		//Subtract Queen and Horse row and Subtract Queen and Horse column 
		else if(Math.abs(Qr-Hr)==Math.abs(Qc-Hc))
			System.out.println("Queen cut Horse");
		else
			System.out.println("Horse is safe");
	}
}