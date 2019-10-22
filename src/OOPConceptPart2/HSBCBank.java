package OOPConceptPart2;

//we are achieving multiple inheritance and this is called Is-a-relationship
public class HSBCBank implements USBank, BrazilBank {

	//If a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	
	//overriding from USBank interface
	public void credit() {
		System.out.println("hsbc give credit");
	}
	
	public void debit() {
		System.out.println("hsbc give debit");
	}

	public void transfermoney() {
		System.out.println("hsbc transfer money");
	}
	
	//separate HSBCBank class methods
	public void educationloan() {
		System.out.println("hsbc education loan");
	}
	
	public void carloan() {
		System.out.println("hsbc car loan");
	}
	
	//overriding from BrazilBank interface
	public void mutualfund() {
		System.out.println("Brazil bank mutual fund");
	}
}
