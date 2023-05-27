package collection;

import java.util.TreeSet;

public class treeset2_generic {

	public static void main(String[] args) {
		
		TreeSet<Integer> tr=new TreeSet<Integer>();
		
		tr.add(123);
		tr.add(444);
		tr.add(111);
		tr.add(989);
		tr.add(333);
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println("=======================");
		for(int i:tr)
		{
			System.out.println(i);
		}
	}
}
