package assignments;

public class duplicatecharacters {

	public static void main(String[] args) {
		
		String s1="gauurav";
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			for(int j=i+1;j<=s1.length()-1;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("duplicate string character is :"+ch[j]);
				}
			}
		}
	}
}
