package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		hs.add("gaurav");
		hs.add("gaurav");
		hs.add(123);
		hs.add('s');
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		hs.add("katkam");
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		System.out.println("===print data using iterator cursor===");
	
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("===print data using for each loop===");
	
	for(Object o1:hs)
	{
		System.out.println(o1);
	}
	
	System.out.println("===============");
	
	hs.clear();
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
