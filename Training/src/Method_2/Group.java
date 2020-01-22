package Method_2;
import java.util.Arrays;
public class Group 
{
	public static void main(String[] args) 
	{
		String input ="red erd cat act like tac";
		String[] arr = input.split(" ");
		int count = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				String first_word = arr[i];
				String second_word = arr[j];
				
				if("*"!=arr[i])
				{
					//The two words is anagram means print the two words 
					if(check_anagram(first_word, second_word))
					{	
						if(count==0)
						{
							System.out.print(first_word);
							count++;
						}
						System.out.print(" "+second_word);
						arr[j] = "*";
					}
				}
			}
				System.out.println();
				count = 0;
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
