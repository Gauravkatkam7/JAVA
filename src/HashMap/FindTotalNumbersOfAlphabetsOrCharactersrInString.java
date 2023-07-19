package HashMap;

import java.util.HashMap;

public class FindTotalNumbersOfAlphabetsOrCharactersrInString {

	public static void main(String[] args) {
		
		String org="gaurav 123@";
		
		int countletter=0;
		int countDigit=0;
		int countWhiteSpace=0;
		int specCharacter=0;
		
		for(int i=0;i<=org.length()-1;i++)
		{
			char s1 = org.charAt(i);
			
			if(Character.isLetter(s1))
			{
				countletter++;
			}
			else if(Character.isDigit(s1))
			{
				countDigit++;
			}
			else if(Character.isWhitespace(s1))
			{
				countWhiteSpace++;
			}
			else
			{
				specCharacter++;
			}
		}
		
		System.out.println("Letter Count:"+countletter);
		System.out.println("Digit Count:"+countDigit);
		System.out.println("WhiteSpaces Count:"+countWhiteSpace);
		System.out.println("SpectCharcater Count:"+specCharacter);


		

	}
}
