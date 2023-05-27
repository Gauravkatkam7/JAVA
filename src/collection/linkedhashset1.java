package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset1 {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("gaurav");
		lhs.add("gaurav");
		lhs.add(123);
		lhs.add(123);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(123));
		
		lhs.remove(123);
		System.out.println(lhs);
	lhs.add(123);
	System.out.println(lhs);
	System.out.println("===print data using iterator===");
	Iterator itr=lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("==print data using for each loop==" );
	for(Object o1:lhs)
	{
		System.out.println(o1);
	}
	
	System.out.println("================================");
	lhs.clear();
	System.out.println(lhs.size());
	
	
	
	
	
	}
}
