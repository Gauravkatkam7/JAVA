package assignments;

public class ReverseWordsOfEvenIndex {

	public static void main(String[] args) {
		
		// 1st  way
	
	String s1="my name is gaurav";
	String []ar =s1.split(" ");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		String org = ar[i];
		String rev="";
		if(i%2==0)
		//	if(i%2!=0)
		{
			for(int j=org.length()-1;j>=0;j--)
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev+" ");
		}
		else
		{
			System.out.print(org+" ");
		}
	}
	

	
	               //2nd way
	

//	String s2="sir is god";
//	String []ar1 =s2.split(" ");
//	
//	for(int i=0;i<=ar1.length-1;i++)
//	{
//		String org = ar1[i];
//		String rev="";
//		if(i%2==0)
//		{
//			String rev1 = reverseChar(org);
//			System.out.print(rev1+" ");
//		}
//	}
//	}
//	
//	public static String reverseChar(String org)
//	{
//		String rev="";
//		for(int j=org.length()-1;j>=0;j--)
//		{
//			rev=rev+org.charAt(j);
//		}
//		
//		return rev;
//	}
}
}
