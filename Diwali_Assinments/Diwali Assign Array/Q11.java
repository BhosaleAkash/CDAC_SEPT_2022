package src;
import java.util.Scanner;
class Q11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		byte SIZE=sc.nextByte();
		byte arr[]=new byte[SIZE];
		System.out.println("Enter the Array Elements\nEnter number between 65-91 or 97-122 for better understanding ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextByte();
		}
		
		String str=new String(arr);
		System.out.println(str);
		
	}
}