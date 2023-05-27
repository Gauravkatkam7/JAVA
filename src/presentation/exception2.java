package presentation;

public class exception2 {

	public static void main(String[] args) {
		
		  String s1="gaurav";
		  int i1 []= {12,23,34,45};
		  
		  try {
			  
		  try {
			  System.out.println(s1.charAt(6));
		  }
			 catch(StringIndexOutOfBoundsException e)
		  {
				 System.out.println("StringIndexOutOfBoundsException handled");
		  } 
		  System.out.println(i1[5]);
		  }
		  catch(Exception f)
		  {
			  f.printStackTrace();
			  System.out.println("ArrayIndexOutOfBoundsException");
		  }
	}
}

