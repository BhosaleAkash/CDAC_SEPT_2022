
//19. Check whether the Given Numberis a Palindrome or NOT. 

class Palindrom
{
	public static void main(String args[])
	{
		int n = 454;
		int k;
		int sum=0;
		
		int temp = n;
		while(n>0)
		{
			k = n%10;
			
			sum = (sum*10) +k;
			
			n = n/10;
		}
		
		if(sum == temp)
			System.out.print("Number is palinderom ");
		else
			System.out.print("Number is not palindrom");
	}
}