
//3. Find the Factorialof a number using Recursion. 

class FactorialRecursion
{
	
	static int fact(int n)
		{
			if(n==0)
			{
				return 1;
			}
			else
			{
				return (n * fact(n-1));
			}
		}
		
	public static void main(String args[])
	{
		int n =6;
	
		int f = fact(n);
		
		System.out.print("Factorial of "+ n +" = "+f);
		
	}
}