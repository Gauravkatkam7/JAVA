package array;
  // project.class.method
import java.util.Arrays;

public class ascendinganddescending {
public static void main(String[] args) {
	

	String s1[]=new String [4];
	s1[0]="zebra";
	s1[1]="donkey";
	s1[2]="ant";
	s1[3]="elephant";
	
	System.out.println("-----original inputs----");
	
	for(int i=0;i<=3;i++)
	{
		System.out.println(s1[i]);
	}
	
	Arrays.sort(s1);//to sort arrays
	
	System.out.println("--------ascended values----");
	for(int i=0;i<=3;i++)
	{
		System.out.println(s1[i]);
	}
	System.out.println("--------descended values----");
	for(int i=3;i>=0;i--)
	{
		System.out.println(s1[i]);
	}
}
}