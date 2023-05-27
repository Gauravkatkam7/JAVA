package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylistiterators8 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add(123);
		arr.add(12.5f);
		arr.add(null);
		arr.add('d');
		arr.add(null);
		
		System.out.println(arr);
		arr.add(6, null);
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		System.out.println(arr.isEmpty());
		arr.remove(6);
		System.out.println(arr);
		arr.set(3, 43);
		System.out.println(arr);
		System.out.println(arr.size());
		
		System.out.println("print data using iterator");
		Iterator i1=arr.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("print data using listiterator");
		ListIterator litr=arr.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("print data using for loop");
		for(int i=0;i<=arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("print data using for each loop");
		for(Object o1:arr)
		{
			System.out.println(o1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
