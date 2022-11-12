package src;
import java.util.ArrayList;
class Q2
{
	public static void main(String args[])
	{
		ArrayList<String> l =new ArrayList<String>();
		l.add("Virat");
		l.add("Rohit");
		l.add("Surya");
		
		System.out.println("List before adding at index");
		for(String x : l)
			System.out.println(x);
		
		l.add(1,"Bumrah");
		System.out.println("List after adding at index 1");
		for(String x : l)
			System.out.println(x);
		
	}
}