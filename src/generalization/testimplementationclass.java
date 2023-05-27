package generalization;

public class testimplementationclass {

	public static void main(String[] args) {
		System.out.println("features of saving acount");
		saving s1=new saving();
		s1.cashdeposite();
		s1.cashwithdraw();
		s1.moneytransfer();
		s1.feature();
		System.out.println("features of current acount");

		current c1=new current();
		c1.cashdeposite();
		c1.cashwithdraw();
		c1.moneytransfer();
		c1.feature();
		System.out.println("features of salary acount");

		salary s2=new salary();
		s2.cashdeposite();
		s2.cashwithdraw();
		s2.moneytransfer();
		s2.feature();
	}
}
