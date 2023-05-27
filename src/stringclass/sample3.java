package stringclass;

public class sample3 {
public static void main(String[] args) {
	

	String s1="saurabh";
	
	String s2[]=s1.split("");// took array to store multiple info with same type
	
	for(int i=s2.length-1;i>=0;i--)
	{
		System.out.print(s2[i]);
	}
}
}