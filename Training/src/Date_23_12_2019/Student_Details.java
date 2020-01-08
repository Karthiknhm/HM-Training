package Date_23_12_2019;
import java.util.Scanner;
public class Student_Details 
{
	static Scanner sc1 = new Scanner(System.in);
	static String name = "";
	static String D_name = "";
	static int m1 = 0;
	static int e1 = 0;
	static int cn1 = 0;
	static int j2 = 0;
	static int Total = 0;
	static double per = 0.0;
	
	public static void main(String[] args) 
	{
		System.out.println("How much student details your enter :");
		int t = sc1.nextInt();
		for(int i=1;i<=t ;i++)
		{
			int Rno = i;
			stu_details();
			System.out.println("R.NO : "+Rno);
			System.out.println("Name : "+name);
			System.out.println("Department Name : "+D_name);
			System.out.println("Maths Mark : "+m1);
			System.out.println("English Mark : "+e1);
			System.out.println("Computer Network Mark : "+cn1);
			System.out.println("Java Programming Mark : "+m1);
			System.out.println("Total Marks : "+Total);
			System.out.println("Percentage : "+per+"%");
		}
	}

	static void stu_details() 
	{
		System.out.println("Enter the Student Name :");
		name = sc1.next();
		System.out.println("Enter the Department Name :");
		D_name = sc1.next();
		check_dept(D_name);
	}

	static void check_dept(String d_name)
	{
		String Dept1 = "CSE";
		String Dept2 = "IT";
		
		if(d_name.equalsIgnoreCase(Dept1))
			cse_department();
		else if(d_name.equalsIgnoreCase(Dept2))
			IT_Department();
		else
		{
			System.out.println("Please enter valid Department Name");
			D_name = sc1.next();
			check_dept(D_name);
		}
	}

	static void cse_department() 
	{
		System.out.println("Enter the Maths Mark :");
		m1 = sc1.nextInt();
		System.out.println("Enter the English Mark :");
		e1 = sc1.nextInt();
		System.out.println("Enter the Computer Network Mark :");
		cn1 = sc1.nextInt();
		total_marks(m1,e1,cn1);
	}
	static void total_marks(int m1, int e1, int cn1) 
	{
		Total = m1 + e1 + cn1;
		per = Total/3;
	}
	
	static void IT_Department() 
	{
		System.out.println("Enter the Maths Mark :");
		m1 = sc1.nextInt();
		System.out.println("Enter the English Mark :");
		e1 = sc1.nextInt();
		System.out.println("Enter the Computer Network Mark :");
		cn1 = sc1.nextInt();
		System.out.println("Enter the Java Programming Mark :");
		j2 = sc1.nextInt();
		total_marks(m1,e1,cn1,j2);
	}
	static void total_marks(int m2, int e2, int cn2, int j2) 
	{
		Total = m2 + e2 + cn2+ j2;
		per = Total/4;
	}
}


