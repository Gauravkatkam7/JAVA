package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeduplicatecharacters {

	public static void main(String[] args) {
		String s1="gauuraav";

		char[] i1 = s1.toCharArray();
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();

		for(int i=0;i<=s1.length()-1;i++)
		{
			lhs.add(i1[i]);
		}
		System.out.println(lhs);
		for(Character a1:lhs)
		{
			System.out.print(a1);
		}
		

		
		
	}
}
