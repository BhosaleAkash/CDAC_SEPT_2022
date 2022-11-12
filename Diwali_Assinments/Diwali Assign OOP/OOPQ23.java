package src;
class Demo
{
	int a=5;
	int b=5;
	int sum;
	int add()
	{
		sum=a+b;
		return sum;
	}
	
	
}
class OOPQ23
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		System.out.println(d.add());
		
		Demo d1=new Demo();
		System.out.println(d1.add());
	}
}