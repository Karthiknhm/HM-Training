package Date_12_12_2019;
import java.util.Scanner;
public class HorsecutQueen 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Horse Position(Row and column):");
		int Hr = sc1.nextInt();
		int Hc = sc1.nextInt();
		System.out.println("Enter Queen Position(Row and column):");
		int Qr = sc1.nextInt();
		int Qc = sc1.nextInt();
		sc1.close();
		position(Qr,Qc,Hr,Hc);
	}
	static void position(int Qr,int Qc,int Hr,int Hc)
	{
		//Horse possible movements 
		if(Hr-2==Qr&&Hc-1==Qc|| Hr-1==Qr&&Hc-2==Qc|| Hr+1==Qr&&Hc-2==Qc|| Hr+2==Qr&&Hc-1==Qc||
		   Hr+2==Qr&&Hc+1==Qc|| Hr+1==Qr&&Hc+2==Qc|| Hr-1==Qr&&Hc+2==Qc|| Hr-2==Qr&&Hc+1==Qc )
			System.out.println("Horse cut Queen");
		else
			System.out.println("Queen is safe");
	}
}