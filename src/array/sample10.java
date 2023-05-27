package array;

public class sample10 {
public static void main(String[] args) {
	

	String s1[]=new String[3];
	
	s1[0]="gaurav";
	s1[1]="shubham";
	s1[2]="rohit";

	System.out.println(s1[2]);
	
	System.out.println(s1.length);
	
	for(int i=0;i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}
}
}