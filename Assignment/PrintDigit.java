
//10. Write a Java Program to print the digits of a Given Number. 

class PrintDigit
{
	public static void main(String args[])
	{
		int n = 45632;
		int count =0;
		
		while(n>0)
		{
			n= n/10;
			count++;
		}
		
		System.out.print("digits of the given number = "+count);
	}
}