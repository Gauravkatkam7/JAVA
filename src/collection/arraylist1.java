package collection;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add("katkam");
		arr.add(65.5f);
		arr.add(null);
		arr.add(null);
		arr.add('A');
		arr.add(65.5f);
		
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		System.out.println(arr.get(1));
		arr.add(3, 500);
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
		arr.add(0, "gaurav");
		System.out.println(arr);
		
		System.out.println(arr.get(3));
		arr.remove(5);
		System.out.println(arr);
	}
}
