package accessspecifier;

public class private1 {

	private int a=312;   //private access specifier-can call only in class
	
	
	private void name() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		private1 p1=new private1();
		System.out.println(p1.a);
		p1.name();
	}
}
