package src;
class OuterClass
{
	static int a1=5;
	static int b1=10;
	void print()
	{
		System.out.println("Inside OuterClass Print");
		System.out.println(a1);
		System.out.println(b1);
	}
	void print1()
	{
		System.out.println("Inside OuterClass Print1");
		//System.out.println(a); //Cannot access Inner Class data members
		//System.out.println(b);
	}
	void print2()
	{
		System.out.println("Inside OuterClass Print2");
	}
	static class InnerClass
	{
		int a=15;
		static int b=20;
		
		void print()
		{
			System.out.println("Inside InnerClass Print");
			System.out.println(a);
			System.out.println(b);
		}
		void print1()
		{
			System.out.println("Inside InnerClass Print1");
			System.out.println(a1);
			System.out.println(b1);
		}
	}
}
class OOPQ4
{
	public static void main(String args[])
	{
		OuterClass out=new OuterClass();
		out.print1();
		OuterClass.InnerClass a= new OuterClass.InnerClass();
		a.print();
		a.print1();
		//a.print2();
	}
}