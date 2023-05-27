package array;

public class multidimensional1 {

	public static void main(String[] args) {
		
		int i1[][]=new int[3][3];
		
		i1[0][0]=23;
		i1[0][1]=34;
		i1[0][2]=43;
		i1[1][0]=56;
		i1[1][1]=43;
		i1[1][2]=65;
		i1[2][0]=54;
		i1[2][1]=78;
		i1[2][2]=55;
		
		System.out.println(i1.length);
		System.out.println(i1[2][1]);
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(i1[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
