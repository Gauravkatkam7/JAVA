package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapMethods2 {

	public static void main(String[] args) 
	{
		
		HashMap<String, Float> hm=new HashMap<>();
		hm.put("gaurav", 35.0f);
		hm.put("shubham", 70.0f);
		hm.put("saurabh", 66.0f);
		hm.put("abhishek", 99.0f);
		
		hm.put("gaurav", 72.0f);
		System.out.println(hm);
		
		System.out.println(hm.containsKey("gaurav"));
		
		System.out.println(hm.get("shubham"));
		
		Set<String> allKeys = hm.keySet();
		for(String s1:allKeys)
		{
			System.out.println(s1);
		}
		
		
		Collection<Float> allValues = hm.values();
		for(Float s1:allValues)
		{
			System.out.println(s1);
		}
		
		for(String s1:allKeys)
		{
			System.out.println(s1+" "+hm.get(s1));
		}
		
	}
}
