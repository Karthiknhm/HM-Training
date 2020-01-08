package Date_20_12_2019;

public class Sudoku
{
	public static int[][] input = {	{9,0,0,1,0,0,0,0,5},
									{0,0,5,0,9,0,2,0,1},
									{8,0,0,0,4,0,0,0,0},
									{0,0,0,0,8,0,0,0,0},
									{0,0,0,7,0,0,0,0,0},
									{0,0,0,0,2,6,0,0,9},
									{2,0,0,3,0,0,0,0,6},
									{0,0,0,2,0,0,9,0,0},
									{0,0,1,9,0,4,5,7,0} };
							
	public static final int zero = 0; 
	public static final int n = input.length; 

	public static void main(String[] args) 
	{
		System.out.println("Input Sudoku :");
		Sudoku.print();
		
		if(Sudoku.solve())
		{
			System.out.println("Solved sudoku :");
			Sudoku.print();
		}
		else
			System.out.println("Unsolvable input");
		
	}

	public static boolean solve()
	{
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n;c++)
			{
				//Taken input is zero means go inside
				if(input[r][c]==zero)
				{
					for(int num=1;num<= n;num++)
					{
						//Check the number is present or not
						if(check_num(r,c,num))
						{
							input[r][c]=num; 
							
							if (solve()) 
				                  return true;
				            else 
				                 input[r][c] = zero;
						}
						
					}
					return false;
				}
			}
		}
		return true;
	}
	
	//check the number is present or not
	static boolean check_num(int r, int c, int num) 
	{
		//Row check
		for (int i = 0; i<n; i++)
		{
			if (input[i][c] == num)
				return false;
		}
		//Column check
		for (int i=0; i< n;i++)
		{
			if (input[r][i] ==num)
				return false;
		}
		//Box check
		int row = r - r % 3;
		int column = c - c % 3;
		for (int i=row; i<row+3;i++)
		{
			for (int j=column; j<column+3;j++)
			{
				if (input[i][j] == num)
					return false;
			}
		}
		return true;
	}

	//Print the sudoku 
	public static void print() 
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(input[i][j]+" ");
			System.out.println();
		}
	}
}


  /* Sample Inputs
           { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 0, 0, 3, 6, 0, 0, 0, 0, 0 },
	{ 0, 7, 0, 0, 9, 0, 2, 0, 0 },
	{ 0, 5, 0, 0, 0, 7, 0, 0, 0 },
	{ 0, 0, 0, 0, 4, 5, 7, 0, 0 },
	{ 0, 0, 0, 1, 0, 0, 0, 3, 0 },
	{ 0, 0, 1, 0, 0, 0, 0, 6, 8 },
	{ 0, 0, 8, 5, 0, 0, 0, 1, 0 },
	{ 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
	
	{9,0,0,1,0,0,0,0,5},
	{0,0,5,0,9,0,2,0,1},
	{8,0,0,0,4,0,0,0,0},
	{0,0,0,0,8,0,0,0,0},
	{0,0,0,7,0,0,0,0,0},
	{0,0,0,0,2,6,0,0,9},
	{2,0,0,3,0,0,0,0,6},
	{0,0,0,2,0,0,9,0,0},
	{0,0,1,9,0,4,5,7,0} 
	
	*/

