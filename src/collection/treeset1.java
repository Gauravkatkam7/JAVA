package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
		
		
		TreeSet tr=new TreeSet();
		
		tr.add("gaurav");
		tr.add("katkam");
		tr.add("abc");
		tr.add("santosh");
		tr.add("shubs");
	
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		tr.remove("abc");
		System.out.println(tr);
		tr.add("abc");
		System.out.println(tr);
		System.out.println(tr.first());
		System.out.println(tr.last());
		tr.pollFirst();
		System.out.println(tr);
		tr.pollLast();
		System.out.println(tr);
		
		System.out.println("===print data using iterator===");
		
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===print data using for each loop===");
		for(Object o1:tr)
		{
			System.out.println(o1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
