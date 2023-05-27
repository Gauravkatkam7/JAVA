package accessspecifier;

public class private7 {

	private int d=23;
	
	private void name2()
	{
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		private7 p7=new private7();
		System.out.println(p7.d);
		p7.name2();
	}
}
