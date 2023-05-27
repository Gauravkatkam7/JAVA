package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashset5 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("gaurav");
		hs.add("gaurav");
		hs.add(123);
		hs.add(123);
		hs.add(23.4f);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);


		System.out.println(hs.size());
		System.out.println(hs.contains(123));
		System.out.println(hs.isEmpty());
		hs.remove(123);
		System.out.println(hs);
		
		System.out.println("===print data using iterator===");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===print data using for each loop===");
		for(Object o1:hs) { 
			System.out.println(o1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
