
//11. Write a Java Program to print all the Factors of the Given number.

class PrintFactors
{
	public static void main(String args[])
	{
		int n = 25;
		
		for (int i =1; i<=n; i++)
		{
			if(n % i ==0)
			{
				System.out.print(i+"  ");
			}
		}
	}
}