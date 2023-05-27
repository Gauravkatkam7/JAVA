package practice;

public class arraycomparing {

	public static void main(String[] args) {
		
		int a1[]= {1,3,5,6,7};
		int a2[]= {1,4,5,9,5};
		
		for(int i=0;i<=4;i++)
		{
			if(a1[i]==a2[i])
			{
				System.out.println(a1[i]+" "+a2[i]);
			}
		}
		
	}
}
