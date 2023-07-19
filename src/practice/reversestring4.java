package practice;

public class reversestring4 {

	public static void main(String[] args) {
		
	
	String s1="mom";
	String rev="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		 rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equals(s1))
	{
		System.out.println("give string is palindrome");
	}
	else
	{
		System.out.println("give string is not palindrome");
	}
	
}
}