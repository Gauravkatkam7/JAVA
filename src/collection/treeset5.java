package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class treeset5 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add("katkam");
		arr.add("santosh");
		arr.add("saands");
		arr.add("saands");
		
		TreeSet tr=new TreeSet(arr);
		System.out.println(tr);
		
		System.out.println("===print data in forward direction===");
		ListIterator litr=arr.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("===print data in reverse direction===");

		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		
	}
}
