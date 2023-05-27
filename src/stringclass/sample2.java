package stringclass;

public class sample2 {

	public static void main(String[] args) {
		
		String s1="my name is gaurav";
		
		String s2[]=s1.split(" ");
		System.out.println(s2.length);
	
		for(int i=0;i<=s2.length-1;i++)
		{
			System.out.println(s2[i]);
		}
		
		
		
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.println(s2[i]);
		}
		
		}
}
