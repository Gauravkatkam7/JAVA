package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add("gaurav");
		v.add(123);
		v.add('a');
		v.add(34.2f);
		v.add(null);
		
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(123));
		v.add(2,123);
		System.out.println(v);
		//v.clear();
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("================");
		
		ListIterator litr=v.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("================");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("=================");
		for(Object o1:v)
		{
			System.out.println(o1);
		}
		
		System.out.println("==============");
		
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
