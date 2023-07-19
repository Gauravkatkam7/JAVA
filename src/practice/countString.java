package practice;

public class countString 
{

	public static void main(String[]args)
     { 
	String s1="abc 123 @";
	int letter=0;
	int whitespaces=0;
	int digit=0;
	String s2="";
	String rev="";
	
	for(int i=0;i<=s1.length()-1;i++)
	{
		char org=s1.charAt(i);
		
		if(Character.isLetter(org))
		{
		//	System.out.print(org);
			s2=s2+org;
			letter++;	
			
			for(int j=s2.length()-1;j>=0;j--)
				{
					rev=rev+s2.charAt(j);
				}
		}
		
	}
	
		
		for(int j=s2.length()-1;j>=0;j--)
		{
			rev=rev+s2.charAt(j);
		}
		
//		
//		System.out.println("\n"+rev);
//		else if(Character.isDigit(org))
//	 	{
//			digit++;
//		}
//		else if(Character.isWhitespace(org))
//		{
//			whitespaces++;
//		}	
	
	System.out.println("\n"+"letter:"+letter);
//	System.out.println("whitespaces:"+whitespaces);
//	System.out.println("difit:"+digit);
     } 
}

