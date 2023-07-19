package practice;

public class removeDigitsFromString{
public static void main(String[]args)
{
	String s1="abc123dd555";
	
	for(int i=0;i<=s1.length()-1;i++)
	{
		char str=s1.charAt(i);
		if(Character.isLetter(str))
		{
			System.out.print(str);
		}
	}
		
}
}