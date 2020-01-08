package Date_13_12_2019;
import java.util.Arrays;
public class GroupAnagram 
{
	public static void main(String[] args) 
	{
		String input = "the inner loop checks whether remaining strings are anagram of the string picked by outer loop";
		String[] arr = input.split(" ");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				String con = arr[i];
				String s_value = arr[j];
				if(check_anagram(con, s_value))
					System.out.println(con+" "+s_value);
			}
		}
	}
	//Check the Anagram in given string
	static boolean check_anagram(String con, String s_value) 
	{
		boolean res = true;
		if(con.length()==s_value.length())
		{
			char[] ch1 = con.toCharArray();
			char[] ch2 = s_value.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					res = false;
					break;
				}
			}
		}
		else
			res = false;
		return res;
	}
}