package assignments;

public class maxminstring {

	public static void main(String[] args) {
		String s1="aakanksha";
		int count=0;
		char ch='a';
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
