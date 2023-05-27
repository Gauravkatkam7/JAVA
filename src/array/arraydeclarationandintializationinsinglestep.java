package array;

import java.util.Arrays;

public class arraydeclarationandintializationinsinglestep {
public static void main(String[] args) {
	
//	arraydeclarationandintializationinsinglestep
	
	//array type array object name[]={information1,information2}---blank object
	String s1 [] ={"mahesh","suresh","ganesh","ramesh"};
	
	//array usage
	System.out.println(s1[3]);
	
	for(int i=0;i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}
	Arrays.sort(s1);
	System.out.println("");
	System.out.println("ascending");
	
	for(int i=0;i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}
}
}