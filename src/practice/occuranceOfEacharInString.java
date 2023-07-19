package practice;

import java.util.HashMap;
import java.util.Set;

public class occuranceOfEacharInString{
public static void main(String[]args)
{
	String s1="abcadf";

	HashMap<Character,Integer> hm=new HashMap();
	
	for(int i=0;i<=s1.length()-1;i++)
	{
		char str=s1.charAt(i);
		if(hm.containsKey(str))
		{	
			hm.put(str,hm.get(str)+1);
			
		}
		else
		{
			hm.put(str,1);
		}
	}
	
	Set<Character> allKeys=hm.keySet();
	
	for(Character key:allKeys)
	{
		System.out.println(key+" "+hm.get(key));	
	}
}
}