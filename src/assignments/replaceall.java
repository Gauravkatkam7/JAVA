package assignments;

public class replaceall {

	public static void main(String[] args) {
		
		String s1="#c2342^&^%a$pge452mini";
		System.out.println(s1.replaceAll("[^a-z]","") );
		System.out.println(s1.replaceAll("0", "[^a-z]"));
	}
}
