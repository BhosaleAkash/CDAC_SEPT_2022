package src;
import java.util.Scanner;
import java.util.Arrays;
class Q7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of your first array");
		int SIZE1=sc.nextInt();
		int arr1[]=new int[SIZE1];
		
		System.out.println("Enter the Size of your second array");
		int SIZE2=sc.nextInt();
		int arr2[]=new int[SIZE2];
		
		int arr3[]=new int[SIZE1+SIZE2];
		int k=0;
		
		System.out.println("Enter the Element of your first array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
			arr3[k++]=arr1[i];
		}
		
		System.out.println("Enter the Element of your second array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
			arr3[k++]=arr2[i];
		}
		
		System.out.println("Array 1 is : "+Arrays.toString(arr1));
		System.out.println("Array 2 is : "+Arrays.toString(arr2));
		System.out.println("Array 3 is : "+Arrays.toString(arr3));
	}
}