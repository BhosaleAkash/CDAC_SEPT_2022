package src;
import java.util.Scanner;
import java.util.Arrays;
class Q12
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
		
		System.out.println("Enter the element from where u want to rotate it");
		int k=sc.nextInt();
		
		int temp[]=new int[SIZE];
		int i=0;
		for(int j=k;j<arr.length;j++)
		{
			temp[i++]=arr[j];
		}
		for(int j=k-1;j>=0;j--)
		{
			temp[i++]=arr[j];
		}
		
		System.out.println("Input : "+Arrays.toString(arr));
		System.out.println("Ouput : "+Arrays.toString(temp));
		
	}
}