package array;

public class sample1 {
public static void main(String[] args) {
	
  //array type array object name []=new array size
	String s1[]=new String[5]; //array declaration
	
	// array initialization
	s1[0]="gaurav";
	s1[1]="santosh";
	s1[2]="katkam";
	s1[3]="shubham";
	s1[4]="rohit";
	
	System.out.println(s1.length);//array size
	
	// array usage
	System.out.println(s1[0]);
	System.out.println(s1[1]);
	
	for(int i=0; i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}
}
}