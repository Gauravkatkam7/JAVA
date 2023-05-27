package accessspecifier;

public class public5 {

	public int num;
	
	public public5()
	{
		num=23;
	}
	
	public void division()
	{
		System.out.println(num/num);
		
	}
	
	public static void main(String[] args) {
		
		public5 p5=new public5();
		System.out.println(p5.num);
		p5.division();
	}
}
