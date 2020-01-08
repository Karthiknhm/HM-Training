package Date_11_12_2019;
public class Water_tank 
{
	public static void main(String args[])
    {
        int[] input = {7,4,0,3,2,9,8,3,2,1,0,7};    
        int length = input.length;
        System.out.println(wall(input,length));
    }
    public static int wall(int[] arr,int length)
    {
        int water = 0;
        int start = arr[0];
        int len = length - 1;
        int end = arr[len];
        int max_index = 0; 
        int rev = 0;
        
        //compare 2 values array value is less means subtract 2 values and add into water value
        for(int i=1;i<=len;i++)
        {
            if(start<=arr[i])
            {
                start = arr[i];
                max_index = i;
                rev = 0;
            }
            else
            {
                water = water + start - arr[i];
                rev = rev + start - arr[i];
            }
        }
        if(max_index<len)
        {
            water = water - rev;
            //From Last index to max_index compare 2 values array value is less means subtract 2 values And add into water value
            for(int i=len;i>=max_index;i--)
            {
                if(end<=arr[i])
                    end = arr[i]; 
                else
                    water = water + end - arr[i];
            }
        }
        return water;
    }
}
