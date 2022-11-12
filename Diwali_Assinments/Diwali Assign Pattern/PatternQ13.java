package src;
class PatternQ13
{
	public static void main(String args[])
	{
		for(char i=65;i<=70;i++)
		{
			for(char j=70;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char j=65;j<=i;j++)
			{
				if(j==65 || j==i)
					System.out.print(i);
				else
					System.out.print("  ");
					
			}
			System.out.println();
		}
		for(char i=70;i>=65;i--)
		{
			for(char j=70;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char j=i;j>=65;j--)
			{
				if(j==65 || j==i)
					System.out.print(i);
				else
					System.out.print("  ");
					
			}
			System.out.println();
		}
	}
}