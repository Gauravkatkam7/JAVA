package assignments;

public class febonacci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		
		System.out.print(a+" "+b);
		for(int i=0;i<=10;i++)
		{
			c=a+b; // 0+1=1  c=1, c=1+1=2,1+2=3, 2+3=5,3+5=8,5+8=13,
			System.out.print(" "+c);
			a=b; //0=1  1=1  2=2 3=3 5=5
			b=c; // 1=1 ,2=2 , 3=3,  5=5, 8=8,
			
			
		}
		
		
	}
}
