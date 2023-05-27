package accessspecifier;

public class protected9 {

	protected char grade;
	
	protected protected9()
	{
		grade='a';
		
	}
	
	protected void selfgrade()
	{
		System.out.println(grade);
		
	}
	
	public static void main(String[] args) {
		
		protected9 p9=new protected9();
		System.out.println(p9.grade);
		p9.selfgrade();
	}
}
