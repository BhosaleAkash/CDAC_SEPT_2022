package src;
import java.util.Scanner;
import java.util.Arrays;
class Q8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int SIZE=sc.nextInt();
		
		int arr[]=new int[SIZE];
		int arr2[]=new int[SIZE-2];
		System.out.println("Enter the array elements");
		for(int i=0,k=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(i>=2)
			{
				arr2[k]=((arr[i]+arr[i-1]+arr[i-2])/3);
				k++;
			}	
		}
		
		System.out.println("Input : "+Arrays.toString(arr));
		System.out.println("Output : "+Arrays.toString(arr2));
	}
}