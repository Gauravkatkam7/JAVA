package array;

import java.util.Arrays;

public class ascendinganddescending4 {

	public static void main(String[] args) {
		
		char c1[]=new char[4];
		c1[0]='f';
		c1[1]='x';
		c1[2]='w';
		c1[3]='b';
		
		System.out.println("soting in ascending order");
		
		Arrays.sort(c1);
		
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.println(c1[i]);
		}
		System.out.println("soting in descending order");
		for(int i=c1.length-1;i>=0;i--)
		{
			System.out.println(c1[i]);
		}
	}
}
