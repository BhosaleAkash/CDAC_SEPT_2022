package src;
import java.util.Collections;
import java.util.ArrayList;
class Q5
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(32);
		list.add(563);
		list.add(478);
		list.add(25);
		
		
		System.out.println("List Before Reversing");
		for(int i : list)
		{
			System.out.print(i+"\t");
		}
		Collections.reverse(list);
		System.out.println();
		System.out.println("List After REversing");
		for(int i : list)
		{
			System.out.print(i+"\t");
		}
	}
}