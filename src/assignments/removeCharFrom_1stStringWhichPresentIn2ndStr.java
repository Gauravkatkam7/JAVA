package assignments;

public class removeCharFrom_1stStringWhichPresentIn2ndStr {

	public static void main(String[] args) {
		
	String s1="gaurav";
	String s2="katkam";
	
	String result = removeCharFrom1stTo2nd(s1, s2);
	System.out.println("result:"+result);
	
}
	public static String removeCharFrom1stTo2nd(String s1,String s2)
	{
		String result=s1;
		for(int i=0;i<s2.length();i++)
		{
			char c = s2.charAt(i);//k
			result=result.replace(Character.toString(c)," ");
		}         
		return result;
	}
}