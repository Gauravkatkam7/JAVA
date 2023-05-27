package array;

import java.util.Arrays;

public class arraydeclarationandintializationinsinglestep2 {

	public static void main(String[] args) {
		
		char c1[]= {'g','w','a','r','l'};
		
		System.out.println(c1[3]);
		
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.println(c1[i]);
			
		}
		System.out.println("ascendingorder");
		Arrays.sort(c1);
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.println(c1[i]);
			
		}
		
		
		
	}
}
