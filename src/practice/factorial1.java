package practice;
public class factorial1{
public static void main(String[]args){

	int a=5;
	int fact=1;
	
	for(int i=a;i>=1;i--)
	{
		fact=fact*i;//120
	}
	System.out.println(fact);
}
}