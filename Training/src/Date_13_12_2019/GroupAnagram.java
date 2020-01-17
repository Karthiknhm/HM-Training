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
				String first_word = arr[i];
				String second_word = arr[j];
				
				//The two words is anagram means print the two words 
				if(check_anagram(first_word, second_word))
					System.out.println(first_word+" "+second_word);
			}
		}
	}
	
	//Check the two words anagram or not 
	//Anagram means return true or else false
	static boolean check_anagram(String first_word, String second_word) 
	{
		boolean res = true;
		
		//check two words length is equal or not 
		if(first_word.length()==second_word.length())
		{
			char[] ch1 = first_word.toCharArray();
			char[] ch2 = second_word.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			
			for(int i=0;i<ch1.length;i++)
			{
				//check anagram 
				//Not anagram means it will break
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