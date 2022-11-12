package src;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
class Q15
{
	static void display(HashSet<String> list)
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
		HashSet<String> list= new HashSet<String>();
		Scanner sc =new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add"
								+"\n2.)Display List");
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