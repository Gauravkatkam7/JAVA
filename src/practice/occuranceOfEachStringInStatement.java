package practice;

import java.util.HashMap;
import java.util.Set;

public class occuranceOfEachStringInStatement{
public static void main(String[]args)
{
	String s1="Gaurav is Good Good";
	
	String ar[]=s1.split(" ");
	HashMap<String,Integer>hm=new HashMap();	

	for(int i=0;i<=ar.length-1;i++)
	{
		String str=ar[i];
		
		if(hm.containsKey(str))
		{
			hm.put(str,hm.get(str)+1);
		}
		else
		{
			hm.put(str,1);
		}
		
	}
		Set<String> allKeys=hm.keySet();
		for(String key:allKeys)
		{
			System.out.println(key+"-"+hm.get(key));
		}
	
}
}
