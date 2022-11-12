package src;
class PatternQ18
{
	public static void main(String args[])
	{
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}