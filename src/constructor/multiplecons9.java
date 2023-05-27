package constructor;

public class multiplecons9 {

	char grade;
	char grade2;
	
	multiplecons9()
	{
		grade='a';
		grade2='b';
		
	}
	multiplecons9(char a,char b)
	{
		grade=a;
		grade2=b;
		
	}
	public void grades() {
		System.out.println("student grade="+grade+" "+grade2);
		
	}
	public static void main(String[] args) {
		
		multiplecons9 o1=new multiplecons9();
		o1.grades();
		multiplecons9 o2=new multiplecons9('c','d');
		o2.grades();
	}
}
