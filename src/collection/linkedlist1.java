package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist1 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add("gaurav");
		ll.add(123);
		ll.add(23.5f);
		ll.add(null);
		ll.add(123);
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("================");
		
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("=============");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("============");
		for(Object o1:ll)
		{
			System.out.println(o1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
