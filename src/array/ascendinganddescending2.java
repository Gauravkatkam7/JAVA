package array;

import java.util.Arrays;

public class ascendinganddescending2 {
public static void main(String[] args) {
	

	int s1[]=new int[4];
	
	s1[0]=3;
	s1[1]=5;
	s1[2]=2;
	s1[3]=4;
	System.out.println("------original inputs-----");
	for(int i=0;i<=3;i++)
	{
		System.out.println(s1[i]);
	}
	
	Arrays.sort(s1);
	
	System.out.println("------ascending inputs----");
	for(int i=0;i<=3;i++)
	{
		System.out.println(s1[i]);
	}
	
	
}
}