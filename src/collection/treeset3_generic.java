package collection;

import java.util.TreeSet;

public class treeset3_generic {

	public static void main(String[] args) {
		
		TreeSet<String> tr=new TreeSet<String>();
		
		tr.add("gaurav");
		tr.add("katkam");
		tr.add("abc");
		tr.add("santosh");
		tr.add("shubs");
		
		System.out.println("=============");
		for(String s1:tr) {
			System.out.println(s1);
		}
			
	}
}
