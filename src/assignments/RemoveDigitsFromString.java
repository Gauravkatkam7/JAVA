package assignments;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
		
		String org="gaurav123katkam";
		String str="";
		
		for(int i=0;i<=org.length()-1;i++)
		{
			char s1 = org.charAt(i);
			
			if(!Character.isDigit(s1))
			{
				str=str+s1;
			}
		}
		
		System.out.println(str);
	}
}
