package Date_02_01_2020;

public class Selection_sort 
{
	public static void main(String args[]) 
	{ 
		int arr[] = {64,25,12,22,11}; 
		sort(arr); 
		System.out.println("Sorted array"); 
		printArray(arr); 
	} 
		static void sort(int arr[]) 
		{ 
			int pos = 0 ;
			int n = arr.length;
			
			for (int i=0;i<n-1;i++) 
			{ 
				int min = arr[i]; 
				for (int j = i+1; j < n; j++)
				{
					if (min > arr[j]) 
					{
						min = arr[j]; 
						pos = j;
					}
				}
				int temp = arr[pos]; 
				arr[pos] = arr[i]; 
				arr[i] = temp; 
			} 
		} 
		
		static void printArray(int arr[]) 
		{ 
			int n = arr.length; 
			for (int i=0; i<n; ++i) 
				System.out.print(arr[i]+" "); 
		} 
}
