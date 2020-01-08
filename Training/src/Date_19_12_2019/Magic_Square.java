
package Date_19_12_2019;
import java.util.Scanner;
public class Magic_Square 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the nxn Matrix value :");
		int n = sc1.nextInt();
		sc1.close();
		int[][] arr = new int[n][n];
		int n1 = n/2;
		if(n%2!=0)
			solve_matrix(n,arr);
		else if(n1%2!=0)
			solve_matrixevenodd(n,arr,n1);
		else
			solve_matrixeven(n,arr);
	}
	
	// odd number matrix
	static void solve_matrix(int n,int[][] arr) 
	{
		int row = n/2;
		int column = n-1;
		
		for(int i=1;i<=n*n;i++)
		{
			if(row==-1 && column==n)
			{
				row = 0;
				column = n-2;
			}
			else
			{
				if(row==-1)
					row = n-1;
				if(column==n)
					column = 0;
			}
			
			if(arr[row][column]!=0)
			{
				row++;
				column = column - 2;
				arr[row][column] = i;
				row--;
				column++;
			}
			else
			{
				arr[row][column] = i;
				row--;
				column++;
			}
		}
		print(arr);
	}
	
	static void solve_matrixeven(int n,int[][] arr)
	{
		int num = n*n, start = 1, s2 = n/2, s1 = s2-1, count = 0;
		
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					if(i==j||i+j==n-1){	
						arr[i][j] = num--;
						start++;
					}
					//nth value is above 4 means it will work
					else if(n>=5){
						if(count<n)	{
							if(s1==j){
								arr[i][j] = num--;
								start++;
								count++;
							}
							else if(s2==j){
								arr[i][j] = num--;
								start++;
								count++;
							}
							else{
								arr[i][j] = start++;
								num--;
							}
						}
						//count value is equal to nth the value means it will work
						else if(count==n){
							s1 = 0;
							s2 = n-1;
							if(s1==j){
								arr[i][j] = num--;
								start++;
								count++;
							}
						}
						//count value is greater than nth the value means it will work
						else if(count>n){
							if(s1==j){
								arr[i][j] = num--;	start++;  count++;
							}
							else if(s2==j){
								arr[i][j] = num--;	start++;   count++;
							}
							else{
								arr[i][j] = start++;  num--;
							}
						}
						else {
							arr[i][j] = start++;	num--;
						}
					}
					else {
						arr[i][j] = start++;  num--;
					}
				}
				if(count<n) {
					s1--;	s2++;
				}
				else {
					s1++;  s2--;
				}
			}
		print(arr);
	}
	
	static void solve_matrixevenodd(int n, int[][] arr,int n1) 
	{
		//Top Left side
		n = n1;
		int row = n-n;
		int column = n/2;
		int i;
		
		for (i=1;i<=n*n;i++)
		{
			if(row==-1 && column==n)
			{
				row = n/n;
				column = n-1;
			}
			else
			{
				if(row==-1)
					row = n-1;
				if(column==n)
					column = 0;
			}
			
			if(arr[row][column]!=0)
			{
				row = row+2;
				column = column-1;
				
				arr[row][column] = i;
				row--;
				column++;
			}
			else
			{
				arr[row][column] = i;
				row--;
				column++;
			}
		}

		//Bottom Right side
		n= (i*2)-2;
		row = n/6;
		column = (n/6)+1;
		
		for( i=(n/2)+1;i<=n;i++)
		{
			if(row==2 && column==6)
			{
				row = 4;
				column = 5;
			}
			else
			{
				if(row==2)
					row = 5;
				if(column==6)
					column = 3;
			}
			
			if(arr[row][column]!=0)
			{
				row = 5;
				column = 3;
				
				arr[row][column] = i;
				row--;
				column++;
			}
			else
			{
				arr[row][column] = i;
				row--;
				column++;
			}
		}
		//Top Right side
		n= (n1*n1-1)+i;
		
		row = n-n;
		column = (n/9)+1;
		
		for( i=(n/3)*2+1;i<=n;i++)
		{
			if(row==-1 && column==6)
			{
				row = 1;
				column = 5;
			}
			else
			{
				if(row==-1)
					row = 2;
				if(column==6)
					column = 3;
			}
			
			if(arr[row][column]!=0)
			{
				row = 2;
				column = 3;
				
				arr[row][column] = i;
				row--;
				column++;
			}
			else
			{
				arr[row][column] = i;
				row--;
				column++;
			}
		}
		
		//Bottom Left side
		n= (n1*n1-1)+i;
		
		row = n/12;
		column = (n/12)-2;
		
		for( i=(n/3)*2+1;i<=n;i++)
		{
			if(row==2 && column==3)
			{
				row = 4;
				column = 2;
			}
			else
			{
				if(row==2)
					row = 5;
				if(column==3)
					column = 0;
			}
			
			if(arr[row][column]!=0)
			{
				row = 5;
				column = 0;
				
				arr[row][column] = i;
				row--;
				column++;
			}
			else
			{
				arr[row][column] = i;
				row--;
				column++;
			}
		}
		
			
		print(arr);
	}
	
	//Print the magic Square matrix
	static void print(int[][] arr)
	{
		for(int p=0;p<arr.length;p++)
		{
			for(int q=0;q<arr.length;q++)
			{
				System.out.print(arr[p][q]+"  ");
			}
			System.out.println();
		}
	}
	
}

