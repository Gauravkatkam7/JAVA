package HashMap;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfEachCharacterInString {

	
	public static void main(String[] args) {
		
		String s1="gaurav";
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char org = s1.charAt(i);
			
			if(hm.containsKey(org))
			{
				hm.put(org, hm.get(org)+1);
			}
			else
			{
				hm.put(org, 1);
			}
		}
		
		Set<Character> allkeys = hm.keySet();
		for(Character s2:allkeys)
		{
			System.out.println(s2+"-"+hm.get(s2));
		}
		
		
		
	}
}
