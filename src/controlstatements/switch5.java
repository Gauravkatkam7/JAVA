package controlstatements;

public class switch5 {
public static void main(String[] args) {

	switch("cd")
	{
	case "cd": System.out.println("cash deposite");
	break;
	
	case "cw": System.out.println("cash withdraw");
	break;
	
	case "sa": System.out.println("saving account");
	break;
	
	case "ca": System.out.println("current account");
	break;
	
	case "bi": System.out.println("balance inquiry");
	break;
	
	default : System.out.println("invalid input");
	}
}
}
