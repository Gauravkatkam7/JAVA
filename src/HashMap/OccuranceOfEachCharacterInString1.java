package HashMap;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfEachCharacterInString1 {

	
	public static void main(String[] args) {
		
		String org="katkam";
		
		HashMap<Character, Integer>hm=new HashMap<>();
		
		for(int i=0;i<=org.length()-1;i++)
		{
		     char s1 = org.charAt(i); //k
		     
		     if(hm.containsKey(s1))
		     {
		    	 hm.put(s1, hm.get(s1)+1);//k,2/a,2
		     }
		     else
		     {
		    	 hm.put(s1, 1);//k,1 /a,1/t,1/m,1
		     }
		}
		
			Set<Character> allkeys = hm.keySet();
			for(Character s1:allkeys)
			{
				System.out.println(s1+"-"+hm.get(s1));
			}
			
			System.out.println("----print duplicate characters---");
			//print duplicate characters
			for(Character s1:allkeys)
			{
				if(hm.get(s1)>1)
				{
					//System.out.println(s1+"="+hm.get(s1));
					System.out.println(s1);
				}
			}
	}
}
