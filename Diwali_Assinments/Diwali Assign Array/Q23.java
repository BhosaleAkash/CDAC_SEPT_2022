package src;
import java.util.ArrayList;
import java.util.Arrays;
class Q23
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Virat");
		list.add("Rohit");
		list.add("Surya");
		list.add("Bumrah");
		
		String arr[]=list.toArray(new String[list.size()]);
		
		for(String x : arr)
		{
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}