class Pro15{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<=i-1; j++)
			{
				if(i==3){
					if(j==0||j==i-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else if(i==4){
					if(j==0||j==i-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					System.out.print("*");
					
				}
			}
			System.out.println();
		}
	}
}