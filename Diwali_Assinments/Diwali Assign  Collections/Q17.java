package src;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Arrays;
class Q17
{
	static void display(HashSet<String> list)
	{
		int i=0;
		Iterator<String> itr = list.iterator();
		if(itr.hasNext() == false)
			System.out.println("List is Empty");
		while(itr.hasNext())
		{
			System.out.println((i++)+".)"+itr.next());
		}
		System.out.println("---------------------------------------------------");
			
	}
	public static void main(String args[])
	{
		HashSet<String> list= new HashSet<String>();
		Scanner sc =new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add"
								+"\n2.)Display List\n3.)Empty List"
								+"\n4.)Convert List into Array");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 0:
					System.out.println("You chose to EXIT\nProgram Terminated");
					break;
				case 1:
					System.out.println("Enter the content to be added in list");
					String string=sc.next();
					list.add(string);
					System.out.println("---------------------------------------------------");

				break;
				case 2:
				System.out.println("---------------------------------------------------");
				display(list);
				break;
				case 3:
					list.clear();
				break;
				case 4:
					String str[]=list.toArray(new String[list.size()]);
					System.out.println(Arrays.toString(str));
				break;
			}
		}while(choice!=0);
		
	}
}




/*
package src;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Arrays;
class Q17
{
	static void display(HashSet<Integer> list)
	{
		int i=0;
		Iterator<Integer> itr = list.iterator();
		if(itr.hasNext() == false)
			System.out.println("List is Empty");
		while(itr.hasNext())
		{
			System.out.println((i++)+".)"+itr.next());
		}
		System.out.println("---------------------------------------------------");
			
	}
	public static void main(String args[])
	{
		HashSet<Integer> list= new HashSet<Integer>();
		Scanner sc =new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add"
								+"\n2.)Display List\n3.)Empty List"
								+"\n4.)Convert List into Array");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 0:
					System.out.println("You chose to EXIT\nProgram Terminated");
					break;
				case 1:
					System.out.println("Enter the content to be added in list");
					int string=sc.nextInt();
					list.add(string);
					System.out.println("---------------------------------------------------");

				break;
				case 2:
				System.out.println("---------------------------------------------------");
				display(list);
				break;
				case 3:
					list.clear();
				break;
				case 4:
					Integer str[]=list.toArray(new Integer[list.size()]);
					System.out.println(Arrays.toString(str));
				break;
			}
		}while(choice!=0);
		
	}
}
*/