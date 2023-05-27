package inheritance;

public class multilevel4 extends multilevel3 {

	public void version4() {
		System.out.println("status");
	}
	
	public static void main(String[] args) {
		
		multilevel4 o1=new multilevel4();
		o1.version1();
		o1.version2();
		o1.version3();
		o1.version4();
	}
}
