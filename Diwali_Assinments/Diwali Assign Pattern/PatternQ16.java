package src;
class PatternQ16
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=16;j++)
			{
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=15;j++)
			{
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+2;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=14;j++)
			{
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=13;j++)
			{
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+6;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=12;j++)
			{
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i+8;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=18;j++)
			{
				System.out.print("  ");
			}
			for(int j=4;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
	
