package generalization;

public class testimplementationclass2 {

	public static void main(String[] args) {
		System.out.println("saving account");
		saving1 s1=new saving1();
		s1.CD();
		s1.CW();
		s1.MT();
		
		System.out.println("current account");
		current1 c1=new current1();
		c1.CD();
		c1.CW();
		c1.MT();
		
		System.out.println("salary account");
		salary1 s2=new salary1();
		s2.CD();
		s2.CW();
		s2.MT();
	}
}
