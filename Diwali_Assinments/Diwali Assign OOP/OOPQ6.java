package src;
class BankAccount
{
	private double principal;
	private static double interestRate;
	private double time;
	BankAccount()
	{
	
	}
	
	BankAccount(double principal, double interestRate,double time)
	{
		this.principal=principal;
		this.interestRate=interestRate;
		this.time=time;
	}
	class Interest
	{
		Interest()
		{
			
		}/*
		Interest(double principal, double interestRate,double time)
		{
			this.principal=principal;
			this.interestRate=interestRate;
			this.time=time;
		}*/
		private double interest;
		double interestEarned()
		{
			return (principal*interestRate*time)/100;
		}
	}
}
class OOPQ6
{
	public static void main(String args[])
	{
		BankAccount b=new BankAccount(1000,15,1);
		BankAccount.Interest i=b.new Interest();
		System.out.println("Interest Earned called through inner class object is : "+i.interestEarned());
		
		/*
		BankAccount b1=new BankAccount();
		BankAccount.Interest i1=b1.new Interest(1000,20,1);
		System.out.println("Interest Earned called through inner class object is : "+i1.interestEarned());
		*/
	}
}