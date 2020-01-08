package Date_26_12_2019;

public class Path_Finding 
{
	static int row ;
	static int column;
	static int sr,sc=0;//sr-->Starting Row, sc-->Starting Column
	public static void main(String[] args)
	{
		int[][] input ={{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
						{1, 1, 0, 1, 1, 0, 1, 1, 1, 0},
						{0, 1, 0, 1, 0, 0, 1, 0, 0, 0},
						{0, 0, 1, 1, 1, 1, 1, 0, 1, 1},
						{0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
						{0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
						{1, 1, 0, 1, 0, 0, 0, 1, 1, 0},
						{0, 1, 1, 1, 1, 0, 1, 1, 0, 0},
						{0, 1, 0, 0, 1, 1, 1, 0, 0, 0},
						{0, 1, 1, 1, 0, 0, 0, 0, 0, 0}};
		row = input.length;
		column = input[0].length;
		path(input);
	}

	static void path(int[][] input) 
	{
		int[][] solution = new int[row][column];
		//Check the first row Entry value
		for(int i=0;i<row;i++)
		{
			if(input[i][0]==1)
			{
				sr = i;
				if(find(input,solution,sr,sc)==false) 
					continue;
				if(i==row-1 && find(input,solution,sr,sc)==false) 
					System.out.println("Unsolvable");
				else
					display(solution); 
			}
		}
	}
	
	static boolean find(int[][] input, int[][] solution, int r, int c) 
	{
		//Check last value
		if(c==column-1)
		{
			if(search(input,solution,r,c)==true)
			{
				solution[r][c] = 1;
		    	return true;
			}
		}
		
		if(search(input,solution,r,c)==true) 
		{
			solution[r][c] = 1;
			
			//Check Bottom 
			if(find(input,solution, r+1, c))
				return true;
			//Check Right 
			if(find(input,solution,r,c+1))
				return true;
			//Check Top
			if(find(input,solution,r-1,c))
				return true;
			//Check Left
			if(find(input,solution,r,c-1))
				return true;
			
			//Back tracking to put value(r,c)=0 
			solution[r][c] = 0;
			return false;
		}
		return false;
	}

	//Check the values 
	static boolean search(int[][] input, int[][] solution, int r, int c) 
	{
		if(r<row && c<column && r>=0 && c>=0 && input[r][c]==1 && solution[r][c]==0)
			return true;
		return false;
	}
	
	//Print the Solved Matrix
	static void display(int[][] solution) 
	{
		System.out.println("Solved Matrix :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
				System.out.print(solution[i][j]+" ");
			System.out.println();
		}
	}
	
}
   /* {{1, 0, 0, 0},
       {1, 1, 0, 1},
       {0, 1, 0, 0},
       {1, 1, 1, 1}}; */

		/* {{1, 0, 1, 1, 0},
            {1, 1, 1, 0, 1},
            {0, 1, 0, 1, 1},
            {1, 1, 1, 1, 1}}; */

	/* {{1, 0, 0, 0, 0},
	   {1, 1, 0, 1, 0},
	   {0, 1, 1, 1, 0},
	   {0, 0, 0, 1, 0},
	   {1, 1, 1, 1, 1}}; */

					/*{{0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
						{1, 1, 0, 1, 1, 0, 1, 1, 1, 0},
						{0, 1, 0, 1, 0, 0, 1, 0, 0, 0},
						{0, 1, 1, 1, 1, 1, 1, 0, 1, 1},
						{0, 1, 0, 0, 0, 0, 1, 0, 1, 0},
						{0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
						{1, 0, 0, 1, 0, 0, 0, 1, 1, 0},
						{0, 1, 1, 1, 1, 0, 1, 1, 0, 0},
						{0, 1, 0, 0, 1, 1, 1, 0, 0, 0},
						{0, 1, 1, 1, 0, 0, 0, 0, 0, 0}};*/

