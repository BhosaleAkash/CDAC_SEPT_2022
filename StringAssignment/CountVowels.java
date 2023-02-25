
//5. Write a java program to Count the Number of Vowels in the given string. 

class CountVowels
{
	public static void main(String args[])
	{
		String name = "Akash saudagar Bhosale";
		int count = 0;
		
		char ch[] = new char[name.length()];
		
		for(int i=0; i< name.length(); i++)
		{
			ch[i] = name.charAt(i);
			
			if(ch[i] == 'a' 
				|| ch[i] == 'e' 
				|| ch[i] == 'i' 
				|| ch[i] == 'o' 
				|| ch[i] == 'u'
				|| ch[i] == 'A' 
				|| ch[i] == 'E' 
				|| ch[i] == 'I' 
				|| ch[i] == 'O'
				|| ch[i] == 'U'
				)
			{
				count++;
			}
		}
		System.out.print(count);
	}
}