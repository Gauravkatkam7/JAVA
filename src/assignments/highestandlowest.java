package assignments;

public class highestandlowest {
	public static void main(String[] args) {
		
	
           // 0 1 2 3 4,5
	int i1[]= {4,9,-2,55,8,2};
	
	int smallest=i1[0];
	int largest=i1[0];
	       //6
	for(int i=0;i<=i1.length-1;i++)
	{      //2
		if(i1[i]>largest) {
		
			largest=i1[i]; //55
		}   //2
		if (i1[i]<smallest) {
		
			smallest=i1[i]; //2
		 }
		
		}
	System.out.println("smallest number:"+smallest);
	  System.out.println("largest number:"+largest);
}
}