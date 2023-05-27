package assignments;

public class palindromestring {

	public static void main(String[] args) {
		
		String s1="gaurav";
		
	    String rev ="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
	
		
		if(s1.equals(rev))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}
}
