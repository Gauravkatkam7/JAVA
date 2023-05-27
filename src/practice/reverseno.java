package practice;

public class reverseno {

	public static void main(String[] args) {
		int m=1234;
		int revNum=0;
		for(int i=m;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		System.out.println(revNum);
	}
}
