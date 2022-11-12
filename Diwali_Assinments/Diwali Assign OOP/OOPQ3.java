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
		int a=10; // same name variables are allowed as outer class can't access inner class
		//but inner class can access outer class
		//static int c=0;	//Cannot create static data members
		void print()
		{
			System.out.println(a); //Even if inner class can access outer class it doesnt create ambiguity
			System.out.println(b);	//proof that inner class can access outer class data members
			System.out.println("Inside InnerClass print method");
		}
		void print1()
		{
			System.out.println("Inside InnerClass print1 method");
		}
		//static void print2()
		//{
			//System.out.println("Inside InnerClass print2 method");	
		//} 
		//Static method not allowed in InnerClass too
	}
}
class OOPQ3
{
	public static void main(String args[])
	{
		OuterClass out=new OuterClass();
		out.print();	//NO Ambiguity created
		out.print1(); 
		
		OuterClass.InnerClass in= out.new InnerClass(); //this is how innerClass object is created
		//Its .class file will be generated as OuterClass$InnerClass
		in.print();
		in.print1();
		//in.print2();	//cannot access methods of OuterClass
		//OuterClass.InnerClass in1=new OuterClass.InnerClass(); //Illegal for instance Inner Class
		//in1.print();
		//in2.print();
	}
}