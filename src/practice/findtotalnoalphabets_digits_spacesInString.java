package practice;
public class findtotalnoalphabets_digits_spacesInString{
public static void main(String[]args)
{
	String s1="ga 12@  $";
	
	int alphabetcount=0;
	int spacecount=0;
	int digitcount=0;
	int specialchar=0;

	for(int i=0;i<=s1.length()-1;i++)
	{
		char str=s1.charAt(i);
		
		if(Character.isLetter(str))
		{
			alphabetcount++;
		}
		else if(Character.isDigit(str))
		{
			digitcount++;
		}	
		else if(Character.isWhitespace(str))
		{
			spacecount++;
		}
		else
		{
			specialchar++;
		}
	}	
	System.out.println("alphabetcount:"+alphabetcount);
	System.out.println("spacecount:"+spacecount);
	System.out.println("digitcount:"+digitcount);
	System.out.println("specialchar:"+specialchar);
		
}
}
