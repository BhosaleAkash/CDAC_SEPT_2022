package src;
class PatternQ1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==5)
					System.out.print("**");
				else
				{
					if(j==1 || j==i)
						System.out.print("*");
					else
						System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}