package collection;

import java.util.TreeSet;

public class treeset4 {

	public static void main(String[] args) {
		
		TreeSet tr=new TreeSet();
		tr.add(123);
		tr.add(444);
		tr.add(111);
		tr.add(989);
		tr.add(333);
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		System.out.println(tr.first());
		System.out.println(tr.last());
		tr.pollFirst();
		tr.pollLast();
		System.out.println(tr);
		
		System.out.println("=================");
		
		for(Object o1:tr)
		{
			System.out.println(o1);
		}
	}
}
