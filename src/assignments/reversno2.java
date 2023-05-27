package assignments;

public class reversno2 {

	public static void main(String[] args) {
		
		
		int orgNum=3422;
		int revNum=0;//24
	                            //3
		for (int i=orgNum;i>0;i=i/10) 
		{
		int rem =i%10; //2
		revNum=revNum*10 + rem;//2243
		}
		System.out.println(revNum);
	
	}
}
