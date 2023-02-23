
//16. Write a Java Program to find GCD of two given numbers.

class GCD
{
	public static void main(String args[])
	{
		int x = 504;
		int y = 306;
		int Gcd =1;
		
		for(int i=2; i<=x && i<=y; i++)
		{
			if( x%i==0 && y%i==0)
			{
				Gcd=i;
			}	
		}
		
		System.out.print("Gcd of "+x+" & "+y+" is "+Gcd);	
	}	 
}