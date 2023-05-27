package array;

import java.util.Arrays;

public class ascendinganddescending5 {

	public static void main(String[] args) {
		
		String s1[]=new String[3];
		s1[0]="ffffff";
		s1[1]="ttttt";
		s1[2]="iiiiii";
		
		System.out.println("sorting in ascending");
		Arrays.sort(s1);
		
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("sorting in descending");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.println(s1[i]);
		}
	}
}
