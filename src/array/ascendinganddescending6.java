package array;

import java.util.Arrays;

public class ascendinganddescending6 {

	public static void main(String[] args) {
		int i1[]=new int[4];
		
		i1[0]=322311;
		i1[1]=5445;
		i1[2]=6778;
		i1[3]=5445;
		
		System.out.println("sorting in ascending order");
		Arrays.sort(i1);
		for(int i=0;i<=3;i++)
		{
			System.out.println(i1[i]);
		}
		System.out.println("sorting in descending order");
		
		for(int i=i1.length-1;i>=0;i--)
		{
			System.out.println(i1[i]);
		}
	}
}
