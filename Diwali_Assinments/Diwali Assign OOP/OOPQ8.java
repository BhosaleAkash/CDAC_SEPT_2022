package src;
class Demo
{
	public static int count=0;
	int a;
	Demo()
	{
		count++;
	}
	Demo(int a)
	{
		this.a=a;
		count++;
	}
	void objectCounter()
	{
		System.out.println("No of objects created"+count);
	}
}
class OOPQ8
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		Demo d4=new Demo();
		Demo d5=new Demo();
		
		System.out.println("No of objects created : "+d1.count);
		
		
	}
	
}