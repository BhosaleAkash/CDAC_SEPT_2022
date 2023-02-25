
//2. How to Swap two Strings without using third (temporary) variable? 

class SwapStringWithout3v
{
	public static void main(String args[])
	{
		String a = "abcdd";
		String b = "xyz";
		System.out.println("Before swaping "+a+" & "+b);
		
		a = a+b;
		
		b = a.substring(0, a.length() - b.length());  
		a = a.substring(b.length());
		
		System.out.print("After swaping "+a+" & "+b);
			
	}
}