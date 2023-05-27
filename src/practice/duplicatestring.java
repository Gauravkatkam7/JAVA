package practice;

public class duplicatestring {

	public static void main(String[] args) {
		
		String s1[]= {"gaurav","santosh","shubham","gaurav","shubham"};
		
		for(int i=0;i<=s1.length-1;i++)
		{
			for(int j=i+1;j<=s1.length-1;j++)
			{
				if(s1[i]==s1[j])
				{
					System.out.println("duplicate strings="+s1[j]);
				}
			}
		}
	}
}
