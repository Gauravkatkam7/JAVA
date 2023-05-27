package practice;

public class starpattern {

	public static void main(String[] args) {
		
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		     star++;
		
		}
		int space=1;
		int star1=4;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			space=space+2;
			star1--;
		}
	}
}
