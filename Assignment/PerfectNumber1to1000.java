
//26. Write a Java Program to print Perfect Numbersbetween 1 to 1000.

class PerfectNumber1to1000
{
	public static void main(String args[])
	{
		for(int j=1; j<=1000; j++)
		{
			int n = j;
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
				System.out.println(sum + "  is a perfect number");
			
		}
	}
}