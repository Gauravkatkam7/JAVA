package assignments;

public class reverseNumber3 {
	public static void main(String[] args) {
		
		int s1=12123;
		
		String s2 = Integer.toString(s1); //convert int to string
		String rev="";
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			rev=rev+s2.charAt(i);
		}
		int value = Integer.parseInt(rev); //convert string to int
		System.out.println(value);
	}

}
