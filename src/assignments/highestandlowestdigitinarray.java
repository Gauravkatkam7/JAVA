package assignments;

public class highestandlowestdigitinarray {

	public static void main(String[] args) {
		
		int ar[]= {12,140,44,22,6,109};
		int highestdigit=ar[0];//140
		int lowestdigit=ar[0];//12
		int secondhighest=ar[0];//12,44
		for(int i=0;i<=ar.length-1;i++)//44
		{
			if(ar[i]>highestdigit)
			{
				secondhighest=highestdigit;//12,44
				highestdigit=ar[i];//44,109
			}
			if(ar[i]<lowestdigit)
			{
				lowestdigit=ar[i];
			}
			if(ar[i]>secondhighest && ar[i]<highestdigit)
			{
				secondhighest=ar[i];
			}
		}
    	System.out.println(highestdigit);
		System.out.println(lowestdigit);
		System.out.println(secondhighest);
	
		
	
	
	
	
	
	
	
	
	}
}
