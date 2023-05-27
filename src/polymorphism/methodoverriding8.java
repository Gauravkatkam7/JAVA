package polymorphism;

public class methodoverriding8 {

	public static void main(String[] args) {
		
		methodoverriding6 m6=new methodoverriding6();
		m6.name();
		m6.name2();
		m6.name3();
		
		System.out.println("------------------");
		
		methodoverriding7 m7=new methodoverriding7();
		m7.name();
		m7.name2();
		m7.name3();
	}
}
