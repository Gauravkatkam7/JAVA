package assignments;

public class sample2 {

	public static void main(String[] args) {
		
		String s1="india";
		s1=s1.toUpperCase();
		
		String s2[]=s1.split("");
		
		for(int i=0;i<=s2.length-1;i++)
		{
			System.out.println(s2[i]);
		}
	}
}
