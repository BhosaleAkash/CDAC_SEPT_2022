package src;
import java.util.Scanner;
import java.util.Arrays;
class Q20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Array Size");
		int SIZE1=sc.nextInt();
		int arr1[]=new int[SIZE1];
		int temp[]=new int[SIZE1];
		int j=0;
		System.out.println("Enter the First Array Elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
			if(arr1[i]!=0)
			{
				temp[j++]=arr1[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(temp));
		
	}
	
}