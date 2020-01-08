package Date_18_12_2019;
import java.util.Scanner;
public class LargeAndSmall 
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

		String s1 ="";
		find_large(arr,s1);
		find_small(arr,s1);
	}
	//Large to small sort method
	static void find_large(int[] arr, String s1) 
	{
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			s1 = s1 + arr[i];
		System.out.println("Large to Small = "+s1);
	}
	//small to large sort method
	private static void find_small(int[] arr, String s1)
	{
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			s1 = s1 + arr[i];
		System.out.println("Small to Large = "+s1);
	}
}


