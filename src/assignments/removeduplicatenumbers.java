package assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeduplicatenumbers {
public static void main(String[] args) {
	
	int ar[]= {12,32,54,12};
	HashSet<Integer>hs=new HashSet<>();
	for(int i=0;i<=ar.length-1;i++)
	{
		hs.add(ar[i]);
		
	}
	for(int s1:hs)
	{
		System.out.println(s1);
	}
	
	
	
	
}
}
