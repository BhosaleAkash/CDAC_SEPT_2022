package src;
class OuterClass
{
	int a=5;
	int b=15;
	void print()
	{
		System.out.println("Inside OuterClass print method");
	}
	static void print1()
	{
		System.out.println("Inside OuterClass static print1 method");
	}
	public void print2()
	{
		System.out.println("Inside OuterClass print2 method");
	}
	class InnerClass
	{
		int a=10; 
		
		void print()
		{
			System.out.println(a); 
			System.out.println(b);	
			System.out.println("Inside InnerClass print method");
		}
		void print1()
		{
			System.out.println("Inside InnerClass print1 method");
		}
	}
}
class OOPQ5
{
	public static void main(String args[])
	{
		OuterClass out=new OuterClass();
		
		//OuterClass out1=out.new InnerClass();	NOT OK
		//Trying to store Inner Class Object into OuterClass reference which is not allowed
	
		//OuterClass.InnerClass in=new OuterClass();
	}
}	