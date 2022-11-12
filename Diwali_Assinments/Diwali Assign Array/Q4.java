package src;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Q4
{
	public static void main(String args[])
	{
		//Using  temp variable
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[SIZE];
		for(int j=0,i=arr.length-1;i>-1 && j<arr1.length;i--,j++)
		{
			arr1[j]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		//Using Collections
		System.out.println("Using Arrays Collection");
		Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
		
	}
}