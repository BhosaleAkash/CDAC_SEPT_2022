package src;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collection;
class Q21
{
	static void display(PriorityQueue<String> list)
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
		Scanner sc=new Scanner(System.in);
		
		PriorityQueue<String> list=new PriorityQueue<String>();
		
		int choice;
		
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add"
								+"\n2.)Display List\n3.)Remove All");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 0:
					System.out.println("You chose to EXIT\nProgram Terminated");
				break;
				case 1:
					System.out.println("Enter the content to be added in list");
					String num=sc.next();
					list.add(num);
					System.out.println("---------------------------------------------------");
				break;
				case 2:
					System.out.println("---------------------------------------------------");
					display(list);
				break;
				case 3:
					System.out.println("List Removed");
					list.clear();
				break;
			}
		}while(choice!=0);
	}
}