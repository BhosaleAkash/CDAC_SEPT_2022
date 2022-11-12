package src;
class PatternQ11
{
	public static void main(String args[])
	{
		for(int i=70;i>=65;i--)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)(j)+" ");
			}
			System.out.println();
		}
		for(int i=65;i<=70;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)(j)+" ");
			}
			System.out.println();
		}
	}
}