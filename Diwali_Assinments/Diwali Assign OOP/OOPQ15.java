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
class OOPQ15
{
	public static void main(String args[])
	{
		Rectangle rect=new Rectangle();
		System.out.println(rect);		//prints hashcode 
		System.out.println(rect.hashCode());
	}
}