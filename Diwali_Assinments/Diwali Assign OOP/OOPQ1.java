package src;
abstract class Prac
{
	public int a;
	public int b;
	int c;
	
	Prac()
	{
	
	}
	Prac(int a, int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	abstract public void print();	//should be public so it can be accessed anywhere
	
	int getA()
	{
		return a;			//can have concrete methods also
	}
	int getB()
	{
		return b;
	}
	
	
	
}

class Demo extends Prac
{
	int d;
	
	Demo()
	{
		
	}
	Demo(int a, int b,int c, int d)
	{
		super(a,b,c);
		this.d=d;
	}
	public void print()
	{
		System.out.println("Inside Print of Demo Class");
	}
}
class OOPQ1
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.print();
		System.out.println(d.getA());
	/*
		Prac p=new Prac(1,2,3); 
		p.getA();
		p.getB();
		*/
	}
}