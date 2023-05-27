package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class mixture1 {

	public static void main(String[] args) {
		
ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add("katkam");
		arr.add(23);
		arr.add('a');
		arr.add(33.2f);
		
		System.out.println(arr);
		
		System.out.println("===print data using iterator===");
		Iterator itr=arr.iterator();
		
		itr.next();
		itr.next();
		itr.remove();
		System.out.println(arr);
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("===print data using foreach loop===");
	for(Object o1:arr)
	{
		System.out.println(o1);
	}
	System.out.println("===print data using listiterator===");
	
	ListIterator litr=arr.listIterator();
	
	litr.next();
	litr.remove();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	litr.set("katkam");
	

	System.out.println("===print data using foreach loop===");

	for(Object o1:arr)
	{
		System.out.println(o1);
	}
	{
		
	} 
	{
		
		
	};
	}
}
