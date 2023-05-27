package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist3 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
		ll.add(233);
		ll.add("sdfh");
		ll.add(34.4f);
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("============");
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("==============");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("================");
		
		for(Object o1:ll)
		{
			System.out.println(o1);
		}
		
	}
}
