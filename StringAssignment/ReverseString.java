
//3. Write a java program to Reverse a String without using in-build function. 

class ReverseString
{
	public static void main(String args[])
	{
		String name ="Mumbai";
		
		for(int i= name.length()-1; i>=0; i--)
		{
			System.out.print(name.charAt(i));
		}
	}
}