package src;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
class Q19
{
	
	static void display(TreeSet<String> list)
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
		TreeSet<String> list=new TreeSet<String>();
		int choice;
		
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add\n2.)Display List");
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
			}
		
		}while(choice!=0);
	}
}
