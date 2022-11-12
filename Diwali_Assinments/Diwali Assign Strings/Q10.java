package src;
import java.util.Scanner;
class Q10
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int num=Integer.parseInt(str);
		
		System.out.println("String converted to Integer is :"+num );
		
		System.out.println("Enter a number to subtract from it or enter the similar number so it gives u anwer \"0\"");
		int num1=sc.nextInt();
		
		
	}
}