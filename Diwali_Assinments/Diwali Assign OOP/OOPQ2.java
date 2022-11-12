package src;
abstract class Car
{
	int price;
	
	Car()
	{
	
	}
	Car(int price)
	{
		this.price=price;
	}
	public abstract void model();
	public abstract void color();
	public abstract void engineCylinders();
	
	
	void getPrice()
	{
		System.out.println("Inside Price of Car = "+price);
	}
}
class WagonR extends Car
{
	int year;
	WagonR()
	{
	
	}
	WagonR(int year,int price)
	{
		super(price);
		this.year=year;
	}
	
	public void model()
	{
		System.out.println("Inside Model of WagonR");
	}
	public void color()
	{
		System.out.println("Inside color of WagonR");
	}
	public void engineCylinders()
	{
		System.out.println("Inside Model of engineCylinders");
	}
}
class OOPQ2
{
	public static void main(String args[])
	{
		//Car c= new Car(500000);  //Car is an abstract class so cannot be instaniated
		//Car c=new Car();
		//c.getPrice();
		
		WagonR w=new WagonR(2022,500000);
		w.model();
		w.color();
		w.engineCylinders();
		w.getPrice();
		
		Car c=new WagonR(2023,600000);		// We can store object of child class in Parent class
		c.model();
		c.color();
		c.engineCylinders();
		c.getPrice();
	}
}