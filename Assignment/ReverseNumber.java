
//15. Write a java program to Reverse a given number.

class ReverseNumber
{
	public static void main(String args[])
	{
		int n =1235;
		int k;
		int sum=0;
		
		while(n>0)
		{
			k = n%10;
			
			sum = (sum*10) + k;
			
			n = n/10;	
		}
		
		System.out.print(sum);
	}
}