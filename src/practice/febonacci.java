package practice;

public class febonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=0;i<=9;i++)
		{
			c=a+b;//15
			System.out.print(" "+c);
			a=b;//5
			b=c;//8
		}
	}
}
