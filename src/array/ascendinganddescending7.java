package array;

import java.util.Arrays;

public class ascendinganddescending7 {
public static void main(String[] args) {
	

	float f1[]=new float[4];
	
	f1[0]=32.4f;
	f1[1]=23.44f;
	f1[2]=5645.23f;
	f1[3]=434.2f;
	
	for(int i=0;i<=f1.length-1;i++)
	{
		System.out.println(f1[i]);
	}
	Arrays.sort(f1);
	System.out.println("");
	for(int i=0;i<=f1.length-1;i++)
	{
		System.out.println(f1[i]);
	}
	System.out.println("");
	for(int i=f1.length-1;i>=0;i--)
	{
		System.out.println(f1[i]);
	}
	
			
}
}