package stringclass;

public class sample1 {

	
	public static void main(String[] args) {
		
		
	
	    String s1="ds";
		String s5="ds";
		
		
		String s2="abc";
		s2="xyz";
		s2="xyzabc";
		System.out.println(s2);
		
		// without using new keyword
		String s3="gaurav";
		// with using new keyword
		String s4=new String("gaurav");
		
		
		String s6="SDFS";
		String s7="sdfs";
		String s8="my name is gaurav katkam";
		String s9="  gaurav katkam  ";
	
		System.out.println("to check the length:"+s6.length());
		System.out.println("to check the address:"+ (s1==s5));
		System.out.println("to check the address:"+ (s3==s4));
		System.out.println("to check is it empty or not:"+s6.isEmpty());
		System.out.println("to convert into uppercase:"+s7.toUpperCase());
		System.out.println("to convert into lowercase:"+s6.toLowerCase());
		System.out.println("to compare the info and case:"+s7.equals(s6));
		System.out.println("to compare the information:"+s7.equalsIgnoreCase(s6));
		System.out.println("to find the characters:"+s8.contains("gaurav"));
		System.out.println("to printing the character:"+s6.charAt(3));
		System.out.println("to find the starting index:"+s7.indexOf('s'));//if the word has same characters then it will print first char
		System.out.println("to find the last index:"+s8.lastIndexOf('k'));//if the word has same characters then it will print last char
		System.out.println("to check the characters starts with:"+s8.startsWith("my"));
		System.out.println("to check the characters ends with:"+s8.endsWith("katkam"));
		System.out.println("to print the charcters after index in the word:"+s3.substring(3));
        System.out.println("to print the specific charcters between index in the word:"+s3.substring(1, 5));
        System.out.println("to add the characters in the existing characters"+s3.concat("katkam3"));
        System.out.println(s3+s6);
        System.out.println("to replace the characters:"+s8.replace("gaurav", "saurabh"));
        System.out.println("to remove space:"+s9.trim());
        
	
	}
}
