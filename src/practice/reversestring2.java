package practice;

public class reversestring2 {

	public static void main(String[] args) {
		String s="words java";
		String rev="";
		
		char ar[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
	}
}
