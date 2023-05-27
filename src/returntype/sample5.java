package returntype;

public class sample5 {

	public static void main(String[] args) {
		
		int i1=m1(23,55);
		System.out.println(i1);
		
		System.out.println("------------");
		System.out.println(m1(77,34));
		
		String s1=m1("GAURAV");
		System.out.println(s1);
		
		System.out.println("-----------");
		System.out.println(m1("SHUBHAM"));
	}
	
	public static int m1(int a,int b) {
		int c=a+b;
		return c;
	}
	public static String m1(String s1) {
		String s2=s1.toLowerCase();
		return s2;
		
	}
}
