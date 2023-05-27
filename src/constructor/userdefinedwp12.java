package constructor;

public class userdefinedwp12 {

	String sname;
	int sno1;
	int sno2;
	float sno3;
	
	userdefinedwp12(String a,int b,int c,float e)
	{
		sname=a;
		sno1=b;
		sno2=c;
		sno3=e;
		
	}
	
	public void m1() {
		System.out.println("student name="+sname+"\n"+"student no="+sno1+"\n"+"student no2="+sno2+"\n"+"studentper="+sno3+"%");
	
	}
	
	public static void main(String[] args) {
		
		userdefinedwp12 o1=new userdefinedwp12("gaurav katkam",400,450,10);
		o1.m1();
	}
}
