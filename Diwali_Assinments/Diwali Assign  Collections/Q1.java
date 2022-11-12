package src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Enumeration;
class Q1
{
	public static void main(String args[])
	{
		ArrayList<String> list= new ArrayList<String>();
		list.add("RED");
		list.add("GREEN");
		list.add("YELLOW");
		list.add("BLUE");
		list.add("PURPLE");
		
		for(String x : list)
			System.out.println(x);
		System.out.println("----------------------------------------------------------------");
		Iterator<String> itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------------------------");
		ListIterator<String> l2=list.listIterator();
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		System.out.println("----------------------------------------------------------------");
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}
		System.out.println("----------------------------------------------------------------");
		
		Enumeration<String> l3=Collections.enumeration(list);
		while(l3.hasMoreElements())
		{
			System.out.println(l3.nextElement());
		}
		System.out.println("----------------------------------------------------------------");
	}
}