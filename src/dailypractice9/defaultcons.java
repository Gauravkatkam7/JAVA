package dailypractice9;

public class defaultcons {

	int num1=21;
	int num2=12;
	
	
	public void m1() {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		// defaultcons call from same class
		defaultcons o1=new defaultcons();
		o1.m1();
	}
}
