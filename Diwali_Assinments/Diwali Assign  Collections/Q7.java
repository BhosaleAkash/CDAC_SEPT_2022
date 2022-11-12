package src;
import java.util.ArrayList;
class Q7
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Virat");
		list.add("Rohit");
		list.add("DK");
		list.add("Bumrah");
		list.add("Surya");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+".)"+list.get(i));
		}
	}
}