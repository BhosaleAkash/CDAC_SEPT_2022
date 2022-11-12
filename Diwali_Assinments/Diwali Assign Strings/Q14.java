package src;
import java.util.Scanner;
class Q14
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		char ch[]=new char[str.length()];
		int j=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch[j++]=str.charAt(i);
		}
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(ch[i]);
		}
		
		
		
		
		
	}
}