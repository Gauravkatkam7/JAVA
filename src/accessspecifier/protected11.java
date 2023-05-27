package accessspecifier;

public class protected11 {

	protected int num;
	
	protected protected11()
	{
		num=21;
	}
	
	protected void add()
	{
		System.out.println(num+num);
		
	}
	
	public static void main(String[] args) {
		
		protected11 p11=new protected11();
		System.out.println(p11.num);
		p11.add();
		
	}
}
