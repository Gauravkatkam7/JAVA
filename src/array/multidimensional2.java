package array;

public class multidimensional2 {

	public static void main(String[] args) {
		
		String s1[][]=new String[3][3];
		
		s1[0][0]="gaurav";
		s1[0][1]="santosh";
		s1[0][2]="katkam";
		s1[1][0]="shubham";
		s1[1][1]="ambadas";
		s1[1][2]="petkar";
		s1[2][0]="saurabh";
		s1[2][1]="purushottam";
		s1[2][2]="lakale";
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
