package array;

import java.util.Arrays;

public class ascendinganddescending3 {
public static void main(String[] args) {
	

	float f1[]=new float[4];
	
	f1[0]=14.2f;
	f1[1]=11.3f;
	f1[2]=17.3f;
	f1[3]=10.3f;
	
	System.out.println("------original inputs-------");
	
	for(int i=0;i<=f1.length-1;i++)
	{
		System.out.println(f1[i]);
	}
	
	Arrays.sort(f1);
	System.out.println("--------sorting inputs-----");
	System.out.println("ascending");
	for(int i=0;i<=f1.length-1;i++)
	{
		System.out.println(f1[i]);
		
	}
	System.out.println("descending");
	for(int i=f1.length-1;i>=0;i--)
	{
		System.out.println(f1[i]);
		
	}
	
}
}