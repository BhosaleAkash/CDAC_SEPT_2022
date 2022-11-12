package src;
import java.util.Scanner;
class Q6 
{
	public static void main(String args[])
	{
		int largest=0;
		int secondLargest=0;
		int thirdLargest=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the Array Size");
		int SIZE=sc.nextInt();
		int arr[]=new int[SIZE];
		
		
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>thirdLargest)	
			{
				if(arr[i]>secondLargest)	
				{
					if(arr[i]>largest)		
					{
						thirdLargest=secondLargest;
						secondLargest=largest;
						largest=arr[i];
					}
					else
					{
						thirdLargest=secondLargest;
						 secondLargest=arr[i];
					}
				}
				else
				{
					thirdLargest=arr[i];
				}
			}
		}
			
		System.out.println(thirdLargest+"("+largest+" and "
		+secondLargest+" are the largest and second-largest)");
	}
}

