package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist_iterators3 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		arr.add("gaurav");
		arr.add(123);
		arr.add('a');
		arr.add(12.3f);
		arr.add(null);
		
		System.out.println(arr);
		
		System.out.println("-----------------------------");
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------");
	
		ListIterator litr=arr.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("------------");
		
		for(int i=0;i<=arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
		}
		
		System.out.println("-------------");
		
		for(Object o1:arr)
		{
			System.out.println(o1);
		}
		
		
		
		
		
		
		
		
		
	}
}
