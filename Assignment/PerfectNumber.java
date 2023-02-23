

//25. Write a Java Program to check whether the given number is Perfect Numberor NOT. 

class PerfectNumber
{
	public static void main(String args[])
	{
		
		int n = 6;
		int temp = n;
		int sum=0;
		
		for(int i=1; i< n; i++)
		{
			if(n%i ==0)
			{
				sum = sum+i;
				
			}
		}
		
		if(temp == sum)
			System.out.print(sum + "  is a perfect number");
		
		else
			System.out.print(sum + "  is not a perfect number");
		
	}
}