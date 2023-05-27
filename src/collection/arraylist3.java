package collection;

import java.util.ArrayList;

public class arraylist3 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add("shubbb");
		arr.add("gaaa");
		arr.add(23.2f);
		arr.add(555);
		arr.add('b');
		arr.add(null);
		
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		System.out.println(arr.get(4));
		
		arr.add("katkam");
		arr.remove(6);
		System.out.println(arr);
		
	
		
	}
}
