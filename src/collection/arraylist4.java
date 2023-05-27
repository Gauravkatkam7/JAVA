package collection;

import java.util.ArrayList;

public class arraylist4 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		arr.add("gaurav");
		arr.add("katkam");
		arr.add(23);
		arr.add('a');
		arr.add(33.2f);
		
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		System.out.println(arr.get(3));
		
		arr.add(3, "katkam");
		System.out.println(arr);
		
		arr.remove(3);
		System.out.println(arr);
	}
}
