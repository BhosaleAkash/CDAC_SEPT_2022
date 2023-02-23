
//4. Swap two numberswithout using third variable approach 1. 

class Swap1
{
	public static void main(String args[])
	{
		int n1 = 10;
		int n2 = 20;
		
		n1 = n1 + n2;
		
		n2 = n1 - n2;
		
		n1 = n1 - n2;
		
		System.out.print(n1 + "   "+ n2);
	}
}