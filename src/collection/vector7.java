package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector7 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add("gaurav");
		v.add(123);
		v.add('a');
		v.add(323.5);
		v.add(null);
		
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("==============");
		
		ListIterator litr=v.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("==============");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("===============");
		for(Object o1:v)
		{
			System.out.println(o1);
		}
		System.out.println("============");
		
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		System.out.println("=================");
		System.out.println(v.size());


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
