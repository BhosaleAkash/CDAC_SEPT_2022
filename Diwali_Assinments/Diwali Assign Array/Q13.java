package src;
import java.util.Scanner;
import java.util.Arrays;
class Q13
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
		System.out.println("Input : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				temp=0;
			}
		}
		System.out.println("Ouput : "+Arrays.toString(arr));
		
		//Comment either method to get desired output;
		
		//Using Sort from Arrays Class
		Arrays.sort(arr);
		System.out.println("Using Sorting From Arrays Class"+Arrays.toString(arr));
	}
}