
//4. Write a java program to Count the Number of Wordsin a given String.

class CountWordsInString
{
	public static void main(String args[])
	{
		String sent = "Welcome to Cdac Kharghar mumbai hello world";
		int count = 0;
		
		char ch[] = new char[sent.length()];
		
		for(int i = 0; i < sent.length()-1; i++)
		{
			
			ch[i] = sent.charAt(i);
			
			if( ( (i>0)&& (ch[i-1]==' ') && (ch[i] !=' ') ) || (ch[0] !=' ') && (i==0))
			{
				count++;
			}
		}
		System.out.print(count);
	}
}