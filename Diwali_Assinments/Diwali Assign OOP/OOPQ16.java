package src;
class Rectangle
{
	private final double length=20; //cannot change it  
	private double breadth;
	
	Rectangle()
	{
	
	}
	Rectangle(double length,double breadth)
	{
		//this.length=length; //will give error as length is final
		this.breadth=breadth;
	}
	final void area(double length,double breadth)
	{
		System.out.println("Area is : "+length*breadth);
	}
}


final class Field extends Rectangle
{

/*
	void area(double length,double breadth) //cannot override final area
	{
		double area=length*breadth;
	}
	*/
}
/*
class Field1 extends Field
{
	//cannot extend Field as Final Class does not extends
}
*/
class OOPQ16
{
	public static void main(String args[])
	{
		final Rectangle rect=new Rectangle();
		rect.area(10,20);
		//rect=new Ractangle(); //cannot put new object as it is final
	}
}