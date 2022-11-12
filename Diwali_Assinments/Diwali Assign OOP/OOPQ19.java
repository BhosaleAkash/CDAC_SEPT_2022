package src;
class Demo
{
	int x;
	int y;
	int z;
	Demo()
	{
	
	}
	Demo(int x)
	{
		this.x=x;
	}
	Demo(int x, int y)
	{
		this(x);
		this.y=y;
	}
	Demo(int x, int y, int z) 
	{
		this(x, y);
		this.z=z;
	}
}
class OOPQ19
{
	public static void main(String args[])
	{
		Demo d=new Demo(10,20,30);
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		
	}
}