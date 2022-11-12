package src;
class Demo
{
	
	int a;
	Demo()
	{
		
	}
	Demo(int a)
	{
		this.a=a;
	}
	Demo passingReturningObject(Demo obj)
	{
		return obj;
	}
}
class OOPQ9
{
	public static void main(String args[])
	{
		Demo d1=new Demo(10);
		
		Demo d2=d1.passingReturningObject(d1);
		System.out.println("Value of a using d2 object : "+d2.a);
		
		
	}
	
}