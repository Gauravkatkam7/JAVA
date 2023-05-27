package accessspecifier;

public class private3 {

	 private int b=23;
	
	private void name() {
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		
		private3 p3=new private3();
		System.out.println(p3.b);
		p3.name();
	}
}
