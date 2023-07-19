package assignments;

public class reverseStringInSamePosition3 {

	public static void main(String[] args) {
		
	
	String s1="hers name is nikita";
	
	//System.out.println(s1.indexOf("n"));
	String [] ar=s1.split(" ");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		String org = ar[i];
		String rev = reverseString(org);
		System.out.print(rev+" ");
	}
}
	public static String reverseString(String org)
	{
		String rev="";
		for(int j=org.length()-1;j>=0;j--)
		{
			rev=rev+org.charAt(j);
		}
		return rev;
		
	}
}