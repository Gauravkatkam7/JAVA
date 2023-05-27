package array;

public class sample2 {

	public static void main(String[] args) {
		
		int i1[]=new int[10];
		
		i1[0]=1;
		i1[1]=2;
		i1[2]=3;
		i1[3]=4;
		i1[4]=5;
		i1[5]=6;
		i1[6]=7;
		i1[7]=8;
		i1[8]=9;
		i1[9]=10;
	
		
		System.out.println(i1[0]);
		System.out.println(i1[1]);
		
		System.out.println("array size:"+i1.length);
		
		// if you know array size
		for(int i=0; i<=9;i++)
		{
			System.out.println(i1[i]);
		}
		
		// if you don't know array size
		for(int i=0; i<=i1.length-1;i++)
		{
			System.out.println(i1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
