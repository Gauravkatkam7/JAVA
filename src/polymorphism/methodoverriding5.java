package polymorphism;


public class methodoverriding5 {

	public static void main(String[] args) {
		
		methodoverriding3 m3=new methodoverriding3();
		m3.player1();
		m3.player2();
		m3.player3();
		
		System.out.println("-----------");
		
		methodoverriding4 m4=new methodoverriding4();
		m4.player1();
		m4.player2();
		m4.player3();
		
}
}
