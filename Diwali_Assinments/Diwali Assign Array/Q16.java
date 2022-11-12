package src;
import java.util.Scanner;
import java.util.Arrays;
class Q16
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
		
		
		System.out.println("Enter the Second Array Size");
		int SIZE2=sc.nextInt();
		int arr2[]=new int[SIZE2];
		System.out.println("Enter the Second Array Elements");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		int arr3[]=new int[Math.max(SIZE1,SIZE2)];
		int j1=0;
		for(int i=0;i<Math.max(SIZE1,SIZE2);i++)
		{
			for(int j=0;j<Math.min(SIZE1,SIZE2)-1;j++)
			{
				if(arr1[i] ==arr2[j])
					arr3[j1++]=arr1[i];
			}
		}
		System.out.println("Input Array 1 : "+Arrays.toString(arr1));
		System.out.println("Input Array 2 : "+Arrays.toString(arr2));
		System.out.println("Output Array of intersection : "+Arrays.toString(arr3));
	}
}