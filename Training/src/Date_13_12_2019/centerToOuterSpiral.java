package Date_13_12_2019;
import java.util.Scanner;
public class centerToOuterSpiral 
{
		public static void main(String[] args)
		{
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the Matrix row and column :");
			int row = sc1.nextInt();
			int column = sc1.nextInt();
			sc1.close();
			int[][] center = spiral(row,column);
			out(center,row,column);
		}
		static int[][] spiral(int r, int c)
		{
			int len = r * c;
			int[][] arr = new int[r][c];
			int sr = 0;
			int sc = 0;
			
			while(len>0)
			{
				//Left to Right
				for(int i=sr;i<c;i++)
				{
					arr[sr][i] = len;
					len--;
					if(len==0)
						break;
				}
				sr++;
				//Right top to bottom
				for(int i=sr;i<r;i++)
				{
					arr[i][c-1] = len;
					len--;
					if(len==0)
						break;
				}
				c--;
				//left to right
				if(sr<r)
				{
					for(int i=c-1;i>=sc;i--)
					{
						arr[r-1][i] = len;
						len--;
						if(len==0)
							break;
					}
					r--;
				}
				//bottom to top
				if(sc<c)
				{
					for(int i=r-1;i>=sr;i--)
					{
						arr[i][sc] = len;
						len--;
						if(len==0)
							break;
					}
					sc++;
				}
			}
		 return arr;
		}
		//Print the Matrix
		static void out(int[][] center,int r,int c)
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
					System.out.print(center[i][j]+" ");
				System.out.println();
			}
		}
}