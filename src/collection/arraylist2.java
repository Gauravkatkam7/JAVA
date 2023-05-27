package collection;

import java.util.ArrayList;

public class arraylist2 {
 
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add(123);
		arr.add('a');
		arr.add(23.2f);
		arr.add(null);
		arr.add(123);
		
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		System.out.println(arr.get(1));
		System.out.println(arr.add("amma"));
		System.out.println(arr);
		arr.add(0, 123);
		System.out.println(arr);
		
	}
}
