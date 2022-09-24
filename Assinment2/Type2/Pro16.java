class Pro16{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int s=i; s<=4; s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==1||i==5||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
}