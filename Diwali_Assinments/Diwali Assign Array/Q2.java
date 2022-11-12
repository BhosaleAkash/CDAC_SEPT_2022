package src;
import java.util.Arrays;
class Q2
{
	public static void main(String args[])
	{
		
		//using conventional method
		int arr1[]=new int[] {1,2,3,4,5};
		int arr2[]=new int[] {1,2,3,4,5};
		
		int flag=0;
		
		if(arr1.length != arr2.length)
		{
			System.out.println("Array Length is not same");
		}
		else
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i] != arr2[i])
				{
					flag++;
					break;
				}
			}
			if(flag!=0)
				System.out.println("Array is not same");
			else
				System.out.println("Array is same");
		}
		
		//using pre defined functions
		System.out.println("Is both arrays same = "+Arrays.equals(arr1,arr2));
		
	}
}