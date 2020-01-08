package Date_12_12_2019;
public class power
{
	public static void main(String[] args) 
	{
		String s1 = "3456";
		double result = 0;
		
		for(int i=0;i<s1.length()-1;i++)
		{
			int n1 = s1.charAt(i) - 48;
			int n2 = s1.charAt(i+1) - 48;
			double d1 = Math.pow(n1, n2);
			result = result + d1;
		}
		
		int l1 = s1.charAt(s1.length()-1) - 48;
		int l2 = s1.charAt(0) - 48;
		double d1 = Math.pow(l1, l2);
		result = result + d1;
		
		System.out.println(result);
	}
}