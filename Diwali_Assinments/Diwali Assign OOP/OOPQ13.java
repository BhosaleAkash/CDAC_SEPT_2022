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
	double area()
	{
		return length*breadth;
	}
}
class OOPQ13
{
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle(10,20);
		double area=rect.area();
		System.out.println("Area is : "+area);
	}
}