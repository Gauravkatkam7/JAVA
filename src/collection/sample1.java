package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class sample1 {

	public static void main(String[] args) {
		
ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add("katkam");
		arr.add(23);
		arr.add('a');
		arr.add(33.2f);

		
		ListIterator litr=arr.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
}
}