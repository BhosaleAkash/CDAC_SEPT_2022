package src;
import java.util.ArrayList;
import java.util.Collections;
class Q4
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(32);
		list.add(563);
		list.add(478);
		list.add(25);
		
		
		System.out.println("List Before Sorting");
		for(int i : list)
		{
			System.out.print(i+"\t");
		}
		
		
		Collections.sort(list);
		
		System.out.println("List After Sorting");
		for(int i : list)
		{
			System.out.print(i+"\t");
		}
	}
}