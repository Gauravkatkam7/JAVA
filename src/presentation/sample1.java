package presentation;

public class sample1 {

	public static void main(String[] args) {
		
		String s1="velocity is best";
		
		String s2[]=s1.split("");
		
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.print(s2[i]);
		}
		
//		String s3= "this is string";
//		System.out.println(s3.replace("this", "string"));
	}
}
