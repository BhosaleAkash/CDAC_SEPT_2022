
//12. Write a Java Program to find sum of the digits of a given number.

class SumOfDigits
{
	public static void main(String args[])
	{
		int n =12563;
		int k;
		int sum =0;
		
		while(n>0)
		{
			k = n%10;
			sum = sum+k;
			n =n/10;	
		}
		
		System.out.print("sum of digits = "+ sum);
	}
}