package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		
		HDFC hb = new HDFC();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		//dynamic polymorphism
		Bank b = new HDFC();//<-- object of hdfc bank which is referred by bank class interface
		b.loan();
		b.credit();
		b.debit();
		b.funds();//this cannot be accessed by 'b' because the reference variable 'b' is of Bank and the method belongs to HDFC class.
		
	}

}
