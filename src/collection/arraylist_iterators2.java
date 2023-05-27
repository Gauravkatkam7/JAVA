package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist_iterators2 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("gaurav");
		list.add("gaurav");
		list.add('a');
		list.add(123);
		list.add(23.3f);
		list.add(null);
		
		System.out.println(list.get(3));
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("----------");
		
	ListIterator litr=list.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("----------");
	
	for(int i=0;i<=list.size()-1;i++)
	{
		System.out.println(list.get(i));
	}
	
	System.out.println("----------");
	
	for(Object o1:list)
	{
		System.out.println(o1);
	}
	}
}
