package nonstaticmethod;

public class class1 {
	//non static regular  method call from same class
	
public static void main(String[] args) {
	class1 o7=new class1(); // classname objectname=new classname();
	o7.m5();     //objectname.methodname
	
}

public void m5()
{
	System.out.println("hi");
	System.out.println("hello");
}
}
