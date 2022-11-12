package src;
import java.util.Scanner;
class Q9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want the series");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int res=0;
			if(i==1)
			{
				System.out.print(i);
			}
			else
			{
				if(i%2 == 0)
				{
					res=i*i;
					System.out.print(","+res);
				}
				else
				{
					res=i*i*i;
					System.out.print(","+res);
				}
			}
		}
	}
}