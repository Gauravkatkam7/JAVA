package array;

public class sample3 {

	public static void main(String[] args) {
		float f1[]=new float[5];
		
		f1[0]=100;
		f1[1]=100.1f;
		f1[2]=100.2f;
		f1[3]=100.3f;
		f1[4]=100.4f;
		
		System.out.println(f1[4]);
		System.out.println();
		for(int i=0; i<=4;i++)
		{
			System.out.println(f1[i]);
		}
	}
}
