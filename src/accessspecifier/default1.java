package accessspecifier;

public class default1 {

	int a=245;   //default access specifier-can call only in package
	
	void name1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		default1 d1=new default1();
		System.out.println(d1.a);
		d1.name1();
	}
}
