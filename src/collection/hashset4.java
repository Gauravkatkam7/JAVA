package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hashset4 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(123);
		hs.add("gaurav");
		hs.add("gaurav");
		hs.add(23.4f);
		hs.add('d');
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		hs.add(234);
		System.out.println(hs);
		hs.remove(234);
		System.out.println(hs);
		
		System.out.println("====print data using iterator===");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===print data using for each loop====");
		
		for(Object o1:hs)
		{
			System.out.println(o1);
		}
		System.out.println("===========");
		hs.clear();
           System.out.println(hs.size());		
		System.out.println(hs.isEmpty());
		
	}
}
