package Date_12_12_2019;
public class RunLengthEncode 
{
	public static void main(String[] args) 
	{
		String s1 = "a2b10cf4"; 
		String s2 = "";
		int count = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			// check the value is not in the range of 'a - z' means count the value
			if(!(s1.charAt(i)>=97 && s1.charAt(i)<=122))
			{
				int n = s1.charAt(i) - 48;
				count = count*10 + n;
				if(count==0)
					s2 = "";
			}
			else
			{
				for(int j=1;j<=count;j++)
				{
					System.out.print(s2);
					if(count==j)
						s2 = "";
				}
				s2 = s2 + s1.charAt(i);
				count = 0;
			}
		}
		//last stored value print here
		for(int j=1;j<=count;j++)
			System.out.print(s2);
	}
}