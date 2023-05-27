package accessspecifier;

public class protected7 {

	protected float per;
	
	protected protected7()
	{
		per=23.332f;
		
	}
	
	protected void multi()
	{
		System.out.println(per*per*per);
		
	}
	
	public static void main(String[] args) {
		
		protected7 p7=new protected7();
		System.out.println(p7.per);
		p7.multi();
	}
}
