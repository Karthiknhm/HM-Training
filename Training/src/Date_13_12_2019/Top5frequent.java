package Date_13_12_2019;
public class Top5frequent
{
	static int count = 0;
	public static void main(String[] args)
	{
		String input = "You are given a string and a word your task is that count the number of the occurrence of the given word in the string and print the number of occurrence of the word";
		String[] arr = input.split(" ");
		
		String[] str = new String[arr.length];
		int[] num = new int[arr.length];
		
		int sum = 0;
		int high = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!="*")
			{
				for(int j=i+1;j<arr.length;j++)
				{
					String con = arr[i];
					String s_value = arr[j];
					int c = check_frequent(con,s_value);
						if(c==1)
							arr[j]="*";
					sum = sum + c;
					count = 0;
				}
				int occurance = sum + 1;
				str[i] = arr[i];
				num[i] = occurance;
				
				if(high<occurance)
					high = occurance;
				sum = 0;
			}
		}
		//Find Top 5 frequent words
		int div = 0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(high==num[j])
				{
					System.out.println(str[j]+" "+num[j]);
					div++;
				}
				if(div==5)
					break;
			}
			high--;
		}
	}
	//value is how many time present in given string
	static int check_frequent(String con, String s_value) 
	{
		if(con.equalsIgnoreCase(s_value))
			count++;
	 return count;
	}
}