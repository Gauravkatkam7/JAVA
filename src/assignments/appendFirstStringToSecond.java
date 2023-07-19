package assignments;

public class appendFirstStringToSecond {

	public static void main(String[] args) {
		
	
	String firstString="world";
	String secondString="hello";
	
	String result = searchString(firstString, secondString);
	
	System.out.println(result);
	
}
	public static String searchString(String firstString,String secondString)
	{
		if(secondString.contains(firstString))
		{
			return secondString + firstString;
		}
		return secondString;
		
	}
	
	
}