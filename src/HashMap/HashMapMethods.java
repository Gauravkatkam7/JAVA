package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) 
	{
		
		HashMap<Integer, String>hm=new HashMap<>();
		
		//put(k,v) -to add key & value
		hm.put(101, "gaurav");
		hm.put(102, "kalpesh");
		hm.put(103, "shubham");
		hm.put(104, "santosh");

		System.out.println(hm);
		
		//update the already existing key
		hm.put(103, "saurabh");
		System.out.println(hm);
		
		// to verify the specific key is present or not
		System.out.println(hm.containsKey(102));
		
		// print value of the specific key
		System.out.println(hm.get(101));
		
		// print all keys of hashMap
		Set<Integer> allKeys = hm.keySet();
		
		System.out.println(hm.keySet());
		
		for(Integer s1:allKeys)
		{
			System.out.println(s1);
		}
		
		//print all values of hashMap
		Collection<String> allValues = hm.values();
		for(String s1:allValues)
		{
			System.out.println(s1);
		}
		 
		//print all keys & values of hashMap
		for(Integer s1:allKeys)
		{
			System.out.println(s1+"-"+hm.get(s1));
		}
	}
}
