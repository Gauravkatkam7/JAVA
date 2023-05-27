package assignments;

public class swapingnum2 {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=30;
		System.out.println("before swapping:"+num1);
		System.out.println("before swapping"+num2);
		
		num1=num1+num2;//50
		num2=num1-num2;//50-30=20
		num1=num1-num2;//50-20=30
		System.out.println("----------------------------");
		System.out.println("after swapping:"+num1);
		System.out.println("after swapping:"+num2);
	}
}
