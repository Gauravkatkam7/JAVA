package generalization;
//Implementation class1
public class saving implements bank {

	public void cashwithdraw()
	{
		System.out.println("1lakhs"); //method overriding
	}
	public void cashdeposite() {
		System.out.println("2lakhs");//method overriding
	}
	public void moneytransfer() {
		System.out.println("3lakhs");//method overriding
	}
	public void feature() {
		System.out.println("featureA");
	}
	
}
