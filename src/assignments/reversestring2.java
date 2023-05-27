package assignments;

public class reversestring2 {

	public static void main(String[] args) {
		
	
		String s1="varuag";
	    String rev ="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);//ga
		}
		System.out.println("original string:"+s1);
		System.out.println("reverse strinf:"+rev);
		
		
	}
}
