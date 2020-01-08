package Date_27_12_2019;

public class Search_string 
{
	public static void main(String[] args) 
	{
		String s1 = "I am john. I have been working for this company for the past 4 yrs.";
		String s2 = "am john";
		int count = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				//comparing to string value
				if(s1.charAt(i)==s2.charAt(j))
				{
					i++;
					//2nd string last value means increment the count value
					if(j==s2.length()-1)
						count++;
				}
				//comparing to string value is not equal break the for loop
				else
					break;
			}
			//count 1 means break the for loop
			if(count==1)
				break;
		}
		//count 1 means the value is present
		if(count==1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
