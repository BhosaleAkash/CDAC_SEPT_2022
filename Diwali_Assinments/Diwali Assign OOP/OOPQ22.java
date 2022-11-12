package src;
class Demo
{
	static int x;
	int y;
	Demo()
	{
	
	}
	Demo(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	static void print()
	{
		System.out.println(x); //Static can access Static
		//System.out.println(y);// Static cannot access Non Static
	}
}
class OOPQ22
{
	public static void main(String args[])
	{
		Demo obj=new Demo(10,20);
		obj.print();
		
	}
}