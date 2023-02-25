
//1. Write a java program to check Given String is Palindrome or NOT. 

class StringPalindrom
{
	public static void main(String args[])
	{
		String y = "acbma";
		String z = "";
		
		for(int i=y.length()-1; i>=0; i--)
		{
			z = z + y.charAt(i);
		}
		
		if(y.equals(z))
		{
			System.out.print(y+ " is a palindrom");
		}
		else
		{
			System.out.print(y+ " is not a palindrom");
		}	
	}
}