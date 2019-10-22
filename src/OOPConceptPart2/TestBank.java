package OOPConceptPart2;


//public class TestBank extends ICICIBank implements USBank, RBI{}; a class can implement a single parent class but it can implement multiple interfaces
public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		USBank.min_bal = 200;//Error cannot change the value of interface variable
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		
		//this dynamic polymorphism: child class obj can be referred by parent interface reference variable. Child class obj is "new HSBCBank();"
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		b.educationloan();//Error cannot access HSBCBank class methods

	}

}
