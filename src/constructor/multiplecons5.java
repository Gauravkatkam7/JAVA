package constructor;

public class multiplecons5 {

	String sname;
	int num1;
	float num2;
	char num3;
	
	multiplecons5()
	{
		sname="gaurav";
		num1=221;
		num2=3113.3f;
		num3='a';
	}
	multiplecons5(String a,int b,float c,char d)
	{
		sname=a;
		num1=b;
		num2=c;
		num3=d;
	}
	
	public void studentinfo() {
		System.out.println(sname+" "+num1+" "+num2+" "+num3);
	}
	
	public static void main(String[] args) {
		
		multiplecons5 o2=new multiplecons5();
		o2.studentinfo();
		
		multiplecons5 o3=new multiplecons5("gaurav",3123,313.31f,'d');
		
		o3.studentinfo();
	}
}
