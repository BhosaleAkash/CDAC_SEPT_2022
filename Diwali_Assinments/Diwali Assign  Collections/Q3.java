package src;
import java.util.ArrayList;
import java.util.Scanner;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list =new ArrayList<String>();
		list.add("RED");
		list.add("GREEN");
		list.add("YELLOW");
		list.add("BLUE");
		list.add("PURPLE");
		
		System.out.println("Enter the number which u want to retrieve");
		int num=sc.nextInt();
		
		System.out.println(list.get(num));
	}
}