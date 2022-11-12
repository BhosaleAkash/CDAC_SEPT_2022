package src;
import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		int tempLarge=0;
		int tempSmall=0;
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]>tempLarge)
				tempLarge=arr[i];
			
			if(i==0)
				tempSmall=arr[0];
			
			if(tempSmall>arr[i])
				tempSmall=arr[i];
		}
		
		System.out.println("The largest Number is = "+tempLarge);
		System.out.println("The smallest Number is = "+tempSmall);
	}
}