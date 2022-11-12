package src;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
class Q24
{
	static void display(HashMap<Integer,String> list)
	{
		Set<Map.Entry<Integer,String>> itr = list.entrySet();
		for(Map.Entry<Integer,String> x : itr)
			System.out.println(x);
		System.out.println("---------------------------------------------------");
			
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		HashMap<Integer,String> list=new HashMap<Integer, String>();
		
		int choice;
		
		do
		{
			System.out.println("Enter your choice\n0.)Exit\n1.)Add"
								+"\n2.)Display List\n3.)Remove All"
								+"\n4.)Check if empty");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 0:
					System.out.println("You chose to EXIT\nProgram Terminated");
				break;
				case 1:
					System.out.println("Enter the key");
					int num=sc.nextInt();
					System.out.println("Enter the Value");
					String str=sc.next();
					list.put(num,str);
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
				case 4:
					System.out.println("Is HashMap Empty"+list.isEmpty());
					System.out.println("---------------------------------------------------");

				break;
			}
		}while(choice!=0);
	}
}
