package dailypractice5;

public class localandglobal {

	int i=10;    //globalvariable
	

	public void m1() 
	{
	    int m=100;   //localvariable
		System.out.println(i);
		System.out.println(m);
	}
	public static void main(String[] args) {
		localandglobal o1=new localandglobal();
		o1.m1();
	}
}
