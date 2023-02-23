

//23. Write a Java Program to check whether the given number is Armstrong Numberor NOT. 

class ArmstrongNumber
{
	public static void main(String args[])
	{
		int  n = 153;
		
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
			System.out.print( sum + " is Armstrong Number");
		}
		else
		{
			System.out.print( sum + " is not a Armstrong Number");
		}	
	}
}