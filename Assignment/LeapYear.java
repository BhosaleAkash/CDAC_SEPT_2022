
//8. Write a Java Program to find whether given number is Leap year or NOT? 

class LeapYear
{
	public static void main(String args[])
	{
		int y =2016;
		int flag = 0;
		
		if(y % 4== 0)
		{
			
			if(y%100 == 0)
			{
				if(y%400 ==0)
				{
					flag = 1;
				}
				else 
					flag =0;
			}
			else
			{
				flag = 1;
			}
		
		}
		else
		{
			flag = 0;
		}
		
		if(flag == 1)
		{
			System.out.print(y+"  is a leap year");
		}
		else
		{
			System.out.print(y+"  is not a leap year");
		}
	}
}