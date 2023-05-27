package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset2 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add("gaurav");
		hs.add(123);
		hs.add(123);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.remove(null);
		System.out.println(hs);
		
		System.out.println("===print data using iterator===");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("==print data using for each loop==");
		
		for(Object o1:hs)
		{
			System.out.println(o1);
		}
		
		System.out.println("==============");
		hs.clear();
		System.out.println(hs.isEmpty());
		
		
		
		
			
			
			
			
	}
}
