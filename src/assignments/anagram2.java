package assignments;

import java.util.Arrays;

public class anagram2 {

	public static void main(String[] args) {
		
		String s1="gaurav";
		String s2="varuag";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result=Arrays.equals(ch1, ch2);
		
		if(result=true)
		{
			System.out.println(s1+" and "+s2+" is anagram string");
		}
		else
		{
			System.out.println(s1+" and "+s2+"i s not anagram string");
		}
		
	}
}
