package src;
class PatternQ23
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			int x,y=0;
			if(i%2!=0)
			{
				x=1;
				y=0;
			}
			else
			{
				x=0;
				y=1;
			}
			for(int j=1;j<=7;j++ )
			{
				if(j%2!=0)
					System.out.print(x+" ");
				else
					System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}