package assignments;

public class characterpattern {

	public static void main(String[] args) {
		
		
		char ch='Z';
		int space=4;
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch+" ");
				
			}
			System.out.println();
			space--;
			ch++;
		}
	}
}
