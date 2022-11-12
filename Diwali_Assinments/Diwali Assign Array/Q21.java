package src;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Q21
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Array Size");
		int SIZE1=sc.nextInt();
		int arr1[]=new int[SIZE1];
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter the First Array Elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		for(int x : arr1)
			list.add(x);
		
		
		System.out.println(Arrays.toString(arr1));
		
		for(int x : list)
			System.out.println(x);
		
		
		
		//OR;
		
		//Using asList function
		 
		
		
		
	}
	
}