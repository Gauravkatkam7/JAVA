package accessspecifier;

public class default3 {

	int b=331;
	
	void name2()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		default3 d3=new default3();
		System.out.println(d3.b);
		d3.name2();
	}
}
