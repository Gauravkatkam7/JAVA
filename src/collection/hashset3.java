package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset3 {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add("gaurav");
		ar.add("gaurav");
		ar.add('a');
		ar.add(123);
		ar.add(null);
		ar.add(null);
		ar.add(34.3f);
		
		System.out.println(ar);
		System.out.println("============");
		LinkedHashSet hs=new LinkedHashSet(ar);
		System.out.println(hs);
		System.out.println("==============");
		
		HashSet hs1=new HashSet(ar);
		System.out.println(hs1);
	}
}
