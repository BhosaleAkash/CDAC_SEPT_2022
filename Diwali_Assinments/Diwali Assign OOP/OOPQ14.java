package src;
class Rectangle
{
	private double length;
	private double breadth;
	
	Rectangle()
	{
	
	}
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void area(double length,double breadth)
	{
		System.out.println("Area is : "+length*breadth);
	}
}
class OOPQ14
{
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle();
		rect.area(10,20);
		
	}
}