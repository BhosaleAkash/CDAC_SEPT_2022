package src;
import java.util.*;
class Q24
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Array Size");
		int SIZE1=sc.nextInt();
		int arr1[]=new int[SIZE1];
		System.out.println("Enter the First Array Elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>secondLargest)
			{
				if(arr1[i]>largest)
				{
					secondLargest=largest;
					largest=arr1[i];
				}
				else
				{
					secondLargest=arr1[i];
				}
			}
		}
		System.out.println("Second Largest Number is : "+secondLargest);
		
	}
}