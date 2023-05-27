package array;

import java.util.Arrays;

public class ascendinganddescending8 {

	public static void main(String[] args) {
		
		char c2[]=new char[3];
		c2[0]='g';
		c2[1]='c';
		c2[2]='t';
		
		System.out.println("ascending");
		
		Arrays.sort(c2);
		
		for(int i=0;i<=c2.length-1;i++)
		{
			System.out.println(c2[i]);
		}
		
	}
}
