package constructor;

public class userdefinedwp11 {

int num1;
int num2;

userdefinedwp11(int a,int b)
{
	num1=a;
	num2=b;
	
}

public void m1()
{
	System.out.println(num1/num2);
}

public static void main(String[] args) {
	
	userdefinedwp11 o1=new userdefinedwp11(1233,12);
			o1.m1();
}

}
