package src;
import java.util.LinkedList;
class Q8
{
	public static void main(String args[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.addLast("Virat");
		list.addLast("Rohit");
		list.addLast("Bumrah");
		list.addLast("DK");
		
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(90);
		list1.addFirst(1);
		list1.addLast(10);
		list1.addLast(20);
		list1.addLast(330);
		list1.addLast(40);
		
		for(String x : list)
		{
			System.out.print(x+"\t");
		}
		System.out.println();
		for(int x : list1)
		{
			System.out.print(x+"\t");
		}
	
	}
}