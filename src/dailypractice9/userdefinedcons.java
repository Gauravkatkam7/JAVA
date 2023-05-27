package dailypractice9;

public class userdefinedcons {

	int num1;
	int num2;
	
	userdefinedcons(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	
	public void mul() {
		System.out.println(num1*num2);
		
	}
	
	public static void main(String[] args) {
		
		userdefinedcons o1=new userdefinedcons(21,23);
		o1.mul();
		
	}
}
