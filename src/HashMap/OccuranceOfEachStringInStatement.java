package HashMap;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfEachStringInStatement {

	public static void main(String[] args) {
		
		String org="my name is gaurav and gaurav and gaurav";
		
		String [] ar=org.split(" ");
		
		HashMap<String, Integer>hm=new HashMap<>();
		
		for(int i=0;i<=ar.length-1;i++)
		{
			String s1 = ar[i];
			
			if(hm.containsKey(s1))
			{
				hm.put(s1, hm.get(s1)+1);
			}
			else
			{
				hm.put(s1, 1);
			}
		}
		
		Set<String> allkeys = hm.keySet();
		
		for(String s1:allkeys)
		{
			System.out.println(s1+"-"+hm.get(s1));
		}
		
		System.out.println("------print duplicate string in statement--------------");
		
		for(String s1:allkeys)
		{
			if(hm.get(s1)>1)
			{
				System.out.println(s1);
				//System.out.println(s1+"-"+hm.get(s1));
			}
		}
	}
}
