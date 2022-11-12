package src;
import java.util.HashSet;
import java.util.Collections;
class Q18
{
	public static void main(String args[])
	{
		HashSet<String> list1=new HashSet<String>();
		HashSet<String> list2=new HashSet<String>();
		
		list1.add("Virat");
		list1.add("Rohit");
		list1.add("Bumrah");
		list1.add("Surya");
		list1.add("Hardik");
		for(String s : list1)
			System.out.print(s+"\t");
		System.out.println();
		list2.add("Rohit");
		list2.add("Bumrah");
		list2.add("Surya");
		list1.retainAll(list2);
		
		for(String s : list2)
			System.out.print(s+"\t");
		System.out.println();
		for(String s : list1)
			System.out.print(s+"\t");
		
	}
}