package exceptionhandling;

public class exceptionhandling1 {
public static void main(String[] args) {
	
  
	String s1="gaurav";
	
	try {
	System.out.println(s1.charAt(-1));  //risky code
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(s1.charAt(2));
		System.out.println("StringIndexOutOfBoundsException handled");
	}
	System.out.println("hi");
	System.out.println("hello");
}
}
