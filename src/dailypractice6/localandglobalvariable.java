package dailypractice6;

public class localandglobalvariable {
	int i=10;
	public void m1() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		int b=122;
		localandglobalvariable  o1=new localandglobalvariable();
		o1.m1();
		System.out.println(b);
	}
}
	