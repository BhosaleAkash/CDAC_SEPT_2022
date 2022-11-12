package src;
import java.util.Scanner;
import java.util.Arrays;
class Q18
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
		int j;
		System.out.print("Repeated Elements are : ");
		for(int i=0;i<arr1.length-1;i++)
		{
			for(j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.print(arr1[i]+",");
				}
			}
		}
		
	}
}