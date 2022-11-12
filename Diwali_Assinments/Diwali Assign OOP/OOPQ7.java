package src;
import java.util.Scanner;
interface Shape
{
	double area();
}
class Circle implements Shape
{
	private double radius;
	private double area;
	private final double PI=3.14;
	
	Circle()
	{
	
	}
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double area()
	{
		return PI*radius*radius;
	}
	
}

class Rectangle implements Shape
{
	private double length;
	private double breadth;
	
	Rectangle()
	{
	
	}
	Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public double area()
	{
		return length*breadth;
	}
}
class OOPQ7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		
		System.out.println("Enter what you want to do\n0.)Exit\n1.)Area of Rectangle"
							+"\n2.)Area of Circle");
		choice=sc.nextInt();
		switch(choice)
		{
			case 0:
				System.out.println("You choose to EXIT");
			break;
			case 1:
				System.out.println("Enter the Length");
				double length=sc.nextDouble();
				System.out.println("Enter the Breadth");
				double breadth=sc.nextDouble();
				Rectangle r=new Rectangle(length, breadth);
				System.out.println("Area is : "+r.area());
			break;
			case 2:
				System.out.println("Enter the Radius");
				double radius=sc.nextDouble();
				Circle c=new Circle(radius);
				System.out.println("Area is : "+c.area());
			break;
		}
		
	}
}