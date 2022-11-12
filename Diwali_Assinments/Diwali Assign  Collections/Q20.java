package src;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;
class Q20
{
	
	static void display(TreeSet<Integer> list)
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
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> list=new TreeSet<Integer>();
		int choice;
		
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add"
								+"\n2.)Display List\n3.)Find less than given number");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 0:
					System.out.println("You chose to EXIT\nProgram Terminated");
					break;
				case 1:
					System.out.println("Enter the content to be added in list");
					int num=sc.nextInt();
					list.add(num);
					System.out.println("---------------------------------------------------");
				break;
				case 2:
					System.out.println("---------------------------------------------------");
					display(list);
				break;
				case 3:
					System.out.println("Enter the number to find  in list");
					num=sc.nextInt();
					SortedSet<Integer> s=list.headSet(num);
					for(int x : s)
						System.out.print(x+"\t");
					System.out.println("\n---------------------------------------------------");

				break;
			}
		
		}while(choice!=0);
	}
}
