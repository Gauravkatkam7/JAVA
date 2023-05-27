package dailypractice7;

public class staticmcfsc {
public static void main(String[] args) {
	
	m1();
	staticmcfdc.m2();
	multiplication(224, 3424);
	staticmcfdc.fullname("gaurav", "katkam");
	
}

public static void m1()
{
	System.out.println("calling static method from same class");
}

public static void multiplication(int num1,int num2)
{
	System.out.println(num1*num2);
}
}
