package practice;

public class reversestring3 {

	public static void main(String[] args) {
		
		String s1="mom";
		String rev="";
	
	
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equals(rev))
		{
			System.out.println(s1+" is palindrome string");
		}
		else
		{
			System.out.println(s1+" is not palindrome string");
		}
	
	
	}
}
