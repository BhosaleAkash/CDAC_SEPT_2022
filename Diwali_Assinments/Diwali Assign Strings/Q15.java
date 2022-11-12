package src;
import java.util.Scanner;
import java.util.Arrays;
class Q15
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int index=0;
		int j=0;
		char str1[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					break;
				}
			}
			if(i==j)
			{
				str1[index++]=str.charAt(i);
			}
		}
		for(char x : str1)
		{
			if(x != 32)
				System.out.print(x);
				
			
		}
	}
}