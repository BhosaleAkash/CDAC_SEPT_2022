package src;
import java.util.Scanner;
class Q12
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		System.out.println("Enter what u want to replace");
		String r1=sc.next();
		System.out.println("Enter what u want to put");
		String r2=sc.next();
		String str1=str.replaceAll(r1,r2);
		System.out.println("Input : "+str);
		System.out.println("Output : "+str1);
	}
}