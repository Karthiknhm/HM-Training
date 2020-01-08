package Date_30_12_2019;

public class N_Queen_Placing 
{
	static int n = 8;
	static int[][] board = new int[n][n];
	
	public static void main(String args[]) 
	{ 
		solve(); 
	} 
	
	static void solve() 
	{
		if(check(0)==false)
			System.out.println("Unsolvable");
		else
			display();
	}
	
	static boolean check(int row)
	{
		if (row >= n) 
            return true;
		
		for(int c=0;c<n;c++)
		{
				if(check(row,c))
				{
					board[row][c] = 1;
					
					if(check(row+1))
						return true;
					else
						board[row][c] = 0;
				}
		}
		return false;
	}

	static boolean check(int r, int c)
	{
		//Row check
		for (int i = 0; i<n; i++)
		{
			if (board[i][c] != 0)
				return false;
		}
		//Column check
		for (int i=0; i<n;i++)
		{
			if (board[r][i] != 0) 
				return false;
		}
		//Left upper diagonal
		for (int i=r, j=c; i>=0 && j>= 0; i--,j--) 
		{
            if (board[i][j] != 0) 
                return false; 
		}
		//Right upper diagonal
        for (int i=r, j=c; i>=0 && j<n; i--,j++) 
        {
            if (board[i][j] != 0) 
                return false; 
        }
		return true;
	}
	
	//Print Queen placing
	static void display()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(board[i][j]+" ");
			System.out.println();
		}
	}
} 


