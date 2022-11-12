package src;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
class Q12
{
	static void display(LinkedList<String> list)
	{
		int i=0;
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println((i++)+".)"+itr.next());
		}
		System.out.println("---------------------------------------------------");
			
	}
	
	public static void main(String args[])
	{
		LinkedList<String> list= new LinkedList<String>();
		Scanner sc =new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add First"
								+"\n2.)Add Last\n3.)Display List\n4.)Check Particualrs Details");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 0:
					System.out.println("You chose to EXIT\nProgram Terminated");
					break;
				case 1:
					System.out.println("Enter the content to be added in list");
					String string=sc.next();
					list.addFirst(string);
					System.out.println("---------------------------------------------------");

				break;
				case 2:
					System.out.println("Enter the content to be added in list");
					string=sc.next();
					list.addLast(string);
					System.out.println("---------------------------------------------------");

				break;
				case 3:
					display(list);
				break;
				case 4:
					System.out.println("Enter the content to be checked in list");
					string=sc.next();
					System.out.println("Does list contains "+string+" = "+list.contains(string));
					System.out.println("---------------------------------------------------");
				break;
			}
		}while(choice!=0);
	}
}