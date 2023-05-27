package assignments;

public class removedigitsinstring {

	public static void main(String[] args) {
		
		String s1="GD1a2u3r4a55v6";
		s1=s1.replaceAll("[^A-z]","");
		System.out.println(s1);
	}
}
