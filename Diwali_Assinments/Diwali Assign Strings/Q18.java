package src;
import java.util.Scanner;
import java.util.Arrays;
class Q18
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String str1=sc.nextLine();
		char ch1[]=new char[str1.length()];
		
		
		System.out.println("Enter the String 2");
		String str2=sc.nextLine();
		char ch2[]=new char[str2.length()];
		
		System.out.println("Enter the  combination of String");
		String str3=sc.nextLine();
		char ch3[]=new char[str3.length()];
		ch3=str3.toCharArray();
		
		char ch4[]=new char[str2.length() + str1.length ()];
		int index=0;
		
		
		if(str3.length() == (str2.length()+str1.length()))
		{
			for(int i=0;i<str1.length();i++)
			{
				ch4[index++]=str1.charAt(i);
			}
			
			for(int i=0;i<str2.length();i++)
			{
				ch4[index++]=str2.charAt(i);
			}
			
			Arrays.sort(ch3);
			Arrays.sort(ch4);
			
			int flag=0;
			for(int i=0;i<str3.length();i++)
			{
				if(ch3[i]!=ch4[i])
				{
					flag++;
					break;
				}
			}
			if(flag==0)
				System.out.println("Valid Shuffle");
			else
				System.out.println("Not a valid Shuffle");
		}
		else
		{
			System.out.println("Not a valid Shuffle");
		}
		
		
		
	}
}
		