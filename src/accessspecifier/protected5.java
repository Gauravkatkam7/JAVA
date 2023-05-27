package accessspecifier;

public class protected5 {

	protected String sname;
	
	protected protected5()
	{
		sname="gaurav";
		
	}
	protected void selfname()
	{
		System.out.println(sname);
		
	}
	
	public static void main(String[] args) {
		
		protected5 p5=new protected5();
		System.out.println(p5.sname);
		p5.selfname();
	}
}
