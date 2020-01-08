package Date_16_12_2019;
import java.util.Scanner;
public class subArray
{
	public static void main(String[] args)
	{
		int[] arr = {4,5,8,9,23,6,8,2,1};
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the sum value :");
		int input = sc1.nextInt();
		sc1.close();
		checkArray(input,arr);
	}
	//Given array to check the sum of value is continuously present or not
	static void checkArray(int input,int[] arr)
	{
		int sum = 0;
		int[] arr1 = new int[arr.length];
		int pos = 0;
		
		for(int i=0;i<arr.length-1;i++)
		{
				sum = sum + arr[i];
				if(input==sum)
				{
					arr1[pos] = arr[i];	pos++;
					for(int l=0;l<pos;l++)
						System.out.print(arr1[l]+",");
					break;
				}
				sum = sum +  arr[i+1];
				if(input==sum)
				{
					arr1[pos] = arr[i]; pos++;
					arr1[pos] = arr[i+1]; pos++;
					for(int l=0;l<pos;l++)
						System.out.print(arr1[l]+",");
					break;
				}
				if(sum<input)
				{
					for(int j=i+2;j<arr.length;j++)
					{
						sum = sum + arr[j];
						if(input==sum)
						{
							arr1[pos] = arr[i];pos++;
							arr1[pos] = arr[i+1];pos++;
							for(int k=i+2;k<=j;k++)
							{
								arr1[pos] = arr[k];
								pos++;
							}
							for(int l=0;l<pos;l++)
								System.out.print(arr1[l]+",");
						}
						if(sum>input)
						{
							break;
						}
					}
				}
			sum = 0;
		}
	}
}

