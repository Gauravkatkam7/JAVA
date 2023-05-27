package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist_iterators1 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add("katkam");
		arr.add("212");
		arr.add('a');
		arr.add(null);
		arr.add(34.2f);
		
		System.out.println("print data using iterator");
		System.out.println("------------");
		Iterator itr = arr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("print data using listiterator");
		System.out.println("------------");
		ListIterator litr=arr.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("print data using forloop");
		System.out.println("------------");
		
		for (int i = 0; i <=arr.size()-1; i++) 
		{
			System.out.println(arr.get(i));
		}
		System.out.println("print data using foreachloop");
		System.out.println("------------");
		for(Object o1:arr)
		{
			System.out.println(o1);
		}
	}
}
