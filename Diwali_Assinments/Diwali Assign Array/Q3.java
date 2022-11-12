package src;
import java.util.Scanner;
import java.util.Arrays;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is = "+Arrays.toString(arr));
		
		System.out.println("Enter the value");
		int value=sc.nextInt();
		
		int sum=0;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=i+1;j<arr.length-1;j++)
			{
				sum=arr[i]+arr[j];
				if(sum==value)
				{
					System.out.println("Sum of "+arr[i]+" at index "+i+
					" and "+arr[j]+" at index "+j+" is equal to "+value);
					break;
				}
			}
		}
		
	}
}