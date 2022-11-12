package src;
import java.util.LinkedList;
class Q9
{
	public static void main(String args[])
	{
		LinkedList<String> list= new LinkedList<String>();
		list.addLast("Virat");
		list.addLast("Rohit");
		list.addLast("DK");
		list.addLast("Bumrah");
		list.addLast("Dravid");
		
		for(String x : list)
		{
			System.out.print(x+"\t");
		}
	}
}