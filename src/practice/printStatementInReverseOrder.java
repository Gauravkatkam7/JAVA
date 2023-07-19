package practice;

public class printStatementInReverseOrder{
public static void main(String[]args){

	String s1="Gaurav is going to be great";
	
	String ar[]=s1.split(" ");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.print(ar[i]+" ");
	}

}
}
