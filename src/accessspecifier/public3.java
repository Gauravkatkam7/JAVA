package accessspecifier;

public class public3 {

	public float per;
	
	public public3()
	{
		per=32.3f;
		
	}
	
	public void add()
	{
		System.out.println(per+per);
	}
	public static void main(String[] args) {
		
		public3 p3=new public3();
		System.out.println(p3.per);
		p3.add();
	}
}
