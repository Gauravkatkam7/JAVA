package practice;



public class highestandlowest {

	public static void main(String[] args) {
		
		int i1[]= {1,4,2,6,4};
		
		int highest=i1[0];
		int lowest=i1[0];
		
	     for(int i=0;i<=i1.length-1;i++)
		{
			if(i1[i]>highest)
			{
				highest=i1[i];
			}
		}
	     System.out.println("highest num="+highest);
	     
	     for(int i=0;i<=i1.length-1;i++)
	     {
	    	 if(i1[i]<lowest)
	    	 {
	    		 lowest=i1[i];
	    	 }
	     }
	     System.out.println("lowest num="+lowest);
	}
}
