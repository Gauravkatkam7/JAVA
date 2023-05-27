package dailypractice1;

public class nonstaticmethodwithparameter {
public static void main(String[] args) {
	
	nonstaticmethodwithparameter o1=new nonstaticmethodwithparameter();
	o1.subtraction(23, 45);
}

public void subtraction(int num1,int num2)
{
	System.out.println(num1-num2);
}
}
