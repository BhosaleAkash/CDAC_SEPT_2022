package src;
import java.util.Arrays;
class Q1
{
	public static void main(String args[])
	{
		int arr[]=new int[] {1,2,3,4,5};
		
		for(int x : arr)						//for each 
		{
			System.out.print(x);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
	}
}