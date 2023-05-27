package presentation;

public class multilevel3 extends multilevel2 {

	public void money() {
		System.out.println("5lakhs");
	}
	
	public static void main(String[] args) {
		
		multilevel3 m3=new multilevel3();
		{
		
			m3.car();
			m3.home();
			m3.money();
		}	
		
	}
}
