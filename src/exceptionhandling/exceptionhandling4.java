package exceptionhandling;

public class exceptionhandling4 {
public static void main(String[] args) {
	

	int i1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	try {
	System.out.println(i1[3][2]);

	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	System.out.println("hmmm");
}
}