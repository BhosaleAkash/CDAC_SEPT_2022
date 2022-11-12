package src;
class Demo
{
	String x;
	String y;
	String z;
	Demo()
	{
	
	}
	Demo(String x)
	{
		this.x=x;
	}
	Demo(String x, String y)
	{
		this(x);
		this.y=y;
	}
	Demo(String x, String y, String z) 
	{
		this(x, y);
		this.z=z;
	}
}
class OOPQ20
{
	public static void main(String args[])
	{
		Demo d=new Demo("Virat","Rohit","Bumrah");
		System.out.println(d.x);
		System.out.println(d.y);
		System.out.println(d.z);
		
	}
}