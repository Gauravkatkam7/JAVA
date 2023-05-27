package array;

import java.util.Arrays;

public class arraydeclarationandintializationinsinglestep3 {

	public static void main(String[] args) {
		
String s1[]= {"mother","father","grandmother","grandson","grandfather"};

System.out.println(s1[3]);

for(int i=0;i<=s1.length-1;i++)
{
	System.out.println(s1[i]);
}

Arrays.sort(s1);
System.out.println("");
System.out.println("ascending order");
System.out.println("");

for(int i=0;i<=s1.length-1;i++)
{
	System.out.println(s1[i]);
}
	}
	}

