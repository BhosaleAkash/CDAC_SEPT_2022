
//24. Write a Java Program to print Armstrong Numbersbetween 1 to 1000.

class Armstrong1to1000
{
	public static void main(String args[])
	{
		for(int i=1; i<= 1000; i++)
		{
			
			int  n = i;
		
			int temp = n;
			int m = n;
			int digit = 0;
			
			int sum=0;
			
			while(n>0)
			{
				n = n/10;
				digit++;
			}
			
			while(m>0)
			{
				int r = m%10;
				sum = sum + (int)Math.pow(r,digit);
				m=m/10;	
				
			}
			
			if(temp == sum)
			{
				System.out.println( sum );
			}
			
			
		}
	}
}