
//7. Write a Java Program to check two strings are Anagramto each other or NOT. 

// Anagramas means lenght of two string must be same.
// Two string contains the same charcters

import java.util.*;
class AnagramtoString
{
	public static void main(String args[])
	{
		String s1 = "dbca";
		String s2 = "cdab";
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		int flag = 0;
		
		if(s1.length() != s2.length())
		{
			flag =0;
		}
		else
		{
			for(int i=0; i< ch1.length; i++)
			{
				
				if(ch1[i] != ch2[i])
				{
					flag = 0;	
				}
				else
				{
					flag = 1;
					
				}
				
			}
		}
		
		if(flag == 1)
			System.out.print("string "+s1+" is Anagramto of string "+s2);
		else
			System.out.print("string "+s1+" is not Anagramto of string "+s2);
	}
}