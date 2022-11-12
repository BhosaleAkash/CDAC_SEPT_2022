package src;
import java.util.Scanner;
class Q1
{
	static void dupChar(String str)
	{
		for(int i=0;i<256;i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				
				if(str.charAt(j) == i)
					count++;
			}
			if(count>1)
				System.out.println((char)(i)+" Character has been repeated ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the String");
		String str=sc.next();
		dupChar(str);
			
	}
}