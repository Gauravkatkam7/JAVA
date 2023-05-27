package array;

import java.util.Arrays;

public class arraydeclarationandintializationinsinglestep1 {

	public static void main(String[] args) {
		
		int i1[]= {1,4,3,2,9,0};
		
		System.out.println(i1[4]);
		
		Arrays.sort(i1);
		
		System.out.println("");
		
		for(int i=0;i<=i1.length-1;i++)
		{
			System.out.println(i1[i]);
		}
	}
}
