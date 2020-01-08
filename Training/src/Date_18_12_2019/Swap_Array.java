package Date_18_12_2019;
import java.util.Arrays;
import java.util.Scanner;
public class Swap_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Array length :");
		int len = sc1.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array["+i+"] value :");
			arr[i] = sc1.nextInt();
		}
		sc1.close();
		System.out.println("Before Swap "+Arrays.toString(arr));
		swap_odd_and_even_position(arr);
	}
	//Swap the number 
	static void swap_odd_and_even_position(int[] arr)
	{
		for(int i=0;i<arr.length;i=i+2)
		{
			if(i!=arr.length-1)
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println("After Swap "+Arrays.toString(arr));
	}
}

