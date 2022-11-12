package src;
import java.util.Scanner;
class Q19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of all Elements is : "+sum);
	}
}