package src;
class Demo
{
	int a;
	int b;
	int sum;
	Demo()
	{
		
	}
	Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int add()
	{
		sum=a+b;
		return sum;
	}
	int getSum()
	{
		return sum;
	}
	
	
}
class Demo1
{
	int a;
	int b;
	static int sum;
	
	Demo1()
	{
		
	}
	Demo1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int add()
	{
		sum=a+b;
		return sum;
	}
	int getSum()
	{
		return sum;
	}
	
}
class OOPQ24
{
	public static void main(String args[])
	{
		Demo a=new Demo(5,5);
		System.out.println(a.add());
		
		Demo b=new Demo();
		System.out.println("Value of non static sum called by object a "+a.sum);
		System.out.println("Value of non static sum called by object b "+b.sum);
		
		Demo1 c=new Demo1(5,5);
		System.out.println(c.add());
		
		Demo1 d=new Demo1();
		
		System.out.println("Value of static sum called by object c "+c.sum);
		System.out.println("Value of static sum called by object d "+d.sum);

		
	}
}