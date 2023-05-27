package practice;

public class duplicatchar {

	public static void main(String[] args) {
		
		String s1="gauurav";
		
		char [] c=s1.toCharArray();
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			for(int j=i+1;j<=s1.length()-1;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println("duplicate char="+c[j]);
				}
				
			}
		}
	}
}
