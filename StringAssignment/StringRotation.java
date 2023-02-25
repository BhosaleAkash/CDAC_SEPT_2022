
//6. Check Given String is Rotation of Another String.

class StringRotation
{
	public static void main(String args[])
	{
		String s1 = "abcd";
		String s2 = "damc";
		
		int flag = 0;
		
		if( s1.length() != s2.length())
		{
			flag = 0;
		}
		
		else
		{
			String s3 = s1+s1;
			
			if( s3.contains(s2))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
		}
		
		if(flag == 1)
			System.out.print("string "+s1+" is rotation of string "+s2);
		else
			System.out.print("string "+s1+" is not rotation of string "+s2);
	}
}