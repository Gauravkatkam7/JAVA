package returntype;

public class sample6 {

	public static void main(String[] args) {
		
		int i1=m1();
		System.out.println(i1);
		int b=10;
		System.out.println(i1+b);
	}
	
	public static int m1(int a,int b) {
		int c=a+b;
		return c;
	}
	public static int m1() {
		int c=m1(12,43);
		return c;
		
		
	}
}
