package src;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Q6
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Virat");
		list.add("Rohit");
		list.add("DK");
		list.add("Bumrah");
		list.add("Surya");
		
		
		System.out.println("List Before Swapping");
		for(String i : list)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which u want to swap");
		int num=sc.nextInt();
		System.out.println("Enter the number where u want to swap");
		int num1=sc.nextInt();
		
		Collections.swap(list,num,num1);
		
		System.out.println("List After Swapping");
		for(String i : list)
		{
			System.out.print(i+"\t");
		}
	}
}