package exceptionhandling;

public class exceptionhandling3 {
public static void main(String[] args) {
	
	int a=10;
	int b=0;
	int c=0;
	
	try {
            c=a/b;
	}
	catch(ArithmeticException d)
	{
		c=a/2;
	}
	System.out.println(c);
	
	System.out.println("good night");
}
}
