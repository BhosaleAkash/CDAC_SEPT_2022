package src;
import java.util.Scanner;
import java.util.Arrays;
class Q14
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Array Size");
		int SIZE=sc.nextInt();
		int arr1[]=new int[SIZE];
		System.out.println("Enter the First Array Elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Second Array Size");
		SIZE=sc.nextInt();
		int arr2[]=new int[SIZE];
		System.out.println("Enter the Second Array Elements");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
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
		System.out.println("Is both arrays same using \"Arrays.equals\" = "+Arrays.equals(arr1,arr2));
	}
}