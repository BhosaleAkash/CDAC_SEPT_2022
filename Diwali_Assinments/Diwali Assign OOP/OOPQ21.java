package src;
class DemoSuper
{
	int x;
	int y;
	DemoSuper()
	{
	
	}
	DemoSuper(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class DemoBase extends DemoSuper
{
	int z;
	DemoBase()
	{
		
	}
	DemoBase(int x, int y, int z) 
	{
		super(x, y);
		this.z=z;
	}
}
class OOPQ21
{
	public static void main(String args[])
	{
		DemoBase d=new DemoBase(10,20,30);
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		
	}
}