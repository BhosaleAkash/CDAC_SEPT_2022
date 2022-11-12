package src;
class Demo
{
	private int a;
	Demo()
	{
	
	}
	Demo(int a)
	{
		this.a=a;
	}
	double square()			// Concrete method to return square
	{
		return a*a;
	}
	int getA()		//to get private variables access outside class
	{
		return a;
	}
	void setA(int a)	//to set private variables outside class
	{
		this.a=a;
	}
}
class OOPQ11
{
	public static void main(String args[])
	{
		Demo obj=new Demo(10);
		
		System.out.println("Square of a is : "+obj.square());
		System.out.println(obj.getA());
		obj.setA(20);
		System.out.println("Square of a is : "+obj.square());
	}
}